/**
 */
package xgen.grammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Container of all grammar definitions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.grammar.Grammar#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.grammar.GrammarPackage#getGrammar()
 * @model
 * @generated
 */
public interface Grammar extends EObject
{
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link xgen.grammar.Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The definitions this grammar composes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see xgen.grammar.GrammarPackage#getGrammar_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Definition> getDefinitions();

} // Grammar
