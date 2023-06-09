/*
 * generated by Xtext 2.25.0
 */
package curvehtml.formatting2

import com.google.inject.Inject
import curveHTLM.graph
import curveHTLM.html_generator_program
import curvehtml.services.MyHtmlGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class MyHtmlFormatter extends AbstractFormatter2 {
	
	@Inject extension MyHtmlGrammarAccess

	def dispatch void format(html_generator_program html_generator_program, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (statement : html_generator_program.statement) {
			statement.format
		}
	}

	def dispatch void format(graph graph, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (curve : graph.curve) {
			curve.format
		}
	}
	
}
