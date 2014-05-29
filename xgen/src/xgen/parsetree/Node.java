package xgen.parsetree;

import java.util.function.Consumer;
import java.util.function.Function;

import xgen.grammar.Definition;
import xgen.grammar.Element;

/**
 * A node in a parsetree
 * 
 * @author Lukas Härtel
 *
 */
public abstract class Node
{
	/**
	 * The label of the node
	 */
	public final Element label;

	/**
	 * <p>
	 * The parent
	 * </p>
	 * <p>
	 * <em>Do not modify directly, modified by {@link Container}</em>
	 * </p>
	 */
	protected Node parent;

	/**
	 * Constructs the node
	 */
	protected Node(Element label)
	{
		this.label = label;
		
		parent = null;
	}

	/**
	 * Gets the parent of this node
	 * 
	 * @return Returns the parent or null
	 */
	public Node getParent()
	{
		return parent;
	}

	/**
	 * Transforms this and optionally all contained nodes by the given function
	 * 
	 * @param recursive
	 *            True if all contained nodes are also to be transformed
	 * @param f
	 *            The transformation to apply
	 * @return Returns the transformed node
	 */
	public abstract Node transform(boolean recursive, Function<Node, Node> f);

	/**
	 * Transforms this and optionally all contained containers by the given
	 * function
	 * 
	 * @param recursive
	 *            True if all contained containers are also to be transformed
	 * @param f
	 *            The transformation to apply
	 * @return Returns the transformed node
	 */
	public abstract Node transformContainer(boolean recursive, Function<Container, Node> f);

	/**
	 * Transforms this and optionally all contained leafs by the given function
	 * 
	 * @param recursive
	 *            True if all contained leafs are also to be transformed
	 * @param f
	 *            The transformation to apply
	 * @return Returns the transformed node
	 */
	public abstract Node transformLeaf(boolean recursive, Function<Leaf, Node> f);

	/**
	 * Visits all nodes in pre-order
	 * 
	 * @param f
	 *            The consumer
	 */
	public abstract void visit(Consumer<? super Node> f);

	/**
	 * Clones this node
	 */
	public abstract Node clone();
	
	/**
	 * Flattens the parse-tree
	 * 
	 * @param setting
	 *            The setting to use
	 * @param lexical
	 *            True if lexical flattening should apply from this node
	 * @return Returns the string flattened
	 */
	public String flatten(Setting setting, boolean lexical)
	{
		StringBuilder b = new StringBuilder();

		flatten(setting, b, lexical);

		return b.toString();
	}

	/**
	 * Flattens the parse-tree
	 * 
	 * @param setting
	 *            The setting to use
	 * @param target
	 *            The string builder used for flattening
	 * @param lexical
	 *            True if lexical flattening should apply from this node
	 */
	public abstract void flatten(Setting setting, StringBuilder target, boolean lexical);

	/**
	 * Checks if the label is a lexical definition element
	 * 
	 * @return True if label is a definition and the definition is lexical
	 */
	public boolean isLexicalDefinition()
	{
		return label instanceof Definition && ((Definition) label).isLexical();
	}
}
