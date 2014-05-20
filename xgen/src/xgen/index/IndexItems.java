package xgen.index;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

public class IndexItems<X> extends Index<X>
{
	public final List< X> items;

	public IndexItems(List<X> items)
	{
		this.items = Collections.unmodifiableList(items);
	}

	@Override
	public OptionalLong getBound()
	{
		return OptionalLong.of(items.size());
	}

	@Override
	public Optional<X> get(long i)
	{
		if (i >= items.size())
			return Optional.empty();

		return Optional.of(items.get((int) i));
	}
}
