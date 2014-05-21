/**
 */
package xgen.application.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.Grammar;

import xgen.application.Application;
import xgen.application.ApplicationPackage;
import xgen.application.CallReplacement;
import xgen.application.RuleReplacement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xgen.application.impl.ApplicationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link xgen.application.impl.ApplicationImpl#getMin <em>Min</em>}</li>
 *   <li>{@link xgen.application.impl.ApplicationImpl#getMax <em>Max</em>}</li>
 *   <li>{@link xgen.application.impl.ApplicationImpl#getCallReplacements <em>Call Replacements</em>}</li>
 *   <li>{@link xgen.application.impl.ApplicationImpl#getRuleReplacements <em>Rule Replacements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends ApplyImpl implements Application
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Grammar target;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final int MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected int min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final int MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected int max = MAX_EDEFAULT;

  /**
   * The cached value of the '{@link #getCallReplacements() <em>Call Replacements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallReplacements()
   * @generated
   * @ordered
   */
  protected EList<CallReplacement> callReplacements;

  /**
   * The cached value of the '{@link #getRuleReplacements() <em>Rule Replacements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleReplacements()
   * @generated
   * @ordered
   */
  protected EList<RuleReplacement> ruleReplacements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
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
    return ApplicationPackage.Literals.APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grammar getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Grammar)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grammar basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Grammar newTarget)
  {
    Grammar oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(int newMin)
  {
    int oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(int newMax)
  {
    int oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CallReplacement> getCallReplacements()
  {
    if (callReplacements == null)
    {
      callReplacements = new EObjectContainmentEList<CallReplacement>(CallReplacement.class, this, ApplicationPackage.APPLICATION__CALL_REPLACEMENTS);
    }
    return callReplacements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RuleReplacement> getRuleReplacements()
  {
    if (ruleReplacements == null)
    {
      ruleReplacements = new EObjectContainmentEList<RuleReplacement>(RuleReplacement.class, this, ApplicationPackage.APPLICATION__RULE_REPLACEMENTS);
    }
    return ruleReplacements;
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
      case ApplicationPackage.APPLICATION__CALL_REPLACEMENTS:
        return ((InternalEList<?>)getCallReplacements()).basicRemove(otherEnd, msgs);
      case ApplicationPackage.APPLICATION__RULE_REPLACEMENTS:
        return ((InternalEList<?>)getRuleReplacements()).basicRemove(otherEnd, msgs);
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
      case ApplicationPackage.APPLICATION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ApplicationPackage.APPLICATION__MIN:
        return getMin();
      case ApplicationPackage.APPLICATION__MAX:
        return getMax();
      case ApplicationPackage.APPLICATION__CALL_REPLACEMENTS:
        return getCallReplacements();
      case ApplicationPackage.APPLICATION__RULE_REPLACEMENTS:
        return getRuleReplacements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationPackage.APPLICATION__TARGET:
        setTarget((Grammar)newValue);
        return;
      case ApplicationPackage.APPLICATION__MIN:
        setMin((Integer)newValue);
        return;
      case ApplicationPackage.APPLICATION__MAX:
        setMax((Integer)newValue);
        return;
      case ApplicationPackage.APPLICATION__CALL_REPLACEMENTS:
        getCallReplacements().clear();
        getCallReplacements().addAll((Collection<? extends CallReplacement>)newValue);
        return;
      case ApplicationPackage.APPLICATION__RULE_REPLACEMENTS:
        getRuleReplacements().clear();
        getRuleReplacements().addAll((Collection<? extends RuleReplacement>)newValue);
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
      case ApplicationPackage.APPLICATION__TARGET:
        setTarget((Grammar)null);
        return;
      case ApplicationPackage.APPLICATION__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case ApplicationPackage.APPLICATION__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case ApplicationPackage.APPLICATION__CALL_REPLACEMENTS:
        getCallReplacements().clear();
        return;
      case ApplicationPackage.APPLICATION__RULE_REPLACEMENTS:
        getRuleReplacements().clear();
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
      case ApplicationPackage.APPLICATION__TARGET:
        return target != null;
      case ApplicationPackage.APPLICATION__MIN:
        return min != MIN_EDEFAULT;
      case ApplicationPackage.APPLICATION__MAX:
        return max != MAX_EDEFAULT;
      case ApplicationPackage.APPLICATION__CALL_REPLACEMENTS:
        return callReplacements != null && !callReplacements.isEmpty();
      case ApplicationPackage.APPLICATION__RULE_REPLACEMENTS:
        return ruleReplacements != null && !ruleReplacements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
