import com.google.common.collect.Lists
import static extension xgen.generator.pp.PPUtil.*
import com.google.common.collect.Sets

class EXP extends EXPConstants {

	public static val PP = 
		// Assign and use variable names randomly
		assignRandomToLeaf(VARIABLE_NAMES, "<var name>") >>
		useForLeaf("<var reference>") >>
		
		// Forget the current state
		dropState >>
		
		// Assign and use pattern names randomly
		assignRandomToLeaf(PATTERN_NAMES, "<pattern name>")>>
		useForLeaf("<pattern reference>")
}

class EXPConstants {
	static def flattenStrings(Iterable<String> f) {
		f.fold("", [a, b|a + b])
	}

	static val LC = Lists.charactersOf("abcdefghijklmnopqrstuvwxyz").map[toString].toSet;

	static val UC = Lists.charactersOf("ABCDEFGHIJKLMNOPQRSTUVWXYZ").map[toString].toSet;

	public static val VARIABLE_NAMES = Sets.cartesianProduct(LC, LC, LC).map[flattenStrings].toSet
	
	public static val PATTERN_NAMES = Sets.cartesianProduct(UC, UC, UC).map[flattenStrings].toSet
}