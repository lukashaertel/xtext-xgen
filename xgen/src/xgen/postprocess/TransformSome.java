package xgen.postprocess;

import java.util.Set;

import xgen.index.Index;
import xgen.parsetree.Leaf;
import xgen.parsetree.Node;

import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;

/**
 * For the power set of every selected leaf in a parse-tree that satisfies an
 * amount limit, a new parse-tree is returned with these leafs transformed
 * 
 * @author Lukas Härtel
 *
 */
public abstract class TransformSome extends ProcessorOneToMany
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

	/**
	 * Checks if the amount of selected items is valid
	 * 
	 * @param n
	 *            The number of leafs selected
	 * @return Returns true if amount is valid
	 */
	protected boolean selectAmount(int n)
	{
		return true;
	}

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

		// Make power-set of selectable leafs
		Set<Set<Leaf>> leafsPower = Sets.powerSet(leafs);

		// Replace each leaf in the target parse-tree
		return Index.items(Collections2.filter(leafsPower, ls -> selectAmount(ls.size()))).mapPresent(ls -> n.transformLeaf(true, c -> ls.contains(c) ? transform(c) : c));
	}
}
