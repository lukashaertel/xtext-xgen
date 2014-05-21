package xgen.parsetree;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

public class Leaf extends Node
{
	public final Object value;

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
