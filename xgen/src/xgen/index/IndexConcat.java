package xgen.index;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

import com.google.common.collect.Iterables;

public class IndexConcat<X> extends Index<X>
{
	public final List<? extends Index<X>> sequence;

	public IndexConcat(List<? extends Index<X>> sequence)
	{
		this.sequence = Collections.unmodifiableList(sequence);
	}

	@Override
	public Iterator<Optional<X>> iterator()
	{
		return Iterables.concat(sequence).iterator();
	}

	@Override
	public OptionalLong getBound()
	{
		long r = 0;
		for (Index<X> s : sequence)
		{
			OptionalLong b = s.getBound();

			if (b.isPresent())
				r += b.getAsLong();
			else
				return OptionalLong.empty();
		}

		return OptionalLong.of(r);
	}

	@Override
	public Optional<X> get(long i)
	{
		return get(i, 0);
	}

	private Optional<X> get(long i, int inSequence)
	{
		// If no corresponding item for the sequence index, return empty
		if (inSequence > sequence.size())
			return Optional.empty();

		// Get effective head
		Index<X> s = sequence.get(inSequence);

		// Get its' bounds
		OptionalLong b = s.getBound();

		// If it is unbound, evaluate it
		if (!b.isPresent())
			return s.get(i);

		// If bounded and index inside of bounds, evaluate it
		if (i < b.getAsLong())
			return s.get(i);

		// If none satisfying, shift the input by the bounds and move effective
		// head
		return get(i - b.getAsLong(), inSequence + 1);
	}
}
