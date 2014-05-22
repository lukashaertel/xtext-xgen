package xgen.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import xgen.services.ApplicationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplicationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_CHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'('", "'..'", "')'", "'{'", "'}'", "'replace'", "'in'", "'with'", "'adjust'", "'multiplicity'", "'.'", "':'", "';'", "'|'", "'!'", "'->'", "'/'", "','", "'lexical'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_CHAR=6;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalApplicationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApplicationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApplicationParser.tokenNames; }
    public String getGrammarFileName() { return "../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g"; }


     
     	private ApplicationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ApplicationGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:61:1: ( ruleModel EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:69:1: ruleModel : ( ( rule__Model__ApplicationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:73:2: ( ( ( rule__Model__ApplicationsAssignment )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:74:1: ( ( rule__Model__ApplicationsAssignment )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:74:1: ( ( rule__Model__ApplicationsAssignment )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:75:1: ( rule__Model__ApplicationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getApplicationsAssignment()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:76:1: ( rule__Model__ApplicationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:76:2: rule__Model__ApplicationsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ApplicationsAssignment_in_ruleModel94);
            	    rule__Model__ApplicationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getApplicationsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApply"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:88:1: entryRuleApply : ruleApply EOF ;
    public final void entryRuleApply() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:89:1: ( ruleApply EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:90:1: ruleApply EOF
            {
             before(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply122);
            ruleApply();

            state._fsp--;

             after(grammarAccess.getApplyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply129); 

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
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:97:1: ruleApply : ( ( rule__Apply__Group__0 ) ) ;
    public final void ruleApply() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:101:2: ( ( ( rule__Apply__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:102:1: ( ( rule__Apply__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:102:1: ( ( rule__Apply__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:103:1: ( rule__Apply__Group__0 )
            {
             before(grammarAccess.getApplyAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:104:1: ( rule__Apply__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:104:2: rule__Apply__Group__0
            {
            pushFollow(FOLLOW_rule__Apply__Group__0_in_ruleApply155);
            rule__Apply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getGroup()); 

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
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleConstructReplacement"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:116:1: entryRuleConstructReplacement : ruleConstructReplacement EOF ;
    public final void entryRuleConstructReplacement() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:117:1: ( ruleConstructReplacement EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:118:1: ruleConstructReplacement EOF
            {
             before(grammarAccess.getConstructReplacementRule()); 
            pushFollow(FOLLOW_ruleConstructReplacement_in_entryRuleConstructReplacement182);
            ruleConstructReplacement();

            state._fsp--;

             after(grammarAccess.getConstructReplacementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructReplacement189); 

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
    // $ANTLR end "entryRuleConstructReplacement"


    // $ANTLR start "ruleConstructReplacement"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:125:1: ruleConstructReplacement : ( ( rule__ConstructReplacement__Group__0 ) ) ;
    public final void ruleConstructReplacement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:129:2: ( ( ( rule__ConstructReplacement__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:130:1: ( ( rule__ConstructReplacement__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:130:1: ( ( rule__ConstructReplacement__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:131:1: ( rule__ConstructReplacement__Group__0 )
            {
             before(grammarAccess.getConstructReplacementAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:132:1: ( rule__ConstructReplacement__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:132:2: rule__ConstructReplacement__Group__0
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group__0_in_ruleConstructReplacement215);
            rule__ConstructReplacement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructReplacementAccess().getGroup()); 

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
    // $ANTLR end "ruleConstructReplacement"


    // $ANTLR start "entryRuleMultiplicityAdjustment"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:144:1: entryRuleMultiplicityAdjustment : ruleMultiplicityAdjustment EOF ;
    public final void entryRuleMultiplicityAdjustment() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:145:1: ( ruleMultiplicityAdjustment EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:146:1: ruleMultiplicityAdjustment EOF
            {
             before(grammarAccess.getMultiplicityAdjustmentRule()); 
            pushFollow(FOLLOW_ruleMultiplicityAdjustment_in_entryRuleMultiplicityAdjustment242);
            ruleMultiplicityAdjustment();

            state._fsp--;

             after(grammarAccess.getMultiplicityAdjustmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityAdjustment249); 

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
    // $ANTLR end "entryRuleMultiplicityAdjustment"


    // $ANTLR start "ruleMultiplicityAdjustment"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:153:1: ruleMultiplicityAdjustment : ( ( rule__MultiplicityAdjustment__Group__0 ) ) ;
    public final void ruleMultiplicityAdjustment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:157:2: ( ( ( rule__MultiplicityAdjustment__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:158:1: ( ( rule__MultiplicityAdjustment__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:158:1: ( ( rule__MultiplicityAdjustment__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:159:1: ( rule__MultiplicityAdjustment__Group__0 )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:160:1: ( rule__MultiplicityAdjustment__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:160:2: rule__MultiplicityAdjustment__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__0_in_ruleMultiplicityAdjustment275);
            rule__MultiplicityAdjustment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplicityAdjustment"


    // $ANTLR start "entryRuleRuleReplacement"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:172:1: entryRuleRuleReplacement : ruleRuleReplacement EOF ;
    public final void entryRuleRuleReplacement() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:173:1: ( ruleRuleReplacement EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:174:1: ruleRuleReplacement EOF
            {
             before(grammarAccess.getRuleReplacementRule()); 
            pushFollow(FOLLOW_ruleRuleReplacement_in_entryRuleRuleReplacement302);
            ruleRuleReplacement();

            state._fsp--;

             after(grammarAccess.getRuleReplacementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleReplacement309); 

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
    // $ANTLR end "entryRuleRuleReplacement"


    // $ANTLR start "ruleRuleReplacement"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:181:1: ruleRuleReplacement : ( ( rule__RuleReplacement__Group__0 ) ) ;
    public final void ruleRuleReplacement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:185:2: ( ( ( rule__RuleReplacement__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:186:1: ( ( rule__RuleReplacement__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:186:1: ( ( rule__RuleReplacement__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:187:1: ( rule__RuleReplacement__Group__0 )
            {
             before(grammarAccess.getRuleReplacementAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:188:1: ( rule__RuleReplacement__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:188:2: rule__RuleReplacement__Group__0
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__0_in_ruleRuleReplacement335);
            rule__RuleReplacement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleReplacementAccess().getGroup()); 

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
    // $ANTLR end "ruleRuleReplacement"


    // $ANTLR start "entryRuleQID"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:200:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:201:1: ( ruleQID EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:202:1: ruleQID EOF
            {
             before(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID362);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getQIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID369); 

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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:209:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:213:2: ( ( ( rule__QID__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:214:1: ( ( rule__QID__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:214:1: ( ( rule__QID__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:215:1: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:216:1: ( rule__QID__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:216:2: rule__QID__Group__0
            {
            pushFollow(FOLLOW_rule__QID__Group__0_in_ruleQID395);
            rule__QID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQIDAccess().getGroup()); 

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
    // $ANTLR end "ruleQID"


    // $ANTLR start "entryRuleDefinition"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:230:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:231:1: ( ruleDefinition EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:232:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition424);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition431); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:239:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:243:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:244:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:244:1: ( ( rule__Definition__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:245:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:246:1: ( rule__Definition__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:246:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition457);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleConstruct0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:258:1: entryRuleConstruct0 : ruleConstruct0 EOF ;
    public final void entryRuleConstruct0() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:259:1: ( ruleConstruct0 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:260:1: ruleConstruct0 EOF
            {
             before(grammarAccess.getConstruct0Rule()); 
            pushFollow(FOLLOW_ruleConstruct0_in_entryRuleConstruct0484);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getConstruct0Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct0491); 

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
    // $ANTLR end "entryRuleConstruct0"


    // $ANTLR start "ruleConstruct0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:267:1: ruleConstruct0 : ( ( rule__Construct0__Group__0 ) ) ;
    public final void ruleConstruct0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:271:2: ( ( ( rule__Construct0__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:272:1: ( ( rule__Construct0__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:272:1: ( ( rule__Construct0__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:273:1: ( rule__Construct0__Group__0 )
            {
             before(grammarAccess.getConstruct0Access().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:274:1: ( rule__Construct0__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:274:2: rule__Construct0__Group__0
            {
            pushFollow(FOLLOW_rule__Construct0__Group__0_in_ruleConstruct0517);
            rule__Construct0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstruct0Access().getGroup()); 

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
    // $ANTLR end "ruleConstruct0"


    // $ANTLR start "entryRuleConstruct1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:286:1: entryRuleConstruct1 : ruleConstruct1 EOF ;
    public final void entryRuleConstruct1() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:287:1: ( ruleConstruct1 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:288:1: ruleConstruct1 EOF
            {
             before(grammarAccess.getConstruct1Rule()); 
            pushFollow(FOLLOW_ruleConstruct1_in_entryRuleConstruct1544);
            ruleConstruct1();

            state._fsp--;

             after(grammarAccess.getConstruct1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct1551); 

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
    // $ANTLR end "entryRuleConstruct1"


    // $ANTLR start "ruleConstruct1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:295:1: ruleConstruct1 : ( ( rule__Construct1__Group__0 ) ) ;
    public final void ruleConstruct1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:299:2: ( ( ( rule__Construct1__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:300:1: ( ( rule__Construct1__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:300:1: ( ( rule__Construct1__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:301:1: ( rule__Construct1__Group__0 )
            {
             before(grammarAccess.getConstruct1Access().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:302:1: ( rule__Construct1__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:302:2: rule__Construct1__Group__0
            {
            pushFollow(FOLLOW_rule__Construct1__Group__0_in_ruleConstruct1577);
            rule__Construct1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstruct1Access().getGroup()); 

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
    // $ANTLR end "ruleConstruct1"


    // $ANTLR start "entryRuleConstruct2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:314:1: entryRuleConstruct2 : ruleConstruct2 EOF ;
    public final void entryRuleConstruct2() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:315:1: ( ruleConstruct2 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:316:1: ruleConstruct2 EOF
            {
             before(grammarAccess.getConstruct2Rule()); 
            pushFollow(FOLLOW_ruleConstruct2_in_entryRuleConstruct2604);
            ruleConstruct2();

            state._fsp--;

             after(grammarAccess.getConstruct2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct2611); 

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
    // $ANTLR end "entryRuleConstruct2"


    // $ANTLR start "ruleConstruct2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:323:1: ruleConstruct2 : ( ( rule__Construct2__Alternatives ) ) ;
    public final void ruleConstruct2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:327:2: ( ( ( rule__Construct2__Alternatives ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:328:1: ( ( rule__Construct2__Alternatives ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:328:1: ( ( rule__Construct2__Alternatives ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:329:1: ( rule__Construct2__Alternatives )
            {
             before(grammarAccess.getConstruct2Access().getAlternatives()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:330:1: ( rule__Construct2__Alternatives )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:330:2: rule__Construct2__Alternatives
            {
            pushFollow(FOLLOW_rule__Construct2__Alternatives_in_ruleConstruct2637);
            rule__Construct2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstruct2Access().getAlternatives()); 

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
    // $ANTLR end "ruleConstruct2"


    // $ANTLR start "entryRuleConstruct3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:342:1: entryRuleConstruct3 : ruleConstruct3 EOF ;
    public final void entryRuleConstruct3() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:343:1: ( ruleConstruct3 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:344:1: ruleConstruct3 EOF
            {
             before(grammarAccess.getConstruct3Rule()); 
            pushFollow(FOLLOW_ruleConstruct3_in_entryRuleConstruct3664);
            ruleConstruct3();

            state._fsp--;

             after(grammarAccess.getConstruct3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct3671); 

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
    // $ANTLR end "entryRuleConstruct3"


    // $ANTLR start "ruleConstruct3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:351:1: ruleConstruct3 : ( ( rule__Construct3__Group__0 ) ) ;
    public final void ruleConstruct3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:355:2: ( ( ( rule__Construct3__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:356:1: ( ( rule__Construct3__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:356:1: ( ( rule__Construct3__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:357:1: ( rule__Construct3__Group__0 )
            {
             before(grammarAccess.getConstruct3Access().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:358:1: ( rule__Construct3__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:358:2: rule__Construct3__Group__0
            {
            pushFollow(FOLLOW_rule__Construct3__Group__0_in_ruleConstruct3697);
            rule__Construct3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstruct3Access().getGroup()); 

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
    // $ANTLR end "ruleConstruct3"


    // $ANTLR start "entryRuleConstruct4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:370:1: entryRuleConstruct4 : ruleConstruct4 EOF ;
    public final void entryRuleConstruct4() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:371:1: ( ruleConstruct4 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:372:1: ruleConstruct4 EOF
            {
             before(grammarAccess.getConstruct4Rule()); 
            pushFollow(FOLLOW_ruleConstruct4_in_entryRuleConstruct4724);
            ruleConstruct4();

            state._fsp--;

             after(grammarAccess.getConstruct4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct4731); 

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
    // $ANTLR end "entryRuleConstruct4"


    // $ANTLR start "ruleConstruct4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:379:1: ruleConstruct4 : ( ( rule__Construct4__Alternatives ) ) ;
    public final void ruleConstruct4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:383:2: ( ( ( rule__Construct4__Alternatives ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:384:1: ( ( rule__Construct4__Alternatives ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:384:1: ( ( rule__Construct4__Alternatives ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:385:1: ( rule__Construct4__Alternatives )
            {
             before(grammarAccess.getConstruct4Access().getAlternatives()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:386:1: ( rule__Construct4__Alternatives )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:386:2: rule__Construct4__Alternatives
            {
            pushFollow(FOLLOW_rule__Construct4__Alternatives_in_ruleConstruct4757);
            rule__Construct4__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getAlternatives()); 

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
    // $ANTLR end "ruleConstruct4"


    // $ANTLR start "rule__Apply__Alternatives_7_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:398:1: rule__Apply__Alternatives_7_1 : ( ( ( rule__Apply__ConstructReplacementsAssignment_7_1_0 ) ) | ( ( rule__Apply__RuleReplacementsAssignment_7_1_1 ) ) | ( ( rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2 ) ) );
    public final void rule__Apply__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:402:1: ( ( ( rule__Apply__ConstructReplacementsAssignment_7_1_0 ) ) | ( ( rule__Apply__RuleReplacementsAssignment_7_1_1 ) ) | ( ( rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=RULE_CHAR && LA2_1<=RULE_STRING)||LA2_1==11||LA2_1==21||(LA2_1>=25 && LA2_1<=26)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_ID||(LA2_4>=RULE_CHAR && LA2_4<=RULE_STRING)||LA2_4==11||LA2_4==14||LA2_4==17||LA2_4==21||(LA2_4>=24 && LA2_4<=27)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==18) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==19) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:403:1: ( ( rule__Apply__ConstructReplacementsAssignment_7_1_0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:403:1: ( ( rule__Apply__ConstructReplacementsAssignment_7_1_0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:404:1: ( rule__Apply__ConstructReplacementsAssignment_7_1_0 )
                    {
                     before(grammarAccess.getApplyAccess().getConstructReplacementsAssignment_7_1_0()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:405:1: ( rule__Apply__ConstructReplacementsAssignment_7_1_0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:405:2: rule__Apply__ConstructReplacementsAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_rule__Apply__ConstructReplacementsAssignment_7_1_0_in_rule__Apply__Alternatives_7_1793);
                    rule__Apply__ConstructReplacementsAssignment_7_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplyAccess().getConstructReplacementsAssignment_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:409:6: ( ( rule__Apply__RuleReplacementsAssignment_7_1_1 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:409:6: ( ( rule__Apply__RuleReplacementsAssignment_7_1_1 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:410:1: ( rule__Apply__RuleReplacementsAssignment_7_1_1 )
                    {
                     before(grammarAccess.getApplyAccess().getRuleReplacementsAssignment_7_1_1()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:411:1: ( rule__Apply__RuleReplacementsAssignment_7_1_1 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:411:2: rule__Apply__RuleReplacementsAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_rule__Apply__RuleReplacementsAssignment_7_1_1_in_rule__Apply__Alternatives_7_1811);
                    rule__Apply__RuleReplacementsAssignment_7_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplyAccess().getRuleReplacementsAssignment_7_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:415:6: ( ( rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:415:6: ( ( rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:416:1: ( rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2 )
                    {
                     before(grammarAccess.getApplyAccess().getMultiplicityAdjustmentsAssignment_7_1_2()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:417:1: ( rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:417:2: rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2
                    {
                    pushFollow(FOLLOW_rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2_in_rule__Apply__Alternatives_7_1829);
                    rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplyAccess().getMultiplicityAdjustmentsAssignment_7_1_2()); 

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
    // $ANTLR end "rule__Apply__Alternatives_7_1"


    // $ANTLR start "rule__Construct2__Alternatives"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:426:1: rule__Construct2__Alternatives : ( ( ( rule__Construct2__Group_0__0 ) ) | ( ( rule__Construct2__Group_1__0 ) ) | ( ruleConstruct3 ) );
    public final void rule__Construct2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:430:1: ( ( ( rule__Construct2__Group_0__0 ) ) | ( ( rule__Construct2__Group_1__0 ) ) | ( ruleConstruct3 ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_CHAR:
            case RULE_STRING:
            case 11:
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:431:1: ( ( rule__Construct2__Group_0__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:431:1: ( ( rule__Construct2__Group_0__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:432:1: ( rule__Construct2__Group_0__0 )
                    {
                     before(grammarAccess.getConstruct2Access().getGroup_0()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:433:1: ( rule__Construct2__Group_0__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:433:2: rule__Construct2__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Construct2__Group_0__0_in_rule__Construct2__Alternatives862);
                    rule__Construct2__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct2Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:437:6: ( ( rule__Construct2__Group_1__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:437:6: ( ( rule__Construct2__Group_1__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:438:1: ( rule__Construct2__Group_1__0 )
                    {
                     before(grammarAccess.getConstruct2Access().getGroup_1()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:439:1: ( rule__Construct2__Group_1__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:439:2: rule__Construct2__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Construct2__Group_1__0_in_rule__Construct2__Alternatives880);
                    rule__Construct2__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct2Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:443:6: ( ruleConstruct3 )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:443:6: ( ruleConstruct3 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:444:1: ruleConstruct3
                    {
                     before(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstruct3_in_rule__Construct2__Alternatives898);
                    ruleConstruct3();

                    state._fsp--;

                     after(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_2()); 

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
    // $ANTLR end "rule__Construct2__Alternatives"


    // $ANTLR start "rule__Construct4__Alternatives"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:454:1: rule__Construct4__Alternatives : ( ( ( rule__Construct4__Group_0__0 ) ) | ( ( rule__Construct4__Group_1__0 ) ) | ( ( rule__Construct4__Group_2__0 ) ) | ( ( rule__Construct4__Group_3__0 ) ) | ( ( rule__Construct4__Group_4__0 ) ) );
    public final void rule__Construct4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:458:1: ( ( ( rule__Construct4__Group_0__0 ) ) | ( ( rule__Construct4__Group_1__0 ) ) | ( ( rule__Construct4__Group_2__0 ) ) | ( ( rule__Construct4__Group_3__0 ) ) | ( ( rule__Construct4__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_CHAR:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            case 11:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:459:1: ( ( rule__Construct4__Group_0__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:459:1: ( ( rule__Construct4__Group_0__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:460:1: ( rule__Construct4__Group_0__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_0()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:461:1: ( rule__Construct4__Group_0__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:461:2: rule__Construct4__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_0__0_in_rule__Construct4__Alternatives930);
                    rule__Construct4__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:465:6: ( ( rule__Construct4__Group_1__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:465:6: ( ( rule__Construct4__Group_1__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:466:1: ( rule__Construct4__Group_1__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_1()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:467:1: ( rule__Construct4__Group_1__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:467:2: rule__Construct4__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_1__0_in_rule__Construct4__Alternatives948);
                    rule__Construct4__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:471:6: ( ( rule__Construct4__Group_2__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:471:6: ( ( rule__Construct4__Group_2__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:472:1: ( rule__Construct4__Group_2__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_2()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:473:1: ( rule__Construct4__Group_2__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:473:2: rule__Construct4__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_2__0_in_rule__Construct4__Alternatives966);
                    rule__Construct4__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:477:6: ( ( rule__Construct4__Group_3__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:477:6: ( ( rule__Construct4__Group_3__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:478:1: ( rule__Construct4__Group_3__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_3()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:479:1: ( rule__Construct4__Group_3__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:479:2: rule__Construct4__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_3__0_in_rule__Construct4__Alternatives984);
                    rule__Construct4__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:483:6: ( ( rule__Construct4__Group_4__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:483:6: ( ( rule__Construct4__Group_4__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:484:1: ( rule__Construct4__Group_4__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_4()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:485:1: ( rule__Construct4__Group_4__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:485:2: rule__Construct4__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_4__0_in_rule__Construct4__Alternatives1002);
                    rule__Construct4__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_4()); 

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
    // $ANTLR end "rule__Construct4__Alternatives"


    // $ANTLR start "rule__Apply__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:496:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:500:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:501:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__01033);
            rule__Apply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__01036);
            rule__Apply__Group__1();

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
    // $ANTLR end "rule__Apply__Group__0"


    // $ANTLR start "rule__Apply__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:508:1: rule__Apply__Group__0__Impl : ( () ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:512:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:513:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:513:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:514:1: ()
            {
             before(grammarAccess.getApplyAccess().getApplicationAction_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:515:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:517:1: 
            {
            }

             after(grammarAccess.getApplyAccess().getApplicationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group__0__Impl"


    // $ANTLR start "rule__Apply__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:527:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl rule__Apply__Group__2 ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:531:1: ( rule__Apply__Group__1__Impl rule__Apply__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:532:2: rule__Apply__Group__1__Impl rule__Apply__Group__2
            {
            pushFollow(FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__11094);
            rule__Apply__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__2_in_rule__Apply__Group__11097);
            rule__Apply__Group__2();

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
    // $ANTLR end "rule__Apply__Group__1"


    // $ANTLR start "rule__Apply__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:539:1: rule__Apply__Group__1__Impl : ( ( rule__Apply__TargetAssignment_1 ) ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:543:1: ( ( ( rule__Apply__TargetAssignment_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:544:1: ( ( rule__Apply__TargetAssignment_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:544:1: ( ( rule__Apply__TargetAssignment_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:545:1: ( rule__Apply__TargetAssignment_1 )
            {
             before(grammarAccess.getApplyAccess().getTargetAssignment_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:546:1: ( rule__Apply__TargetAssignment_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:546:2: rule__Apply__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__Apply__TargetAssignment_1_in_rule__Apply__Group__1__Impl1124);
            rule__Apply__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__Apply__Group__1__Impl"


    // $ANTLR start "rule__Apply__Group__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:556:1: rule__Apply__Group__2 : rule__Apply__Group__2__Impl rule__Apply__Group__3 ;
    public final void rule__Apply__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:560:1: ( rule__Apply__Group__2__Impl rule__Apply__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:561:2: rule__Apply__Group__2__Impl rule__Apply__Group__3
            {
            pushFollow(FOLLOW_rule__Apply__Group__2__Impl_in_rule__Apply__Group__21154);
            rule__Apply__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__3_in_rule__Apply__Group__21157);
            rule__Apply__Group__3();

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
    // $ANTLR end "rule__Apply__Group__2"


    // $ANTLR start "rule__Apply__Group__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:568:1: rule__Apply__Group__2__Impl : ( '(' ) ;
    public final void rule__Apply__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:572:1: ( ( '(' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:573:1: ( '(' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:573:1: ( '(' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:574:1: '('
            {
             before(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__Apply__Group__2__Impl1185); 
             after(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Apply__Group__2__Impl"


    // $ANTLR start "rule__Apply__Group__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:587:1: rule__Apply__Group__3 : rule__Apply__Group__3__Impl rule__Apply__Group__4 ;
    public final void rule__Apply__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:591:1: ( rule__Apply__Group__3__Impl rule__Apply__Group__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:592:2: rule__Apply__Group__3__Impl rule__Apply__Group__4
            {
            pushFollow(FOLLOW_rule__Apply__Group__3__Impl_in_rule__Apply__Group__31216);
            rule__Apply__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__4_in_rule__Apply__Group__31219);
            rule__Apply__Group__4();

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
    // $ANTLR end "rule__Apply__Group__3"


    // $ANTLR start "rule__Apply__Group__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:599:1: rule__Apply__Group__3__Impl : ( ( rule__Apply__MinAssignment_3 ) ) ;
    public final void rule__Apply__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:603:1: ( ( ( rule__Apply__MinAssignment_3 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:604:1: ( ( rule__Apply__MinAssignment_3 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:604:1: ( ( rule__Apply__MinAssignment_3 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:605:1: ( rule__Apply__MinAssignment_3 )
            {
             before(grammarAccess.getApplyAccess().getMinAssignment_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:606:1: ( rule__Apply__MinAssignment_3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:606:2: rule__Apply__MinAssignment_3
            {
            pushFollow(FOLLOW_rule__Apply__MinAssignment_3_in_rule__Apply__Group__3__Impl1246);
            rule__Apply__MinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getMinAssignment_3()); 

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
    // $ANTLR end "rule__Apply__Group__3__Impl"


    // $ANTLR start "rule__Apply__Group__4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:616:1: rule__Apply__Group__4 : rule__Apply__Group__4__Impl rule__Apply__Group__5 ;
    public final void rule__Apply__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:620:1: ( rule__Apply__Group__4__Impl rule__Apply__Group__5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:621:2: rule__Apply__Group__4__Impl rule__Apply__Group__5
            {
            pushFollow(FOLLOW_rule__Apply__Group__4__Impl_in_rule__Apply__Group__41276);
            rule__Apply__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__5_in_rule__Apply__Group__41279);
            rule__Apply__Group__5();

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
    // $ANTLR end "rule__Apply__Group__4"


    // $ANTLR start "rule__Apply__Group__4__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:628:1: rule__Apply__Group__4__Impl : ( '..' ) ;
    public final void rule__Apply__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:632:1: ( ( '..' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:633:1: ( '..' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:633:1: ( '..' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:634:1: '..'
            {
             before(grammarAccess.getApplyAccess().getFullStopFullStopKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Apply__Group__4__Impl1307); 
             after(grammarAccess.getApplyAccess().getFullStopFullStopKeyword_4()); 

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
    // $ANTLR end "rule__Apply__Group__4__Impl"


    // $ANTLR start "rule__Apply__Group__5"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:647:1: rule__Apply__Group__5 : rule__Apply__Group__5__Impl rule__Apply__Group__6 ;
    public final void rule__Apply__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:651:1: ( rule__Apply__Group__5__Impl rule__Apply__Group__6 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:652:2: rule__Apply__Group__5__Impl rule__Apply__Group__6
            {
            pushFollow(FOLLOW_rule__Apply__Group__5__Impl_in_rule__Apply__Group__51338);
            rule__Apply__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__6_in_rule__Apply__Group__51341);
            rule__Apply__Group__6();

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
    // $ANTLR end "rule__Apply__Group__5"


    // $ANTLR start "rule__Apply__Group__5__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:659:1: rule__Apply__Group__5__Impl : ( ( rule__Apply__MaxAssignment_5 ) ) ;
    public final void rule__Apply__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:663:1: ( ( ( rule__Apply__MaxAssignment_5 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:664:1: ( ( rule__Apply__MaxAssignment_5 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:664:1: ( ( rule__Apply__MaxAssignment_5 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:665:1: ( rule__Apply__MaxAssignment_5 )
            {
             before(grammarAccess.getApplyAccess().getMaxAssignment_5()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:666:1: ( rule__Apply__MaxAssignment_5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:666:2: rule__Apply__MaxAssignment_5
            {
            pushFollow(FOLLOW_rule__Apply__MaxAssignment_5_in_rule__Apply__Group__5__Impl1368);
            rule__Apply__MaxAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getMaxAssignment_5()); 

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
    // $ANTLR end "rule__Apply__Group__5__Impl"


    // $ANTLR start "rule__Apply__Group__6"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:676:1: rule__Apply__Group__6 : rule__Apply__Group__6__Impl rule__Apply__Group__7 ;
    public final void rule__Apply__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:680:1: ( rule__Apply__Group__6__Impl rule__Apply__Group__7 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:681:2: rule__Apply__Group__6__Impl rule__Apply__Group__7
            {
            pushFollow(FOLLOW_rule__Apply__Group__6__Impl_in_rule__Apply__Group__61398);
            rule__Apply__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__7_in_rule__Apply__Group__61401);
            rule__Apply__Group__7();

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
    // $ANTLR end "rule__Apply__Group__6"


    // $ANTLR start "rule__Apply__Group__6__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:688:1: rule__Apply__Group__6__Impl : ( ')' ) ;
    public final void rule__Apply__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:692:1: ( ( ')' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:693:1: ( ')' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:693:1: ( ')' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:694:1: ')'
            {
             before(grammarAccess.getApplyAccess().getRightParenthesisKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Apply__Group__6__Impl1429); 
             after(grammarAccess.getApplyAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Apply__Group__6__Impl"


    // $ANTLR start "rule__Apply__Group__7"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:707:1: rule__Apply__Group__7 : rule__Apply__Group__7__Impl ;
    public final void rule__Apply__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:711:1: ( rule__Apply__Group__7__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:712:2: rule__Apply__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group__7__Impl_in_rule__Apply__Group__71460);
            rule__Apply__Group__7__Impl();

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
    // $ANTLR end "rule__Apply__Group__7"


    // $ANTLR start "rule__Apply__Group__7__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:718:1: rule__Apply__Group__7__Impl : ( ( rule__Apply__Group_7__0 )? ) ;
    public final void rule__Apply__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:722:1: ( ( ( rule__Apply__Group_7__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:723:1: ( ( rule__Apply__Group_7__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:723:1: ( ( rule__Apply__Group_7__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:724:1: ( rule__Apply__Group_7__0 )?
            {
             before(grammarAccess.getApplyAccess().getGroup_7()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:725:1: ( rule__Apply__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:725:2: rule__Apply__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Apply__Group_7__0_in_rule__Apply__Group__7__Impl1487);
                    rule__Apply__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Apply__Group__7__Impl"


    // $ANTLR start "rule__Apply__Group_7__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:751:1: rule__Apply__Group_7__0 : rule__Apply__Group_7__0__Impl rule__Apply__Group_7__1 ;
    public final void rule__Apply__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:755:1: ( rule__Apply__Group_7__0__Impl rule__Apply__Group_7__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:756:2: rule__Apply__Group_7__0__Impl rule__Apply__Group_7__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_7__0__Impl_in_rule__Apply__Group_7__01534);
            rule__Apply__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_7__1_in_rule__Apply__Group_7__01537);
            rule__Apply__Group_7__1();

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
    // $ANTLR end "rule__Apply__Group_7__0"


    // $ANTLR start "rule__Apply__Group_7__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:763:1: rule__Apply__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Apply__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:767:1: ( ( '{' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:768:1: ( '{' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:768:1: ( '{' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:769:1: '{'
            {
             before(grammarAccess.getApplyAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,14,FOLLOW_14_in_rule__Apply__Group_7__0__Impl1565); 
             after(grammarAccess.getApplyAccess().getLeftCurlyBracketKeyword_7_0()); 

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
    // $ANTLR end "rule__Apply__Group_7__0__Impl"


    // $ANTLR start "rule__Apply__Group_7__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:782:1: rule__Apply__Group_7__1 : rule__Apply__Group_7__1__Impl rule__Apply__Group_7__2 ;
    public final void rule__Apply__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:786:1: ( rule__Apply__Group_7__1__Impl rule__Apply__Group_7__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:787:2: rule__Apply__Group_7__1__Impl rule__Apply__Group_7__2
            {
            pushFollow(FOLLOW_rule__Apply__Group_7__1__Impl_in_rule__Apply__Group_7__11596);
            rule__Apply__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_7__2_in_rule__Apply__Group_7__11599);
            rule__Apply__Group_7__2();

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
    // $ANTLR end "rule__Apply__Group_7__1"


    // $ANTLR start "rule__Apply__Group_7__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:794:1: rule__Apply__Group_7__1__Impl : ( ( rule__Apply__Alternatives_7_1 )* ) ;
    public final void rule__Apply__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:798:1: ( ( ( rule__Apply__Alternatives_7_1 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:799:1: ( ( rule__Apply__Alternatives_7_1 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:799:1: ( ( rule__Apply__Alternatives_7_1 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:800:1: ( rule__Apply__Alternatives_7_1 )*
            {
             before(grammarAccess.getApplyAccess().getAlternatives_7_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:801:1: ( rule__Apply__Alternatives_7_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:801:2: rule__Apply__Alternatives_7_1
            	    {
            	    pushFollow(FOLLOW_rule__Apply__Alternatives_7_1_in_rule__Apply__Group_7__1__Impl1626);
            	    rule__Apply__Alternatives_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getApplyAccess().getAlternatives_7_1()); 

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
    // $ANTLR end "rule__Apply__Group_7__1__Impl"


    // $ANTLR start "rule__Apply__Group_7__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:811:1: rule__Apply__Group_7__2 : rule__Apply__Group_7__2__Impl ;
    public final void rule__Apply__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:815:1: ( rule__Apply__Group_7__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:816:2: rule__Apply__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_7__2__Impl_in_rule__Apply__Group_7__21657);
            rule__Apply__Group_7__2__Impl();

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
    // $ANTLR end "rule__Apply__Group_7__2"


    // $ANTLR start "rule__Apply__Group_7__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:822:1: rule__Apply__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Apply__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:826:1: ( ( '}' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:827:1: ( '}' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:827:1: ( '}' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:828:1: '}'
            {
             before(grammarAccess.getApplyAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,15,FOLLOW_15_in_rule__Apply__Group_7__2__Impl1685); 
             after(grammarAccess.getApplyAccess().getRightCurlyBracketKeyword_7_2()); 

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
    // $ANTLR end "rule__Apply__Group_7__2__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:847:1: rule__ConstructReplacement__Group__0 : rule__ConstructReplacement__Group__0__Impl rule__ConstructReplacement__Group__1 ;
    public final void rule__ConstructReplacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:851:1: ( rule__ConstructReplacement__Group__0__Impl rule__ConstructReplacement__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:852:2: rule__ConstructReplacement__Group__0__Impl rule__ConstructReplacement__Group__1
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group__0__Impl_in_rule__ConstructReplacement__Group__01722);
            rule__ConstructReplacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructReplacement__Group__1_in_rule__ConstructReplacement__Group__01725);
            rule__ConstructReplacement__Group__1();

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
    // $ANTLR end "rule__ConstructReplacement__Group__0"


    // $ANTLR start "rule__ConstructReplacement__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:859:1: rule__ConstructReplacement__Group__0__Impl : ( 'replace' ) ;
    public final void rule__ConstructReplacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:863:1: ( ( 'replace' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:864:1: ( 'replace' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:864:1: ( 'replace' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:865:1: 'replace'
            {
             before(grammarAccess.getConstructReplacementAccess().getReplaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__ConstructReplacement__Group__0__Impl1753); 
             after(grammarAccess.getConstructReplacementAccess().getReplaceKeyword_0()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group__0__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:878:1: rule__ConstructReplacement__Group__1 : rule__ConstructReplacement__Group__1__Impl rule__ConstructReplacement__Group__2 ;
    public final void rule__ConstructReplacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:882:1: ( rule__ConstructReplacement__Group__1__Impl rule__ConstructReplacement__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:883:2: rule__ConstructReplacement__Group__1__Impl rule__ConstructReplacement__Group__2
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group__1__Impl_in_rule__ConstructReplacement__Group__11784);
            rule__ConstructReplacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructReplacement__Group__2_in_rule__ConstructReplacement__Group__11787);
            rule__ConstructReplacement__Group__2();

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
    // $ANTLR end "rule__ConstructReplacement__Group__1"


    // $ANTLR start "rule__ConstructReplacement__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:890:1: rule__ConstructReplacement__Group__1__Impl : ( ( rule__ConstructReplacement__SelectorAssignment_1 ) ) ;
    public final void rule__ConstructReplacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:894:1: ( ( ( rule__ConstructReplacement__SelectorAssignment_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:895:1: ( ( rule__ConstructReplacement__SelectorAssignment_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:895:1: ( ( rule__ConstructReplacement__SelectorAssignment_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:896:1: ( rule__ConstructReplacement__SelectorAssignment_1 )
            {
             before(grammarAccess.getConstructReplacementAccess().getSelectorAssignment_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:897:1: ( rule__ConstructReplacement__SelectorAssignment_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:897:2: rule__ConstructReplacement__SelectorAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__SelectorAssignment_1_in_rule__ConstructReplacement__Group__1__Impl1814);
            rule__ConstructReplacement__SelectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructReplacementAccess().getSelectorAssignment_1()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group__1__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:907:1: rule__ConstructReplacement__Group__2 : rule__ConstructReplacement__Group__2__Impl rule__ConstructReplacement__Group__3 ;
    public final void rule__ConstructReplacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:911:1: ( rule__ConstructReplacement__Group__2__Impl rule__ConstructReplacement__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:912:2: rule__ConstructReplacement__Group__2__Impl rule__ConstructReplacement__Group__3
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group__2__Impl_in_rule__ConstructReplacement__Group__21844);
            rule__ConstructReplacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructReplacement__Group__3_in_rule__ConstructReplacement__Group__21847);
            rule__ConstructReplacement__Group__3();

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
    // $ANTLR end "rule__ConstructReplacement__Group__2"


    // $ANTLR start "rule__ConstructReplacement__Group__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:919:1: rule__ConstructReplacement__Group__2__Impl : ( ( rule__ConstructReplacement__Group_2__0 )? ) ;
    public final void rule__ConstructReplacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:923:1: ( ( ( rule__ConstructReplacement__Group_2__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:924:1: ( ( rule__ConstructReplacement__Group_2__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:924:1: ( ( rule__ConstructReplacement__Group_2__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:925:1: ( rule__ConstructReplacement__Group_2__0 )?
            {
             before(grammarAccess.getConstructReplacementAccess().getGroup_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:926:1: ( rule__ConstructReplacement__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:926:2: rule__ConstructReplacement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ConstructReplacement__Group_2__0_in_rule__ConstructReplacement__Group__2__Impl1874);
                    rule__ConstructReplacement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructReplacementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group__2__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:936:1: rule__ConstructReplacement__Group__3 : rule__ConstructReplacement__Group__3__Impl rule__ConstructReplacement__Group__4 ;
    public final void rule__ConstructReplacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:940:1: ( rule__ConstructReplacement__Group__3__Impl rule__ConstructReplacement__Group__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:941:2: rule__ConstructReplacement__Group__3__Impl rule__ConstructReplacement__Group__4
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group__3__Impl_in_rule__ConstructReplacement__Group__31905);
            rule__ConstructReplacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructReplacement__Group__4_in_rule__ConstructReplacement__Group__31908);
            rule__ConstructReplacement__Group__4();

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
    // $ANTLR end "rule__ConstructReplacement__Group__3"


    // $ANTLR start "rule__ConstructReplacement__Group__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:948:1: rule__ConstructReplacement__Group__3__Impl : ( 'in' ) ;
    public final void rule__ConstructReplacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:952:1: ( ( 'in' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:953:1: ( 'in' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:953:1: ( 'in' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:954:1: 'in'
            {
             before(grammarAccess.getConstructReplacementAccess().getInKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__ConstructReplacement__Group__3__Impl1936); 
             after(grammarAccess.getConstructReplacementAccess().getInKeyword_3()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group__3__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group__4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:967:1: rule__ConstructReplacement__Group__4 : rule__ConstructReplacement__Group__4__Impl rule__ConstructReplacement__Group__5 ;
    public final void rule__ConstructReplacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:971:1: ( rule__ConstructReplacement__Group__4__Impl rule__ConstructReplacement__Group__5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:972:2: rule__ConstructReplacement__Group__4__Impl rule__ConstructReplacement__Group__5
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group__4__Impl_in_rule__ConstructReplacement__Group__41967);
            rule__ConstructReplacement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructReplacement__Group__5_in_rule__ConstructReplacement__Group__41970);
            rule__ConstructReplacement__Group__5();

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
    // $ANTLR end "rule__ConstructReplacement__Group__4"


    // $ANTLR start "rule__ConstructReplacement__Group__4__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:979:1: rule__ConstructReplacement__Group__4__Impl : ( ( rule__ConstructReplacement__TargetAssignment_4 ) ) ;
    public final void rule__ConstructReplacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:983:1: ( ( ( rule__ConstructReplacement__TargetAssignment_4 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:984:1: ( ( rule__ConstructReplacement__TargetAssignment_4 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:984:1: ( ( rule__ConstructReplacement__TargetAssignment_4 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:985:1: ( rule__ConstructReplacement__TargetAssignment_4 )
            {
             before(grammarAccess.getConstructReplacementAccess().getTargetAssignment_4()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:986:1: ( rule__ConstructReplacement__TargetAssignment_4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:986:2: rule__ConstructReplacement__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__TargetAssignment_4_in_rule__ConstructReplacement__Group__4__Impl1997);
            rule__ConstructReplacement__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConstructReplacementAccess().getTargetAssignment_4()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group__4__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group__5"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:996:1: rule__ConstructReplacement__Group__5 : rule__ConstructReplacement__Group__5__Impl rule__ConstructReplacement__Group__6 ;
    public final void rule__ConstructReplacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1000:1: ( rule__ConstructReplacement__Group__5__Impl rule__ConstructReplacement__Group__6 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1001:2: rule__ConstructReplacement__Group__5__Impl rule__ConstructReplacement__Group__6
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group__5__Impl_in_rule__ConstructReplacement__Group__52027);
            rule__ConstructReplacement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructReplacement__Group__6_in_rule__ConstructReplacement__Group__52030);
            rule__ConstructReplacement__Group__6();

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
    // $ANTLR end "rule__ConstructReplacement__Group__5"


    // $ANTLR start "rule__ConstructReplacement__Group__5__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1008:1: rule__ConstructReplacement__Group__5__Impl : ( 'with' ) ;
    public final void rule__ConstructReplacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1012:1: ( ( 'with' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1013:1: ( 'with' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1013:1: ( 'with' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1014:1: 'with'
            {
             before(grammarAccess.getConstructReplacementAccess().getWithKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__ConstructReplacement__Group__5__Impl2058); 
             after(grammarAccess.getConstructReplacementAccess().getWithKeyword_5()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group__5__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group__6"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1027:1: rule__ConstructReplacement__Group__6 : rule__ConstructReplacement__Group__6__Impl ;
    public final void rule__ConstructReplacement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1031:1: ( rule__ConstructReplacement__Group__6__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1032:2: rule__ConstructReplacement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group__6__Impl_in_rule__ConstructReplacement__Group__62089);
            rule__ConstructReplacement__Group__6__Impl();

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
    // $ANTLR end "rule__ConstructReplacement__Group__6"


    // $ANTLR start "rule__ConstructReplacement__Group__6__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1038:1: rule__ConstructReplacement__Group__6__Impl : ( ( rule__ConstructReplacement__ReplacementAssignment_6 ) ) ;
    public final void rule__ConstructReplacement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1042:1: ( ( ( rule__ConstructReplacement__ReplacementAssignment_6 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1043:1: ( ( rule__ConstructReplacement__ReplacementAssignment_6 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1043:1: ( ( rule__ConstructReplacement__ReplacementAssignment_6 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1044:1: ( rule__ConstructReplacement__ReplacementAssignment_6 )
            {
             before(grammarAccess.getConstructReplacementAccess().getReplacementAssignment_6()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1045:1: ( rule__ConstructReplacement__ReplacementAssignment_6 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1045:2: rule__ConstructReplacement__ReplacementAssignment_6
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__ReplacementAssignment_6_in_rule__ConstructReplacement__Group__6__Impl2116);
            rule__ConstructReplacement__ReplacementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConstructReplacementAccess().getReplacementAssignment_6()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group__6__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group_2__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1069:1: rule__ConstructReplacement__Group_2__0 : rule__ConstructReplacement__Group_2__0__Impl rule__ConstructReplacement__Group_2__1 ;
    public final void rule__ConstructReplacement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1073:1: ( rule__ConstructReplacement__Group_2__0__Impl rule__ConstructReplacement__Group_2__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1074:2: rule__ConstructReplacement__Group_2__0__Impl rule__ConstructReplacement__Group_2__1
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group_2__0__Impl_in_rule__ConstructReplacement__Group_2__02160);
            rule__ConstructReplacement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructReplacement__Group_2__1_in_rule__ConstructReplacement__Group_2__02163);
            rule__ConstructReplacement__Group_2__1();

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
    // $ANTLR end "rule__ConstructReplacement__Group_2__0"


    // $ANTLR start "rule__ConstructReplacement__Group_2__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1081:1: rule__ConstructReplacement__Group_2__0__Impl : ( ( rule__ConstructReplacement__PositionedAssignment_2_0 ) ) ;
    public final void rule__ConstructReplacement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1085:1: ( ( ( rule__ConstructReplacement__PositionedAssignment_2_0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1086:1: ( ( rule__ConstructReplacement__PositionedAssignment_2_0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1086:1: ( ( rule__ConstructReplacement__PositionedAssignment_2_0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1087:1: ( rule__ConstructReplacement__PositionedAssignment_2_0 )
            {
             before(grammarAccess.getConstructReplacementAccess().getPositionedAssignment_2_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1088:1: ( rule__ConstructReplacement__PositionedAssignment_2_0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1088:2: rule__ConstructReplacement__PositionedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__PositionedAssignment_2_0_in_rule__ConstructReplacement__Group_2__0__Impl2190);
            rule__ConstructReplacement__PositionedAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructReplacementAccess().getPositionedAssignment_2_0()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group_2__0__Impl"


    // $ANTLR start "rule__ConstructReplacement__Group_2__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1098:1: rule__ConstructReplacement__Group_2__1 : rule__ConstructReplacement__Group_2__1__Impl ;
    public final void rule__ConstructReplacement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1102:1: ( rule__ConstructReplacement__Group_2__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1103:2: rule__ConstructReplacement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__Group_2__1__Impl_in_rule__ConstructReplacement__Group_2__12220);
            rule__ConstructReplacement__Group_2__1__Impl();

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
    // $ANTLR end "rule__ConstructReplacement__Group_2__1"


    // $ANTLR start "rule__ConstructReplacement__Group_2__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1109:1: rule__ConstructReplacement__Group_2__1__Impl : ( ( rule__ConstructReplacement__PositionAssignment_2_1 ) ) ;
    public final void rule__ConstructReplacement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1113:1: ( ( ( rule__ConstructReplacement__PositionAssignment_2_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1114:1: ( ( rule__ConstructReplacement__PositionAssignment_2_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1114:1: ( ( rule__ConstructReplacement__PositionAssignment_2_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1115:1: ( rule__ConstructReplacement__PositionAssignment_2_1 )
            {
             before(grammarAccess.getConstructReplacementAccess().getPositionAssignment_2_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1116:1: ( rule__ConstructReplacement__PositionAssignment_2_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1116:2: rule__ConstructReplacement__PositionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ConstructReplacement__PositionAssignment_2_1_in_rule__ConstructReplacement__Group_2__1__Impl2247);
            rule__ConstructReplacement__PositionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructReplacementAccess().getPositionAssignment_2_1()); 

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
    // $ANTLR end "rule__ConstructReplacement__Group_2__1__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1130:1: rule__MultiplicityAdjustment__Group__0 : rule__MultiplicityAdjustment__Group__0__Impl rule__MultiplicityAdjustment__Group__1 ;
    public final void rule__MultiplicityAdjustment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1134:1: ( rule__MultiplicityAdjustment__Group__0__Impl rule__MultiplicityAdjustment__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1135:2: rule__MultiplicityAdjustment__Group__0__Impl rule__MultiplicityAdjustment__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__0__Impl_in_rule__MultiplicityAdjustment__Group__02281);
            rule__MultiplicityAdjustment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__1_in_rule__MultiplicityAdjustment__Group__02284);
            rule__MultiplicityAdjustment__Group__1();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__0"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1142:1: rule__MultiplicityAdjustment__Group__0__Impl : ( 'adjust' ) ;
    public final void rule__MultiplicityAdjustment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1146:1: ( ( 'adjust' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1147:1: ( 'adjust' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1147:1: ( 'adjust' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1148:1: 'adjust'
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getAdjustKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__MultiplicityAdjustment__Group__0__Impl2312); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getAdjustKeyword_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__0__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1161:1: rule__MultiplicityAdjustment__Group__1 : rule__MultiplicityAdjustment__Group__1__Impl rule__MultiplicityAdjustment__Group__2 ;
    public final void rule__MultiplicityAdjustment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1165:1: ( rule__MultiplicityAdjustment__Group__1__Impl rule__MultiplicityAdjustment__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1166:2: rule__MultiplicityAdjustment__Group__1__Impl rule__MultiplicityAdjustment__Group__2
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__1__Impl_in_rule__MultiplicityAdjustment__Group__12343);
            rule__MultiplicityAdjustment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__2_in_rule__MultiplicityAdjustment__Group__12346);
            rule__MultiplicityAdjustment__Group__2();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__1"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1173:1: rule__MultiplicityAdjustment__Group__1__Impl : ( 'multiplicity' ) ;
    public final void rule__MultiplicityAdjustment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1177:1: ( ( 'multiplicity' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1178:1: ( 'multiplicity' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1178:1: ( 'multiplicity' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1179:1: 'multiplicity'
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getMultiplicityKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__MultiplicityAdjustment__Group__1__Impl2374); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getMultiplicityKeyword_1()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__1__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1192:1: rule__MultiplicityAdjustment__Group__2 : rule__MultiplicityAdjustment__Group__2__Impl rule__MultiplicityAdjustment__Group__3 ;
    public final void rule__MultiplicityAdjustment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1196:1: ( rule__MultiplicityAdjustment__Group__2__Impl rule__MultiplicityAdjustment__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1197:2: rule__MultiplicityAdjustment__Group__2__Impl rule__MultiplicityAdjustment__Group__3
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__2__Impl_in_rule__MultiplicityAdjustment__Group__22405);
            rule__MultiplicityAdjustment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__3_in_rule__MultiplicityAdjustment__Group__22408);
            rule__MultiplicityAdjustment__Group__3();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__2"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1204:1: rule__MultiplicityAdjustment__Group__2__Impl : ( ( rule__MultiplicityAdjustment__Group_2__0 )? ) ;
    public final void rule__MultiplicityAdjustment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1208:1: ( ( ( rule__MultiplicityAdjustment__Group_2__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1209:1: ( ( rule__MultiplicityAdjustment__Group_2__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1209:1: ( ( rule__MultiplicityAdjustment__Group_2__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1210:1: ( rule__MultiplicityAdjustment__Group_2__0 )?
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getGroup_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1211:1: ( rule__MultiplicityAdjustment__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1211:2: rule__MultiplicityAdjustment__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group_2__0_in_rule__MultiplicityAdjustment__Group__2__Impl2435);
                    rule__MultiplicityAdjustment__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getGroup_2()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__2__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1221:1: rule__MultiplicityAdjustment__Group__3 : rule__MultiplicityAdjustment__Group__3__Impl rule__MultiplicityAdjustment__Group__4 ;
    public final void rule__MultiplicityAdjustment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1225:1: ( rule__MultiplicityAdjustment__Group__3__Impl rule__MultiplicityAdjustment__Group__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1226:2: rule__MultiplicityAdjustment__Group__3__Impl rule__MultiplicityAdjustment__Group__4
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__3__Impl_in_rule__MultiplicityAdjustment__Group__32466);
            rule__MultiplicityAdjustment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__4_in_rule__MultiplicityAdjustment__Group__32469);
            rule__MultiplicityAdjustment__Group__4();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__3"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1233:1: rule__MultiplicityAdjustment__Group__3__Impl : ( 'in' ) ;
    public final void rule__MultiplicityAdjustment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1237:1: ( ( 'in' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1238:1: ( 'in' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1238:1: ( 'in' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1239:1: 'in'
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getInKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__MultiplicityAdjustment__Group__3__Impl2497); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getInKeyword_3()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__3__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1252:1: rule__MultiplicityAdjustment__Group__4 : rule__MultiplicityAdjustment__Group__4__Impl rule__MultiplicityAdjustment__Group__5 ;
    public final void rule__MultiplicityAdjustment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1256:1: ( rule__MultiplicityAdjustment__Group__4__Impl rule__MultiplicityAdjustment__Group__5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1257:2: rule__MultiplicityAdjustment__Group__4__Impl rule__MultiplicityAdjustment__Group__5
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__4__Impl_in_rule__MultiplicityAdjustment__Group__42528);
            rule__MultiplicityAdjustment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__5_in_rule__MultiplicityAdjustment__Group__42531);
            rule__MultiplicityAdjustment__Group__5();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__4"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__4__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1264:1: rule__MultiplicityAdjustment__Group__4__Impl : ( ( rule__MultiplicityAdjustment__TargetAssignment_4 ) ) ;
    public final void rule__MultiplicityAdjustment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1268:1: ( ( ( rule__MultiplicityAdjustment__TargetAssignment_4 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1269:1: ( ( rule__MultiplicityAdjustment__TargetAssignment_4 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1269:1: ( ( rule__MultiplicityAdjustment__TargetAssignment_4 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1270:1: ( rule__MultiplicityAdjustment__TargetAssignment_4 )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getTargetAssignment_4()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1271:1: ( rule__MultiplicityAdjustment__TargetAssignment_4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1271:2: rule__MultiplicityAdjustment__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__TargetAssignment_4_in_rule__MultiplicityAdjustment__Group__4__Impl2558);
            rule__MultiplicityAdjustment__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getTargetAssignment_4()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__4__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__5"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1281:1: rule__MultiplicityAdjustment__Group__5 : rule__MultiplicityAdjustment__Group__5__Impl rule__MultiplicityAdjustment__Group__6 ;
    public final void rule__MultiplicityAdjustment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1285:1: ( rule__MultiplicityAdjustment__Group__5__Impl rule__MultiplicityAdjustment__Group__6 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1286:2: rule__MultiplicityAdjustment__Group__5__Impl rule__MultiplicityAdjustment__Group__6
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__5__Impl_in_rule__MultiplicityAdjustment__Group__52588);
            rule__MultiplicityAdjustment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__6_in_rule__MultiplicityAdjustment__Group__52591);
            rule__MultiplicityAdjustment__Group__6();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__5"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__5__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1293:1: rule__MultiplicityAdjustment__Group__5__Impl : ( 'with' ) ;
    public final void rule__MultiplicityAdjustment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1297:1: ( ( 'with' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1298:1: ( 'with' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1298:1: ( 'with' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1299:1: 'with'
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getWithKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__MultiplicityAdjustment__Group__5__Impl2619); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getWithKeyword_5()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__5__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__6"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1312:1: rule__MultiplicityAdjustment__Group__6 : rule__MultiplicityAdjustment__Group__6__Impl rule__MultiplicityAdjustment__Group__7 ;
    public final void rule__MultiplicityAdjustment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1316:1: ( rule__MultiplicityAdjustment__Group__6__Impl rule__MultiplicityAdjustment__Group__7 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1317:2: rule__MultiplicityAdjustment__Group__6__Impl rule__MultiplicityAdjustment__Group__7
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__6__Impl_in_rule__MultiplicityAdjustment__Group__62650);
            rule__MultiplicityAdjustment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__7_in_rule__MultiplicityAdjustment__Group__62653);
            rule__MultiplicityAdjustment__Group__7();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__6"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__6__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1324:1: rule__MultiplicityAdjustment__Group__6__Impl : ( '{' ) ;
    public final void rule__MultiplicityAdjustment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1328:1: ( ( '{' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1329:1: ( '{' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1329:1: ( '{' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1330:1: '{'
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__MultiplicityAdjustment__Group__6__Impl2681); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__6__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__7"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1343:1: rule__MultiplicityAdjustment__Group__7 : rule__MultiplicityAdjustment__Group__7__Impl rule__MultiplicityAdjustment__Group__8 ;
    public final void rule__MultiplicityAdjustment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1347:1: ( rule__MultiplicityAdjustment__Group__7__Impl rule__MultiplicityAdjustment__Group__8 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1348:2: rule__MultiplicityAdjustment__Group__7__Impl rule__MultiplicityAdjustment__Group__8
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__7__Impl_in_rule__MultiplicityAdjustment__Group__72712);
            rule__MultiplicityAdjustment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__8_in_rule__MultiplicityAdjustment__Group__72715);
            rule__MultiplicityAdjustment__Group__8();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__7"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__7__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1355:1: rule__MultiplicityAdjustment__Group__7__Impl : ( ( rule__MultiplicityAdjustment__MinAssignment_7 ) ) ;
    public final void rule__MultiplicityAdjustment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1359:1: ( ( ( rule__MultiplicityAdjustment__MinAssignment_7 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1360:1: ( ( rule__MultiplicityAdjustment__MinAssignment_7 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1360:1: ( ( rule__MultiplicityAdjustment__MinAssignment_7 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1361:1: ( rule__MultiplicityAdjustment__MinAssignment_7 )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getMinAssignment_7()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1362:1: ( rule__MultiplicityAdjustment__MinAssignment_7 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1362:2: rule__MultiplicityAdjustment__MinAssignment_7
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__MinAssignment_7_in_rule__MultiplicityAdjustment__Group__7__Impl2742);
            rule__MultiplicityAdjustment__MinAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getMinAssignment_7()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__7__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__8"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1372:1: rule__MultiplicityAdjustment__Group__8 : rule__MultiplicityAdjustment__Group__8__Impl rule__MultiplicityAdjustment__Group__9 ;
    public final void rule__MultiplicityAdjustment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1376:1: ( rule__MultiplicityAdjustment__Group__8__Impl rule__MultiplicityAdjustment__Group__9 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1377:2: rule__MultiplicityAdjustment__Group__8__Impl rule__MultiplicityAdjustment__Group__9
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__8__Impl_in_rule__MultiplicityAdjustment__Group__82772);
            rule__MultiplicityAdjustment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__9_in_rule__MultiplicityAdjustment__Group__82775);
            rule__MultiplicityAdjustment__Group__9();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__8"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__8__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1384:1: rule__MultiplicityAdjustment__Group__8__Impl : ( ( rule__MultiplicityAdjustment__Group_8__0 )? ) ;
    public final void rule__MultiplicityAdjustment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1388:1: ( ( ( rule__MultiplicityAdjustment__Group_8__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1389:1: ( ( rule__MultiplicityAdjustment__Group_8__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1389:1: ( ( rule__MultiplicityAdjustment__Group_8__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1390:1: ( rule__MultiplicityAdjustment__Group_8__0 )?
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getGroup_8()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1391:1: ( rule__MultiplicityAdjustment__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1391:2: rule__MultiplicityAdjustment__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group_8__0_in_rule__MultiplicityAdjustment__Group__8__Impl2802);
                    rule__MultiplicityAdjustment__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getGroup_8()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__8__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__9"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1401:1: rule__MultiplicityAdjustment__Group__9 : rule__MultiplicityAdjustment__Group__9__Impl ;
    public final void rule__MultiplicityAdjustment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1405:1: ( rule__MultiplicityAdjustment__Group__9__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1406:2: rule__MultiplicityAdjustment__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group__9__Impl_in_rule__MultiplicityAdjustment__Group__92833);
            rule__MultiplicityAdjustment__Group__9__Impl();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__9"


    // $ANTLR start "rule__MultiplicityAdjustment__Group__9__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1412:1: rule__MultiplicityAdjustment__Group__9__Impl : ( '}' ) ;
    public final void rule__MultiplicityAdjustment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1416:1: ( ( '}' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1417:1: ( '}' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1417:1: ( '}' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1418:1: '}'
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_15_in_rule__MultiplicityAdjustment__Group__9__Impl2861); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group__9__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group_2__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1451:1: rule__MultiplicityAdjustment__Group_2__0 : rule__MultiplicityAdjustment__Group_2__0__Impl rule__MultiplicityAdjustment__Group_2__1 ;
    public final void rule__MultiplicityAdjustment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1455:1: ( rule__MultiplicityAdjustment__Group_2__0__Impl rule__MultiplicityAdjustment__Group_2__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1456:2: rule__MultiplicityAdjustment__Group_2__0__Impl rule__MultiplicityAdjustment__Group_2__1
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group_2__0__Impl_in_rule__MultiplicityAdjustment__Group_2__02912);
            rule__MultiplicityAdjustment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group_2__1_in_rule__MultiplicityAdjustment__Group_2__02915);
            rule__MultiplicityAdjustment__Group_2__1();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group_2__0"


    // $ANTLR start "rule__MultiplicityAdjustment__Group_2__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1463:1: rule__MultiplicityAdjustment__Group_2__0__Impl : ( ( rule__MultiplicityAdjustment__PositionedAssignment_2_0 ) ) ;
    public final void rule__MultiplicityAdjustment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1467:1: ( ( ( rule__MultiplicityAdjustment__PositionedAssignment_2_0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1468:1: ( ( rule__MultiplicityAdjustment__PositionedAssignment_2_0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1468:1: ( ( rule__MultiplicityAdjustment__PositionedAssignment_2_0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1469:1: ( rule__MultiplicityAdjustment__PositionedAssignment_2_0 )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getPositionedAssignment_2_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1470:1: ( rule__MultiplicityAdjustment__PositionedAssignment_2_0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1470:2: rule__MultiplicityAdjustment__PositionedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__PositionedAssignment_2_0_in_rule__MultiplicityAdjustment__Group_2__0__Impl2942);
            rule__MultiplicityAdjustment__PositionedAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getPositionedAssignment_2_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group_2__0__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group_2__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1480:1: rule__MultiplicityAdjustment__Group_2__1 : rule__MultiplicityAdjustment__Group_2__1__Impl ;
    public final void rule__MultiplicityAdjustment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1484:1: ( rule__MultiplicityAdjustment__Group_2__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1485:2: rule__MultiplicityAdjustment__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group_2__1__Impl_in_rule__MultiplicityAdjustment__Group_2__12972);
            rule__MultiplicityAdjustment__Group_2__1__Impl();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group_2__1"


    // $ANTLR start "rule__MultiplicityAdjustment__Group_2__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1491:1: rule__MultiplicityAdjustment__Group_2__1__Impl : ( ( rule__MultiplicityAdjustment__PositionAssignment_2_1 ) ) ;
    public final void rule__MultiplicityAdjustment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1495:1: ( ( ( rule__MultiplicityAdjustment__PositionAssignment_2_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1496:1: ( ( rule__MultiplicityAdjustment__PositionAssignment_2_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1496:1: ( ( rule__MultiplicityAdjustment__PositionAssignment_2_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1497:1: ( rule__MultiplicityAdjustment__PositionAssignment_2_1 )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getPositionAssignment_2_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1498:1: ( rule__MultiplicityAdjustment__PositionAssignment_2_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1498:2: rule__MultiplicityAdjustment__PositionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__PositionAssignment_2_1_in_rule__MultiplicityAdjustment__Group_2__1__Impl2999);
            rule__MultiplicityAdjustment__PositionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getPositionAssignment_2_1()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group_2__1__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group_8__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1512:1: rule__MultiplicityAdjustment__Group_8__0 : rule__MultiplicityAdjustment__Group_8__0__Impl rule__MultiplicityAdjustment__Group_8__1 ;
    public final void rule__MultiplicityAdjustment__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1516:1: ( rule__MultiplicityAdjustment__Group_8__0__Impl rule__MultiplicityAdjustment__Group_8__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1517:2: rule__MultiplicityAdjustment__Group_8__0__Impl rule__MultiplicityAdjustment__Group_8__1
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group_8__0__Impl_in_rule__MultiplicityAdjustment__Group_8__03033);
            rule__MultiplicityAdjustment__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group_8__1_in_rule__MultiplicityAdjustment__Group_8__03036);
            rule__MultiplicityAdjustment__Group_8__1();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group_8__0"


    // $ANTLR start "rule__MultiplicityAdjustment__Group_8__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1524:1: rule__MultiplicityAdjustment__Group_8__0__Impl : ( ( rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0 ) ) ;
    public final void rule__MultiplicityAdjustment__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1528:1: ( ( ( rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1529:1: ( ( rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1529:1: ( ( rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1530:1: ( rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0 )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getUpperBoundedAssignment_8_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1531:1: ( rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1531:2: rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0_in_rule__MultiplicityAdjustment__Group_8__0__Impl3063);
            rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getUpperBoundedAssignment_8_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group_8__0__Impl"


    // $ANTLR start "rule__MultiplicityAdjustment__Group_8__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1541:1: rule__MultiplicityAdjustment__Group_8__1 : rule__MultiplicityAdjustment__Group_8__1__Impl ;
    public final void rule__MultiplicityAdjustment__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1545:1: ( rule__MultiplicityAdjustment__Group_8__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1546:2: rule__MultiplicityAdjustment__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__Group_8__1__Impl_in_rule__MultiplicityAdjustment__Group_8__13093);
            rule__MultiplicityAdjustment__Group_8__1__Impl();

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group_8__1"


    // $ANTLR start "rule__MultiplicityAdjustment__Group_8__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1552:1: rule__MultiplicityAdjustment__Group_8__1__Impl : ( ( rule__MultiplicityAdjustment__MaxAssignment_8_1 ) ) ;
    public final void rule__MultiplicityAdjustment__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1556:1: ( ( ( rule__MultiplicityAdjustment__MaxAssignment_8_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1557:1: ( ( rule__MultiplicityAdjustment__MaxAssignment_8_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1557:1: ( ( rule__MultiplicityAdjustment__MaxAssignment_8_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1558:1: ( rule__MultiplicityAdjustment__MaxAssignment_8_1 )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getMaxAssignment_8_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1559:1: ( rule__MultiplicityAdjustment__MaxAssignment_8_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1559:2: rule__MultiplicityAdjustment__MaxAssignment_8_1
            {
            pushFollow(FOLLOW_rule__MultiplicityAdjustment__MaxAssignment_8_1_in_rule__MultiplicityAdjustment__Group_8__1__Impl3120);
            rule__MultiplicityAdjustment__MaxAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getMaxAssignment_8_1()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__Group_8__1__Impl"


    // $ANTLR start "rule__RuleReplacement__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1573:1: rule__RuleReplacement__Group__0 : rule__RuleReplacement__Group__0__Impl rule__RuleReplacement__Group__1 ;
    public final void rule__RuleReplacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1577:1: ( rule__RuleReplacement__Group__0__Impl rule__RuleReplacement__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1578:2: rule__RuleReplacement__Group__0__Impl rule__RuleReplacement__Group__1
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__0__Impl_in_rule__RuleReplacement__Group__03154);
            rule__RuleReplacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleReplacement__Group__1_in_rule__RuleReplacement__Group__03157);
            rule__RuleReplacement__Group__1();

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
    // $ANTLR end "rule__RuleReplacement__Group__0"


    // $ANTLR start "rule__RuleReplacement__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1585:1: rule__RuleReplacement__Group__0__Impl : ( 'replace' ) ;
    public final void rule__RuleReplacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1589:1: ( ( 'replace' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1590:1: ( 'replace' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1590:1: ( 'replace' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1591:1: 'replace'
            {
             before(grammarAccess.getRuleReplacementAccess().getReplaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__RuleReplacement__Group__0__Impl3185); 
             after(grammarAccess.getRuleReplacementAccess().getReplaceKeyword_0()); 

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
    // $ANTLR end "rule__RuleReplacement__Group__0__Impl"


    // $ANTLR start "rule__RuleReplacement__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1604:1: rule__RuleReplacement__Group__1 : rule__RuleReplacement__Group__1__Impl rule__RuleReplacement__Group__2 ;
    public final void rule__RuleReplacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1608:1: ( rule__RuleReplacement__Group__1__Impl rule__RuleReplacement__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1609:2: rule__RuleReplacement__Group__1__Impl rule__RuleReplacement__Group__2
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__1__Impl_in_rule__RuleReplacement__Group__13216);
            rule__RuleReplacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleReplacement__Group__2_in_rule__RuleReplacement__Group__13219);
            rule__RuleReplacement__Group__2();

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
    // $ANTLR end "rule__RuleReplacement__Group__1"


    // $ANTLR start "rule__RuleReplacement__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1616:1: rule__RuleReplacement__Group__1__Impl : ( ( rule__RuleReplacement__TargetAssignment_1 ) ) ;
    public final void rule__RuleReplacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1620:1: ( ( ( rule__RuleReplacement__TargetAssignment_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1621:1: ( ( rule__RuleReplacement__TargetAssignment_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1621:1: ( ( rule__RuleReplacement__TargetAssignment_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1622:1: ( rule__RuleReplacement__TargetAssignment_1 )
            {
             before(grammarAccess.getRuleReplacementAccess().getTargetAssignment_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1623:1: ( rule__RuleReplacement__TargetAssignment_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1623:2: rule__RuleReplacement__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__RuleReplacement__TargetAssignment_1_in_rule__RuleReplacement__Group__1__Impl3246);
            rule__RuleReplacement__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleReplacementAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__RuleReplacement__Group__1__Impl"


    // $ANTLR start "rule__RuleReplacement__Group__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1633:1: rule__RuleReplacement__Group__2 : rule__RuleReplacement__Group__2__Impl rule__RuleReplacement__Group__3 ;
    public final void rule__RuleReplacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1637:1: ( rule__RuleReplacement__Group__2__Impl rule__RuleReplacement__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1638:2: rule__RuleReplacement__Group__2__Impl rule__RuleReplacement__Group__3
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__2__Impl_in_rule__RuleReplacement__Group__23276);
            rule__RuleReplacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleReplacement__Group__3_in_rule__RuleReplacement__Group__23279);
            rule__RuleReplacement__Group__3();

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
    // $ANTLR end "rule__RuleReplacement__Group__2"


    // $ANTLR start "rule__RuleReplacement__Group__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1645:1: rule__RuleReplacement__Group__2__Impl : ( 'with' ) ;
    public final void rule__RuleReplacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1649:1: ( ( 'with' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1650:1: ( 'with' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1650:1: ( 'with' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1651:1: 'with'
            {
             before(grammarAccess.getRuleReplacementAccess().getWithKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__RuleReplacement__Group__2__Impl3307); 
             after(grammarAccess.getRuleReplacementAccess().getWithKeyword_2()); 

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
    // $ANTLR end "rule__RuleReplacement__Group__2__Impl"


    // $ANTLR start "rule__RuleReplacement__Group__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1664:1: rule__RuleReplacement__Group__3 : rule__RuleReplacement__Group__3__Impl ;
    public final void rule__RuleReplacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1668:1: ( rule__RuleReplacement__Group__3__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1669:2: rule__RuleReplacement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__3__Impl_in_rule__RuleReplacement__Group__33338);
            rule__RuleReplacement__Group__3__Impl();

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
    // $ANTLR end "rule__RuleReplacement__Group__3"


    // $ANTLR start "rule__RuleReplacement__Group__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1675:1: rule__RuleReplacement__Group__3__Impl : ( ( rule__RuleReplacement__ReplacementAssignment_3 ) ) ;
    public final void rule__RuleReplacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1679:1: ( ( ( rule__RuleReplacement__ReplacementAssignment_3 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1680:1: ( ( rule__RuleReplacement__ReplacementAssignment_3 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1680:1: ( ( rule__RuleReplacement__ReplacementAssignment_3 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1681:1: ( rule__RuleReplacement__ReplacementAssignment_3 )
            {
             before(grammarAccess.getRuleReplacementAccess().getReplacementAssignment_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1682:1: ( rule__RuleReplacement__ReplacementAssignment_3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1682:2: rule__RuleReplacement__ReplacementAssignment_3
            {
            pushFollow(FOLLOW_rule__RuleReplacement__ReplacementAssignment_3_in_rule__RuleReplacement__Group__3__Impl3365);
            rule__RuleReplacement__ReplacementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleReplacementAccess().getReplacementAssignment_3()); 

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
    // $ANTLR end "rule__RuleReplacement__Group__3__Impl"


    // $ANTLR start "rule__QID__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1700:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1704:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1705:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__03403);
            rule__QID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QID__Group__1_in_rule__QID__Group__03406);
            rule__QID__Group__1();

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
    // $ANTLR end "rule__QID__Group__0"


    // $ANTLR start "rule__QID__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1712:1: rule__QID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1716:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1717:1: ( RULE_ID )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1717:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1718:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl3433); 
             after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QID__Group__0__Impl"


    // $ANTLR start "rule__QID__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1729:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1733:1: ( rule__QID__Group__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1734:2: rule__QID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__13462);
            rule__QID__Group__1__Impl();

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
    // $ANTLR end "rule__QID__Group__1"


    // $ANTLR start "rule__QID__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1740:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1744:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1745:1: ( ( rule__QID__Group_1__0 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1745:1: ( ( rule__QID__Group_1__0 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1746:1: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1747:1: ( rule__QID__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1747:2: rule__QID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl3489);
            	    rule__QID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQIDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QID__Group__1__Impl"


    // $ANTLR start "rule__QID__Group_1__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1761:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1765:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1766:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__03524);
            rule__QID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__03527);
            rule__QID__Group_1__1();

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
    // $ANTLR end "rule__QID__Group_1__0"


    // $ANTLR start "rule__QID__Group_1__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1773:1: rule__QID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1777:1: ( ( '.' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1778:1: ( '.' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1778:1: ( '.' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1779:1: '.'
            {
             before(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__QID__Group_1__0__Impl3555); 
             after(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QID__Group_1__0__Impl"


    // $ANTLR start "rule__QID__Group_1__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1792:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1796:1: ( rule__QID__Group_1__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1797:2: rule__QID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__13586);
            rule__QID__Group_1__1__Impl();

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
    // $ANTLR end "rule__QID__Group_1__1"


    // $ANTLR start "rule__QID__Group_1__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1803:1: rule__QID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1807:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1808:1: ( RULE_ID )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1808:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1809:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl3613); 
             after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QID__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1825:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1829:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1830:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03647);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03650);
            rule__Definition__Group__1();

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
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1837:1: rule__Definition__Group__0__Impl : ( () ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1841:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1842:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1842:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1843:1: ()
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAction_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1844:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1846:1: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1856:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1860:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1861:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13708);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13711);
            rule__Definition__Group__2();

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
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1868:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__LexicalAssignment_1 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1872:1: ( ( ( rule__Definition__LexicalAssignment_1 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1873:1: ( ( rule__Definition__LexicalAssignment_1 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1873:1: ( ( rule__Definition__LexicalAssignment_1 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1874:1: ( rule__Definition__LexicalAssignment_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getLexicalAssignment_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1875:1: ( rule__Definition__LexicalAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1875:2: rule__Definition__LexicalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Definition__LexicalAssignment_1_in_rule__Definition__Group__1__Impl3738);
                    rule__Definition__LexicalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getLexicalAssignment_1()); 

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
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1885:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1889:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1890:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23769);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__23772);
            rule__Definition__Group__3();

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
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1897:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__NameAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1901:1: ( ( ( rule__Definition__NameAssignment_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1902:1: ( ( rule__Definition__NameAssignment_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1902:1: ( ( rule__Definition__NameAssignment_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1903:1: ( rule__Definition__NameAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1904:1: ( rule__Definition__NameAssignment_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1904:2: rule__Definition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_2_in_rule__Definition__Group__2__Impl3799);
            rule__Definition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1914:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1918:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1919:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__33829);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__33832);
            rule__Definition__Group__4();

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
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1926:1: rule__Definition__Group__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1930:1: ( ( ':' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1931:1: ( ':' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1931:1: ( ':' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1932:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Definition__Group__3__Impl3860); 
             after(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1945:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1949:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1950:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__43891);
            rule__Definition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__43894);
            rule__Definition__Group__5();

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
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1957:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__RhsAssignment_4 ) ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1961:1: ( ( ( rule__Definition__RhsAssignment_4 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1962:1: ( ( rule__Definition__RhsAssignment_4 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1962:1: ( ( rule__Definition__RhsAssignment_4 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1963:1: ( rule__Definition__RhsAssignment_4 )
            {
             before(grammarAccess.getDefinitionAccess().getRhsAssignment_4()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1964:1: ( rule__Definition__RhsAssignment_4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1964:2: rule__Definition__RhsAssignment_4
            {
            pushFollow(FOLLOW_rule__Definition__RhsAssignment_4_in_rule__Definition__Group__4__Impl3921);
            rule__Definition__RhsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getRhsAssignment_4()); 

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
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Definition__Group__5"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1974:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1978:1: ( rule__Definition__Group__5__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1979:2: rule__Definition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__53951);
            rule__Definition__Group__5__Impl();

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
    // $ANTLR end "rule__Definition__Group__5"


    // $ANTLR start "rule__Definition__Group__5__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1985:1: rule__Definition__Group__5__Impl : ( ';' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1989:1: ( ( ';' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1990:1: ( ';' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1990:1: ( ';' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1991:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Definition__Group__5__Impl3979); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Definition__Group__5__Impl"


    // $ANTLR start "rule__Construct0__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2016:1: rule__Construct0__Group__0 : rule__Construct0__Group__0__Impl rule__Construct0__Group__1 ;
    public final void rule__Construct0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2020:1: ( rule__Construct0__Group__0__Impl rule__Construct0__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2021:2: rule__Construct0__Group__0__Impl rule__Construct0__Group__1
            {
            pushFollow(FOLLOW_rule__Construct0__Group__0__Impl_in_rule__Construct0__Group__04022);
            rule__Construct0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group__1_in_rule__Construct0__Group__04025);
            rule__Construct0__Group__1();

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
    // $ANTLR end "rule__Construct0__Group__0"


    // $ANTLR start "rule__Construct0__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2028:1: rule__Construct0__Group__0__Impl : ( ruleConstruct1 ) ;
    public final void rule__Construct0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2032:1: ( ( ruleConstruct1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2033:1: ( ruleConstruct1 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2033:1: ( ruleConstruct1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2034:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstruct1_in_rule__Construct0__Group__0__Impl4052);
            ruleConstruct1();

            state._fsp--;

             after(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 

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
    // $ANTLR end "rule__Construct0__Group__0__Impl"


    // $ANTLR start "rule__Construct0__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2045:1: rule__Construct0__Group__1 : rule__Construct0__Group__1__Impl ;
    public final void rule__Construct0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2049:1: ( rule__Construct0__Group__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2050:2: rule__Construct0__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct0__Group__1__Impl_in_rule__Construct0__Group__14081);
            rule__Construct0__Group__1__Impl();

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
    // $ANTLR end "rule__Construct0__Group__1"


    // $ANTLR start "rule__Construct0__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2056:1: rule__Construct0__Group__1__Impl : ( ( rule__Construct0__Group_1__0 )? ) ;
    public final void rule__Construct0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2060:1: ( ( ( rule__Construct0__Group_1__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2061:1: ( ( rule__Construct0__Group_1__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2061:1: ( ( rule__Construct0__Group_1__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2062:1: ( rule__Construct0__Group_1__0 )?
            {
             before(grammarAccess.getConstruct0Access().getGroup_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2063:1: ( rule__Construct0__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2063:2: rule__Construct0__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Construct0__Group_1__0_in_rule__Construct0__Group__1__Impl4108);
                    rule__Construct0__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstruct0Access().getGroup_1()); 

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
    // $ANTLR end "rule__Construct0__Group__1__Impl"


    // $ANTLR start "rule__Construct0__Group_1__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2077:1: rule__Construct0__Group_1__0 : rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1 ;
    public final void rule__Construct0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2081:1: ( rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2082:2: rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1__0__Impl_in_rule__Construct0__Group_1__04143);
            rule__Construct0__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group_1__1_in_rule__Construct0__Group_1__04146);
            rule__Construct0__Group_1__1();

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
    // $ANTLR end "rule__Construct0__Group_1__0"


    // $ANTLR start "rule__Construct0__Group_1__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2089:1: rule__Construct0__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2093:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2094:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2094:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2095:1: ()
            {
             before(grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2096:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2098:1: 
            {
            }

             after(grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct0__Group_1__0__Impl"


    // $ANTLR start "rule__Construct0__Group_1__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2108:1: rule__Construct0__Group_1__1 : rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2 ;
    public final void rule__Construct0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2112:1: ( rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2113:2: rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1__1__Impl_in_rule__Construct0__Group_1__14204);
            rule__Construct0__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group_1__2_in_rule__Construct0__Group_1__14207);
            rule__Construct0__Group_1__2();

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
    // $ANTLR end "rule__Construct0__Group_1__1"


    // $ANTLR start "rule__Construct0__Group_1__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2120:1: rule__Construct0__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Construct0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2124:1: ( ( '|' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2125:1: ( '|' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2125:1: ( '|' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2126:1: '|'
            {
             before(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1()); 
            match(input,24,FOLLOW_24_in_rule__Construct0__Group_1__1__Impl4235); 
             after(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1()); 

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
    // $ANTLR end "rule__Construct0__Group_1__1__Impl"


    // $ANTLR start "rule__Construct0__Group_1__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2139:1: rule__Construct0__Group_1__2 : rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3 ;
    public final void rule__Construct0__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2143:1: ( rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2144:2: rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1__2__Impl_in_rule__Construct0__Group_1__24266);
            rule__Construct0__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group_1__3_in_rule__Construct0__Group_1__24269);
            rule__Construct0__Group_1__3();

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
    // $ANTLR end "rule__Construct0__Group_1__2"


    // $ANTLR start "rule__Construct0__Group_1__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2151:1: rule__Construct0__Group_1__2__Impl : ( ( rule__Construct0__OperandsAssignment_1_2 ) ) ;
    public final void rule__Construct0__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2155:1: ( ( ( rule__Construct0__OperandsAssignment_1_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2156:1: ( ( rule__Construct0__OperandsAssignment_1_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2156:1: ( ( rule__Construct0__OperandsAssignment_1_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2157:1: ( rule__Construct0__OperandsAssignment_1_2 )
            {
             before(grammarAccess.getConstruct0Access().getOperandsAssignment_1_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2158:1: ( rule__Construct0__OperandsAssignment_1_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2158:2: rule__Construct0__OperandsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Construct0__OperandsAssignment_1_2_in_rule__Construct0__Group_1__2__Impl4296);
            rule__Construct0__OperandsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConstruct0Access().getOperandsAssignment_1_2()); 

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
    // $ANTLR end "rule__Construct0__Group_1__2__Impl"


    // $ANTLR start "rule__Construct0__Group_1__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2168:1: rule__Construct0__Group_1__3 : rule__Construct0__Group_1__3__Impl ;
    public final void rule__Construct0__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2172:1: ( rule__Construct0__Group_1__3__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2173:2: rule__Construct0__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1__3__Impl_in_rule__Construct0__Group_1__34326);
            rule__Construct0__Group_1__3__Impl();

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
    // $ANTLR end "rule__Construct0__Group_1__3"


    // $ANTLR start "rule__Construct0__Group_1__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2179:1: rule__Construct0__Group_1__3__Impl : ( ( rule__Construct0__Group_1_3__0 )* ) ;
    public final void rule__Construct0__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2183:1: ( ( ( rule__Construct0__Group_1_3__0 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2184:1: ( ( rule__Construct0__Group_1_3__0 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2184:1: ( ( rule__Construct0__Group_1_3__0 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2185:1: ( rule__Construct0__Group_1_3__0 )*
            {
             before(grammarAccess.getConstruct0Access().getGroup_1_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2186:1: ( rule__Construct0__Group_1_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2186:2: rule__Construct0__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Construct0__Group_1_3__0_in_rule__Construct0__Group_1__3__Impl4353);
            	    rule__Construct0__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getConstruct0Access().getGroup_1_3()); 

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
    // $ANTLR end "rule__Construct0__Group_1__3__Impl"


    // $ANTLR start "rule__Construct0__Group_1_3__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2204:1: rule__Construct0__Group_1_3__0 : rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1 ;
    public final void rule__Construct0__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2208:1: ( rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2209:2: rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1_3__0__Impl_in_rule__Construct0__Group_1_3__04392);
            rule__Construct0__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group_1_3__1_in_rule__Construct0__Group_1_3__04395);
            rule__Construct0__Group_1_3__1();

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
    // $ANTLR end "rule__Construct0__Group_1_3__0"


    // $ANTLR start "rule__Construct0__Group_1_3__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2216:1: rule__Construct0__Group_1_3__0__Impl : ( '|' ) ;
    public final void rule__Construct0__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2220:1: ( ( '|' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2221:1: ( '|' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2221:1: ( '|' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2222:1: '|'
            {
             before(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0()); 
            match(input,24,FOLLOW_24_in_rule__Construct0__Group_1_3__0__Impl4423); 
             after(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Construct0__Group_1_3__0__Impl"


    // $ANTLR start "rule__Construct0__Group_1_3__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2235:1: rule__Construct0__Group_1_3__1 : rule__Construct0__Group_1_3__1__Impl ;
    public final void rule__Construct0__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2239:1: ( rule__Construct0__Group_1_3__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2240:2: rule__Construct0__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1_3__1__Impl_in_rule__Construct0__Group_1_3__14454);
            rule__Construct0__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Construct0__Group_1_3__1"


    // $ANTLR start "rule__Construct0__Group_1_3__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2246:1: rule__Construct0__Group_1_3__1__Impl : ( ( rule__Construct0__OperandsAssignment_1_3_1 ) ) ;
    public final void rule__Construct0__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2250:1: ( ( ( rule__Construct0__OperandsAssignment_1_3_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2251:1: ( ( rule__Construct0__OperandsAssignment_1_3_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2251:1: ( ( rule__Construct0__OperandsAssignment_1_3_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2252:1: ( rule__Construct0__OperandsAssignment_1_3_1 )
            {
             before(grammarAccess.getConstruct0Access().getOperandsAssignment_1_3_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2253:1: ( rule__Construct0__OperandsAssignment_1_3_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2253:2: rule__Construct0__OperandsAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Construct0__OperandsAssignment_1_3_1_in_rule__Construct0__Group_1_3__1__Impl4481);
            rule__Construct0__OperandsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct0Access().getOperandsAssignment_1_3_1()); 

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
    // $ANTLR end "rule__Construct0__Group_1_3__1__Impl"


    // $ANTLR start "rule__Construct1__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2267:1: rule__Construct1__Group__0 : rule__Construct1__Group__0__Impl rule__Construct1__Group__1 ;
    public final void rule__Construct1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2271:1: ( rule__Construct1__Group__0__Impl rule__Construct1__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2272:2: rule__Construct1__Group__0__Impl rule__Construct1__Group__1
            {
            pushFollow(FOLLOW_rule__Construct1__Group__0__Impl_in_rule__Construct1__Group__04515);
            rule__Construct1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct1__Group__1_in_rule__Construct1__Group__04518);
            rule__Construct1__Group__1();

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
    // $ANTLR end "rule__Construct1__Group__0"


    // $ANTLR start "rule__Construct1__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2279:1: rule__Construct1__Group__0__Impl : ( ruleConstruct2 ) ;
    public final void rule__Construct1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2283:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2284:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2284:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2285:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct1__Group__0__Impl4545);
            ruleConstruct2();

            state._fsp--;

             after(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 

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
    // $ANTLR end "rule__Construct1__Group__0__Impl"


    // $ANTLR start "rule__Construct1__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2296:1: rule__Construct1__Group__1 : rule__Construct1__Group__1__Impl ;
    public final void rule__Construct1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2300:1: ( rule__Construct1__Group__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2301:2: rule__Construct1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct1__Group__1__Impl_in_rule__Construct1__Group__14574);
            rule__Construct1__Group__1__Impl();

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
    // $ANTLR end "rule__Construct1__Group__1"


    // $ANTLR start "rule__Construct1__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2307:1: rule__Construct1__Group__1__Impl : ( ( rule__Construct1__Group_1__0 )? ) ;
    public final void rule__Construct1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2311:1: ( ( ( rule__Construct1__Group_1__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2312:1: ( ( rule__Construct1__Group_1__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2312:1: ( ( rule__Construct1__Group_1__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2313:1: ( rule__Construct1__Group_1__0 )?
            {
             before(grammarAccess.getConstruct1Access().getGroup_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2314:1: ( rule__Construct1__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=RULE_CHAR && LA14_0<=RULE_STRING)||LA14_0==11||LA14_0==21||(LA14_0>=25 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2314:2: rule__Construct1__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Construct1__Group_1__0_in_rule__Construct1__Group__1__Impl4601);
                    rule__Construct1__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstruct1Access().getGroup_1()); 

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
    // $ANTLR end "rule__Construct1__Group__1__Impl"


    // $ANTLR start "rule__Construct1__Group_1__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2328:1: rule__Construct1__Group_1__0 : rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1 ;
    public final void rule__Construct1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2332:1: ( rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2333:2: rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct1__Group_1__0__Impl_in_rule__Construct1__Group_1__04636);
            rule__Construct1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct1__Group_1__1_in_rule__Construct1__Group_1__04639);
            rule__Construct1__Group_1__1();

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
    // $ANTLR end "rule__Construct1__Group_1__0"


    // $ANTLR start "rule__Construct1__Group_1__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2340:1: rule__Construct1__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2344:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2345:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2345:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2346:1: ()
            {
             before(grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2347:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2349:1: 
            {
            }

             after(grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct1__Group_1__0__Impl"


    // $ANTLR start "rule__Construct1__Group_1__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2359:1: rule__Construct1__Group_1__1 : rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2 ;
    public final void rule__Construct1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2363:1: ( rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2364:2: rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2
            {
            pushFollow(FOLLOW_rule__Construct1__Group_1__1__Impl_in_rule__Construct1__Group_1__14697);
            rule__Construct1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct1__Group_1__2_in_rule__Construct1__Group_1__14700);
            rule__Construct1__Group_1__2();

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
    // $ANTLR end "rule__Construct1__Group_1__1"


    // $ANTLR start "rule__Construct1__Group_1__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2371:1: rule__Construct1__Group_1__1__Impl : ( ( rule__Construct1__OperandsAssignment_1_1 ) ) ;
    public final void rule__Construct1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2375:1: ( ( ( rule__Construct1__OperandsAssignment_1_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2376:1: ( ( rule__Construct1__OperandsAssignment_1_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2376:1: ( ( rule__Construct1__OperandsAssignment_1_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2377:1: ( rule__Construct1__OperandsAssignment_1_1 )
            {
             before(grammarAccess.getConstruct1Access().getOperandsAssignment_1_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2378:1: ( rule__Construct1__OperandsAssignment_1_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2378:2: rule__Construct1__OperandsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Construct1__OperandsAssignment_1_1_in_rule__Construct1__Group_1__1__Impl4727);
            rule__Construct1__OperandsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct1Access().getOperandsAssignment_1_1()); 

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
    // $ANTLR end "rule__Construct1__Group_1__1__Impl"


    // $ANTLR start "rule__Construct1__Group_1__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2388:1: rule__Construct1__Group_1__2 : rule__Construct1__Group_1__2__Impl ;
    public final void rule__Construct1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2392:1: ( rule__Construct1__Group_1__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2393:2: rule__Construct1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Construct1__Group_1__2__Impl_in_rule__Construct1__Group_1__24757);
            rule__Construct1__Group_1__2__Impl();

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
    // $ANTLR end "rule__Construct1__Group_1__2"


    // $ANTLR start "rule__Construct1__Group_1__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2399:1: rule__Construct1__Group_1__2__Impl : ( ( rule__Construct1__OperandsAssignment_1_2 )* ) ;
    public final void rule__Construct1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2403:1: ( ( ( rule__Construct1__OperandsAssignment_1_2 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2404:1: ( ( rule__Construct1__OperandsAssignment_1_2 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2404:1: ( ( rule__Construct1__OperandsAssignment_1_2 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2405:1: ( rule__Construct1__OperandsAssignment_1_2 )*
            {
             before(grammarAccess.getConstruct1Access().getOperandsAssignment_1_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2406:1: ( rule__Construct1__OperandsAssignment_1_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=RULE_CHAR && LA15_0<=RULE_STRING)||LA15_0==11||LA15_0==21||(LA15_0>=25 && LA15_0<=26)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2406:2: rule__Construct1__OperandsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Construct1__OperandsAssignment_1_2_in_rule__Construct1__Group_1__2__Impl4784);
            	    rule__Construct1__OperandsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConstruct1Access().getOperandsAssignment_1_2()); 

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
    // $ANTLR end "rule__Construct1__Group_1__2__Impl"


    // $ANTLR start "rule__Construct2__Group_0__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2422:1: rule__Construct2__Group_0__0 : rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1 ;
    public final void rule__Construct2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2426:1: ( rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2427:2: rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1
            {
            pushFollow(FOLLOW_rule__Construct2__Group_0__0__Impl_in_rule__Construct2__Group_0__04821);
            rule__Construct2__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct2__Group_0__1_in_rule__Construct2__Group_0__04824);
            rule__Construct2__Group_0__1();

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
    // $ANTLR end "rule__Construct2__Group_0__0"


    // $ANTLR start "rule__Construct2__Group_0__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2434:1: rule__Construct2__Group_0__0__Impl : ( () ) ;
    public final void rule__Construct2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2438:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2439:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2439:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2440:1: ()
            {
             before(grammarAccess.getConstruct2Access().getNotAction_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2441:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2443:1: 
            {
            }

             after(grammarAccess.getConstruct2Access().getNotAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct2__Group_0__0__Impl"


    // $ANTLR start "rule__Construct2__Group_0__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2453:1: rule__Construct2__Group_0__1 : rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2 ;
    public final void rule__Construct2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2457:1: ( rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2458:2: rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2
            {
            pushFollow(FOLLOW_rule__Construct2__Group_0__1__Impl_in_rule__Construct2__Group_0__14882);
            rule__Construct2__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct2__Group_0__2_in_rule__Construct2__Group_0__14885);
            rule__Construct2__Group_0__2();

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
    // $ANTLR end "rule__Construct2__Group_0__1"


    // $ANTLR start "rule__Construct2__Group_0__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2465:1: rule__Construct2__Group_0__1__Impl : ( '!' ) ;
    public final void rule__Construct2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2469:1: ( ( '!' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2470:1: ( '!' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2470:1: ( '!' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2471:1: '!'
            {
             before(grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__Construct2__Group_0__1__Impl4913); 
             after(grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1()); 

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
    // $ANTLR end "rule__Construct2__Group_0__1__Impl"


    // $ANTLR start "rule__Construct2__Group_0__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2484:1: rule__Construct2__Group_0__2 : rule__Construct2__Group_0__2__Impl ;
    public final void rule__Construct2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2488:1: ( rule__Construct2__Group_0__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2489:2: rule__Construct2__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Construct2__Group_0__2__Impl_in_rule__Construct2__Group_0__24944);
            rule__Construct2__Group_0__2__Impl();

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
    // $ANTLR end "rule__Construct2__Group_0__2"


    // $ANTLR start "rule__Construct2__Group_0__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2495:1: rule__Construct2__Group_0__2__Impl : ( ( rule__Construct2__OperandAssignment_0_2 ) ) ;
    public final void rule__Construct2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2499:1: ( ( ( rule__Construct2__OperandAssignment_0_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2500:1: ( ( rule__Construct2__OperandAssignment_0_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2500:1: ( ( rule__Construct2__OperandAssignment_0_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2501:1: ( rule__Construct2__OperandAssignment_0_2 )
            {
             before(grammarAccess.getConstruct2Access().getOperandAssignment_0_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2502:1: ( rule__Construct2__OperandAssignment_0_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2502:2: rule__Construct2__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Construct2__OperandAssignment_0_2_in_rule__Construct2__Group_0__2__Impl4971);
            rule__Construct2__OperandAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getConstruct2Access().getOperandAssignment_0_2()); 

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
    // $ANTLR end "rule__Construct2__Group_0__2__Impl"


    // $ANTLR start "rule__Construct2__Group_1__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2518:1: rule__Construct2__Group_1__0 : rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1 ;
    public final void rule__Construct2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2522:1: ( rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2523:2: rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct2__Group_1__0__Impl_in_rule__Construct2__Group_1__05007);
            rule__Construct2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct2__Group_1__1_in_rule__Construct2__Group_1__05010);
            rule__Construct2__Group_1__1();

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
    // $ANTLR end "rule__Construct2__Group_1__0"


    // $ANTLR start "rule__Construct2__Group_1__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2530:1: rule__Construct2__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2534:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2535:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2535:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2536:1: ()
            {
             before(grammarAccess.getConstruct2Access().getUntilAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2537:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2539:1: 
            {
            }

             after(grammarAccess.getConstruct2Access().getUntilAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct2__Group_1__0__Impl"


    // $ANTLR start "rule__Construct2__Group_1__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2549:1: rule__Construct2__Group_1__1 : rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2 ;
    public final void rule__Construct2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2553:1: ( rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2554:2: rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2
            {
            pushFollow(FOLLOW_rule__Construct2__Group_1__1__Impl_in_rule__Construct2__Group_1__15068);
            rule__Construct2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct2__Group_1__2_in_rule__Construct2__Group_1__15071);
            rule__Construct2__Group_1__2();

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
    // $ANTLR end "rule__Construct2__Group_1__1"


    // $ANTLR start "rule__Construct2__Group_1__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2561:1: rule__Construct2__Group_1__1__Impl : ( '->' ) ;
    public final void rule__Construct2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2565:1: ( ( '->' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2566:1: ( '->' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2566:1: ( '->' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2567:1: '->'
            {
             before(grammarAccess.getConstruct2Access().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__Construct2__Group_1__1__Impl5099); 
             after(grammarAccess.getConstruct2Access().getHyphenMinusGreaterThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Construct2__Group_1__1__Impl"


    // $ANTLR start "rule__Construct2__Group_1__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2580:1: rule__Construct2__Group_1__2 : rule__Construct2__Group_1__2__Impl ;
    public final void rule__Construct2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2584:1: ( rule__Construct2__Group_1__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2585:2: rule__Construct2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Construct2__Group_1__2__Impl_in_rule__Construct2__Group_1__25130);
            rule__Construct2__Group_1__2__Impl();

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
    // $ANTLR end "rule__Construct2__Group_1__2"


    // $ANTLR start "rule__Construct2__Group_1__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2591:1: rule__Construct2__Group_1__2__Impl : ( ( rule__Construct2__OperandAssignment_1_2 ) ) ;
    public final void rule__Construct2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2595:1: ( ( ( rule__Construct2__OperandAssignment_1_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2596:1: ( ( rule__Construct2__OperandAssignment_1_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2596:1: ( ( rule__Construct2__OperandAssignment_1_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2597:1: ( rule__Construct2__OperandAssignment_1_2 )
            {
             before(grammarAccess.getConstruct2Access().getOperandAssignment_1_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2598:1: ( rule__Construct2__OperandAssignment_1_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2598:2: rule__Construct2__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Construct2__OperandAssignment_1_2_in_rule__Construct2__Group_1__2__Impl5157);
            rule__Construct2__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConstruct2Access().getOperandAssignment_1_2()); 

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
    // $ANTLR end "rule__Construct2__Group_1__2__Impl"


    // $ANTLR start "rule__Construct3__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2614:1: rule__Construct3__Group__0 : rule__Construct3__Group__0__Impl rule__Construct3__Group__1 ;
    public final void rule__Construct3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2618:1: ( rule__Construct3__Group__0__Impl rule__Construct3__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2619:2: rule__Construct3__Group__0__Impl rule__Construct3__Group__1
            {
            pushFollow(FOLLOW_rule__Construct3__Group__0__Impl_in_rule__Construct3__Group__05193);
            rule__Construct3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group__1_in_rule__Construct3__Group__05196);
            rule__Construct3__Group__1();

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
    // $ANTLR end "rule__Construct3__Group__0"


    // $ANTLR start "rule__Construct3__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2626:1: rule__Construct3__Group__0__Impl : ( ruleConstruct4 ) ;
    public final void rule__Construct3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2630:1: ( ( ruleConstruct4 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2631:1: ( ruleConstruct4 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2631:1: ( ruleConstruct4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2632:1: ruleConstruct4
            {
             before(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstruct4_in_rule__Construct3__Group__0__Impl5223);
            ruleConstruct4();

            state._fsp--;

             after(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 

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
    // $ANTLR end "rule__Construct3__Group__0__Impl"


    // $ANTLR start "rule__Construct3__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2643:1: rule__Construct3__Group__1 : rule__Construct3__Group__1__Impl ;
    public final void rule__Construct3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2647:1: ( rule__Construct3__Group__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2648:2: rule__Construct3__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct3__Group__1__Impl_in_rule__Construct3__Group__15252);
            rule__Construct3__Group__1__Impl();

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
    // $ANTLR end "rule__Construct3__Group__1"


    // $ANTLR start "rule__Construct3__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2654:1: rule__Construct3__Group__1__Impl : ( ( rule__Construct3__Group_1__0 )* ) ;
    public final void rule__Construct3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2658:1: ( ( ( rule__Construct3__Group_1__0 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2659:1: ( ( rule__Construct3__Group_1__0 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2659:1: ( ( rule__Construct3__Group_1__0 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2660:1: ( rule__Construct3__Group_1__0 )*
            {
             before(grammarAccess.getConstruct3Access().getGroup_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2661:1: ( rule__Construct3__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2661:2: rule__Construct3__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Construct3__Group_1__0_in_rule__Construct3__Group__1__Impl5279);
            	    rule__Construct3__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getConstruct3Access().getGroup_1()); 

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
    // $ANTLR end "rule__Construct3__Group__1__Impl"


    // $ANTLR start "rule__Construct3__Group_1__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2675:1: rule__Construct3__Group_1__0 : rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1 ;
    public final void rule__Construct3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2679:1: ( rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2680:2: rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__0__Impl_in_rule__Construct3__Group_1__05314);
            rule__Construct3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1__1_in_rule__Construct3__Group_1__05317);
            rule__Construct3__Group_1__1();

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
    // $ANTLR end "rule__Construct3__Group_1__0"


    // $ANTLR start "rule__Construct3__Group_1__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2687:1: rule__Construct3__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2691:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2692:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2692:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2693:1: ()
            {
             before(grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2694:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2696:1: 
            {
            }

             after(grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct3__Group_1__0__Impl"


    // $ANTLR start "rule__Construct3__Group_1__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2706:1: rule__Construct3__Group_1__1 : rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2 ;
    public final void rule__Construct3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2710:1: ( rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2711:2: rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__1__Impl_in_rule__Construct3__Group_1__15375);
            rule__Construct3__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1__2_in_rule__Construct3__Group_1__15378);
            rule__Construct3__Group_1__2();

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
    // $ANTLR end "rule__Construct3__Group_1__1"


    // $ANTLR start "rule__Construct3__Group_1__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2718:1: rule__Construct3__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Construct3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2722:1: ( ( '{' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2723:1: ( '{' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2723:1: ( '{' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2724:1: '{'
            {
             before(grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1()); 
            match(input,14,FOLLOW_14_in_rule__Construct3__Group_1__1__Impl5406); 
             after(grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Construct3__Group_1__1__Impl"


    // $ANTLR start "rule__Construct3__Group_1__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2737:1: rule__Construct3__Group_1__2 : rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3 ;
    public final void rule__Construct3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2741:1: ( rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2742:2: rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__2__Impl_in_rule__Construct3__Group_1__25437);
            rule__Construct3__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1__3_in_rule__Construct3__Group_1__25440);
            rule__Construct3__Group_1__3();

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
    // $ANTLR end "rule__Construct3__Group_1__2"


    // $ANTLR start "rule__Construct3__Group_1__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2749:1: rule__Construct3__Group_1__2__Impl : ( ( rule__Construct3__MinAssignment_1_2 ) ) ;
    public final void rule__Construct3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2753:1: ( ( ( rule__Construct3__MinAssignment_1_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2754:1: ( ( rule__Construct3__MinAssignment_1_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2754:1: ( ( rule__Construct3__MinAssignment_1_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2755:1: ( rule__Construct3__MinAssignment_1_2 )
            {
             before(grammarAccess.getConstruct3Access().getMinAssignment_1_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2756:1: ( rule__Construct3__MinAssignment_1_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2756:2: rule__Construct3__MinAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Construct3__MinAssignment_1_2_in_rule__Construct3__Group_1__2__Impl5467);
            rule__Construct3__MinAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConstruct3Access().getMinAssignment_1_2()); 

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
    // $ANTLR end "rule__Construct3__Group_1__2__Impl"


    // $ANTLR start "rule__Construct3__Group_1__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2766:1: rule__Construct3__Group_1__3 : rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4 ;
    public final void rule__Construct3__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2770:1: ( rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2771:2: rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__3__Impl_in_rule__Construct3__Group_1__35497);
            rule__Construct3__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1__4_in_rule__Construct3__Group_1__35500);
            rule__Construct3__Group_1__4();

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
    // $ANTLR end "rule__Construct3__Group_1__3"


    // $ANTLR start "rule__Construct3__Group_1__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2778:1: rule__Construct3__Group_1__3__Impl : ( ( rule__Construct3__Group_1_3__0 )? ) ;
    public final void rule__Construct3__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2782:1: ( ( ( rule__Construct3__Group_1_3__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2783:1: ( ( rule__Construct3__Group_1_3__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2783:1: ( ( rule__Construct3__Group_1_3__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2784:1: ( rule__Construct3__Group_1_3__0 )?
            {
             before(grammarAccess.getConstruct3Access().getGroup_1_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2785:1: ( rule__Construct3__Group_1_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2785:2: rule__Construct3__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Construct3__Group_1_3__0_in_rule__Construct3__Group_1__3__Impl5527);
                    rule__Construct3__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstruct3Access().getGroup_1_3()); 

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
    // $ANTLR end "rule__Construct3__Group_1__3__Impl"


    // $ANTLR start "rule__Construct3__Group_1__4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2795:1: rule__Construct3__Group_1__4 : rule__Construct3__Group_1__4__Impl ;
    public final void rule__Construct3__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2799:1: ( rule__Construct3__Group_1__4__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2800:2: rule__Construct3__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__4__Impl_in_rule__Construct3__Group_1__45558);
            rule__Construct3__Group_1__4__Impl();

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
    // $ANTLR end "rule__Construct3__Group_1__4"


    // $ANTLR start "rule__Construct3__Group_1__4__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2806:1: rule__Construct3__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Construct3__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2810:1: ( ( '}' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2811:1: ( '}' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2811:1: ( '}' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2812:1: '}'
            {
             before(grammarAccess.getConstruct3Access().getRightCurlyBracketKeyword_1_4()); 
            match(input,15,FOLLOW_15_in_rule__Construct3__Group_1__4__Impl5586); 
             after(grammarAccess.getConstruct3Access().getRightCurlyBracketKeyword_1_4()); 

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
    // $ANTLR end "rule__Construct3__Group_1__4__Impl"


    // $ANTLR start "rule__Construct3__Group_1_3__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2835:1: rule__Construct3__Group_1_3__0 : rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1 ;
    public final void rule__Construct3__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2839:1: ( rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2840:2: rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1_3__0__Impl_in_rule__Construct3__Group_1_3__05627);
            rule__Construct3__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1_3__1_in_rule__Construct3__Group_1_3__05630);
            rule__Construct3__Group_1_3__1();

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
    // $ANTLR end "rule__Construct3__Group_1_3__0"


    // $ANTLR start "rule__Construct3__Group_1_3__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2847:1: rule__Construct3__Group_1_3__0__Impl : ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) ) ;
    public final void rule__Construct3__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2851:1: ( ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2852:1: ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2852:1: ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2853:1: ( rule__Construct3__UpperBoundedAssignment_1_3_0 )
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedAssignment_1_3_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2854:1: ( rule__Construct3__UpperBoundedAssignment_1_3_0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2854:2: rule__Construct3__UpperBoundedAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__Construct3__UpperBoundedAssignment_1_3_0_in_rule__Construct3__Group_1_3__0__Impl5657);
            rule__Construct3__UpperBoundedAssignment_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConstruct3Access().getUpperBoundedAssignment_1_3_0()); 

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
    // $ANTLR end "rule__Construct3__Group_1_3__0__Impl"


    // $ANTLR start "rule__Construct3__Group_1_3__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2864:1: rule__Construct3__Group_1_3__1 : rule__Construct3__Group_1_3__1__Impl ;
    public final void rule__Construct3__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2868:1: ( rule__Construct3__Group_1_3__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2869:2: rule__Construct3__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1_3__1__Impl_in_rule__Construct3__Group_1_3__15687);
            rule__Construct3__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Construct3__Group_1_3__1"


    // $ANTLR start "rule__Construct3__Group_1_3__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2875:1: rule__Construct3__Group_1_3__1__Impl : ( ( rule__Construct3__MaxAssignment_1_3_1 ) ) ;
    public final void rule__Construct3__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2879:1: ( ( ( rule__Construct3__MaxAssignment_1_3_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2880:1: ( ( rule__Construct3__MaxAssignment_1_3_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2880:1: ( ( rule__Construct3__MaxAssignment_1_3_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2881:1: ( rule__Construct3__MaxAssignment_1_3_1 )
            {
             before(grammarAccess.getConstruct3Access().getMaxAssignment_1_3_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2882:1: ( rule__Construct3__MaxAssignment_1_3_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2882:2: rule__Construct3__MaxAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Construct3__MaxAssignment_1_3_1_in_rule__Construct3__Group_1_3__1__Impl5714);
            rule__Construct3__MaxAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct3Access().getMaxAssignment_1_3_1()); 

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
    // $ANTLR end "rule__Construct3__Group_1_3__1__Impl"


    // $ANTLR start "rule__Construct4__Group_0__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2896:1: rule__Construct4__Group_0__0 : rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1 ;
    public final void rule__Construct4__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2900:1: ( rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2901:2: rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_0__0__Impl_in_rule__Construct4__Group_0__05748);
            rule__Construct4__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_0__1_in_rule__Construct4__Group_0__05751);
            rule__Construct4__Group_0__1();

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
    // $ANTLR end "rule__Construct4__Group_0__0"


    // $ANTLR start "rule__Construct4__Group_0__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2908:1: rule__Construct4__Group_0__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2912:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2913:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2913:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2914:1: ()
            {
             before(grammarAccess.getConstruct4Access().getRangeAction_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2915:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2917:1: 
            {
            }

             after(grammarAccess.getConstruct4Access().getRangeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__Group_0__0__Impl"


    // $ANTLR start "rule__Construct4__Group_0__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2927:1: rule__Construct4__Group_0__1 : rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2 ;
    public final void rule__Construct4__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2931:1: ( rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2932:2: rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2
            {
            pushFollow(FOLLOW_rule__Construct4__Group_0__1__Impl_in_rule__Construct4__Group_0__15809);
            rule__Construct4__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_0__2_in_rule__Construct4__Group_0__15812);
            rule__Construct4__Group_0__2();

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
    // $ANTLR end "rule__Construct4__Group_0__1"


    // $ANTLR start "rule__Construct4__Group_0__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2939:1: rule__Construct4__Group_0__1__Impl : ( ( rule__Construct4__MinAssignment_0_1 ) ) ;
    public final void rule__Construct4__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2943:1: ( ( ( rule__Construct4__MinAssignment_0_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2944:1: ( ( rule__Construct4__MinAssignment_0_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2944:1: ( ( rule__Construct4__MinAssignment_0_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2945:1: ( rule__Construct4__MinAssignment_0_1 )
            {
             before(grammarAccess.getConstruct4Access().getMinAssignment_0_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2946:1: ( rule__Construct4__MinAssignment_0_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2946:2: rule__Construct4__MinAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Construct4__MinAssignment_0_1_in_rule__Construct4__Group_0__1__Impl5839);
            rule__Construct4__MinAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getMinAssignment_0_1()); 

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
    // $ANTLR end "rule__Construct4__Group_0__1__Impl"


    // $ANTLR start "rule__Construct4__Group_0__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2956:1: rule__Construct4__Group_0__2 : rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3 ;
    public final void rule__Construct4__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2960:1: ( rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2961:2: rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3
            {
            pushFollow(FOLLOW_rule__Construct4__Group_0__2__Impl_in_rule__Construct4__Group_0__25869);
            rule__Construct4__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_0__3_in_rule__Construct4__Group_0__25872);
            rule__Construct4__Group_0__3();

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
    // $ANTLR end "rule__Construct4__Group_0__2"


    // $ANTLR start "rule__Construct4__Group_0__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2968:1: rule__Construct4__Group_0__2__Impl : ( '..' ) ;
    public final void rule__Construct4__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2972:1: ( ( '..' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2973:1: ( '..' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2973:1: ( '..' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2974:1: '..'
            {
             before(grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_0_2()); 
            match(input,12,FOLLOW_12_in_rule__Construct4__Group_0__2__Impl5900); 
             after(grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_0_2()); 

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
    // $ANTLR end "rule__Construct4__Group_0__2__Impl"


    // $ANTLR start "rule__Construct4__Group_0__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2987:1: rule__Construct4__Group_0__3 : rule__Construct4__Group_0__3__Impl ;
    public final void rule__Construct4__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2991:1: ( rule__Construct4__Group_0__3__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2992:2: rule__Construct4__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_0__3__Impl_in_rule__Construct4__Group_0__35931);
            rule__Construct4__Group_0__3__Impl();

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
    // $ANTLR end "rule__Construct4__Group_0__3"


    // $ANTLR start "rule__Construct4__Group_0__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2998:1: rule__Construct4__Group_0__3__Impl : ( ( rule__Construct4__MaxAssignment_0_3 ) ) ;
    public final void rule__Construct4__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3002:1: ( ( ( rule__Construct4__MaxAssignment_0_3 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3003:1: ( ( rule__Construct4__MaxAssignment_0_3 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3003:1: ( ( rule__Construct4__MaxAssignment_0_3 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3004:1: ( rule__Construct4__MaxAssignment_0_3 )
            {
             before(grammarAccess.getConstruct4Access().getMaxAssignment_0_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3005:1: ( rule__Construct4__MaxAssignment_0_3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3005:2: rule__Construct4__MaxAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Construct4__MaxAssignment_0_3_in_rule__Construct4__Group_0__3__Impl5958);
            rule__Construct4__MaxAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getMaxAssignment_0_3()); 

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
    // $ANTLR end "rule__Construct4__Group_0__3__Impl"


    // $ANTLR start "rule__Construct4__Group_1__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3023:1: rule__Construct4__Group_1__0 : rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1 ;
    public final void rule__Construct4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3027:1: ( rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3028:2: rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_1__0__Impl_in_rule__Construct4__Group_1__05996);
            rule__Construct4__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_1__1_in_rule__Construct4__Group_1__05999);
            rule__Construct4__Group_1__1();

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
    // $ANTLR end "rule__Construct4__Group_1__0"


    // $ANTLR start "rule__Construct4__Group_1__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3035:1: rule__Construct4__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3039:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3040:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3040:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3041:1: ()
            {
             before(grammarAccess.getConstruct4Access().getKeywordAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3042:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3044:1: 
            {
            }

             after(grammarAccess.getConstruct4Access().getKeywordAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__Group_1__0__Impl"


    // $ANTLR start "rule__Construct4__Group_1__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3054:1: rule__Construct4__Group_1__1 : rule__Construct4__Group_1__1__Impl ;
    public final void rule__Construct4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3058:1: ( rule__Construct4__Group_1__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3059:2: rule__Construct4__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_1__1__Impl_in_rule__Construct4__Group_1__16057);
            rule__Construct4__Group_1__1__Impl();

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
    // $ANTLR end "rule__Construct4__Group_1__1"


    // $ANTLR start "rule__Construct4__Group_1__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3065:1: rule__Construct4__Group_1__1__Impl : ( ( rule__Construct4__ValueAssignment_1_1 ) ) ;
    public final void rule__Construct4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3069:1: ( ( ( rule__Construct4__ValueAssignment_1_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3070:1: ( ( rule__Construct4__ValueAssignment_1_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3070:1: ( ( rule__Construct4__ValueAssignment_1_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3071:1: ( rule__Construct4__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstruct4Access().getValueAssignment_1_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3072:1: ( rule__Construct4__ValueAssignment_1_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3072:2: rule__Construct4__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Construct4__ValueAssignment_1_1_in_rule__Construct4__Group_1__1__Impl6084);
            rule__Construct4__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Construct4__Group_1__1__Impl"


    // $ANTLR start "rule__Construct4__Group_2__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3086:1: rule__Construct4__Group_2__0 : rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1 ;
    public final void rule__Construct4__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3090:1: ( rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3091:2: rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_2__0__Impl_in_rule__Construct4__Group_2__06118);
            rule__Construct4__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_2__1_in_rule__Construct4__Group_2__06121);
            rule__Construct4__Group_2__1();

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
    // $ANTLR end "rule__Construct4__Group_2__0"


    // $ANTLR start "rule__Construct4__Group_2__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3098:1: rule__Construct4__Group_2__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3102:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3103:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3103:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3104:1: ()
            {
             before(grammarAccess.getConstruct4Access().getAnyAction_2_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3105:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3107:1: 
            {
            }

             after(grammarAccess.getConstruct4Access().getAnyAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__Group_2__0__Impl"


    // $ANTLR start "rule__Construct4__Group_2__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3117:1: rule__Construct4__Group_2__1 : rule__Construct4__Group_2__1__Impl ;
    public final void rule__Construct4__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3121:1: ( rule__Construct4__Group_2__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3122:2: rule__Construct4__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_2__1__Impl_in_rule__Construct4__Group_2__16179);
            rule__Construct4__Group_2__1__Impl();

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
    // $ANTLR end "rule__Construct4__Group_2__1"


    // $ANTLR start "rule__Construct4__Group_2__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3128:1: rule__Construct4__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Construct4__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3132:1: ( ( '.' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3133:1: ( '.' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3133:1: ( '.' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3134:1: '.'
            {
             before(grammarAccess.getConstruct4Access().getFullStopKeyword_2_1()); 
            match(input,21,FOLLOW_21_in_rule__Construct4__Group_2__1__Impl6207); 
             after(grammarAccess.getConstruct4Access().getFullStopKeyword_2_1()); 

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
    // $ANTLR end "rule__Construct4__Group_2__1__Impl"


    // $ANTLR start "rule__Construct4__Group_3__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3151:1: rule__Construct4__Group_3__0 : rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1 ;
    public final void rule__Construct4__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3155:1: ( rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3156:2: rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_3__0__Impl_in_rule__Construct4__Group_3__06242);
            rule__Construct4__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_3__1_in_rule__Construct4__Group_3__06245);
            rule__Construct4__Group_3__1();

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
    // $ANTLR end "rule__Construct4__Group_3__0"


    // $ANTLR start "rule__Construct4__Group_3__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3163:1: rule__Construct4__Group_3__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3167:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3168:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3168:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3169:1: ()
            {
             before(grammarAccess.getConstruct4Access().getReferenceAction_3_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3170:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3172:1: 
            {
            }

             after(grammarAccess.getConstruct4Access().getReferenceAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__Group_3__0__Impl"


    // $ANTLR start "rule__Construct4__Group_3__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3182:1: rule__Construct4__Group_3__1 : rule__Construct4__Group_3__1__Impl ;
    public final void rule__Construct4__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3186:1: ( rule__Construct4__Group_3__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3187:2: rule__Construct4__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_3__1__Impl_in_rule__Construct4__Group_3__16303);
            rule__Construct4__Group_3__1__Impl();

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
    // $ANTLR end "rule__Construct4__Group_3__1"


    // $ANTLR start "rule__Construct4__Group_3__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3193:1: rule__Construct4__Group_3__1__Impl : ( ( rule__Construct4__TargetAssignment_3_1 ) ) ;
    public final void rule__Construct4__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3197:1: ( ( ( rule__Construct4__TargetAssignment_3_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3198:1: ( ( rule__Construct4__TargetAssignment_3_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3198:1: ( ( rule__Construct4__TargetAssignment_3_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3199:1: ( rule__Construct4__TargetAssignment_3_1 )
            {
             before(grammarAccess.getConstruct4Access().getTargetAssignment_3_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3200:1: ( rule__Construct4__TargetAssignment_3_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3200:2: rule__Construct4__TargetAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Construct4__TargetAssignment_3_1_in_rule__Construct4__Group_3__1__Impl6330);
            rule__Construct4__TargetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getTargetAssignment_3_1()); 

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
    // $ANTLR end "rule__Construct4__Group_3__1__Impl"


    // $ANTLR start "rule__Construct4__Group_4__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3214:1: rule__Construct4__Group_4__0 : rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1 ;
    public final void rule__Construct4__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3218:1: ( rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3219:2: rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_4__0__Impl_in_rule__Construct4__Group_4__06364);
            rule__Construct4__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_4__1_in_rule__Construct4__Group_4__06367);
            rule__Construct4__Group_4__1();

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
    // $ANTLR end "rule__Construct4__Group_4__0"


    // $ANTLR start "rule__Construct4__Group_4__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3226:1: rule__Construct4__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Construct4__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3230:1: ( ( '(' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3231:1: ( '(' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3231:1: ( '(' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3232:1: '('
            {
             before(grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0()); 
            match(input,11,FOLLOW_11_in_rule__Construct4__Group_4__0__Impl6395); 
             after(grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0()); 

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
    // $ANTLR end "rule__Construct4__Group_4__0__Impl"


    // $ANTLR start "rule__Construct4__Group_4__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3245:1: rule__Construct4__Group_4__1 : rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2 ;
    public final void rule__Construct4__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3249:1: ( rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3250:2: rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2
            {
            pushFollow(FOLLOW_rule__Construct4__Group_4__1__Impl_in_rule__Construct4__Group_4__16426);
            rule__Construct4__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_4__2_in_rule__Construct4__Group_4__16429);
            rule__Construct4__Group_4__2();

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
    // $ANTLR end "rule__Construct4__Group_4__1"


    // $ANTLR start "rule__Construct4__Group_4__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3257:1: rule__Construct4__Group_4__1__Impl : ( ruleConstruct0 ) ;
    public final void rule__Construct4__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3261:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3262:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3262:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3263:1: ruleConstruct0
            {
             before(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__Construct4__Group_4__1__Impl6456);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__Construct4__Group_4__1__Impl"


    // $ANTLR start "rule__Construct4__Group_4__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3274:1: rule__Construct4__Group_4__2 : rule__Construct4__Group_4__2__Impl ;
    public final void rule__Construct4__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3278:1: ( rule__Construct4__Group_4__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3279:2: rule__Construct4__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_4__2__Impl_in_rule__Construct4__Group_4__26485);
            rule__Construct4__Group_4__2__Impl();

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
    // $ANTLR end "rule__Construct4__Group_4__2"


    // $ANTLR start "rule__Construct4__Group_4__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3285:1: rule__Construct4__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Construct4__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3289:1: ( ( ')' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3290:1: ( ')' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3290:1: ( ')' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3291:1: ')'
            {
             before(grammarAccess.getConstruct4Access().getRightParenthesisKeyword_4_2()); 
            match(input,13,FOLLOW_13_in_rule__Construct4__Group_4__2__Impl6513); 
             after(grammarAccess.getConstruct4Access().getRightParenthesisKeyword_4_2()); 

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
    // $ANTLR end "rule__Construct4__Group_4__2__Impl"


    // $ANTLR start "rule__Model__ApplicationsAssignment"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3311:1: rule__Model__ApplicationsAssignment : ( ruleApply ) ;
    public final void rule__Model__ApplicationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3315:1: ( ( ruleApply ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3316:1: ( ruleApply )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3316:1: ( ruleApply )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3317:1: ruleApply
            {
             before(grammarAccess.getModelAccess().getApplicationsApplyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleApply_in_rule__Model__ApplicationsAssignment6555);
            ruleApply();

            state._fsp--;

             after(grammarAccess.getModelAccess().getApplicationsApplyParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ApplicationsAssignment"


    // $ANTLR start "rule__Apply__TargetAssignment_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3326:1: rule__Apply__TargetAssignment_1 : ( ( ruleQID ) ) ;
    public final void rule__Apply__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3330:1: ( ( ( ruleQID ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3331:1: ( ( ruleQID ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3331:1: ( ( ruleQID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3332:1: ( ruleQID )
            {
             before(grammarAccess.getApplyAccess().getTargetGrammarCrossReference_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3333:1: ( ruleQID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3334:1: ruleQID
            {
             before(grammarAccess.getApplyAccess().getTargetGrammarQIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQID_in_rule__Apply__TargetAssignment_16590);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getTargetGrammarQIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getApplyAccess().getTargetGrammarCrossReference_1_0()); 

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
    // $ANTLR end "rule__Apply__TargetAssignment_1"


    // $ANTLR start "rule__Apply__MinAssignment_3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3345:1: rule__Apply__MinAssignment_3 : ( RULE_INT ) ;
    public final void rule__Apply__MinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3349:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3350:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3350:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3351:1: RULE_INT
            {
             before(grammarAccess.getApplyAccess().getMinINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Apply__MinAssignment_36625); 
             after(grammarAccess.getApplyAccess().getMinINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Apply__MinAssignment_3"


    // $ANTLR start "rule__Apply__MaxAssignment_5"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3360:1: rule__Apply__MaxAssignment_5 : ( RULE_INT ) ;
    public final void rule__Apply__MaxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3364:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3365:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3365:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3366:1: RULE_INT
            {
             before(grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Apply__MaxAssignment_56656); 
             after(grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Apply__MaxAssignment_5"


    // $ANTLR start "rule__Apply__ConstructReplacementsAssignment_7_1_0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3375:1: rule__Apply__ConstructReplacementsAssignment_7_1_0 : ( ruleConstructReplacement ) ;
    public final void rule__Apply__ConstructReplacementsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3379:1: ( ( ruleConstructReplacement ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3380:1: ( ruleConstructReplacement )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3380:1: ( ruleConstructReplacement )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3381:1: ruleConstructReplacement
            {
             before(grammarAccess.getApplyAccess().getConstructReplacementsConstructReplacementParserRuleCall_7_1_0_0()); 
            pushFollow(FOLLOW_ruleConstructReplacement_in_rule__Apply__ConstructReplacementsAssignment_7_1_06687);
            ruleConstructReplacement();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getConstructReplacementsConstructReplacementParserRuleCall_7_1_0_0()); 

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
    // $ANTLR end "rule__Apply__ConstructReplacementsAssignment_7_1_0"


    // $ANTLR start "rule__Apply__RuleReplacementsAssignment_7_1_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3390:1: rule__Apply__RuleReplacementsAssignment_7_1_1 : ( ruleRuleReplacement ) ;
    public final void rule__Apply__RuleReplacementsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3394:1: ( ( ruleRuleReplacement ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3395:1: ( ruleRuleReplacement )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3395:1: ( ruleRuleReplacement )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3396:1: ruleRuleReplacement
            {
             before(grammarAccess.getApplyAccess().getRuleReplacementsRuleReplacementParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_ruleRuleReplacement_in_rule__Apply__RuleReplacementsAssignment_7_1_16718);
            ruleRuleReplacement();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getRuleReplacementsRuleReplacementParserRuleCall_7_1_1_0()); 

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
    // $ANTLR end "rule__Apply__RuleReplacementsAssignment_7_1_1"


    // $ANTLR start "rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3405:1: rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2 : ( ruleMultiplicityAdjustment ) ;
    public final void rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3409:1: ( ( ruleMultiplicityAdjustment ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3410:1: ( ruleMultiplicityAdjustment )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3410:1: ( ruleMultiplicityAdjustment )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3411:1: ruleMultiplicityAdjustment
            {
             before(grammarAccess.getApplyAccess().getMultiplicityAdjustmentsMultiplicityAdjustmentParserRuleCall_7_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplicityAdjustment_in_rule__Apply__MultiplicityAdjustmentsAssignment_7_1_26749);
            ruleMultiplicityAdjustment();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getMultiplicityAdjustmentsMultiplicityAdjustmentParserRuleCall_7_1_2_0()); 

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
    // $ANTLR end "rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2"


    // $ANTLR start "rule__ConstructReplacement__SelectorAssignment_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3420:1: rule__ConstructReplacement__SelectorAssignment_1 : ( ruleConstruct0 ) ;
    public final void rule__ConstructReplacement__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3424:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3425:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3425:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3426:1: ruleConstruct0
            {
             before(grammarAccess.getConstructReplacementAccess().getSelectorConstruct0ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__ConstructReplacement__SelectorAssignment_16780);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getConstructReplacementAccess().getSelectorConstruct0ParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConstructReplacement__SelectorAssignment_1"


    // $ANTLR start "rule__ConstructReplacement__PositionedAssignment_2_0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3435:1: rule__ConstructReplacement__PositionedAssignment_2_0 : ( ( '/' ) ) ;
    public final void rule__ConstructReplacement__PositionedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3439:1: ( ( ( '/' ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3440:1: ( ( '/' ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3440:1: ( ( '/' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3441:1: ( '/' )
            {
             before(grammarAccess.getConstructReplacementAccess().getPositionedSolidusKeyword_2_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3442:1: ( '/' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3443:1: '/'
            {
             before(grammarAccess.getConstructReplacementAccess().getPositionedSolidusKeyword_2_0_0()); 
            match(input,27,FOLLOW_27_in_rule__ConstructReplacement__PositionedAssignment_2_06816); 
             after(grammarAccess.getConstructReplacementAccess().getPositionedSolidusKeyword_2_0_0()); 

            }

             after(grammarAccess.getConstructReplacementAccess().getPositionedSolidusKeyword_2_0_0()); 

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
    // $ANTLR end "rule__ConstructReplacement__PositionedAssignment_2_0"


    // $ANTLR start "rule__ConstructReplacement__PositionAssignment_2_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3458:1: rule__ConstructReplacement__PositionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ConstructReplacement__PositionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3462:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3463:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3463:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3464:1: RULE_INT
            {
             before(grammarAccess.getConstructReplacementAccess().getPositionINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConstructReplacement__PositionAssignment_2_16855); 
             after(grammarAccess.getConstructReplacementAccess().getPositionINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ConstructReplacement__PositionAssignment_2_1"


    // $ANTLR start "rule__ConstructReplacement__TargetAssignment_4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3473:1: rule__ConstructReplacement__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstructReplacement__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3477:1: ( ( ( RULE_ID ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3478:1: ( ( RULE_ID ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3478:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3479:1: ( RULE_ID )
            {
             before(grammarAccess.getConstructReplacementAccess().getTargetAbstractRuleCrossReference_4_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3480:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3481:1: RULE_ID
            {
             before(grammarAccess.getConstructReplacementAccess().getTargetAbstractRuleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstructReplacement__TargetAssignment_46890); 
             after(grammarAccess.getConstructReplacementAccess().getTargetAbstractRuleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstructReplacementAccess().getTargetAbstractRuleCrossReference_4_0()); 

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
    // $ANTLR end "rule__ConstructReplacement__TargetAssignment_4"


    // $ANTLR start "rule__ConstructReplacement__ReplacementAssignment_6"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3492:1: rule__ConstructReplacement__ReplacementAssignment_6 : ( ruleConstruct0 ) ;
    public final void rule__ConstructReplacement__ReplacementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3496:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3497:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3497:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3498:1: ruleConstruct0
            {
             before(grammarAccess.getConstructReplacementAccess().getReplacementConstruct0ParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__ConstructReplacement__ReplacementAssignment_66925);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getConstructReplacementAccess().getReplacementConstruct0ParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ConstructReplacement__ReplacementAssignment_6"


    // $ANTLR start "rule__MultiplicityAdjustment__PositionedAssignment_2_0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3507:1: rule__MultiplicityAdjustment__PositionedAssignment_2_0 : ( ( '/' ) ) ;
    public final void rule__MultiplicityAdjustment__PositionedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3511:1: ( ( ( '/' ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3512:1: ( ( '/' ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3512:1: ( ( '/' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3513:1: ( '/' )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getPositionedSolidusKeyword_2_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3514:1: ( '/' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3515:1: '/'
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getPositionedSolidusKeyword_2_0_0()); 
            match(input,27,FOLLOW_27_in_rule__MultiplicityAdjustment__PositionedAssignment_2_06961); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getPositionedSolidusKeyword_2_0_0()); 

            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getPositionedSolidusKeyword_2_0_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__PositionedAssignment_2_0"


    // $ANTLR start "rule__MultiplicityAdjustment__PositionAssignment_2_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3530:1: rule__MultiplicityAdjustment__PositionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__MultiplicityAdjustment__PositionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3534:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3535:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3535:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3536:1: RULE_INT
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getPositionINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MultiplicityAdjustment__PositionAssignment_2_17000); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getPositionINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__PositionAssignment_2_1"


    // $ANTLR start "rule__MultiplicityAdjustment__TargetAssignment_4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3545:1: rule__MultiplicityAdjustment__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MultiplicityAdjustment__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3549:1: ( ( ( RULE_ID ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3550:1: ( ( RULE_ID ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3550:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3551:1: ( RULE_ID )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getTargetAbstractRuleCrossReference_4_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3552:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3553:1: RULE_ID
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getTargetAbstractRuleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiplicityAdjustment__TargetAssignment_47035); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getTargetAbstractRuleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getTargetAbstractRuleCrossReference_4_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__TargetAssignment_4"


    // $ANTLR start "rule__MultiplicityAdjustment__MinAssignment_7"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3564:1: rule__MultiplicityAdjustment__MinAssignment_7 : ( RULE_INT ) ;
    public final void rule__MultiplicityAdjustment__MinAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3568:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3569:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3569:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3570:1: RULE_INT
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getMinINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MultiplicityAdjustment__MinAssignment_77070); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getMinINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__MinAssignment_7"


    // $ANTLR start "rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3579:1: rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0 : ( ( ',' ) ) ;
    public final void rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3583:1: ( ( ( ',' ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3584:1: ( ( ',' ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3584:1: ( ( ',' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3585:1: ( ',' )
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getUpperBoundedCommaKeyword_8_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3586:1: ( ',' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3587:1: ','
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getUpperBoundedCommaKeyword_8_0_0()); 
            match(input,28,FOLLOW_28_in_rule__MultiplicityAdjustment__UpperBoundedAssignment_8_07106); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getUpperBoundedCommaKeyword_8_0_0()); 

            }

             after(grammarAccess.getMultiplicityAdjustmentAccess().getUpperBoundedCommaKeyword_8_0_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0"


    // $ANTLR start "rule__MultiplicityAdjustment__MaxAssignment_8_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3602:1: rule__MultiplicityAdjustment__MaxAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__MultiplicityAdjustment__MaxAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3606:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3607:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3607:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3608:1: RULE_INT
            {
             before(grammarAccess.getMultiplicityAdjustmentAccess().getMaxINTTerminalRuleCall_8_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MultiplicityAdjustment__MaxAssignment_8_17145); 
             after(grammarAccess.getMultiplicityAdjustmentAccess().getMaxINTTerminalRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__MultiplicityAdjustment__MaxAssignment_8_1"


    // $ANTLR start "rule__RuleReplacement__TargetAssignment_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3617:1: rule__RuleReplacement__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RuleReplacement__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3621:1: ( ( ( RULE_ID ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3622:1: ( ( RULE_ID ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3622:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3623:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleCrossReference_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3624:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3625:1: RULE_ID
            {
             before(grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleReplacement__TargetAssignment_17180); 
             after(grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleCrossReference_1_0()); 

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
    // $ANTLR end "rule__RuleReplacement__TargetAssignment_1"


    // $ANTLR start "rule__RuleReplacement__ReplacementAssignment_3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3636:1: rule__RuleReplacement__ReplacementAssignment_3 : ( ruleConstruct0 ) ;
    public final void rule__RuleReplacement__ReplacementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3640:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3641:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3641:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3642:1: ruleConstruct0
            {
             before(grammarAccess.getRuleReplacementAccess().getReplacementConstruct0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__RuleReplacement__ReplacementAssignment_37215);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getRuleReplacementAccess().getReplacementConstruct0ParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RuleReplacement__ReplacementAssignment_3"


    // $ANTLR start "rule__Definition__LexicalAssignment_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3652:1: rule__Definition__LexicalAssignment_1 : ( ( 'lexical' ) ) ;
    public final void rule__Definition__LexicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3656:1: ( ( ( 'lexical' ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3657:1: ( ( 'lexical' ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3657:1: ( ( 'lexical' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3658:1: ( 'lexical' )
            {
             before(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3659:1: ( 'lexical' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3660:1: 'lexical'
            {
             before(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Definition__LexicalAssignment_17252); 
             after(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 

            }

             after(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 

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
    // $ANTLR end "rule__Definition__LexicalAssignment_1"


    // $ANTLR start "rule__Definition__NameAssignment_2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3675:1: rule__Definition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3679:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3680:1: ( RULE_ID )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3680:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3681:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_27291); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Definition__NameAssignment_2"


    // $ANTLR start "rule__Definition__RhsAssignment_4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3690:1: rule__Definition__RhsAssignment_4 : ( ruleConstruct0 ) ;
    public final void rule__Definition__RhsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3694:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3695:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3695:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3696:1: ruleConstruct0
            {
             before(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__Definition__RhsAssignment_47322);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Definition__RhsAssignment_4"


    // $ANTLR start "rule__Construct0__OperandsAssignment_1_2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3705:1: rule__Construct0__OperandsAssignment_1_2 : ( ruleConstruct1 ) ;
    public final void rule__Construct0__OperandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3709:1: ( ( ruleConstruct1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3710:1: ( ruleConstruct1 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3710:1: ( ruleConstruct1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3711:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_27353);
            ruleConstruct1();

            state._fsp--;

             after(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Construct0__OperandsAssignment_1_2"


    // $ANTLR start "rule__Construct0__OperandsAssignment_1_3_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3720:1: rule__Construct0__OperandsAssignment_1_3_1 : ( ruleConstruct1 ) ;
    public final void rule__Construct0__OperandsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3724:1: ( ( ruleConstruct1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3725:1: ( ruleConstruct1 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3725:1: ( ruleConstruct1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3726:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_3_17384);
            ruleConstruct1();

            state._fsp--;

             after(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__Construct0__OperandsAssignment_1_3_1"


    // $ANTLR start "rule__Construct1__OperandsAssignment_1_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3735:1: rule__Construct1__OperandsAssignment_1_1 : ( ruleConstruct2 ) ;
    public final void rule__Construct1__OperandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3739:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3740:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3740:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3741:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_17415);
            ruleConstruct2();

            state._fsp--;

             after(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Construct1__OperandsAssignment_1_1"


    // $ANTLR start "rule__Construct1__OperandsAssignment_1_2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3750:1: rule__Construct1__OperandsAssignment_1_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct1__OperandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3754:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3755:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3755:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3756:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_27446);
            ruleConstruct2();

            state._fsp--;

             after(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Construct1__OperandsAssignment_1_2"


    // $ANTLR start "rule__Construct2__OperandAssignment_0_2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3765:1: rule__Construct2__OperandAssignment_0_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct2__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3769:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3770:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3770:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3771:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_0_27477);
            ruleConstruct2();

            state._fsp--;

             after(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Construct2__OperandAssignment_0_2"


    // $ANTLR start "rule__Construct2__OperandAssignment_1_2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3780:1: rule__Construct2__OperandAssignment_1_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct2__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3784:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3785:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3785:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3786:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_1_27508);
            ruleConstruct2();

            state._fsp--;

             after(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Construct2__OperandAssignment_1_2"


    // $ANTLR start "rule__Construct3__MinAssignment_1_2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3795:1: rule__Construct3__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Construct3__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3799:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3800:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3800:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3801:1: RULE_INT
            {
             before(grammarAccess.getConstruct3Access().getMinINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Construct3__MinAssignment_1_27539); 
             after(grammarAccess.getConstruct3Access().getMinINTTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Construct3__MinAssignment_1_2"


    // $ANTLR start "rule__Construct3__UpperBoundedAssignment_1_3_0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3810:1: rule__Construct3__UpperBoundedAssignment_1_3_0 : ( ( ',' ) ) ;
    public final void rule__Construct3__UpperBoundedAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3814:1: ( ( ( ',' ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3815:1: ( ( ',' ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3815:1: ( ( ',' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3816:1: ( ',' )
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3817:1: ( ',' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3818:1: ','
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Construct3__UpperBoundedAssignment_1_3_07575); 
             after(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 

            }

             after(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 

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
    // $ANTLR end "rule__Construct3__UpperBoundedAssignment_1_3_0"


    // $ANTLR start "rule__Construct3__MaxAssignment_1_3_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3833:1: rule__Construct3__MaxAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__Construct3__MaxAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3837:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3838:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3838:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3839:1: RULE_INT
            {
             before(grammarAccess.getConstruct3Access().getMaxINTTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Construct3__MaxAssignment_1_3_17614); 
             after(grammarAccess.getConstruct3Access().getMaxINTTerminalRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__Construct3__MaxAssignment_1_3_1"


    // $ANTLR start "rule__Construct4__MinAssignment_0_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3848:1: rule__Construct4__MinAssignment_0_1 : ( RULE_CHAR ) ;
    public final void rule__Construct4__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3852:1: ( ( RULE_CHAR ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3853:1: ( RULE_CHAR )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3853:1: ( RULE_CHAR )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3854:1: RULE_CHAR
            {
             before(grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_0_1_0()); 
            match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__Construct4__MinAssignment_0_17645); 
             after(grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Construct4__MinAssignment_0_1"


    // $ANTLR start "rule__Construct4__MaxAssignment_0_3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3863:1: rule__Construct4__MaxAssignment_0_3 : ( RULE_CHAR ) ;
    public final void rule__Construct4__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3867:1: ( ( RULE_CHAR ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3868:1: ( RULE_CHAR )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3868:1: ( RULE_CHAR )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3869:1: RULE_CHAR
            {
             before(grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_0_3_0()); 
            match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__Construct4__MaxAssignment_0_37676); 
             after(grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Construct4__MaxAssignment_0_3"


    // $ANTLR start "rule__Construct4__ValueAssignment_1_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3878:1: rule__Construct4__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Construct4__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3882:1: ( ( RULE_STRING ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3883:1: ( RULE_STRING )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3883:1: ( RULE_STRING )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3884:1: RULE_STRING
            {
             before(grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Construct4__ValueAssignment_1_17707); 
             after(grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Construct4__ValueAssignment_1_1"


    // $ANTLR start "rule__Construct4__TargetAssignment_3_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3893:1: rule__Construct4__TargetAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Construct4__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3897:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3898:1: ( RULE_ID )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3898:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3899:1: RULE_ID
            {
             before(grammarAccess.getConstruct4Access().getTargetIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Construct4__TargetAssignment_3_17738); 
             after(grammarAccess.getConstruct4Access().getTargetIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Construct4__TargetAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ApplicationsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0_in_ruleApply155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructReplacement_in_entryRuleConstructReplacement182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructReplacement189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__0_in_ruleConstructReplacement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityAdjustment_in_entryRuleMultiplicityAdjustment242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityAdjustment249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__0_in_ruleMultiplicityAdjustment275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleReplacement_in_entryRuleRuleReplacement302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleReplacement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__0_in_ruleRuleReplacement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0_in_ruleQID395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_entryRuleConstruct0484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct0491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group__0_in_ruleConstruct0517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_entryRuleConstruct1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group__0_in_ruleConstruct1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_entryRuleConstruct2604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Alternatives_in_ruleConstruct2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct3_in_entryRuleConstruct3664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group__0_in_ruleConstruct3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct4_in_entryRuleConstruct4724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Alternatives_in_ruleConstruct4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__ConstructReplacementsAssignment_7_1_0_in_rule__Apply__Alternatives_7_1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__RuleReplacementsAssignment_7_1_1_in_rule__Apply__Alternatives_7_1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__MultiplicityAdjustmentsAssignment_7_1_2_in_rule__Apply__Alternatives_7_1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__0_in_rule__Construct2__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__0_in_rule__Construct2__Alternatives880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct3_in_rule__Construct2__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__0_in_rule__Construct4__Alternatives930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_1__0_in_rule__Construct4__Alternatives948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_2__0_in_rule__Construct4__Alternatives966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_3__0_in_rule__Construct4__Alternatives984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__0_in_rule__Construct4__Alternatives1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__01033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__01036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__11094 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Apply__Group__2_in_rule__Apply__Group__11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__TargetAssignment_1_in_rule__Apply__Group__1__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__2__Impl_in_rule__Apply__Group__21154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Apply__Group__3_in_rule__Apply__Group__21157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Apply__Group__2__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__3__Impl_in_rule__Apply__Group__31216 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Apply__Group__4_in_rule__Apply__Group__31219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__MinAssignment_3_in_rule__Apply__Group__3__Impl1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__4__Impl_in_rule__Apply__Group__41276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Apply__Group__5_in_rule__Apply__Group__41279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Apply__Group__4__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__5__Impl_in_rule__Apply__Group__51338 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Apply__Group__6_in_rule__Apply__Group__51341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__MaxAssignment_5_in_rule__Apply__Group__5__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__6__Impl_in_rule__Apply__Group__61398 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Apply__Group__7_in_rule__Apply__Group__61401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Apply__Group__6__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__7__Impl_in_rule__Apply__Group__71460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__0_in_rule__Apply__Group__7__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__0__Impl_in_rule__Apply__Group_7__01534 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__1_in_rule__Apply__Group_7__01537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Apply__Group_7__0__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__1__Impl_in_rule__Apply__Group_7__11596 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__2_in_rule__Apply__Group_7__11599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Alternatives_7_1_in_rule__Apply__Group_7__1__Impl1626 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__2__Impl_in_rule__Apply__Group_7__21657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Apply__Group_7__2__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__0__Impl_in_rule__ConstructReplacement__Group__01722 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__1_in_rule__ConstructReplacement__Group__01725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ConstructReplacement__Group__0__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__1__Impl_in_rule__ConstructReplacement__Group__11784 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__2_in_rule__ConstructReplacement__Group__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__SelectorAssignment_1_in_rule__ConstructReplacement__Group__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__2__Impl_in_rule__ConstructReplacement__Group__21844 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__3_in_rule__ConstructReplacement__Group__21847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group_2__0_in_rule__ConstructReplacement__Group__2__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__3__Impl_in_rule__ConstructReplacement__Group__31905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__4_in_rule__ConstructReplacement__Group__31908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ConstructReplacement__Group__3__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__4__Impl_in_rule__ConstructReplacement__Group__41967 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__5_in_rule__ConstructReplacement__Group__41970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__TargetAssignment_4_in_rule__ConstructReplacement__Group__4__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__5__Impl_in_rule__ConstructReplacement__Group__52027 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__6_in_rule__ConstructReplacement__Group__52030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConstructReplacement__Group__5__Impl2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group__6__Impl_in_rule__ConstructReplacement__Group__62089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__ReplacementAssignment_6_in_rule__ConstructReplacement__Group__6__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group_2__0__Impl_in_rule__ConstructReplacement__Group_2__02160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group_2__1_in_rule__ConstructReplacement__Group_2__02163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__PositionedAssignment_2_0_in_rule__ConstructReplacement__Group_2__0__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__Group_2__1__Impl_in_rule__ConstructReplacement__Group_2__12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructReplacement__PositionAssignment_2_1_in_rule__ConstructReplacement__Group_2__1__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__0__Impl_in_rule__MultiplicityAdjustment__Group__02281 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__1_in_rule__MultiplicityAdjustment__Group__02284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MultiplicityAdjustment__Group__0__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__1__Impl_in_rule__MultiplicityAdjustment__Group__12343 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__2_in_rule__MultiplicityAdjustment__Group__12346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MultiplicityAdjustment__Group__1__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__2__Impl_in_rule__MultiplicityAdjustment__Group__22405 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__3_in_rule__MultiplicityAdjustment__Group__22408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group_2__0_in_rule__MultiplicityAdjustment__Group__2__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__3__Impl_in_rule__MultiplicityAdjustment__Group__32466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__4_in_rule__MultiplicityAdjustment__Group__32469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MultiplicityAdjustment__Group__3__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__4__Impl_in_rule__MultiplicityAdjustment__Group__42528 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__5_in_rule__MultiplicityAdjustment__Group__42531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__TargetAssignment_4_in_rule__MultiplicityAdjustment__Group__4__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__5__Impl_in_rule__MultiplicityAdjustment__Group__52588 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__6_in_rule__MultiplicityAdjustment__Group__52591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MultiplicityAdjustment__Group__5__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__6__Impl_in_rule__MultiplicityAdjustment__Group__62650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__7_in_rule__MultiplicityAdjustment__Group__62653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultiplicityAdjustment__Group__6__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__7__Impl_in_rule__MultiplicityAdjustment__Group__72712 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__8_in_rule__MultiplicityAdjustment__Group__72715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__MinAssignment_7_in_rule__MultiplicityAdjustment__Group__7__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__8__Impl_in_rule__MultiplicityAdjustment__Group__82772 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__9_in_rule__MultiplicityAdjustment__Group__82775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group_8__0_in_rule__MultiplicityAdjustment__Group__8__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group__9__Impl_in_rule__MultiplicityAdjustment__Group__92833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MultiplicityAdjustment__Group__9__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group_2__0__Impl_in_rule__MultiplicityAdjustment__Group_2__02912 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group_2__1_in_rule__MultiplicityAdjustment__Group_2__02915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__PositionedAssignment_2_0_in_rule__MultiplicityAdjustment__Group_2__0__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group_2__1__Impl_in_rule__MultiplicityAdjustment__Group_2__12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__PositionAssignment_2_1_in_rule__MultiplicityAdjustment__Group_2__1__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group_8__0__Impl_in_rule__MultiplicityAdjustment__Group_8__03033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group_8__1_in_rule__MultiplicityAdjustment__Group_8__03036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__UpperBoundedAssignment_8_0_in_rule__MultiplicityAdjustment__Group_8__0__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__Group_8__1__Impl_in_rule__MultiplicityAdjustment__Group_8__13093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityAdjustment__MaxAssignment_8_1_in_rule__MultiplicityAdjustment__Group_8__1__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__0__Impl_in_rule__RuleReplacement__Group__03154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__1_in_rule__RuleReplacement__Group__03157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RuleReplacement__Group__0__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__1__Impl_in_rule__RuleReplacement__Group__13216 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__2_in_rule__RuleReplacement__Group__13219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__TargetAssignment_1_in_rule__RuleReplacement__Group__1__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__2__Impl_in_rule__RuleReplacement__Group__23276 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__3_in_rule__RuleReplacement__Group__23279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RuleReplacement__Group__2__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__3__Impl_in_rule__RuleReplacement__Group__33338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__ReplacementAssignment_3_in_rule__RuleReplacement__Group__3__Impl3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__03403 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QID__Group__1_in_rule__QID__Group__03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__13462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl3489 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__03524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__03527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QID__Group_1__0__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03647 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13708 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__LexicalAssignment_1_in_rule__Definition__Group__1__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23769 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__23772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_2_in_rule__Definition__Group__2__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__33829 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__33832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definition__Group__3__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__43891 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__43894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__RhsAssignment_4_in_rule__Definition__Group__4__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__53951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Definition__Group__5__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group__0__Impl_in_rule__Construct0__Group__04022 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Construct0__Group__1_in_rule__Construct0__Group__04025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__Group__0__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group__1__Impl_in_rule__Construct0__Group__14081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__0_in_rule__Construct0__Group__1__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__0__Impl_in_rule__Construct0__Group_1__04143 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__1_in_rule__Construct0__Group_1__04146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__1__Impl_in_rule__Construct0__Group_1__14204 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__2_in_rule__Construct0__Group_1__14207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Construct0__Group_1__1__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__2__Impl_in_rule__Construct0__Group_1__24266 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__3_in_rule__Construct0__Group_1__24269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__OperandsAssignment_1_2_in_rule__Construct0__Group_1__2__Impl4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__3__Impl_in_rule__Construct0__Group_1__34326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1_3__0_in_rule__Construct0__Group_1__3__Impl4353 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1_3__0__Impl_in_rule__Construct0__Group_1_3__04392 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1_3__1_in_rule__Construct0__Group_1_3__04395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Construct0__Group_1_3__0__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1_3__1__Impl_in_rule__Construct0__Group_1_3__14454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__OperandsAssignment_1_3_1_in_rule__Construct0__Group_1_3__1__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group__0__Impl_in_rule__Construct1__Group__04515 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Construct1__Group__1_in_rule__Construct1__Group__04518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__Group__0__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group__1__Impl_in_rule__Construct1__Group__14574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__0_in_rule__Construct1__Group__1__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__0__Impl_in_rule__Construct1__Group_1__04636 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__1_in_rule__Construct1__Group_1__04639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__1__Impl_in_rule__Construct1__Group_1__14697 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__2_in_rule__Construct1__Group_1__14700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__OperandsAssignment_1_1_in_rule__Construct1__Group_1__1__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__2__Impl_in_rule__Construct1__Group_1__24757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__OperandsAssignment_1_2_in_rule__Construct1__Group_1__2__Impl4784 = new BitSet(new long[]{0x00000000062008D2L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__0__Impl_in_rule__Construct2__Group_0__04821 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__1_in_rule__Construct2__Group_0__04824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__1__Impl_in_rule__Construct2__Group_0__14882 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__2_in_rule__Construct2__Group_0__14885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Construct2__Group_0__1__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__2__Impl_in_rule__Construct2__Group_0__24944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__OperandAssignment_0_2_in_rule__Construct2__Group_0__2__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__0__Impl_in_rule__Construct2__Group_1__05007 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__1_in_rule__Construct2__Group_1__05010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__1__Impl_in_rule__Construct2__Group_1__15068 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__2_in_rule__Construct2__Group_1__15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Construct2__Group_1__1__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__2__Impl_in_rule__Construct2__Group_1__25130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__OperandAssignment_1_2_in_rule__Construct2__Group_1__2__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group__0__Impl_in_rule__Construct3__Group__05193 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Construct3__Group__1_in_rule__Construct3__Group__05196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct4_in_rule__Construct3__Group__0__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group__1__Impl_in_rule__Construct3__Group__15252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__0_in_rule__Construct3__Group__1__Impl5279 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__0__Impl_in_rule__Construct3__Group_1__05314 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__1_in_rule__Construct3__Group_1__05317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__1__Impl_in_rule__Construct3__Group_1__15375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__2_in_rule__Construct3__Group_1__15378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Construct3__Group_1__1__Impl5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__2__Impl_in_rule__Construct3__Group_1__25437 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__3_in_rule__Construct3__Group_1__25440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__MinAssignment_1_2_in_rule__Construct3__Group_1__2__Impl5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__3__Impl_in_rule__Construct3__Group_1__35497 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__4_in_rule__Construct3__Group_1__35500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1_3__0_in_rule__Construct3__Group_1__3__Impl5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__4__Impl_in_rule__Construct3__Group_1__45558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Construct3__Group_1__4__Impl5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1_3__0__Impl_in_rule__Construct3__Group_1_3__05627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1_3__1_in_rule__Construct3__Group_1_3__05630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__UpperBoundedAssignment_1_3_0_in_rule__Construct3__Group_1_3__0__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1_3__1__Impl_in_rule__Construct3__Group_1_3__15687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__MaxAssignment_1_3_1_in_rule__Construct3__Group_1_3__1__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__0__Impl_in_rule__Construct4__Group_0__05748 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__1_in_rule__Construct4__Group_0__05751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__1__Impl_in_rule__Construct4__Group_0__15809 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__2_in_rule__Construct4__Group_0__15812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__MinAssignment_0_1_in_rule__Construct4__Group_0__1__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__2__Impl_in_rule__Construct4__Group_0__25869 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__3_in_rule__Construct4__Group_0__25872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Construct4__Group_0__2__Impl5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__3__Impl_in_rule__Construct4__Group_0__35931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__MaxAssignment_0_3_in_rule__Construct4__Group_0__3__Impl5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_1__0__Impl_in_rule__Construct4__Group_1__05996 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Construct4__Group_1__1_in_rule__Construct4__Group_1__05999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_1__1__Impl_in_rule__Construct4__Group_1__16057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__ValueAssignment_1_1_in_rule__Construct4__Group_1__1__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_2__0__Impl_in_rule__Construct4__Group_2__06118 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Construct4__Group_2__1_in_rule__Construct4__Group_2__06121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_2__1__Impl_in_rule__Construct4__Group_2__16179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Construct4__Group_2__1__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_3__0__Impl_in_rule__Construct4__Group_3__06242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Construct4__Group_3__1_in_rule__Construct4__Group_3__06245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_3__1__Impl_in_rule__Construct4__Group_3__16303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__TargetAssignment_3_1_in_rule__Construct4__Group_3__1__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__0__Impl_in_rule__Construct4__Group_4__06364 = new BitSet(new long[]{0x00000000062008D0L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__1_in_rule__Construct4__Group_4__06367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Construct4__Group_4__0__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__1__Impl_in_rule__Construct4__Group_4__16426 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__2_in_rule__Construct4__Group_4__16429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__Construct4__Group_4__1__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__2__Impl_in_rule__Construct4__Group_4__26485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Construct4__Group_4__2__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_rule__Model__ApplicationsAssignment6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_rule__Apply__TargetAssignment_16590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Apply__MinAssignment_36625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Apply__MaxAssignment_56656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructReplacement_in_rule__Apply__ConstructReplacementsAssignment_7_1_06687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleReplacement_in_rule__Apply__RuleReplacementsAssignment_7_1_16718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityAdjustment_in_rule__Apply__MultiplicityAdjustmentsAssignment_7_1_26749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__ConstructReplacement__SelectorAssignment_16780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ConstructReplacement__PositionedAssignment_2_06816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConstructReplacement__PositionAssignment_2_16855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstructReplacement__TargetAssignment_46890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__ConstructReplacement__ReplacementAssignment_66925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MultiplicityAdjustment__PositionedAssignment_2_06961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MultiplicityAdjustment__PositionAssignment_2_17000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiplicityAdjustment__TargetAssignment_47035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MultiplicityAdjustment__MinAssignment_77070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MultiplicityAdjustment__UpperBoundedAssignment_8_07106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MultiplicityAdjustment__MaxAssignment_8_17145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleReplacement__TargetAssignment_17180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__RuleReplacement__ReplacementAssignment_37215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Definition__LexicalAssignment_17252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_27291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__Definition__RhsAssignment_47322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_27353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_3_17384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_17415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_27446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_0_27477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_1_27508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Construct3__MinAssignment_1_27539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Construct3__UpperBoundedAssignment_1_3_07575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Construct3__MaxAssignment_1_3_17614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__Construct4__MinAssignment_0_17645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__Construct4__MaxAssignment_0_37676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Construct4__ValueAssignment_1_17707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Construct4__TargetAssignment_3_17738 = new BitSet(new long[]{0x0000000000000002L});

}