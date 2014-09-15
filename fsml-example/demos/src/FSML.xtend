import static extension xgen.generator.pp.PPUtil.*

/**
 * Post processor for FSMLs
 */
class FSML implements FSMLConstants {

	/**
	 * The post processor, must be a static field named PP
	 */
	public static val PP = 
		// Replace one initial placeholder
		replaceOne('<initial>' -> 'initial') >> 
		// Remove the remaining initial placeholders
		removeRemaining('<initial>') >>
		
		// Forget the current state
		dropState >>
		
		// Assign action and input names randomly
		assignRandomToLeaf(ACTION_AND_INPUT_NAMES, '<input value>', '<action value>') >>
		
		// Forget the current state
		dropState >>
		
		// Assign state names randomly
		assignRandomToLeaf(STATE_NAMES, '<state name>') >>
		// Use the assigned state names for the references
		useForLeaf('<state reference>')
}

/**
 * Separate the constants from the real post processor
 */
interface FSMLConstants {

	/**
	 * Values for the action and the input IDs
	 */
	val static ACTION_AND_INPUT_NAMES = newHashSet(
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
		"return",
		"produce",
		"retract",
		"disclose",
		"fill",
		"abbreviate",
		"drink",
		"unbox",
		"lead"
	)

	/**
	 * Values for the state IDs
	 */
	val static STATE_NAMES = newHashSet(
		"MastersOfTheUniverse",
		"Compiled",
		"Turning",
		"Resolved",
		"Stuffed",
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
}
