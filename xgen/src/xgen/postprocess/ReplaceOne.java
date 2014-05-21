package xgen.postprocess;

import java.util.List;

import xgen.index.Index;
import xgen.parsetree.Leaf;
import xgen.parsetree.Node;

import com.google.common.collect.Lists;

public abstract class ReplaceOne extends AbstractProcessorOneToMany
{
	protected abstract boolean candidate(Leaf leaf);

	protected abstract Leaf replace(Leaf leaf);

	@Override
	protected Index<Node> calculate(Node n)
	{
		// Make list of all leafs in the parse-tree
		List<Leaf> leafs = Lists.newArrayList();

		n.visit(x -> {
			if (x instanceof Leaf)
				leafs.add((Leaf) x);
		});

		// Remove all leafs that are not candidates of the replacement
		leafs.removeIf(l -> !candidate(l));

		// Return the input if no candidate found
		if (leafs.isEmpty())
			return Index.items(n);

		// Replace each leaf in the target parse-tree
		return Index.items(leafs).mapPresent(l1 -> {
			return n.transformLeaf(true, l2 -> l1 == l2 ? replace(l1) : l2);
		});
	}
}
