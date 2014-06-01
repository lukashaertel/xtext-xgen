package xgen.generator.pp

import xgen.parsetree.Leaf
import xgen.parsetree.Pair
import xgen.postprocess.TransformAll

class ReplaceActionValue extends TransformAll<Object, Integer, Object> {

	override protected finalizeCarrier(Integer c) {
		c
	}

	override protected supplyCarrier(Object s) {
		0
	}

	override protected transformOneLeaf(Pair<Integer, Leaf> p) {
		if (p.b.value != "<action value>")
			return p

		return Pair.create(
			p.a + 1,
			new Leaf(p.b.label, "Action" + p.a)
		)
	}
}