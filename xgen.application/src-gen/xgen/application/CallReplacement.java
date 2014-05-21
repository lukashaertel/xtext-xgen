/**
 */
package xgen.application;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.AbstractRule;

import xgen.grammar.Construct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.application.CallReplacement#getSelector <em>Selector</em>}</li>
 *   <li>{@link xgen.application.CallReplacement#isPositioned <em>Positioned</em>}</li>
 *   <li>{@link xgen.application.CallReplacement#getPosition <em>Position</em>}</li>
 *   <li>{@link xgen.application.CallReplacement#getTarget <em>Target</em>}</li>
 *   <li>{@link xgen.application.CallReplacement#getReplacement <em>Replacement</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.application.ApplicationPackage#getCallReplacement()
 * @model
 * @generated
 */
public interface CallReplacement extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' reference.
   * @see #setSelector(AbstractRule)
   * @see xgen.application.ApplicationPackage#getCallReplacement_Selector()
   * @model
   * @generated
   */
  AbstractRule getSelector();

  /**
   * Sets the value of the '{@link xgen.application.CallReplacement#getSelector <em>Selector</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(AbstractRule value);

  /**
   * Returns the value of the '<em><b>Positioned</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Positioned</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Positioned</em>' attribute.
   * @see #setPositioned(boolean)
   * @see xgen.application.ApplicationPackage#getCallReplacement_Positioned()
   * @model
   * @generated
   */
  boolean isPositioned();

  /**
   * Sets the value of the '{@link xgen.application.CallReplacement#isPositioned <em>Positioned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Positioned</em>' attribute.
   * @see #isPositioned()
   * @generated
   */
  void setPositioned(boolean value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see #setPosition(int)
   * @see xgen.application.ApplicationPackage#getCallReplacement_Position()
   * @model
   * @generated
   */
  int getPosition();

  /**
   * Sets the value of the '{@link xgen.application.CallReplacement#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see #getPosition()
   * @generated
   */
  void setPosition(int value);

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
   * @see xgen.application.ApplicationPackage#getCallReplacement_Target()
   * @model
   * @generated
   */
  AbstractRule getTarget();

  /**
   * Sets the value of the '{@link xgen.application.CallReplacement#getTarget <em>Target</em>}' reference.
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
   * @see xgen.application.ApplicationPackage#getCallReplacement_Replacement()
   * @model containment="true"
   * @generated
   */
  Construct getReplacement();

  /**
   * Sets the value of the '{@link xgen.application.CallReplacement#getReplacement <em>Replacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replacement</em>' containment reference.
   * @see #getReplacement()
   * @generated
   */
  void setReplacement(Construct value);

} // CallReplacement
