package xgen.parsetree;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class Node
{
	protected Node parent;

	public Node()
	{
		parent = null;
	}

	public Node getParent()
	{
		return parent;
	}

	public abstract Node transform(boolean recursive, Function<Node, Node> f);

	public abstract Node transformContainer(boolean recursive, Function<Container, Node> f);

	public abstract Node transformLeaf(boolean recursive, Function<Leaf, Node> f);

	public abstract void visit(Consumer<? super Node> f);

	public String flatten(boolean lexical)
	{
		StringBuilder b = new StringBuilder();

		flatten(b, lexical);

		return b.toString();
	}

	public abstract void flatten(StringBuilder target, boolean lexical);
}
