package xgen.grammar.util;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import xgen.grammar.Construct;
import xgen.grammar.Definition;
import xgen.grammar.Element;
import xgen.grammar.Grammar;
import xgen.grammar.GrammarFactory;
import xgen.grammar.GrammarPackage;
import xgen.grammar.Keyword;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;

public class GrammarUtil
{
	public static Definition getDefinition(Grammar grammar, String name)
	{
		for (Definition d : grammar.getDefinitions())
			if (Objects.equal(name, d.getName()))
				return d;

		return null;
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
