package xgen.grammar.util;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import xgen.grammar.Construct;
import xgen.grammar.Definition;
import xgen.grammar.Element;
import xgen.grammar.Grammar;
import xgen.grammar.GrammarPackage;
import xgen.grammar.Keyword;

import com.google.common.collect.Sets;

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

}
