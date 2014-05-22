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
import xgen.application.ConstructReplacement;

import xgen.grammar.Construct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Construct Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xgen.application.impl.ConstructReplacementImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link xgen.application.impl.ConstructReplacementImpl#isPositioned <em>Positioned</em>}</li>
 *   <li>{@link xgen.application.impl.ConstructReplacementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link xgen.application.impl.ConstructReplacementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link xgen.application.impl.ConstructReplacementImpl#getReplacement <em>Replacement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructReplacementImpl extends MinimalEObjectImpl.Container implements ConstructReplacement
{
  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected Construct selector;

  /**
   * The default value of the '{@link #isPositioned() <em>Positioned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPositioned()
   * @generated
   * @ordered
   */
  protected static final boolean POSITIONED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPositioned() <em>Positioned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPositioned()
   * @generated
   * @ordered
   */
  protected boolean positioned = POSITIONED_EDEFAULT;

  /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected static final int POSITION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected int position = POSITION_EDEFAULT;

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
  protected ConstructReplacementImpl()
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
    return ApplicationPackage.Literals.CONSTRUCT_REPLACEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Construct getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(Construct newSelector, NotificationChain msgs)
  {
    Construct oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelector(Construct newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR, newSelector, newSelector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPositioned()
  {
    return positioned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPositioned(boolean newPositioned)
  {
    boolean oldPositioned = positioned;
    positioned = newPositioned;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITIONED, oldPositioned, positioned));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(int newPosition)
  {
    int oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITION, oldPosition, position));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.CONSTRUCT_REPLACEMENT__TARGET, oldTarget, target));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONSTRUCT_REPLACEMENT__TARGET, oldTarget, target));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT, oldReplacement, newReplacement);
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
        msgs = ((InternalEObject)replacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT, null, msgs);
      if (newReplacement != null)
        msgs = ((InternalEObject)newReplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT, null, msgs);
      msgs = basicSetReplacement(newReplacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT, newReplacement, newReplacement));
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
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR:
        return basicSetSelector(null, msgs);
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT:
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
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR:
        return getSelector();
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITIONED:
        return isPositioned();
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITION:
        return getPosition();
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT:
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
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR:
        setSelector((Construct)newValue);
        return;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITIONED:
        setPositioned((Boolean)newValue);
        return;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITION:
        setPosition((Integer)newValue);
        return;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__TARGET:
        setTarget((AbstractRule)newValue);
        return;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT:
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
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR:
        setSelector((Construct)null);
        return;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITIONED:
        setPositioned(POSITIONED_EDEFAULT);
        return;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__TARGET:
        setTarget((AbstractRule)null);
        return;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT:
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
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__SELECTOR:
        return selector != null;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITIONED:
        return positioned != POSITIONED_EDEFAULT;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__POSITION:
        return position != POSITION_EDEFAULT;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__TARGET:
        return target != null;
      case ApplicationPackage.CONSTRUCT_REPLACEMENT__REPLACEMENT:
        return replacement != null;
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
    result.append(" (positioned: ");
    result.append(positioned);
    result.append(", position: ");
    result.append(position);
    result.append(')');
    return result.toString();
  }

} //ConstructReplacementImpl
