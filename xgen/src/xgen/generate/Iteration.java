package xgen.generate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalLong;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Iterables;

import xgen.accept.Acceptor;
import xgen.grammar.*;
import xgen.grammar.util.GrammarSwitch;
import xgen.index.Index;
import xgen.parsetree.*;
import xgen.util.StringUtil;
import static xgen.grammar.GrammarConstructor.*;

public class Iteration {
	protected static final long INNER_PER_OUTER = 10;

	public final Grammar grammar;

	public Iteration(Grammar grammar) {
		this.grammar = grammar;
	}

	protected Index<Character> getAlphabet() {
		return Index.chars((char) 32, (char) 127);
	}

	protected Index<String> getStrings() {
		return getAlphabet().combinations(1, OptionalLong.empty(),
				INNER_PER_OUTER).mapPresent(StringUtil::flatten);
	}

	public Index<Node> iterate(EObject element) {
		return new GrammarSwitch<Index<Node>>() {

			@Override
			public Index<Node> caseAlternative(Alternative object) {
				Index<Node> r = iterate(object.getOperands().get(0));
				for (int i = 1; i < object.getOperands().size(); i++)
					r = r.zip(iterate(object.getOperands().get(i)), true);

				return r.mapPresent(x -> new Container(object, x));
			}

			@Override
			public Index<Node> caseAny(Any object) {
				return getAlphabet().mapPresent(
						x -> new Container(object, new Leaf(Character
								.toString(x))));
			}

			@Override
			public Index<Node> caseDefinition(Definition object) {
				return iterate(object.getRhs()).mapPresent(
						x -> new Container(object, x));
			}

			@Override
			public Index<Node> caseKeyword(Keyword object) {
				return Index.items(object.getValue()).mapPresent(
						x -> new Container(object, new Leaf(x)));
			}

			@Override
			public Index<Node> caseMultiplicity(Multiplicity object) {
				long min = object.getMin();
				OptionalLong max = object.isUpperBounded() ? OptionalLong
						.of(object.getMax()) : OptionalLong.empty();

				return iterate(object.getOperand()).combinations(min, max,
						INNER_PER_OUTER).mapPresent(
						x -> Container.fromIterable(object, x));

			}

			@Override
			public Index<Node> caseNot(Not object) {
				return getStrings().filter(
						i -> !Acceptor.INSTANCE.acceptsAnySuffix(
								object.getOperand(), i)).mapPresent(
						x -> new Container(object, new Leaf(x)));
			}

			@Override
			public Index<Node> caseRange(Range object) {
				return Index.chars(object.getMin(), object.getMax())
						.mapPresent(
								x -> new Container(object, new Leaf(Character
										.toString(x))));
			}

			@Override
			public Index<Node> caseReference(Reference object) {
				return Index.late(() -> iterate(object.getTarget()).mapPresent(
						x -> new Container(object, x)));
			}

			@Override
			public Index<Node> caseSequence(Sequence object) {
				Index<Iterable<Node>> r = iterate(object.getOperands().get(0))
						.mapPresent(i -> Collections.singleton(i));

				for (int i = 1; i < object.getOperands().size(); i++)
					r = r.productPresent(
							iterate(object.getOperands().get(i)),
							(x, y) -> Iterables.concat(x,
									Collections.singleton(y)));

				return r.mapPresent(x -> Container.fromIterable(object, x));
			}

		}.doSwitch(element);
	}

	public static String[] candidateInputs = { "ticket", "pass", "trinken" };

	public static String[] candidateStates = { "status1", "andererStatus",
			"kleingeld" };

	public static Object replaceInput(Object i) {

		if ("<<input>>".equals(i))
			return candidateInputs[Math.max(0,
					Float.floatToIntBits((float) Math.random()))
					% candidateInputs.length];

		return i;
	}

	public static Object replaceState(Object i) {

		if ("<<state>>".equals(i))
			return candidateStates[Math.max(0,
					Float.floatToIntBits((float) Math.random()))
					% candidateStates.length];

		return i;
	}

	public static void main(String[] args) {
		Definition transition = definition("transition",
				sequence(Arrays.asList(keyword("<<input>>"), keyword("->"),
						keyword("<<state>>"), keyword(";"))));
		Definition state = definition("state", sequence(Arrays.asList(
				keyword("<<one of initial>>"), keyword("state"),
				keyword("<<state>>"), keyword("{"),
				multiplicity(reference(transition), 2, true, 4), keyword("}"))));
		Definition model = definition("model",
				multiplicity(reference(state), 1, true, 3));

		Grammar g = grammar(model, transition, state, model);

		Iteration i = new Iteration(g);

		Index<Node> ifg = i.iterate(model);

		final long start = 0;
		final long amount = 27410;
		long real = 0;
		for (long l = start; l < start + amount; l++) {
			Optional<Node> r = ifg.get(l);
			if (!r.isPresent())
				continue;

			real++;

			Node n = r.get();

			if (n instanceof Container) {
				Node c = (Node) n;

				System.out.println(c
						.transformAllValues(Iteration::replaceState)
						.transformAllValues(Iteration::replaceInput));
			} else {
				System.out.println(n);
			}
		}

		System.out.println(real + " of " + amount);
	}
}
