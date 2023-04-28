/*
 * generated by Xtext 2.25.0
 */
package curvehtml.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import curvehtml.ide.contentassist.antlr.internal.InternalMyHtmlParser;
import curvehtml.services.MyHtmlGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyHtmlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyHtmlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyHtmlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getType_graphAccess().getAlternatives(), "rule__Type_graph__Alternatives");
			builder.put(grammarAccess.getList_colorAccess().getAlternatives(), "rule__List_color__Alternatives");
			builder.put(grammarAccess.getHtml_generator_programAccess().getGroup(), "rule__Html_generator_program__Group__0");
			builder.put(grammarAccess.getHtml_generator_programAccess().getGroup_4(), "rule__Html_generator_program__Group_4__0");
			builder.put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
			builder.put(grammarAccess.getGraphAccess().getGroup_13(), "rule__Graph__Group_13__0");
			builder.put(grammarAccess.getCsv_loaderAccess().getGroup(), "rule__Csv_loader__Group__0");
			builder.put(grammarAccess.getCsv_loaderAccess().getGroup_4(), "rule__Csv_loader__Group_4__0");
			builder.put(grammarAccess.getCurveAccess().getGroup(), "rule__Curve__Group__0");
			builder.put(grammarAccess.getCurveAccess().getGroup_3(), "rule__Curve__Group_3__0");
			builder.put(grammarAccess.getCurveAccess().getGroup_4(), "rule__Curve__Group_4__0");
			builder.put(grammarAccess.getCurveAccess().getGroup_5(), "rule__Curve__Group_5__0");
			builder.put(grammarAccess.getHtml_generator_programAccess().getStatementAssignment_3(), "rule__Html_generator_program__StatementAssignment_3");
			builder.put(grammarAccess.getHtml_generator_programAccess().getStatementAssignment_4_1(), "rule__Html_generator_program__StatementAssignment_4_1");
			builder.put(grammarAccess.getGraphAccess().getNameAssignment_2(), "rule__Graph__NameAssignment_2");
			builder.put(grammarAccess.getGraphAccess().getStyleAssignment_6(), "rule__Graph__StyleAssignment_6");
			builder.put(grammarAccess.getGraphAccess().getX_axisAssignment_10(), "rule__Graph__X_axisAssignment_10");
			builder.put(grammarAccess.getGraphAccess().getCurveAssignment_12(), "rule__Graph__CurveAssignment_12");
			builder.put(grammarAccess.getGraphAccess().getCurveAssignment_13_1(), "rule__Graph__CurveAssignment_13_1");
			builder.put(grammarAccess.getCsv_loaderAccess().getFile_nameAssignment_3(), "rule__Csv_loader__File_nameAssignment_3");
			builder.put(grammarAccess.getCsv_loaderAccess().getSeparatorAssignment_4_3(), "rule__Csv_loader__SeparatorAssignment_4_3");
			builder.put(grammarAccess.getCurveAccess().getLabel_nameAssignment_3_2(), "rule__Curve__Label_nameAssignment_3_2");
			builder.put(grammarAccess.getCurveAccess().getLegendAssignment_4_3(), "rule__Curve__LegendAssignment_4_3");
			builder.put(grammarAccess.getCurveAccess().getColorAssignment_5_3(), "rule__Curve__ColorAssignment_5_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyHtmlGrammarAccess grammarAccess;

	@Override
	protected InternalMyHtmlParser createParser() {
		InternalMyHtmlParser result = new InternalMyHtmlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyHtmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyHtmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
