package xgen.parsetree;

import java.util.Arrays;
import java.util.function.Function;

import com.google.common.collect.Iterables;

import xgen.grammar.Element;

public class Container extends Node
{
	public final Element label;

	public final Node[] children;

	public Container(Element label, Node... children)
	{
		this.label = label;
		this.children = children;
	}

	public static Container fromIterable(Element label, Iterable<Node> children)
	{
		return new Container(label, Iterables.toArray(children, Node.class));
	}

	public Container transformLabel(Function<Element, Element> f)
	{
		return new Container(f.apply(label), children);
	}

	public Container transformAllLabels(Function<Element, Element> f)
	{
		Node[] r = new Node[children.length];

		for (int i = 0; i < children.length; i++)
			if (children[i] instanceof Container)
				r[i] = ((Container) children[i]).transformAllLabels(f);
			else
				r[i] = children[i];

		return new Container(f.apply(label), r);
	}

	public Container transformChildren(Function<Node[], Node[]> f)
	{
		return new Container(label, f.apply(children));
	}

	public Container transformAllChildren(Function<Node[], Node[]> f)
	{
		Node[] r = new Node[children.length];

		for (int i = 0; i < children.length; i++)
			if (children[i] instanceof Container)
				r[i] = ((Container) children[i]).transformAllChildren(f);
			else
				r[i] = children[i];

		return new Container(label, f.apply(r));
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
		if (!(obj instanceof Container))
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
	public String toString()
	{
		if (children.length == 0)
			return "";

		StringBuilder b = new StringBuilder();
		b.append(children[0]);
		for (int i = 1; i < children.length; i++)
		{
			b.append(" ");
			b.append(children[i]);
		}

		return b.toString();
	}
}
