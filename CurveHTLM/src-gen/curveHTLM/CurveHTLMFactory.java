/**
 */
package curveHTLM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see curveHTLM.CurveHTLMPackage
 * @generated
 */
public interface CurveHTLMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CurveHTLMFactory eINSTANCE = curveHTLM.impl.CurveHTLMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>html generator program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>html generator program</em>'.
	 * @generated
	 */
	html_generator_program createhtml_generator_program();

	/**
	 * Returns a new object of class '<em>graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>graph</em>'.
	 * @generated
	 */
	graph creategraph();

	/**
	 * Returns a new object of class '<em>curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>curve</em>'.
	 * @generated
	 */
	curve createcurve();

	/**
	 * Returns a new object of class '<em>csv loader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>csv loader</em>'.
	 * @generated
	 */
	csv_loader createcsv_loader();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CurveHTLMPackage getCurveHTLMPackage();

} //CurveHTLMFactory
