package xgen.generator

import java.util.Random
import com.google.common.collect.Iterables

class RU {
	def static <T> rof(long basedOn, Iterable<T> r) {
		val ran = new Random(basedOn)

		for (t : Iterables.cycle(r))
			if (ran.nextBoolean)
				return t;
	}
}
