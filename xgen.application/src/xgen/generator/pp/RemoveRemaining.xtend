package xgen.generator.pp

import xgen.parsetree.Leaf
import xgen.parsetree.Node
import xgen.parsetree.Pair
import xgen.postprocess.RemoveAll
import java.util.Collection

class RemoveRemaining extends RemoveAll<Object, Object> {

	val Collection<String> leafNames

	new(Collection<String> leafNames) {
		this.leafNames = leafNames
	}

	override protected match(Leaf leaf) {
		leafNames.contains(leaf.value)
	}

	override protected transformState(Pair<Object, Node> n) {
		n
	}
}
