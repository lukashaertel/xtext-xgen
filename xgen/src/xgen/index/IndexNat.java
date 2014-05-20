package xgen.index;

import java.util.Optional;
import java.util.OptionalLong;

import xgen.util.CrossCast;

public class IndexNat<N> extends Index<N>
{
	public final CrossCast<N, Long> cast;

	public final long start;

	public final OptionalLong end;

	public IndexNat(CrossCast<N, Long> cast, N start, Optional<N> end)
	{
		this.cast = cast;
		this.start = cast.castTo(start);
		this.end = end.isPresent() ? OptionalLong.of(cast.castTo(end.get())) : OptionalLong.empty();
	}

	@Override
	public OptionalLong getBound()
	{
		if (end.isPresent())
			return OptionalLong.of(Math.max(0, end.getAsLong() + 1 - start));

		return OptionalLong.empty();
	}

	@Override
	public Optional<N> get(long i)
	{
		if (end.isPresent() && i > end.getAsLong() - start)
			return Optional.empty();

		return Optional.of(cast.castFrom(start + i));
	}
}
