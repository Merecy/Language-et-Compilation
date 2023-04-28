/**
 */
package curveHTLM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curveHTLM.graph#getStyle <em>Style</em>}</li>
 *   <li>{@link curveHTLM.graph#getCurve <em>Curve</em>}</li>
 *   <li>{@link curveHTLM.graph#getName <em>Name</em>}</li>
 *   <li>{@link curveHTLM.graph#getX_axis <em>Xaxis</em>}</li>
 * </ul>
 *
 * @see curveHTLM.CurveHTLMPackage#getgraph()
 * @model
 * @generated
 */
public interface graph extends statement {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"bar"</code>.
	 * The literals are from the enumeration {@link curveHTLM.type_graph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see curveHTLM.type_graph
	 * @see #setStyle(type_graph)
	 * @see curveHTLM.CurveHTLMPackage#getgraph_Style()
	 * @model default="bar"
	 * @generated
	 */
	type_graph getStyle();

	/**
	 * Sets the value of the '{@link curveHTLM.graph#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see curveHTLM.type_graph
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(type_graph value);

	/**
	 * Returns the value of the '<em><b>Curve</b></em>' containment reference list.
	 * The list contents are of type {@link curveHTLM.curve}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve</em>' containment reference list.
	 * @see curveHTLM.CurveHTLMPackage#getgraph_Curve()
	 * @model containment="true"
	 * @generated
	 */
	EList<curve> getCurve();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see curveHTLM.CurveHTLMPackage#getgraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link curveHTLM.graph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Xaxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xaxis</em>' attribute.
	 * @see #setX_axis(String)
	 * @see curveHTLM.CurveHTLMPackage#getgraph_X_axis()
	 * @model
	 * @generated
	 */
	String getX_axis();

	/**
	 * Sets the value of the '{@link curveHTLM.graph#getX_axis <em>Xaxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xaxis</em>' attribute.
	 * @see #getX_axis()
	 * @generated
	 */
	void setX_axis(String value);

} // graph
