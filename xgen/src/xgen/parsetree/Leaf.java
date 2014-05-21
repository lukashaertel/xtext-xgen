package xgen.parsetree;

import java.util.Objects;
import java.util.function.Function;

import xgen.grammar.Element;

public class Leaf extends Node
{
	public final Object value;

	public Leaf(Object value)
	{
		this.value = value;
	}

	@Override
	public Leaf transformLabel(Function<Element, Element> f)
	{
		return this;
	}

	@Override
	public Leaf transformChildren(Function<Node[], Node[]> f)
	{
		return this;
	}

	@Override
	public Leaf transformValue(Function<Object, Object> f)
	{
		return new Leaf(f.apply(value));
	}

	@Override
	public Leaf transformAllLabels(Function<Element, Element> f)
	{
		return this;
	}

	@Override
	public Leaf transformAllChildren(Function<Node[], Node[]> f)
	{
		return this;
	}

	@Override
	public Leaf transformAllValues(Function<Object, Object> f)
	{
		return new Leaf(f.apply(value));
	}

	@Override
	public void flatten(StringBuilder target, boolean lexical)
	{
		target.append(value);
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Leaf other = (Leaf) obj;
		if (value == null)
		{
			if (other.value != null)
				return false;
		}
		else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return Objects.toString(value);
	}

}
