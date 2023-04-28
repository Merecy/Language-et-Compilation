package curvehtml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import curvehtml.services.MyHtmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyHtmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bar'", "'line'", "'radar'", "'doughnut'", "'pie'", "'red'", "'orange'", "'yellow'", "'green'", "'blue'", "'purple'", "'grey'", "'pink'", "'lime'", "'teal'", "'cyan'", "'indigo'", "'brown'", "'amber'", "'black'", "'white'", "'html_generator_program'", "'{'", "';'", "'}'", "'create'", "'style'", "'='", "','", "'Xaxis'", "'open'", "'('", "')'", "'sep'", "'curve'", "'label_name'", "'legend'", "'color'"
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

    	public void setGrammarAccess(MyHtmlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulehtml_generator_program"
    // InternalMyHtml.g:53:1: entryRulehtml_generator_program : rulehtml_generator_program EOF ;
    public final void entryRulehtml_generator_program() throws RecognitionException {
        try {
            // InternalMyHtml.g:54:1: ( rulehtml_generator_program EOF )
            // InternalMyHtml.g:55:1: rulehtml_generator_program EOF
            {
             before(grammarAccess.getHtml_generator_programRule()); 
            pushFollow(FOLLOW_1);
            rulehtml_generator_program();

            state._fsp--;

             after(grammarAccess.getHtml_generator_programRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulehtml_generator_program"


    // $ANTLR start "rulehtml_generator_program"
    // InternalMyHtml.g:62:1: rulehtml_generator_program : ( ( rule__Html_generator_program__Group__0 ) ) ;
    public final void rulehtml_generator_program() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:66:2: ( ( ( rule__Html_generator_program__Group__0 ) ) )
            // InternalMyHtml.g:67:2: ( ( rule__Html_generator_program__Group__0 ) )
            {
            // InternalMyHtml.g:67:2: ( ( rule__Html_generator_program__Group__0 ) )
            // InternalMyHtml.g:68:3: ( rule__Html_generator_program__Group__0 )
            {
             before(grammarAccess.getHtml_generator_programAccess().getGroup()); 
            // InternalMyHtml.g:69:3: ( rule__Html_generator_program__Group__0 )
            // InternalMyHtml.g:69:4: rule__Html_generator_program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHtml_generator_programAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehtml_generator_program"


    // $ANTLR start "entryRulestatement"
    // InternalMyHtml.g:78:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // InternalMyHtml.g:79:1: ( rulestatement EOF )
            // InternalMyHtml.g:80:1: rulestatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalMyHtml.g:87:1: rulestatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyHtml.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyHtml.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyHtml.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyHtml.g:94:3: ( rule__Statement__Alternatives )
            // InternalMyHtml.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulegraph"
    // InternalMyHtml.g:103:1: entryRulegraph : rulegraph EOF ;
    public final void entryRulegraph() throws RecognitionException {
        try {
            // InternalMyHtml.g:104:1: ( rulegraph EOF )
            // InternalMyHtml.g:105:1: rulegraph EOF
            {
             before(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            rulegraph();

            state._fsp--;

             after(grammarAccess.getGraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegraph"


    // $ANTLR start "rulegraph"
    // InternalMyHtml.g:112:1: rulegraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void rulegraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:116:2: ( ( ( rule__Graph__Group__0 ) ) )
            // InternalMyHtml.g:117:2: ( ( rule__Graph__Group__0 ) )
            {
            // InternalMyHtml.g:117:2: ( ( rule__Graph__Group__0 ) )
            // InternalMyHtml.g:118:3: ( rule__Graph__Group__0 )
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // InternalMyHtml.g:119:3: ( rule__Graph__Group__0 )
            // InternalMyHtml.g:119:4: rule__Graph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegraph"


    // $ANTLR start "entryRulecsv_loader"
    // InternalMyHtml.g:128:1: entryRulecsv_loader : rulecsv_loader EOF ;
    public final void entryRulecsv_loader() throws RecognitionException {
        try {
            // InternalMyHtml.g:129:1: ( rulecsv_loader EOF )
            // InternalMyHtml.g:130:1: rulecsv_loader EOF
            {
             before(grammarAccess.getCsv_loaderRule()); 
            pushFollow(FOLLOW_1);
            rulecsv_loader();

            state._fsp--;

             after(grammarAccess.getCsv_loaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecsv_loader"


    // $ANTLR start "rulecsv_loader"
    // InternalMyHtml.g:137:1: rulecsv_loader : ( ( rule__Csv_loader__Group__0 ) ) ;
    public final void rulecsv_loader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:141:2: ( ( ( rule__Csv_loader__Group__0 ) ) )
            // InternalMyHtml.g:142:2: ( ( rule__Csv_loader__Group__0 ) )
            {
            // InternalMyHtml.g:142:2: ( ( rule__Csv_loader__Group__0 ) )
            // InternalMyHtml.g:143:3: ( rule__Csv_loader__Group__0 )
            {
             before(grammarAccess.getCsv_loaderAccess().getGroup()); 
            // InternalMyHtml.g:144:3: ( rule__Csv_loader__Group__0 )
            // InternalMyHtml.g:144:4: rule__Csv_loader__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCsv_loaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecsv_loader"


    // $ANTLR start "entryRulecurve"
    // InternalMyHtml.g:153:1: entryRulecurve : rulecurve EOF ;
    public final void entryRulecurve() throws RecognitionException {
        try {
            // InternalMyHtml.g:154:1: ( rulecurve EOF )
            // InternalMyHtml.g:155:1: rulecurve EOF
            {
             before(grammarAccess.getCurveRule()); 
            pushFollow(FOLLOW_1);
            rulecurve();

            state._fsp--;

             after(grammarAccess.getCurveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecurve"


    // $ANTLR start "rulecurve"
    // InternalMyHtml.g:162:1: rulecurve : ( ( rule__Curve__Group__0 ) ) ;
    public final void rulecurve() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:166:2: ( ( ( rule__Curve__Group__0 ) ) )
            // InternalMyHtml.g:167:2: ( ( rule__Curve__Group__0 ) )
            {
            // InternalMyHtml.g:167:2: ( ( rule__Curve__Group__0 ) )
            // InternalMyHtml.g:168:3: ( rule__Curve__Group__0 )
            {
             before(grammarAccess.getCurveAccess().getGroup()); 
            // InternalMyHtml.g:169:3: ( rule__Curve__Group__0 )
            // InternalMyHtml.g:169:4: rule__Curve__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Curve__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCurveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecurve"


    // $ANTLR start "entryRuleEString"
    // InternalMyHtml.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyHtml.g:179:1: ( ruleEString EOF )
            // InternalMyHtml.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyHtml.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyHtml.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyHtml.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMyHtml.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyHtml.g:194:3: ( rule__EString__Alternatives )
            // InternalMyHtml.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruletype_graph"
    // InternalMyHtml.g:203:1: ruletype_graph : ( ( rule__Type_graph__Alternatives ) ) ;
    public final void ruletype_graph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:207:1: ( ( ( rule__Type_graph__Alternatives ) ) )
            // InternalMyHtml.g:208:2: ( ( rule__Type_graph__Alternatives ) )
            {
            // InternalMyHtml.g:208:2: ( ( rule__Type_graph__Alternatives ) )
            // InternalMyHtml.g:209:3: ( rule__Type_graph__Alternatives )
            {
             before(grammarAccess.getType_graphAccess().getAlternatives()); 
            // InternalMyHtml.g:210:3: ( rule__Type_graph__Alternatives )
            // InternalMyHtml.g:210:4: rule__Type_graph__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type_graph__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getType_graphAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_graph"


    // $ANTLR start "rulelist_color"
    // InternalMyHtml.g:219:1: rulelist_color : ( ( rule__List_color__Alternatives ) ) ;
    public final void rulelist_color() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:223:1: ( ( ( rule__List_color__Alternatives ) ) )
            // InternalMyHtml.g:224:2: ( ( rule__List_color__Alternatives ) )
            {
            // InternalMyHtml.g:224:2: ( ( rule__List_color__Alternatives ) )
            // InternalMyHtml.g:225:3: ( rule__List_color__Alternatives )
            {
             before(grammarAccess.getList_colorAccess().getAlternatives()); 
            // InternalMyHtml.g:226:3: ( rule__List_color__Alternatives )
            // InternalMyHtml.g:226:4: rule__List_color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__List_color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getList_colorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelist_color"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyHtml.g:234:1: rule__Statement__Alternatives : ( ( rulegraph ) | ( rulecsv_loader ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:238:1: ( ( rulegraph ) | ( rulecsv_loader ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyHtml.g:239:2: ( rulegraph )
                    {
                    // InternalMyHtml.g:239:2: ( rulegraph )
                    // InternalMyHtml.g:240:3: rulegraph
                    {
                     before(grammarAccess.getStatementAccess().getGraphParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulegraph();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGraphParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyHtml.g:245:2: ( rulecsv_loader )
                    {
                    // InternalMyHtml.g:245:2: ( rulecsv_loader )
                    // InternalMyHtml.g:246:3: rulecsv_loader
                    {
                     before(grammarAccess.getStatementAccess().getCsv_loaderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulecsv_loader();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCsv_loaderParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyHtml.g:255:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:259:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyHtml.g:260:2: ( RULE_STRING )
                    {
                    // InternalMyHtml.g:260:2: ( RULE_STRING )
                    // InternalMyHtml.g:261:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyHtml.g:266:2: ( RULE_ID )
                    {
                    // InternalMyHtml.g:266:2: ( RULE_ID )
                    // InternalMyHtml.g:267:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Type_graph__Alternatives"
    // InternalMyHtml.g:276:1: rule__Type_graph__Alternatives : ( ( ( 'bar' ) ) | ( ( 'line' ) ) | ( ( 'radar' ) ) | ( ( 'doughnut' ) ) | ( ( 'pie' ) ) );
    public final void rule__Type_graph__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:280:1: ( ( ( 'bar' ) ) | ( ( 'line' ) ) | ( ( 'radar' ) ) | ( ( 'doughnut' ) ) | ( ( 'pie' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyHtml.g:281:2: ( ( 'bar' ) )
                    {
                    // InternalMyHtml.g:281:2: ( ( 'bar' ) )
                    // InternalMyHtml.g:282:3: ( 'bar' )
                    {
                     before(grammarAccess.getType_graphAccess().getBarEnumLiteralDeclaration_0()); 
                    // InternalMyHtml.g:283:3: ( 'bar' )
                    // InternalMyHtml.g:283:4: 'bar'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getType_graphAccess().getBarEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyHtml.g:287:2: ( ( 'line' ) )
                    {
                    // InternalMyHtml.g:287:2: ( ( 'line' ) )
                    // InternalMyHtml.g:288:3: ( 'line' )
                    {
                     before(grammarAccess.getType_graphAccess().getLineEnumLiteralDeclaration_1()); 
                    // InternalMyHtml.g:289:3: ( 'line' )
                    // InternalMyHtml.g:289:4: 'line'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getType_graphAccess().getLineEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyHtml.g:293:2: ( ( 'radar' ) )
                    {
                    // InternalMyHtml.g:293:2: ( ( 'radar' ) )
                    // InternalMyHtml.g:294:3: ( 'radar' )
                    {
                     before(grammarAccess.getType_graphAccess().getRadarEnumLiteralDeclaration_2()); 
                    // InternalMyHtml.g:295:3: ( 'radar' )
                    // InternalMyHtml.g:295:4: 'radar'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getType_graphAccess().getRadarEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyHtml.g:299:2: ( ( 'doughnut' ) )
                    {
                    // InternalMyHtml.g:299:2: ( ( 'doughnut' ) )
                    // InternalMyHtml.g:300:3: ( 'doughnut' )
                    {
                     before(grammarAccess.getType_graphAccess().getDoughnutEnumLiteralDeclaration_3()); 
                    // InternalMyHtml.g:301:3: ( 'doughnut' )
                    // InternalMyHtml.g:301:4: 'doughnut'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getType_graphAccess().getDoughnutEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyHtml.g:305:2: ( ( 'pie' ) )
                    {
                    // InternalMyHtml.g:305:2: ( ( 'pie' ) )
                    // InternalMyHtml.g:306:3: ( 'pie' )
                    {
                     before(grammarAccess.getType_graphAccess().getPieEnumLiteralDeclaration_4()); 
                    // InternalMyHtml.g:307:3: ( 'pie' )
                    // InternalMyHtml.g:307:4: 'pie'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getType_graphAccess().getPieEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_graph__Alternatives"


    // $ANTLR start "rule__List_color__Alternatives"
    // InternalMyHtml.g:315:1: rule__List_color__Alternatives : ( ( ( 'red' ) ) | ( ( 'orange' ) ) | ( ( 'yellow' ) ) | ( ( 'green' ) ) | ( ( 'blue' ) ) | ( ( 'purple' ) ) | ( ( 'grey' ) ) | ( ( 'pink' ) ) | ( ( 'lime' ) ) | ( ( 'teal' ) ) | ( ( 'cyan' ) ) | ( ( 'indigo' ) ) | ( ( 'brown' ) ) | ( ( 'amber' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) );
    public final void rule__List_color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:319:1: ( ( ( 'red' ) ) | ( ( 'orange' ) ) | ( ( 'yellow' ) ) | ( ( 'green' ) ) | ( ( 'blue' ) ) | ( ( 'purple' ) ) | ( ( 'grey' ) ) | ( ( 'pink' ) ) | ( ( 'lime' ) ) | ( ( 'teal' ) ) | ( ( 'cyan' ) ) | ( ( 'indigo' ) ) | ( ( 'brown' ) ) | ( ( 'amber' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) )
            int alt4=16;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            case 21:
                {
                alt4=6;
                }
                break;
            case 22:
                {
                alt4=7;
                }
                break;
            case 23:
                {
                alt4=8;
                }
                break;
            case 24:
                {
                alt4=9;
                }
                break;
            case 25:
                {
                alt4=10;
                }
                break;
            case 26:
                {
                alt4=11;
                }
                break;
            case 27:
                {
                alt4=12;
                }
                break;
            case 28:
                {
                alt4=13;
                }
                break;
            case 29:
                {
                alt4=14;
                }
                break;
            case 30:
                {
                alt4=15;
                }
                break;
            case 31:
                {
                alt4=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyHtml.g:320:2: ( ( 'red' ) )
                    {
                    // InternalMyHtml.g:320:2: ( ( 'red' ) )
                    // InternalMyHtml.g:321:3: ( 'red' )
                    {
                     before(grammarAccess.getList_colorAccess().getRedEnumLiteralDeclaration_0()); 
                    // InternalMyHtml.g:322:3: ( 'red' )
                    // InternalMyHtml.g:322:4: 'red'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyHtml.g:326:2: ( ( 'orange' ) )
                    {
                    // InternalMyHtml.g:326:2: ( ( 'orange' ) )
                    // InternalMyHtml.g:327:3: ( 'orange' )
                    {
                     before(grammarAccess.getList_colorAccess().getOrangeEnumLiteralDeclaration_1()); 
                    // InternalMyHtml.g:328:3: ( 'orange' )
                    // InternalMyHtml.g:328:4: 'orange'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getOrangeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyHtml.g:332:2: ( ( 'yellow' ) )
                    {
                    // InternalMyHtml.g:332:2: ( ( 'yellow' ) )
                    // InternalMyHtml.g:333:3: ( 'yellow' )
                    {
                     before(grammarAccess.getList_colorAccess().getYellowEnumLiteralDeclaration_2()); 
                    // InternalMyHtml.g:334:3: ( 'yellow' )
                    // InternalMyHtml.g:334:4: 'yellow'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getYellowEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyHtml.g:338:2: ( ( 'green' ) )
                    {
                    // InternalMyHtml.g:338:2: ( ( 'green' ) )
                    // InternalMyHtml.g:339:3: ( 'green' )
                    {
                     before(grammarAccess.getList_colorAccess().getGreenEnumLiteralDeclaration_3()); 
                    // InternalMyHtml.g:340:3: ( 'green' )
                    // InternalMyHtml.g:340:4: 'green'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getGreenEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyHtml.g:344:2: ( ( 'blue' ) )
                    {
                    // InternalMyHtml.g:344:2: ( ( 'blue' ) )
                    // InternalMyHtml.g:345:3: ( 'blue' )
                    {
                     before(grammarAccess.getList_colorAccess().getBlueEnumLiteralDeclaration_4()); 
                    // InternalMyHtml.g:346:3: ( 'blue' )
                    // InternalMyHtml.g:346:4: 'blue'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getBlueEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyHtml.g:350:2: ( ( 'purple' ) )
                    {
                    // InternalMyHtml.g:350:2: ( ( 'purple' ) )
                    // InternalMyHtml.g:351:3: ( 'purple' )
                    {
                     before(grammarAccess.getList_colorAccess().getPurpleEnumLiteralDeclaration_5()); 
                    // InternalMyHtml.g:352:3: ( 'purple' )
                    // InternalMyHtml.g:352:4: 'purple'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getPurpleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyHtml.g:356:2: ( ( 'grey' ) )
                    {
                    // InternalMyHtml.g:356:2: ( ( 'grey' ) )
                    // InternalMyHtml.g:357:3: ( 'grey' )
                    {
                     before(grammarAccess.getList_colorAccess().getGreyEnumLiteralDeclaration_6()); 
                    // InternalMyHtml.g:358:3: ( 'grey' )
                    // InternalMyHtml.g:358:4: 'grey'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getGreyEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyHtml.g:362:2: ( ( 'pink' ) )
                    {
                    // InternalMyHtml.g:362:2: ( ( 'pink' ) )
                    // InternalMyHtml.g:363:3: ( 'pink' )
                    {
                     before(grammarAccess.getList_colorAccess().getPinkEnumLiteralDeclaration_7()); 
                    // InternalMyHtml.g:364:3: ( 'pink' )
                    // InternalMyHtml.g:364:4: 'pink'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getPinkEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyHtml.g:368:2: ( ( 'lime' ) )
                    {
                    // InternalMyHtml.g:368:2: ( ( 'lime' ) )
                    // InternalMyHtml.g:369:3: ( 'lime' )
                    {
                     before(grammarAccess.getList_colorAccess().getLimeEnumLiteralDeclaration_8()); 
                    // InternalMyHtml.g:370:3: ( 'lime' )
                    // InternalMyHtml.g:370:4: 'lime'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getLimeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyHtml.g:374:2: ( ( 'teal' ) )
                    {
                    // InternalMyHtml.g:374:2: ( ( 'teal' ) )
                    // InternalMyHtml.g:375:3: ( 'teal' )
                    {
                     before(grammarAccess.getList_colorAccess().getTealEnumLiteralDeclaration_9()); 
                    // InternalMyHtml.g:376:3: ( 'teal' )
                    // InternalMyHtml.g:376:4: 'teal'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getTealEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyHtml.g:380:2: ( ( 'cyan' ) )
                    {
                    // InternalMyHtml.g:380:2: ( ( 'cyan' ) )
                    // InternalMyHtml.g:381:3: ( 'cyan' )
                    {
                     before(grammarAccess.getList_colorAccess().getCyanEnumLiteralDeclaration_10()); 
                    // InternalMyHtml.g:382:3: ( 'cyan' )
                    // InternalMyHtml.g:382:4: 'cyan'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getCyanEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyHtml.g:386:2: ( ( 'indigo' ) )
                    {
                    // InternalMyHtml.g:386:2: ( ( 'indigo' ) )
                    // InternalMyHtml.g:387:3: ( 'indigo' )
                    {
                     before(grammarAccess.getList_colorAccess().getIndigoEnumLiteralDeclaration_11()); 
                    // InternalMyHtml.g:388:3: ( 'indigo' )
                    // InternalMyHtml.g:388:4: 'indigo'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getIndigoEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyHtml.g:392:2: ( ( 'brown' ) )
                    {
                    // InternalMyHtml.g:392:2: ( ( 'brown' ) )
                    // InternalMyHtml.g:393:3: ( 'brown' )
                    {
                     before(grammarAccess.getList_colorAccess().getBrownEnumLiteralDeclaration_12()); 
                    // InternalMyHtml.g:394:3: ( 'brown' )
                    // InternalMyHtml.g:394:4: 'brown'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getBrownEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyHtml.g:398:2: ( ( 'amber' ) )
                    {
                    // InternalMyHtml.g:398:2: ( ( 'amber' ) )
                    // InternalMyHtml.g:399:3: ( 'amber' )
                    {
                     before(grammarAccess.getList_colorAccess().getAmberEnumLiteralDeclaration_13()); 
                    // InternalMyHtml.g:400:3: ( 'amber' )
                    // InternalMyHtml.g:400:4: 'amber'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getAmberEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyHtml.g:404:2: ( ( 'black' ) )
                    {
                    // InternalMyHtml.g:404:2: ( ( 'black' ) )
                    // InternalMyHtml.g:405:3: ( 'black' )
                    {
                     before(grammarAccess.getList_colorAccess().getBlackEnumLiteralDeclaration_14()); 
                    // InternalMyHtml.g:406:3: ( 'black' )
                    // InternalMyHtml.g:406:4: 'black'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getBlackEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyHtml.g:410:2: ( ( 'white' ) )
                    {
                    // InternalMyHtml.g:410:2: ( ( 'white' ) )
                    // InternalMyHtml.g:411:3: ( 'white' )
                    {
                     before(grammarAccess.getList_colorAccess().getWhiteEnumLiteralDeclaration_15()); 
                    // InternalMyHtml.g:412:3: ( 'white' )
                    // InternalMyHtml.g:412:4: 'white'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getList_colorAccess().getWhiteEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List_color__Alternatives"


    // $ANTLR start "rule__Html_generator_program__Group__0"
    // InternalMyHtml.g:420:1: rule__Html_generator_program__Group__0 : rule__Html_generator_program__Group__0__Impl rule__Html_generator_program__Group__1 ;
    public final void rule__Html_generator_program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:424:1: ( rule__Html_generator_program__Group__0__Impl rule__Html_generator_program__Group__1 )
            // InternalMyHtml.g:425:2: rule__Html_generator_program__Group__0__Impl rule__Html_generator_program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Html_generator_program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__0"


    // $ANTLR start "rule__Html_generator_program__Group__0__Impl"
    // InternalMyHtml.g:432:1: rule__Html_generator_program__Group__0__Impl : ( () ) ;
    public final void rule__Html_generator_program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:436:1: ( ( () ) )
            // InternalMyHtml.g:437:1: ( () )
            {
            // InternalMyHtml.g:437:1: ( () )
            // InternalMyHtml.g:438:2: ()
            {
             before(grammarAccess.getHtml_generator_programAccess().getHtml_generator_programAction_0()); 
            // InternalMyHtml.g:439:2: ()
            // InternalMyHtml.g:439:3: 
            {
            }

             after(grammarAccess.getHtml_generator_programAccess().getHtml_generator_programAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__0__Impl"


    // $ANTLR start "rule__Html_generator_program__Group__1"
    // InternalMyHtml.g:447:1: rule__Html_generator_program__Group__1 : rule__Html_generator_program__Group__1__Impl rule__Html_generator_program__Group__2 ;
    public final void rule__Html_generator_program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:451:1: ( rule__Html_generator_program__Group__1__Impl rule__Html_generator_program__Group__2 )
            // InternalMyHtml.g:452:2: rule__Html_generator_program__Group__1__Impl rule__Html_generator_program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Html_generator_program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__1"


    // $ANTLR start "rule__Html_generator_program__Group__1__Impl"
    // InternalMyHtml.g:459:1: rule__Html_generator_program__Group__1__Impl : ( 'html_generator_program' ) ;
    public final void rule__Html_generator_program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:463:1: ( ( 'html_generator_program' ) )
            // InternalMyHtml.g:464:1: ( 'html_generator_program' )
            {
            // InternalMyHtml.g:464:1: ( 'html_generator_program' )
            // InternalMyHtml.g:465:2: 'html_generator_program'
            {
             before(grammarAccess.getHtml_generator_programAccess().getHtml_generator_programKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHtml_generator_programAccess().getHtml_generator_programKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__1__Impl"


    // $ANTLR start "rule__Html_generator_program__Group__2"
    // InternalMyHtml.g:474:1: rule__Html_generator_program__Group__2 : rule__Html_generator_program__Group__2__Impl rule__Html_generator_program__Group__3 ;
    public final void rule__Html_generator_program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:478:1: ( rule__Html_generator_program__Group__2__Impl rule__Html_generator_program__Group__3 )
            // InternalMyHtml.g:479:2: rule__Html_generator_program__Group__2__Impl rule__Html_generator_program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Html_generator_program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__2"


    // $ANTLR start "rule__Html_generator_program__Group__2__Impl"
    // InternalMyHtml.g:486:1: rule__Html_generator_program__Group__2__Impl : ( '{' ) ;
    public final void rule__Html_generator_program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:490:1: ( ( '{' ) )
            // InternalMyHtml.g:491:1: ( '{' )
            {
            // InternalMyHtml.g:491:1: ( '{' )
            // InternalMyHtml.g:492:2: '{'
            {
             before(grammarAccess.getHtml_generator_programAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHtml_generator_programAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__2__Impl"


    // $ANTLR start "rule__Html_generator_program__Group__3"
    // InternalMyHtml.g:501:1: rule__Html_generator_program__Group__3 : rule__Html_generator_program__Group__3__Impl rule__Html_generator_program__Group__4 ;
    public final void rule__Html_generator_program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:505:1: ( rule__Html_generator_program__Group__3__Impl rule__Html_generator_program__Group__4 )
            // InternalMyHtml.g:506:2: rule__Html_generator_program__Group__3__Impl rule__Html_generator_program__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Html_generator_program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__3"


    // $ANTLR start "rule__Html_generator_program__Group__3__Impl"
    // InternalMyHtml.g:513:1: rule__Html_generator_program__Group__3__Impl : ( ( rule__Html_generator_program__StatementAssignment_3 ) ) ;
    public final void rule__Html_generator_program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:517:1: ( ( ( rule__Html_generator_program__StatementAssignment_3 ) ) )
            // InternalMyHtml.g:518:1: ( ( rule__Html_generator_program__StatementAssignment_3 ) )
            {
            // InternalMyHtml.g:518:1: ( ( rule__Html_generator_program__StatementAssignment_3 ) )
            // InternalMyHtml.g:519:2: ( rule__Html_generator_program__StatementAssignment_3 )
            {
             before(grammarAccess.getHtml_generator_programAccess().getStatementAssignment_3()); 
            // InternalMyHtml.g:520:2: ( rule__Html_generator_program__StatementAssignment_3 )
            // InternalMyHtml.g:520:3: rule__Html_generator_program__StatementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Html_generator_program__StatementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHtml_generator_programAccess().getStatementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__3__Impl"


    // $ANTLR start "rule__Html_generator_program__Group__4"
    // InternalMyHtml.g:528:1: rule__Html_generator_program__Group__4 : rule__Html_generator_program__Group__4__Impl rule__Html_generator_program__Group__5 ;
    public final void rule__Html_generator_program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:532:1: ( rule__Html_generator_program__Group__4__Impl rule__Html_generator_program__Group__5 )
            // InternalMyHtml.g:533:2: rule__Html_generator_program__Group__4__Impl rule__Html_generator_program__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Html_generator_program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__4"


    // $ANTLR start "rule__Html_generator_program__Group__4__Impl"
    // InternalMyHtml.g:540:1: rule__Html_generator_program__Group__4__Impl : ( ( rule__Html_generator_program__Group_4__0 )* ) ;
    public final void rule__Html_generator_program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:544:1: ( ( ( rule__Html_generator_program__Group_4__0 )* ) )
            // InternalMyHtml.g:545:1: ( ( rule__Html_generator_program__Group_4__0 )* )
            {
            // InternalMyHtml.g:545:1: ( ( rule__Html_generator_program__Group_4__0 )* )
            // InternalMyHtml.g:546:2: ( rule__Html_generator_program__Group_4__0 )*
            {
             before(grammarAccess.getHtml_generator_programAccess().getGroup_4()); 
            // InternalMyHtml.g:547:2: ( rule__Html_generator_program__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==36||LA5_1==41) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyHtml.g:547:3: rule__Html_generator_program__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Html_generator_program__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getHtml_generator_programAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__4__Impl"


    // $ANTLR start "rule__Html_generator_program__Group__5"
    // InternalMyHtml.g:555:1: rule__Html_generator_program__Group__5 : rule__Html_generator_program__Group__5__Impl rule__Html_generator_program__Group__6 ;
    public final void rule__Html_generator_program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:559:1: ( rule__Html_generator_program__Group__5__Impl rule__Html_generator_program__Group__6 )
            // InternalMyHtml.g:560:2: rule__Html_generator_program__Group__5__Impl rule__Html_generator_program__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Html_generator_program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__5"


    // $ANTLR start "rule__Html_generator_program__Group__5__Impl"
    // InternalMyHtml.g:567:1: rule__Html_generator_program__Group__5__Impl : ( ';' ) ;
    public final void rule__Html_generator_program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:571:1: ( ( ';' ) )
            // InternalMyHtml.g:572:1: ( ';' )
            {
            // InternalMyHtml.g:572:1: ( ';' )
            // InternalMyHtml.g:573:2: ';'
            {
             before(grammarAccess.getHtml_generator_programAccess().getSemicolonKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHtml_generator_programAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__5__Impl"


    // $ANTLR start "rule__Html_generator_program__Group__6"
    // InternalMyHtml.g:582:1: rule__Html_generator_program__Group__6 : rule__Html_generator_program__Group__6__Impl ;
    public final void rule__Html_generator_program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:586:1: ( rule__Html_generator_program__Group__6__Impl )
            // InternalMyHtml.g:587:2: rule__Html_generator_program__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__6"


    // $ANTLR start "rule__Html_generator_program__Group__6__Impl"
    // InternalMyHtml.g:593:1: rule__Html_generator_program__Group__6__Impl : ( '}' ) ;
    public final void rule__Html_generator_program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:597:1: ( ( '}' ) )
            // InternalMyHtml.g:598:1: ( '}' )
            {
            // InternalMyHtml.g:598:1: ( '}' )
            // InternalMyHtml.g:599:2: '}'
            {
             before(grammarAccess.getHtml_generator_programAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHtml_generator_programAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group__6__Impl"


    // $ANTLR start "rule__Html_generator_program__Group_4__0"
    // InternalMyHtml.g:609:1: rule__Html_generator_program__Group_4__0 : rule__Html_generator_program__Group_4__0__Impl rule__Html_generator_program__Group_4__1 ;
    public final void rule__Html_generator_program__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:613:1: ( rule__Html_generator_program__Group_4__0__Impl rule__Html_generator_program__Group_4__1 )
            // InternalMyHtml.g:614:2: rule__Html_generator_program__Group_4__0__Impl rule__Html_generator_program__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Html_generator_program__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group_4__0"


    // $ANTLR start "rule__Html_generator_program__Group_4__0__Impl"
    // InternalMyHtml.g:621:1: rule__Html_generator_program__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Html_generator_program__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:625:1: ( ( ';' ) )
            // InternalMyHtml.g:626:1: ( ';' )
            {
            // InternalMyHtml.g:626:1: ( ';' )
            // InternalMyHtml.g:627:2: ';'
            {
             before(grammarAccess.getHtml_generator_programAccess().getSemicolonKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHtml_generator_programAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group_4__0__Impl"


    // $ANTLR start "rule__Html_generator_program__Group_4__1"
    // InternalMyHtml.g:636:1: rule__Html_generator_program__Group_4__1 : rule__Html_generator_program__Group_4__1__Impl ;
    public final void rule__Html_generator_program__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:640:1: ( rule__Html_generator_program__Group_4__1__Impl )
            // InternalMyHtml.g:641:2: rule__Html_generator_program__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Html_generator_program__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group_4__1"


    // $ANTLR start "rule__Html_generator_program__Group_4__1__Impl"
    // InternalMyHtml.g:647:1: rule__Html_generator_program__Group_4__1__Impl : ( ( rule__Html_generator_program__StatementAssignment_4_1 ) ) ;
    public final void rule__Html_generator_program__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:651:1: ( ( ( rule__Html_generator_program__StatementAssignment_4_1 ) ) )
            // InternalMyHtml.g:652:1: ( ( rule__Html_generator_program__StatementAssignment_4_1 ) )
            {
            // InternalMyHtml.g:652:1: ( ( rule__Html_generator_program__StatementAssignment_4_1 ) )
            // InternalMyHtml.g:653:2: ( rule__Html_generator_program__StatementAssignment_4_1 )
            {
             before(grammarAccess.getHtml_generator_programAccess().getStatementAssignment_4_1()); 
            // InternalMyHtml.g:654:2: ( rule__Html_generator_program__StatementAssignment_4_1 )
            // InternalMyHtml.g:654:3: rule__Html_generator_program__StatementAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Html_generator_program__StatementAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHtml_generator_programAccess().getStatementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__Group_4__1__Impl"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalMyHtml.g:663:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:667:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalMyHtml.g:668:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Graph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0"


    // $ANTLR start "rule__Graph__Group__0__Impl"
    // InternalMyHtml.g:675:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:679:1: ( ( () ) )
            // InternalMyHtml.g:680:1: ( () )
            {
            // InternalMyHtml.g:680:1: ( () )
            // InternalMyHtml.g:681:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalMyHtml.g:682:2: ()
            // InternalMyHtml.g:682:3: 
            {
            }

             after(grammarAccess.getGraphAccess().getGraphAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0__Impl"


    // $ANTLR start "rule__Graph__Group__1"
    // InternalMyHtml.g:690:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:694:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalMyHtml.g:695:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Graph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1"


    // $ANTLR start "rule__Graph__Group__1__Impl"
    // InternalMyHtml.g:702:1: rule__Graph__Group__1__Impl : ( 'create' ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:706:1: ( ( 'create' ) )
            // InternalMyHtml.g:707:1: ( 'create' )
            {
            // InternalMyHtml.g:707:1: ( 'create' )
            // InternalMyHtml.g:708:2: 'create'
            {
             before(grammarAccess.getGraphAccess().getCreateKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getCreateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1__Impl"


    // $ANTLR start "rule__Graph__Group__2"
    // InternalMyHtml.g:717:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:721:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalMyHtml.g:722:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Graph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2"


    // $ANTLR start "rule__Graph__Group__2__Impl"
    // InternalMyHtml.g:729:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__NameAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:733:1: ( ( ( rule__Graph__NameAssignment_2 ) ) )
            // InternalMyHtml.g:734:1: ( ( rule__Graph__NameAssignment_2 ) )
            {
            // InternalMyHtml.g:734:1: ( ( rule__Graph__NameAssignment_2 ) )
            // InternalMyHtml.g:735:2: ( rule__Graph__NameAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_2()); 
            // InternalMyHtml.g:736:2: ( rule__Graph__NameAssignment_2 )
            // InternalMyHtml.g:736:3: rule__Graph__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Graph__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2__Impl"


    // $ANTLR start "rule__Graph__Group__3"
    // InternalMyHtml.g:744:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:748:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalMyHtml.g:749:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Graph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3"


    // $ANTLR start "rule__Graph__Group__3__Impl"
    // InternalMyHtml.g:756:1: rule__Graph__Group__3__Impl : ( '{' ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:760:1: ( ( '{' ) )
            // InternalMyHtml.g:761:1: ( '{' )
            {
            // InternalMyHtml.g:761:1: ( '{' )
            // InternalMyHtml.g:762:2: '{'
            {
             before(grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3__Impl"


    // $ANTLR start "rule__Graph__Group__4"
    // InternalMyHtml.g:771:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl rule__Graph__Group__5 ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:775:1: ( rule__Graph__Group__4__Impl rule__Graph__Group__5 )
            // InternalMyHtml.g:776:2: rule__Graph__Group__4__Impl rule__Graph__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Graph__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4"


    // $ANTLR start "rule__Graph__Group__4__Impl"
    // InternalMyHtml.g:783:1: rule__Graph__Group__4__Impl : ( 'style' ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:787:1: ( ( 'style' ) )
            // InternalMyHtml.g:788:1: ( 'style' )
            {
            // InternalMyHtml.g:788:1: ( 'style' )
            // InternalMyHtml.g:789:2: 'style'
            {
             before(grammarAccess.getGraphAccess().getStyleKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getStyleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4__Impl"


    // $ANTLR start "rule__Graph__Group__5"
    // InternalMyHtml.g:798:1: rule__Graph__Group__5 : rule__Graph__Group__5__Impl rule__Graph__Group__6 ;
    public final void rule__Graph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:802:1: ( rule__Graph__Group__5__Impl rule__Graph__Group__6 )
            // InternalMyHtml.g:803:2: rule__Graph__Group__5__Impl rule__Graph__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Graph__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__5"


    // $ANTLR start "rule__Graph__Group__5__Impl"
    // InternalMyHtml.g:810:1: rule__Graph__Group__5__Impl : ( '=' ) ;
    public final void rule__Graph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:814:1: ( ( '=' ) )
            // InternalMyHtml.g:815:1: ( '=' )
            {
            // InternalMyHtml.g:815:1: ( '=' )
            // InternalMyHtml.g:816:2: '='
            {
             before(grammarAccess.getGraphAccess().getEqualsSignKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__5__Impl"


    // $ANTLR start "rule__Graph__Group__6"
    // InternalMyHtml.g:825:1: rule__Graph__Group__6 : rule__Graph__Group__6__Impl rule__Graph__Group__7 ;
    public final void rule__Graph__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:829:1: ( rule__Graph__Group__6__Impl rule__Graph__Group__7 )
            // InternalMyHtml.g:830:2: rule__Graph__Group__6__Impl rule__Graph__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Graph__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__6"


    // $ANTLR start "rule__Graph__Group__6__Impl"
    // InternalMyHtml.g:837:1: rule__Graph__Group__6__Impl : ( ( rule__Graph__StyleAssignment_6 ) ) ;
    public final void rule__Graph__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:841:1: ( ( ( rule__Graph__StyleAssignment_6 ) ) )
            // InternalMyHtml.g:842:1: ( ( rule__Graph__StyleAssignment_6 ) )
            {
            // InternalMyHtml.g:842:1: ( ( rule__Graph__StyleAssignment_6 ) )
            // InternalMyHtml.g:843:2: ( rule__Graph__StyleAssignment_6 )
            {
             before(grammarAccess.getGraphAccess().getStyleAssignment_6()); 
            // InternalMyHtml.g:844:2: ( rule__Graph__StyleAssignment_6 )
            // InternalMyHtml.g:844:3: rule__Graph__StyleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Graph__StyleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getStyleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__6__Impl"


    // $ANTLR start "rule__Graph__Group__7"
    // InternalMyHtml.g:852:1: rule__Graph__Group__7 : rule__Graph__Group__7__Impl rule__Graph__Group__8 ;
    public final void rule__Graph__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:856:1: ( rule__Graph__Group__7__Impl rule__Graph__Group__8 )
            // InternalMyHtml.g:857:2: rule__Graph__Group__7__Impl rule__Graph__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Graph__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__7"


    // $ANTLR start "rule__Graph__Group__7__Impl"
    // InternalMyHtml.g:864:1: rule__Graph__Group__7__Impl : ( ',' ) ;
    public final void rule__Graph__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:868:1: ( ( ',' ) )
            // InternalMyHtml.g:869:1: ( ',' )
            {
            // InternalMyHtml.g:869:1: ( ',' )
            // InternalMyHtml.g:870:2: ','
            {
             before(grammarAccess.getGraphAccess().getCommaKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__7__Impl"


    // $ANTLR start "rule__Graph__Group__8"
    // InternalMyHtml.g:879:1: rule__Graph__Group__8 : rule__Graph__Group__8__Impl rule__Graph__Group__9 ;
    public final void rule__Graph__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:883:1: ( rule__Graph__Group__8__Impl rule__Graph__Group__9 )
            // InternalMyHtml.g:884:2: rule__Graph__Group__8__Impl rule__Graph__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Graph__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__8"


    // $ANTLR start "rule__Graph__Group__8__Impl"
    // InternalMyHtml.g:891:1: rule__Graph__Group__8__Impl : ( 'Xaxis' ) ;
    public final void rule__Graph__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:895:1: ( ( 'Xaxis' ) )
            // InternalMyHtml.g:896:1: ( 'Xaxis' )
            {
            // InternalMyHtml.g:896:1: ( 'Xaxis' )
            // InternalMyHtml.g:897:2: 'Xaxis'
            {
             before(grammarAccess.getGraphAccess().getXaxisKeyword_8()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getXaxisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__8__Impl"


    // $ANTLR start "rule__Graph__Group__9"
    // InternalMyHtml.g:906:1: rule__Graph__Group__9 : rule__Graph__Group__9__Impl rule__Graph__Group__10 ;
    public final void rule__Graph__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:910:1: ( rule__Graph__Group__9__Impl rule__Graph__Group__10 )
            // InternalMyHtml.g:911:2: rule__Graph__Group__9__Impl rule__Graph__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Graph__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__9"


    // $ANTLR start "rule__Graph__Group__9__Impl"
    // InternalMyHtml.g:918:1: rule__Graph__Group__9__Impl : ( '=' ) ;
    public final void rule__Graph__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:922:1: ( ( '=' ) )
            // InternalMyHtml.g:923:1: ( '=' )
            {
            // InternalMyHtml.g:923:1: ( '=' )
            // InternalMyHtml.g:924:2: '='
            {
             before(grammarAccess.getGraphAccess().getEqualsSignKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__9__Impl"


    // $ANTLR start "rule__Graph__Group__10"
    // InternalMyHtml.g:933:1: rule__Graph__Group__10 : rule__Graph__Group__10__Impl rule__Graph__Group__11 ;
    public final void rule__Graph__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:937:1: ( rule__Graph__Group__10__Impl rule__Graph__Group__11 )
            // InternalMyHtml.g:938:2: rule__Graph__Group__10__Impl rule__Graph__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Graph__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__10"


    // $ANTLR start "rule__Graph__Group__10__Impl"
    // InternalMyHtml.g:945:1: rule__Graph__Group__10__Impl : ( ( rule__Graph__X_axisAssignment_10 ) ) ;
    public final void rule__Graph__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:949:1: ( ( ( rule__Graph__X_axisAssignment_10 ) ) )
            // InternalMyHtml.g:950:1: ( ( rule__Graph__X_axisAssignment_10 ) )
            {
            // InternalMyHtml.g:950:1: ( ( rule__Graph__X_axisAssignment_10 ) )
            // InternalMyHtml.g:951:2: ( rule__Graph__X_axisAssignment_10 )
            {
             before(grammarAccess.getGraphAccess().getX_axisAssignment_10()); 
            // InternalMyHtml.g:952:2: ( rule__Graph__X_axisAssignment_10 )
            // InternalMyHtml.g:952:3: rule__Graph__X_axisAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Graph__X_axisAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getX_axisAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__10__Impl"


    // $ANTLR start "rule__Graph__Group__11"
    // InternalMyHtml.g:960:1: rule__Graph__Group__11 : rule__Graph__Group__11__Impl rule__Graph__Group__12 ;
    public final void rule__Graph__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:964:1: ( rule__Graph__Group__11__Impl rule__Graph__Group__12 )
            // InternalMyHtml.g:965:2: rule__Graph__Group__11__Impl rule__Graph__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Graph__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__11"


    // $ANTLR start "rule__Graph__Group__11__Impl"
    // InternalMyHtml.g:972:1: rule__Graph__Group__11__Impl : ( ',' ) ;
    public final void rule__Graph__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:976:1: ( ( ',' ) )
            // InternalMyHtml.g:977:1: ( ',' )
            {
            // InternalMyHtml.g:977:1: ( ',' )
            // InternalMyHtml.g:978:2: ','
            {
             before(grammarAccess.getGraphAccess().getCommaKeyword_11()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__11__Impl"


    // $ANTLR start "rule__Graph__Group__12"
    // InternalMyHtml.g:987:1: rule__Graph__Group__12 : rule__Graph__Group__12__Impl rule__Graph__Group__13 ;
    public final void rule__Graph__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:991:1: ( rule__Graph__Group__12__Impl rule__Graph__Group__13 )
            // InternalMyHtml.g:992:2: rule__Graph__Group__12__Impl rule__Graph__Group__13
            {
            pushFollow(FOLLOW_17);
            rule__Graph__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__12"


    // $ANTLR start "rule__Graph__Group__12__Impl"
    // InternalMyHtml.g:999:1: rule__Graph__Group__12__Impl : ( ( rule__Graph__CurveAssignment_12 ) ) ;
    public final void rule__Graph__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1003:1: ( ( ( rule__Graph__CurveAssignment_12 ) ) )
            // InternalMyHtml.g:1004:1: ( ( rule__Graph__CurveAssignment_12 ) )
            {
            // InternalMyHtml.g:1004:1: ( ( rule__Graph__CurveAssignment_12 ) )
            // InternalMyHtml.g:1005:2: ( rule__Graph__CurveAssignment_12 )
            {
             before(grammarAccess.getGraphAccess().getCurveAssignment_12()); 
            // InternalMyHtml.g:1006:2: ( rule__Graph__CurveAssignment_12 )
            // InternalMyHtml.g:1006:3: rule__Graph__CurveAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Graph__CurveAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getCurveAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__12__Impl"


    // $ANTLR start "rule__Graph__Group__13"
    // InternalMyHtml.g:1014:1: rule__Graph__Group__13 : rule__Graph__Group__13__Impl rule__Graph__Group__14 ;
    public final void rule__Graph__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1018:1: ( rule__Graph__Group__13__Impl rule__Graph__Group__14 )
            // InternalMyHtml.g:1019:2: rule__Graph__Group__13__Impl rule__Graph__Group__14
            {
            pushFollow(FOLLOW_17);
            rule__Graph__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__13"


    // $ANTLR start "rule__Graph__Group__13__Impl"
    // InternalMyHtml.g:1026:1: rule__Graph__Group__13__Impl : ( ( rule__Graph__Group_13__0 )* ) ;
    public final void rule__Graph__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1030:1: ( ( ( rule__Graph__Group_13__0 )* ) )
            // InternalMyHtml.g:1031:1: ( ( rule__Graph__Group_13__0 )* )
            {
            // InternalMyHtml.g:1031:1: ( ( rule__Graph__Group_13__0 )* )
            // InternalMyHtml.g:1032:2: ( rule__Graph__Group_13__0 )*
            {
             before(grammarAccess.getGraphAccess().getGroup_13()); 
            // InternalMyHtml.g:1033:2: ( rule__Graph__Group_13__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyHtml.g:1033:3: rule__Graph__Group_13__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Graph__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGraphAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__13__Impl"


    // $ANTLR start "rule__Graph__Group__14"
    // InternalMyHtml.g:1041:1: rule__Graph__Group__14 : rule__Graph__Group__14__Impl ;
    public final void rule__Graph__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1045:1: ( rule__Graph__Group__14__Impl )
            // InternalMyHtml.g:1046:2: rule__Graph__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__14"


    // $ANTLR start "rule__Graph__Group__14__Impl"
    // InternalMyHtml.g:1052:1: rule__Graph__Group__14__Impl : ( '}' ) ;
    public final void rule__Graph__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1056:1: ( ( '}' ) )
            // InternalMyHtml.g:1057:1: ( '}' )
            {
            // InternalMyHtml.g:1057:1: ( '}' )
            // InternalMyHtml.g:1058:2: '}'
            {
             before(grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_14()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__14__Impl"


    // $ANTLR start "rule__Graph__Group_13__0"
    // InternalMyHtml.g:1068:1: rule__Graph__Group_13__0 : rule__Graph__Group_13__0__Impl rule__Graph__Group_13__1 ;
    public final void rule__Graph__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1072:1: ( rule__Graph__Group_13__0__Impl rule__Graph__Group_13__1 )
            // InternalMyHtml.g:1073:2: rule__Graph__Group_13__0__Impl rule__Graph__Group_13__1
            {
            pushFollow(FOLLOW_16);
            rule__Graph__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_13__0"


    // $ANTLR start "rule__Graph__Group_13__0__Impl"
    // InternalMyHtml.g:1080:1: rule__Graph__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Graph__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1084:1: ( ( ',' ) )
            // InternalMyHtml.g:1085:1: ( ',' )
            {
            // InternalMyHtml.g:1085:1: ( ',' )
            // InternalMyHtml.g:1086:2: ','
            {
             before(grammarAccess.getGraphAccess().getCommaKeyword_13_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_13__0__Impl"


    // $ANTLR start "rule__Graph__Group_13__1"
    // InternalMyHtml.g:1095:1: rule__Graph__Group_13__1 : rule__Graph__Group_13__1__Impl ;
    public final void rule__Graph__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1099:1: ( rule__Graph__Group_13__1__Impl )
            // InternalMyHtml.g:1100:2: rule__Graph__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_13__1"


    // $ANTLR start "rule__Graph__Group_13__1__Impl"
    // InternalMyHtml.g:1106:1: rule__Graph__Group_13__1__Impl : ( ( rule__Graph__CurveAssignment_13_1 ) ) ;
    public final void rule__Graph__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1110:1: ( ( ( rule__Graph__CurveAssignment_13_1 ) ) )
            // InternalMyHtml.g:1111:1: ( ( rule__Graph__CurveAssignment_13_1 ) )
            {
            // InternalMyHtml.g:1111:1: ( ( rule__Graph__CurveAssignment_13_1 ) )
            // InternalMyHtml.g:1112:2: ( rule__Graph__CurveAssignment_13_1 )
            {
             before(grammarAccess.getGraphAccess().getCurveAssignment_13_1()); 
            // InternalMyHtml.g:1113:2: ( rule__Graph__CurveAssignment_13_1 )
            // InternalMyHtml.g:1113:3: rule__Graph__CurveAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__CurveAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getCurveAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_13__1__Impl"


    // $ANTLR start "rule__Csv_loader__Group__0"
    // InternalMyHtml.g:1122:1: rule__Csv_loader__Group__0 : rule__Csv_loader__Group__0__Impl rule__Csv_loader__Group__1 ;
    public final void rule__Csv_loader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1126:1: ( rule__Csv_loader__Group__0__Impl rule__Csv_loader__Group__1 )
            // InternalMyHtml.g:1127:2: rule__Csv_loader__Group__0__Impl rule__Csv_loader__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Csv_loader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__0"


    // $ANTLR start "rule__Csv_loader__Group__0__Impl"
    // InternalMyHtml.g:1134:1: rule__Csv_loader__Group__0__Impl : ( () ) ;
    public final void rule__Csv_loader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1138:1: ( ( () ) )
            // InternalMyHtml.g:1139:1: ( () )
            {
            // InternalMyHtml.g:1139:1: ( () )
            // InternalMyHtml.g:1140:2: ()
            {
             before(grammarAccess.getCsv_loaderAccess().getCsv_loaderAction_0()); 
            // InternalMyHtml.g:1141:2: ()
            // InternalMyHtml.g:1141:3: 
            {
            }

             after(grammarAccess.getCsv_loaderAccess().getCsv_loaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__0__Impl"


    // $ANTLR start "rule__Csv_loader__Group__1"
    // InternalMyHtml.g:1149:1: rule__Csv_loader__Group__1 : rule__Csv_loader__Group__1__Impl rule__Csv_loader__Group__2 ;
    public final void rule__Csv_loader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1153:1: ( rule__Csv_loader__Group__1__Impl rule__Csv_loader__Group__2 )
            // InternalMyHtml.g:1154:2: rule__Csv_loader__Group__1__Impl rule__Csv_loader__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Csv_loader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__1"


    // $ANTLR start "rule__Csv_loader__Group__1__Impl"
    // InternalMyHtml.g:1161:1: rule__Csv_loader__Group__1__Impl : ( 'open' ) ;
    public final void rule__Csv_loader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1165:1: ( ( 'open' ) )
            // InternalMyHtml.g:1166:1: ( 'open' )
            {
            // InternalMyHtml.g:1166:1: ( 'open' )
            // InternalMyHtml.g:1167:2: 'open'
            {
             before(grammarAccess.getCsv_loaderAccess().getOpenKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCsv_loaderAccess().getOpenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__1__Impl"


    // $ANTLR start "rule__Csv_loader__Group__2"
    // InternalMyHtml.g:1176:1: rule__Csv_loader__Group__2 : rule__Csv_loader__Group__2__Impl rule__Csv_loader__Group__3 ;
    public final void rule__Csv_loader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1180:1: ( rule__Csv_loader__Group__2__Impl rule__Csv_loader__Group__3 )
            // InternalMyHtml.g:1181:2: rule__Csv_loader__Group__2__Impl rule__Csv_loader__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Csv_loader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__2"


    // $ANTLR start "rule__Csv_loader__Group__2__Impl"
    // InternalMyHtml.g:1188:1: rule__Csv_loader__Group__2__Impl : ( '(' ) ;
    public final void rule__Csv_loader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1192:1: ( ( '(' ) )
            // InternalMyHtml.g:1193:1: ( '(' )
            {
            // InternalMyHtml.g:1193:1: ( '(' )
            // InternalMyHtml.g:1194:2: '('
            {
             before(grammarAccess.getCsv_loaderAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCsv_loaderAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__2__Impl"


    // $ANTLR start "rule__Csv_loader__Group__3"
    // InternalMyHtml.g:1203:1: rule__Csv_loader__Group__3 : rule__Csv_loader__Group__3__Impl rule__Csv_loader__Group__4 ;
    public final void rule__Csv_loader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1207:1: ( rule__Csv_loader__Group__3__Impl rule__Csv_loader__Group__4 )
            // InternalMyHtml.g:1208:2: rule__Csv_loader__Group__3__Impl rule__Csv_loader__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Csv_loader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__3"


    // $ANTLR start "rule__Csv_loader__Group__3__Impl"
    // InternalMyHtml.g:1215:1: rule__Csv_loader__Group__3__Impl : ( ( rule__Csv_loader__File_nameAssignment_3 ) ) ;
    public final void rule__Csv_loader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1219:1: ( ( ( rule__Csv_loader__File_nameAssignment_3 ) ) )
            // InternalMyHtml.g:1220:1: ( ( rule__Csv_loader__File_nameAssignment_3 ) )
            {
            // InternalMyHtml.g:1220:1: ( ( rule__Csv_loader__File_nameAssignment_3 ) )
            // InternalMyHtml.g:1221:2: ( rule__Csv_loader__File_nameAssignment_3 )
            {
             before(grammarAccess.getCsv_loaderAccess().getFile_nameAssignment_3()); 
            // InternalMyHtml.g:1222:2: ( rule__Csv_loader__File_nameAssignment_3 )
            // InternalMyHtml.g:1222:3: rule__Csv_loader__File_nameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Csv_loader__File_nameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCsv_loaderAccess().getFile_nameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__3__Impl"


    // $ANTLR start "rule__Csv_loader__Group__4"
    // InternalMyHtml.g:1230:1: rule__Csv_loader__Group__4 : rule__Csv_loader__Group__4__Impl rule__Csv_loader__Group__5 ;
    public final void rule__Csv_loader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1234:1: ( rule__Csv_loader__Group__4__Impl rule__Csv_loader__Group__5 )
            // InternalMyHtml.g:1235:2: rule__Csv_loader__Group__4__Impl rule__Csv_loader__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Csv_loader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__4"


    // $ANTLR start "rule__Csv_loader__Group__4__Impl"
    // InternalMyHtml.g:1242:1: rule__Csv_loader__Group__4__Impl : ( ( rule__Csv_loader__Group_4__0 )? ) ;
    public final void rule__Csv_loader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1246:1: ( ( ( rule__Csv_loader__Group_4__0 )? ) )
            // InternalMyHtml.g:1247:1: ( ( rule__Csv_loader__Group_4__0 )? )
            {
            // InternalMyHtml.g:1247:1: ( ( rule__Csv_loader__Group_4__0 )? )
            // InternalMyHtml.g:1248:2: ( rule__Csv_loader__Group_4__0 )?
            {
             before(grammarAccess.getCsv_loaderAccess().getGroup_4()); 
            // InternalMyHtml.g:1249:2: ( rule__Csv_loader__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyHtml.g:1249:3: rule__Csv_loader__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Csv_loader__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCsv_loaderAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__4__Impl"


    // $ANTLR start "rule__Csv_loader__Group__5"
    // InternalMyHtml.g:1257:1: rule__Csv_loader__Group__5 : rule__Csv_loader__Group__5__Impl ;
    public final void rule__Csv_loader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1261:1: ( rule__Csv_loader__Group__5__Impl )
            // InternalMyHtml.g:1262:2: rule__Csv_loader__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__5"


    // $ANTLR start "rule__Csv_loader__Group__5__Impl"
    // InternalMyHtml.g:1268:1: rule__Csv_loader__Group__5__Impl : ( ')' ) ;
    public final void rule__Csv_loader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1272:1: ( ( ')' ) )
            // InternalMyHtml.g:1273:1: ( ')' )
            {
            // InternalMyHtml.g:1273:1: ( ')' )
            // InternalMyHtml.g:1274:2: ')'
            {
             before(grammarAccess.getCsv_loaderAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCsv_loaderAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group__5__Impl"


    // $ANTLR start "rule__Csv_loader__Group_4__0"
    // InternalMyHtml.g:1284:1: rule__Csv_loader__Group_4__0 : rule__Csv_loader__Group_4__0__Impl rule__Csv_loader__Group_4__1 ;
    public final void rule__Csv_loader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1288:1: ( rule__Csv_loader__Group_4__0__Impl rule__Csv_loader__Group_4__1 )
            // InternalMyHtml.g:1289:2: rule__Csv_loader__Group_4__0__Impl rule__Csv_loader__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Csv_loader__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group_4__0"


    // $ANTLR start "rule__Csv_loader__Group_4__0__Impl"
    // InternalMyHtml.g:1296:1: rule__Csv_loader__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Csv_loader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1300:1: ( ( ',' ) )
            // InternalMyHtml.g:1301:1: ( ',' )
            {
            // InternalMyHtml.g:1301:1: ( ',' )
            // InternalMyHtml.g:1302:2: ','
            {
             before(grammarAccess.getCsv_loaderAccess().getCommaKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCsv_loaderAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group_4__0__Impl"


    // $ANTLR start "rule__Csv_loader__Group_4__1"
    // InternalMyHtml.g:1311:1: rule__Csv_loader__Group_4__1 : rule__Csv_loader__Group_4__1__Impl rule__Csv_loader__Group_4__2 ;
    public final void rule__Csv_loader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1315:1: ( rule__Csv_loader__Group_4__1__Impl rule__Csv_loader__Group_4__2 )
            // InternalMyHtml.g:1316:2: rule__Csv_loader__Group_4__1__Impl rule__Csv_loader__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Csv_loader__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group_4__1"


    // $ANTLR start "rule__Csv_loader__Group_4__1__Impl"
    // InternalMyHtml.g:1323:1: rule__Csv_loader__Group_4__1__Impl : ( 'sep' ) ;
    public final void rule__Csv_loader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1327:1: ( ( 'sep' ) )
            // InternalMyHtml.g:1328:1: ( 'sep' )
            {
            // InternalMyHtml.g:1328:1: ( 'sep' )
            // InternalMyHtml.g:1329:2: 'sep'
            {
             before(grammarAccess.getCsv_loaderAccess().getSepKeyword_4_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCsv_loaderAccess().getSepKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group_4__1__Impl"


    // $ANTLR start "rule__Csv_loader__Group_4__2"
    // InternalMyHtml.g:1338:1: rule__Csv_loader__Group_4__2 : rule__Csv_loader__Group_4__2__Impl rule__Csv_loader__Group_4__3 ;
    public final void rule__Csv_loader__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1342:1: ( rule__Csv_loader__Group_4__2__Impl rule__Csv_loader__Group_4__3 )
            // InternalMyHtml.g:1343:2: rule__Csv_loader__Group_4__2__Impl rule__Csv_loader__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Csv_loader__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group_4__2"


    // $ANTLR start "rule__Csv_loader__Group_4__2__Impl"
    // InternalMyHtml.g:1350:1: rule__Csv_loader__Group_4__2__Impl : ( '=' ) ;
    public final void rule__Csv_loader__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1354:1: ( ( '=' ) )
            // InternalMyHtml.g:1355:1: ( '=' )
            {
            // InternalMyHtml.g:1355:1: ( '=' )
            // InternalMyHtml.g:1356:2: '='
            {
             before(grammarAccess.getCsv_loaderAccess().getEqualsSignKeyword_4_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCsv_loaderAccess().getEqualsSignKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group_4__2__Impl"


    // $ANTLR start "rule__Csv_loader__Group_4__3"
    // InternalMyHtml.g:1365:1: rule__Csv_loader__Group_4__3 : rule__Csv_loader__Group_4__3__Impl ;
    public final void rule__Csv_loader__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1369:1: ( rule__Csv_loader__Group_4__3__Impl )
            // InternalMyHtml.g:1370:2: rule__Csv_loader__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Csv_loader__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group_4__3"


    // $ANTLR start "rule__Csv_loader__Group_4__3__Impl"
    // InternalMyHtml.g:1376:1: rule__Csv_loader__Group_4__3__Impl : ( ( rule__Csv_loader__SeparatorAssignment_4_3 ) ) ;
    public final void rule__Csv_loader__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1380:1: ( ( ( rule__Csv_loader__SeparatorAssignment_4_3 ) ) )
            // InternalMyHtml.g:1381:1: ( ( rule__Csv_loader__SeparatorAssignment_4_3 ) )
            {
            // InternalMyHtml.g:1381:1: ( ( rule__Csv_loader__SeparatorAssignment_4_3 ) )
            // InternalMyHtml.g:1382:2: ( rule__Csv_loader__SeparatorAssignment_4_3 )
            {
             before(grammarAccess.getCsv_loaderAccess().getSeparatorAssignment_4_3()); 
            // InternalMyHtml.g:1383:2: ( rule__Csv_loader__SeparatorAssignment_4_3 )
            // InternalMyHtml.g:1383:3: rule__Csv_loader__SeparatorAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Csv_loader__SeparatorAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getCsv_loaderAccess().getSeparatorAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__Group_4__3__Impl"


    // $ANTLR start "rule__Curve__Group__0"
    // InternalMyHtml.g:1392:1: rule__Curve__Group__0 : rule__Curve__Group__0__Impl rule__Curve__Group__1 ;
    public final void rule__Curve__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1396:1: ( rule__Curve__Group__0__Impl rule__Curve__Group__1 )
            // InternalMyHtml.g:1397:2: rule__Curve__Group__0__Impl rule__Curve__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Curve__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__0"


    // $ANTLR start "rule__Curve__Group__0__Impl"
    // InternalMyHtml.g:1404:1: rule__Curve__Group__0__Impl : ( () ) ;
    public final void rule__Curve__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1408:1: ( ( () ) )
            // InternalMyHtml.g:1409:1: ( () )
            {
            // InternalMyHtml.g:1409:1: ( () )
            // InternalMyHtml.g:1410:2: ()
            {
             before(grammarAccess.getCurveAccess().getCurveAction_0()); 
            // InternalMyHtml.g:1411:2: ()
            // InternalMyHtml.g:1411:3: 
            {
            }

             after(grammarAccess.getCurveAccess().getCurveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__0__Impl"


    // $ANTLR start "rule__Curve__Group__1"
    // InternalMyHtml.g:1419:1: rule__Curve__Group__1 : rule__Curve__Group__1__Impl rule__Curve__Group__2 ;
    public final void rule__Curve__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1423:1: ( rule__Curve__Group__1__Impl rule__Curve__Group__2 )
            // InternalMyHtml.g:1424:2: rule__Curve__Group__1__Impl rule__Curve__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Curve__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__1"


    // $ANTLR start "rule__Curve__Group__1__Impl"
    // InternalMyHtml.g:1431:1: rule__Curve__Group__1__Impl : ( 'curve' ) ;
    public final void rule__Curve__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1435:1: ( ( 'curve' ) )
            // InternalMyHtml.g:1436:1: ( 'curve' )
            {
            // InternalMyHtml.g:1436:1: ( 'curve' )
            // InternalMyHtml.g:1437:2: 'curve'
            {
             before(grammarAccess.getCurveAccess().getCurveKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getCurveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__1__Impl"


    // $ANTLR start "rule__Curve__Group__2"
    // InternalMyHtml.g:1446:1: rule__Curve__Group__2 : rule__Curve__Group__2__Impl rule__Curve__Group__3 ;
    public final void rule__Curve__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1450:1: ( rule__Curve__Group__2__Impl rule__Curve__Group__3 )
            // InternalMyHtml.g:1451:2: rule__Curve__Group__2__Impl rule__Curve__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Curve__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__2"


    // $ANTLR start "rule__Curve__Group__2__Impl"
    // InternalMyHtml.g:1458:1: rule__Curve__Group__2__Impl : ( '(' ) ;
    public final void rule__Curve__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1462:1: ( ( '(' ) )
            // InternalMyHtml.g:1463:1: ( '(' )
            {
            // InternalMyHtml.g:1463:1: ( '(' )
            // InternalMyHtml.g:1464:2: '('
            {
             before(grammarAccess.getCurveAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__2__Impl"


    // $ANTLR start "rule__Curve__Group__3"
    // InternalMyHtml.g:1473:1: rule__Curve__Group__3 : rule__Curve__Group__3__Impl rule__Curve__Group__4 ;
    public final void rule__Curve__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1477:1: ( rule__Curve__Group__3__Impl rule__Curve__Group__4 )
            // InternalMyHtml.g:1478:2: rule__Curve__Group__3__Impl rule__Curve__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Curve__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__3"


    // $ANTLR start "rule__Curve__Group__3__Impl"
    // InternalMyHtml.g:1485:1: rule__Curve__Group__3__Impl : ( ( rule__Curve__Group_3__0 )? ) ;
    public final void rule__Curve__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1489:1: ( ( ( rule__Curve__Group_3__0 )? ) )
            // InternalMyHtml.g:1490:1: ( ( rule__Curve__Group_3__0 )? )
            {
            // InternalMyHtml.g:1490:1: ( ( rule__Curve__Group_3__0 )? )
            // InternalMyHtml.g:1491:2: ( rule__Curve__Group_3__0 )?
            {
             before(grammarAccess.getCurveAccess().getGroup_3()); 
            // InternalMyHtml.g:1492:2: ( rule__Curve__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyHtml.g:1492:3: rule__Curve__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Curve__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCurveAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__3__Impl"


    // $ANTLR start "rule__Curve__Group__4"
    // InternalMyHtml.g:1500:1: rule__Curve__Group__4 : rule__Curve__Group__4__Impl rule__Curve__Group__5 ;
    public final void rule__Curve__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1504:1: ( rule__Curve__Group__4__Impl rule__Curve__Group__5 )
            // InternalMyHtml.g:1505:2: rule__Curve__Group__4__Impl rule__Curve__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Curve__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__4"


    // $ANTLR start "rule__Curve__Group__4__Impl"
    // InternalMyHtml.g:1512:1: rule__Curve__Group__4__Impl : ( ( rule__Curve__Group_4__0 )? ) ;
    public final void rule__Curve__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1516:1: ( ( ( rule__Curve__Group_4__0 )? ) )
            // InternalMyHtml.g:1517:1: ( ( rule__Curve__Group_4__0 )? )
            {
            // InternalMyHtml.g:1517:1: ( ( rule__Curve__Group_4__0 )? )
            // InternalMyHtml.g:1518:2: ( rule__Curve__Group_4__0 )?
            {
             before(grammarAccess.getCurveAccess().getGroup_4()); 
            // InternalMyHtml.g:1519:2: ( rule__Curve__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==47) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalMyHtml.g:1519:3: rule__Curve__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Curve__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCurveAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__4__Impl"


    // $ANTLR start "rule__Curve__Group__5"
    // InternalMyHtml.g:1527:1: rule__Curve__Group__5 : rule__Curve__Group__5__Impl rule__Curve__Group__6 ;
    public final void rule__Curve__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1531:1: ( rule__Curve__Group__5__Impl rule__Curve__Group__6 )
            // InternalMyHtml.g:1532:2: rule__Curve__Group__5__Impl rule__Curve__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Curve__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__5"


    // $ANTLR start "rule__Curve__Group__5__Impl"
    // InternalMyHtml.g:1539:1: rule__Curve__Group__5__Impl : ( ( rule__Curve__Group_5__0 )? ) ;
    public final void rule__Curve__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1543:1: ( ( ( rule__Curve__Group_5__0 )? ) )
            // InternalMyHtml.g:1544:1: ( ( rule__Curve__Group_5__0 )? )
            {
            // InternalMyHtml.g:1544:1: ( ( rule__Curve__Group_5__0 )? )
            // InternalMyHtml.g:1545:2: ( rule__Curve__Group_5__0 )?
            {
             before(grammarAccess.getCurveAccess().getGroup_5()); 
            // InternalMyHtml.g:1546:2: ( rule__Curve__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyHtml.g:1546:3: rule__Curve__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Curve__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCurveAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__5__Impl"


    // $ANTLR start "rule__Curve__Group__6"
    // InternalMyHtml.g:1554:1: rule__Curve__Group__6 : rule__Curve__Group__6__Impl ;
    public final void rule__Curve__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1558:1: ( rule__Curve__Group__6__Impl )
            // InternalMyHtml.g:1559:2: rule__Curve__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Curve__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__6"


    // $ANTLR start "rule__Curve__Group__6__Impl"
    // InternalMyHtml.g:1565:1: rule__Curve__Group__6__Impl : ( ')' ) ;
    public final void rule__Curve__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1569:1: ( ( ')' ) )
            // InternalMyHtml.g:1570:1: ( ')' )
            {
            // InternalMyHtml.g:1570:1: ( ')' )
            // InternalMyHtml.g:1571:2: ')'
            {
             before(grammarAccess.getCurveAccess().getRightParenthesisKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group__6__Impl"


    // $ANTLR start "rule__Curve__Group_3__0"
    // InternalMyHtml.g:1581:1: rule__Curve__Group_3__0 : rule__Curve__Group_3__0__Impl rule__Curve__Group_3__1 ;
    public final void rule__Curve__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1585:1: ( rule__Curve__Group_3__0__Impl rule__Curve__Group_3__1 )
            // InternalMyHtml.g:1586:2: rule__Curve__Group_3__0__Impl rule__Curve__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Curve__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_3__0"


    // $ANTLR start "rule__Curve__Group_3__0__Impl"
    // InternalMyHtml.g:1593:1: rule__Curve__Group_3__0__Impl : ( 'label_name' ) ;
    public final void rule__Curve__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1597:1: ( ( 'label_name' ) )
            // InternalMyHtml.g:1598:1: ( 'label_name' )
            {
            // InternalMyHtml.g:1598:1: ( 'label_name' )
            // InternalMyHtml.g:1599:2: 'label_name'
            {
             before(grammarAccess.getCurveAccess().getLabel_nameKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getLabel_nameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_3__0__Impl"


    // $ANTLR start "rule__Curve__Group_3__1"
    // InternalMyHtml.g:1608:1: rule__Curve__Group_3__1 : rule__Curve__Group_3__1__Impl rule__Curve__Group_3__2 ;
    public final void rule__Curve__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1612:1: ( rule__Curve__Group_3__1__Impl rule__Curve__Group_3__2 )
            // InternalMyHtml.g:1613:2: rule__Curve__Group_3__1__Impl rule__Curve__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Curve__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_3__1"


    // $ANTLR start "rule__Curve__Group_3__1__Impl"
    // InternalMyHtml.g:1620:1: rule__Curve__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Curve__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1624:1: ( ( '=' ) )
            // InternalMyHtml.g:1625:1: ( '=' )
            {
            // InternalMyHtml.g:1625:1: ( '=' )
            // InternalMyHtml.g:1626:2: '='
            {
             before(grammarAccess.getCurveAccess().getEqualsSignKeyword_3_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_3__1__Impl"


    // $ANTLR start "rule__Curve__Group_3__2"
    // InternalMyHtml.g:1635:1: rule__Curve__Group_3__2 : rule__Curve__Group_3__2__Impl ;
    public final void rule__Curve__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1639:1: ( rule__Curve__Group_3__2__Impl )
            // InternalMyHtml.g:1640:2: rule__Curve__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Curve__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_3__2"


    // $ANTLR start "rule__Curve__Group_3__2__Impl"
    // InternalMyHtml.g:1646:1: rule__Curve__Group_3__2__Impl : ( ( rule__Curve__Label_nameAssignment_3_2 ) ) ;
    public final void rule__Curve__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1650:1: ( ( ( rule__Curve__Label_nameAssignment_3_2 ) ) )
            // InternalMyHtml.g:1651:1: ( ( rule__Curve__Label_nameAssignment_3_2 ) )
            {
            // InternalMyHtml.g:1651:1: ( ( rule__Curve__Label_nameAssignment_3_2 ) )
            // InternalMyHtml.g:1652:2: ( rule__Curve__Label_nameAssignment_3_2 )
            {
             before(grammarAccess.getCurveAccess().getLabel_nameAssignment_3_2()); 
            // InternalMyHtml.g:1653:2: ( rule__Curve__Label_nameAssignment_3_2 )
            // InternalMyHtml.g:1653:3: rule__Curve__Label_nameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Curve__Label_nameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCurveAccess().getLabel_nameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_3__2__Impl"


    // $ANTLR start "rule__Curve__Group_4__0"
    // InternalMyHtml.g:1662:1: rule__Curve__Group_4__0 : rule__Curve__Group_4__0__Impl rule__Curve__Group_4__1 ;
    public final void rule__Curve__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1666:1: ( rule__Curve__Group_4__0__Impl rule__Curve__Group_4__1 )
            // InternalMyHtml.g:1667:2: rule__Curve__Group_4__0__Impl rule__Curve__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Curve__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_4__0"


    // $ANTLR start "rule__Curve__Group_4__0__Impl"
    // InternalMyHtml.g:1674:1: rule__Curve__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Curve__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1678:1: ( ( ',' ) )
            // InternalMyHtml.g:1679:1: ( ',' )
            {
            // InternalMyHtml.g:1679:1: ( ',' )
            // InternalMyHtml.g:1680:2: ','
            {
             before(grammarAccess.getCurveAccess().getCommaKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_4__0__Impl"


    // $ANTLR start "rule__Curve__Group_4__1"
    // InternalMyHtml.g:1689:1: rule__Curve__Group_4__1 : rule__Curve__Group_4__1__Impl rule__Curve__Group_4__2 ;
    public final void rule__Curve__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1693:1: ( rule__Curve__Group_4__1__Impl rule__Curve__Group_4__2 )
            // InternalMyHtml.g:1694:2: rule__Curve__Group_4__1__Impl rule__Curve__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Curve__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_4__1"


    // $ANTLR start "rule__Curve__Group_4__1__Impl"
    // InternalMyHtml.g:1701:1: rule__Curve__Group_4__1__Impl : ( 'legend' ) ;
    public final void rule__Curve__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1705:1: ( ( 'legend' ) )
            // InternalMyHtml.g:1706:1: ( 'legend' )
            {
            // InternalMyHtml.g:1706:1: ( 'legend' )
            // InternalMyHtml.g:1707:2: 'legend'
            {
             before(grammarAccess.getCurveAccess().getLegendKeyword_4_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getLegendKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_4__1__Impl"


    // $ANTLR start "rule__Curve__Group_4__2"
    // InternalMyHtml.g:1716:1: rule__Curve__Group_4__2 : rule__Curve__Group_4__2__Impl rule__Curve__Group_4__3 ;
    public final void rule__Curve__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1720:1: ( rule__Curve__Group_4__2__Impl rule__Curve__Group_4__3 )
            // InternalMyHtml.g:1721:2: rule__Curve__Group_4__2__Impl rule__Curve__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Curve__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_4__2"


    // $ANTLR start "rule__Curve__Group_4__2__Impl"
    // InternalMyHtml.g:1728:1: rule__Curve__Group_4__2__Impl : ( '=' ) ;
    public final void rule__Curve__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1732:1: ( ( '=' ) )
            // InternalMyHtml.g:1733:1: ( '=' )
            {
            // InternalMyHtml.g:1733:1: ( '=' )
            // InternalMyHtml.g:1734:2: '='
            {
             before(grammarAccess.getCurveAccess().getEqualsSignKeyword_4_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getEqualsSignKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_4__2__Impl"


    // $ANTLR start "rule__Curve__Group_4__3"
    // InternalMyHtml.g:1743:1: rule__Curve__Group_4__3 : rule__Curve__Group_4__3__Impl ;
    public final void rule__Curve__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1747:1: ( rule__Curve__Group_4__3__Impl )
            // InternalMyHtml.g:1748:2: rule__Curve__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Curve__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_4__3"


    // $ANTLR start "rule__Curve__Group_4__3__Impl"
    // InternalMyHtml.g:1754:1: rule__Curve__Group_4__3__Impl : ( ( rule__Curve__LegendAssignment_4_3 ) ) ;
    public final void rule__Curve__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1758:1: ( ( ( rule__Curve__LegendAssignment_4_3 ) ) )
            // InternalMyHtml.g:1759:1: ( ( rule__Curve__LegendAssignment_4_3 ) )
            {
            // InternalMyHtml.g:1759:1: ( ( rule__Curve__LegendAssignment_4_3 ) )
            // InternalMyHtml.g:1760:2: ( rule__Curve__LegendAssignment_4_3 )
            {
             before(grammarAccess.getCurveAccess().getLegendAssignment_4_3()); 
            // InternalMyHtml.g:1761:2: ( rule__Curve__LegendAssignment_4_3 )
            // InternalMyHtml.g:1761:3: rule__Curve__LegendAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Curve__LegendAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getCurveAccess().getLegendAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_4__3__Impl"


    // $ANTLR start "rule__Curve__Group_5__0"
    // InternalMyHtml.g:1770:1: rule__Curve__Group_5__0 : rule__Curve__Group_5__0__Impl rule__Curve__Group_5__1 ;
    public final void rule__Curve__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1774:1: ( rule__Curve__Group_5__0__Impl rule__Curve__Group_5__1 )
            // InternalMyHtml.g:1775:2: rule__Curve__Group_5__0__Impl rule__Curve__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Curve__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_5__0"


    // $ANTLR start "rule__Curve__Group_5__0__Impl"
    // InternalMyHtml.g:1782:1: rule__Curve__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Curve__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1786:1: ( ( ',' ) )
            // InternalMyHtml.g:1787:1: ( ',' )
            {
            // InternalMyHtml.g:1787:1: ( ',' )
            // InternalMyHtml.g:1788:2: ','
            {
             before(grammarAccess.getCurveAccess().getCommaKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_5__0__Impl"


    // $ANTLR start "rule__Curve__Group_5__1"
    // InternalMyHtml.g:1797:1: rule__Curve__Group_5__1 : rule__Curve__Group_5__1__Impl rule__Curve__Group_5__2 ;
    public final void rule__Curve__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1801:1: ( rule__Curve__Group_5__1__Impl rule__Curve__Group_5__2 )
            // InternalMyHtml.g:1802:2: rule__Curve__Group_5__1__Impl rule__Curve__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Curve__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_5__1"


    // $ANTLR start "rule__Curve__Group_5__1__Impl"
    // InternalMyHtml.g:1809:1: rule__Curve__Group_5__1__Impl : ( 'color' ) ;
    public final void rule__Curve__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1813:1: ( ( 'color' ) )
            // InternalMyHtml.g:1814:1: ( 'color' )
            {
            // InternalMyHtml.g:1814:1: ( 'color' )
            // InternalMyHtml.g:1815:2: 'color'
            {
             before(grammarAccess.getCurveAccess().getColorKeyword_5_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getColorKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_5__1__Impl"


    // $ANTLR start "rule__Curve__Group_5__2"
    // InternalMyHtml.g:1824:1: rule__Curve__Group_5__2 : rule__Curve__Group_5__2__Impl rule__Curve__Group_5__3 ;
    public final void rule__Curve__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1828:1: ( rule__Curve__Group_5__2__Impl rule__Curve__Group_5__3 )
            // InternalMyHtml.g:1829:2: rule__Curve__Group_5__2__Impl rule__Curve__Group_5__3
            {
            pushFollow(FOLLOW_25);
            rule__Curve__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curve__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_5__2"


    // $ANTLR start "rule__Curve__Group_5__2__Impl"
    // InternalMyHtml.g:1836:1: rule__Curve__Group_5__2__Impl : ( '=' ) ;
    public final void rule__Curve__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1840:1: ( ( '=' ) )
            // InternalMyHtml.g:1841:1: ( '=' )
            {
            // InternalMyHtml.g:1841:1: ( '=' )
            // InternalMyHtml.g:1842:2: '='
            {
             before(grammarAccess.getCurveAccess().getEqualsSignKeyword_5_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCurveAccess().getEqualsSignKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_5__2__Impl"


    // $ANTLR start "rule__Curve__Group_5__3"
    // InternalMyHtml.g:1851:1: rule__Curve__Group_5__3 : rule__Curve__Group_5__3__Impl ;
    public final void rule__Curve__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1855:1: ( rule__Curve__Group_5__3__Impl )
            // InternalMyHtml.g:1856:2: rule__Curve__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Curve__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_5__3"


    // $ANTLR start "rule__Curve__Group_5__3__Impl"
    // InternalMyHtml.g:1862:1: rule__Curve__Group_5__3__Impl : ( ( rule__Curve__ColorAssignment_5_3 ) ) ;
    public final void rule__Curve__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1866:1: ( ( ( rule__Curve__ColorAssignment_5_3 ) ) )
            // InternalMyHtml.g:1867:1: ( ( rule__Curve__ColorAssignment_5_3 ) )
            {
            // InternalMyHtml.g:1867:1: ( ( rule__Curve__ColorAssignment_5_3 ) )
            // InternalMyHtml.g:1868:2: ( rule__Curve__ColorAssignment_5_3 )
            {
             before(grammarAccess.getCurveAccess().getColorAssignment_5_3()); 
            // InternalMyHtml.g:1869:2: ( rule__Curve__ColorAssignment_5_3 )
            // InternalMyHtml.g:1869:3: rule__Curve__ColorAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Curve__ColorAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getCurveAccess().getColorAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Group_5__3__Impl"


    // $ANTLR start "rule__Html_generator_program__StatementAssignment_3"
    // InternalMyHtml.g:1878:1: rule__Html_generator_program__StatementAssignment_3 : ( rulestatement ) ;
    public final void rule__Html_generator_program__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1882:1: ( ( rulestatement ) )
            // InternalMyHtml.g:1883:2: ( rulestatement )
            {
            // InternalMyHtml.g:1883:2: ( rulestatement )
            // InternalMyHtml.g:1884:3: rulestatement
            {
             before(grammarAccess.getHtml_generator_programAccess().getStatementStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getHtml_generator_programAccess().getStatementStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__StatementAssignment_3"


    // $ANTLR start "rule__Html_generator_program__StatementAssignment_4_1"
    // InternalMyHtml.g:1893:1: rule__Html_generator_program__StatementAssignment_4_1 : ( rulestatement ) ;
    public final void rule__Html_generator_program__StatementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1897:1: ( ( rulestatement ) )
            // InternalMyHtml.g:1898:2: ( rulestatement )
            {
            // InternalMyHtml.g:1898:2: ( rulestatement )
            // InternalMyHtml.g:1899:3: rulestatement
            {
             before(grammarAccess.getHtml_generator_programAccess().getStatementStatementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getHtml_generator_programAccess().getStatementStatementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_generator_program__StatementAssignment_4_1"


    // $ANTLR start "rule__Graph__NameAssignment_2"
    // InternalMyHtml.g:1908:1: rule__Graph__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Graph__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1912:1: ( ( ruleEString ) )
            // InternalMyHtml.g:1913:2: ( ruleEString )
            {
            // InternalMyHtml.g:1913:2: ( ruleEString )
            // InternalMyHtml.g:1914:3: ruleEString
            {
             before(grammarAccess.getGraphAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__NameAssignment_2"


    // $ANTLR start "rule__Graph__StyleAssignment_6"
    // InternalMyHtml.g:1923:1: rule__Graph__StyleAssignment_6 : ( ruletype_graph ) ;
    public final void rule__Graph__StyleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1927:1: ( ( ruletype_graph ) )
            // InternalMyHtml.g:1928:2: ( ruletype_graph )
            {
            // InternalMyHtml.g:1928:2: ( ruletype_graph )
            // InternalMyHtml.g:1929:3: ruletype_graph
            {
             before(grammarAccess.getGraphAccess().getStyleType_graphEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruletype_graph();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getStyleType_graphEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__StyleAssignment_6"


    // $ANTLR start "rule__Graph__X_axisAssignment_10"
    // InternalMyHtml.g:1938:1: rule__Graph__X_axisAssignment_10 : ( ruleEString ) ;
    public final void rule__Graph__X_axisAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1942:1: ( ( ruleEString ) )
            // InternalMyHtml.g:1943:2: ( ruleEString )
            {
            // InternalMyHtml.g:1943:2: ( ruleEString )
            // InternalMyHtml.g:1944:3: ruleEString
            {
             before(grammarAccess.getGraphAccess().getX_axisEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getX_axisEStringParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__X_axisAssignment_10"


    // $ANTLR start "rule__Graph__CurveAssignment_12"
    // InternalMyHtml.g:1953:1: rule__Graph__CurveAssignment_12 : ( rulecurve ) ;
    public final void rule__Graph__CurveAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1957:1: ( ( rulecurve ) )
            // InternalMyHtml.g:1958:2: ( rulecurve )
            {
            // InternalMyHtml.g:1958:2: ( rulecurve )
            // InternalMyHtml.g:1959:3: rulecurve
            {
             before(grammarAccess.getGraphAccess().getCurveCurveParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            rulecurve();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getCurveCurveParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__CurveAssignment_12"


    // $ANTLR start "rule__Graph__CurveAssignment_13_1"
    // InternalMyHtml.g:1968:1: rule__Graph__CurveAssignment_13_1 : ( rulecurve ) ;
    public final void rule__Graph__CurveAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1972:1: ( ( rulecurve ) )
            // InternalMyHtml.g:1973:2: ( rulecurve )
            {
            // InternalMyHtml.g:1973:2: ( rulecurve )
            // InternalMyHtml.g:1974:3: rulecurve
            {
             before(grammarAccess.getGraphAccess().getCurveCurveParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            rulecurve();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getCurveCurveParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__CurveAssignment_13_1"


    // $ANTLR start "rule__Csv_loader__File_nameAssignment_3"
    // InternalMyHtml.g:1983:1: rule__Csv_loader__File_nameAssignment_3 : ( ruleEString ) ;
    public final void rule__Csv_loader__File_nameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:1987:1: ( ( ruleEString ) )
            // InternalMyHtml.g:1988:2: ( ruleEString )
            {
            // InternalMyHtml.g:1988:2: ( ruleEString )
            // InternalMyHtml.g:1989:3: ruleEString
            {
             before(grammarAccess.getCsv_loaderAccess().getFile_nameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsv_loaderAccess().getFile_nameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__File_nameAssignment_3"


    // $ANTLR start "rule__Csv_loader__SeparatorAssignment_4_3"
    // InternalMyHtml.g:1998:1: rule__Csv_loader__SeparatorAssignment_4_3 : ( ruleEString ) ;
    public final void rule__Csv_loader__SeparatorAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:2002:1: ( ( ruleEString ) )
            // InternalMyHtml.g:2003:2: ( ruleEString )
            {
            // InternalMyHtml.g:2003:2: ( ruleEString )
            // InternalMyHtml.g:2004:3: ruleEString
            {
             before(grammarAccess.getCsv_loaderAccess().getSeparatorEStringParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsv_loaderAccess().getSeparatorEStringParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Csv_loader__SeparatorAssignment_4_3"


    // $ANTLR start "rule__Curve__Label_nameAssignment_3_2"
    // InternalMyHtml.g:2013:1: rule__Curve__Label_nameAssignment_3_2 : ( ruleEString ) ;
    public final void rule__Curve__Label_nameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:2017:1: ( ( ruleEString ) )
            // InternalMyHtml.g:2018:2: ( ruleEString )
            {
            // InternalMyHtml.g:2018:2: ( ruleEString )
            // InternalMyHtml.g:2019:3: ruleEString
            {
             before(grammarAccess.getCurveAccess().getLabel_nameEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCurveAccess().getLabel_nameEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__Label_nameAssignment_3_2"


    // $ANTLR start "rule__Curve__LegendAssignment_4_3"
    // InternalMyHtml.g:2028:1: rule__Curve__LegendAssignment_4_3 : ( ruleEString ) ;
    public final void rule__Curve__LegendAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:2032:1: ( ( ruleEString ) )
            // InternalMyHtml.g:2033:2: ( ruleEString )
            {
            // InternalMyHtml.g:2033:2: ( ruleEString )
            // InternalMyHtml.g:2034:3: ruleEString
            {
             before(grammarAccess.getCurveAccess().getLegendEStringParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCurveAccess().getLegendEStringParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__LegendAssignment_4_3"


    // $ANTLR start "rule__Curve__ColorAssignment_5_3"
    // InternalMyHtml.g:2043:1: rule__Curve__ColorAssignment_5_3 : ( rulelist_color ) ;
    public final void rule__Curve__ColorAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyHtml.g:2047:1: ( ( rulelist_color ) )
            // InternalMyHtml.g:2048:2: ( rulelist_color )
            {
            // InternalMyHtml.g:2048:2: ( rulelist_color )
            // InternalMyHtml.g:2049:3: rulelist_color
            {
             before(grammarAccess.getCurveAccess().getColorList_colorEnumRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            rulelist_color();

            state._fsp--;

             after(grammarAccess.getCurveAccess().getColorList_colorEnumRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Curve__ColorAssignment_5_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000488000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000FFFF0000L});

}