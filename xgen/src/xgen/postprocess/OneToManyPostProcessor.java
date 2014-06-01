package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Node;
import xgen.parsetree.Pair;

/**
 * Processes input indices mapping one input node to less or more output nodes
 * 
 * @author Lukas Härtel
 *
 */
public abstract class OneToManyPostProcessor<UIn, UOut> extends PostProcessor<UIn, UOut>
{
	/**
	 * Transforms one node into less or more output nodes
	 * 
	 * @param n
	 *            The node to transform
	 * @return Returns a new index
	 */
	protected abstract Index<Pair<UOut, Node>> calculate(Pair<UIn, Node> n);

	@Override
	public Index<Pair<UOut, Node>> postProcess(Index<Pair<UIn, Node>> ns)
	{
		return Index.flatten(ns.mapPresent(this::calculate).asCompact());
	}

}
