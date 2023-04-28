/**
 */
package curveHTLM.impl;

import curveHTLM.CurveHTLMPackage;
import curveHTLM.curve;

import curveHTLM.list_color;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curveHTLM.impl.curveImpl#getLabel_name <em>Label name</em>}</li>
 *   <li>{@link curveHTLM.impl.curveImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link curveHTLM.impl.curveImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class curveImpl extends MinimalEObjectImpl.Container implements curve {
	/**
	 * The default value of the '{@link #getLabel_name() <em>Label name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_name()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel_name() <em>Label name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_name()
	 * @generated
	 * @ordered
	 */
	protected String label_name = LABEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegend() <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected static final String LEGEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegend() <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected String legend = LEGEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final list_color COLOR_EDEFAULT = list_color.PINK;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected list_color color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected curveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CurveHTLMPackage.Literals.CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel_name() {
		return label_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel_name(String newLabel_name) {
		String oldLabel_name = label_name;
		label_name = newLabel_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurveHTLMPackage.CURVE__LABEL_NAME, oldLabel_name,
					label_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLegend() {
		return legend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegend(String newLegend) {
		String oldLegend = legend;
		legend = newLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurveHTLMPackage.CURVE__LEGEND, oldLegend, legend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public list_color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(list_color newColor) {
		list_color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurveHTLMPackage.CURVE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CurveHTLMPackage.CURVE__LABEL_NAME:
			return getLabel_name();
		case CurveHTLMPackage.CURVE__LEGEND:
			return getLegend();
		case CurveHTLMPackage.CURVE__COLOR:
			return getColor();
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
		switch (featureID) {
		case CurveHTLMPackage.CURVE__LABEL_NAME:
			setLabel_name((String) newValue);
			return;
		case CurveHTLMPackage.CURVE__LEGEND:
			setLegend((String) newValue);
			return;
		case CurveHTLMPackage.CURVE__COLOR:
			setColor((list_color) newValue);
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
		switch (featureID) {
		case CurveHTLMPackage.CURVE__LABEL_NAME:
			setLabel_name(LABEL_NAME_EDEFAULT);
			return;
		case CurveHTLMPackage.CURVE__LEGEND:
			setLegend(LEGEND_EDEFAULT);
			return;
		case CurveHTLMPackage.CURVE__COLOR:
			setColor(COLOR_EDEFAULT);
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
		switch (featureID) {
		case CurveHTLMPackage.CURVE__LABEL_NAME:
			return LABEL_NAME_EDEFAULT == null ? label_name != null : !LABEL_NAME_EDEFAULT.equals(label_name);
		case CurveHTLMPackage.CURVE__LEGEND:
			return LEGEND_EDEFAULT == null ? legend != null : !LEGEND_EDEFAULT.equals(legend);
		case CurveHTLMPackage.CURVE__COLOR:
			return color != COLOR_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (label_name: ");
		result.append(label_name);
		result.append(", legend: ");
		result.append(legend);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //curveImpl
