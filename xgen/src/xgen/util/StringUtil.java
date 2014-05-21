package xgen.util;

/**
 * Utilities for string conversion
 * 
 * @author Lukas Härtel
 *
 */
public class StringUtil
{
	/**
	 * Flattens a sequence of characters into a string using a string builder.
	 * 
	 * @param characters
	 *            The characters to flatten
	 * @return Returns the converted string
	 */
	public static String flatten(Iterable<Character> characters)
	{
		StringBuilder b = new StringBuilder();

		for (char c : characters)
			b.append(c);

		return b.toString();
	}
}
