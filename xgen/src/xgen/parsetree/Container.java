package xgen.parsetree;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import xgen.grammar.Element;

import com.google.common.collect.Iterables;

/**
 * Node that is not a leaf and contains more nodes
 * 
 * @author Lukas Härtel
 *
 */
public class Container extends Node
{
	/**
	 * <p>
	 * The children of this node
	 * </p>
	 * <p>
	 * <em>Do not modify directly</em>
	 * </p>
	 */
	public final Node[] children;

	/**
	 * Creates a new container
	 * 
	 * @param label
	 *            The label of the node
	 * @param children
	 *            The children of this container
	 */
	public Container(Element label, Node... children)
	{
		super(label);

		this.children = children;

		for (Node c : children)
			c.parent = this;
	}

	/**
	 * Creates a node from a sequence of nodes
	 * 
	 * @param label
	 *            The label to use
	 * @param children
	 *            The sequence to exhaust for array creation
	 * @return Returns a new Container
	 */
	public static Node fromIterable(Element label, Iterable<Node> children)
	{
		return new Container(label, Iterables.toArray(children, Node.class));
	}

	@Override
	public Node transform(boolean recursive, Function<Node, Node> f)
	{
		if (!recursive)
			return f.apply(this).clone();

		Node[] cs = new Node[children.length];
		for (int i = 0; i < children.length; i++)
			cs[i] = children[i].transform(recursive, f);

		return f.apply(new Container(label, cs));
	}

	@Override
	public Node transformContainer(boolean recursive, Function<Container, Node> f)
	{
		if (!recursive)
			return f.apply(this).clone();

		Node[] cs = new Node[children.length];
		for (int i = 0; i < children.length; i++)
			cs[i] = children[i].transformContainer(recursive, f);

		return f.apply(new Container(label, cs));
	}

	@Override
	public Node transformLeaf(boolean recursive, Function<Leaf, Node> f)
	{
		if (!recursive)
			return clone();

		Node[] cs = new Node[children.length];
		for (int i = 0; i < children.length; i++)
			cs[i] = children[i].transformLeaf(recursive, f);

		return new Container(label, cs);
	}

	@Override
	public void visit(Consumer<? super Node> f)
	{
		f.accept(this);

		for (Node c : children)
			c.visit(f);
	}

	@Override
	public Container clone()
	{
		Node[] cs = new Node[children.length];

		for (int i = 0; i < children.length; i++)
			cs[i] = children[i].clone();

		return new Container(label, cs);
	}

	@Override
	public void flatten(Setting setting, StringBuilder target, boolean lexical)
	{
		setting.beforeContainer(target, this);

		if (lexical || isLexicalDefinition())
			for (Node c1 : children)
				c1.flatten(setting, target, true);
		else
		{
			boolean separate = false;
			for (Node c : children)
			{
				if (separate)
					target.append(" ");

				c.flatten(setting, target, false);

				separate = true;
			}
		}

		setting.afterContainer(target, this);
	}

	@Override
	public String toString()
	{
		return Objects.toString(label) + Arrays.toString(children);
	}
}
