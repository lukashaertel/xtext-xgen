package xgen.grammar.util;

import java.util.Arrays;
import java.util.Collection;

import xgen.grammar.Alternative;
import xgen.grammar.Any;
import xgen.grammar.Construct;
import xgen.grammar.Definition;
import xgen.grammar.Grammar;
import xgen.grammar.GrammarFactory;
import xgen.grammar.Keyword;
import xgen.grammar.Multiplicity;
import xgen.grammar.Not;
import xgen.grammar.Placeholder;
import xgen.grammar.Range;
import xgen.grammar.Reference;
import xgen.grammar.Sequence;
import xgen.grammar.Until;

public class GrammarConstructor
{
	public static Grammar grammar(Iterable<Definition> definitions)
	{

		Grammar g = GrammarFactory.eINSTANCE.createGrammar();

		for (Definition d : definitions)
			g.getDefinitions().add(d);

		return g;
	}

	public static Grammar grammar(Definition... definitions)
	{
		return grammar(Arrays.asList(definitions));
	}

	public static Definition definition(String name, boolean lexical, Construct rhs)
	{
		Definition d = GrammarFactory.eINSTANCE.createDefinition();

		d.setName(name);
		d.setLexical(lexical);
		d.setRhs(rhs);

		return d;
	}

	public static Any any()
	{
		return GrammarFactory.eINSTANCE.createAny();
	}

	public static Keyword keyword(String value)
	{
		Keyword k = GrammarFactory.eINSTANCE.createKeyword();

		k.setValue(value);

		return k;
	}

	public static Range range(char min, char max)
	{
		Range r = GrammarFactory.eINSTANCE.createRange();

		r.setMin(min);
		r.setMax(max);

		return r;
	}

	public static Reference reference(String target)
	{
		Reference r = GrammarFactory.eINSTANCE.createReference();

		r.setTarget(target);

		return r;
	}

	public static Alternative alternative(Collection<Construct> constructs)
	{
		Alternative a = GrammarFactory.eINSTANCE.createAlternative();

		a.getOperands().addAll(constructs);

		return a;
	}

	public static Alternative alternative(Iterable<Construct> constructs)
	{
		Alternative a = GrammarFactory.eINSTANCE.createAlternative();

		for (Construct c : constructs)
			a.getOperands().add(c);

		return a;
	}

	public static Alternative alternative(Construct... constructs)
	{
		return alternative(Arrays.asList(constructs));
	}

	public static Sequence sequence(Collection<Construct> constructs)
	{
		Sequence s = GrammarFactory.eINSTANCE.createSequence();

		s.getOperands().addAll(constructs);

		return s;
	}

	public static Sequence sequence(Iterable<Construct> constructs)
	{
		Sequence s = GrammarFactory.eINSTANCE.createSequence();

		for (Construct c : constructs)
			s.getOperands().add(c);

		return s;
	}

	public static Sequence sequence(Construct... constructs)
	{
		return sequence(Arrays.asList(constructs));
	}

	public static Not not(Construct operand)
	{
		Not n = GrammarFactory.eINSTANCE.createNot();

		n.setOperand(operand);

		return n;
	}

	public static Until until(Construct operand)
	{
		Until n = GrammarFactory.eINSTANCE.createUntil();

		n.setOperand(operand);

		return n;
	}

	public static Multiplicity multiplicityUnbound(Construct operand, int min)
	{
		Multiplicity m = GrammarFactory.eINSTANCE.createMultiplicity();

		m.setOperand(operand);
		m.setMin(min);
		m.setUpperBounded(false);
		m.setMax(-1);

		return m;
	}

	public static Multiplicity multiplicityBound(Construct operand, int min, int max)
	{
		Multiplicity m = GrammarFactory.eINSTANCE.createMultiplicity();

		m.setOperand(operand);
		m.setMin(min);
		m.setUpperBounded(true);
		m.setMax(max);

		return m;
	}

	public static Multiplicity multiplicity(Construct operand, int min, boolean upperBounded, int max)
	{
		Multiplicity m = GrammarFactory.eINSTANCE.createMultiplicity();

		m.setOperand(operand);
		m.setMin(min);
		m.setUpperBounded(upperBounded);
		m.setMax(max);

		return m;
	}

	public static Placeholder placeholder(Object source)
	{
		Placeholder p = GrammarFactory.eINSTANCE.createPlaceholder();
		p.setSource(source);
		return p;
	}
}
