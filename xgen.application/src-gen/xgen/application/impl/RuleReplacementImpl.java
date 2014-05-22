/**
 */
package xgen.application.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.AbstractRule;

import xgen.application.ApplicationPackage;
import xgen.application.RuleReplacement;
import xgen.grammar.Construct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xgen.application.impl.RuleReplacementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link xgen.application.impl.RuleReplacementImpl#getReplacement <em>Replacement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleReplacementImpl extends MinimalEObjectImpl.Container implements RuleReplacement
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected AbstractRule target;

  /**
   * The cached value of the '{@link #getReplacement() <em>Replacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplacement()
   * @generated
   * @ordered
   */
  protected Construct replacement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleReplacementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplicationPackage.Literals.RULE_REPLACEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRule getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (AbstractRule)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.RULE_REPLACEMENT__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRule basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(AbstractRule newTarget)
  {
    AbstractRule oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.RULE_REPLACEMENT__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Construct getReplacement()
  {
    return replacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReplacement(Construct newReplacement, NotificationChain msgs)
  {
    Construct oldReplacement = replacement;
    replacement = newReplacement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT, oldReplacement, newReplacement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplacement(Construct newReplacement)
  {
    if (newReplacement != replacement)
    {
      NotificationChain msgs = null;
      if (replacement != null)
        msgs = ((InternalEObject)replacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT, null, msgs);
      if (newReplacement != null)
        msgs = ((InternalEObject)newReplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT, null, msgs);
      msgs = basicSetReplacement(newReplacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT, newReplacement, newReplacement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT:
        return basicSetReplacement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplicationPackage.RULE_REPLACEMENT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT:
        return getReplacement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationPackage.RULE_REPLACEMENT__TARGET:
        setTarget((AbstractRule)newValue);
        return;
      case ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT:
        setReplacement((Construct)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplicationPackage.RULE_REPLACEMENT__TARGET:
        setTarget((AbstractRule)null);
        return;
      case ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT:
        setReplacement((Construct)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplicationPackage.RULE_REPLACEMENT__TARGET:
        return target != null;
      case ApplicationPackage.RULE_REPLACEMENT__REPLACEMENT:
        return replacement != null;
    }
    return super.eIsSet(featureID);
  }

} //RuleReplacementImpl
