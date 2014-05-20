package xgen.index;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Predicate;

public class IndexFilter<X> extends Index<X>
{
	public final Index<X> provider;

	public final Predicate<X> filter;

	public IndexFilter(Index<X> provider, Predicate<X> filter)
	{
		this.provider = provider;
		this.filter = filter;
	}

	@Override
	public OptionalLong getBound()
	{
		return provider.getBound();
	}

	@Override
	public Optional<X> get(long i)
	{
		Optional<X> y = provider.get(i);

		if (y.isPresent() && filter.test(y.get()))
			return y;

		return Optional.empty();
	}

}
