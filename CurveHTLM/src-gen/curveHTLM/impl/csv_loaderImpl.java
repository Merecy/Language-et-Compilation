/**
 */
package curveHTLM.impl;

import curveHTLM.CurveHTLMPackage;
import curveHTLM.csv_loader;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>csv loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curveHTLM.impl.csv_loaderImpl#getFile_name <em>File name</em>}</li>
 *   <li>{@link curveHTLM.impl.csv_loaderImpl#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class csv_loaderImpl extends statementImpl implements csv_loader {
	/**
	 * The default value of the '{@link #getFile_name() <em>File name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_name() <em>File name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_name()
	 * @generated
	 * @ordered
	 */
	protected String file_name = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_EDEFAULT = ";";

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected String separator = SEPARATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected csv_loaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CurveHTLMPackage.Literals.CSV_LOADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile_name() {
		return file_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile_name(String newFile_name) {
		String oldFile_name = file_name;
		file_name = newFile_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurveHTLMPackage.CSV_LOADER__FILE_NAME, oldFile_name,
					file_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(String newSeparator) {
		String oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurveHTLMPackage.CSV_LOADER__SEPARATOR, oldSeparator,
					separator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CurveHTLMPackage.CSV_LOADER__FILE_NAME:
			return getFile_name();
		case CurveHTLMPackage.CSV_LOADER__SEPARATOR:
			return getSeparator();
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
		case CurveHTLMPackage.CSV_LOADER__FILE_NAME:
			setFile_name((String) newValue);
			return;
		case CurveHTLMPackage.CSV_LOADER__SEPARATOR:
			setSeparator((String) newValue);
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
		case CurveHTLMPackage.CSV_LOADER__FILE_NAME:
			setFile_name(FILE_NAME_EDEFAULT);
			return;
		case CurveHTLMPackage.CSV_LOADER__SEPARATOR:
			setSeparator(SEPARATOR_EDEFAULT);
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
		case CurveHTLMPackage.CSV_LOADER__FILE_NAME:
			return FILE_NAME_EDEFAULT == null ? file_name != null : !FILE_NAME_EDEFAULT.equals(file_name);
		case CurveHTLMPackage.CSV_LOADER__SEPARATOR:
			return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
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
		result.append(" (file_name: ");
		result.append(file_name);
		result.append(", separator: ");
		result.append(separator);
		result.append(')');
		return result.toString();
	}

} //csv_loaderImpl
