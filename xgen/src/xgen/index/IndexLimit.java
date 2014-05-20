package xgen.index;

import java.util.Optional;
import java.util.OptionalLong;

public class IndexLimit<X> extends Index<X>
{
	public final Index<X> provider;

	public final OptionalLong limit;

	public IndexLimit(Index<X> provider, OptionalLong limit)
	{
		this.provider = provider;
		this.limit = limit;
	}

	@Override
	public OptionalLong getBound()
	{
		OptionalLong b = provider.getBound();

		if (limit.isPresent())
		{
			if (b.isPresent())
				return OptionalLong.of(Math.min(b.getAsLong(), limit.getAsLong()));
			else
				return limit;
		}
		else
		{
			if (b.isPresent())
				return OptionalLong.of(Math.min(b.getAsLong(), limit.getAsLong()));
			else
				return limit;
		}
	}

	@Override
	public Optional<X> get(long i)
	{
		OptionalLong b = getBound();

		// Do another check on boundary as we might be limiting it more
		if (b.isPresent())
		{
			if (i < b.getAsLong())
				return provider.get(i);
			else
				return Optional.empty();
		}

		return get(i);
	}

}
