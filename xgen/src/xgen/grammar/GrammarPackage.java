/**
 */
package xgen.grammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xgen.grammar.GrammarFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='xgen'"
 * @generated
 */
public interface GrammarPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "xgen.grammar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grammar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarPackage eINSTANCE = xgen.grammar.impl.GrammarPackageImpl.init();

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.GrammarImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.ElementImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.DefinitionImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LHS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lexical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LEXICAL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__RHS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.ConstructImpl <em>Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.ConstructImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getConstruct()
	 * @generated
	 */
	int CONSTRUCT = 3;

	/**
	 * The number of structural features of the '<em>Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.TerminalImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 4;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.UnaryImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 5;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__OPERAND = CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_COUNT = CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.NAryImpl <em>NAry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.NAryImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getNAry()
	 * @generated
	 */
	int NARY = 6;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY__OPERANDS = CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NAry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_FEATURE_COUNT = CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NAry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_OPERATION_COUNT = CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.AnyImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 7;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OPERATION_COUNT = TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.KeywordImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__VALUE = TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = TERMINAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_OPERATION_COUNT = TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.RangeImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 9;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = TERMINAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = TERMINAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.ReferenceImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = TERMINAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.AlternativeImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 11;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__OPERANDS = NARY__OPERANDS;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = NARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = NARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.SequenceImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 12;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OPERANDS = NARY__OPERANDS;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = NARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = NARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.NotImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 13;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = UNARY__OPERAND;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xgen.grammar.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xgen.grammar.impl.MultiplicityImpl
	 * @see xgen.grammar.impl.GrammarPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 14;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OPERAND = UNARY__OPERAND;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__MIN = UNARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__MAX = UNARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__UPPER_BOUNDED = UNARY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_FEATURE_COUNT = UNARY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_OPERATION_COUNT = UNARY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xgen.grammar.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see xgen.grammar.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the containment reference list '{@link xgen.grammar.Grammar#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see xgen.grammar.Grammar#getDefinitions()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Definitions();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see xgen.grammar.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see xgen.grammar.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link xgen.grammar.Definition#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lhs</em>'.
	 * @see xgen.grammar.Definition#getLhs()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link xgen.grammar.Definition#isLexical <em>Lexical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lexical</em>'.
	 * @see xgen.grammar.Definition#isLexical()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Lexical();

	/**
	 * Returns the meta object for the containment reference '{@link xgen.grammar.Definition#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see xgen.grammar.Definition#getRhs()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Rhs();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Construct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct</em>'.
	 * @see xgen.grammar.Construct
	 * @generated
	 */
	EClass getConstruct();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see xgen.grammar.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see xgen.grammar.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the containment reference '{@link xgen.grammar.Unary#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see xgen.grammar.Unary#getOperand()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Operand();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.NAry <em>NAry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NAry</em>'.
	 * @see xgen.grammar.NAry
	 * @generated
	 */
	EClass getNAry();

	/**
	 * Returns the meta object for the containment reference list '{@link xgen.grammar.NAry#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see xgen.grammar.NAry#getOperands()
	 * @see #getNAry()
	 * @generated
	 */
	EReference getNAry_Operands();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see xgen.grammar.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see xgen.grammar.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for the attribute '{@link xgen.grammar.Keyword#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xgen.grammar.Keyword#getValue()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_Value();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see xgen.grammar.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link xgen.grammar.Range#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see xgen.grammar.Range#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link xgen.grammar.Range#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see xgen.grammar.Range#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see xgen.grammar.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link xgen.grammar.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see xgen.grammar.Reference#getTarget()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Target();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see xgen.grammar.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see xgen.grammar.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see xgen.grammar.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link xgen.grammar.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see xgen.grammar.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link xgen.grammar.Multiplicity#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see xgen.grammar.Multiplicity#getMin()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_Min();

	/**
	 * Returns the meta object for the attribute '{@link xgen.grammar.Multiplicity#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see xgen.grammar.Multiplicity#getMax()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_Max();

	/**
	 * Returns the meta object for the attribute '{@link xgen.grammar.Multiplicity#isUpperBounded <em>Upper Bounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bounded</em>'.
	 * @see xgen.grammar.Multiplicity#isUpperBounded()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_UpperBounded();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammarFactory getGrammarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.GrammarImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__DEFINITIONS = eINSTANCE.getGrammar_Definitions();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.ElementImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.DefinitionImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__LHS = eINSTANCE.getDefinition_Lhs();

		/**
		 * The meta object literal for the '<em><b>Lexical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__LEXICAL = eINSTANCE.getDefinition_Lexical();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__RHS = eINSTANCE.getDefinition_Rhs();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.ConstructImpl <em>Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.ConstructImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getConstruct()
		 * @generated
		 */
		EClass CONSTRUCT = eINSTANCE.getConstruct();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.TerminalImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.UnaryImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__OPERAND = eINSTANCE.getUnary_Operand();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.NAryImpl <em>NAry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.NAryImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getNAry()
		 * @generated
		 */
		EClass NARY = eINSTANCE.getNAry();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARY__OPERANDS = eINSTANCE.getNAry_Operands();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.AnyImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.KeywordImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__VALUE = eINSTANCE.getKeyword_Value();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.RangeImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.ReferenceImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TARGET = eINSTANCE.getReference_Target();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.AlternativeImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.SequenceImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.NotImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link xgen.grammar.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xgen.grammar.impl.MultiplicityImpl
		 * @see xgen.grammar.impl.GrammarPackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY__MIN = eINSTANCE.getMultiplicity_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY__MAX = eINSTANCE.getMultiplicity_Max();

		/**
		 * The meta object literal for the '<em><b>Upper Bounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY__UPPER_BOUNDED = eINSTANCE.getMultiplicity_UpperBounded();

	}

} //GrammarPackage
