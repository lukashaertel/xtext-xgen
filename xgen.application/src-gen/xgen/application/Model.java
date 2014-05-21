/**
 */
package xgen.application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.application.Model#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.application.ApplicationPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
   * The list contents are of type {@link xgen.application.Apply}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applications</em>' containment reference list.
   * @see xgen.application.ApplicationPackage#getModel_Applications()
   * @model containment="true"
   * @generated
   */
  EList<Apply> getApplications();

} // Model
