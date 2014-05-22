package xgen.generate;

import java.util.Map;

import xgen.grammar.Definition;

import com.google.common.collect.Maps;

/**
 * Stores the times a definition has been instantiated
 * 
 * @author Lukas Härtel
 *
 */
public class Depth
{
	/**
	 * Maps the definitions to their usageF
	 */
	private final Map<Definition, Integer> depth;

	/**
	 * Makes a new instance of the usage store
	 */
	public Depth()
	{
		depth = Maps.newIdentityHashMap();
	}

	/**
	 * Gets the usage count of the given rule
	 * 
	 * @param d
	 *            The rule definition
	 * @return Returns The usage amount
	 */
	public int getDepth(Definition d)
	{
		return depth.getOrDefault(d, 0);
	}

	/**
	 * Adds to the rule usage or removes if offset is negative
	 * 
	 * @param d
	 *            The rule to modify
	 * @param offset
	 *            The offset to add
	 */
	public void addDepth(Definition d, int offset)
	{
		int amt = depth.getOrDefault(d, 0);

		if (amt + offset == 0)
			depth.remove(d);
		else
			depth.put(d, amt + offset);
	}

	public Depth copy()
	{
		Depth r = new Depth();

		r.depth.putAll(depth);

		return r;
	}
}
