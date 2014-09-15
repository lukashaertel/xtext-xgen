package xgen.postprocess;

import java.util.function.Predicate;

import xgen.index.Index;
import xgen.parsetree.Pair;
import xgen.parsetree.Node;

public class PostProcessors {
	public static <U> PostProcessor<U, U> id() {
		return new PostProcessor<U, U>() {
			@Override
			public Index<Pair<U, Node>> postProcess(Index<Pair<U, Node>> ns) {
				return ns;
			}
		};
	}

	public static <U> Index<Pair<U, Node>> annotate(U state, Index<Node> ns) {
		return ns.mapPresent(n -> new Pair<>(state, n));
	}

	public static Index<Node> unAnnotate(Index<Pair<?, Node>> ns) {
		return ns.mapPresent(n -> n.b);
	}

	public static <U> PostProcessor<U, U> loop(PostProcessor<U, U> pp,
			Predicate<Index<Pair<U, Node>>> p) {
		return new PostProcessor<U, U>() {
			@Override
			public Index<Pair<U, Node>> postProcess(Index<Pair<U, Node>> ns) {
				while (p.test(ns))
					ns = pp.postProcess(ns);

				return ns;
			}
		};
	}

	public static <U> PostProcessor<U, U> loopUntilId(PostProcessor<U, U> pp) {
		return new PostProcessor<U, U>() {

			@Override
			public Index<Pair<U, Node>> postProcess(Index<Pair<U, Node>> ns) {
				Index<Pair<U, Node>> cmp = null;
				while (cmp != ns) {
					cmp = ns;
					ns = pp.postProcess(ns);
				}

				return ns;
			}
		};
	}

}
