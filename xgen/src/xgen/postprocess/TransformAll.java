package xgen.postprocess;

import xgen.parsetree.Leaf;
import xgen.parsetree.Node;

/**
 * Applies a transformation to all leafs in the input parse tree
 * 
 * @author Lukas Härtel
 *
 */
public abstract class TransformAll extends ProcessorOneToOne
{
	/**
	 * Transforms a leaf
	 * 
	 * @param leaf
	 *            The input leaf
	 * @return Returns the transformed leaf
	 */
	protected abstract Leaf transform(Leaf leaf);

	@Override
	protected Node calculate(Node n)
	{
		return n.transformLeaf(true, this::transform);
	}
}
