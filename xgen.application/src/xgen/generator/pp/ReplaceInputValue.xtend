package xgen.generator.pp

import xgen.parsetree.Leaf
import xgen.parsetree.Pair
import xgen.postprocess.TransformAll

class ReplaceInputValue extends TransformAll<Object, Integer, Object> {

	override protected finalizeCarrier(Integer c) {
		c
	}

	override protected supplyCarrier(Object s) {
		0
	}

	override protected transformOneLeaf(Pair<Integer, Leaf> p) {
		if (p.b.value != "<input value>")
			return p

		return Pair.create(
			p.a + 1,
			new Leaf(p.b.label, "Input" + p.a)
		)
	}
}
