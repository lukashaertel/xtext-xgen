package xgen.generate;

import java.util.HashMap;
import java.util.Map;

import xgen.grammar.Definition;

public class Depth
{
	private final Map<Definition, Integer> depth;

	public Depth()
	{
		depth = new HashMap<>();
	}

	public int getDepth(Definition d)
	{
		return depth.getOrDefault(d, 0);
	}

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
