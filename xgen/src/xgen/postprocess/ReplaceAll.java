package xgen.postprocess;

import java.util.Set;

import xgen.parsetree.Leaf;
import xgen.parsetree.Node;

import com.google.common.collect.Sets;

public abstract class ReplaceAll extends AbstractProcessorOneToOne
{
	protected abstract boolean candidate(Leaf leaf);

	protected abstract Leaf replace(Leaf leaf);

	@Override
	protected Node calculate(Node n)
	{
		// Make set of all leafs in the parse-tree
		Set<Leaf> leafs = Sets.newIdentityHashSet();

		n.visit(x -> {
			if (x instanceof Leaf)
				leafs.add((Leaf) x);
		});

		// Remove all leafs that are not candidates of the replacement
		leafs.removeIf(l -> !candidate(l));

		// Return the input if no candidate found
		if (leafs.isEmpty())
			return n;

		return n.transformLeaf(true, l -> leafs.contains(l) ? replace(l) : l);
	}
}
