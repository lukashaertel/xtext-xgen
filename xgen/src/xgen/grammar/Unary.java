/**
 */
package xgen.grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Abstract base for elements manipulating a single inner element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.grammar.Unary#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.grammar.GrammarPackage#getUnary()
 * @model abstract="true"
 * @generated
 */
public interface Unary extends Construct
{
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The operand element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Construct)
	 * @see xgen.grammar.GrammarPackage#getUnary_Operand()
	 * @model containment="true"
	 * @generated
	 */
	Construct getOperand();

	/**
	 * Sets the value of the '{@link xgen.grammar.Unary#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Construct value);

} // Unary
