package xgen.parsetree;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import xgen.grammar.Definition;
import xgen.grammar.Element;

import com.google.common.collect.Iterables;

public class Container extends Node
{
	public final Element label;

	public final Node[] children;

	public Container(Element label, Node... children)
	{
		this.label = label;
		this.children = children;

		for (Node c : children)
			c.parent = this;
	}

	public static Node fromIterable(Element label, Iterable<Node> children)
	{
		return new Container(label, Iterables.toArray(children, Node.class));
	}

	public boolean isLexicalDefinition()
	{
		return label instanceof Definition && ((Definition) label).isLexical();
	}

	@Override
	public Node transform(boolean recursive, Function<Node, Node> f)
	{
		if (!recursive)
			return f.apply(this);

		Node[] cs = new Node[children.length];
		for (int i = 0; i < children.length; i++)
			cs[i] = children[i].transform(recursive, f);

		return f.apply(new Container(label, cs));
	}

	@Override
	public Node transformContainer(boolean recursive, Function<Container, Node> f)
	{
		if (!recursive)
			return f.apply(this);

		Node[] cs = new Node[children.length];
		for (int i = 0; i < children.length; i++)
			cs[i] = children[i].transformContainer(recursive, f);

		return f.apply(new Container(label, cs));
	}

	@Override
	public Node transformLeaf(boolean recursive, Function<Leaf, Node> f)
	{
		if (!recursive)
			return this;

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
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(children);
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Container other = (Container) obj;
		if (!Arrays.equals(children, other.children))
			return false;
		if (label == null)
		{
			if (other.label != null)
				return false;
		}
		else if (!label.equals(other.label))
			return false;
		return true;
	}

	@Override
	public void flatten(StringBuilder target, boolean lexical)
	{
		if (lexical || isLexicalDefinition())
			flattenLexical(target);
		else
			flattenNonLexical(target);
	}

	private void flattenNonLexical(StringBuilder target)
	{
		boolean separate = false;
		for (Node c : children)
		{
			if (separate)
				target.append(" ");

			c.flatten(target, false);

			separate = true;
		}
	}

	private void flattenLexical(StringBuilder target)
	{
		for (Node c : children)
			c.flatten(target, true);
	}

	@Override
	public String toString()
	{
		return Objects.toString(label) + Arrays.toString(children);
	}
}
