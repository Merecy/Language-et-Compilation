/**
 */
package curveHTLM.util;

import curveHTLM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see curveHTLM.CurveHTLMPackage
 * @generated
 */
public class CurveHTLMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CurveHTLMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveHTLMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CurveHTLMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveHTLMSwitch<Adapter> modelSwitch = new CurveHTLMSwitch<Adapter>() {
		@Override
		public Adapter casehtml_generator_program(html_generator_program object) {
			return createhtml_generator_programAdapter();
		}

		@Override
		public Adapter casestatement(statement object) {
			return createstatementAdapter();
		}

		@Override
		public Adapter casegraph(graph object) {
			return creategraphAdapter();
		}

		@Override
		public Adapter casecurve(curve object) {
			return createcurveAdapter();
		}

		@Override
		public Adapter casecsv_loader(csv_loader object) {
			return createcsv_loaderAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link curveHTLM.html_generator_program <em>html generator program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curveHTLM.html_generator_program
	 * @generated
	 */
	public Adapter createhtml_generator_programAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curveHTLM.statement <em>statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curveHTLM.statement
	 * @generated
	 */
	public Adapter createstatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curveHTLM.graph <em>graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curveHTLM.graph
	 * @generated
	 */
	public Adapter creategraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curveHTLM.curve <em>curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curveHTLM.curve
	 * @generated
	 */
	public Adapter createcurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curveHTLM.csv_loader <em>csv loader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curveHTLM.csv_loader
	 * @generated
	 */
	public Adapter createcsv_loaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CurveHTLMAdapterFactory
