package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Node;

/**
 * The processor processes an input index of nodes
 * 
 * @author Lukas Härtel
 *
 */
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

	/**
	 * Processes the input nodes and returns the transformed index
	 * 
	 * @param ns
	 *            The input
	 * @return Returns the result
	 */
	public abstract Index<Node> postProcess(Index<Node> ns);

	/**
	 * Composes the processors in sequence so that the first processor passed is
	 * the first processor applied to the input indices
	 * 
	 * @param processors
	 *            The list of processors
	 * @return Returns a new processor
	 */
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
