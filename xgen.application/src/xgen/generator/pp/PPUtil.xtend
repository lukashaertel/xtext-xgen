package xgen.generator.pp

import java.util.Set
import java.util.Collection
import java.util.Map
import xgen.postprocess.PostProcessor

class PPUtil {
	def static AssignRandomToLeaf assignRandomToLeaf(Collection<String> leafNames, Set<String> selectable) {
		new AssignRandomToLeaf(leafNames, selectable)
	}

	def static AssignRandomToLeaf assignRandomToLeaf(Set<String> selectable, String... leafNames) {
		new AssignRandomToLeaf(leafNames, selectable)
	}

	def static <U> DropState<U> dropState() {
		new DropState<U>
	}

	def static RemoveRemaining removeRemaining(Collection<String> leafNames) {
		new RemoveRemaining(leafNames)
	}

	def static RemoveRemaining removeRemaining(String... leafNames) {
		new RemoveRemaining(leafNames)
	}

	def static ReplaceOne replaceOne(Map<String, String> leafNamesAndReplacement) {
		new ReplaceOne(leafNamesAndReplacement)
	}

	def static ReplaceOne replaceOne(Pair<String, String>... leafNamesAndReplacement) {
		new ReplaceOne(leafNamesAndReplacement)
	}

	def static UseForLeaf useForLeaf(Collection<String> leafNames) {
		new UseForLeaf(leafNames)
	}

	def static UseForLeaf useForLeaf(String... leafNames) {
		new UseForLeaf(leafNames)
	}

	def static <UIn, UOut, ULast> PostProcessor<UIn, ULast> operator_doubleGreaterThan(PostProcessor<UIn, UOut> a,
		PostProcessor<UOut, ULast> b) {
		a.andThen(b)
	}
}
