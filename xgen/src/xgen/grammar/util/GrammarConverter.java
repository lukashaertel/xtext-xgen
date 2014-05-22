package xgen.grammar.util;

import static xgen.grammar.util.GrammarConstructor.alternative;
import static xgen.grammar.util.GrammarConstructor.any;
import static xgen.grammar.util.GrammarConstructor.definition;
import static xgen.grammar.util.GrammarConstructor.keyword;
import static xgen.grammar.util.GrammarConstructor.multiplicityBound;
import static xgen.grammar.util.GrammarConstructor.multiplicityUnbound;
import static xgen.grammar.util.GrammarConstructor.not;
import static xgen.grammar.util.GrammarConstructor.placeholder;
import static xgen.grammar.util.GrammarConstructor.range;
import static xgen.grammar.util.GrammarConstructor.reference;
import static xgen.grammar.util.GrammarConstructor.sequence;
import static xgen.grammar.util.GrammarConstructor.until;

import java.util.NoSuchElementException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CharacterRange;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.NegatedToken;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UntilToken;
import org.eclipse.xtext.Wildcard;
import org.eclipse.xtext.util.XtextSwitch;

import xgen.grammar.Alternative;
import xgen.grammar.Construct;
import xgen.grammar.Definition;
import xgen.grammar.GrammarFactory;
import xgen.grammar.Sequence;

public class GrammarConverter
{
	/**
	 * Converts the given XText grammar with its used and extended grammars
	 * 
	 * @param xText
	 *            The grammar to convert
	 * @return Returns an XGen grammar
	 */
	public static xgen.grammar.Grammar fromXText(Grammar xText)
	{
		// Convert the main grammar
		xgen.grammar.Grammar it = fromSingleXText(xText);

		// If the main grammar does not extend any other grammar, return the
		// result
		if (xText.getUsedGrammars().isEmpty())
			return it;

		// Convert the first used grammar
		xgen.grammar.Grammar extend = fromSingleXText(xText.getUsedGrammars().get(0));

		// Merge all remaining as converted grammars
		for (int i = 1; i < xText.getUsedGrammars().size(); i++)
			extend = GrammarUtil.overrideWith(extend, fromSingleXText(xText.getUsedGrammars().get(i)));

		// Override the extended with the result
		it = GrammarUtil.overrideWith(extend, it);

		// Return the result
		return it;
	}

	public static xgen.grammar.Grammar fromSingleXText(Grammar xText)
	{
		xgen.grammar.Grammar g = GrammarFactory.eINSTANCE.createGrammar();

		for (AbstractRule r : xText.getRules())
		{
			// Make a result definition
			Definition d;

			// Convert the rule accordingly
			if (r instanceof EnumRule)
				d = fromSingleRule(true, r);
			else if (r instanceof ParserRule)
				d = fromSingleRule(false, r);
			else if (r instanceof TerminalRule)
				d = fromSingleRule(true, r);
			else
				throw new IllegalArgumentException("The input grammar contains a rule that cannot be converted");

			// Add the converted definition
			g.getDefinitions().add(d);
		}

		return g;
	}

	public static Definition fromSingleRule(boolean lexical, AbstractRule rule)
	{
		return definition(rule.getName(), lexical, fromSingleElement(rule.getAlternatives()));
	}

	public static Construct fromSingleElement(AbstractElement e)
	{
		// Make inner element from XText
		Construct inner = new XtextSwitch<Construct>()
		{
			@Override
			public Construct caseNegatedToken(NegatedToken object)
			{
				return not(fromSingleElement(object.getTerminal()));
			}

			@Override
			public Construct caseUntilToken(UntilToken object)
			{
				return until(fromSingleElement(object.getTerminal()));
			}

			@Override
			public Construct caseAssignment(Assignment object)
			{
				return fromSingleElement(object.getTerminal());
			}

			@Override
			public Construct caseCharacterRange(CharacterRange object)
			{
				String min = object.getLeft().getValue();
				String max = object.getRight().getValue();

				if (min == null || min.length() != 1)
					throw new IllegalArgumentException("left");
				if (max == null || max.length() != 1)
					throw new IllegalArgumentException("right");

				return range(min.charAt(0), max.charAt(0));
			}

			@Override
			public Construct caseAlternatives(Alternatives object)
			{
				Alternative r = alternative();

				for (AbstractElement a : object.getElements())
					r.getOperands().add(fromSingleElement(a));

				return r;
			}

			@Override
			public Construct caseGroup(Group object)
			{
				Sequence r = sequence();

				for (AbstractElement a : object.getElements())
					r.getOperands().add(fromSingleElement(a));

				return r;
			}

			@Override
			public Construct caseEnumLiteralDeclaration(EnumLiteralDeclaration object)
			{
				return keyword(object.getLiteral().getValue());
			}

			@Override
			public Construct caseCrossReference(CrossReference object)
			{
				return fromSingleElement(object.getTerminal());
			}

			@Override
			public Construct caseKeyword(Keyword object)
			{
				return keyword(object.getValue());
			}

			@Override
			public Construct caseRuleCall(RuleCall object)
			{

				return reference(object.getRule().getName());
			}

			@Override
			public Construct caseWildcard(Wildcard object)
			{
				return any();
			}

			@Override
			public Construct defaultCase(EObject object)
			{
				return placeholder(object);
			}
		}.doSwitch(e);

		// If no cardinality is specified, return it as is
		if (e.getCardinality() == null)
			return inner;

		// Else switch on cardinality and apply the correct modificator
		switch (e.getCardinality())
		{
		case "?":
			return multiplicityBound(inner, 0, 1);
		case "+":
			return multiplicityUnbound(inner, 1);
		case "*":
			return multiplicityUnbound(inner, 0);
		default:
			throw new NoSuchElementException("Cannot convert the given multiplicity");
		}
	}
}
