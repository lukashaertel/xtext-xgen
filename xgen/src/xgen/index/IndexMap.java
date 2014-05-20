package xgen.index;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Function;

public class IndexMap<X1, X2> extends Index<X2>
{
	public final Index<X1> provider;

	public final Function<Optional<X1>, Optional<X2>> transformation;

	public IndexMap(Index<X1> provider, Function<Optional<X1>, Optional<X2>> transformation)
	{
		this.provider = provider;
		this.transformation = transformation;
	}

	/**
	 * Delegates to the constructor mapping all existing positions to zero or
	 * one result item
	 * 
	 * @param provider
	 *            The provider of the source items
	 * @param transformation
	 *            The transformation function
	 * @return Returns a new enumeration transformation
	 */
	public static <X1, X2> IndexMap<X1, X2> lessning(Index<X1> provider, Function<X1, Optional<X2>> transformation)
	{
		return new IndexMap<>(provider, x -> x.flatMap(transformation));
	}

	/**
	 * Delegates to the constructor mapping all existing positions to one result
	 * item
	 * 
	 * @param provider
	 *            The provider of the source items
	 * @param transformation
	 *            The transformation function
	 * @return Returns a new enumeration transformation
	 */
	public static <X1, X2> IndexMap<X1, X2> present(Index<X1> provider, Function<X1, X2> transformation)
	{
		return new IndexMap<>(provider, x -> x.flatMap(transformation.andThen(Optional::of)));
	}

	@Override
	public OptionalLong getBound()
	{
		return provider.getBound();
	}

	@Override
	public Optional<X2> get(long i)
	{
		return transformation.apply(provider.get(i));
	}

}
