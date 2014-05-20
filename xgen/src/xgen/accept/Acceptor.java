package xgen.accept;

import java.util.regex.Pattern;

import xgen.grammar.Alternative;
import xgen.grammar.Any;
import xgen.grammar.Element;
import xgen.grammar.Keyword;
import xgen.grammar.Multiplicity;
import xgen.grammar.Not;
import xgen.grammar.Range;
import xgen.grammar.Reference;
import xgen.grammar.Sequence;
import xgen.grammar.util.GrammarSwitch;

public class Acceptor
{
	public static final Acceptor INSTANCE = new Acceptor();

	public boolean acceptsAnySubstring(Element element, String string)
	{
		return acceptsAnySubstring(element, string, true);
	}

	public boolean acceptsAnySubstring(Element element, String string, boolean inclueEmpty)
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

	public boolean acceptsAnySuffix(Element element, String string)
	{
		return acceptsAnySuffix(element, string, true);
	}

	public boolean acceptsAnySuffix(Element element, String string, boolean inclueEmpty)
	{
		// Just like the substring acceptance
		if (inclueEmpty && accepts(element, ""))
			return true;

		for (int i = string.length() - 1; i >= 0; i--)
			if (accepts(element, string.substring(i)))
				return true;

		return false;
	}

	public boolean acceptsAnyPrefix(Element element, String string)
	{
		return acceptsAnyPrefix(element, string, true);
	}

	public boolean acceptsAnyPrefix(Element element, String string, boolean inclueEmpty)
	{
		// Just like the substring acceptance
		if (inclueEmpty && accepts(element, ""))
			return true;

		for (int i = 1; i < string.length(); i++)
			if (accepts(element, string.substring(0, i)))
				return true;

		return false;
	}

	public boolean accepts(Element element, String string)
	{
		return Pattern.compile("^" + acceptingRegEx(element) + "$", Pattern.DOTALL).matcher(string).matches();
	}

	protected String escapeInRange(char c)
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

	protected String acceptingRegEx(Element element)
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
				return acceptingRegEx(object.getTarget().getRhs());
			}

			@Override
			public String caseSequence(Sequence object)
			{
				StringBuilder b = new StringBuilder();

				b.append("(");
				b.append(acceptingRegEx(object.getOperands().get(0)));

				for (int i = 1; i < object.getOperands().size(); i++)
				{
					b.append(" ");
					b.append(acceptingRegEx(object.getOperands().get(i)));
				}

				b.append(")");

				return b.toString();
			}
		}.doSwitch(element);
	}
}
