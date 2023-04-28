/**
 */
package curveHTLM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>html generator program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curveHTLM.html_generator_program#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see curveHTLM.CurveHTLMPackage#gethtml_generator_program()
 * @model
 * @generated
 */
public interface html_generator_program extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link curveHTLM.statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see curveHTLM.CurveHTLMPackage#gethtml_generator_program_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<statement> getStatement();

} // html_generator_program
