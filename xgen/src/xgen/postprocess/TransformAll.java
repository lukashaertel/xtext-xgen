package xgen.postprocess;

import xgen.parsetree.Pair;
import xgen.parsetree.Leaf;
import xgen.parsetree.Node;
import xgen.util.Item;

/**
 * Applies a transformation to all leafs in the input parse tree
 * 
 * @author Lukas Härtel
 *
 */
public abstract class TransformAll<UIn, Carrier, UOut> extends OneToOnePostProcessor<UIn, UOut>
{

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
	protected Pair<UOut, Node> calculate(Pair<UIn, Node> n)
	{
		Item<Carrier> carrier = new Item<>();
		carrier.item = supplyCarrier(n.a);

		Node m = n.b.transformLeaf(true, c -> {
			Pair<Carrier, Leaf> v = build(new Pair<>(carrier.item, c));

			carrier.item = v.a;

			return v.b;
		});

		return new Pair<>(finalizeCarrier(carrier.item), m);

	}
}
