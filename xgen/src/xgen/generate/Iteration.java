package xgen.generate;

import java.util.Collections;
import java.util.OptionalLong;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Iterables;

import xgen.accept.Acceptor;
import xgen.grammar.*;
import xgen.grammar.util.GrammarSwitch;
import xgen.grammar.util.GrammarUtil;
import xgen.index.Index;
import xgen.parsetree.*;
import xgen.util.StringUtil;

public class Iteration
{
	protected static final long INNER_PER_OUTER = 100;

	public final Grammar grammar;

	public Iteration(Grammar grammar)
	{
		this.grammar = grammar;
	}

	protected Index<Character> getAlphabet()
	{
		return Index.chars((char) 32, (char) 127);
	}

	protected Index<String> getStrings()
	{
		return getAlphabet().combinations(1, OptionalLong.empty(), INNER_PER_OUTER).mapPresent(StringUtil::flatten);
	}

	public Index<Node> iterate(EObject element)
	{
		return iterate(element, new Depth());
	}

	private Index<Node> iterate(EObject element, Depth depth)
	{
		return new GrammarSwitch<Index<Node>>()
		{

			@Override
			public Index<Node> caseAlternative(Alternative object)
			{
				// Use offset here to avoid always going over one reference
				int offset = depth.getDepth(GrammarUtil.getDefinition(object));
				int size = object.getOperands().size();

				Index<Node> r = iterate(object.getOperands().get(offset % size), depth);
				for (int i = 1; i < object.getOperands().size(); i++)
					r = r.zip(iterate(object.getOperands().get((offset + i) % size), depth), true);

				return r.mapPresent(x -> new Container(object, x));
			}

			@Override
			public Index<Node> caseAny(Any object)
			{
				return getAlphabet().mapPresent(x -> new Container(object, new Leaf(Character.toString(x))));
			}

			@Override
			public Index<Node> caseDefinition(Definition object)
			{
				try
				{
					depth.addDepth(object, 1);

					return iterate(object.getRhs(), depth).mapPresent(x -> new Container(object, x));
				}
				finally
				{
					depth.addDepth(object, -1);
				}
			}

			@Override
			public Index<Node> caseKeyword(Keyword object)
			{
				return Index.items(object.getValue()).mapPresent(x -> new Container(object, new Leaf(x)));
			}

			@Override
			public Index<Node> caseMultiplicity(Multiplicity object)
			{
				long min = object.getMin();
				OptionalLong max = object.isUpperBounded() ? OptionalLong.of(object.getMax()) : OptionalLong.empty();

				return iterate(object.getOperand(), depth).combinations(min, max, INNER_PER_OUTER).mapPresent(x -> Container.fromIterable(object, x));

			}

			@Override
			public Index<Node> caseNot(Not object)
			{
				return getStrings().filter(i -> !Acceptor.INSTANCE.acceptsAnySuffix(object.getOperand(), i)).mapPresent(x -> new Container(object, new Leaf(x)));
			}

			@Override
			public Index<Node> caseRange(Range object)
			{
				return Index.chars(object.getMin(), object.getMax()).mapPresent(x -> new Container(object, new Leaf(Character.toString(x))));
			}

			@Override
			public Index<Node> caseReference(Reference object)
			{
				return Index.late(() -> iterate(object.getTarget(), depth).mapPresent(x -> new Container(object, x)));
			}

			@Override
			public Index<Node> caseSequence(Sequence object)
			{
				Index<Iterable<Node>> r = iterate(object.getOperands().get(0), depth).mapPresent(i -> Collections.singleton(i));

				for (int i = 1; i < object.getOperands().size(); i++)
					r = r.productPresent(iterate(object.getOperands().get(i), depth), (x, y) -> Iterables.concat(x, Collections.singleton(y)));

				return r.mapPresent(x -> Container.fromIterable(object, x));
			}

		}.doSwitch(element);
	}
}
