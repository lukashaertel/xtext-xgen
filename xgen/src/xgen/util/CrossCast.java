package xgen.util;

public interface CrossCast<T, U>
{
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

	public T castFrom(U u);

	public U castTo(T t);
}
