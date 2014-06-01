package xgen.generator.pp

import xgen.parsetree.Leaf
import xgen.parsetree.Node
import xgen.parsetree.Pair
import xgen.postprocess.RemoveAll

class RemoveRemainingInitials extends RemoveAll<Object, Object> {

	override protected match(Leaf leaf) {
		leaf.value == "<initial>"
	}

	override protected transformState(Pair<Object, Node> n) {
		n
	}
}

