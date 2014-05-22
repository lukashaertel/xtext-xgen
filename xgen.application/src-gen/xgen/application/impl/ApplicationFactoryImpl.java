/**
 */
package xgen.application.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xgen.application.Application;
import xgen.application.ApplicationFactory;
import xgen.application.ApplicationPackage;
import xgen.application.Apply;
import xgen.application.ConstructReplacement;
import xgen.application.Model;
import xgen.application.RuleReplacement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApplicationFactory init()
  {
    try
    {
      ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationPackage.eNS_URI);
      if (theApplicationFactory != null)
      {
        return theApplicationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ApplicationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ApplicationPackage.MODEL: return createModel();
      case ApplicationPackage.APPLY: return createApply();
      case ApplicationPackage.CONSTRUCT_REPLACEMENT: return createConstructReplacement();
      case ApplicationPackage.RULE_REPLACEMENT: return createRuleReplacement();
      case ApplicationPackage.APPLICATION: return createApplication();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Apply createApply()
  {
    ApplyImpl apply = new ApplyImpl();
    return apply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructReplacement createConstructReplacement()
  {
    ConstructReplacementImpl constructReplacement = new ConstructReplacementImpl();
    return constructReplacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleReplacement createRuleReplacement()
  {
    RuleReplacementImpl ruleReplacement = new RuleReplacementImpl();
    return ruleReplacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationPackage getApplicationPackage()
  {
    return (ApplicationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ApplicationPackage getPackage()
  {
    return ApplicationPackage.eINSTANCE;
  }

} //ApplicationFactoryImpl
