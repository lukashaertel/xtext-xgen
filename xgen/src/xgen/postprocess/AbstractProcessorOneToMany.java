package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Node;

public abstract class AbstractProcessorOneToMany extends AbstractProcessor
{
	protected abstract Index<Node> calculate(Node n);

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
			}).asCompact().iterator());

			// Try to feed back
		}
		while (feedBack(r));

		return r;
	}
}
