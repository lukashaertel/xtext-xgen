package xgen.postprocess;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

import xgen.index.Index;
import xgen.parsetree.Pair;
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
public abstract class ForEachCombinationBranch<UIn, Carrier, UOut> extends BranchingPostProcessor<UIn, UOut>
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
	protected abstract Pair<Carrier, Leaf> transformOneLeaf(Pair<Carrier, Leaf> p);

	protected abstract Carrier supplyCarrier(UIn s);

	protected abstract UOut finalizeCarrier(Carrier c);

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
	protected Index<Pair<UOut, Node>> calculate(Pair<UIn, Node> n)
	{
		Set<Leaf> leafs = Sets.newIdentityHashSet();

		n.b.visit(x -> {
			if (x instanceof Leaf && select((Leaf) x))
				leafs.add((Leaf) x);
		});

		if (leafs.isEmpty())
			return Index.items(new Pair<>(finalizeCarrier(supplyCarrier(n.a)), n.b));

		// Make power-set of selectable leafs
		Set<Set<Leaf>> leafsPower = Sets.powerSet(leafs);

		return Index.from(leafsPower).mapPresent(ls -> {
			AtomicReference<Carrier> carrier = new AtomicReference<>(supplyCarrier(n.a));

			Node m = n.b.transformLeaf(true, c -> {
				if (!ls.contains(c))
					return c;

				Pair<Carrier, Leaf> v = transformOneLeaf(new Pair<>(carrier.get(), c));

				carrier.set(v.a);

				return v.b;
			});

			return new Pair<>(finalizeCarrier(carrier.get()), m);
		});
	}
}
