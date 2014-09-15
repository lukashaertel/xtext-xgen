package xgen

import xgen.application.Apply
import xgen.grammar.util.GrammarConverter
import xgen.grammar.util.GrammarUtil
import org.eclipse.emf.ecore.util.EcoreUtil
import static xgen.grammar.util.GrammarConstructor.*

class Rewriting {
	def static getEffectiveGrammar(Apply it) {
		val g = GrammarConverter.fromXText(target)


		val rr = ruleAdjustment.map[x|x.replaces.map[y|x -> y]].flatten
		val rl = ruleAdjustment.map[x|x.limits.map[y|x -> y]].flatten

		// Sort by position descending so we don't mess up positions replacing prior candidates
		val orrs = rr.sortBy[if(value.positioned) -value.position else 1]
		val orls = rl.sortBy[if(value.positioned) -value.position else 1]

		for (orr : orrs)
			GrammarUtil.getDefinition(g, orr.key.rule.name).ifPresent [
				rhs = GrammarUtil.selectTransform(rhs, [x|EcoreUtil.equals(orr.value.selector, x)],
					[x|EcoreUtil.copy(orr.value.replacement)], orr.value.positioned, orr.value.position);
			]

		for (orl : orls)
			GrammarUtil.getDefinition(g, orl.key.rule.name).ifPresent [
				rhs = GrammarUtil.adjustMultiplicity(rhs,
					[x|multiplicity(x.operand, orl.value.min, orl.value.upperBounded, orl.value.max)],
					orl.value.positioned, orl.value.position)
			]

		return g
	}
}
