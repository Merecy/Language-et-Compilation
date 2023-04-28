package curvehtml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import curvehtml.services.MyHtmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyHtmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'html_generator_program'", "'{'", "';'", "'}'", "'create'", "'style'", "'='", "','", "'Xaxis'", "'open'", "'('", "'sep'", "')'", "'curve'", "'label_name'", "'legend'", "'color'", "'bar'", "'line'", "'radar'", "'doughnut'", "'pie'", "'red'", "'orange'", "'yellow'", "'green'", "'blue'", "'purple'", "'grey'", "'pink'", "'lime'", "'teal'", "'cyan'", "'indigo'", "'brown'", "'amber'", "'black'", "'white'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyHtmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyHtmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyHtmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyHtml.g"; }



     	private MyHtmlGrammarAccess grammarAccess;

        public InternalMyHtmlParser(TokenStream input, MyHtmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "html_generator_program";
       	}

       	@Override
       	protected MyHtmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulehtml_generator_program"
    // InternalMyHtml.g:65:1: entryRulehtml_generator_program returns [EObject current=null] : iv_rulehtml_generator_program= rulehtml_generator_program EOF ;
    public final EObject entryRulehtml_generator_program() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehtml_generator_program = null;


        try {
            // InternalMyHtml.g:65:63: (iv_rulehtml_generator_program= rulehtml_generator_program EOF )
            // InternalMyHtml.g:66:2: iv_rulehtml_generator_program= rulehtml_generator_program EOF
            {
             newCompositeNode(grammarAccess.getHtml_generator_programRule()); 
            pushFollow(FOLLOW_1);
            iv_rulehtml_generator_program=rulehtml_generator_program();

            state._fsp--;

             current =iv_rulehtml_generator_program; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulehtml_generator_program"


    // $ANTLR start "rulehtml_generator_program"
    // InternalMyHtml.g:72:1: rulehtml_generator_program returns [EObject current=null] : ( () otherlv_1= 'html_generator_program' otherlv_2= '{' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= rulestatement ) ) )* otherlv_6= ';' otherlv_7= '}' ) ;
    public final EObject rulehtml_generator_program() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_statement_3_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalMyHtml.g:78:2: ( ( () otherlv_1= 'html_generator_program' otherlv_2= '{' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= rulestatement ) ) )* otherlv_6= ';' otherlv_7= '}' ) )
            // InternalMyHtml.g:79:2: ( () otherlv_1= 'html_generator_program' otherlv_2= '{' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= rulestatement ) ) )* otherlv_6= ';' otherlv_7= '}' )
            {
            // InternalMyHtml.g:79:2: ( () otherlv_1= 'html_generator_program' otherlv_2= '{' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= rulestatement ) ) )* otherlv_6= ';' otherlv_7= '}' )
            // InternalMyHtml.g:80:3: () otherlv_1= 'html_generator_program' otherlv_2= '{' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= rulestatement ) ) )* otherlv_6= ';' otherlv_7= '}'
            {
            // InternalMyHtml.g:80:3: ()
            // InternalMyHtml.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHtml_generator_programAccess().getHtml_generator_programAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHtml_generator_programAccess().getHtml_generator_programKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getHtml_generator_programAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyHtml.g:95:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalMyHtml.g:96:4: (lv_statement_3_0= rulestatement )
            {
            // InternalMyHtml.g:96:4: (lv_statement_3_0= rulestatement )
            // InternalMyHtml.g:97:5: lv_statement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getHtml_generator_programAccess().getStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_statement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHtml_generator_programRule());
            					}
            					add(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"curvehtml.MyHtml.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyHtml.g:114:3: (otherlv_4= ';' ( (lv_statement_5_0= rulestatement ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==15||LA1_1==20) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyHtml.g:115:4: otherlv_4= ';' ( (lv_statement_5_0= rulestatement ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getHtml_generator_programAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalMyHtml.g:119:4: ( (lv_statement_5_0= rulestatement ) )
            	    // InternalMyHtml.g:120:5: (lv_statement_5_0= rulestatement )
            	    {
            	    // InternalMyHtml.g:120:5: (lv_statement_5_0= rulestatement )
            	    // InternalMyHtml.g:121:6: lv_statement_5_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getHtml_generator_programAccess().getStatementStatementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_statement_5_0=rulestatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHtml_generator_programRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statement",
            	    							lv_statement_5_0,
            	    							"curvehtml.MyHtml.statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getHtml_generator_programAccess().getSemicolonKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getHtml_generator_programAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulehtml_generator_program"


    // $ANTLR start "entryRulestatement"
    // InternalMyHtml.g:151:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalMyHtml.g:151:50: (iv_rulestatement= rulestatement EOF )
            // InternalMyHtml.g:152:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalMyHtml.g:158:1: rulestatement returns [EObject current=null] : (this_graph_0= rulegraph | this_csv_loader_1= rulecsv_loader ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject this_graph_0 = null;

        EObject this_csv_loader_1 = null;



        	enterRule();

        try {
            // InternalMyHtml.g:164:2: ( (this_graph_0= rulegraph | this_csv_loader_1= rulecsv_loader ) )
            // InternalMyHtml.g:165:2: (this_graph_0= rulegraph | this_csv_loader_1= rulecsv_loader )
            {
            // InternalMyHtml.g:165:2: (this_graph_0= rulegraph | this_csv_loader_1= rulecsv_loader )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyHtml.g:166:3: this_graph_0= rulegraph
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGraphParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_graph_0=rulegraph();

                    state._fsp--;


                    			current = this_graph_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyHtml.g:175:3: this_csv_loader_1= rulecsv_loader
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCsv_loaderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_csv_loader_1=rulecsv_loader();

                    state._fsp--;


                    			current = this_csv_loader_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulegraph"
    // InternalMyHtml.g:187:1: entryRulegraph returns [EObject current=null] : iv_rulegraph= rulegraph EOF ;
    public final EObject entryRulegraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegraph = null;


        try {
            // InternalMyHtml.g:187:46: (iv_rulegraph= rulegraph EOF )
            // InternalMyHtml.g:188:2: iv_rulegraph= rulegraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegraph=rulegraph();

            state._fsp--;

             current =iv_rulegraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegraph"


    // $ANTLR start "rulegraph"
    // InternalMyHtml.g:194:1: rulegraph returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'style' otherlv_5= '=' ( (lv_style_6_0= ruletype_graph ) ) otherlv_7= ',' otherlv_8= 'Xaxis' otherlv_9= '=' ( (lv_x_axis_10_0= ruleEString ) ) otherlv_11= ',' ( (lv_curve_12_0= rulecurve ) ) (otherlv_13= ',' ( (lv_curve_14_0= rulecurve ) ) )* otherlv_15= '}' ) ;
    public final EObject rulegraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_style_6_0 = null;

        AntlrDatatypeRuleToken lv_x_axis_10_0 = null;

        EObject lv_curve_12_0 = null;

        EObject lv_curve_14_0 = null;



        	enterRule();

        try {
            // InternalMyHtml.g:200:2: ( ( () otherlv_1= 'create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'style' otherlv_5= '=' ( (lv_style_6_0= ruletype_graph ) ) otherlv_7= ',' otherlv_8= 'Xaxis' otherlv_9= '=' ( (lv_x_axis_10_0= ruleEString ) ) otherlv_11= ',' ( (lv_curve_12_0= rulecurve ) ) (otherlv_13= ',' ( (lv_curve_14_0= rulecurve ) ) )* otherlv_15= '}' ) )
            // InternalMyHtml.g:201:2: ( () otherlv_1= 'create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'style' otherlv_5= '=' ( (lv_style_6_0= ruletype_graph ) ) otherlv_7= ',' otherlv_8= 'Xaxis' otherlv_9= '=' ( (lv_x_axis_10_0= ruleEString ) ) otherlv_11= ',' ( (lv_curve_12_0= rulecurve ) ) (otherlv_13= ',' ( (lv_curve_14_0= rulecurve ) ) )* otherlv_15= '}' )
            {
            // InternalMyHtml.g:201:2: ( () otherlv_1= 'create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'style' otherlv_5= '=' ( (lv_style_6_0= ruletype_graph ) ) otherlv_7= ',' otherlv_8= 'Xaxis' otherlv_9= '=' ( (lv_x_axis_10_0= ruleEString ) ) otherlv_11= ',' ( (lv_curve_12_0= rulecurve ) ) (otherlv_13= ',' ( (lv_curve_14_0= rulecurve ) ) )* otherlv_15= '}' )
            // InternalMyHtml.g:202:3: () otherlv_1= 'create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'style' otherlv_5= '=' ( (lv_style_6_0= ruletype_graph ) ) otherlv_7= ',' otherlv_8= 'Xaxis' otherlv_9= '=' ( (lv_x_axis_10_0= ruleEString ) ) otherlv_11= ',' ( (lv_curve_12_0= rulecurve ) ) (otherlv_13= ',' ( (lv_curve_14_0= rulecurve ) ) )* otherlv_15= '}'
            {
            // InternalMyHtml.g:202:3: ()
            // InternalMyHtml.g:203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAccess().getGraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphAccess().getCreateKeyword_1());
            		
            // InternalMyHtml.g:213:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyHtml.g:214:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyHtml.g:214:4: (lv_name_2_0= ruleEString )
            // InternalMyHtml.g:215:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"curvehtml.MyHtml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getStyleKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphAccess().getEqualsSignKeyword_5());
            		
            // InternalMyHtml.g:244:3: ( (lv_style_6_0= ruletype_graph ) )
            // InternalMyHtml.g:245:4: (lv_style_6_0= ruletype_graph )
            {
            // InternalMyHtml.g:245:4: (lv_style_6_0= ruletype_graph )
            // InternalMyHtml.g:246:5: lv_style_6_0= ruletype_graph
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getStyleType_graphEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_style_6_0=ruletype_graph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"style",
            						lv_style_6_0,
            						"curvehtml.MyHtml.type_graph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphAccess().getXaxisKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getGraphAccess().getEqualsSignKeyword_9());
            		
            // InternalMyHtml.g:275:3: ( (lv_x_axis_10_0= ruleEString ) )
            // InternalMyHtml.g:276:4: (lv_x_axis_10_0= ruleEString )
            {
            // InternalMyHtml.g:276:4: (lv_x_axis_10_0= ruleEString )
            // InternalMyHtml.g:277:5: lv_x_axis_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getX_axisEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_x_axis_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"x_axis",
            						lv_x_axis_10_0,
            						"curvehtml.MyHtml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getGraphAccess().getCommaKeyword_11());
            		
            // InternalMyHtml.g:298:3: ( (lv_curve_12_0= rulecurve ) )
            // InternalMyHtml.g:299:4: (lv_curve_12_0= rulecurve )
            {
            // InternalMyHtml.g:299:4: (lv_curve_12_0= rulecurve )
            // InternalMyHtml.g:300:5: lv_curve_12_0= rulecurve
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getCurveCurveParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_curve_12_0=rulecurve();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					add(
            						current,
            						"curve",
            						lv_curve_12_0,
            						"curvehtml.MyHtml.curve");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyHtml.g:317:3: (otherlv_13= ',' ( (lv_curve_14_0= rulecurve ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyHtml.g:318:4: otherlv_13= ',' ( (lv_curve_14_0= rulecurve ) )
            	    {
            	    otherlv_13=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_13, grammarAccess.getGraphAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyHtml.g:322:4: ( (lv_curve_14_0= rulecurve ) )
            	    // InternalMyHtml.g:323:5: (lv_curve_14_0= rulecurve )
            	    {
            	    // InternalMyHtml.g:323:5: (lv_curve_14_0= rulecurve )
            	    // InternalMyHtml.g:324:6: lv_curve_14_0= rulecurve
            	    {

            	    						newCompositeNode(grammarAccess.getGraphAccess().getCurveCurveParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_curve_14_0=rulecurve();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGraphRule());
            	    						}
            	    						add(
            	    							current,
            	    							"curve",
            	    							lv_curve_14_0,
            	    							"curvehtml.MyHtml.curve");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegraph"


    // $ANTLR start "entryRulecsv_loader"
    // InternalMyHtml.g:350:1: entryRulecsv_loader returns [EObject current=null] : iv_rulecsv_loader= rulecsv_loader EOF ;
    public final EObject entryRulecsv_loader() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecsv_loader = null;


        try {
            // InternalMyHtml.g:350:51: (iv_rulecsv_loader= rulecsv_loader EOF )
            // InternalMyHtml.g:351:2: iv_rulecsv_loader= rulecsv_loader EOF
            {
             newCompositeNode(grammarAccess.getCsv_loaderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecsv_loader=rulecsv_loader();

            state._fsp--;

             current =iv_rulecsv_loader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecsv_loader"


    // $ANTLR start "rulecsv_loader"
    // InternalMyHtml.g:357:1: rulecsv_loader returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= '(' ( (lv_file_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'sep' otherlv_6= '=' ( (lv_separator_7_0= ruleEString ) ) )? otherlv_8= ')' ) ;
    public final EObject rulecsv_loader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_file_name_3_0 = null;

        AntlrDatatypeRuleToken lv_separator_7_0 = null;



        	enterRule();

        try {
            // InternalMyHtml.g:363:2: ( ( () otherlv_1= 'open' otherlv_2= '(' ( (lv_file_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'sep' otherlv_6= '=' ( (lv_separator_7_0= ruleEString ) ) )? otherlv_8= ')' ) )
            // InternalMyHtml.g:364:2: ( () otherlv_1= 'open' otherlv_2= '(' ( (lv_file_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'sep' otherlv_6= '=' ( (lv_separator_7_0= ruleEString ) ) )? otherlv_8= ')' )
            {
            // InternalMyHtml.g:364:2: ( () otherlv_1= 'open' otherlv_2= '(' ( (lv_file_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'sep' otherlv_6= '=' ( (lv_separator_7_0= ruleEString ) ) )? otherlv_8= ')' )
            // InternalMyHtml.g:365:3: () otherlv_1= 'open' otherlv_2= '(' ( (lv_file_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'sep' otherlv_6= '=' ( (lv_separator_7_0= ruleEString ) ) )? otherlv_8= ')'
            {
            // InternalMyHtml.g:365:3: ()
            // InternalMyHtml.g:366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCsv_loaderAccess().getCsv_loaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCsv_loaderAccess().getOpenKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCsv_loaderAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyHtml.g:380:3: ( (lv_file_name_3_0= ruleEString ) )
            // InternalMyHtml.g:381:4: (lv_file_name_3_0= ruleEString )
            {
            // InternalMyHtml.g:381:4: (lv_file_name_3_0= ruleEString )
            // InternalMyHtml.g:382:5: lv_file_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsv_loaderAccess().getFile_nameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_file_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCsv_loaderRule());
            					}
            					set(
            						current,
            						"file_name",
            						lv_file_name_3_0,
            						"curvehtml.MyHtml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyHtml.g:399:3: (otherlv_4= ',' otherlv_5= 'sep' otherlv_6= '=' ( (lv_separator_7_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyHtml.g:400:4: otherlv_4= ',' otherlv_5= 'sep' otherlv_6= '=' ( (lv_separator_7_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getCsv_loaderAccess().getCommaKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getCsv_loaderAccess().getSepKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getCsv_loaderAccess().getEqualsSignKeyword_4_2());
                    			
                    // InternalMyHtml.g:412:4: ( (lv_separator_7_0= ruleEString ) )
                    // InternalMyHtml.g:413:5: (lv_separator_7_0= ruleEString )
                    {
                    // InternalMyHtml.g:413:5: (lv_separator_7_0= ruleEString )
                    // InternalMyHtml.g:414:6: lv_separator_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCsv_loaderAccess().getSeparatorEStringParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_separator_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCsv_loaderRule());
                    						}
                    						set(
                    							current,
                    							"separator",
                    							lv_separator_7_0,
                    							"curvehtml.MyHtml.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCsv_loaderAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecsv_loader"


    // $ANTLR start "entryRulecurve"
    // InternalMyHtml.g:440:1: entryRulecurve returns [EObject current=null] : iv_rulecurve= rulecurve EOF ;
    public final EObject entryRulecurve() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecurve = null;


        try {
            // InternalMyHtml.g:440:46: (iv_rulecurve= rulecurve EOF )
            // InternalMyHtml.g:441:2: iv_rulecurve= rulecurve EOF
            {
             newCompositeNode(grammarAccess.getCurveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecurve=rulecurve();

            state._fsp--;

             current =iv_rulecurve; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecurve"


    // $ANTLR start "rulecurve"
    // InternalMyHtml.g:447:1: rulecurve returns [EObject current=null] : ( () otherlv_1= 'curve' otherlv_2= '(' (otherlv_3= 'label_name' otherlv_4= '=' ( (lv_label_name_5_0= ruleEString ) ) )? (otherlv_6= ',' otherlv_7= 'legend' otherlv_8= '=' ( (lv_legend_9_0= ruleEString ) ) )? (otherlv_10= ',' otherlv_11= 'color' otherlv_12= '=' ( (lv_color_13_0= rulelist_color ) ) )? otherlv_14= ')' ) ;
    public final EObject rulecurve() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_label_name_5_0 = null;

        AntlrDatatypeRuleToken lv_legend_9_0 = null;

        Enumerator lv_color_13_0 = null;



        	enterRule();

        try {
            // InternalMyHtml.g:453:2: ( ( () otherlv_1= 'curve' otherlv_2= '(' (otherlv_3= 'label_name' otherlv_4= '=' ( (lv_label_name_5_0= ruleEString ) ) )? (otherlv_6= ',' otherlv_7= 'legend' otherlv_8= '=' ( (lv_legend_9_0= ruleEString ) ) )? (otherlv_10= ',' otherlv_11= 'color' otherlv_12= '=' ( (lv_color_13_0= rulelist_color ) ) )? otherlv_14= ')' ) )
            // InternalMyHtml.g:454:2: ( () otherlv_1= 'curve' otherlv_2= '(' (otherlv_3= 'label_name' otherlv_4= '=' ( (lv_label_name_5_0= ruleEString ) ) )? (otherlv_6= ',' otherlv_7= 'legend' otherlv_8= '=' ( (lv_legend_9_0= ruleEString ) ) )? (otherlv_10= ',' otherlv_11= 'color' otherlv_12= '=' ( (lv_color_13_0= rulelist_color ) ) )? otherlv_14= ')' )
            {
            // InternalMyHtml.g:454:2: ( () otherlv_1= 'curve' otherlv_2= '(' (otherlv_3= 'label_name' otherlv_4= '=' ( (lv_label_name_5_0= ruleEString ) ) )? (otherlv_6= ',' otherlv_7= 'legend' otherlv_8= '=' ( (lv_legend_9_0= ruleEString ) ) )? (otherlv_10= ',' otherlv_11= 'color' otherlv_12= '=' ( (lv_color_13_0= rulelist_color ) ) )? otherlv_14= ')' )
            // InternalMyHtml.g:455:3: () otherlv_1= 'curve' otherlv_2= '(' (otherlv_3= 'label_name' otherlv_4= '=' ( (lv_label_name_5_0= ruleEString ) ) )? (otherlv_6= ',' otherlv_7= 'legend' otherlv_8= '=' ( (lv_legend_9_0= ruleEString ) ) )? (otherlv_10= ',' otherlv_11= 'color' otherlv_12= '=' ( (lv_color_13_0= rulelist_color ) ) )? otherlv_14= ')'
            {
            // InternalMyHtml.g:455:3: ()
            // InternalMyHtml.g:456:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCurveAccess().getCurveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCurveAccess().getCurveKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getCurveAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyHtml.g:470:3: (otherlv_3= 'label_name' otherlv_4= '=' ( (lv_label_name_5_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyHtml.g:471:4: otherlv_3= 'label_name' otherlv_4= '=' ( (lv_label_name_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getCurveAccess().getLabel_nameKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getCurveAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalMyHtml.g:479:4: ( (lv_label_name_5_0= ruleEString ) )
                    // InternalMyHtml.g:480:5: (lv_label_name_5_0= ruleEString )
                    {
                    // InternalMyHtml.g:480:5: (lv_label_name_5_0= ruleEString )
                    // InternalMyHtml.g:481:6: lv_label_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCurveAccess().getLabel_nameEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_label_name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCurveRule());
                    						}
                    						set(
                    							current,
                    							"label_name",
                    							lv_label_name_5_0,
                    							"curvehtml.MyHtml.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyHtml.g:499:3: (otherlv_6= ',' otherlv_7= 'legend' otherlv_8= '=' ( (lv_legend_9_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==26) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalMyHtml.g:500:4: otherlv_6= ',' otherlv_7= 'legend' otherlv_8= '=' ( (lv_legend_9_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getCurveAccess().getCommaKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getCurveAccess().getLegendKeyword_4_1());
                    			
                    otherlv_8=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getCurveAccess().getEqualsSignKeyword_4_2());
                    			
                    // InternalMyHtml.g:512:4: ( (lv_legend_9_0= ruleEString ) )
                    // InternalMyHtml.g:513:5: (lv_legend_9_0= ruleEString )
                    {
                    // InternalMyHtml.g:513:5: (lv_legend_9_0= ruleEString )
                    // InternalMyHtml.g:514:6: lv_legend_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCurveAccess().getLegendEStringParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_legend_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCurveRule());
                    						}
                    						set(
                    							current,
                    							"legend",
                    							lv_legend_9_0,
                    							"curvehtml.MyHtml.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyHtml.g:532:3: (otherlv_10= ',' otherlv_11= 'color' otherlv_12= '=' ( (lv_color_13_0= rulelist_color ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyHtml.g:533:4: otherlv_10= ',' otherlv_11= 'color' otherlv_12= '=' ( (lv_color_13_0= rulelist_color ) )
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getCurveAccess().getCommaKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getCurveAccess().getColorKeyword_5_1());
                    			
                    otherlv_12=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getCurveAccess().getEqualsSignKeyword_5_2());
                    			
                    // InternalMyHtml.g:545:4: ( (lv_color_13_0= rulelist_color ) )
                    // InternalMyHtml.g:546:5: (lv_color_13_0= rulelist_color )
                    {
                    // InternalMyHtml.g:546:5: (lv_color_13_0= rulelist_color )
                    // InternalMyHtml.g:547:6: lv_color_13_0= rulelist_color
                    {

                    						newCompositeNode(grammarAccess.getCurveAccess().getColorList_colorEnumRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_color_13_0=rulelist_color();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCurveRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_13_0,
                    							"curvehtml.MyHtml.list_color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getCurveAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecurve"


    // $ANTLR start "entryRuleEString"
    // InternalMyHtml.g:573:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyHtml.g:573:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyHtml.g:574:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyHtml.g:580:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyHtml.g:586:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyHtml.g:587:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyHtml.g:587:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyHtml.g:588:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyHtml.g:596:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruletype_graph"
    // InternalMyHtml.g:607:1: ruletype_graph returns [Enumerator current=null] : ( (enumLiteral_0= 'bar' ) | (enumLiteral_1= 'line' ) | (enumLiteral_2= 'radar' ) | (enumLiteral_3= 'doughnut' ) | (enumLiteral_4= 'pie' ) ) ;
    public final Enumerator ruletype_graph() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyHtml.g:613:2: ( ( (enumLiteral_0= 'bar' ) | (enumLiteral_1= 'line' ) | (enumLiteral_2= 'radar' ) | (enumLiteral_3= 'doughnut' ) | (enumLiteral_4= 'pie' ) ) )
            // InternalMyHtml.g:614:2: ( (enumLiteral_0= 'bar' ) | (enumLiteral_1= 'line' ) | (enumLiteral_2= 'radar' ) | (enumLiteral_3= 'doughnut' ) | (enumLiteral_4= 'pie' ) )
            {
            // InternalMyHtml.g:614:2: ( (enumLiteral_0= 'bar' ) | (enumLiteral_1= 'line' ) | (enumLiteral_2= 'radar' ) | (enumLiteral_3= 'doughnut' ) | (enumLiteral_4= 'pie' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            case 31:
                {
                alt9=4;
                }
                break;
            case 32:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyHtml.g:615:3: (enumLiteral_0= 'bar' )
                    {
                    // InternalMyHtml.g:615:3: (enumLiteral_0= 'bar' )
                    // InternalMyHtml.g:616:4: enumLiteral_0= 'bar'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getType_graphAccess().getBarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getType_graphAccess().getBarEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyHtml.g:623:3: (enumLiteral_1= 'line' )
                    {
                    // InternalMyHtml.g:623:3: (enumLiteral_1= 'line' )
                    // InternalMyHtml.g:624:4: enumLiteral_1= 'line'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getType_graphAccess().getLineEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getType_graphAccess().getLineEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyHtml.g:631:3: (enumLiteral_2= 'radar' )
                    {
                    // InternalMyHtml.g:631:3: (enumLiteral_2= 'radar' )
                    // InternalMyHtml.g:632:4: enumLiteral_2= 'radar'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getType_graphAccess().getRadarEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getType_graphAccess().getRadarEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyHtml.g:639:3: (enumLiteral_3= 'doughnut' )
                    {
                    // InternalMyHtml.g:639:3: (enumLiteral_3= 'doughnut' )
                    // InternalMyHtml.g:640:4: enumLiteral_3= 'doughnut'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getType_graphAccess().getDoughnutEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getType_graphAccess().getDoughnutEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyHtml.g:647:3: (enumLiteral_4= 'pie' )
                    {
                    // InternalMyHtml.g:647:3: (enumLiteral_4= 'pie' )
                    // InternalMyHtml.g:648:4: enumLiteral_4= 'pie'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getType_graphAccess().getPieEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getType_graphAccess().getPieEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_graph"


    // $ANTLR start "rulelist_color"
    // InternalMyHtml.g:658:1: rulelist_color returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'orange' ) | (enumLiteral_2= 'yellow' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'grey' ) | (enumLiteral_7= 'pink' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'teal' ) | (enumLiteral_10= 'cyan' ) | (enumLiteral_11= 'indigo' ) | (enumLiteral_12= 'brown' ) | (enumLiteral_13= 'amber' ) | (enumLiteral_14= 'black' ) | (enumLiteral_15= 'white' ) ) ;
    public final Enumerator rulelist_color() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalMyHtml.g:664:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'orange' ) | (enumLiteral_2= 'yellow' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'grey' ) | (enumLiteral_7= 'pink' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'teal' ) | (enumLiteral_10= 'cyan' ) | (enumLiteral_11= 'indigo' ) | (enumLiteral_12= 'brown' ) | (enumLiteral_13= 'amber' ) | (enumLiteral_14= 'black' ) | (enumLiteral_15= 'white' ) ) )
            // InternalMyHtml.g:665:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'orange' ) | (enumLiteral_2= 'yellow' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'grey' ) | (enumLiteral_7= 'pink' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'teal' ) | (enumLiteral_10= 'cyan' ) | (enumLiteral_11= 'indigo' ) | (enumLiteral_12= 'brown' ) | (enumLiteral_13= 'amber' ) | (enumLiteral_14= 'black' ) | (enumLiteral_15= 'white' ) )
            {
            // InternalMyHtml.g:665:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'orange' ) | (enumLiteral_2= 'yellow' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'grey' ) | (enumLiteral_7= 'pink' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'teal' ) | (enumLiteral_10= 'cyan' ) | (enumLiteral_11= 'indigo' ) | (enumLiteral_12= 'brown' ) | (enumLiteral_13= 'amber' ) | (enumLiteral_14= 'black' ) | (enumLiteral_15= 'white' ) )
            int alt10=16;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 36:
                {
                alt10=4;
                }
                break;
            case 37:
                {
                alt10=5;
                }
                break;
            case 38:
                {
                alt10=6;
                }
                break;
            case 39:
                {
                alt10=7;
                }
                break;
            case 40:
                {
                alt10=8;
                }
                break;
            case 41:
                {
                alt10=9;
                }
                break;
            case 42:
                {
                alt10=10;
                }
                break;
            case 43:
                {
                alt10=11;
                }
                break;
            case 44:
                {
                alt10=12;
                }
                break;
            case 45:
                {
                alt10=13;
                }
                break;
            case 46:
                {
                alt10=14;
                }
                break;
            case 47:
                {
                alt10=15;
                }
                break;
            case 48:
                {
                alt10=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyHtml.g:666:3: (enumLiteral_0= 'red' )
                    {
                    // InternalMyHtml.g:666:3: (enumLiteral_0= 'red' )
                    // InternalMyHtml.g:667:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getList_colorAccess().getRedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyHtml.g:674:3: (enumLiteral_1= 'orange' )
                    {
                    // InternalMyHtml.g:674:3: (enumLiteral_1= 'orange' )
                    // InternalMyHtml.g:675:4: enumLiteral_1= 'orange'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getOrangeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getList_colorAccess().getOrangeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyHtml.g:682:3: (enumLiteral_2= 'yellow' )
                    {
                    // InternalMyHtml.g:682:3: (enumLiteral_2= 'yellow' )
                    // InternalMyHtml.g:683:4: enumLiteral_2= 'yellow'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getYellowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getList_colorAccess().getYellowEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyHtml.g:690:3: (enumLiteral_3= 'green' )
                    {
                    // InternalMyHtml.g:690:3: (enumLiteral_3= 'green' )
                    // InternalMyHtml.g:691:4: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getList_colorAccess().getGreenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyHtml.g:698:3: (enumLiteral_4= 'blue' )
                    {
                    // InternalMyHtml.g:698:3: (enumLiteral_4= 'blue' )
                    // InternalMyHtml.g:699:4: enumLiteral_4= 'blue'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getBlueEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getList_colorAccess().getBlueEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyHtml.g:706:3: (enumLiteral_5= 'purple' )
                    {
                    // InternalMyHtml.g:706:3: (enumLiteral_5= 'purple' )
                    // InternalMyHtml.g:707:4: enumLiteral_5= 'purple'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getPurpleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getList_colorAccess().getPurpleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyHtml.g:714:3: (enumLiteral_6= 'grey' )
                    {
                    // InternalMyHtml.g:714:3: (enumLiteral_6= 'grey' )
                    // InternalMyHtml.g:715:4: enumLiteral_6= 'grey'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getGreyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getList_colorAccess().getGreyEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyHtml.g:722:3: (enumLiteral_7= 'pink' )
                    {
                    // InternalMyHtml.g:722:3: (enumLiteral_7= 'pink' )
                    // InternalMyHtml.g:723:4: enumLiteral_7= 'pink'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getPinkEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getList_colorAccess().getPinkEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyHtml.g:730:3: (enumLiteral_8= 'lime' )
                    {
                    // InternalMyHtml.g:730:3: (enumLiteral_8= 'lime' )
                    // InternalMyHtml.g:731:4: enumLiteral_8= 'lime'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getLimeEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getList_colorAccess().getLimeEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyHtml.g:738:3: (enumLiteral_9= 'teal' )
                    {
                    // InternalMyHtml.g:738:3: (enumLiteral_9= 'teal' )
                    // InternalMyHtml.g:739:4: enumLiteral_9= 'teal'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getTealEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getList_colorAccess().getTealEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyHtml.g:746:3: (enumLiteral_10= 'cyan' )
                    {
                    // InternalMyHtml.g:746:3: (enumLiteral_10= 'cyan' )
                    // InternalMyHtml.g:747:4: enumLiteral_10= 'cyan'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getCyanEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getList_colorAccess().getCyanEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyHtml.g:754:3: (enumLiteral_11= 'indigo' )
                    {
                    // InternalMyHtml.g:754:3: (enumLiteral_11= 'indigo' )
                    // InternalMyHtml.g:755:4: enumLiteral_11= 'indigo'
                    {
                    enumLiteral_11=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getIndigoEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getList_colorAccess().getIndigoEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyHtml.g:762:3: (enumLiteral_12= 'brown' )
                    {
                    // InternalMyHtml.g:762:3: (enumLiteral_12= 'brown' )
                    // InternalMyHtml.g:763:4: enumLiteral_12= 'brown'
                    {
                    enumLiteral_12=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getBrownEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getList_colorAccess().getBrownEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyHtml.g:770:3: (enumLiteral_13= 'amber' )
                    {
                    // InternalMyHtml.g:770:3: (enumLiteral_13= 'amber' )
                    // InternalMyHtml.g:771:4: enumLiteral_13= 'amber'
                    {
                    enumLiteral_13=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getAmberEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getList_colorAccess().getAmberEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalMyHtml.g:778:3: (enumLiteral_14= 'black' )
                    {
                    // InternalMyHtml.g:778:3: (enumLiteral_14= 'black' )
                    // InternalMyHtml.g:779:4: enumLiteral_14= 'black'
                    {
                    enumLiteral_14=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getBlackEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getList_colorAccess().getBlackEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalMyHtml.g:786:3: (enumLiteral_15= 'white' )
                    {
                    // InternalMyHtml.g:786:3: (enumLiteral_15= 'white' )
                    // InternalMyHtml.g:787:4: enumLiteral_15= 'white'
                    {
                    enumLiteral_15=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getList_colorAccess().getWhiteEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getList_colorAccess().getWhiteEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelist_color"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002840000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001FFFE00000000L});

}