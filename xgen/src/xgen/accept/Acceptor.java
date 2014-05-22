package xgen.accept;

import java.util.regex.Pattern;

import xgen.grammar.Alternative;
import xgen.grammar.Any;
import xgen.grammar.Definition;
import xgen.grammar.Element;
import xgen.grammar.Keyword;
import xgen.grammar.Multiplicity;
import xgen.grammar.Not;
import xgen.grammar.Range;
import xgen.grammar.Reference;
import xgen.grammar.Sequence;
import xgen.grammar.Unary;
import xgen.grammar.util.GrammarSwitch;

/**
 * Acceptor checks if a given string is accepted by a given element
 * 
 * @author Lukas Härtel
 *
 */
public class Acceptor
{
	/**
	 * Checks if any substring of the input string is accepted by the given
	 * element
	 * 
	 * @param element
	 *            The element to test
	 * @param string
	 *            The string whose substrings are to be checked
	 * @return Returns true if accepted
	 */
	public static boolean acceptsAnySubstring(Element element, String string)
	{
		return acceptsAnySubstring(element, string, true);
	}

	/**
	 * Checks if any substring of the input string is accepted by the given
	 * element
	 * 
	 * @param element
	 *            The element to test
	 * @param string
	 *            The string whose substrings are to be checked
	 * @param inclueEmpty
	 *            True if the empty string should be included in the check
	 * @return Returns true if accepted
	 */
	public static boolean acceptsAnySubstring(Element element, String string, boolean inclueEmpty)
	{
		// Accepting should be state-less, so only test empty string once and
		// continue like non-empty strings are required
		if (inclueEmpty && accepts(element, ""))
			return true;

		for (int i = 0; i < string.length() - 1; i++)
			for (int j = i + 1; j < string.length(); j++)
				if (accepts(element, string.substring(i, j)))
					return true;

		return false;
	}

	/**
	 * Checks if any suffix of the input string is accepted by the given element
	 * 
	 * @param element
	 *            The element to test
	 * @param string
	 *            The string whose suffices are to be checked
	 * @return Returns true if accepted
	 */
	public static boolean acceptsAnySuffix(Element element, String string)
	{
		return acceptsAnySuffix(element, string, true);
	}

	/**
	 * Checks if any suffix of the input string is accepted by the given element
	 * 
	 * @param element
	 *            The element to test
	 * @param string
	 *            The string whose suffices are to be checked
	 * @param inclueEmpty
	 *            True if the empty string should be included in the check
	 * @return Returns true if accepted
	 */
	public static boolean acceptsAnySuffix(Element element, String string, boolean inclueEmpty)
	{
		// Just like the substring acceptance
		if (inclueEmpty && accepts(element, ""))
			return true;

		for (int i = string.length() - 1; i >= 0; i--)
			if (accepts(element, string.substring(i)))
				return true;

		return false;
	}

	/**
	 * Checks if any prefix of the input string is accepted by the given element
	 * 
	 * @param element
	 *            The element to test
	 * @param string
	 *            The string whose prefixes are to be checked
	 * @return Returns true if accepted
	 */
	public static boolean acceptsAnyPrefix(Element element, String string)
	{
		return acceptsAnyPrefix(element, string, true);
	}

	/**
	 * Checks if any prefix of the input string is accepted by the given element
	 * 
	 * @param element
	 *            The element to test
	 * @param string
	 *            The string whose prefixes are to be checked
	 * @param inclueEmpty
	 *            True if the empty string should be included in the check
	 * @return Returns true if accepted
	 */
	public static boolean acceptsAnyPrefix(Element element, String string, boolean inclueEmpty)
	{
		// Just like the substring acceptance
		if (inclueEmpty && accepts(element, ""))
			return true;

		for (int i = 1; i < string.length(); i++)
			if (accepts(element, string.substring(0, i)))
				return true;

		return false;
	}

	/**
	 * Checks if the string is accepted by the given element
	 * 
	 * @param element
	 *            The element to test
	 * @param string
	 *            The string to be checked
	 * @return Returns true if accepted
	 */
	public static boolean accepts(Element element, String string)
	{
		return Pattern.compile("^" + acceptingRegEx(element) + "$", Pattern.DOTALL).matcher(string).matches();
	}

	/**
	 * Escapes a character to be used in a regex range
	 * 
	 * @param c
	 *            The character to escape
	 * @return Returns the character as an escaped string
	 */
	protected static String escapeInRange(char c)
	{
		// Escape special characters
		switch (c)
		{
		case '^':
		case '-':
		case ']':
		case '\\':
			return "\\" + Character.toString(c);
		}

		// If nothing to escape return simple
		return Character.toString(c);
	}

	/**
	 * Converts the element to a regex pattern
	 * 
	 * @param element
	 *            The element to convert
	 * @return Returns a regex pattern string
	 */
	protected static String acceptingRegEx(Element element)
	{
		return new GrammarSwitch<String>()
		{
			@Override
			public String caseAlternative(Alternative object)
			{
				StringBuilder b = new StringBuilder();

				b.append("(");
				b.append(acceptingRegEx(object.getOperands().get(0)));

				for (int i = 1; i < object.getOperands().size(); i++)
				{
					b.append("|");
					b.append(acceptingRegEx(object.getOperands().get(i)));
				}

				b.append(")");

				return b.toString();
			}

			@Override
			public String caseAny(Any object)
			{
				return ".";
			}

			@Override
			public String caseKeyword(Keyword object)
			{
				return Pattern.quote(object.getValue());
			}

			@Override
			public String caseMultiplicity(Multiplicity object)
			{
				StringBuilder b = new StringBuilder();
				b.append("(");
				b.append(acceptingRegEx(object.getOperand()));
				b.append("){");
				b.append(object.getMin());
				b.append(",");

				if (object.isUpperBounded())
					b.append(object.getMax());

				b.append("}");

				return b.toString();
			}

			@Override
			public String caseNot(Not object)
			{
				StringBuilder b = new StringBuilder();
				b.append(".(?<!(");
				b.append(acceptingRegEx(object.getOperand()));
				b.append("))");

				return b.toString();
			}

			@Override
			public String caseRange(Range object)
			{
				StringBuilder b = new StringBuilder();
				b.append("[");
				b.append(escapeInRange(object.getMin()));
				b.append("-");
				b.append(escapeInRange(object.getMax()));
				b.append("]");

				return b.toString();
			}

			@Override
			public String caseReference(Reference object)
			{
				return acceptingRegEx(object.getResolved());
			}

			@Override
			public String caseDefinition(Definition object)
			{
				return acceptingRegEx(object.getRhs());
			}

			@Override
			public String caseSequence(Sequence object)
			{
				StringBuilder b = new StringBuilder();

				b.append("(");
				b.append(acceptingRegEx(object.getOperands().get(0)));

				for (int i = 1; i < object.getOperands().size(); i++)
				{
					b.append(acceptingRegEx(object.getOperands().get(i)));
				}

				b.append(")");

				return b.toString();
			}

			public String caseUnary(Unary object)
			{
				return ".*" + acceptingRegEx(object.getOperand());
			}
		}.doSwitch(element);
	}
}
