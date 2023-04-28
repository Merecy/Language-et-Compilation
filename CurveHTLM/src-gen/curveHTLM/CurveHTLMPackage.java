/**
 */
package curveHTLM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see curveHTLM.CurveHTLMFactory
 * @model kind="package"
 * @generated
 */
public interface CurveHTLMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "curveHTLM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/curveHTLM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "curveHTLM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CurveHTLMPackage eINSTANCE = curveHTLM.impl.CurveHTLMPackageImpl.init();

	/**
	 * The meta object id for the '{@link curveHTLM.impl.html_generator_programImpl <em>html generator program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curveHTLM.impl.html_generator_programImpl
	 * @see curveHTLM.impl.CurveHTLMPackageImpl#gethtml_generator_program()
	 * @generated
	 */
	int HTML_GENERATOR_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_GENERATOR_PROGRAM__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>html generator program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_GENERATOR_PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>html generator program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_GENERATOR_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curveHTLM.impl.statementImpl <em>statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curveHTLM.impl.statementImpl
	 * @see curveHTLM.impl.CurveHTLMPackageImpl#getstatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curveHTLM.impl.graphImpl <em>graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curveHTLM.impl.graphImpl
	 * @see curveHTLM.impl.CurveHTLMPackageImpl#getgraph()
	 * @generated
	 */
	int GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__STYLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__CURVE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xaxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__XAXIS = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link curveHTLM.impl.curveImpl <em>curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curveHTLM.impl.curveImpl
	 * @see curveHTLM.impl.CurveHTLMPackageImpl#getcurve()
	 * @generated
	 */
	int CURVE = 3;

	/**
	 * The feature id for the '<em><b>Label name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__LABEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__LEGEND = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__COLOR = 2;

	/**
	 * The number of structural features of the '<em>curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curveHTLM.impl.csv_loaderImpl <em>csv loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curveHTLM.impl.csv_loaderImpl
	 * @see curveHTLM.impl.CurveHTLMPackageImpl#getcsv_loader()
	 * @generated
	 */
	int CSV_LOADER = 4;

	/**
	 * The feature id for the '<em><b>File name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER__FILE_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER__SEPARATOR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>csv loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>csv loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link curveHTLM.type_graph <em>type graph</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curveHTLM.type_graph
	 * @see curveHTLM.impl.CurveHTLMPackageImpl#gettype_graph()
	 * @generated
	 */
	int TYPE_GRAPH = 5;

	/**
	 * The meta object id for the '{@link curveHTLM.list_color <em>list color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curveHTLM.list_color
	 * @see curveHTLM.impl.CurveHTLMPackageImpl#getlist_color()
	 * @generated
	 */
	int LIST_COLOR = 6;

	/**
	 * Returns the meta object for class '{@link curveHTLM.html_generator_program <em>html generator program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>html generator program</em>'.
	 * @see curveHTLM.html_generator_program
	 * @generated
	 */
	EClass gethtml_generator_program();

	/**
	 * Returns the meta object for the containment reference list '{@link curveHTLM.html_generator_program#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see curveHTLM.html_generator_program#getStatement()
	 * @see #gethtml_generator_program()
	 * @generated
	 */
	EReference gethtml_generator_program_Statement();

	/**
	 * Returns the meta object for class '{@link curveHTLM.statement <em>statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>statement</em>'.
	 * @see curveHTLM.statement
	 * @generated
	 */
	EClass getstatement();

	/**
	 * Returns the meta object for class '{@link curveHTLM.graph <em>graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>graph</em>'.
	 * @see curveHTLM.graph
	 * @generated
	 */
	EClass getgraph();

	/**
	 * Returns the meta object for the attribute '{@link curveHTLM.graph#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see curveHTLM.graph#getStyle()
	 * @see #getgraph()
	 * @generated
	 */
	EAttribute getgraph_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link curveHTLM.graph#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curve</em>'.
	 * @see curveHTLM.graph#getCurve()
	 * @see #getgraph()
	 * @generated
	 */
	EReference getgraph_Curve();

	/**
	 * Returns the meta object for the attribute '{@link curveHTLM.graph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see curveHTLM.graph#getName()
	 * @see #getgraph()
	 * @generated
	 */
	EAttribute getgraph_Name();

	/**
	 * Returns the meta object for the attribute '{@link curveHTLM.graph#getX_axis <em>Xaxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xaxis</em>'.
	 * @see curveHTLM.graph#getX_axis()
	 * @see #getgraph()
	 * @generated
	 */
	EAttribute getgraph_X_axis();

	/**
	 * Returns the meta object for class '{@link curveHTLM.curve <em>curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>curve</em>'.
	 * @see curveHTLM.curve
	 * @generated
	 */
	EClass getcurve();

	/**
	 * Returns the meta object for the attribute '{@link curveHTLM.curve#getLabel_name <em>Label name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label name</em>'.
	 * @see curveHTLM.curve#getLabel_name()
	 * @see #getcurve()
	 * @generated
	 */
	EAttribute getcurve_Label_name();

	/**
	 * Returns the meta object for the attribute '{@link curveHTLM.curve#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see curveHTLM.curve#getLegend()
	 * @see #getcurve()
	 * @generated
	 */
	EAttribute getcurve_Legend();

	/**
	 * Returns the meta object for the attribute '{@link curveHTLM.curve#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see curveHTLM.curve#getColor()
	 * @see #getcurve()
	 * @generated
	 */
	EAttribute getcurve_Color();

	/**
	 * Returns the meta object for class '{@link curveHTLM.csv_loader <em>csv loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>csv loader</em>'.
	 * @see curveHTLM.csv_loader
	 * @generated
	 */
	EClass getcsv_loader();

	/**
	 * Returns the meta object for the attribute '{@link curveHTLM.csv_loader#getFile_name <em>File name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File name</em>'.
	 * @see curveHTLM.csv_loader#getFile_name()
	 * @see #getcsv_loader()
	 * @generated
	 */
	EAttribute getcsv_loader_File_name();

	/**
	 * Returns the meta object for the attribute '{@link curveHTLM.csv_loader#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see curveHTLM.csv_loader#getSeparator()
	 * @see #getcsv_loader()
	 * @generated
	 */
	EAttribute getcsv_loader_Separator();

	/**
	 * Returns the meta object for enum '{@link curveHTLM.type_graph <em>type graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type graph</em>'.
	 * @see curveHTLM.type_graph
	 * @generated
	 */
	EEnum gettype_graph();

	/**
	 * Returns the meta object for enum '{@link curveHTLM.list_color <em>list color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>list color</em>'.
	 * @see curveHTLM.list_color
	 * @generated
	 */
	EEnum getlist_color();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CurveHTLMFactory getCurveHTLMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link curveHTLM.impl.html_generator_programImpl <em>html generator program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curveHTLM.impl.html_generator_programImpl
		 * @see curveHTLM.impl.CurveHTLMPackageImpl#gethtml_generator_program()
		 * @generated
		 */
		EClass HTML_GENERATOR_PROGRAM = eINSTANCE.gethtml_generator_program();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_GENERATOR_PROGRAM__STATEMENT = eINSTANCE.gethtml_generator_program_Statement();

		/**
		 * The meta object literal for the '{@link curveHTLM.impl.statementImpl <em>statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curveHTLM.impl.statementImpl
		 * @see curveHTLM.impl.CurveHTLMPackageImpl#getstatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getstatement();

		/**
		 * The meta object literal for the '{@link curveHTLM.impl.graphImpl <em>graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curveHTLM.impl.graphImpl
		 * @see curveHTLM.impl.CurveHTLMPackageImpl#getgraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getgraph();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__STYLE = eINSTANCE.getgraph_Style();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__CURVE = eINSTANCE.getgraph_Curve();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__NAME = eINSTANCE.getgraph_Name();

		/**
		 * The meta object literal for the '<em><b>Xaxis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__XAXIS = eINSTANCE.getgraph_X_axis();

		/**
		 * The meta object literal for the '{@link curveHTLM.impl.curveImpl <em>curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curveHTLM.impl.curveImpl
		 * @see curveHTLM.impl.CurveHTLMPackageImpl#getcurve()
		 * @generated
		 */
		EClass CURVE = eINSTANCE.getcurve();

		/**
		 * The meta object literal for the '<em><b>Label name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__LABEL_NAME = eINSTANCE.getcurve_Label_name();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__LEGEND = eINSTANCE.getcurve_Legend();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__COLOR = eINSTANCE.getcurve_Color();

		/**
		 * The meta object literal for the '{@link curveHTLM.impl.csv_loaderImpl <em>csv loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curveHTLM.impl.csv_loaderImpl
		 * @see curveHTLM.impl.CurveHTLMPackageImpl#getcsv_loader()
		 * @generated
		 */
		EClass CSV_LOADER = eINSTANCE.getcsv_loader();

		/**
		 * The meta object literal for the '<em><b>File name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOADER__FILE_NAME = eINSTANCE.getcsv_loader_File_name();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOADER__SEPARATOR = eINSTANCE.getcsv_loader_Separator();

		/**
		 * The meta object literal for the '{@link curveHTLM.type_graph <em>type graph</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curveHTLM.type_graph
		 * @see curveHTLM.impl.CurveHTLMPackageImpl#gettype_graph()
		 * @generated
		 */
		EEnum TYPE_GRAPH = eINSTANCE.gettype_graph();

		/**
		 * The meta object literal for the '{@link curveHTLM.list_color <em>list color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curveHTLM.list_color
		 * @see curveHTLM.impl.CurveHTLMPackageImpl#getlist_color()
		 * @generated
		 */
		EEnum LIST_COLOR = eINSTANCE.getlist_color();

	}

} //CurveHTLMPackage
