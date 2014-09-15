package xgen.generator.pp

import xgen.postprocess.PostProcessor
import xgen.index.Index
import xgen.parsetree.Pair
import xgen.parsetree.Node

class DropState<U> extends PostProcessor<U, Object> {
	override postProcess(Index<Pair<U, Node>> ns) {
		// For all existing nodes, remove the state
		ns.mapPresent([p|p.mapA[null]])
	}

}
