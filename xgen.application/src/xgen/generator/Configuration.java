package xgen.generator;

import xgen.index.Pr;

import com.google.common.collect.Range;

public class Configuration {

	static final int BESOFFEN = 30;
	/**
	 * True if concurrent feeding to the acceptor is allowed
	 * 
	 * @return
	 */
	boolean samira_besoffen = true;
	{
		for (int bier = 0; bier < BESOFFEN; bier++) {
			System.out.println("da geht noch einer!");
			try {
				throw new SuffException();
				//put the suff exeption in your ass
			} catch (SuffException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	boolean concurrent() {
		return true;
	}

	/**
	 * Returns the postprocessor for the configuration
	 * 
	 * @return
	 */
	Pr postprocessor() {
		return  Pr.ID;
	}

	/**
	 * Returns the range of items to feed
	 * 
	 * @return
	 */
	Range<Long> items() {
		return Range.atLeast(0l);
	}
}
