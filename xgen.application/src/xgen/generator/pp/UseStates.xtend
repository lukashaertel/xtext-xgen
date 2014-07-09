package xgen.generator.pp

import java.util.ArrayList
import java.util.Random
import java.util.Set
import xgen.parsetree.Leaf
import xgen.parsetree.Pair
import xgen.postprocess.TransformAll

class UseStates extends TransformAll<Set<String>, Set<String>, Set<String>> {

	override protected finalizeCarrier(Set<String> c) {
		c
	}

	override protected supplyCarrier(Set<String> s) {
		s
	}

	static val ran = new Random

	override protected build(Pair<Set<String>, Leaf> p) {
		if (p.b.value != "<state reference>")
			return p

		val cs = new ArrayList(p.a)
		val usn = cs.get(ran.nextInt(cs.size))

		return Pair.create(
			p.a,
			new Leaf(p.b.label, usn)
		)
	}
}