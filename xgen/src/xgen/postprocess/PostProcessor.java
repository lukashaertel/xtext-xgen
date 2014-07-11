package xgen.postprocess;

import xgen.index.Index;
import xgen.parsetree.Pair;
import xgen.parsetree.Node;

/**
 * The processor processes an input index of nodes
 * 
 * @author Lukas Härtel
 *
 */
public abstract class PostProcessor<UIn, UOut> {

	/**
	 * Processes the input nodes and returns the transformed index
	 * 
	 * @param ns
	 *            The input
	 * @return Returns the result
	 */
	public abstract Index<Pair<UOut, Node>> postProcess(
			Index<Pair<UIn, Node>> ns);

	public Index<Node> postProcess(UIn s, Index<Node> ns) {
		return postProcess(PostProcessors.annotate(s, ns)).mapPresent(l -> l.b);
	}

	public <ULast> PostProcessor<UIn, ULast> andThen(
			PostProcessor<UOut, ULast> second) {
		PostProcessor<UIn, UOut> first = this;

		return new PostProcessor<UIn, ULast>() {
			@Override
			public Index<Pair<ULast, Node>> postProcess(
					Index<Pair<UIn, Node>> ns) {
				return second.postProcess(first.postProcess(ns));
			}
		};
	}
}
