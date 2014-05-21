package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Node;

/**
 * Processes input indices mapping one input node to one node
 * 
 * @author Lukas Härtel
 *
 */
public abstract class ProcessorOneToOne extends Processor
{
	/**
	 * Transforms one node into exactly one output node
	 * 
	 * @param n
	 *            The node to transform
	 * @return Returns the transformed node
	 */
	protected abstract Node calculate(Node n);

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
			// Process index at least once
			r = ns.mapPresent(n -> {
				resetOne();
				return calculate(n);
			});

		// Try to feed back
		while (feedBack(r));

		return r;
	}

}
