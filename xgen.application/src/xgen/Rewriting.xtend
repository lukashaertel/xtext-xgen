package xgen

import xgen.application.Apply
import xgen.grammar.util.GrammarConverter
import xgen.grammar.util.GrammarUtil
import org.eclipse.emf.ecore.util.EcoreUtil
import static xgen.grammar.util.GrammarConstructor.*

class Rewriting {
	def static getEffectiveGrammar(Apply it) {
		val g = GrammarConverter.fromXText(target)

		for (rr : ruleReplacements)
			GrammarUtil.getDefinition(g, rr.target.name).ifPresent[rhs = rr.replacement]

		// Sort by position descending so we don't mess up positions replacing prior candidates
		val crs = constructReplacements.sortBy[if(positioned) -position else 1]
		val mas = multiplicityAdjustments.sortBy[if(positioned) -position else 1]

		for (cs : crs)
			GrammarUtil.getDefinition(g, cs.target.name).ifPresent [
				rhs = GrammarUtil.selectTransform(rhs, [x|EcoreUtil.equals(cs.selector, x)],
					[x|EcoreUtil.copy(cs.replacement)], cs.positioned, cs.position);
			]

		for (ma : mas)
			GrammarUtil.getDefinition(g, ma.target.name).ifPresent [
				rhs = GrammarUtil.adjustMultiplicity(rhs, [x|multiplicity(x.operand, ma.min, ma.upperBounded, ma.max)],
					ma.positioned, ma.position)
			]

		return g
	}
}
