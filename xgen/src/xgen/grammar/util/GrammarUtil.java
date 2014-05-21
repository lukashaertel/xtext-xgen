package xgen.grammar.util;

import org.eclipse.emf.ecore.EObject;

import xgen.grammar.Construct;
import xgen.grammar.Definition;
import xgen.grammar.GrammarPackage;

public class GrammarUtil
{
	public static Definition getDefinition(Construct c)
	{
		if (c == null)
			return null;

		EObject n = c.eContainer();

		while (n != null && GrammarPackage.Literals.DEFINITION != n.eClass())
			n = n.eContainer();

		return (Definition) n;
	}

}
