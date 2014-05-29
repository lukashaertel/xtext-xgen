package xgen.parsetree;

import com.google.common.base.Function;

public class Pair<A, B>
{
	public final A a;

	public final B b;

	public Pair(A a, B b)
	{
		this.a = a;
		this.b = b;
	}

	public static <A, B> Pair<A, B> create(A a, B b)
	{
		return new Pair<A, B>(a, b);
	}

	public <X> Pair<X, B> mapA(Function<A, X> f)
	{
		return new Pair<>(f.apply(a), b);
	}

	public <X> Pair<A, X> mapB(Function<B, X> f)
	{
		return new Pair<>(a, f.apply(b));
	}
}
