package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Node;

/**
 * Processes input indices mapping one input node to less or more output nodes
 * 
 * @author Lukas Härtel
 *
 */
public abstract class ProcessorOneToMany extends Processor
{
	/**
	 * Transforms one node into less or more output nodes
	 * 
	 * @param n
	 *            The node to transform
	 * @return Returns a new index
	 */
	protected abstract Index<Node> calculate(Node n);

	/**
	 * Checks if the index passed should be passed to this processor again
	 * 
	 * @param ns
	 *            The index to test
	 * @return Returns true if the input should be fed back
	 */
	protected boolean feedBack(Index<Node> ns)
	{
		return false;
	}

	@Override
	public Index<Node> postProcess(Index<Node> ns)
	{
		resetAll();

		// Make result index
		Index<Node> r;
		do
		{
			// Process index at least once
			r = Index.flatten(ns.mapPresent(n -> {
				resetOne();
				return calculate(n);
			}).asCompact());

			// Try to feed back
		}
		while (feedBack(r));

		return r;
	}

}
