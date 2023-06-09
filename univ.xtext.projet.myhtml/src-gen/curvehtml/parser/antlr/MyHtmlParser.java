/*
 * generated by Xtext 2.25.0
 */
package curvehtml.parser.antlr;

import com.google.inject.Inject;
import curvehtml.parser.antlr.internal.InternalMyHtmlParser;
import curvehtml.services.MyHtmlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MyHtmlParser extends AbstractAntlrParser {

	@Inject
	private MyHtmlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyHtmlParser createParser(XtextTokenStream stream) {
		return new InternalMyHtmlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "html_generator_program";
	}

	public MyHtmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyHtmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
