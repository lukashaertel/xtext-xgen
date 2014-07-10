package xgen.generator.pp

import com.google.common.collect.Sets
import static xgen.generator.RU.rof
import java.util.Collections
import java.util.Set
import xgen.parsetree.Leaf
import xgen.parsetree.Pair
import xgen.postprocess.TransformAll

abstract class AssignRandom<T> extends TransformAll<Object, Set<String>, T> {

	val Set<String> selectable

	new(Set<String> selectable) {
		this.selectable = selectable
	}

	override protected supplyCarrier(Object s) {
		newHashSet
	}

	def abstract boolean hasQuality(Leaf l);

	override protected build(Pair<Set<String>, Leaf> p) {
		if (!p.b.hasQuality)
			return p

		val ps = Sets.difference(selectable, p.a)
		val nsn = rof(ps.size, ps)

		return Pair.create(
			Sets.union(p.a, Collections.singleton(nsn)),
			new Leaf(p.b.label, nsn)
		)
	}
}
