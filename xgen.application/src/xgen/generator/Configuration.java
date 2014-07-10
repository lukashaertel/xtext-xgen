package xgen.generator;

import xgen.index.Pr;

import com.google.common.collect.Range;

public interface Configuration {
	/**
	 * True if concurrent feeding to the acceptor is allowed
	 * 
	 * @return
	 */
	default boolean concurrent() {
		return true;
	}

	/**
	 * Returns the postprocessor for the configuration
	 * 
	 * @return
	 */
	default Pr postprocessor() {
		return Pr.ID;
	}

	/**
	 * Returns the range of items to feed
	 * 
	 * @return
	 */
	default Range<Long> items() {
		return Range.atLeast(0l);
	}
}
