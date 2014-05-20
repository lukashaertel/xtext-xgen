package xgen.index;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.BiFunction;

import xgen.util.PairingUtil;

public class IndexProduct<L, R, X> extends Index<X>
{
	public final Index<L> left;

	public final Index<R> right;

	public final BiFunction<Optional<L>, Optional<R>, Optional<X>> combination;

	public IndexProduct(Index<L> left, Index<R> right, BiFunction<Optional<L>, Optional<R>, Optional<X>> combination)
	{
		this.left = left;
		this.right = right;
		this.combination = combination;
	}

	public static <L, R, X> IndexProduct<L, R, X> lesseningLeft(Index<L> left, Index<R> right, BiFunction<Optional<L>, R, Optional<X>> combination)
	{
		return new IndexProduct<>(left, right, (x, y) -> y.flatMap(ye -> combination.apply(x, ye)));
	}

	public static <L, R, X> IndexProduct<L, R, X> lesseningRight(Index<L> left, Index<R> right, BiFunction<L, Optional<R>, Optional<X>> combination)
	{
		return new IndexProduct<>(left, right, (x, y) -> x.flatMap(xe -> combination.apply(xe, y)));
	}

	public static <L, R, X> IndexProduct<L, R, X> lessening(Index<L> left, Index<R> right, BiFunction<L, R, Optional<X>> combination)
	{
		return new IndexProduct<>(left, right, (x, y) -> x.flatMap(xe -> y.flatMap(ye -> combination.apply(xe, ye))));
	}

	public static <L, R, X> IndexProduct<L, R, X> presentRight(Index<L> left, Index<R> right, BiFunction<Optional<L>, R, X> combination)
	{
		return new IndexProduct<>(left, right, (x, y) -> y.flatMap(ye -> combination.andThen(Optional::of).apply(x, ye)));
	}

	public static <L, R, X> IndexProduct<L, R, X> presentLeft(Index<L> left, Index<R> right, BiFunction<L, Optional<R>, X> combination)
	{
		return new IndexProduct<>(left, right, (x, y) -> x.flatMap(xe -> combination.andThen(Optional::of).apply(xe, y)));
	}

	public static <L, R, X> IndexProduct<L, R, X> present(Index<L> left, Index<R> right, BiFunction<L, R, X> combination)
	{
		return new IndexProduct<>(left, right, (x, y) -> x.flatMap(xe -> y.flatMap(ye -> combination.andThen(Optional::of).apply(xe, ye))));
	}

	private long indexX(long z)
	{
		OptionalLong lb = left.getBound();
		OptionalLong rb = right.getBound();

		if (lb.isPresent())
			return PairingUtil.fixLeftX(z, lb.getAsLong());

		if (rb.isPresent())
			return PairingUtil.fixRightX(z, rb.getAsLong());

		return PairingUtil.cantorX(z);
	}

	private long indexY(long z)
	{
		OptionalLong lb = left.getBound();
		OptionalLong rb = right.getBound();

		if (lb.isPresent())
			return PairingUtil.fixLeftY(z, lb.getAsLong());

		if (rb.isPresent())
			return PairingUtil.fixRightY(z, rb.getAsLong());

		return PairingUtil.cantorY(z);
	}

	@Override
	public OptionalLong getBound()
	{
		OptionalLong lb = left.getBound();
		OptionalLong rb = right.getBound();

		if (lb.isPresent() && rb.isPresent())
			return OptionalLong.of(lb.getAsLong() * rb.getAsLong());

		return OptionalLong.empty();
	}

	@Override
	public Optional<X> get(long i)
	{
		long li = indexX(i);
		long ri = indexY(i);

		return combination.apply(left.get(li), right.get(ri));
	}

}
