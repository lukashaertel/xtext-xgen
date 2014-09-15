package xgen.generator.pp

import xgen.parsetree.Leaf
import java.util.Set
import java.util.Collection

class AssignRandomToLeaf extends AssignRandom<Set<String>> {
	val Collection<String> leafNames

	new(Collection<String> leafNames, Set<String> sel) {
		super(sel)
		this.leafNames = leafNames
	}

	override hasQuality(Leaf it) {
		return leafNames.contains(value)
	}

	override protected finalizeCarrier(Set<String> c) {
		return c
	}

}
