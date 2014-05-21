package xgen.grammar.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

import xgen.grammar.Alternative;
import xgen.grammar.Any;
import xgen.grammar.Construct;
import xgen.grammar.Definition;
import xgen.grammar.Element;
import xgen.grammar.Grammar;
import xgen.grammar.GrammarFactory;
import xgen.grammar.GrammarPackage;
import xgen.grammar.Keyword;
import xgen.grammar.Multiplicity;
import xgen.grammar.Not;
import xgen.grammar.Range;
import xgen.grammar.Reference;
import xgen.grammar.Sequence;
import xgen.grammar.Until;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import static xgen.grammar.util.GrammarConstructor.*;

public class GrammarUtil
{
	/**
	 * Maps from a construct to it's containing definition
	 * 
	 * @param c
	 *            The input construct
	 * @return Returns the definition containing the construct or null if not in
	 *         definition, i.e. inconsistent grammar model
	 */
	public static Definition getDefinition(Construct c)
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

	public static Definition cloneUnresolved(Definition d, Multimap<String, Reference> unresolved)
	{
		return definition(d.getName(), d.isLexical(), new GrammarSwitch<Construct>()
		{
			@Override
			public Construct caseAlternative(Alternative object)
			{
				Alternative r = alternative();
				for (Construct c : object.getOperands())
					r.getOperands().add(doSwitch(c));

				return r;
			}

			@Override
			public Construct caseAny(Any object)
			{
				return any();
			}

			@Override
			public Construct caseKeyword(Keyword object)
			{
				return keyword(object.getValue());
			}

			@Override
			public Construct caseMultiplicity(Multiplicity object)
			{
				return multiplicity(doSwitch(object.getOperand()), object.getMin(), object.isUpperBounded(), object.getMax());
			}

			@Override
			public Construct caseNot(Not object)
			{
				return not(doSwitch(object.getOperand()));
			}

			@Override
			public Construct caseRange(Range object)
			{
				return range(object.getMin(), object.getMax());
			}

			@Override
			public Construct caseReference(Reference object)
			{
				Reference r = incompleteReference();

				unresolved.put(object.getTarget().getName(), r);

				return r;
			}

			@Override
			public Construct caseSequence(Sequence object)
			{
				Sequence r = sequence();
				for (Construct c : object.getOperands())
					r.getOperands().add(doSwitch(c));

				return r;
			}

			@Override
			public Construct caseUntil(Until object)
			{
				return until(doSwitch(object.getOperand()));
			}
		}.doSwitch(d.getRhs()));
	}

	/**
	 * Resolve the unresolved system of references in the given grammar
	 * 
	 * @param grammar
	 *            The resolving grammar
	 * @param unresolved
	 *            The unresolved references
	 */
	public static void resolve(Grammar grammar, Multimap<String, Reference> unresolved)
	{
		// Make resolved map
		Map<String, Definition> resolver = Maps.newHashMap();

		// For all unresolved references
		for (Entry<String, Reference> u : unresolved.entries())
		{
			// Go over all definitions in the effective grammar and check if
			// it has the same name, then use it as target
			Definition p = resolver.computeIfAbsent(u.getKey(), n -> {

				for (Definition d : grammar.getDefinitions())
					if (n.equals(d.getName()))
						return d;
				return null;
			});

			// If none found continue to next
			if (p == null)
				continue;

			// If found remove from map
			unresolved.remove(u.getKey(), u.getValue());

			// Assign definition
			u.getValue().setTarget(p);
		}
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

		// Make the map of unresolved references
		Multimap<String, Reference> unresolved = HashMultimap.create();

		// Make the set of defined rules
		Set<String> defined = Sets.newHashSet();

		// Go over overidees definitions
		for (Definition d : b.getDefinitions())
		{
			// Add an unresolved copy of the definition
			r.getDefinitions().add(cloneUnresolved(d, unresolved));

			// Mark as defined
			defined.add(d.getName());
		}

		// Go over all rules of the overridden and add if not already defined
		for (Definition d : a.getDefinitions())
			if (!defined.contains(d.getName()))
				r.getDefinitions().add(cloneUnresolved(d, unresolved));

		// Resolve system
		resolve(r, unresolved);

		// Return result
		return r;
	}
}
