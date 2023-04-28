/**
 */
package curveHTLM.impl;

import curveHTLM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CurveHTLMFactoryImpl extends EFactoryImpl implements CurveHTLMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CurveHTLMFactory init() {
		try {
			CurveHTLMFactory theCurveHTLMFactory = (CurveHTLMFactory) EPackage.Registry.INSTANCE
					.getEFactory(CurveHTLMPackage.eNS_URI);
			if (theCurveHTLMFactory != null) {
				return theCurveHTLMFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CurveHTLMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveHTLMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CurveHTLMPackage.HTML_GENERATOR_PROGRAM:
			return createhtml_generator_program();
		case CurveHTLMPackage.GRAPH:
			return creategraph();
		case CurveHTLMPackage.CURVE:
			return createcurve();
		case CurveHTLMPackage.CSV_LOADER:
			return createcsv_loader();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CurveHTLMPackage.TYPE_GRAPH:
			return createtype_graphFromString(eDataType, initialValue);
		case CurveHTLMPackage.LIST_COLOR:
			return createlist_colorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CurveHTLMPackage.TYPE_GRAPH:
			return converttype_graphToString(eDataType, instanceValue);
		case CurveHTLMPackage.LIST_COLOR:
			return convertlist_colorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public html_generator_program createhtml_generator_program() {
		html_generator_programImpl html_generator_program = new html_generator_programImpl();
		return html_generator_program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public graph creategraph() {
		graphImpl graph = new graphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public curve createcurve() {
		curveImpl curve = new curveImpl();
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public csv_loader createcsv_loader() {
		csv_loaderImpl csv_loader = new csv_loaderImpl();
		return csv_loader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public type_graph createtype_graphFromString(EDataType eDataType, String initialValue) {
		type_graph result = type_graph.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttype_graphToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public list_color createlist_colorFromString(EDataType eDataType, String initialValue) {
		list_color result = list_color.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlist_colorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveHTLMPackage getCurveHTLMPackage() {
		return (CurveHTLMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CurveHTLMPackage getPackage() {
		return CurveHTLMPackage.eINSTANCE;
	}

} //CurveHTLMFactoryImpl
