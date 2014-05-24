package xgen.parsetree;

public abstract class Setting
{
	public static final Setting VOID_SETTING = new Setting()
	{
		@Override
		public void beforeLeaf(StringBuilder target, Leaf leaf)
		{
		}

		@Override
		public void beforeContainer(StringBuilder target, Node container)
		{
		}

		@Override
		public void afterLeaf(StringBuilder target, Leaf leaf)
		{
		}

		@Override
		public void afterContainer(StringBuilder target, Node container)
		{
		}
	};
	
	public static final Setting DEFAULT_SETTING = new Setting()
	{
		private String[][] before = { { "{", "\r\n" }, { "}", "\r\n" } };

		private String[][] after = { { "{", "\r\n" }, { "}", "\r\n" }, {";", "\r\n"} };

		@Override
		public void beforeLeaf(StringBuilder target, Leaf leaf)
		{
			for (String[] s : before)
			{
				if (s[0].equals(leaf.value))
					target.append(s[1]);
			}
		}

		@Override
		public void afterLeaf(StringBuilder target, Leaf leaf)
		{
			for (String[] s : after)
			{
				if (s[0].equals(leaf.value))
					target.append(s[1]);
			}
		}

		@Override
		public void beforeContainer(StringBuilder target, Node container)
		{
		}

		@Override
		public void afterContainer(StringBuilder target, Node container)
		{
		}
	};

	public abstract void beforeLeaf(StringBuilder target, Leaf leaf);

	public abstract void afterLeaf(StringBuilder target, Leaf leaf);

	public abstract void beforeContainer(StringBuilder target, Node container);

	public abstract void afterContainer(StringBuilder target, Node container);
}
