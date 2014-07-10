package xgen.generator.pp

import xgen.parsetree.Leaf
import java.util.Set

class NameInputsAndActions extends AssignRandom<Object> {
	val static ALL_NAMES = newHashSet(
		"start",
		"retrieve",
		"finalize",
		"construct",
		"transform",
		"test",
		"reconcile",
		"analyze",
		"generate",
		"reset",
		"restart",
		"push",
		"pop",
		"poll",
		"activate",
		"internationalize",
		"bid",
		"bark",
		"cancel",
		"dequeue",
		"associate",
		"communicate",
		"listen",
		"subscribe",
		"navigate",
		"clone",
		"merge",
		"cast",
		"contradict",
		"personalize",
		"return"
	)
	
	new() {
		super(ALL_NAMES)
	}
	
	override hasQuality(Leaf it) {
		return value == "<input value>" || value == "<action value>"
	}
	
	override protected finalizeCarrier(Set<String> c) {
		return null
	}

}
