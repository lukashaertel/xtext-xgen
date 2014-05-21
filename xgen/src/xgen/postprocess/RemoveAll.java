package xgen.postprocess;

import java.util.List;

import xgen.parsetree.Container;
import xgen.parsetree.Leaf;
import xgen.parsetree.Node;

import com.google.common.collect.Lists;

public abstract class RemoveAll extends AbstractProcessorOneToOne
{
	protected abstract boolean candidate(Leaf leaf);

	private Node[] removeCandidates(Node[] n)
	{
		// First search for one node of type leaf
		boolean l = false;
		for (int i = 0; i < n.length && !l; i++)
			if (n[i] instanceof Leaf)
				l = true;

		// If no node is a leaf, return input unchanged
		if (!l)
			return n;

		// Else remove all nodes satisfying the candidate function
		List<Node> r = Lists.newArrayList();
		for (int i = 0; i < n.length; i++)
			if (n[i] instanceof Leaf && !candidate((Leaf) n[i]))
				r.add(n[i]);

		// Return as array
		return r.toArray(new Node[r.size()]);
	}

	@Override
	protected Node calculate(Node n)
	{
		return n.transformContainer(true, x -> new Container(x.label, removeCandidates(x.children)));
	}

}
