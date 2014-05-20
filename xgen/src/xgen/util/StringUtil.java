package xgen.util;

public class StringUtil
{
	public static String flatten(Iterable<Character> characters)
	{
		StringBuilder b = new StringBuilder();

		for (char c : characters)
			b.append(c);

		return b.toString();
	}
}
