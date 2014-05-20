package xgen.index;

import java.util.Optional;
import java.util.OptionalLong;

public class IndexZip<X> extends Index<X>
{
	private final Index<X> first;

	private final Index<X> second;

	private boolean collapse;

	private final boolean firstDominates;

	private final boolean secondDominate;

	public IndexZip(Index<X> first, Index<X> second, boolean collapse)
	{
		this.first = first;
		this.second = second;
		this.collapse = collapse;

		OptionalLong fb = first.getBound();
		OptionalLong sb = second.getBound();

		firstDominates = sb.isPresent() && (!fb.isPresent() || fb.getAsLong() > sb.getAsLong());
		secondDominate = fb.isPresent() && (!sb.isPresent() || sb.getAsLong() > fb.getAsLong());
	}

	@Override
	public OptionalLong getBound()
	{
		OptionalLong fb = first.getBound();
		OptionalLong sb = second.getBound();

		if (fb.isPresent() && sb.isPresent())
			return OptionalLong.of(fb.getAsLong() + sb.getAsLong());

		return OptionalLong.empty();
	}

	@Override
	public Optional<X> get(long i)
	{
		OptionalLong fb = first.getBound();
		OptionalLong sb = second.getBound();

		// 0 1 2 3 4 5 6 7 8
		// X Y X Y X Y X X X
		// 0 - 1 - 2 - 3 4 5
		// - 0 - 1 - 2 - - -
		if (collapse && firstDominates)
		{
			if (i > 2 * sb.getAsLong() - 1)
				return first.get(i - sb.getAsLong());
		}

		// 0 1 2 3 4 5 6 7 8
		// X Y X Y X Y Y Y Y
		// 0 - 1 - 2 - - - -
		// - 0 - 1 - 2 3 4 5
		if (collapse && secondDominate)
		{
			if (i > 2 * fb.getAsLong() - 1)
				return second.get(i - fb.getAsLong());
		}

		// No domination, so distribute evenly
		if (i % 2 == 0)
			return first.get(i / 2);
		else
			return second.get(i / 2);
	}
}
