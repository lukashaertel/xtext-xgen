package xgen.grammar;

import java.util.Arrays;
import java.util.Collection;

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

	public static Definition definition(String lhs, Construct rhs)
	{
		Definition d = GrammarFactory.eINSTANCE.createDefinition();

		d.setLhs(lhs);
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

	public static Reference reference(Definition target)
	{
		Reference r = GrammarFactory.eINSTANCE.createReference();

		r.setTarget(target);

		return r;
	}

	public static Reference incompleteReference()
	{
		Reference r = GrammarFactory.eINSTANCE.createReference();

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

	public static Multiplicity multiplicity(Construct operand, int min, boolean upperBounded, int max)
	{
		Multiplicity m = GrammarFactory.eINSTANCE.createMultiplicity();

		m.setOperand(operand);
		m.setMin(min);
		m.setUpperBounded(upperBounded);
		m.setMax(max);

		return m;
	}
}
