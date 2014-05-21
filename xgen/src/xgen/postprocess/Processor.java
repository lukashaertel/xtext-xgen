package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Node;

public abstract class Processor
{
	/**
	 * Called before an index is processed
	 */
	protected void resetAll()
	{

	}

	/**
	 * Called before one item of an index is processed
	 */
	protected void resetOne()
	{

	}

	public abstract Index<Node> postProcess(Index<Node> ns);

	public static Processor compose(Processor... processors)
	{
		return new Processor()
		{
			@Override
			public Index<Node> postProcess(Index<Node> ns)
			{
				for (Processor p : processors)
					ns = p.postProcess(ns);

				return ns;
			}
		};
	}
}
