/**
 */
package xgen.application;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.application.MultiplicityAdjustment#isPositioned <em>Positioned</em>}</li>
 *   <li>{@link xgen.application.MultiplicityAdjustment#getPosition <em>Position</em>}</li>
 *   <li>{@link xgen.application.MultiplicityAdjustment#getTarget <em>Target</em>}</li>
 *   <li>{@link xgen.application.MultiplicityAdjustment#getMin <em>Min</em>}</li>
 *   <li>{@link xgen.application.MultiplicityAdjustment#isUpperBounded <em>Upper Bounded</em>}</li>
 *   <li>{@link xgen.application.MultiplicityAdjustment#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.application.ApplicationPackage#getMultiplicityAdjustment()
 * @model
 * @generated
 */
public interface MultiplicityAdjustment extends EObject
{
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
   * @see xgen.application.ApplicationPackage#getMultiplicityAdjustment_Positioned()
   * @model
   * @generated
   */
  boolean isPositioned();

  /**
   * Sets the value of the '{@link xgen.application.MultiplicityAdjustment#isPositioned <em>Positioned</em>}' attribute.
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
   * @see xgen.application.ApplicationPackage#getMultiplicityAdjustment_Position()
   * @model
   * @generated
   */
  int getPosition();

  /**
   * Sets the value of the '{@link xgen.application.MultiplicityAdjustment#getPosition <em>Position</em>}' attribute.
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
   * @see xgen.application.ApplicationPackage#getMultiplicityAdjustment_Target()
   * @model
   * @generated
   */
  AbstractRule getTarget();

  /**
   * Sets the value of the '{@link xgen.application.MultiplicityAdjustment#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(AbstractRule value);

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
   * @see xgen.application.ApplicationPackage#getMultiplicityAdjustment_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link xgen.application.MultiplicityAdjustment#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

  /**
   * Returns the value of the '<em><b>Upper Bounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bounded</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bounded</em>' attribute.
   * @see #setUpperBounded(boolean)
   * @see xgen.application.ApplicationPackage#getMultiplicityAdjustment_UpperBounded()
   * @model
   * @generated
   */
  boolean isUpperBounded();

  /**
   * Sets the value of the '{@link xgen.application.MultiplicityAdjustment#isUpperBounded <em>Upper Bounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bounded</em>' attribute.
   * @see #isUpperBounded()
   * @generated
   */
  void setUpperBounded(boolean value);

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
   * @see xgen.application.ApplicationPackage#getMultiplicityAdjustment_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link xgen.application.MultiplicityAdjustment#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

} // MultiplicityAdjustment
