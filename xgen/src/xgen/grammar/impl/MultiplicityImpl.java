/**
 */
package xgen.grammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xgen.grammar.GrammarPackage;
import xgen.grammar.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xgen.grammar.impl.MultiplicityImpl#getMin <em>Min</em>}</li>
 *   <li>{@link xgen.grammar.impl.MultiplicityImpl#getMax <em>Max</em>}</li>
 *   <li>{@link xgen.grammar.impl.MultiplicityImpl#isUpperBounded <em>Upper Bounded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityImpl extends UnaryImpl implements Multiplicity {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.MULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.MULTIPLICITY__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.MULTIPLICITY__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpperBounded() {
		return upperBounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBounded(boolean newUpperBounded) {
		boolean oldUpperBounded = upperBounded;
		upperBounded = newUpperBounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.MULTIPLICITY__UPPER_BOUNDED, oldUpperBounded, upperBounded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case GrammarPackage.MULTIPLICITY__MIN:
				return getMin();
			case GrammarPackage.MULTIPLICITY__MAX:
				return getMax();
			case GrammarPackage.MULTIPLICITY__UPPER_BOUNDED:
				return isUpperBounded();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case GrammarPackage.MULTIPLICITY__MIN:
				setMin((Integer)newValue);
				return;
			case GrammarPackage.MULTIPLICITY__MAX:
				setMax((Integer)newValue);
				return;
			case GrammarPackage.MULTIPLICITY__UPPER_BOUNDED:
				setUpperBounded((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case GrammarPackage.MULTIPLICITY__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case GrammarPackage.MULTIPLICITY__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case GrammarPackage.MULTIPLICITY__UPPER_BOUNDED:
				setUpperBounded(UPPER_BOUNDED_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case GrammarPackage.MULTIPLICITY__MIN:
				return min != MIN_EDEFAULT;
			case GrammarPackage.MULTIPLICITY__MAX:
				return max != MAX_EDEFAULT;
			case GrammarPackage.MULTIPLICITY__UPPER_BOUNDED:
				return upperBounded != UPPER_BOUNDED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", upperBounded: ");
		result.append(upperBounded);
		result.append(')');
		return result.toString();
	}

} //MultiplicityImpl
