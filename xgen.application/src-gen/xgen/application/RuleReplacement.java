/**
 */
package xgen.application;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;

import xgen.grammar.Construct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.application.RuleReplacement#getTarget <em>Target</em>}</li>
 *   <li>{@link xgen.application.RuleReplacement#getReplacement <em>Replacement</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.application.ApplicationPackage#getRuleReplacement()
 * @model
 * @generated
 */
public interface RuleReplacement extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(AbstractRule)
   * @see xgen.application.ApplicationPackage#getRuleReplacement_Target()
   * @model
   * @generated
   */
  AbstractRule getTarget();

  /**
   * Sets the value of the '{@link xgen.application.RuleReplacement#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(AbstractRule value);

  /**
   * Returns the value of the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replacement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replacement</em>' containment reference.
   * @see #setReplacement(Construct)
   * @see xgen.application.ApplicationPackage#getRuleReplacement_Replacement()
   * @model containment="true"
   * @generated
   */
  Construct getReplacement();

  /**
   * Sets the value of the '{@link xgen.application.RuleReplacement#getReplacement <em>Replacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replacement</em>' containment reference.
   * @see #getReplacement()
   * @generated
   */
  void setReplacement(Construct value);

} // RuleReplacement
