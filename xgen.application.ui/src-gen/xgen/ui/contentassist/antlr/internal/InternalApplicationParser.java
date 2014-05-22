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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_CHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'('", "'..'", "')'", "'{'", "'}'", "'replace'", "'in'", "'with'", "'.'", "':'", "';'", "'|'", "'!'", "'->'", "'/'", "'lexical'", "','"
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
    public static final int RULE_INT=5;
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


    // $ANTLR start "entryRuleCallReplacement"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:116:1: entryRuleCallReplacement : ruleCallReplacement EOF ;
    public final void entryRuleCallReplacement() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:117:1: ( ruleCallReplacement EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:118:1: ruleCallReplacement EOF
            {
             before(grammarAccess.getCallReplacementRule()); 
            pushFollow(FOLLOW_ruleCallReplacement_in_entryRuleCallReplacement182);
            ruleCallReplacement();

            state._fsp--;

             after(grammarAccess.getCallReplacementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallReplacement189); 

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
    // $ANTLR end "entryRuleCallReplacement"


    // $ANTLR start "ruleCallReplacement"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:125:1: ruleCallReplacement : ( ( rule__CallReplacement__Group__0 ) ) ;
    public final void ruleCallReplacement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:129:2: ( ( ( rule__CallReplacement__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:130:1: ( ( rule__CallReplacement__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:130:1: ( ( rule__CallReplacement__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:131:1: ( rule__CallReplacement__Group__0 )
            {
             before(grammarAccess.getCallReplacementAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:132:1: ( rule__CallReplacement__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:132:2: rule__CallReplacement__Group__0
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group__0_in_ruleCallReplacement215);
            rule__CallReplacement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallReplacementAccess().getGroup()); 

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
    // $ANTLR end "ruleCallReplacement"


    // $ANTLR start "entryRuleRuleReplacement"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:144:1: entryRuleRuleReplacement : ruleRuleReplacement EOF ;
    public final void entryRuleRuleReplacement() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:145:1: ( ruleRuleReplacement EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:146:1: ruleRuleReplacement EOF
            {
             before(grammarAccess.getRuleReplacementRule()); 
            pushFollow(FOLLOW_ruleRuleReplacement_in_entryRuleRuleReplacement242);
            ruleRuleReplacement();

            state._fsp--;

             after(grammarAccess.getRuleReplacementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleReplacement249); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:153:1: ruleRuleReplacement : ( ( rule__RuleReplacement__Group__0 ) ) ;
    public final void ruleRuleReplacement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:157:2: ( ( ( rule__RuleReplacement__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:158:1: ( ( rule__RuleReplacement__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:158:1: ( ( rule__RuleReplacement__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:159:1: ( rule__RuleReplacement__Group__0 )
            {
             before(grammarAccess.getRuleReplacementAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:160:1: ( rule__RuleReplacement__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:160:2: rule__RuleReplacement__Group__0
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__0_in_ruleRuleReplacement275);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:172:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:173:1: ( ruleQID EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:174:1: ruleQID EOF
            {
             before(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID302);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getQIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID309); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:181:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:185:2: ( ( ( rule__QID__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:186:1: ( ( rule__QID__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:186:1: ( ( rule__QID__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:187:1: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:188:1: ( rule__QID__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:188:2: rule__QID__Group__0
            {
            pushFollow(FOLLOW_rule__QID__Group__0_in_ruleQID335);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:202:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:203:1: ( ruleDefinition EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:204:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition364);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition371); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:211:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:215:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:216:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:216:1: ( ( rule__Definition__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:217:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:218:1: ( rule__Definition__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:218:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition397);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:230:1: entryRuleConstruct0 : ruleConstruct0 EOF ;
    public final void entryRuleConstruct0() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:231:1: ( ruleConstruct0 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:232:1: ruleConstruct0 EOF
            {
             before(grammarAccess.getConstruct0Rule()); 
            pushFollow(FOLLOW_ruleConstruct0_in_entryRuleConstruct0424);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getConstruct0Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct0431); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:239:1: ruleConstruct0 : ( ( rule__Construct0__Group__0 ) ) ;
    public final void ruleConstruct0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:243:2: ( ( ( rule__Construct0__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:244:1: ( ( rule__Construct0__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:244:1: ( ( rule__Construct0__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:245:1: ( rule__Construct0__Group__0 )
            {
             before(grammarAccess.getConstruct0Access().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:246:1: ( rule__Construct0__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:246:2: rule__Construct0__Group__0
            {
            pushFollow(FOLLOW_rule__Construct0__Group__0_in_ruleConstruct0457);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:258:1: entryRuleConstruct1 : ruleConstruct1 EOF ;
    public final void entryRuleConstruct1() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:259:1: ( ruleConstruct1 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:260:1: ruleConstruct1 EOF
            {
             before(grammarAccess.getConstruct1Rule()); 
            pushFollow(FOLLOW_ruleConstruct1_in_entryRuleConstruct1484);
            ruleConstruct1();

            state._fsp--;

             after(grammarAccess.getConstruct1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct1491); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:267:1: ruleConstruct1 : ( ( rule__Construct1__Group__0 ) ) ;
    public final void ruleConstruct1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:271:2: ( ( ( rule__Construct1__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:272:1: ( ( rule__Construct1__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:272:1: ( ( rule__Construct1__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:273:1: ( rule__Construct1__Group__0 )
            {
             before(grammarAccess.getConstruct1Access().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:274:1: ( rule__Construct1__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:274:2: rule__Construct1__Group__0
            {
            pushFollow(FOLLOW_rule__Construct1__Group__0_in_ruleConstruct1517);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:286:1: entryRuleConstruct2 : ruleConstruct2 EOF ;
    public final void entryRuleConstruct2() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:287:1: ( ruleConstruct2 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:288:1: ruleConstruct2 EOF
            {
             before(grammarAccess.getConstruct2Rule()); 
            pushFollow(FOLLOW_ruleConstruct2_in_entryRuleConstruct2544);
            ruleConstruct2();

            state._fsp--;

             after(grammarAccess.getConstruct2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct2551); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:295:1: ruleConstruct2 : ( ( rule__Construct2__Alternatives ) ) ;
    public final void ruleConstruct2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:299:2: ( ( ( rule__Construct2__Alternatives ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:300:1: ( ( rule__Construct2__Alternatives ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:300:1: ( ( rule__Construct2__Alternatives ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:301:1: ( rule__Construct2__Alternatives )
            {
             before(grammarAccess.getConstruct2Access().getAlternatives()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:302:1: ( rule__Construct2__Alternatives )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:302:2: rule__Construct2__Alternatives
            {
            pushFollow(FOLLOW_rule__Construct2__Alternatives_in_ruleConstruct2577);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:314:1: entryRuleConstruct3 : ruleConstruct3 EOF ;
    public final void entryRuleConstruct3() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:315:1: ( ruleConstruct3 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:316:1: ruleConstruct3 EOF
            {
             before(grammarAccess.getConstruct3Rule()); 
            pushFollow(FOLLOW_ruleConstruct3_in_entryRuleConstruct3604);
            ruleConstruct3();

            state._fsp--;

             after(grammarAccess.getConstruct3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct3611); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:323:1: ruleConstruct3 : ( ( rule__Construct3__Group__0 ) ) ;
    public final void ruleConstruct3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:327:2: ( ( ( rule__Construct3__Group__0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:328:1: ( ( rule__Construct3__Group__0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:328:1: ( ( rule__Construct3__Group__0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:329:1: ( rule__Construct3__Group__0 )
            {
             before(grammarAccess.getConstruct3Access().getGroup()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:330:1: ( rule__Construct3__Group__0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:330:2: rule__Construct3__Group__0
            {
            pushFollow(FOLLOW_rule__Construct3__Group__0_in_ruleConstruct3637);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:342:1: entryRuleConstruct4 : ruleConstruct4 EOF ;
    public final void entryRuleConstruct4() throws RecognitionException {
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:343:1: ( ruleConstruct4 EOF )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:344:1: ruleConstruct4 EOF
            {
             before(grammarAccess.getConstruct4Rule()); 
            pushFollow(FOLLOW_ruleConstruct4_in_entryRuleConstruct4664);
            ruleConstruct4();

            state._fsp--;

             after(grammarAccess.getConstruct4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct4671); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:351:1: ruleConstruct4 : ( ( rule__Construct4__Alternatives ) ) ;
    public final void ruleConstruct4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:355:2: ( ( ( rule__Construct4__Alternatives ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:356:1: ( ( rule__Construct4__Alternatives ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:356:1: ( ( rule__Construct4__Alternatives ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:357:1: ( rule__Construct4__Alternatives )
            {
             before(grammarAccess.getConstruct4Access().getAlternatives()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:358:1: ( rule__Construct4__Alternatives )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:358:2: rule__Construct4__Alternatives
            {
            pushFollow(FOLLOW_rule__Construct4__Alternatives_in_ruleConstruct4697);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:370:1: rule__Apply__Alternatives_7_1 : ( ( ( rule__Apply__CallReplacementsAssignment_7_1_0 ) ) | ( ( rule__Apply__RuleReplacementsAssignment_7_1_1 ) ) );
    public final void rule__Apply__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:374:1: ( ( ( rule__Apply__CallReplacementsAssignment_7_1_0 ) ) | ( ( rule__Apply__RuleReplacementsAssignment_7_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==17||LA2_2==25) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==18) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:375:1: ( ( rule__Apply__CallReplacementsAssignment_7_1_0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:375:1: ( ( rule__Apply__CallReplacementsAssignment_7_1_0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:376:1: ( rule__Apply__CallReplacementsAssignment_7_1_0 )
                    {
                     before(grammarAccess.getApplyAccess().getCallReplacementsAssignment_7_1_0()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:377:1: ( rule__Apply__CallReplacementsAssignment_7_1_0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:377:2: rule__Apply__CallReplacementsAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_rule__Apply__CallReplacementsAssignment_7_1_0_in_rule__Apply__Alternatives_7_1733);
                    rule__Apply__CallReplacementsAssignment_7_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplyAccess().getCallReplacementsAssignment_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:381:6: ( ( rule__Apply__RuleReplacementsAssignment_7_1_1 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:381:6: ( ( rule__Apply__RuleReplacementsAssignment_7_1_1 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:382:1: ( rule__Apply__RuleReplacementsAssignment_7_1_1 )
                    {
                     before(grammarAccess.getApplyAccess().getRuleReplacementsAssignment_7_1_1()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:383:1: ( rule__Apply__RuleReplacementsAssignment_7_1_1 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:383:2: rule__Apply__RuleReplacementsAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_rule__Apply__RuleReplacementsAssignment_7_1_1_in_rule__Apply__Alternatives_7_1751);
                    rule__Apply__RuleReplacementsAssignment_7_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplyAccess().getRuleReplacementsAssignment_7_1_1()); 

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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:392:1: rule__Construct2__Alternatives : ( ( ( rule__Construct2__Group_0__0 ) ) | ( ( rule__Construct2__Group_1__0 ) ) | ( ruleConstruct3 ) );
    public final void rule__Construct2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:396:1: ( ( ( rule__Construct2__Group_0__0 ) ) | ( ( rule__Construct2__Group_1__0 ) ) | ( ruleConstruct3 ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_CHAR:
            case RULE_STRING:
            case 11:
            case 19:
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
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:397:1: ( ( rule__Construct2__Group_0__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:397:1: ( ( rule__Construct2__Group_0__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:398:1: ( rule__Construct2__Group_0__0 )
                    {
                     before(grammarAccess.getConstruct2Access().getGroup_0()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:399:1: ( rule__Construct2__Group_0__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:399:2: rule__Construct2__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Construct2__Group_0__0_in_rule__Construct2__Alternatives784);
                    rule__Construct2__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct2Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:403:6: ( ( rule__Construct2__Group_1__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:403:6: ( ( rule__Construct2__Group_1__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:404:1: ( rule__Construct2__Group_1__0 )
                    {
                     before(grammarAccess.getConstruct2Access().getGroup_1()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:405:1: ( rule__Construct2__Group_1__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:405:2: rule__Construct2__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Construct2__Group_1__0_in_rule__Construct2__Alternatives802);
                    rule__Construct2__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct2Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:409:6: ( ruleConstruct3 )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:409:6: ( ruleConstruct3 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:410:1: ruleConstruct3
                    {
                     before(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstruct3_in_rule__Construct2__Alternatives820);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:420:1: rule__Construct4__Alternatives : ( ( ( rule__Construct4__Group_0__0 ) ) | ( ( rule__Construct4__Group_1__0 ) ) | ( ( rule__Construct4__Group_2__0 ) ) | ( ( rule__Construct4__Group_3__0 ) ) | ( ( rule__Construct4__Group_4__0 ) ) );
    public final void rule__Construct4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:424:1: ( ( ( rule__Construct4__Group_0__0 ) ) | ( ( rule__Construct4__Group_1__0 ) ) | ( ( rule__Construct4__Group_2__0 ) ) | ( ( rule__Construct4__Group_3__0 ) ) | ( ( rule__Construct4__Group_4__0 ) ) )
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
            case 19:
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
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:425:1: ( ( rule__Construct4__Group_0__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:425:1: ( ( rule__Construct4__Group_0__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:426:1: ( rule__Construct4__Group_0__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_0()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:427:1: ( rule__Construct4__Group_0__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:427:2: rule__Construct4__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_0__0_in_rule__Construct4__Alternatives852);
                    rule__Construct4__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:431:6: ( ( rule__Construct4__Group_1__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:431:6: ( ( rule__Construct4__Group_1__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:432:1: ( rule__Construct4__Group_1__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_1()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:433:1: ( rule__Construct4__Group_1__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:433:2: rule__Construct4__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_1__0_in_rule__Construct4__Alternatives870);
                    rule__Construct4__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:437:6: ( ( rule__Construct4__Group_2__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:437:6: ( ( rule__Construct4__Group_2__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:438:1: ( rule__Construct4__Group_2__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_2()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:439:1: ( rule__Construct4__Group_2__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:439:2: rule__Construct4__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_2__0_in_rule__Construct4__Alternatives888);
                    rule__Construct4__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:443:6: ( ( rule__Construct4__Group_3__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:443:6: ( ( rule__Construct4__Group_3__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:444:1: ( rule__Construct4__Group_3__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_3()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:445:1: ( rule__Construct4__Group_3__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:445:2: rule__Construct4__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_3__0_in_rule__Construct4__Alternatives906);
                    rule__Construct4__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:449:6: ( ( rule__Construct4__Group_4__0 ) )
                    {
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:449:6: ( ( rule__Construct4__Group_4__0 ) )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:450:1: ( rule__Construct4__Group_4__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_4()); 
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:451:1: ( rule__Construct4__Group_4__0 )
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:451:2: rule__Construct4__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Construct4__Group_4__0_in_rule__Construct4__Alternatives924);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:462:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:466:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:467:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__0955);
            rule__Apply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__0958);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:474:1: rule__Apply__Group__0__Impl : ( () ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:478:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:479:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:479:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:480:1: ()
            {
             before(grammarAccess.getApplyAccess().getApplicationAction_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:481:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:483:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:493:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl rule__Apply__Group__2 ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:497:1: ( rule__Apply__Group__1__Impl rule__Apply__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:498:2: rule__Apply__Group__1__Impl rule__Apply__Group__2
            {
            pushFollow(FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__11016);
            rule__Apply__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__2_in_rule__Apply__Group__11019);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:505:1: rule__Apply__Group__1__Impl : ( ( rule__Apply__TargetAssignment_1 ) ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:509:1: ( ( ( rule__Apply__TargetAssignment_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:510:1: ( ( rule__Apply__TargetAssignment_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:510:1: ( ( rule__Apply__TargetAssignment_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:511:1: ( rule__Apply__TargetAssignment_1 )
            {
             before(grammarAccess.getApplyAccess().getTargetAssignment_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:512:1: ( rule__Apply__TargetAssignment_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:512:2: rule__Apply__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__Apply__TargetAssignment_1_in_rule__Apply__Group__1__Impl1046);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:522:1: rule__Apply__Group__2 : rule__Apply__Group__2__Impl rule__Apply__Group__3 ;
    public final void rule__Apply__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:526:1: ( rule__Apply__Group__2__Impl rule__Apply__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:527:2: rule__Apply__Group__2__Impl rule__Apply__Group__3
            {
            pushFollow(FOLLOW_rule__Apply__Group__2__Impl_in_rule__Apply__Group__21076);
            rule__Apply__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__3_in_rule__Apply__Group__21079);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:534:1: rule__Apply__Group__2__Impl : ( '(' ) ;
    public final void rule__Apply__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:538:1: ( ( '(' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:539:1: ( '(' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:539:1: ( '(' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:540:1: '('
            {
             before(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__Apply__Group__2__Impl1107); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:553:1: rule__Apply__Group__3 : rule__Apply__Group__3__Impl rule__Apply__Group__4 ;
    public final void rule__Apply__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:557:1: ( rule__Apply__Group__3__Impl rule__Apply__Group__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:558:2: rule__Apply__Group__3__Impl rule__Apply__Group__4
            {
            pushFollow(FOLLOW_rule__Apply__Group__3__Impl_in_rule__Apply__Group__31138);
            rule__Apply__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__4_in_rule__Apply__Group__31141);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:565:1: rule__Apply__Group__3__Impl : ( ( rule__Apply__MinAssignment_3 ) ) ;
    public final void rule__Apply__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:569:1: ( ( ( rule__Apply__MinAssignment_3 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:570:1: ( ( rule__Apply__MinAssignment_3 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:570:1: ( ( rule__Apply__MinAssignment_3 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:571:1: ( rule__Apply__MinAssignment_3 )
            {
             before(grammarAccess.getApplyAccess().getMinAssignment_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:572:1: ( rule__Apply__MinAssignment_3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:572:2: rule__Apply__MinAssignment_3
            {
            pushFollow(FOLLOW_rule__Apply__MinAssignment_3_in_rule__Apply__Group__3__Impl1168);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:582:1: rule__Apply__Group__4 : rule__Apply__Group__4__Impl rule__Apply__Group__5 ;
    public final void rule__Apply__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:586:1: ( rule__Apply__Group__4__Impl rule__Apply__Group__5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:587:2: rule__Apply__Group__4__Impl rule__Apply__Group__5
            {
            pushFollow(FOLLOW_rule__Apply__Group__4__Impl_in_rule__Apply__Group__41198);
            rule__Apply__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__5_in_rule__Apply__Group__41201);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:594:1: rule__Apply__Group__4__Impl : ( '..' ) ;
    public final void rule__Apply__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:598:1: ( ( '..' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:599:1: ( '..' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:599:1: ( '..' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:600:1: '..'
            {
             before(grammarAccess.getApplyAccess().getFullStopFullStopKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Apply__Group__4__Impl1229); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:613:1: rule__Apply__Group__5 : rule__Apply__Group__5__Impl rule__Apply__Group__6 ;
    public final void rule__Apply__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:617:1: ( rule__Apply__Group__5__Impl rule__Apply__Group__6 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:618:2: rule__Apply__Group__5__Impl rule__Apply__Group__6
            {
            pushFollow(FOLLOW_rule__Apply__Group__5__Impl_in_rule__Apply__Group__51260);
            rule__Apply__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__6_in_rule__Apply__Group__51263);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:625:1: rule__Apply__Group__5__Impl : ( ( rule__Apply__MaxAssignment_5 ) ) ;
    public final void rule__Apply__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:629:1: ( ( ( rule__Apply__MaxAssignment_5 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:630:1: ( ( rule__Apply__MaxAssignment_5 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:630:1: ( ( rule__Apply__MaxAssignment_5 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:631:1: ( rule__Apply__MaxAssignment_5 )
            {
             before(grammarAccess.getApplyAccess().getMaxAssignment_5()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:632:1: ( rule__Apply__MaxAssignment_5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:632:2: rule__Apply__MaxAssignment_5
            {
            pushFollow(FOLLOW_rule__Apply__MaxAssignment_5_in_rule__Apply__Group__5__Impl1290);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:642:1: rule__Apply__Group__6 : rule__Apply__Group__6__Impl rule__Apply__Group__7 ;
    public final void rule__Apply__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:646:1: ( rule__Apply__Group__6__Impl rule__Apply__Group__7 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:647:2: rule__Apply__Group__6__Impl rule__Apply__Group__7
            {
            pushFollow(FOLLOW_rule__Apply__Group__6__Impl_in_rule__Apply__Group__61320);
            rule__Apply__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__7_in_rule__Apply__Group__61323);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:654:1: rule__Apply__Group__6__Impl : ( ')' ) ;
    public final void rule__Apply__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:658:1: ( ( ')' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:659:1: ( ')' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:659:1: ( ')' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:660:1: ')'
            {
             before(grammarAccess.getApplyAccess().getRightParenthesisKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Apply__Group__6__Impl1351); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:673:1: rule__Apply__Group__7 : rule__Apply__Group__7__Impl ;
    public final void rule__Apply__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:677:1: ( rule__Apply__Group__7__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:678:2: rule__Apply__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group__7__Impl_in_rule__Apply__Group__71382);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:684:1: rule__Apply__Group__7__Impl : ( ( rule__Apply__Group_7__0 )? ) ;
    public final void rule__Apply__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:688:1: ( ( ( rule__Apply__Group_7__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:689:1: ( ( rule__Apply__Group_7__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:689:1: ( ( rule__Apply__Group_7__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:690:1: ( rule__Apply__Group_7__0 )?
            {
             before(grammarAccess.getApplyAccess().getGroup_7()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:691:1: ( rule__Apply__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:691:2: rule__Apply__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Apply__Group_7__0_in_rule__Apply__Group__7__Impl1409);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:717:1: rule__Apply__Group_7__0 : rule__Apply__Group_7__0__Impl rule__Apply__Group_7__1 ;
    public final void rule__Apply__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:721:1: ( rule__Apply__Group_7__0__Impl rule__Apply__Group_7__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:722:2: rule__Apply__Group_7__0__Impl rule__Apply__Group_7__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_7__0__Impl_in_rule__Apply__Group_7__01456);
            rule__Apply__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_7__1_in_rule__Apply__Group_7__01459);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:729:1: rule__Apply__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Apply__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:733:1: ( ( '{' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:734:1: ( '{' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:734:1: ( '{' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:735:1: '{'
            {
             before(grammarAccess.getApplyAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,14,FOLLOW_14_in_rule__Apply__Group_7__0__Impl1487); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:748:1: rule__Apply__Group_7__1 : rule__Apply__Group_7__1__Impl rule__Apply__Group_7__2 ;
    public final void rule__Apply__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:752:1: ( rule__Apply__Group_7__1__Impl rule__Apply__Group_7__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:753:2: rule__Apply__Group_7__1__Impl rule__Apply__Group_7__2
            {
            pushFollow(FOLLOW_rule__Apply__Group_7__1__Impl_in_rule__Apply__Group_7__11518);
            rule__Apply__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_7__2_in_rule__Apply__Group_7__11521);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:760:1: rule__Apply__Group_7__1__Impl : ( ( rule__Apply__Alternatives_7_1 )* ) ;
    public final void rule__Apply__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:764:1: ( ( ( rule__Apply__Alternatives_7_1 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:765:1: ( ( rule__Apply__Alternatives_7_1 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:765:1: ( ( rule__Apply__Alternatives_7_1 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:766:1: ( rule__Apply__Alternatives_7_1 )*
            {
             before(grammarAccess.getApplyAccess().getAlternatives_7_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:767:1: ( rule__Apply__Alternatives_7_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:767:2: rule__Apply__Alternatives_7_1
            	    {
            	    pushFollow(FOLLOW_rule__Apply__Alternatives_7_1_in_rule__Apply__Group_7__1__Impl1548);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:777:1: rule__Apply__Group_7__2 : rule__Apply__Group_7__2__Impl ;
    public final void rule__Apply__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:781:1: ( rule__Apply__Group_7__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:782:2: rule__Apply__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_7__2__Impl_in_rule__Apply__Group_7__21579);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:788:1: rule__Apply__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Apply__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:792:1: ( ( '}' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:793:1: ( '}' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:793:1: ( '}' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:794:1: '}'
            {
             before(grammarAccess.getApplyAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,15,FOLLOW_15_in_rule__Apply__Group_7__2__Impl1607); 
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


    // $ANTLR start "rule__CallReplacement__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:813:1: rule__CallReplacement__Group__0 : rule__CallReplacement__Group__0__Impl rule__CallReplacement__Group__1 ;
    public final void rule__CallReplacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:817:1: ( rule__CallReplacement__Group__0__Impl rule__CallReplacement__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:818:2: rule__CallReplacement__Group__0__Impl rule__CallReplacement__Group__1
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group__0__Impl_in_rule__CallReplacement__Group__01644);
            rule__CallReplacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallReplacement__Group__1_in_rule__CallReplacement__Group__01647);
            rule__CallReplacement__Group__1();

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
    // $ANTLR end "rule__CallReplacement__Group__0"


    // $ANTLR start "rule__CallReplacement__Group__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:825:1: rule__CallReplacement__Group__0__Impl : ( 'replace' ) ;
    public final void rule__CallReplacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:829:1: ( ( 'replace' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:830:1: ( 'replace' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:830:1: ( 'replace' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:831:1: 'replace'
            {
             before(grammarAccess.getCallReplacementAccess().getReplaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__CallReplacement__Group__0__Impl1675); 
             after(grammarAccess.getCallReplacementAccess().getReplaceKeyword_0()); 

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
    // $ANTLR end "rule__CallReplacement__Group__0__Impl"


    // $ANTLR start "rule__CallReplacement__Group__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:844:1: rule__CallReplacement__Group__1 : rule__CallReplacement__Group__1__Impl rule__CallReplacement__Group__2 ;
    public final void rule__CallReplacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:848:1: ( rule__CallReplacement__Group__1__Impl rule__CallReplacement__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:849:2: rule__CallReplacement__Group__1__Impl rule__CallReplacement__Group__2
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group__1__Impl_in_rule__CallReplacement__Group__11706);
            rule__CallReplacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallReplacement__Group__2_in_rule__CallReplacement__Group__11709);
            rule__CallReplacement__Group__2();

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
    // $ANTLR end "rule__CallReplacement__Group__1"


    // $ANTLR start "rule__CallReplacement__Group__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:856:1: rule__CallReplacement__Group__1__Impl : ( ( rule__CallReplacement__SelectorAssignment_1 ) ) ;
    public final void rule__CallReplacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:860:1: ( ( ( rule__CallReplacement__SelectorAssignment_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:861:1: ( ( rule__CallReplacement__SelectorAssignment_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:861:1: ( ( rule__CallReplacement__SelectorAssignment_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:862:1: ( rule__CallReplacement__SelectorAssignment_1 )
            {
             before(grammarAccess.getCallReplacementAccess().getSelectorAssignment_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:863:1: ( rule__CallReplacement__SelectorAssignment_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:863:2: rule__CallReplacement__SelectorAssignment_1
            {
            pushFollow(FOLLOW_rule__CallReplacement__SelectorAssignment_1_in_rule__CallReplacement__Group__1__Impl1736);
            rule__CallReplacement__SelectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCallReplacementAccess().getSelectorAssignment_1()); 

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
    // $ANTLR end "rule__CallReplacement__Group__1__Impl"


    // $ANTLR start "rule__CallReplacement__Group__2"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:873:1: rule__CallReplacement__Group__2 : rule__CallReplacement__Group__2__Impl rule__CallReplacement__Group__3 ;
    public final void rule__CallReplacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:877:1: ( rule__CallReplacement__Group__2__Impl rule__CallReplacement__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:878:2: rule__CallReplacement__Group__2__Impl rule__CallReplacement__Group__3
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group__2__Impl_in_rule__CallReplacement__Group__21766);
            rule__CallReplacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallReplacement__Group__3_in_rule__CallReplacement__Group__21769);
            rule__CallReplacement__Group__3();

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
    // $ANTLR end "rule__CallReplacement__Group__2"


    // $ANTLR start "rule__CallReplacement__Group__2__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:885:1: rule__CallReplacement__Group__2__Impl : ( ( rule__CallReplacement__Group_2__0 )? ) ;
    public final void rule__CallReplacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:889:1: ( ( ( rule__CallReplacement__Group_2__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:890:1: ( ( rule__CallReplacement__Group_2__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:890:1: ( ( rule__CallReplacement__Group_2__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:891:1: ( rule__CallReplacement__Group_2__0 )?
            {
             before(grammarAccess.getCallReplacementAccess().getGroup_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:892:1: ( rule__CallReplacement__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:892:2: rule__CallReplacement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CallReplacement__Group_2__0_in_rule__CallReplacement__Group__2__Impl1796);
                    rule__CallReplacement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallReplacementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__CallReplacement__Group__2__Impl"


    // $ANTLR start "rule__CallReplacement__Group__3"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:902:1: rule__CallReplacement__Group__3 : rule__CallReplacement__Group__3__Impl rule__CallReplacement__Group__4 ;
    public final void rule__CallReplacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:906:1: ( rule__CallReplacement__Group__3__Impl rule__CallReplacement__Group__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:907:2: rule__CallReplacement__Group__3__Impl rule__CallReplacement__Group__4
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group__3__Impl_in_rule__CallReplacement__Group__31827);
            rule__CallReplacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallReplacement__Group__4_in_rule__CallReplacement__Group__31830);
            rule__CallReplacement__Group__4();

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
    // $ANTLR end "rule__CallReplacement__Group__3"


    // $ANTLR start "rule__CallReplacement__Group__3__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:914:1: rule__CallReplacement__Group__3__Impl : ( 'in' ) ;
    public final void rule__CallReplacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:918:1: ( ( 'in' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:919:1: ( 'in' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:919:1: ( 'in' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:920:1: 'in'
            {
             before(grammarAccess.getCallReplacementAccess().getInKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__CallReplacement__Group__3__Impl1858); 
             after(grammarAccess.getCallReplacementAccess().getInKeyword_3()); 

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
    // $ANTLR end "rule__CallReplacement__Group__3__Impl"


    // $ANTLR start "rule__CallReplacement__Group__4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:933:1: rule__CallReplacement__Group__4 : rule__CallReplacement__Group__4__Impl rule__CallReplacement__Group__5 ;
    public final void rule__CallReplacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:937:1: ( rule__CallReplacement__Group__4__Impl rule__CallReplacement__Group__5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:938:2: rule__CallReplacement__Group__4__Impl rule__CallReplacement__Group__5
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group__4__Impl_in_rule__CallReplacement__Group__41889);
            rule__CallReplacement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallReplacement__Group__5_in_rule__CallReplacement__Group__41892);
            rule__CallReplacement__Group__5();

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
    // $ANTLR end "rule__CallReplacement__Group__4"


    // $ANTLR start "rule__CallReplacement__Group__4__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:945:1: rule__CallReplacement__Group__4__Impl : ( ( rule__CallReplacement__TargetAssignment_4 ) ) ;
    public final void rule__CallReplacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:949:1: ( ( ( rule__CallReplacement__TargetAssignment_4 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:950:1: ( ( rule__CallReplacement__TargetAssignment_4 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:950:1: ( ( rule__CallReplacement__TargetAssignment_4 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:951:1: ( rule__CallReplacement__TargetAssignment_4 )
            {
             before(grammarAccess.getCallReplacementAccess().getTargetAssignment_4()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:952:1: ( rule__CallReplacement__TargetAssignment_4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:952:2: rule__CallReplacement__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__CallReplacement__TargetAssignment_4_in_rule__CallReplacement__Group__4__Impl1919);
            rule__CallReplacement__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCallReplacementAccess().getTargetAssignment_4()); 

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
    // $ANTLR end "rule__CallReplacement__Group__4__Impl"


    // $ANTLR start "rule__CallReplacement__Group__5"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:962:1: rule__CallReplacement__Group__5 : rule__CallReplacement__Group__5__Impl rule__CallReplacement__Group__6 ;
    public final void rule__CallReplacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:966:1: ( rule__CallReplacement__Group__5__Impl rule__CallReplacement__Group__6 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:967:2: rule__CallReplacement__Group__5__Impl rule__CallReplacement__Group__6
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group__5__Impl_in_rule__CallReplacement__Group__51949);
            rule__CallReplacement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallReplacement__Group__6_in_rule__CallReplacement__Group__51952);
            rule__CallReplacement__Group__6();

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
    // $ANTLR end "rule__CallReplacement__Group__5"


    // $ANTLR start "rule__CallReplacement__Group__5__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:974:1: rule__CallReplacement__Group__5__Impl : ( 'with' ) ;
    public final void rule__CallReplacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:978:1: ( ( 'with' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:979:1: ( 'with' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:979:1: ( 'with' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:980:1: 'with'
            {
             before(grammarAccess.getCallReplacementAccess().getWithKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__CallReplacement__Group__5__Impl1980); 
             after(grammarAccess.getCallReplacementAccess().getWithKeyword_5()); 

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
    // $ANTLR end "rule__CallReplacement__Group__5__Impl"


    // $ANTLR start "rule__CallReplacement__Group__6"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:993:1: rule__CallReplacement__Group__6 : rule__CallReplacement__Group__6__Impl ;
    public final void rule__CallReplacement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:997:1: ( rule__CallReplacement__Group__6__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:998:2: rule__CallReplacement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group__6__Impl_in_rule__CallReplacement__Group__62011);
            rule__CallReplacement__Group__6__Impl();

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
    // $ANTLR end "rule__CallReplacement__Group__6"


    // $ANTLR start "rule__CallReplacement__Group__6__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1004:1: rule__CallReplacement__Group__6__Impl : ( ( rule__CallReplacement__ReplacementAssignment_6 ) ) ;
    public final void rule__CallReplacement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1008:1: ( ( ( rule__CallReplacement__ReplacementAssignment_6 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1009:1: ( ( rule__CallReplacement__ReplacementAssignment_6 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1009:1: ( ( rule__CallReplacement__ReplacementAssignment_6 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1010:1: ( rule__CallReplacement__ReplacementAssignment_6 )
            {
             before(grammarAccess.getCallReplacementAccess().getReplacementAssignment_6()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1011:1: ( rule__CallReplacement__ReplacementAssignment_6 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1011:2: rule__CallReplacement__ReplacementAssignment_6
            {
            pushFollow(FOLLOW_rule__CallReplacement__ReplacementAssignment_6_in_rule__CallReplacement__Group__6__Impl2038);
            rule__CallReplacement__ReplacementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCallReplacementAccess().getReplacementAssignment_6()); 

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
    // $ANTLR end "rule__CallReplacement__Group__6__Impl"


    // $ANTLR start "rule__CallReplacement__Group_2__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1035:1: rule__CallReplacement__Group_2__0 : rule__CallReplacement__Group_2__0__Impl rule__CallReplacement__Group_2__1 ;
    public final void rule__CallReplacement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1039:1: ( rule__CallReplacement__Group_2__0__Impl rule__CallReplacement__Group_2__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1040:2: rule__CallReplacement__Group_2__0__Impl rule__CallReplacement__Group_2__1
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group_2__0__Impl_in_rule__CallReplacement__Group_2__02082);
            rule__CallReplacement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallReplacement__Group_2__1_in_rule__CallReplacement__Group_2__02085);
            rule__CallReplacement__Group_2__1();

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
    // $ANTLR end "rule__CallReplacement__Group_2__0"


    // $ANTLR start "rule__CallReplacement__Group_2__0__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1047:1: rule__CallReplacement__Group_2__0__Impl : ( ( rule__CallReplacement__PositionedAssignment_2_0 ) ) ;
    public final void rule__CallReplacement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1051:1: ( ( ( rule__CallReplacement__PositionedAssignment_2_0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1052:1: ( ( rule__CallReplacement__PositionedAssignment_2_0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1052:1: ( ( rule__CallReplacement__PositionedAssignment_2_0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1053:1: ( rule__CallReplacement__PositionedAssignment_2_0 )
            {
             before(grammarAccess.getCallReplacementAccess().getPositionedAssignment_2_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1054:1: ( rule__CallReplacement__PositionedAssignment_2_0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1054:2: rule__CallReplacement__PositionedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__CallReplacement__PositionedAssignment_2_0_in_rule__CallReplacement__Group_2__0__Impl2112);
            rule__CallReplacement__PositionedAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCallReplacementAccess().getPositionedAssignment_2_0()); 

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
    // $ANTLR end "rule__CallReplacement__Group_2__0__Impl"


    // $ANTLR start "rule__CallReplacement__Group_2__1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1064:1: rule__CallReplacement__Group_2__1 : rule__CallReplacement__Group_2__1__Impl ;
    public final void rule__CallReplacement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1068:1: ( rule__CallReplacement__Group_2__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1069:2: rule__CallReplacement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CallReplacement__Group_2__1__Impl_in_rule__CallReplacement__Group_2__12142);
            rule__CallReplacement__Group_2__1__Impl();

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
    // $ANTLR end "rule__CallReplacement__Group_2__1"


    // $ANTLR start "rule__CallReplacement__Group_2__1__Impl"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1075:1: rule__CallReplacement__Group_2__1__Impl : ( ( rule__CallReplacement__PositionAssignment_2_1 ) ) ;
    public final void rule__CallReplacement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1079:1: ( ( ( rule__CallReplacement__PositionAssignment_2_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1080:1: ( ( rule__CallReplacement__PositionAssignment_2_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1080:1: ( ( rule__CallReplacement__PositionAssignment_2_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1081:1: ( rule__CallReplacement__PositionAssignment_2_1 )
            {
             before(grammarAccess.getCallReplacementAccess().getPositionAssignment_2_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1082:1: ( rule__CallReplacement__PositionAssignment_2_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1082:2: rule__CallReplacement__PositionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CallReplacement__PositionAssignment_2_1_in_rule__CallReplacement__Group_2__1__Impl2169);
            rule__CallReplacement__PositionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCallReplacementAccess().getPositionAssignment_2_1()); 

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
    // $ANTLR end "rule__CallReplacement__Group_2__1__Impl"


    // $ANTLR start "rule__RuleReplacement__Group__0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1096:1: rule__RuleReplacement__Group__0 : rule__RuleReplacement__Group__0__Impl rule__RuleReplacement__Group__1 ;
    public final void rule__RuleReplacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1100:1: ( rule__RuleReplacement__Group__0__Impl rule__RuleReplacement__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1101:2: rule__RuleReplacement__Group__0__Impl rule__RuleReplacement__Group__1
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__0__Impl_in_rule__RuleReplacement__Group__02203);
            rule__RuleReplacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleReplacement__Group__1_in_rule__RuleReplacement__Group__02206);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1108:1: rule__RuleReplacement__Group__0__Impl : ( 'replace' ) ;
    public final void rule__RuleReplacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1112:1: ( ( 'replace' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1113:1: ( 'replace' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1113:1: ( 'replace' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1114:1: 'replace'
            {
             before(grammarAccess.getRuleReplacementAccess().getReplaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__RuleReplacement__Group__0__Impl2234); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1127:1: rule__RuleReplacement__Group__1 : rule__RuleReplacement__Group__1__Impl rule__RuleReplacement__Group__2 ;
    public final void rule__RuleReplacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1131:1: ( rule__RuleReplacement__Group__1__Impl rule__RuleReplacement__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1132:2: rule__RuleReplacement__Group__1__Impl rule__RuleReplacement__Group__2
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__1__Impl_in_rule__RuleReplacement__Group__12265);
            rule__RuleReplacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleReplacement__Group__2_in_rule__RuleReplacement__Group__12268);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1139:1: rule__RuleReplacement__Group__1__Impl : ( ( rule__RuleReplacement__TargetAssignment_1 ) ) ;
    public final void rule__RuleReplacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1143:1: ( ( ( rule__RuleReplacement__TargetAssignment_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1144:1: ( ( rule__RuleReplacement__TargetAssignment_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1144:1: ( ( rule__RuleReplacement__TargetAssignment_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1145:1: ( rule__RuleReplacement__TargetAssignment_1 )
            {
             before(grammarAccess.getRuleReplacementAccess().getTargetAssignment_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1146:1: ( rule__RuleReplacement__TargetAssignment_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1146:2: rule__RuleReplacement__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__RuleReplacement__TargetAssignment_1_in_rule__RuleReplacement__Group__1__Impl2295);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1156:1: rule__RuleReplacement__Group__2 : rule__RuleReplacement__Group__2__Impl rule__RuleReplacement__Group__3 ;
    public final void rule__RuleReplacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1160:1: ( rule__RuleReplacement__Group__2__Impl rule__RuleReplacement__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1161:2: rule__RuleReplacement__Group__2__Impl rule__RuleReplacement__Group__3
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__2__Impl_in_rule__RuleReplacement__Group__22325);
            rule__RuleReplacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleReplacement__Group__3_in_rule__RuleReplacement__Group__22328);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1168:1: rule__RuleReplacement__Group__2__Impl : ( 'with' ) ;
    public final void rule__RuleReplacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1172:1: ( ( 'with' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1173:1: ( 'with' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1173:1: ( 'with' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1174:1: 'with'
            {
             before(grammarAccess.getRuleReplacementAccess().getWithKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__RuleReplacement__Group__2__Impl2356); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1187:1: rule__RuleReplacement__Group__3 : rule__RuleReplacement__Group__3__Impl ;
    public final void rule__RuleReplacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1191:1: ( rule__RuleReplacement__Group__3__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1192:2: rule__RuleReplacement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RuleReplacement__Group__3__Impl_in_rule__RuleReplacement__Group__32387);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1198:1: rule__RuleReplacement__Group__3__Impl : ( ( rule__RuleReplacement__ReplacementAssignment_3 ) ) ;
    public final void rule__RuleReplacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1202:1: ( ( ( rule__RuleReplacement__ReplacementAssignment_3 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1203:1: ( ( rule__RuleReplacement__ReplacementAssignment_3 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1203:1: ( ( rule__RuleReplacement__ReplacementAssignment_3 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1204:1: ( rule__RuleReplacement__ReplacementAssignment_3 )
            {
             before(grammarAccess.getRuleReplacementAccess().getReplacementAssignment_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1205:1: ( rule__RuleReplacement__ReplacementAssignment_3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1205:2: rule__RuleReplacement__ReplacementAssignment_3
            {
            pushFollow(FOLLOW_rule__RuleReplacement__ReplacementAssignment_3_in_rule__RuleReplacement__Group__3__Impl2414);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1223:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1227:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1228:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__02452);
            rule__QID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QID__Group__1_in_rule__QID__Group__02455);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1235:1: rule__QID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1239:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1240:1: ( RULE_ID )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1240:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1241:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl2482); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1252:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1256:1: ( rule__QID__Group__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1257:2: rule__QID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__12511);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1263:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1267:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1268:1: ( ( rule__QID__Group_1__0 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1268:1: ( ( rule__QID__Group_1__0 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1269:1: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1270:1: ( rule__QID__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1270:2: rule__QID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl2538);
            	    rule__QID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1284:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1288:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1289:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__02573);
            rule__QID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__02576);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1296:1: rule__QID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1300:1: ( ( '.' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1301:1: ( '.' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1301:1: ( '.' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1302:1: '.'
            {
             before(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__QID__Group_1__0__Impl2604); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1315:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1319:1: ( rule__QID__Group_1__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1320:2: rule__QID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__12635);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1326:1: rule__QID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1330:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1331:1: ( RULE_ID )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1331:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1332:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl2662); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1348:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1352:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1353:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__02696);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__02699);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1360:1: rule__Definition__Group__0__Impl : ( () ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1364:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1365:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1365:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1366:1: ()
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAction_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1367:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1369:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1379:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1383:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1384:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__12757);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__12760);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1391:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__LexicalAssignment_1 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1395:1: ( ( ( rule__Definition__LexicalAssignment_1 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1396:1: ( ( rule__Definition__LexicalAssignment_1 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1396:1: ( ( rule__Definition__LexicalAssignment_1 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1397:1: ( rule__Definition__LexicalAssignment_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getLexicalAssignment_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1398:1: ( rule__Definition__LexicalAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1398:2: rule__Definition__LexicalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Definition__LexicalAssignment_1_in_rule__Definition__Group__1__Impl2787);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1408:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1412:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1413:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22818);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__22821);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1420:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__NameAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1424:1: ( ( ( rule__Definition__NameAssignment_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1425:1: ( ( rule__Definition__NameAssignment_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1425:1: ( ( rule__Definition__NameAssignment_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1426:1: ( rule__Definition__NameAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1427:1: ( rule__Definition__NameAssignment_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1427:2: rule__Definition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_2_in_rule__Definition__Group__2__Impl2848);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1437:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1441:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1442:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32878);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32881);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1449:1: rule__Definition__Group__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1453:1: ( ( ':' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1454:1: ( ':' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1454:1: ( ':' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1455:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Definition__Group__3__Impl2909); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1468:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1472:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1473:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42940);
            rule__Definition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42943);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1480:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__RhsAssignment_4 ) ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1484:1: ( ( ( rule__Definition__RhsAssignment_4 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1485:1: ( ( rule__Definition__RhsAssignment_4 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1485:1: ( ( rule__Definition__RhsAssignment_4 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1486:1: ( rule__Definition__RhsAssignment_4 )
            {
             before(grammarAccess.getDefinitionAccess().getRhsAssignment_4()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1487:1: ( rule__Definition__RhsAssignment_4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1487:2: rule__Definition__RhsAssignment_4
            {
            pushFollow(FOLLOW_rule__Definition__RhsAssignment_4_in_rule__Definition__Group__4__Impl2970);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1497:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1501:1: ( rule__Definition__Group__5__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1502:2: rule__Definition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__53000);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1508:1: rule__Definition__Group__5__Impl : ( ';' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1512:1: ( ( ';' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1513:1: ( ';' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1513:1: ( ';' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1514:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Definition__Group__5__Impl3028); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1539:1: rule__Construct0__Group__0 : rule__Construct0__Group__0__Impl rule__Construct0__Group__1 ;
    public final void rule__Construct0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1543:1: ( rule__Construct0__Group__0__Impl rule__Construct0__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1544:2: rule__Construct0__Group__0__Impl rule__Construct0__Group__1
            {
            pushFollow(FOLLOW_rule__Construct0__Group__0__Impl_in_rule__Construct0__Group__03071);
            rule__Construct0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group__1_in_rule__Construct0__Group__03074);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1551:1: rule__Construct0__Group__0__Impl : ( ruleConstruct1 ) ;
    public final void rule__Construct0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1555:1: ( ( ruleConstruct1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1556:1: ( ruleConstruct1 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1556:1: ( ruleConstruct1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1557:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstruct1_in_rule__Construct0__Group__0__Impl3101);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1568:1: rule__Construct0__Group__1 : rule__Construct0__Group__1__Impl ;
    public final void rule__Construct0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1572:1: ( rule__Construct0__Group__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1573:2: rule__Construct0__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct0__Group__1__Impl_in_rule__Construct0__Group__13130);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1579:1: rule__Construct0__Group__1__Impl : ( ( rule__Construct0__Group_1__0 )? ) ;
    public final void rule__Construct0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1583:1: ( ( ( rule__Construct0__Group_1__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1584:1: ( ( rule__Construct0__Group_1__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1584:1: ( ( rule__Construct0__Group_1__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1585:1: ( rule__Construct0__Group_1__0 )?
            {
             before(grammarAccess.getConstruct0Access().getGroup_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1586:1: ( rule__Construct0__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1586:2: rule__Construct0__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Construct0__Group_1__0_in_rule__Construct0__Group__1__Impl3157);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1600:1: rule__Construct0__Group_1__0 : rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1 ;
    public final void rule__Construct0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1604:1: ( rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1605:2: rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1__0__Impl_in_rule__Construct0__Group_1__03192);
            rule__Construct0__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group_1__1_in_rule__Construct0__Group_1__03195);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1612:1: rule__Construct0__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1616:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1617:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1617:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1618:1: ()
            {
             before(grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1619:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1621:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1631:1: rule__Construct0__Group_1__1 : rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2 ;
    public final void rule__Construct0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1635:1: ( rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1636:2: rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1__1__Impl_in_rule__Construct0__Group_1__13253);
            rule__Construct0__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group_1__2_in_rule__Construct0__Group_1__13256);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1643:1: rule__Construct0__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Construct0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1647:1: ( ( '|' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1648:1: ( '|' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1648:1: ( '|' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1649:1: '|'
            {
             before(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__Construct0__Group_1__1__Impl3284); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1662:1: rule__Construct0__Group_1__2 : rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3 ;
    public final void rule__Construct0__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1666:1: ( rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1667:2: rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1__2__Impl_in_rule__Construct0__Group_1__23315);
            rule__Construct0__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group_1__3_in_rule__Construct0__Group_1__23318);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1674:1: rule__Construct0__Group_1__2__Impl : ( ( rule__Construct0__OperandsAssignment_1_2 ) ) ;
    public final void rule__Construct0__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1678:1: ( ( ( rule__Construct0__OperandsAssignment_1_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1679:1: ( ( rule__Construct0__OperandsAssignment_1_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1679:1: ( ( rule__Construct0__OperandsAssignment_1_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1680:1: ( rule__Construct0__OperandsAssignment_1_2 )
            {
             before(grammarAccess.getConstruct0Access().getOperandsAssignment_1_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1681:1: ( rule__Construct0__OperandsAssignment_1_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1681:2: rule__Construct0__OperandsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Construct0__OperandsAssignment_1_2_in_rule__Construct0__Group_1__2__Impl3345);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1691:1: rule__Construct0__Group_1__3 : rule__Construct0__Group_1__3__Impl ;
    public final void rule__Construct0__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1695:1: ( rule__Construct0__Group_1__3__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1696:2: rule__Construct0__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1__3__Impl_in_rule__Construct0__Group_1__33375);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1702:1: rule__Construct0__Group_1__3__Impl : ( ( rule__Construct0__Group_1_3__0 )* ) ;
    public final void rule__Construct0__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1706:1: ( ( ( rule__Construct0__Group_1_3__0 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1707:1: ( ( rule__Construct0__Group_1_3__0 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1707:1: ( ( rule__Construct0__Group_1_3__0 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1708:1: ( rule__Construct0__Group_1_3__0 )*
            {
             before(grammarAccess.getConstruct0Access().getGroup_1_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1709:1: ( rule__Construct0__Group_1_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1709:2: rule__Construct0__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Construct0__Group_1_3__0_in_rule__Construct0__Group_1__3__Impl3402);
            	    rule__Construct0__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1727:1: rule__Construct0__Group_1_3__0 : rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1 ;
    public final void rule__Construct0__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1731:1: ( rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1732:2: rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1_3__0__Impl_in_rule__Construct0__Group_1_3__03441);
            rule__Construct0__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct0__Group_1_3__1_in_rule__Construct0__Group_1_3__03444);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1739:1: rule__Construct0__Group_1_3__0__Impl : ( '|' ) ;
    public final void rule__Construct0__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1743:1: ( ( '|' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1744:1: ( '|' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1744:1: ( '|' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1745:1: '|'
            {
             before(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Construct0__Group_1_3__0__Impl3472); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1758:1: rule__Construct0__Group_1_3__1 : rule__Construct0__Group_1_3__1__Impl ;
    public final void rule__Construct0__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1762:1: ( rule__Construct0__Group_1_3__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1763:2: rule__Construct0__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct0__Group_1_3__1__Impl_in_rule__Construct0__Group_1_3__13503);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1769:1: rule__Construct0__Group_1_3__1__Impl : ( ( rule__Construct0__OperandsAssignment_1_3_1 ) ) ;
    public final void rule__Construct0__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1773:1: ( ( ( rule__Construct0__OperandsAssignment_1_3_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1774:1: ( ( rule__Construct0__OperandsAssignment_1_3_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1774:1: ( ( rule__Construct0__OperandsAssignment_1_3_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1775:1: ( rule__Construct0__OperandsAssignment_1_3_1 )
            {
             before(grammarAccess.getConstruct0Access().getOperandsAssignment_1_3_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1776:1: ( rule__Construct0__OperandsAssignment_1_3_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1776:2: rule__Construct0__OperandsAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Construct0__OperandsAssignment_1_3_1_in_rule__Construct0__Group_1_3__1__Impl3530);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1790:1: rule__Construct1__Group__0 : rule__Construct1__Group__0__Impl rule__Construct1__Group__1 ;
    public final void rule__Construct1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1794:1: ( rule__Construct1__Group__0__Impl rule__Construct1__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1795:2: rule__Construct1__Group__0__Impl rule__Construct1__Group__1
            {
            pushFollow(FOLLOW_rule__Construct1__Group__0__Impl_in_rule__Construct1__Group__03564);
            rule__Construct1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct1__Group__1_in_rule__Construct1__Group__03567);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1802:1: rule__Construct1__Group__0__Impl : ( ruleConstruct2 ) ;
    public final void rule__Construct1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1806:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1807:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1807:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1808:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct1__Group__0__Impl3594);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1819:1: rule__Construct1__Group__1 : rule__Construct1__Group__1__Impl ;
    public final void rule__Construct1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1823:1: ( rule__Construct1__Group__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1824:2: rule__Construct1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct1__Group__1__Impl_in_rule__Construct1__Group__13623);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1830:1: rule__Construct1__Group__1__Impl : ( ( rule__Construct1__Group_1__0 )? ) ;
    public final void rule__Construct1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1834:1: ( ( ( rule__Construct1__Group_1__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1835:1: ( ( rule__Construct1__Group_1__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1835:1: ( ( rule__Construct1__Group_1__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1836:1: ( rule__Construct1__Group_1__0 )?
            {
             before(grammarAccess.getConstruct1Access().getGroup_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1837:1: ( rule__Construct1__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=RULE_CHAR && LA12_0<=RULE_STRING)||LA12_0==11||LA12_0==19||(LA12_0>=23 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1837:2: rule__Construct1__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Construct1__Group_1__0_in_rule__Construct1__Group__1__Impl3650);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1851:1: rule__Construct1__Group_1__0 : rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1 ;
    public final void rule__Construct1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1855:1: ( rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1856:2: rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct1__Group_1__0__Impl_in_rule__Construct1__Group_1__03685);
            rule__Construct1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct1__Group_1__1_in_rule__Construct1__Group_1__03688);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1863:1: rule__Construct1__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1867:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1868:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1868:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1869:1: ()
            {
             before(grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1870:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1872:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1882:1: rule__Construct1__Group_1__1 : rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2 ;
    public final void rule__Construct1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1886:1: ( rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1887:2: rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2
            {
            pushFollow(FOLLOW_rule__Construct1__Group_1__1__Impl_in_rule__Construct1__Group_1__13746);
            rule__Construct1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct1__Group_1__2_in_rule__Construct1__Group_1__13749);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1894:1: rule__Construct1__Group_1__1__Impl : ( ( rule__Construct1__OperandsAssignment_1_1 ) ) ;
    public final void rule__Construct1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1898:1: ( ( ( rule__Construct1__OperandsAssignment_1_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1899:1: ( ( rule__Construct1__OperandsAssignment_1_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1899:1: ( ( rule__Construct1__OperandsAssignment_1_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1900:1: ( rule__Construct1__OperandsAssignment_1_1 )
            {
             before(grammarAccess.getConstruct1Access().getOperandsAssignment_1_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1901:1: ( rule__Construct1__OperandsAssignment_1_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1901:2: rule__Construct1__OperandsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Construct1__OperandsAssignment_1_1_in_rule__Construct1__Group_1__1__Impl3776);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1911:1: rule__Construct1__Group_1__2 : rule__Construct1__Group_1__2__Impl ;
    public final void rule__Construct1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1915:1: ( rule__Construct1__Group_1__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1916:2: rule__Construct1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Construct1__Group_1__2__Impl_in_rule__Construct1__Group_1__23806);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1922:1: rule__Construct1__Group_1__2__Impl : ( ( rule__Construct1__OperandsAssignment_1_2 )* ) ;
    public final void rule__Construct1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1926:1: ( ( ( rule__Construct1__OperandsAssignment_1_2 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1927:1: ( ( rule__Construct1__OperandsAssignment_1_2 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1927:1: ( ( rule__Construct1__OperandsAssignment_1_2 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1928:1: ( rule__Construct1__OperandsAssignment_1_2 )*
            {
             before(grammarAccess.getConstruct1Access().getOperandsAssignment_1_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1929:1: ( rule__Construct1__OperandsAssignment_1_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=RULE_CHAR && LA13_0<=RULE_STRING)||LA13_0==11||LA13_0==19||(LA13_0>=23 && LA13_0<=24)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1929:2: rule__Construct1__OperandsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Construct1__OperandsAssignment_1_2_in_rule__Construct1__Group_1__2__Impl3833);
            	    rule__Construct1__OperandsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1945:1: rule__Construct2__Group_0__0 : rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1 ;
    public final void rule__Construct2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1949:1: ( rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1950:2: rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1
            {
            pushFollow(FOLLOW_rule__Construct2__Group_0__0__Impl_in_rule__Construct2__Group_0__03870);
            rule__Construct2__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct2__Group_0__1_in_rule__Construct2__Group_0__03873);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1957:1: rule__Construct2__Group_0__0__Impl : ( () ) ;
    public final void rule__Construct2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1961:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1962:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1962:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1963:1: ()
            {
             before(grammarAccess.getConstruct2Access().getNotAction_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1964:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1966:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1976:1: rule__Construct2__Group_0__1 : rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2 ;
    public final void rule__Construct2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1980:1: ( rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1981:2: rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2
            {
            pushFollow(FOLLOW_rule__Construct2__Group_0__1__Impl_in_rule__Construct2__Group_0__13931);
            rule__Construct2__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct2__Group_0__2_in_rule__Construct2__Group_0__13934);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1988:1: rule__Construct2__Group_0__1__Impl : ( '!' ) ;
    public final void rule__Construct2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1992:1: ( ( '!' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1993:1: ( '!' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1993:1: ( '!' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:1994:1: '!'
            {
             before(grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1()); 
            match(input,23,FOLLOW_23_in_rule__Construct2__Group_0__1__Impl3962); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2007:1: rule__Construct2__Group_0__2 : rule__Construct2__Group_0__2__Impl ;
    public final void rule__Construct2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2011:1: ( rule__Construct2__Group_0__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2012:2: rule__Construct2__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Construct2__Group_0__2__Impl_in_rule__Construct2__Group_0__23993);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2018:1: rule__Construct2__Group_0__2__Impl : ( ( rule__Construct2__OperandAssignment_0_2 ) ) ;
    public final void rule__Construct2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2022:1: ( ( ( rule__Construct2__OperandAssignment_0_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2023:1: ( ( rule__Construct2__OperandAssignment_0_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2023:1: ( ( rule__Construct2__OperandAssignment_0_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2024:1: ( rule__Construct2__OperandAssignment_0_2 )
            {
             before(grammarAccess.getConstruct2Access().getOperandAssignment_0_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2025:1: ( rule__Construct2__OperandAssignment_0_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2025:2: rule__Construct2__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Construct2__OperandAssignment_0_2_in_rule__Construct2__Group_0__2__Impl4020);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2041:1: rule__Construct2__Group_1__0 : rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1 ;
    public final void rule__Construct2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2045:1: ( rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2046:2: rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct2__Group_1__0__Impl_in_rule__Construct2__Group_1__04056);
            rule__Construct2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct2__Group_1__1_in_rule__Construct2__Group_1__04059);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2053:1: rule__Construct2__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2057:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2058:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2058:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2059:1: ()
            {
             before(grammarAccess.getConstruct2Access().getUntilAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2060:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2062:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2072:1: rule__Construct2__Group_1__1 : rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2 ;
    public final void rule__Construct2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2076:1: ( rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2077:2: rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2
            {
            pushFollow(FOLLOW_rule__Construct2__Group_1__1__Impl_in_rule__Construct2__Group_1__14117);
            rule__Construct2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct2__Group_1__2_in_rule__Construct2__Group_1__14120);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2084:1: rule__Construct2__Group_1__1__Impl : ( '->' ) ;
    public final void rule__Construct2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2088:1: ( ( '->' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2089:1: ( '->' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2089:1: ( '->' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2090:1: '->'
            {
             before(grammarAccess.getConstruct2Access().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            match(input,24,FOLLOW_24_in_rule__Construct2__Group_1__1__Impl4148); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2103:1: rule__Construct2__Group_1__2 : rule__Construct2__Group_1__2__Impl ;
    public final void rule__Construct2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2107:1: ( rule__Construct2__Group_1__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2108:2: rule__Construct2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Construct2__Group_1__2__Impl_in_rule__Construct2__Group_1__24179);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2114:1: rule__Construct2__Group_1__2__Impl : ( ( rule__Construct2__OperandAssignment_1_2 ) ) ;
    public final void rule__Construct2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2118:1: ( ( ( rule__Construct2__OperandAssignment_1_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2119:1: ( ( rule__Construct2__OperandAssignment_1_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2119:1: ( ( rule__Construct2__OperandAssignment_1_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2120:1: ( rule__Construct2__OperandAssignment_1_2 )
            {
             before(grammarAccess.getConstruct2Access().getOperandAssignment_1_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2121:1: ( rule__Construct2__OperandAssignment_1_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2121:2: rule__Construct2__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Construct2__OperandAssignment_1_2_in_rule__Construct2__Group_1__2__Impl4206);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2137:1: rule__Construct3__Group__0 : rule__Construct3__Group__0__Impl rule__Construct3__Group__1 ;
    public final void rule__Construct3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2141:1: ( rule__Construct3__Group__0__Impl rule__Construct3__Group__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2142:2: rule__Construct3__Group__0__Impl rule__Construct3__Group__1
            {
            pushFollow(FOLLOW_rule__Construct3__Group__0__Impl_in_rule__Construct3__Group__04242);
            rule__Construct3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group__1_in_rule__Construct3__Group__04245);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2149:1: rule__Construct3__Group__0__Impl : ( ruleConstruct4 ) ;
    public final void rule__Construct3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2153:1: ( ( ruleConstruct4 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2154:1: ( ruleConstruct4 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2154:1: ( ruleConstruct4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2155:1: ruleConstruct4
            {
             before(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstruct4_in_rule__Construct3__Group__0__Impl4272);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2166:1: rule__Construct3__Group__1 : rule__Construct3__Group__1__Impl ;
    public final void rule__Construct3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2170:1: ( rule__Construct3__Group__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2171:2: rule__Construct3__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct3__Group__1__Impl_in_rule__Construct3__Group__14301);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2177:1: rule__Construct3__Group__1__Impl : ( ( rule__Construct3__Group_1__0 )* ) ;
    public final void rule__Construct3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2181:1: ( ( ( rule__Construct3__Group_1__0 )* ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2182:1: ( ( rule__Construct3__Group_1__0 )* )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2182:1: ( ( rule__Construct3__Group_1__0 )* )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2183:1: ( rule__Construct3__Group_1__0 )*
            {
             before(grammarAccess.getConstruct3Access().getGroup_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2184:1: ( rule__Construct3__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2184:2: rule__Construct3__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Construct3__Group_1__0_in_rule__Construct3__Group__1__Impl4328);
            	    rule__Construct3__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2198:1: rule__Construct3__Group_1__0 : rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1 ;
    public final void rule__Construct3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2202:1: ( rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2203:2: rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__0__Impl_in_rule__Construct3__Group_1__04363);
            rule__Construct3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1__1_in_rule__Construct3__Group_1__04366);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2210:1: rule__Construct3__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2214:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2215:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2215:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2216:1: ()
            {
             before(grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2217:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2219:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2229:1: rule__Construct3__Group_1__1 : rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2 ;
    public final void rule__Construct3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2233:1: ( rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2234:2: rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__1__Impl_in_rule__Construct3__Group_1__14424);
            rule__Construct3__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1__2_in_rule__Construct3__Group_1__14427);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2241:1: rule__Construct3__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Construct3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2245:1: ( ( '{' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2246:1: ( '{' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2246:1: ( '{' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2247:1: '{'
            {
             before(grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1()); 
            match(input,14,FOLLOW_14_in_rule__Construct3__Group_1__1__Impl4455); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2260:1: rule__Construct3__Group_1__2 : rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3 ;
    public final void rule__Construct3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2264:1: ( rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2265:2: rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__2__Impl_in_rule__Construct3__Group_1__24486);
            rule__Construct3__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1__3_in_rule__Construct3__Group_1__24489);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2272:1: rule__Construct3__Group_1__2__Impl : ( ( rule__Construct3__MinAssignment_1_2 ) ) ;
    public final void rule__Construct3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2276:1: ( ( ( rule__Construct3__MinAssignment_1_2 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2277:1: ( ( rule__Construct3__MinAssignment_1_2 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2277:1: ( ( rule__Construct3__MinAssignment_1_2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2278:1: ( rule__Construct3__MinAssignment_1_2 )
            {
             before(grammarAccess.getConstruct3Access().getMinAssignment_1_2()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2279:1: ( rule__Construct3__MinAssignment_1_2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2279:2: rule__Construct3__MinAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Construct3__MinAssignment_1_2_in_rule__Construct3__Group_1__2__Impl4516);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2289:1: rule__Construct3__Group_1__3 : rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4 ;
    public final void rule__Construct3__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2293:1: ( rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2294:2: rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__3__Impl_in_rule__Construct3__Group_1__34546);
            rule__Construct3__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1__4_in_rule__Construct3__Group_1__34549);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2301:1: rule__Construct3__Group_1__3__Impl : ( ( rule__Construct3__Group_1_3__0 )? ) ;
    public final void rule__Construct3__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2305:1: ( ( ( rule__Construct3__Group_1_3__0 )? ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2306:1: ( ( rule__Construct3__Group_1_3__0 )? )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2306:1: ( ( rule__Construct3__Group_1_3__0 )? )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2307:1: ( rule__Construct3__Group_1_3__0 )?
            {
             before(grammarAccess.getConstruct3Access().getGroup_1_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2308:1: ( rule__Construct3__Group_1_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2308:2: rule__Construct3__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Construct3__Group_1_3__0_in_rule__Construct3__Group_1__3__Impl4576);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2318:1: rule__Construct3__Group_1__4 : rule__Construct3__Group_1__4__Impl ;
    public final void rule__Construct3__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2322:1: ( rule__Construct3__Group_1__4__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2323:2: rule__Construct3__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1__4__Impl_in_rule__Construct3__Group_1__44607);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2329:1: rule__Construct3__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Construct3__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2333:1: ( ( '}' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2334:1: ( '}' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2334:1: ( '}' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2335:1: '}'
            {
             before(grammarAccess.getConstruct3Access().getRightCurlyBracketKeyword_1_4()); 
            match(input,15,FOLLOW_15_in_rule__Construct3__Group_1__4__Impl4635); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2358:1: rule__Construct3__Group_1_3__0 : rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1 ;
    public final void rule__Construct3__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2362:1: ( rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2363:2: rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1_3__0__Impl_in_rule__Construct3__Group_1_3__04676);
            rule__Construct3__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct3__Group_1_3__1_in_rule__Construct3__Group_1_3__04679);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2370:1: rule__Construct3__Group_1_3__0__Impl : ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) ) ;
    public final void rule__Construct3__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2374:1: ( ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2375:1: ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2375:1: ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2376:1: ( rule__Construct3__UpperBoundedAssignment_1_3_0 )
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedAssignment_1_3_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2377:1: ( rule__Construct3__UpperBoundedAssignment_1_3_0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2377:2: rule__Construct3__UpperBoundedAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__Construct3__UpperBoundedAssignment_1_3_0_in_rule__Construct3__Group_1_3__0__Impl4706);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2387:1: rule__Construct3__Group_1_3__1 : rule__Construct3__Group_1_3__1__Impl ;
    public final void rule__Construct3__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2391:1: ( rule__Construct3__Group_1_3__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2392:2: rule__Construct3__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct3__Group_1_3__1__Impl_in_rule__Construct3__Group_1_3__14736);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2398:1: rule__Construct3__Group_1_3__1__Impl : ( ( rule__Construct3__MaxAssignment_1_3_1 ) ) ;
    public final void rule__Construct3__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2402:1: ( ( ( rule__Construct3__MaxAssignment_1_3_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2403:1: ( ( rule__Construct3__MaxAssignment_1_3_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2403:1: ( ( rule__Construct3__MaxAssignment_1_3_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2404:1: ( rule__Construct3__MaxAssignment_1_3_1 )
            {
             before(grammarAccess.getConstruct3Access().getMaxAssignment_1_3_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2405:1: ( rule__Construct3__MaxAssignment_1_3_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2405:2: rule__Construct3__MaxAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Construct3__MaxAssignment_1_3_1_in_rule__Construct3__Group_1_3__1__Impl4763);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2419:1: rule__Construct4__Group_0__0 : rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1 ;
    public final void rule__Construct4__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2423:1: ( rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2424:2: rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_0__0__Impl_in_rule__Construct4__Group_0__04797);
            rule__Construct4__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_0__1_in_rule__Construct4__Group_0__04800);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2431:1: rule__Construct4__Group_0__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2435:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2436:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2436:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2437:1: ()
            {
             before(grammarAccess.getConstruct4Access().getRangeAction_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2438:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2440:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2450:1: rule__Construct4__Group_0__1 : rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2 ;
    public final void rule__Construct4__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2454:1: ( rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2455:2: rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2
            {
            pushFollow(FOLLOW_rule__Construct4__Group_0__1__Impl_in_rule__Construct4__Group_0__14858);
            rule__Construct4__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_0__2_in_rule__Construct4__Group_0__14861);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2462:1: rule__Construct4__Group_0__1__Impl : ( ( rule__Construct4__MinAssignment_0_1 ) ) ;
    public final void rule__Construct4__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2466:1: ( ( ( rule__Construct4__MinAssignment_0_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2467:1: ( ( rule__Construct4__MinAssignment_0_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2467:1: ( ( rule__Construct4__MinAssignment_0_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2468:1: ( rule__Construct4__MinAssignment_0_1 )
            {
             before(grammarAccess.getConstruct4Access().getMinAssignment_0_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2469:1: ( rule__Construct4__MinAssignment_0_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2469:2: rule__Construct4__MinAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Construct4__MinAssignment_0_1_in_rule__Construct4__Group_0__1__Impl4888);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2479:1: rule__Construct4__Group_0__2 : rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3 ;
    public final void rule__Construct4__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2483:1: ( rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2484:2: rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3
            {
            pushFollow(FOLLOW_rule__Construct4__Group_0__2__Impl_in_rule__Construct4__Group_0__24918);
            rule__Construct4__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_0__3_in_rule__Construct4__Group_0__24921);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2491:1: rule__Construct4__Group_0__2__Impl : ( '..' ) ;
    public final void rule__Construct4__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2495:1: ( ( '..' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2496:1: ( '..' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2496:1: ( '..' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2497:1: '..'
            {
             before(grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_0_2()); 
            match(input,12,FOLLOW_12_in_rule__Construct4__Group_0__2__Impl4949); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2510:1: rule__Construct4__Group_0__3 : rule__Construct4__Group_0__3__Impl ;
    public final void rule__Construct4__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2514:1: ( rule__Construct4__Group_0__3__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2515:2: rule__Construct4__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_0__3__Impl_in_rule__Construct4__Group_0__34980);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2521:1: rule__Construct4__Group_0__3__Impl : ( ( rule__Construct4__MaxAssignment_0_3 ) ) ;
    public final void rule__Construct4__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2525:1: ( ( ( rule__Construct4__MaxAssignment_0_3 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2526:1: ( ( rule__Construct4__MaxAssignment_0_3 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2526:1: ( ( rule__Construct4__MaxAssignment_0_3 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2527:1: ( rule__Construct4__MaxAssignment_0_3 )
            {
             before(grammarAccess.getConstruct4Access().getMaxAssignment_0_3()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2528:1: ( rule__Construct4__MaxAssignment_0_3 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2528:2: rule__Construct4__MaxAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Construct4__MaxAssignment_0_3_in_rule__Construct4__Group_0__3__Impl5007);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2546:1: rule__Construct4__Group_1__0 : rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1 ;
    public final void rule__Construct4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2550:1: ( rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2551:2: rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_1__0__Impl_in_rule__Construct4__Group_1__05045);
            rule__Construct4__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_1__1_in_rule__Construct4__Group_1__05048);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2558:1: rule__Construct4__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2562:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2563:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2563:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2564:1: ()
            {
             before(grammarAccess.getConstruct4Access().getKeywordAction_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2565:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2567:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2577:1: rule__Construct4__Group_1__1 : rule__Construct4__Group_1__1__Impl ;
    public final void rule__Construct4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2581:1: ( rule__Construct4__Group_1__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2582:2: rule__Construct4__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_1__1__Impl_in_rule__Construct4__Group_1__15106);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2588:1: rule__Construct4__Group_1__1__Impl : ( ( rule__Construct4__ValueAssignment_1_1 ) ) ;
    public final void rule__Construct4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2592:1: ( ( ( rule__Construct4__ValueAssignment_1_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2593:1: ( ( rule__Construct4__ValueAssignment_1_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2593:1: ( ( rule__Construct4__ValueAssignment_1_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2594:1: ( rule__Construct4__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstruct4Access().getValueAssignment_1_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2595:1: ( rule__Construct4__ValueAssignment_1_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2595:2: rule__Construct4__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Construct4__ValueAssignment_1_1_in_rule__Construct4__Group_1__1__Impl5133);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2609:1: rule__Construct4__Group_2__0 : rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1 ;
    public final void rule__Construct4__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2613:1: ( rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2614:2: rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_2__0__Impl_in_rule__Construct4__Group_2__05167);
            rule__Construct4__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_2__1_in_rule__Construct4__Group_2__05170);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2621:1: rule__Construct4__Group_2__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2625:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2626:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2626:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2627:1: ()
            {
             before(grammarAccess.getConstruct4Access().getAnyAction_2_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2628:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2630:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2640:1: rule__Construct4__Group_2__1 : rule__Construct4__Group_2__1__Impl ;
    public final void rule__Construct4__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2644:1: ( rule__Construct4__Group_2__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2645:2: rule__Construct4__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_2__1__Impl_in_rule__Construct4__Group_2__15228);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2651:1: rule__Construct4__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Construct4__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2655:1: ( ( '.' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2656:1: ( '.' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2656:1: ( '.' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2657:1: '.'
            {
             before(grammarAccess.getConstruct4Access().getFullStopKeyword_2_1()); 
            match(input,19,FOLLOW_19_in_rule__Construct4__Group_2__1__Impl5256); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2674:1: rule__Construct4__Group_3__0 : rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1 ;
    public final void rule__Construct4__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2678:1: ( rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2679:2: rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_3__0__Impl_in_rule__Construct4__Group_3__05291);
            rule__Construct4__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_3__1_in_rule__Construct4__Group_3__05294);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2686:1: rule__Construct4__Group_3__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2690:1: ( ( () ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2691:1: ( () )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2691:1: ( () )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2692:1: ()
            {
             before(grammarAccess.getConstruct4Access().getReferenceAction_3_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2693:1: ()
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2695:1: 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2705:1: rule__Construct4__Group_3__1 : rule__Construct4__Group_3__1__Impl ;
    public final void rule__Construct4__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2709:1: ( rule__Construct4__Group_3__1__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2710:2: rule__Construct4__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_3__1__Impl_in_rule__Construct4__Group_3__15352);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2716:1: rule__Construct4__Group_3__1__Impl : ( ( rule__Construct4__TargetAssignment_3_1 ) ) ;
    public final void rule__Construct4__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2720:1: ( ( ( rule__Construct4__TargetAssignment_3_1 ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2721:1: ( ( rule__Construct4__TargetAssignment_3_1 ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2721:1: ( ( rule__Construct4__TargetAssignment_3_1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2722:1: ( rule__Construct4__TargetAssignment_3_1 )
            {
             before(grammarAccess.getConstruct4Access().getTargetAssignment_3_1()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2723:1: ( rule__Construct4__TargetAssignment_3_1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2723:2: rule__Construct4__TargetAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Construct4__TargetAssignment_3_1_in_rule__Construct4__Group_3__1__Impl5379);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2737:1: rule__Construct4__Group_4__0 : rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1 ;
    public final void rule__Construct4__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2741:1: ( rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2742:2: rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1
            {
            pushFollow(FOLLOW_rule__Construct4__Group_4__0__Impl_in_rule__Construct4__Group_4__05413);
            rule__Construct4__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_4__1_in_rule__Construct4__Group_4__05416);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2749:1: rule__Construct4__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Construct4__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2753:1: ( ( '(' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2754:1: ( '(' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2754:1: ( '(' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2755:1: '('
            {
             before(grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0()); 
            match(input,11,FOLLOW_11_in_rule__Construct4__Group_4__0__Impl5444); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2768:1: rule__Construct4__Group_4__1 : rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2 ;
    public final void rule__Construct4__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2772:1: ( rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2773:2: rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2
            {
            pushFollow(FOLLOW_rule__Construct4__Group_4__1__Impl_in_rule__Construct4__Group_4__15475);
            rule__Construct4__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Construct4__Group_4__2_in_rule__Construct4__Group_4__15478);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2780:1: rule__Construct4__Group_4__1__Impl : ( ruleConstruct0 ) ;
    public final void rule__Construct4__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2784:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2785:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2785:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2786:1: ruleConstruct0
            {
             before(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__Construct4__Group_4__1__Impl5505);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2797:1: rule__Construct4__Group_4__2 : rule__Construct4__Group_4__2__Impl ;
    public final void rule__Construct4__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2801:1: ( rule__Construct4__Group_4__2__Impl )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2802:2: rule__Construct4__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Construct4__Group_4__2__Impl_in_rule__Construct4__Group_4__25534);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2808:1: rule__Construct4__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Construct4__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2812:1: ( ( ')' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2813:1: ( ')' )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2813:1: ( ')' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2814:1: ')'
            {
             before(grammarAccess.getConstruct4Access().getRightParenthesisKeyword_4_2()); 
            match(input,13,FOLLOW_13_in_rule__Construct4__Group_4__2__Impl5562); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2834:1: rule__Model__ApplicationsAssignment : ( ruleApply ) ;
    public final void rule__Model__ApplicationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2838:1: ( ( ruleApply ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2839:1: ( ruleApply )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2839:1: ( ruleApply )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2840:1: ruleApply
            {
             before(grammarAccess.getModelAccess().getApplicationsApplyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleApply_in_rule__Model__ApplicationsAssignment5604);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2849:1: rule__Apply__TargetAssignment_1 : ( ( ruleQID ) ) ;
    public final void rule__Apply__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2853:1: ( ( ( ruleQID ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2854:1: ( ( ruleQID ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2854:1: ( ( ruleQID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2855:1: ( ruleQID )
            {
             before(grammarAccess.getApplyAccess().getTargetGrammarCrossReference_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2856:1: ( ruleQID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2857:1: ruleQID
            {
             before(grammarAccess.getApplyAccess().getTargetGrammarQIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQID_in_rule__Apply__TargetAssignment_15639);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2868:1: rule__Apply__MinAssignment_3 : ( RULE_INT ) ;
    public final void rule__Apply__MinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2872:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2873:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2873:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2874:1: RULE_INT
            {
             before(grammarAccess.getApplyAccess().getMinINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Apply__MinAssignment_35674); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2883:1: rule__Apply__MaxAssignment_5 : ( RULE_INT ) ;
    public final void rule__Apply__MaxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2887:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2888:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2888:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2889:1: RULE_INT
            {
             before(grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Apply__MaxAssignment_55705); 
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


    // $ANTLR start "rule__Apply__CallReplacementsAssignment_7_1_0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2898:1: rule__Apply__CallReplacementsAssignment_7_1_0 : ( ruleCallReplacement ) ;
    public final void rule__Apply__CallReplacementsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2902:1: ( ( ruleCallReplacement ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2903:1: ( ruleCallReplacement )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2903:1: ( ruleCallReplacement )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2904:1: ruleCallReplacement
            {
             before(grammarAccess.getApplyAccess().getCallReplacementsCallReplacementParserRuleCall_7_1_0_0()); 
            pushFollow(FOLLOW_ruleCallReplacement_in_rule__Apply__CallReplacementsAssignment_7_1_05736);
            ruleCallReplacement();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getCallReplacementsCallReplacementParserRuleCall_7_1_0_0()); 

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
    // $ANTLR end "rule__Apply__CallReplacementsAssignment_7_1_0"


    // $ANTLR start "rule__Apply__RuleReplacementsAssignment_7_1_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2913:1: rule__Apply__RuleReplacementsAssignment_7_1_1 : ( ruleRuleReplacement ) ;
    public final void rule__Apply__RuleReplacementsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2917:1: ( ( ruleRuleReplacement ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2918:1: ( ruleRuleReplacement )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2918:1: ( ruleRuleReplacement )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2919:1: ruleRuleReplacement
            {
             before(grammarAccess.getApplyAccess().getRuleReplacementsRuleReplacementParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_ruleRuleReplacement_in_rule__Apply__RuleReplacementsAssignment_7_1_15767);
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


    // $ANTLR start "rule__CallReplacement__SelectorAssignment_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2928:1: rule__CallReplacement__SelectorAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CallReplacement__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2932:1: ( ( ( RULE_ID ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2933:1: ( ( RULE_ID ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2933:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2934:1: ( RULE_ID )
            {
             before(grammarAccess.getCallReplacementAccess().getSelectorAbstractRuleCrossReference_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2935:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2936:1: RULE_ID
            {
             before(grammarAccess.getCallReplacementAccess().getSelectorAbstractRuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallReplacement__SelectorAssignment_15802); 
             after(grammarAccess.getCallReplacementAccess().getSelectorAbstractRuleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCallReplacementAccess().getSelectorAbstractRuleCrossReference_1_0()); 

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
    // $ANTLR end "rule__CallReplacement__SelectorAssignment_1"


    // $ANTLR start "rule__CallReplacement__PositionedAssignment_2_0"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2947:1: rule__CallReplacement__PositionedAssignment_2_0 : ( ( '/' ) ) ;
    public final void rule__CallReplacement__PositionedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2951:1: ( ( ( '/' ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2952:1: ( ( '/' ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2952:1: ( ( '/' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2953:1: ( '/' )
            {
             before(grammarAccess.getCallReplacementAccess().getPositionedSolidusKeyword_2_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2954:1: ( '/' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2955:1: '/'
            {
             before(grammarAccess.getCallReplacementAccess().getPositionedSolidusKeyword_2_0_0()); 
            match(input,25,FOLLOW_25_in_rule__CallReplacement__PositionedAssignment_2_05842); 
             after(grammarAccess.getCallReplacementAccess().getPositionedSolidusKeyword_2_0_0()); 

            }

             after(grammarAccess.getCallReplacementAccess().getPositionedSolidusKeyword_2_0_0()); 

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
    // $ANTLR end "rule__CallReplacement__PositionedAssignment_2_0"


    // $ANTLR start "rule__CallReplacement__PositionAssignment_2_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2970:1: rule__CallReplacement__PositionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__CallReplacement__PositionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2974:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2975:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2975:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2976:1: RULE_INT
            {
             before(grammarAccess.getCallReplacementAccess().getPositionINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CallReplacement__PositionAssignment_2_15881); 
             after(grammarAccess.getCallReplacementAccess().getPositionINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__CallReplacement__PositionAssignment_2_1"


    // $ANTLR start "rule__CallReplacement__TargetAssignment_4"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2985:1: rule__CallReplacement__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CallReplacement__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2989:1: ( ( ( RULE_ID ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2990:1: ( ( RULE_ID ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2990:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2991:1: ( RULE_ID )
            {
             before(grammarAccess.getCallReplacementAccess().getTargetAbstractRuleCrossReference_4_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2992:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:2993:1: RULE_ID
            {
             before(grammarAccess.getCallReplacementAccess().getTargetAbstractRuleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallReplacement__TargetAssignment_45916); 
             after(grammarAccess.getCallReplacementAccess().getTargetAbstractRuleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCallReplacementAccess().getTargetAbstractRuleCrossReference_4_0()); 

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
    // $ANTLR end "rule__CallReplacement__TargetAssignment_4"


    // $ANTLR start "rule__CallReplacement__ReplacementAssignment_6"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3004:1: rule__CallReplacement__ReplacementAssignment_6 : ( ruleConstruct0 ) ;
    public final void rule__CallReplacement__ReplacementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3008:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3009:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3009:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3010:1: ruleConstruct0
            {
             before(grammarAccess.getCallReplacementAccess().getReplacementConstruct0ParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__CallReplacement__ReplacementAssignment_65951);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getCallReplacementAccess().getReplacementConstruct0ParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__CallReplacement__ReplacementAssignment_6"


    // $ANTLR start "rule__RuleReplacement__TargetAssignment_1"
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3019:1: rule__RuleReplacement__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RuleReplacement__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3023:1: ( ( ( RULE_ID ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3024:1: ( ( RULE_ID ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3024:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3025:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleCrossReference_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3026:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3027:1: RULE_ID
            {
             before(grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleReplacement__TargetAssignment_15986); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3038:1: rule__RuleReplacement__ReplacementAssignment_3 : ( ruleConstruct0 ) ;
    public final void rule__RuleReplacement__ReplacementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3042:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3043:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3043:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3044:1: ruleConstruct0
            {
             before(grammarAccess.getRuleReplacementAccess().getReplacementConstruct0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__RuleReplacement__ReplacementAssignment_36021);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3054:1: rule__Definition__LexicalAssignment_1 : ( ( 'lexical' ) ) ;
    public final void rule__Definition__LexicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3058:1: ( ( ( 'lexical' ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3059:1: ( ( 'lexical' ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3059:1: ( ( 'lexical' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3060:1: ( 'lexical' )
            {
             before(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3061:1: ( 'lexical' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3062:1: 'lexical'
            {
             before(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Definition__LexicalAssignment_16058); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3077:1: rule__Definition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3081:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3082:1: ( RULE_ID )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3082:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3083:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_26097); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3092:1: rule__Definition__RhsAssignment_4 : ( ruleConstruct0 ) ;
    public final void rule__Definition__RhsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3096:1: ( ( ruleConstruct0 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3097:1: ( ruleConstruct0 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3097:1: ( ruleConstruct0 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3098:1: ruleConstruct0
            {
             before(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConstruct0_in_rule__Definition__RhsAssignment_46128);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3107:1: rule__Construct0__OperandsAssignment_1_2 : ( ruleConstruct1 ) ;
    public final void rule__Construct0__OperandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3111:1: ( ( ruleConstruct1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3112:1: ( ruleConstruct1 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3112:1: ( ruleConstruct1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3113:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_26159);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3122:1: rule__Construct0__OperandsAssignment_1_3_1 : ( ruleConstruct1 ) ;
    public final void rule__Construct0__OperandsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3126:1: ( ( ruleConstruct1 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3127:1: ( ruleConstruct1 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3127:1: ( ruleConstruct1 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3128:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_3_16190);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3137:1: rule__Construct1__OperandsAssignment_1_1 : ( ruleConstruct2 ) ;
    public final void rule__Construct1__OperandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3141:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3142:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3142:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3143:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_16221);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3152:1: rule__Construct1__OperandsAssignment_1_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct1__OperandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3156:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3157:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3157:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3158:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_26252);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3167:1: rule__Construct2__OperandAssignment_0_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct2__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3171:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3172:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3172:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3173:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_0_26283);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3182:1: rule__Construct2__OperandAssignment_1_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct2__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3186:1: ( ( ruleConstruct2 ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3187:1: ( ruleConstruct2 )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3187:1: ( ruleConstruct2 )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3188:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_1_26314);
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3197:1: rule__Construct3__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Construct3__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3201:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3202:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3202:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3203:1: RULE_INT
            {
             before(grammarAccess.getConstruct3Access().getMinINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Construct3__MinAssignment_1_26345); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3212:1: rule__Construct3__UpperBoundedAssignment_1_3_0 : ( ( ',' ) ) ;
    public final void rule__Construct3__UpperBoundedAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3216:1: ( ( ( ',' ) ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3217:1: ( ( ',' ) )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3217:1: ( ( ',' ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3218:1: ( ',' )
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3219:1: ( ',' )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3220:1: ','
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 
            match(input,27,FOLLOW_27_in_rule__Construct3__UpperBoundedAssignment_1_3_06381); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3235:1: rule__Construct3__MaxAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__Construct3__MaxAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3239:1: ( ( RULE_INT ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3240:1: ( RULE_INT )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3240:1: ( RULE_INT )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3241:1: RULE_INT
            {
             before(grammarAccess.getConstruct3Access().getMaxINTTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Construct3__MaxAssignment_1_3_16420); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3250:1: rule__Construct4__MinAssignment_0_1 : ( RULE_CHAR ) ;
    public final void rule__Construct4__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3254:1: ( ( RULE_CHAR ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3255:1: ( RULE_CHAR )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3255:1: ( RULE_CHAR )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3256:1: RULE_CHAR
            {
             before(grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_0_1_0()); 
            match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__Construct4__MinAssignment_0_16451); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3265:1: rule__Construct4__MaxAssignment_0_3 : ( RULE_CHAR ) ;
    public final void rule__Construct4__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3269:1: ( ( RULE_CHAR ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3270:1: ( RULE_CHAR )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3270:1: ( RULE_CHAR )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3271:1: RULE_CHAR
            {
             before(grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_0_3_0()); 
            match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__Construct4__MaxAssignment_0_36482); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3280:1: rule__Construct4__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Construct4__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3284:1: ( ( RULE_STRING ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3285:1: ( RULE_STRING )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3285:1: ( RULE_STRING )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3286:1: RULE_STRING
            {
             before(grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Construct4__ValueAssignment_1_16513); 
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
    // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3295:1: rule__Construct4__TargetAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Construct4__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3299:1: ( ( RULE_ID ) )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3300:1: ( RULE_ID )
            {
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3300:1: ( RULE_ID )
            // ../xgen.application.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalApplication.g:3301:1: RULE_ID
            {
             before(grammarAccess.getConstruct4Access().getTargetIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Construct4__TargetAssignment_3_16544); 
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
    public static final BitSet FOLLOW_ruleCallReplacement_in_entryRuleCallReplacement182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallReplacement189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__0_in_ruleCallReplacement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleReplacement_in_entryRuleRuleReplacement242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleReplacement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__0_in_ruleRuleReplacement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0_in_ruleQID335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_entryRuleConstruct0424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct0431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group__0_in_ruleConstruct0457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_entryRuleConstruct1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group__0_in_ruleConstruct1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_entryRuleConstruct2544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Alternatives_in_ruleConstruct2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct3_in_entryRuleConstruct3604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group__0_in_ruleConstruct3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct4_in_entryRuleConstruct4664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Alternatives_in_ruleConstruct4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__CallReplacementsAssignment_7_1_0_in_rule__Apply__Alternatives_7_1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__RuleReplacementsAssignment_7_1_1_in_rule__Apply__Alternatives_7_1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__0_in_rule__Construct2__Alternatives784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__0_in_rule__Construct2__Alternatives802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct3_in_rule__Construct2__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__0_in_rule__Construct4__Alternatives852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_1__0_in_rule__Construct4__Alternatives870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_2__0_in_rule__Construct4__Alternatives888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_3__0_in_rule__Construct4__Alternatives906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__0_in_rule__Construct4__Alternatives924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__0955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__0958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__11016 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Apply__Group__2_in_rule__Apply__Group__11019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__TargetAssignment_1_in_rule__Apply__Group__1__Impl1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__2__Impl_in_rule__Apply__Group__21076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Apply__Group__3_in_rule__Apply__Group__21079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Apply__Group__2__Impl1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__3__Impl_in_rule__Apply__Group__31138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Apply__Group__4_in_rule__Apply__Group__31141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__MinAssignment_3_in_rule__Apply__Group__3__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__4__Impl_in_rule__Apply__Group__41198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Apply__Group__5_in_rule__Apply__Group__41201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Apply__Group__4__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__5__Impl_in_rule__Apply__Group__51260 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Apply__Group__6_in_rule__Apply__Group__51263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__MaxAssignment_5_in_rule__Apply__Group__5__Impl1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__6__Impl_in_rule__Apply__Group__61320 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Apply__Group__7_in_rule__Apply__Group__61323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Apply__Group__6__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__7__Impl_in_rule__Apply__Group__71382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__0_in_rule__Apply__Group__7__Impl1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__0__Impl_in_rule__Apply__Group_7__01456 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__1_in_rule__Apply__Group_7__01459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Apply__Group_7__0__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__1__Impl_in_rule__Apply__Group_7__11518 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__2_in_rule__Apply__Group_7__11521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Alternatives_7_1_in_rule__Apply__Group_7__1__Impl1548 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Apply__Group_7__2__Impl_in_rule__Apply__Group_7__21579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Apply__Group_7__2__Impl1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__0__Impl_in_rule__CallReplacement__Group__01644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__1_in_rule__CallReplacement__Group__01647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CallReplacement__Group__0__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__1__Impl_in_rule__CallReplacement__Group__11706 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__2_in_rule__CallReplacement__Group__11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__SelectorAssignment_1_in_rule__CallReplacement__Group__1__Impl1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__2__Impl_in_rule__CallReplacement__Group__21766 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__3_in_rule__CallReplacement__Group__21769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group_2__0_in_rule__CallReplacement__Group__2__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__3__Impl_in_rule__CallReplacement__Group__31827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__4_in_rule__CallReplacement__Group__31830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CallReplacement__Group__3__Impl1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__4__Impl_in_rule__CallReplacement__Group__41889 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__5_in_rule__CallReplacement__Group__41892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__TargetAssignment_4_in_rule__CallReplacement__Group__4__Impl1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__5__Impl_in_rule__CallReplacement__Group__51949 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__6_in_rule__CallReplacement__Group__51952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CallReplacement__Group__5__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group__6__Impl_in_rule__CallReplacement__Group__62011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__ReplacementAssignment_6_in_rule__CallReplacement__Group__6__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group_2__0__Impl_in_rule__CallReplacement__Group_2__02082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group_2__1_in_rule__CallReplacement__Group_2__02085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__PositionedAssignment_2_0_in_rule__CallReplacement__Group_2__0__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__Group_2__1__Impl_in_rule__CallReplacement__Group_2__12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallReplacement__PositionAssignment_2_1_in_rule__CallReplacement__Group_2__1__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__0__Impl_in_rule__RuleReplacement__Group__02203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__1_in_rule__RuleReplacement__Group__02206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RuleReplacement__Group__0__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__1__Impl_in_rule__RuleReplacement__Group__12265 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__2_in_rule__RuleReplacement__Group__12268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__TargetAssignment_1_in_rule__RuleReplacement__Group__1__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__2__Impl_in_rule__RuleReplacement__Group__22325 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__3_in_rule__RuleReplacement__Group__22328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RuleReplacement__Group__2__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__Group__3__Impl_in_rule__RuleReplacement__Group__32387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleReplacement__ReplacementAssignment_3_in_rule__RuleReplacement__Group__3__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__02452 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QID__Group__1_in_rule__QID__Group__02455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl2538 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__02573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__02576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QID__Group_1__0__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__02696 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__02699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__12757 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__12760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__LexicalAssignment_1_in_rule__Definition__Group__1__Impl2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22818 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__22821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_2_in_rule__Definition__Group__2__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32878 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Definition__Group__3__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42940 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__RhsAssignment_4_in_rule__Definition__Group__4__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__53000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Definition__Group__5__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group__0__Impl_in_rule__Construct0__Group__03071 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Construct0__Group__1_in_rule__Construct0__Group__03074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__Group__0__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group__1__Impl_in_rule__Construct0__Group__13130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__0_in_rule__Construct0__Group__1__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__0__Impl_in_rule__Construct0__Group_1__03192 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__1_in_rule__Construct0__Group_1__03195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__1__Impl_in_rule__Construct0__Group_1__13253 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__2_in_rule__Construct0__Group_1__13256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Construct0__Group_1__1__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__2__Impl_in_rule__Construct0__Group_1__23315 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__3_in_rule__Construct0__Group_1__23318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__OperandsAssignment_1_2_in_rule__Construct0__Group_1__2__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1__3__Impl_in_rule__Construct0__Group_1__33375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1_3__0_in_rule__Construct0__Group_1__3__Impl3402 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1_3__0__Impl_in_rule__Construct0__Group_1_3__03441 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1_3__1_in_rule__Construct0__Group_1_3__03444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Construct0__Group_1_3__0__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__Group_1_3__1__Impl_in_rule__Construct0__Group_1_3__13503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct0__OperandsAssignment_1_3_1_in_rule__Construct0__Group_1_3__1__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group__0__Impl_in_rule__Construct1__Group__03564 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Construct1__Group__1_in_rule__Construct1__Group__03567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__Group__0__Impl3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group__1__Impl_in_rule__Construct1__Group__13623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__0_in_rule__Construct1__Group__1__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__0__Impl_in_rule__Construct1__Group_1__03685 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__1_in_rule__Construct1__Group_1__03688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__1__Impl_in_rule__Construct1__Group_1__13746 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__2_in_rule__Construct1__Group_1__13749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__OperandsAssignment_1_1_in_rule__Construct1__Group_1__1__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__Group_1__2__Impl_in_rule__Construct1__Group_1__23806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct1__OperandsAssignment_1_2_in_rule__Construct1__Group_1__2__Impl3833 = new BitSet(new long[]{0x00000000018808D2L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__0__Impl_in_rule__Construct2__Group_0__03870 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__1_in_rule__Construct2__Group_0__03873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__1__Impl_in_rule__Construct2__Group_0__13931 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__2_in_rule__Construct2__Group_0__13934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Construct2__Group_0__1__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_0__2__Impl_in_rule__Construct2__Group_0__23993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__OperandAssignment_0_2_in_rule__Construct2__Group_0__2__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__0__Impl_in_rule__Construct2__Group_1__04056 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__1_in_rule__Construct2__Group_1__04059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__1__Impl_in_rule__Construct2__Group_1__14117 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__2_in_rule__Construct2__Group_1__14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Construct2__Group_1__1__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__Group_1__2__Impl_in_rule__Construct2__Group_1__24179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct2__OperandAssignment_1_2_in_rule__Construct2__Group_1__2__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group__0__Impl_in_rule__Construct3__Group__04242 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Construct3__Group__1_in_rule__Construct3__Group__04245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct4_in_rule__Construct3__Group__0__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group__1__Impl_in_rule__Construct3__Group__14301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__0_in_rule__Construct3__Group__1__Impl4328 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__0__Impl_in_rule__Construct3__Group_1__04363 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__1_in_rule__Construct3__Group_1__04366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__1__Impl_in_rule__Construct3__Group_1__14424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__2_in_rule__Construct3__Group_1__14427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Construct3__Group_1__1__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__2__Impl_in_rule__Construct3__Group_1__24486 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__3_in_rule__Construct3__Group_1__24489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__MinAssignment_1_2_in_rule__Construct3__Group_1__2__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__3__Impl_in_rule__Construct3__Group_1__34546 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__4_in_rule__Construct3__Group_1__34549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1_3__0_in_rule__Construct3__Group_1__3__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1__4__Impl_in_rule__Construct3__Group_1__44607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Construct3__Group_1__4__Impl4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1_3__0__Impl_in_rule__Construct3__Group_1_3__04676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1_3__1_in_rule__Construct3__Group_1_3__04679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__UpperBoundedAssignment_1_3_0_in_rule__Construct3__Group_1_3__0__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__Group_1_3__1__Impl_in_rule__Construct3__Group_1_3__14736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct3__MaxAssignment_1_3_1_in_rule__Construct3__Group_1_3__1__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__0__Impl_in_rule__Construct4__Group_0__04797 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__1_in_rule__Construct4__Group_0__04800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__1__Impl_in_rule__Construct4__Group_0__14858 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__2_in_rule__Construct4__Group_0__14861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__MinAssignment_0_1_in_rule__Construct4__Group_0__1__Impl4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__2__Impl_in_rule__Construct4__Group_0__24918 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__3_in_rule__Construct4__Group_0__24921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Construct4__Group_0__2__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_0__3__Impl_in_rule__Construct4__Group_0__34980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__MaxAssignment_0_3_in_rule__Construct4__Group_0__3__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_1__0__Impl_in_rule__Construct4__Group_1__05045 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Construct4__Group_1__1_in_rule__Construct4__Group_1__05048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_1__1__Impl_in_rule__Construct4__Group_1__15106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__ValueAssignment_1_1_in_rule__Construct4__Group_1__1__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_2__0__Impl_in_rule__Construct4__Group_2__05167 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Construct4__Group_2__1_in_rule__Construct4__Group_2__05170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_2__1__Impl_in_rule__Construct4__Group_2__15228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Construct4__Group_2__1__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_3__0__Impl_in_rule__Construct4__Group_3__05291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Construct4__Group_3__1_in_rule__Construct4__Group_3__05294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_3__1__Impl_in_rule__Construct4__Group_3__15352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__TargetAssignment_3_1_in_rule__Construct4__Group_3__1__Impl5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__0__Impl_in_rule__Construct4__Group_4__05413 = new BitSet(new long[]{0x00000000018808D0L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__1_in_rule__Construct4__Group_4__05416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Construct4__Group_4__0__Impl5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__1__Impl_in_rule__Construct4__Group_4__15475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__2_in_rule__Construct4__Group_4__15478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__Construct4__Group_4__1__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Construct4__Group_4__2__Impl_in_rule__Construct4__Group_4__25534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Construct4__Group_4__2__Impl5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_rule__Model__ApplicationsAssignment5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_rule__Apply__TargetAssignment_15639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Apply__MinAssignment_35674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Apply__MaxAssignment_55705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallReplacement_in_rule__Apply__CallReplacementsAssignment_7_1_05736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleReplacement_in_rule__Apply__RuleReplacementsAssignment_7_1_15767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallReplacement__SelectorAssignment_15802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CallReplacement__PositionedAssignment_2_05842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CallReplacement__PositionAssignment_2_15881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallReplacement__TargetAssignment_45916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__CallReplacement__ReplacementAssignment_65951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleReplacement__TargetAssignment_15986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__RuleReplacement__ReplacementAssignment_36021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Definition__LexicalAssignment_16058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_26097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_rule__Definition__RhsAssignment_46128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_26159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_3_16190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_16221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_26252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_0_26283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_1_26314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Construct3__MinAssignment_1_26345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Construct3__UpperBoundedAssignment_1_3_06381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Construct3__MaxAssignment_1_3_16420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__Construct4__MinAssignment_0_16451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__Construct4__MaxAssignment_0_36482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Construct4__ValueAssignment_1_16513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Construct4__TargetAssignment_3_16544 = new BitSet(new long[]{0x0000000000000002L});

}