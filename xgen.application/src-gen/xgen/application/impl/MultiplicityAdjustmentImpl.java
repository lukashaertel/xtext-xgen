/**
 */
package xgen.application.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.AbstractRule;

import xgen.application.ApplicationPackage;
import xgen.application.MultiplicityAdjustment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xgen.application.impl.MultiplicityAdjustmentImpl#isPositioned <em>Positioned</em>}</li>
 *   <li>{@link xgen.application.impl.MultiplicityAdjustmentImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link xgen.application.impl.MultiplicityAdjustmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link xgen.application.impl.MultiplicityAdjustmentImpl#getMin <em>Min</em>}</li>
 *   <li>{@link xgen.application.impl.MultiplicityAdjustmentImpl#isUpperBounded <em>Upper Bounded</em>}</li>
 *   <li>{@link xgen.application.impl.MultiplicityAdjustmentImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityAdjustmentImpl extends MinimalEObjectImpl.Container implements MultiplicityAdjustment
{
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
   * The default value of the '{@link #isUpperBounded() <em>Upper Bounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpperBounded()
   * @generated
   * @ordered
   */
  protected static final boolean UPPER_BOUNDED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUpperBounded() <em>Upper Bounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpperBounded()
   * @generated
   * @ordered
   */
  protected boolean upperBounded = UPPER_BOUNDED_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicityAdjustmentImpl()
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
    return ApplicationPackage.Literals.MULTIPLICITY_ADJUSTMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITIONED, oldPositioned, positioned));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITION, oldPosition, position));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.MULTIPLICITY_ADJUSTMENT__TARGET, oldTarget, target));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MULTIPLICITY_ADJUSTMENT__TARGET, oldTarget, target));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUpperBounded()
  {
    return upperBounded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBounded(boolean newUpperBounded)
  {
    boolean oldUpperBounded = upperBounded;
    upperBounded = newUpperBounded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MULTIPLICITY_ADJUSTMENT__UPPER_BOUNDED, oldUpperBounded, upperBounded));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MAX, oldMax, max));
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
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITIONED:
        return isPositioned();
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITION:
        return getPosition();
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MIN:
        return getMin();
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__UPPER_BOUNDED:
        return isUpperBounded();
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MAX:
        return getMax();
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
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITIONED:
        setPositioned((Boolean)newValue);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITION:
        setPosition((Integer)newValue);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__TARGET:
        setTarget((AbstractRule)newValue);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MIN:
        setMin((Integer)newValue);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__UPPER_BOUNDED:
        setUpperBounded((Boolean)newValue);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MAX:
        setMax((Integer)newValue);
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
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITIONED:
        setPositioned(POSITIONED_EDEFAULT);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__TARGET:
        setTarget((AbstractRule)null);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__UPPER_BOUNDED:
        setUpperBounded(UPPER_BOUNDED_EDEFAULT);
        return;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MAX:
        setMax(MAX_EDEFAULT);
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
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITIONED:
        return positioned != POSITIONED_EDEFAULT;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__POSITION:
        return position != POSITION_EDEFAULT;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__TARGET:
        return target != null;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MIN:
        return min != MIN_EDEFAULT;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__UPPER_BOUNDED:
        return upperBounded != UPPER_BOUNDED_EDEFAULT;
      case ApplicationPackage.MULTIPLICITY_ADJUSTMENT__MAX:
        return max != MAX_EDEFAULT;
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
    result.append(", min: ");
    result.append(min);
    result.append(", upperBounded: ");
    result.append(upperBounded);
    result.append(", max: ");
    result.append(max);
    result.append(')');
    return result.toString();
  }

} //MultiplicityAdjustmentImpl
