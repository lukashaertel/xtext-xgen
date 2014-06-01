package xgen.generator.pp

import xgen.parsetree.Leaf
import xgen.parsetree.Pair
import xgen.postprocess.ForEachBranch

class ReplaceInitial extends ForEachBranch<Object, Object, Object> {

	override protected match(Leaf leaf) {
		leaf.value == "<initial>"
	}

	override protected finalizeCarrier(Object c) {
		c
	}

	/**
	 * s
	 */
	override protected supplyCarrier(Object s) {
		s
	}

	override protected build(Pair<Object, Leaf> p) {
		p.mapB[new Leaf(label, "initial")]
	}
}