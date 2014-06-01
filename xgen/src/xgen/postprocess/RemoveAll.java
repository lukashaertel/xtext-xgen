package xgen.postprocess;

import java.util.List;

import xgen.parsetree.Pair;
import xgen.parsetree.Container;
import xgen.parsetree.Leaf;
import xgen.parsetree.Node;

import com.google.common.collect.Lists;

/**
 * Removes all leafs in the input node that satisfy a condition
 * 
 * @author Lukas Härtel
 *
 */
public abstract class RemoveAll<UIn, UOut> extends OneToOnePostProcessor<UIn, UOut>
{
	/**
	 * Checks if the leaf is to be removed
	 * 
	 * @param leaf
	 *            The leaf to test
	 * @return Returns true if leaf must be removed
	 */
	protected abstract boolean match(Leaf leaf);

	/**
	 * Utility that removes all candidates
	 * 
	 * @param n
	 *            The array of nodes to be narrowed
	 * @return Returns a new array if any of the children must be removed
	 */
	private Node[] removeCandidates(Node[] n)
	{
		// First search for one node of type leaf
		boolean l = false;
		for (int i = 0; i < n.length && !l; i++)
			if (n[i] instanceof Leaf && match((Leaf) n[i]))
				l = true;

		// If no node is a leaf, return input unchanged
		if (!l)
			return n;

		// Else remove all nodes satisfying the candidate function
		List<Node> r = Lists.newArrayList();
		for (int i = 0; i < n.length; i++)
			if (n[i] instanceof Container || n[i] instanceof Leaf && !match((Leaf) n[i]))
				r.add(n[i]);

		// Return as array
		return r.toArray(new Node[r.size()]);
	}

	protected abstract Pair<UOut, Node> transformState(Pair<UIn, Node> n);

	@Override
	protected Pair<UOut, Node> calculate(Pair<UIn, Node> n)
	{
		return transformState(n.mapB(x -> x.transformContainer(true, c -> new Container(c.label, removeCandidates(c.children)))));
	}
}
