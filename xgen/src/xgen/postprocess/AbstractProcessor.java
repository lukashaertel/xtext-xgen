package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Node;

public abstract class AbstractProcessor extends Processor
{
	protected boolean feedBack(Index<Node> ns)
	{
		return false;
	}
}