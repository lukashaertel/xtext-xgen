package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Node;

public abstract class AbstractProcessorOneToOne extends AbstractProcessor
{
	protected abstract Node calculate(Node n);

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
