package xgen.parsetree;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Node that does not contain any more nodes
 * 
 * @author Lukas Härtel
 *
 */
public class Leaf extends Node
{
	/**
	 * The value of the leaf
	 */
	public final Object value;

	/**
	 * Constructs the leaf
	 * 
	 * @param value
	 *            The value to use
	 */
	public Leaf(Object value)
	{
		this.value = value;
	}

	@Override
	public Node transform(boolean recursive, Function<Node, Node> f)
	{
		return f.apply(this);
	}

	@Override
	public Node transformContainer(boolean recursive, Function<Container, Node> f)
	{
		return this;
	}

	@Override
	public Node transformLeaf(boolean recursive, Function<Leaf, Node> f)
	{
		return f.apply(this);
	}

	@Override
	public void visit(Consumer<? super Node> f)
	{
		f.accept(this);
	}

	@Override
	public void flatten(StringBuilder target, boolean lexical)
	{
		target.append(value);
	}

	@Override
	public String toString()
	{
		return Objects.toString(value);
	}

}
