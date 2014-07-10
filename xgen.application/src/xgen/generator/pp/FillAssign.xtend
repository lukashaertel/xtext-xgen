package xgen.generator.pp

import xgen.grammar.Definition
import xgen.index.Index
import xgen.parsetree.Leaf
import xgen.parsetree.Node
import xgen.parsetree.Pair
import xgen.postprocess.OneToManyPostProcessor

class FillAssign<T> extends OneToManyPostProcessor<T, T> {
	def static root(Node n) {
		var c = n
		while (c.parent != null)
			c = c.parent
		return c
	}

	def static before(Node l) {
		val r = newHashSet()
		val boolean[] s = #[false]

		root(l).visit [ n |
			if (n == l)
				s.set(0, true)
			else if (!s.get(0))
				r += n
		]

		return r
	}

	def static boolean inDef(Node it, String nom) {
		switch (label) {
			Definition case label.name == nom:
				return true
		}

		if (parent != null)
			return inDef(parent, nom)

		return false
	}

	override protected calculate(Pair<T, Node> p) {
		val fr = p.b.find[n|n instanceof Leaf && (n as Leaf).value == '<ref>']

		if (fr.present) {
			val x = before(fr.get as Leaf)

			// Search all names in leaves
			val ns = x.filter(Leaf)
			// We need ID call
			.filter[inDef('ID')]
			// And may not be in a reference
			.filter[!inDef('Reference')]
			// They must be in an assignment
			.filter[inDef('Assignment')].map[value].toList

			println(ns)

			if (ns.empty)
				return Index.items()
			else
				Index.from(ns).map [ n |
					]
			}
			return Index.items(p)
		}

	}
	