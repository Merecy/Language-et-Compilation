/**
 */
package curveHTLM.impl;

import curveHTLM.CurveHTLMPackage;
import curveHTLM.curve;
import curveHTLM.graph;
import curveHTLM.type_graph;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curveHTLM.impl.graphImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link curveHTLM.impl.graphImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link curveHTLM.impl.graphImpl#getName <em>Name</em>}</li>
 *   <li>{@link curveHTLM.impl.graphImpl#getX_axis <em>Xaxis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class graphImpl extends statementImpl implements graph {
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final type_graph STYLE_EDEFAULT = type_graph.BAR;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected type_graph style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<curve> curve;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getX_axis() <em>Xaxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_axis()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX_axis() <em>Xaxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_axis()
	 * @generated
	 * @ordered
	 */
	protected String x_axis = XAXIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected graphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CurveHTLMPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public type_graph getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(type_graph newStyle) {
		type_graph oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurveHTLMPackage.GRAPH__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<curve> getCurve() {
		if (curve == null) {
			curve = new EObjectContainmentEList<curve>(curve.class, this, CurveHTLMPackage.GRAPH__CURVE);
		}
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurveHTLMPackage.GRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX_axis() {
		return x_axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_axis(String newX_axis) {
		String oldX_axis = x_axis;
		x_axis = newX_axis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurveHTLMPackage.GRAPH__XAXIS, oldX_axis, x_axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CurveHTLMPackage.GRAPH__CURVE:
			return ((InternalEList<?>) getCurve()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CurveHTLMPackage.GRAPH__STYLE:
			return getStyle();
		case CurveHTLMPackage.GRAPH__CURVE:
			return getCurve();
		case CurveHTLMPackage.GRAPH__NAME:
			return getName();
		case CurveHTLMPackage.GRAPH__XAXIS:
			return getX_axis();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CurveHTLMPackage.GRAPH__STYLE:
			setStyle((type_graph) newValue);
			return;
		case CurveHTLMPackage.GRAPH__CURVE:
			getCurve().clear();
			getCurve().addAll((Collection<? extends curve>) newValue);
			return;
		case CurveHTLMPackage.GRAPH__NAME:
			setName((String) newValue);
			return;
		case CurveHTLMPackage.GRAPH__XAXIS:
			setX_axis((String) newValue);
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
		case CurveHTLMPackage.GRAPH__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case CurveHTLMPackage.GRAPH__CURVE:
			getCurve().clear();
			return;
		case CurveHTLMPackage.GRAPH__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CurveHTLMPackage.GRAPH__XAXIS:
			setX_axis(XAXIS_EDEFAULT);
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
		case CurveHTLMPackage.GRAPH__STYLE:
			return style != STYLE_EDEFAULT;
		case CurveHTLMPackage.GRAPH__CURVE:
			return curve != null && !curve.isEmpty();
		case CurveHTLMPackage.GRAPH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CurveHTLMPackage.GRAPH__XAXIS:
			return XAXIS_EDEFAULT == null ? x_axis != null : !XAXIS_EDEFAULT.equals(x_axis);
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
		result.append(" (style: ");
		result.append(style);
		result.append(", name: ");
		result.append(name);
		result.append(", x_axis: ");
		result.append(x_axis);
		result.append(')');
		return result.toString();
	}

} //graphImpl
