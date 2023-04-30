/**
 */
package curveHTLM.impl;

import curveHTLM.CurveHTLMFactory;
import curveHTLM.CurveHTLMPackage;
import curveHTLM.csv_loader;
import curveHTLM.curve;
import curveHTLM.graph;
import curveHTLM.html_generator_program;
import curveHTLM.list_color;
import curveHTLM.statement;
import curveHTLM.type_graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CurveHTLMPackageImpl extends EPackageImpl implements CurveHTLMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass html_generator_programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csv_loaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum type_graphEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum list_colorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see curveHTLM.CurveHTLMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CurveHTLMPackageImpl() {
		super(eNS_URI, CurveHTLMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CurveHTLMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CurveHTLMPackage init() {
		if (isInited)
			return (CurveHTLMPackage) EPackage.Registry.INSTANCE.getEPackage(CurveHTLMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCurveHTLMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CurveHTLMPackageImpl theCurveHTLMPackage = registeredCurveHTLMPackage instanceof CurveHTLMPackageImpl
				? (CurveHTLMPackageImpl) registeredCurveHTLMPackage
				: new CurveHTLMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCurveHTLMPackage.createPackageContents();

		// Initialize created meta-data
		theCurveHTLMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCurveHTLMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CurveHTLMPackage.eNS_URI, theCurveHTLMPackage);
		return theCurveHTLMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethtml_generator_program() {
		return html_generator_programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gethtml_generator_program_Statement() {
		return (EReference) html_generator_programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getgraph_Style() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgraph_Curve() {
		return (EReference) graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getgraph_Name() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getgraph_X_axis() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcurve() {
		return curveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcurve_Label_name() {
		return (EAttribute) curveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcurve_Legend() {
		return (EAttribute) curveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcurve_Color() {
		return (EAttribute) curveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcsv_loader() {
		return csv_loaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcsv_loader_File_name() {
		return (EAttribute) csv_loaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcsv_loader_Separator() {
		return (EAttribute) csv_loaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettype_graph() {
		return type_graphEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getlist_color() {
		return list_colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveHTLMFactory getCurveHTLMFactory() {
		return (CurveHTLMFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		html_generator_programEClass = createEClass(HTML_GENERATOR_PROGRAM);
		createEReference(html_generator_programEClass, HTML_GENERATOR_PROGRAM__STATEMENT);

		statementEClass = createEClass(STATEMENT);

		graphEClass = createEClass(GRAPH);
		createEAttribute(graphEClass, GRAPH__STYLE);
		createEReference(graphEClass, GRAPH__CURVE);
		createEAttribute(graphEClass, GRAPH__NAME);
		createEAttribute(graphEClass, GRAPH__XAXIS);

		curveEClass = createEClass(CURVE);
		createEAttribute(curveEClass, CURVE__LABEL_NAME);
		createEAttribute(curveEClass, CURVE__LEGEND);
		createEAttribute(curveEClass, CURVE__COLOR);

		csv_loaderEClass = createEClass(CSV_LOADER);
		createEAttribute(csv_loaderEClass, CSV_LOADER__FILE_NAME);
		createEAttribute(csv_loaderEClass, CSV_LOADER__SEPARATOR);

		// Create enums
		type_graphEEnum = createEEnum(TYPE_GRAPH);
		list_colorEEnum = createEEnum(LIST_COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		graphEClass.getESuperTypes().add(this.getstatement());
		csv_loaderEClass.getESuperTypes().add(this.getstatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(html_generator_programEClass, html_generator_program.class, "html_generator_program", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gethtml_generator_program_Statement(), this.getstatement(), null, "statement", null, 0, -1,
				html_generator_program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, statement.class, "statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphEClass, graph.class, "graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getgraph_Style(), this.gettype_graph(), "style", "bar", 0, 1, graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getgraph_Curve(), this.getcurve(), null, "curve", null, 0, -1, graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getgraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getgraph_X_axis(), ecorePackage.getEString(), "x_axis", null, 0, 1, graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curveEClass, curve.class, "curve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcurve_Label_name(), ecorePackage.getEString(), "label_name", null, 0, 1, curve.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcurve_Legend(), ecorePackage.getEString(), "legend", null, 0, 1, curve.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcurve_Color(), this.getlist_color(), "color", "pink", 0, 1, curve.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csv_loaderEClass, csv_loader.class, "csv_loader", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcsv_loader_File_name(), ecorePackage.getEString(), "file_name", null, 0, 1, csv_loader.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcsv_loader_Separator(), ecorePackage.getEString(), "separator", ";", 0, 1, csv_loader.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(type_graphEEnum, type_graph.class, "type_graph");
		addEEnumLiteral(type_graphEEnum, type_graph.BAR);
		addEEnumLiteral(type_graphEEnum, type_graph.LINE);
		addEEnumLiteral(type_graphEEnum, type_graph.RADAR);
		addEEnumLiteral(type_graphEEnum, type_graph.DOUGHNUT);
		addEEnumLiteral(type_graphEEnum, type_graph.PIE);

		initEEnum(list_colorEEnum, list_color.class, "list_color");
		addEEnumLiteral(list_colorEEnum, list_color.RED);
		addEEnumLiteral(list_colorEEnum, list_color.ORANGE);
		addEEnumLiteral(list_colorEEnum, list_color.YELLOW);
		addEEnumLiteral(list_colorEEnum, list_color.GREEN);
		addEEnumLiteral(list_colorEEnum, list_color.BLUE);
		addEEnumLiteral(list_colorEEnum, list_color.PURPLE);
		addEEnumLiteral(list_colorEEnum, list_color.GREY);
		addEEnumLiteral(list_colorEEnum, list_color.PINK);
		addEEnumLiteral(list_colorEEnum, list_color.LIME);
		addEEnumLiteral(list_colorEEnum, list_color.TEAL);
		addEEnumLiteral(list_colorEEnum, list_color.CYAN);
		addEEnumLiteral(list_colorEEnum, list_color.INDIGO);
		addEEnumLiteral(list_colorEEnum, list_color.BROWN);
		addEEnumLiteral(list_colorEEnum, list_color.AMBER);
		addEEnumLiteral(list_colorEEnum, list_color.BLACK);
		addEEnumLiteral(list_colorEEnum, list_color.WHITE);

		// Create resource
		createResource(eNS_URI);
	}

} //CurveHTLMPackageImpl
