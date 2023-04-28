/**
 */
package curveHTLM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curveHTLM.curve#getLabel_name <em>Label name</em>}</li>
 *   <li>{@link curveHTLM.curve#getLegend <em>Legend</em>}</li>
 *   <li>{@link curveHTLM.curve#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see curveHTLM.CurveHTLMPackage#getcurve()
 * @model
 * @generated
 */
public interface curve extends EObject {
	/**
	 * Returns the value of the '<em><b>Label name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label name</em>' attribute.
	 * @see #setLabel_name(String)
	 * @see curveHTLM.CurveHTLMPackage#getcurve_Label_name()
	 * @model
	 * @generated
	 */
	String getLabel_name();

	/**
	 * Sets the value of the '{@link curveHTLM.curve#getLabel_name <em>Label name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label name</em>' attribute.
	 * @see #getLabel_name()
	 * @generated
	 */
	void setLabel_name(String value);

	/**
	 * Returns the value of the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend</em>' attribute.
	 * @see #setLegend(String)
	 * @see curveHTLM.CurveHTLMPackage#getcurve_Legend()
	 * @model
	 * @generated
	 */
	String getLegend();

	/**
	 * Sets the value of the '{@link curveHTLM.curve#getLegend <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' attribute.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"pink"</code>.
	 * The literals are from the enumeration {@link curveHTLM.list_color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see curveHTLM.list_color
	 * @see #setColor(list_color)
	 * @see curveHTLM.CurveHTLMPackage#getcurve_Color()
	 * @model default="pink"
	 * @generated
	 */
	list_color getColor();

	/**
	 * Sets the value of the '{@link curveHTLM.curve#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see curveHTLM.list_color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(list_color value);

} // curve
