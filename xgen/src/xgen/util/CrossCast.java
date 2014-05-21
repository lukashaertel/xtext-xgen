package xgen.util;

/**
 * Combination of forward and backward conversion
 * 
 * @author Lukas Härtel
 *
 * @param <T>
 *            The Target type
 * @param <U>
 *            The source type
 */
public interface CrossCast<T, U>
{
	/**
	 * Conversion of long to character
	 */
	public final CrossCast<Character, Long> CHAR_LONG = new CrossCast<Character, Long>()
	{
		@Override
		public Character castFrom(Long u)
		{
			return (char) (long) u;
		}

		@Override
		public Long castTo(Character t)
		{
			return (long) (char) t;
		}
	};

	/**
	 * Conversion of long to short
	 */
	public final CrossCast<Short, Long> SHORT_LONG = new CrossCast<Short, Long>()
	{
		@Override
		public Short castFrom(Long u)
		{
			return (short) (long) u;
		}

		@Override
		public Long castTo(Short t)
		{
			return (long) (short) t;
		}
	};

	/**
	 * Conversion of long to int
	 */
	public final CrossCast<Integer, Long> INTEGER_LONG = new CrossCast<Integer, Long>()
	{
		@Override
		public Integer castFrom(Long u)
		{
			return (int) (long) u;
		}

		@Override
		public Long castTo(Integer t)
		{
			return (long) (int) t;
		}
	};

	/**
	 * Conversion of long to long i.e. identity
	 */
	public final CrossCast<Long, Long> LONG_LONG = new CrossCast<Long, Long>()
	{
		@Override
		public Long castFrom(Long u)
		{
			return u;
		}

		@Override
		public Long castTo(Long t)
		{
			return t;
		}
	};

	/**
	 * Casts to the target type from the source type
	 * 
	 * @param u
	 *            The source
	 * @return Returns the source as an item of the target type
	 */
	public T castFrom(U u);

	/**
	 * Casts from the target type to the source type
	 * 
	 * @param u
	 *            The target
	 * @return Returns the target as an item of the sourc type
	 */
	public U castTo(T t);
}
