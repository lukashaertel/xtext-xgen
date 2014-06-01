package xgen.postprocess;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

import xgen.index.Index;
import xgen.parsetree.Pair;
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
public abstract class ForEachBranch<UIn, Carrier, UOut> extends OneToManyPostProcessor<UIn, UOut>
{
	/**
	 * Checks if the leaf is selectable
	 * 
	 * @param leaf
	 *            The leaf to test
	 * @return Returns true if leaf is a candidate
	 */
	protected abstract boolean match(Leaf leaf);

	/**
	 * Transforms a leaf
	 * 
	 * @param leaf
	 *            The input leaf
	 * @return Returns the transformed leaf
	 */
	protected abstract Pair<Carrier, Leaf> build(Pair<Carrier, Leaf> p);

	protected abstract Carrier supplyCarrier(UIn s);

	protected abstract UOut finalizeCarrier(Carrier c);

	@Override
	protected Index<Pair<UOut, Node>> calculate(Pair<UIn, Node> n)
	{
		Set<Leaf> leafs = Sets.newIdentityHashSet();

		n.b.visit(x -> {
			if (x instanceof Leaf && match((Leaf) x))
				leafs.add((Leaf) x);
		});

		if (leafs.isEmpty())
			return Index.items(new Pair<>(finalizeCarrier(supplyCarrier(n.a)), n.b));

		return Index.from(leafs).mapPresent(l -> {
			AtomicReference<Carrier> carrier = new AtomicReference<>(supplyCarrier(n.a));

			Node m = n.b.transformLeaf(true, c -> {
				if (l != c)
					return c;

				Pair<Carrier, Leaf> v = build(new Pair<>(carrier.get(), c));

				carrier.set(v.a);

				return v.b;
			});

			return new Pair<>(finalizeCarrier(carrier.get()), m);
		});
	}
}
