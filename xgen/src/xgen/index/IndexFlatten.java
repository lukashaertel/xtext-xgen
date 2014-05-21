package xgen.index;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.TreeMap;

public class IndexFlatten<X> extends Index<X>
{
	private final Iterator<? extends Index<X>> production;

	private final NavigableMap<Long, Index<X>> ranges;

	public IndexFlatten(Iterator<? extends Index<X>> production)
	{
		this.production = production;

		ranges = new TreeMap<>();
	}

	@Override
	public OptionalLong getBound()
	{
		// If not exhausted return infinite length
		if (production.hasNext())
			return OptionalLong.empty();

		// Get the end of all ranges
		Entry<Long, Index<X>> e = ranges.lastEntry();

		// If exhausted and empty return length zero
		if (e == null)
			return OptionalLong.of(0);

		// Get its' bounds
		OptionalLong b = e.getValue().getBound();

		// If bounds finite offset by the last ranges base
		if (b.isPresent())
			return OptionalLong.of(e.getKey() + b.getAsLong());

		// If infinite return infinite
		return OptionalLong.empty();

	}

	@Override
	public Optional<X> get(long i)
	{
		// Get the appropriate range
		Entry<Long, Index<X>> r = getRange(i);

		// If no appropriate range exists return undefined
		if (r == null)
			return Optional.empty();

		// If it exists, get the value in the ranges system
		return r.getValue().get(i - r.getKey());
	}

	private boolean isRangeFor(Entry<Long, ? extends Index<X>> range, long i)
	{
		// If the range is null then false
		if (range == null)
			return false;

		// If ranges key is larger than the positon in question
		if (range.getKey() > i)
			return false;

		// Get the ranges bounds
		OptionalLong b = range.getValue().getBound();

		// If infinite bounds, always true
		if (!b.isPresent())
			return true;

		// Else check the range
		return b.getAsLong() > i - range.getKey();
	}

	private Entry<Long, Index<X>> getRange(long i)
	{
		// Try to directly find the potential range
		Entry<Long, Index<X>> f = ranges.floorEntry(i);

		// If it does not exist or the domain is not responsible for
		// this index,
		// and if the production has another index, append and retry
		while ((f == null || !isRangeFor(f, i)) && production.hasNext())
		{
			// Get the next index
			Index<X> n = production.next();

			// Get length of it
			OptionalLong nb = n.getBound();

			// If next index is empty, skip it
			if (nb.isPresent() && nb.getAsLong() == 0)
				continue;

			// Get the range to append the next one to
			Entry<Long, Index<X>> e = ranges.lastEntry();

			// If no range yet, make next the first
			if (e == null)
			{
				ranges.put(0L, n);
			}
			else
			{
				// Else append
				OptionalLong eb = e.getValue().getBound();

				// Assert the domain of the index appended to is not
				// infinite
				if (!eb.isPresent())
					throw new IllegalStateException();

				ranges.put(e.getKey() + eb.getAsLong(), n);
			}

			// Retry to find a potential range
			f = ranges.floorEntry(i);
		}

		return f;
	}
}
