/**
 */
package xgen.application;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xgen.application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "application";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://xgen/Application/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "application";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplicationPackage eINSTANCE = xgen.application.impl.ApplicationPackageImpl.init();

  /**
   * The meta object id for the '{@link xgen.application.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xgen.application.impl.ModelImpl
   * @see xgen.application.impl.ApplicationPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__APPLICATIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link xgen.application.impl.ApplyImpl <em>Apply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xgen.application.impl.ApplyImpl
   * @see xgen.application.impl.ApplicationPackageImpl#getApply()
   * @generated
   */
  int APPLY = 1;

  /**
   * The number of structural features of the '<em>Apply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link xgen.application.impl.CallReplacementImpl <em>Call Replacement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xgen.application.impl.CallReplacementImpl
   * @see xgen.application.impl.ApplicationPackageImpl#getCallReplacement()
   * @generated
   */
  int CALL_REPLACEMENT = 2;

  /**
   * The feature id for the '<em><b>Selector</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_REPLACEMENT__SELECTOR = 0;

  /**
   * The feature id for the '<em><b>Positioned</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_REPLACEMENT__POSITIONED = 1;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_REPLACEMENT__POSITION = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_REPLACEMENT__TARGET = 3;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_REPLACEMENT__REPLACEMENT = 4;

  /**
   * The number of structural features of the '<em>Call Replacement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_REPLACEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link xgen.application.impl.RuleReplacementImpl <em>Rule Replacement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xgen.application.impl.RuleReplacementImpl
   * @see xgen.application.impl.ApplicationPackageImpl#getRuleReplacement()
   * @generated
   */
  int RULE_REPLACEMENT = 3;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_REPLACEMENT__TARGET = 0;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_REPLACEMENT__REPLACEMENT = 1;

  /**
   * The number of structural features of the '<em>Rule Replacement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_REPLACEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link xgen.application.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xgen.application.impl.ApplicationImpl
   * @see xgen.application.impl.ApplicationPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 4;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__TARGET = APPLY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__MIN = APPLY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__MAX = APPLY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Call Replacements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__CALL_REPLACEMENTS = APPLY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rule Replacements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__RULE_REPLACEMENTS = APPLY_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = APPLY_FEATURE_COUNT + 5;


  /**
   * Returns the meta object for class '{@link xgen.application.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see xgen.application.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link xgen.application.Model#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Applications</em>'.
   * @see xgen.application.Model#getApplications()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Applications();

  /**
   * Returns the meta object for class '{@link xgen.application.Apply <em>Apply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply</em>'.
   * @see xgen.application.Apply
   * @generated
   */
  EClass getApply();

  /**
   * Returns the meta object for class '{@link xgen.application.CallReplacement <em>Call Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Replacement</em>'.
   * @see xgen.application.CallReplacement
   * @generated
   */
  EClass getCallReplacement();

  /**
   * Returns the meta object for the reference '{@link xgen.application.CallReplacement#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Selector</em>'.
   * @see xgen.application.CallReplacement#getSelector()
   * @see #getCallReplacement()
   * @generated
   */
  EReference getCallReplacement_Selector();

  /**
   * Returns the meta object for the attribute '{@link xgen.application.CallReplacement#isPositioned <em>Positioned</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Positioned</em>'.
   * @see xgen.application.CallReplacement#isPositioned()
   * @see #getCallReplacement()
   * @generated
   */
  EAttribute getCallReplacement_Positioned();

  /**
   * Returns the meta object for the attribute '{@link xgen.application.CallReplacement#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see xgen.application.CallReplacement#getPosition()
   * @see #getCallReplacement()
   * @generated
   */
  EAttribute getCallReplacement_Position();

  /**
   * Returns the meta object for the reference '{@link xgen.application.CallReplacement#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see xgen.application.CallReplacement#getTarget()
   * @see #getCallReplacement()
   * @generated
   */
  EReference getCallReplacement_Target();

  /**
   * Returns the meta object for the containment reference '{@link xgen.application.CallReplacement#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see xgen.application.CallReplacement#getReplacement()
   * @see #getCallReplacement()
   * @generated
   */
  EReference getCallReplacement_Replacement();

  /**
   * Returns the meta object for class '{@link xgen.application.RuleReplacement <em>Rule Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Replacement</em>'.
   * @see xgen.application.RuleReplacement
   * @generated
   */
  EClass getRuleReplacement();

  /**
   * Returns the meta object for the reference '{@link xgen.application.RuleReplacement#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see xgen.application.RuleReplacement#getTarget()
   * @see #getRuleReplacement()
   * @generated
   */
  EReference getRuleReplacement_Target();

  /**
   * Returns the meta object for the containment reference '{@link xgen.application.RuleReplacement#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see xgen.application.RuleReplacement#getReplacement()
   * @see #getRuleReplacement()
   * @generated
   */
  EReference getRuleReplacement_Replacement();

  /**
   * Returns the meta object for class '{@link xgen.application.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see xgen.application.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the reference '{@link xgen.application.Application#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see xgen.application.Application#getTarget()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Target();

  /**
   * Returns the meta object for the attribute '{@link xgen.application.Application#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see xgen.application.Application#getMin()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Min();

  /**
   * Returns the meta object for the attribute '{@link xgen.application.Application#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see xgen.application.Application#getMax()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Max();

  /**
   * Returns the meta object for the containment reference list '{@link xgen.application.Application#getCallReplacements <em>Call Replacements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Call Replacements</em>'.
   * @see xgen.application.Application#getCallReplacements()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_CallReplacements();

  /**
   * Returns the meta object for the containment reference list '{@link xgen.application.Application#getRuleReplacements <em>Rule Replacements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule Replacements</em>'.
   * @see xgen.application.Application#getRuleReplacements()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_RuleReplacements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ApplicationFactory getApplicationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link xgen.application.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xgen.application.impl.ModelImpl
     * @see xgen.application.impl.ApplicationPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__APPLICATIONS = eINSTANCE.getModel_Applications();

    /**
     * The meta object literal for the '{@link xgen.application.impl.ApplyImpl <em>Apply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xgen.application.impl.ApplyImpl
     * @see xgen.application.impl.ApplicationPackageImpl#getApply()
     * @generated
     */
    EClass APPLY = eINSTANCE.getApply();

    /**
     * The meta object literal for the '{@link xgen.application.impl.CallReplacementImpl <em>Call Replacement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xgen.application.impl.CallReplacementImpl
     * @see xgen.application.impl.ApplicationPackageImpl#getCallReplacement()
     * @generated
     */
    EClass CALL_REPLACEMENT = eINSTANCE.getCallReplacement();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_REPLACEMENT__SELECTOR = eINSTANCE.getCallReplacement_Selector();

    /**
     * The meta object literal for the '<em><b>Positioned</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_REPLACEMENT__POSITIONED = eINSTANCE.getCallReplacement_Positioned();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_REPLACEMENT__POSITION = eINSTANCE.getCallReplacement_Position();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_REPLACEMENT__TARGET = eINSTANCE.getCallReplacement_Target();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_REPLACEMENT__REPLACEMENT = eINSTANCE.getCallReplacement_Replacement();

    /**
     * The meta object literal for the '{@link xgen.application.impl.RuleReplacementImpl <em>Rule Replacement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xgen.application.impl.RuleReplacementImpl
     * @see xgen.application.impl.ApplicationPackageImpl#getRuleReplacement()
     * @generated
     */
    EClass RULE_REPLACEMENT = eINSTANCE.getRuleReplacement();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_REPLACEMENT__TARGET = eINSTANCE.getRuleReplacement_Target();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_REPLACEMENT__REPLACEMENT = eINSTANCE.getRuleReplacement_Replacement();

    /**
     * The meta object literal for the '{@link xgen.application.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xgen.application.impl.ApplicationImpl
     * @see xgen.application.impl.ApplicationPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__TARGET = eINSTANCE.getApplication_Target();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__MIN = eINSTANCE.getApplication_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__MAX = eINSTANCE.getApplication_Max();

    /**
     * The meta object literal for the '<em><b>Call Replacements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__CALL_REPLACEMENTS = eINSTANCE.getApplication_CallReplacements();

    /**
     * The meta object literal for the '<em><b>Rule Replacements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__RULE_REPLACEMENTS = eINSTANCE.getApplication_RuleReplacements();

  }

} //ApplicationPackage
