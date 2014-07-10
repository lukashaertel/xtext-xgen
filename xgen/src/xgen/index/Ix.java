package xgen.index;

import xgen.parsetree.Node;

public interface Ix {
	long length();

	Node apply(long position);
}
