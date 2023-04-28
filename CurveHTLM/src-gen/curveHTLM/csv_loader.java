/**
 */
package curveHTLM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>csv loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curveHTLM.csv_loader#getFile_name <em>File name</em>}</li>
 *   <li>{@link curveHTLM.csv_loader#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @see curveHTLM.CurveHTLMPackage#getcsv_loader()
 * @model
 * @generated
 */
public interface csv_loader extends statement {
	/**
	 * Returns the value of the '<em><b>File name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File name</em>' attribute.
	 * @see #setFile_name(String)
	 * @see curveHTLM.CurveHTLMPackage#getcsv_loader_File_name()
	 * @model
	 * @generated
	 */
	String getFile_name();

	/**
	 * Sets the value of the '{@link curveHTLM.csv_loader#getFile_name <em>File name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File name</em>' attribute.
	 * @see #getFile_name()
	 * @generated
	 */
	void setFile_name(String value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * The default value is <code>";"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(String)
	 * @see curveHTLM.CurveHTLMPackage#getcsv_loader_Separator()
	 * @model default=";"
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link curveHTLM.csv_loader#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

} // csv_loader
