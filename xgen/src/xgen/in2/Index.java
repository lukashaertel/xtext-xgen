package xgen.in2;

import xgen.parsetree.Node;

public interface Index
{
	public long length();
	
	public Node apply(long position);
}
