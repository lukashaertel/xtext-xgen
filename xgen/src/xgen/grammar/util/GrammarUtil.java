package xgen.grammar.util;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import xgen.grammar.Construct;
import xgen.grammar.Definition;
import xgen.grammar.Element;
import xgen.grammar.Grammar;
import xgen.grammar.GrammarFactory;
import xgen.grammar.GrammarPackage;
import xgen.grammar.Keyword;
import xgen.grammar.Multiplicity;
import xgen.grammar.NAry;
import xgen.grammar.Prefix;
import xgen.grammar.Terminal;
import xgen.grammar.Unary;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;

public class GrammarUtil
{
	public static Optional<Definition> getDefinition(Grammar grammar, String name)
	{
		for (Definition d : grammar.getDefinitions())
			if (Objects.equal(name, d.getName()))
				return Optional.of(d);

		return Optional.empty();
	}

	public static Construct selectTransform(Construct c, Predicate<Construct> s, Function<Construct, Construct> t, boolean slotted, int... positions)
	{
		// Make positionset for quick testing
		Set<Integer> is = Sets.newHashSet();

		// Add all positions, for java primitive types sake
		for (int p : positions)
			is.add(p);

		int[] a = { 0 };

		return new GrammarSwitch<Construct>()
		{
			private Optional<Construct> tryTransform(Construct object)
			{
				if (s.test(object))
				{
					int p = a[0]++;

					if (!slotted || is.contains(p))
						return Optional.of(t.apply(object));
				}

				return Optional.empty();
			}

			@Override
			public Construct caseUnary(Unary object)
			{
				// Copy input
				Unary x = EcoreUtil.copy(object);

				// Try to transform concept in whole
				Optional<Construct> r = tryTransform(x);

				// If successfull, return it
				if (r.isPresent())
					return r.get();

				// Else go inside
				x.setOperand(doSwitch(x.getOperand()));

				return x;
			}

			@Override
			public Construct caseNAry(NAry object)
			{
				// Copy input
				NAry x = EcoreUtil.copy(object);

				// Try to transform concept in whole
				Optional<Construct> r = tryTransform(x);

				// If successfull, return it
				if (r.isPresent())
					return r.get();

				// Else go inside
				for (int i = 0; i < x.getOperands().size(); i++)
					x.getOperands().set(i, doSwitch(x.getOperands().get(i)));

				return x;
			}

			public Construct caseTerminal(Terminal object)
			{
				// Delegates to default case if transformation not successfull
				return tryTransform(object).orElse(null);
			}

			@Override
			public Construct defaultCase(EObject object)
			{
				if (object instanceof Construct)
					return (Construct) EcoreUtil.copy(object);

				throw new UnsupportedOperationException();
			}
		}.doSwitch(c);
	}

	public static Construct adjustMultiplicity(Construct c, Function<Multiplicity, Multiplicity> t, boolean slotted, int... positions)
	{
		// Make positionset for quick testing
		Set<Integer> is = Sets.newHashSet();

		// Add all positions, for java primitive types sake
		for (int p : positions)
			is.add(p);

		int[] a = { 0 };

		return new GrammarSwitch<Construct>()
		{
			@Override
			public Construct caseUnary(Unary object)
			{
				Unary c = EcoreUtil.copy(object);

				c.setOperand(doSwitch(c.getOperand()));

				return c;
			}

			@Override
			public Construct caseNAry(NAry object)
			{
				NAry c = EcoreUtil.copy(object);

				for (int i = 0; i < c.getOperands().size(); i++)
					c.getOperands().set(i, doSwitch(c.getOperands().get(i)));

				return c;
			}

			public Construct caseMultiplicity(Multiplicity object)
			{
				int p = a[0]++;

				if (!slotted || is.contains(p))
					return t.apply(object);

				// Delegates to default case
				return null;
			}

			@Override
			public Construct defaultCase(EObject object)
			{
				if (object instanceof Construct)
					return (Construct) EcoreUtil.copy(object);

				throw new UnsupportedOperationException();
			}
		}.doSwitch(c);
	}

	/**
	 * Maps from a construct to it's containing definition
	 * 
	 * @param c
	 *            The input construct
	 * @return Returns the definition containing the construct or null if not in
	 *         definition, i.e. inconsistent grammar model
	 */
	public static Definition inDefinition(Construct c)
	{
		if (c == null)
			return null;

		EObject n = c.eContainer();

		while (n != null && GrammarPackage.Literals.DEFINITION != n.eClass())
			n = n.eContainer();

		return (Definition) n;
	}

	/**
	 * Gets all definitions and in-line lexical rules in the containing grammar
	 * model that are of higher precedence
	 * 
	 * @param definition
	 *            The source definition
	 * @return Returns a collection of elements
	 */
	public static Collection<Element> getLexicalHigherPrecedence(Definition definition)
	{
		Grammar g = (Grammar) definition.eContainer();

		Set<Element> higher = Sets.newHashSet();

		// Add all lexical rules before the one in question
		for (Definition d : g.getDefinitions())
		{
			if (!d.isLexical())
				continue;

			if (d == definition)
				break;

			higher.add(d);
		}

		// Add all in-line lexical rules i.e. keywords from
		// non-lexical rules
		for (Definition d : g.getDefinitions())
		{
			if (d.isLexical())
				continue;

			d.eAllContents().forEachRemaining(e -> {
				if (e instanceof Keyword)
					higher.add((Keyword) e);
			});
		}

		return higher;
	}

	/**
	 * Overrides the definitions in a with the ones in b
	 * 
	 * @param a
	 *            The source grammar
	 * @param b
	 *            The grammar to override the source with
	 * @return Returns a new grammar
	 */
	public static Grammar overrideWith(Grammar a, Grammar b)
	{
		// Make the result
		Grammar r = GrammarFactory.eINSTANCE.createGrammar();

		// Make the set of defined rules
		Set<String> defined = Sets.newHashSet();

		// Go over overidees definitions
		for (Definition d : b.getDefinitions())
		{
			// Add a copy of the definition
			r.getDefinitions().add(EcoreUtil.copy(d));

			// Mark as defined
			defined.add(d.getName());
		}

		// Go over all rules of the overridden and add if not already defined
		for (Definition d : a.getDefinitions())
			if (!defined.contains(d.getName()))
				r.getDefinitions().add(EcoreUtil.copy(d));

		// Return result
		return r;
	}
}
