package xgen.index;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import xgen.util.CrossCast;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterables;

/**
 * <p>
 * Evaluates a number to a resulting parse-tree element.
 * </p>
 * 
 * @author Lukas Härtel
 *
 * @param <N>
 * @param <L>
 */
public abstract class Index<X> implements Iterable<Optional<X>>
{
	@Override
	public Iterator<Optional<X>> iterator()
	{
		return new AbstractIterator<Optional<X>>()
		{
			private long i = 0;

			@Override
			protected Optional<X> computeNext()
			{
				OptionalLong b = getBound();

				if (!b.isPresent() || i < b.getAsLong())
					return get(i++);

				return endOfData();
			}
		};
	}

	/**
	 * Converts the index to the consecutive present items
	 * 
	 * @return Returns a filtered and transformed sequence
	 */
	public Iterable<X> asCompact()
	{
		return Iterables.transform(Iterables.filter(this, Optional::isPresent), Optional::get);
	}

	/**
	 * The length of the enumeration or empty if infinite
	 * 
	 * @return Returns an optional representing the length
	 */
	public abstract OptionalLong getBound();

	/**
	 * Evaluates a position to a value or empty if undefined
	 * 
	 * @param i
	 *            The position to evaluate
	 * @return Returns an optional representing the value at the position
	 */
	public abstract Optional<X> get(long i);

	/**
	 * Concatenates a sequence of indices
	 * 
	 * @param sequence
	 *            The sequence to concatenate
	 * @return Returns an index satisfying the concatenation
	 */
	public static <X> Index<X> concat(List<? extends Index<X>> sequence)
	{
		return new IndexConcat<>(sequence);
	}

	/**
	 * Concatenates all arguments
	 * 
	 * @param sequence
	 *            The sequence to concatenate
	 * @return Returns an index satisfying the concatenation
	 */
	@SafeVarargs
	public static <X> Index<X> concat(Index<X>... sequence)
	{
		return concat(Arrays.asList(sequence));
	}

	/**
	 * Filters all items in this index
	 * 
	 * @param filter
	 *            The predicate to test the items with
	 * @return Returns an index satisfying the filter
	 */
	public Index<X> filter(Predicate<X> filter)
	{
		return new IndexFilter<>(this, filter);
	}

	/**
	 * Flattens the production specified by the iterator
	 * 
	 * @param production
	 *            The iterator that specifies the sequence of indices
	 * @return
	 */
	public static <X> Index<X> flatten(Iterator<? extends Index<X>> production)
	{
		return new IndexFlatten<>(production);
	}

	/**
	 * Maps a sequence of items by their index
	 * 
	 * @param items
	 *            The items to index
	 * @return Returns an index satisfying item-access
	 */
	public static <X> Index<X> items(List<X> items)
	{
		return new IndexItems<>(items);
	}

	/**
	 * Maps a sequence of items by their index
	 * 
	 * @param items
	 *            The items to index
	 * @return Returns an index satisfying item-access
	 */
	@SafeVarargs
	public static <X> Index<X> items(X... items)
	{
		return new IndexItems<>(Arrays.asList(items));
	}

	public static <X> Index<X> late(Supplier<Index<X>> supplier)
	{
		return new IndexLate<>(supplier);
	}

	/**
	 * Limits this index with the new given bounds
	 * 
	 * @param limit
	 *            The new bounds, will be used if other index is longer or
	 *            infinite
	 * @return Returns an index satisfying domain limit
	 */
	public Index<X> limit(OptionalLong limit)
	{
		return new IndexLimit<>(this, limit);
	}

	/**
	 * Limits this index with the new given bounds
	 * 
	 * @param limit
	 *            The new bounds, will be used if other index is longer or
	 *            infinite
	 * @return Returns an index satisfying domain limit
	 */
	public Index<X> limit(long limit)
	{
		return new IndexLimit<>(this, OptionalLong.of(limit));
	}

	/**
	 * Maps this index with the given transformation of kind 0..1 to 0..1
	 * 
	 * @param transformation
	 *            The transformation function
	 * @return Returns an index satisfying item mapping
	 */
	public <Y> Index<Y> map(Function<Optional<X>, Optional<Y>> transformation)
	{
		return new IndexMap<>(this, transformation);
	}

	/**
	 * Maps this index with the given transformation of kind 1 to 0..1
	 * 
	 * @param transformation
	 *            The transformation function
	 * @return Returns an index satisfying item mapping
	 */
	public <Y> Index<Y> mapLessening(Function<X, Optional<Y>> transformation)
	{
		return IndexMap.lessning(this, transformation);
	}

	/**
	 * Maps this index with the given transformation of kind 1 to 1
	 * 
	 * @param transformation
	 *            The transformation function
	 * @return Returns an index satisfying item mapping
	 */
	public <Y> Index<Y> mapPresent(Function<X, Y> transformation)
	{
		return IndexMap.present(this, transformation);
	}

	/**
	 * Makes a natural number index with the given value mapping
	 * 
	 * @param cast
	 *            The value mapping
	 * @param start
	 *            The first item
	 * @param end
	 *            The last item or unbound
	 * @return Returns an index satisfying natural mapping
	 */
	public static <N> Index<N> nat(CrossCast<N, Long> cast, N start, Optional<N> end)
	{
		return new IndexNat<N>(cast, start, end);
	}

	/**
	 * Makes a natural number index with the given value mapping
	 * 
	 * @param cast
	 *            The value mapping
	 * @param start
	 *            The first item
	 * @param end
	 *            The last item
	 * @return Returns an index satisfying natural mapping
	 */
	public static <N> Index<N> nat(CrossCast<N, Long> cast, N start, N end)
	{
		return new IndexNat<N>(cast, start, Optional.of(end));
	}

	/**
	 * Makes an unbound natural number index with the given value mapping
	 * 
	 * @param cast
	 *            The value mapping
	 * @param start
	 *            The first item
	 * @return Returns an index satisfying natural mapping
	 */
	public static <N> Index<N> nat(CrossCast<N, Long> cast, N start)
	{
		return new IndexNat<N>(cast, start, Optional.empty());
	}

	/**
	 * Handle for char conversion of {@code nat}
	 */
	public static Index<Character> chars(char start, Optional<Character> end)
	{
		return new IndexNat<Character>(CrossCast.CHAR_LONG, start, end);
	}

	/**
	 * Handle for char conversion of {@code nat}
	 */
	public static Index<Character> chars(char start, char end)
	{
		return new IndexNat<Character>(CrossCast.CHAR_LONG, start, Optional.of(end));
	}

	/**
	 * Handle for char conversion of {@code nat}
	 */
	public static Index<Character> chars(char start)
	{
		return new IndexNat<Character>(CrossCast.CHAR_LONG, start, Optional.empty());
	}

	/**
	 * Handle for short conversion of {@code nat}
	 */
	public static Index<Short> shorts(short start, Optional<Short> end)
	{
		return new IndexNat<Short>(CrossCast.SHORT_LONG, start, end);
	}

	/**
	 * Handle for short conversion of {@code nat}
	 */
	public static Index<Short> shorts(short start, short end)
	{
		return new IndexNat<Short>(CrossCast.SHORT_LONG, start, Optional.of(end));
	}

	/**
	 * Handle for short conversion of {@code nat}
	 */
	public static Index<Short> shorts(short start)
	{
		return new IndexNat<Short>(CrossCast.SHORT_LONG, start, Optional.empty());
	}

	/**
	 * Handle for integer conversion of {@code nat}
	 */
	public static Index<Integer> ints(int start, Optional<Integer> end)
	{
		return new IndexNat<Integer>(CrossCast.INTEGER_LONG, start, end);
	}

	/**
	 * Handle for integer conversion of {@code nat}
	 */
	public static Index<Integer> ints(int start, OptionalInt end)
	{
		return new IndexNat<Integer>(CrossCast.INTEGER_LONG, start, end.isPresent() ? Optional.of(end.getAsInt()) : Optional.empty());
	}

	/**
	 * Handle for integer conversion of {@code nat}
	 */
	public static Index<Integer> ints(int start, int end)
	{
		return new IndexNat<Integer>(CrossCast.INTEGER_LONG, start, Optional.of(end));
	}

	/**
	 * Handle for integer conversion of {@code nat}
	 */
	public static Index<Integer> ints(int start)
	{
		return new IndexNat<Integer>(CrossCast.INTEGER_LONG, start, Optional.empty());
	}

	/**
	 * Handle for long conversion of {@code nat}
	 */
	public static Index<Long> longs(long start, Optional<Long> end)
	{
		return new IndexNat<Long>(CrossCast.LONG_LONG, start, end);
	}

	/**
	 * Handle for long conversion of {@code nat}
	 */
	public static Index<Long> longs(long start, OptionalLong end)
	{
		return new IndexNat<Long>(CrossCast.LONG_LONG, start, end.isPresent() ? Optional.of(end.getAsLong()) : Optional.empty());
	}

	/**
	 * Handle for long conversion of {@code nat}
	 */
	public static Index<Long> longs(long start, long end)
	{
		return new IndexNat<Long>(CrossCast.LONG_LONG, start, Optional.of(end));
	}

	/**
	 * Handle for long conversion of {@code nat}
	 */
	public static Index<Long> longs(long start)
	{
		return new IndexNat<Long>(CrossCast.LONG_LONG, start, Optional.empty());
	}

	/**
	 * Makes a cross-product index with the RHS and the given mapping of kind
	 * (0..1, 0..1) to 0..1
	 * 
	 * @param right
	 *            The RHS operand
	 * @param combination
	 *            The combination function
	 * @return Returns an index satisfying cross-production
	 */
	public <R, Y> Index<Y> product(Index<R> right, BiFunction<Optional<X>, Optional<R>, Optional<Y>> combination)
	{
		return new IndexProduct<>(this, right, combination);
	}

	/**
	 * Makes a cross-product index with the RHS and the given mapping of kind
	 * (0..1, 1) to 0..1
	 * 
	 * @param right
	 *            The RHS operand
	 * @param combination
	 *            The combination function
	 * @return Returns an index satisfying cross-production
	 */
	public <R, Y> Index<Y> productLesseningLeft(Index<R> right, BiFunction<Optional<X>, R, Optional<Y>> combination)
	{
		return IndexProduct.lesseningLeft(this, right, combination);
	}

	/**
	 * Makes a cross-product index with the RHS and the given mapping of kind
	 * (1, 0..1) to 0..1
	 * 
	 * @param right
	 *            The RHS operand
	 * @param combination
	 *            The combination function
	 * @return Returns an index satisfying cross-production
	 */
	public <R, Y> Index<Y> productLesseningRight(Index<R> right, BiFunction<X, Optional<R>, Optional<Y>> combination)
	{
		return IndexProduct.lesseningRight(this, right, combination);
	}

	/**
	 * Makes a cross-product index with the RHS and the given mapping of kind
	 * (1, 1) to 0..1
	 * 
	 * @param right
	 *            The RHS operand
	 * @param combination
	 *            The combination function
	 * @return Returns an index satisfying cross-production
	 */
	public <R, Y> Index<Y> productLessening(Index<R> right, BiFunction<X, R, Optional<Y>> combination)
	{
		return IndexProduct.lessening(this, right, combination);
	}

	/**
	 * Makes a cross-product index with the RHS and the given mapping of kind
	 * (0..1, 1) to 1
	 * 
	 * @param right
	 *            The RHS operand
	 * @param combination
	 *            The combination function
	 * @return Returns an index satisfying cross-production
	 */
	public <R, Y> Index<Y> productPresentRight(Index<R> right, BiFunction<Optional<X>, R, Y> combination)
	{
		return IndexProduct.presentRight(this, right, combination);
	}

	/**
	 * Makes a cross-product index with the RHS and the given mapping of kind
	 * (1, 0..1) to 1
	 * 
	 * @param right
	 *            The RHS operand
	 * @param combination
	 *            The combination function
	 * @return Returns an index satisfying cross-production
	 */
	public <R, Y> Index<Y> productPresentLeft(Index<R> right, BiFunction<X, Optional<R>, Y> combination)
	{
		return IndexProduct.presentLeft(this, right, combination);
	}

	/**
	 * Makes a cross-product index with the RHS and the given mapping of kind
	 * (1, 1) to 1
	 * 
	 * @param right
	 *            The RHS operand
	 * @param combination
	 *            The combination function
	 * @return Returns an index satisfying cross-production
	 */
	public <R, Y> Index<Y> productPresent(Index<R> right, BiFunction<X, R, Y> combination)
	{
		return IndexProduct.present(this, right, combination);
	}

	/**
	 * Zips the RHS operand after this one as first item provider
	 * 
	 * @param second
	 *            The RHS operand
	 * @param collapse
	 *            True if size-dominating index should be collapsed after the
	 *            size-recessive index
	 * @return Returns an index satisfying zipping
	 */
	public Index<X> zip(Index<X> second, boolean collapse)
	{
		return new IndexZip<>(this, second, collapse);
	}

	public Index<Iterable<X>> combine(long length)
	{
		if (length < 0)
			throw new IllegalArgumentException();

		if (length == 0)
			return Index.items(Collections.emptySet());

		if (length == 1)
			return mapPresent(i -> Collections.singleton(i));

		Index<Iterable<X>> firstHalf = combine(length / 2);
		Index<Iterable<X>> secondHalf = combine(length / 2 + length % 2);

		return firstHalf.productPresent(secondHalf, (a, b) -> Iterables.concat(a, b));
	}

	public Index<Iterable<X>> combinations(long min, OptionalLong max, long innerPerOuter)
	{
		return flatten(new AbstractIterator<Index<Iterable<X>>>()
		{
			private long length = min;

			@Override
			protected Index<Iterable<X>> computeNext()
			{
				if (max.isPresent() && length > max.getAsLong())
					return endOfData();

				length++;

				if (getBound().isPresent())
					return combine(length - 1);
				else
					return limit(innerPerOuter * (length - min)).combine(length - 1);
			}
		});
	}
}
