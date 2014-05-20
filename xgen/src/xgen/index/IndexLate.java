package xgen.index;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Supplier;

public class IndexLate<X> extends Index<X>
{
	public final Supplier<Index<X>> supplier;

	private Optional<Index<X>> index;

	public IndexLate(Supplier<Index<X>> supplier)
	{
		this.supplier = supplier;

		index = Optional.empty();
	}

	@Override
	public OptionalLong getBound()
	{
		if (!index.isPresent())
			return OptionalLong.empty();

		return index.get().getBound();
	}

	@Override
	public Optional<X> get(long i)
	{
		if (!index.isPresent())
			index = Optional.of(supplier.get());

		return index.get().get(i);
	}

}
