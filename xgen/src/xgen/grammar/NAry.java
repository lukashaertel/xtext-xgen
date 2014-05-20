/**
 */
package xgen.grammar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NAry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Abstract base for elements manipulating a sequence of inner element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.grammar.NAry#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.grammar.GrammarPackage#getNAry()
 * @model abstract="true"
 * @generated
 */
public interface NAry extends Construct
{
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link xgen.grammar.Construct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The left operand element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see xgen.grammar.GrammarPackage#getNAry_Operands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Construct> getOperands();

} // NAry
