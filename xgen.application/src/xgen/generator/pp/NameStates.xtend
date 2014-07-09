package xgen.generator.pp

import com.google.common.collect.Sets
import java.util.Collections
import java.util.Set
import xgen.parsetree.Leaf
import xgen.parsetree.Pair
import xgen.postprocess.TransformAll

class NameStates extends TransformAll<Object, Set<String>, Set<String>> {

	override protected finalizeCarrier(Set<String> c) {
		c
	}

	override protected supplyCarrier(Object s) {
		newHashSet
	}

	override protected build(Pair<Set<String>, Leaf> p) {
		if (p.b.value != "<state name>")
			return p

		val nsn = "State" + p.a.size

		return Pair.create(
			Sets.union(p.a, Collections.singleton(nsn)),
			new Leaf(p.b.label, nsn)
		)
	}
}

