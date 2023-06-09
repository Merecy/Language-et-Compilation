/*
 * generated by Xtext 2.25.0
 */
package curvehtml.serializer;

import com.google.inject.Inject;
import curveHTLM.CurveHTLMPackage;
import curveHTLM.csv_loader;
import curveHTLM.curve;
import curveHTLM.graph;
import curveHTLM.html_generator_program;
import curvehtml.services.MyHtmlGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class MyHtmlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyHtmlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CurveHTLMPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CurveHTLMPackage.CSV_LOADER:
				sequence_csv_loader(context, (csv_loader) semanticObject); 
				return; 
			case CurveHTLMPackage.CURVE:
				sequence_curve(context, (curve) semanticObject); 
				return; 
			case CurveHTLMPackage.GRAPH:
				sequence_graph(context, (graph) semanticObject); 
				return; 
			case CurveHTLMPackage.HTML_GENERATOR_PROGRAM:
				sequence_html_generator_program(context, (html_generator_program) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     statement returns csv_loader
	 *     csv_loader returns csv_loader
	 *
	 * Constraint:
	 *     (file_name=EString separator=EString?)
	 */
	protected void sequence_csv_loader(ISerializationContext context, csv_loader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     curve returns curve
	 *
	 * Constraint:
	 *     (label_name=EString? legend=EString? color=list_color?)
	 */
	protected void sequence_curve(ISerializationContext context, curve semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     statement returns graph
	 *     graph returns graph
	 *
	 * Constraint:
	 *     (name=EString style=type_graph x_axis=EString curve+=curve curve+=curve*)
	 */
	protected void sequence_graph(ISerializationContext context, graph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     html_generator_program returns html_generator_program
	 *
	 * Constraint:
	 *     (statement+=statement statement+=statement*)
	 */
	protected void sequence_html_generator_program(ISerializationContext context, html_generator_program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
