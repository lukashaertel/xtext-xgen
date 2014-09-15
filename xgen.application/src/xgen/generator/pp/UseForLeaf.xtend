package xgen.generator.pp

import java.util.ArrayList
import java.util.Collection
import java.util.Set
import xgen.parsetree.Leaf
import xgen.parsetree.Pair
import xgen.postprocess.TransformAll

import static xgen.generator.RU.rof

class UseForLeaf extends TransformAll<Set<String>, Set<String>, Set<String>> {

	override protected finalizeCarrier(Set<String> c) {
		c
	}

	override protected supplyCarrier(Set<String> s) {
		s
	}

	val Collection<String> leafNames

	new(Collection<String> leafNames) {
		this.leafNames = leafNames
	}

	override protected build(Pair<Set<String>, Leaf> p) {
		if(!leafNames.contains(p.b.value)) return p

		val cs = new ArrayList(p.a)
		val usn = rof(cs.size, cs)

		return Pair.create(
			p.a,
			new Leaf(p.b.label, usn)
		)
	}
}
