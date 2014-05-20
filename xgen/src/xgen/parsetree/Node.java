package xgen.parsetree;

import java.util.function.Function;

import xgen.grammar.Element;

public abstract class Node {
	protected Node parent;

	public Node() {
		parent = null;
	}

	public Node getParent() {
		return parent;
	}

	public abstract Node transformLabel(Function<Element, Element> f);

	public abstract Node transformChildren(Function<Node[], Node[]> f);

	public abstract Node transformValue(Function<Object, Object> f);

	public abstract Node transformAllLabels(Function<Element, Element> f);

	public abstract Node transformAllChildren(Function<Node[], Node[]> f);

	public abstract Node transformAllValues(Function<Object, Object> f);
}
