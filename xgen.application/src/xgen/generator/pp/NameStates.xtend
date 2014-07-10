package xgen.generator.pp

import xgen.parsetree.Leaf
import java.util.Set

class NameStates extends AssignRandom<Set<String>> {
	val static ALL_NAMES = newHashSet(
		"Locked",
		"Compiled",
		"Turning",
		"Resolved",
		"Deprecated",
		"Unused",
		"Transformed",
		"Complete",
		"Distinct",
		"Restored",
		"Starting",
		"Disambiguated",
		"Missing",
		"Labeled",
		"Concise",
		"Drafted"
	)

	new() {
		super(ALL_NAMES)
	}

	override hasQuality(Leaf it) {
		return value == "<state name>"
	}
	
	override protected finalizeCarrier(Set<String> c) {
		return c
	}

}
