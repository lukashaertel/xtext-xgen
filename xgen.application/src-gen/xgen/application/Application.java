/**
 */
package xgen.application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.Grammar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.application.Application#getTarget <em>Target</em>}</li>
 *   <li>{@link xgen.application.Application#getMin <em>Min</em>}</li>
 *   <li>{@link xgen.application.Application#getMax <em>Max</em>}</li>
 *   <li>{@link xgen.application.Application#getCallReplacements <em>Call Replacements</em>}</li>
 *   <li>{@link xgen.application.Application#getRuleReplacements <em>Rule Replacements</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.application.ApplicationPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Apply
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
   * @see #setTarget(Grammar)
   * @see xgen.application.ApplicationPackage#getApplication_Target()
   * @model
   * @generated
   */
  Grammar getTarget();

  /**
   * Sets the value of the '{@link xgen.application.Application#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Grammar value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see xgen.application.ApplicationPackage#getApplication_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link xgen.application.Application#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see xgen.application.ApplicationPackage#getApplication_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link xgen.application.Application#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

  /**
   * Returns the value of the '<em><b>Call Replacements</b></em>' containment reference list.
   * The list contents are of type {@link xgen.application.CallReplacement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Replacements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Replacements</em>' containment reference list.
   * @see xgen.application.ApplicationPackage#getApplication_CallReplacements()
   * @model containment="true"
   * @generated
   */
  EList<CallReplacement> getCallReplacements();

  /**
   * Returns the value of the '<em><b>Rule Replacements</b></em>' containment reference list.
   * The list contents are of type {@link xgen.application.RuleReplacement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Replacements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Replacements</em>' containment reference list.
   * @see xgen.application.ApplicationPackage#getApplication_RuleReplacements()
   * @model containment="true"
   * @generated
   */
  EList<RuleReplacement> getRuleReplacements();

} // Application
