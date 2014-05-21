package xgen.parsetree;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

import com.google.common.collect.Iterables;

import xgen.grammar.Definition;
import xgen.grammar.Element;

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
	public Container transformLabel(Function<Element, Element> f)
	{
		return new Container(f.apply(label), children);
	}

	@Override
	public Container transformChildren(Function<Node[], Node[]> f)
	{
		return new Container(label, f.apply(children));
	}

	@Override
	public Container transformValue(Function<Object, Object> f)
	{
		return this;
	}

	@Override
	public Container transformAllLabels(Function<Element, Element> f)
	{
		Node[] r = new Node[children.length];
		for (int i = 0; i < children.length; i++)
			r[i] = children[i].transformAllLabels(f);

		return new Container(f.apply(label), r);
	}

	@Override
	public Container transformAllChildren(Function<Node[], Node[]> f)
	{
		Node[] r = new Node[children.length];
		for (int i = 0; i < children.length; i++)
			r[i] = children[i].transformAllChildren(f);

		return new Container(label, f.apply(r));
	}

	@Override
	public Container transformAllValues(Function<Object, Object> f)
	{
		Node[] r = new Node[children.length];
		for (int i = 0; i < children.length; i++)
			r[i] = children[i].transformAllValues(f);

		return new Container(label, r);
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
