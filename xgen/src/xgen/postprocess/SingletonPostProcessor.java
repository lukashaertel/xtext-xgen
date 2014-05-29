package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Pair;
import xgen.parsetree.Node;

/**
 * Processes input indices mapping one input node to one node
 * 
 * @author Lukas Härtel
 *
 */
public abstract class SingletonPostProcessor<UIn, UOut> extends PostProcessor<UIn, UOut>
{
	/**
	 * Transforms one node into exactly one output node
	 * 
	 * @param n
	 *            The node to transform
	 * @return Returns the transformed node
	 */
	protected abstract Pair<UOut, Node> calculate(Pair<UIn, Node> n);

	@Override
	public Index<Pair<UOut, Node>> postProcess(Index<Pair<UIn, Node>> ns)
	{
		return ns.mapPresent(this::calculate);

	}

}
