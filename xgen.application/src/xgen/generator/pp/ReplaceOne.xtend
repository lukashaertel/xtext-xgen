package xgen.generator.pp

import java.util.Map
import xgen.parsetree.Leaf
import xgen.parsetree.Pair
import xgen.postprocess.ForEachBranch

class ReplaceOne extends ForEachBranch<Object, Object, Object> {

	val Map<String, String> leafNamesAndReplacement

	new(Map<String, String> leafNamesAndReplacement) {
		this.leafNamesAndReplacement = leafNamesAndReplacement
	}

	new(org.eclipse.xtext.xbase.lib.Pair<String, String>... leafNamesAndReplacement) {
		this(newHashMap(leafNamesAndReplacement))
	}

	override protected match(Leaf leaf) {
		leafNamesAndReplacement.containsKey(leaf.value)
	}

	override protected build(Pair<Object, Leaf> p) {
		p.mapB[new Leaf(label, leafNamesAndReplacement.get(value))]
	}

	override protected finalizeCarrier(Object carry) {
		carry
	}

	override protected supplyCarrier(Object state) {
		state
	}
}
