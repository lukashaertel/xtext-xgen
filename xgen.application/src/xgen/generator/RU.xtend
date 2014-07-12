package xgen.generator

import java.util.Random
import com.google.common.collect.Iterables
import java.util.Collection

class RU {
	def static <T> rof(long basedOn, Collection<T> r) {
		if(r.empty) return null

		val ran = new Random(basedOn)

		val p = ran.nextInt(r.size)
		return Iterables.get(r, p)
	}
}
