package xgen.postprocess;

import java.util.List;
import java.util.Set;

import xgen.index.Index;
import xgen.parsetree.Leaf;
import xgen.parsetree.Node;

import com.google.common.collect.Sets;

/**
 * For every selected leaf in a parse-tree a new parse-tree is returned with
 * this leaf transformed
 * 
 * @author Lukas Härtel
 *
 */
public abstract class TransformOne extends ProcessorOneToMany
{
	/**
	 * Checks if the leaf is selectable
	 * 
	 * @param leaf
	 *            The leaf to test
	 * @return Returns true if leaf is a candidate
	 */
	protected abstract boolean select(Leaf leaf);

	/**
	 * Transforms a leaf
	 * 
	 * @param leaf
	 *            The input leaf
	 * @return Returns the transformed leaf
	 */
	protected abstract Leaf transform(Leaf leaf);

	@Override
	protected Index<Node> calculate(Node n)
	{
		Set<Leaf> leafs = Sets.newIdentityHashSet();

		n.visit(x -> {
			if (x instanceof Leaf)
				leafs.add((Leaf) x);
		});

		// Remove all leafs that are not candidates of the replacement
		leafs.removeIf(l -> !select(l));

		// Return the input if no candidate found
		if (leafs.isEmpty())
			return Index.items(n);

		// Replace each leaf in the target parse-tree
		return Index.items(leafs).mapPresent(l -> n.transformLeaf(true, c -> l == c ? transform(c) : c));
	}
}
