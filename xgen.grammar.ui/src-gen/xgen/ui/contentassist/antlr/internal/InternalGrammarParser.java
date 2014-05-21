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
import xgen.services.GrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_CHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "':'", "';'", "'|'", "'!'", "'{'", "'}'", "'..'", "'.'", "'('", "')'", "'lexical'", "','"
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g"; }


     
     	private GrammarGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GrammarGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleGrammar"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:60:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:61:1: ( ruleGrammar EOF )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:62:1: ruleGrammar EOF
            {
             before(grammarAccess.getGrammarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrammar_in_entryRuleGrammar61);
            ruleGrammar();

            state._fsp--;

             after(grammarAccess.getGrammarRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammar68); 

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
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:69:1: ruleGrammar : ( ( rule__Grammar__Group__0 ) ) ;
    public final void ruleGrammar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:73:2: ( ( ( rule__Grammar__Group__0 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:74:1: ( ( rule__Grammar__Group__0 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:74:1: ( ( rule__Grammar__Group__0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:75:1: ( rule__Grammar__Group__0 )
            {
             before(grammarAccess.getGrammarAccess().getGroup()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:76:1: ( rule__Grammar__Group__0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:76:2: rule__Grammar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grammar__Group__0_in_ruleGrammar94);
            rule__Grammar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleDefinition"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:88:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:89:1: ( ruleDefinition EOF )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:90:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDefinition_in_entryRuleDefinition121);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefinition128); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:97:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:101:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:102:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:102:1: ( ( rule__Definition__Group__0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:103:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:104:1: ( rule__Definition__Group__0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:104:2: rule__Definition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__0_in_ruleDefinition154);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:116:1: entryRuleConstruct0 : ruleConstruct0 EOF ;
    public final void entryRuleConstruct0() throws RecognitionException {
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:117:1: ( ruleConstruct0 EOF )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:118:1: ruleConstruct0 EOF
            {
             before(grammarAccess.getConstruct0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct0_in_entryRuleConstruct0181);
            ruleConstruct0();

            state._fsp--;

             after(grammarAccess.getConstruct0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct0188); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:125:1: ruleConstruct0 : ( ( rule__Construct0__Group__0 ) ) ;
    public final void ruleConstruct0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:129:2: ( ( ( rule__Construct0__Group__0 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:130:1: ( ( rule__Construct0__Group__0 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:130:1: ( ( rule__Construct0__Group__0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:131:1: ( rule__Construct0__Group__0 )
            {
             before(grammarAccess.getConstruct0Access().getGroup()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:132:1: ( rule__Construct0__Group__0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:132:2: rule__Construct0__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group__0_in_ruleConstruct0214);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:144:1: entryRuleConstruct1 : ruleConstruct1 EOF ;
    public final void entryRuleConstruct1() throws RecognitionException {
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:145:1: ( ruleConstruct1 EOF )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:146:1: ruleConstruct1 EOF
            {
             before(grammarAccess.getConstruct1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_entryRuleConstruct1241);
            ruleConstruct1();

            state._fsp--;

             after(grammarAccess.getConstruct1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct1248); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:153:1: ruleConstruct1 : ( ( rule__Construct1__Group__0 ) ) ;
    public final void ruleConstruct1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:157:2: ( ( ( rule__Construct1__Group__0 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:158:1: ( ( rule__Construct1__Group__0 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:158:1: ( ( rule__Construct1__Group__0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:159:1: ( rule__Construct1__Group__0 )
            {
             before(grammarAccess.getConstruct1Access().getGroup()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:160:1: ( rule__Construct1__Group__0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:160:2: rule__Construct1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group__0_in_ruleConstruct1274);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:172:1: entryRuleConstruct2 : ruleConstruct2 EOF ;
    public final void entryRuleConstruct2() throws RecognitionException {
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:173:1: ( ruleConstruct2 EOF )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:174:1: ruleConstruct2 EOF
            {
             before(grammarAccess.getConstruct2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_entryRuleConstruct2301);
            ruleConstruct2();

            state._fsp--;

             after(grammarAccess.getConstruct2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct2308); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:181:1: ruleConstruct2 : ( ( rule__Construct2__Alternatives ) ) ;
    public final void ruleConstruct2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:185:2: ( ( ( rule__Construct2__Alternatives ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:186:1: ( ( rule__Construct2__Alternatives ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:186:1: ( ( rule__Construct2__Alternatives ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:187:1: ( rule__Construct2__Alternatives )
            {
             before(grammarAccess.getConstruct2Access().getAlternatives()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:188:1: ( rule__Construct2__Alternatives )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:188:2: rule__Construct2__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Alternatives_in_ruleConstruct2334);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:200:1: entryRuleConstruct3 : ruleConstruct3 EOF ;
    public final void entryRuleConstruct3() throws RecognitionException {
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:201:1: ( ruleConstruct3 EOF )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:202:1: ruleConstruct3 EOF
            {
             before(grammarAccess.getConstruct3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct3_in_entryRuleConstruct3361);
            ruleConstruct3();

            state._fsp--;

             after(grammarAccess.getConstruct3Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct3368); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:209:1: ruleConstruct3 : ( ( rule__Construct3__Group__0 ) ) ;
    public final void ruleConstruct3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:213:2: ( ( ( rule__Construct3__Group__0 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:214:1: ( ( rule__Construct3__Group__0 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:214:1: ( ( rule__Construct3__Group__0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:215:1: ( rule__Construct3__Group__0 )
            {
             before(grammarAccess.getConstruct3Access().getGroup()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:216:1: ( rule__Construct3__Group__0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:216:2: rule__Construct3__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group__0_in_ruleConstruct3394);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:228:1: entryRuleConstruct4 : ruleConstruct4 EOF ;
    public final void entryRuleConstruct4() throws RecognitionException {
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:229:1: ( ruleConstruct4 EOF )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:230:1: ruleConstruct4 EOF
            {
             before(grammarAccess.getConstruct4Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct4_in_entryRuleConstruct4421);
            ruleConstruct4();

            state._fsp--;

             after(grammarAccess.getConstruct4Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct4428); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:237:1: ruleConstruct4 : ( ( rule__Construct4__Alternatives ) ) ;
    public final void ruleConstruct4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:241:2: ( ( ( rule__Construct4__Alternatives ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:242:1: ( ( rule__Construct4__Alternatives ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:242:1: ( ( rule__Construct4__Alternatives ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:243:1: ( rule__Construct4__Alternatives )
            {
             before(grammarAccess.getConstruct4Access().getAlternatives()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:244:1: ( rule__Construct4__Alternatives )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:244:2: rule__Construct4__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Alternatives_in_ruleConstruct4454);
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


    // $ANTLR start "rule__Construct2__Alternatives"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:256:1: rule__Construct2__Alternatives : ( ( ( rule__Construct2__Group_0__0 ) ) | ( ruleConstruct3 ) );
    public final void rule__Construct2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:260:1: ( ( ( rule__Construct2__Group_0__0 ) ) | ( ruleConstruct3 ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||(LA1_0>=RULE_CHAR && LA1_0<=RULE_STRING)||(LA1_0>=18 && LA1_0<=19)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:261:1: ( ( rule__Construct2__Group_0__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:261:1: ( ( rule__Construct2__Group_0__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:262:1: ( rule__Construct2__Group_0__0 )
                    {
                     before(grammarAccess.getConstruct2Access().getGroup_0()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:263:1: ( rule__Construct2__Group_0__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:263:2: rule__Construct2__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__0_in_rule__Construct2__Alternatives490);
                    rule__Construct2__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct2Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:267:6: ( ruleConstruct3 )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:267:6: ( ruleConstruct3 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:268:1: ruleConstruct3
                    {
                     before(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstruct3_in_rule__Construct2__Alternatives508);
                    ruleConstruct3();

                    state._fsp--;

                     after(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_1()); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:278:1: rule__Construct4__Alternatives : ( ( ( rule__Construct4__Group_0__0 ) ) | ( ( rule__Construct4__Group_1__0 ) ) | ( ( rule__Construct4__Group_2__0 ) ) | ( ( rule__Construct4__Group_3__0 ) ) | ( ( rule__Construct4__Group_4__0 ) ) );
    public final void rule__Construct4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:282:1: ( ( ( rule__Construct4__Group_0__0 ) ) | ( ( rule__Construct4__Group_1__0 ) ) | ( ( rule__Construct4__Group_2__0 ) ) | ( ( rule__Construct4__Group_3__0 ) ) | ( ( rule__Construct4__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_CHAR:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:283:1: ( ( rule__Construct4__Group_0__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:283:1: ( ( rule__Construct4__Group_0__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:284:1: ( rule__Construct4__Group_0__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_0()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:285:1: ( rule__Construct4__Group_0__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:285:2: rule__Construct4__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__0_in_rule__Construct4__Alternatives540);
                    rule__Construct4__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:289:6: ( ( rule__Construct4__Group_1__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:289:6: ( ( rule__Construct4__Group_1__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:290:1: ( rule__Construct4__Group_1__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_1()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:291:1: ( rule__Construct4__Group_1__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:291:2: rule__Construct4__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__0_in_rule__Construct4__Alternatives558);
                    rule__Construct4__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:295:6: ( ( rule__Construct4__Group_2__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:295:6: ( ( rule__Construct4__Group_2__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:296:1: ( rule__Construct4__Group_2__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_2()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:297:1: ( rule__Construct4__Group_2__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:297:2: rule__Construct4__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_2__0_in_rule__Construct4__Alternatives576);
                    rule__Construct4__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:301:6: ( ( rule__Construct4__Group_3__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:301:6: ( ( rule__Construct4__Group_3__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:302:1: ( rule__Construct4__Group_3__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_3()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:303:1: ( rule__Construct4__Group_3__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:303:2: rule__Construct4__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_3__0_in_rule__Construct4__Alternatives594);
                    rule__Construct4__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:307:6: ( ( rule__Construct4__Group_4__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:307:6: ( ( rule__Construct4__Group_4__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:308:1: ( rule__Construct4__Group_4__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_4()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:309:1: ( rule__Construct4__Group_4__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:309:2: rule__Construct4__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__0_in_rule__Construct4__Alternatives612);
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


    // $ANTLR start "rule__Grammar__Group__0"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:320:1: rule__Grammar__Group__0 : rule__Grammar__Group__0__Impl rule__Grammar__Group__1 ;
    public final void rule__Grammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:324:1: ( rule__Grammar__Group__0__Impl rule__Grammar__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:325:2: rule__Grammar__Group__0__Impl rule__Grammar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grammar__Group__0__Impl_in_rule__Grammar__Group__0643);
            rule__Grammar__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grammar__Group__1_in_rule__Grammar__Group__0646);
            rule__Grammar__Group__1();

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
    // $ANTLR end "rule__Grammar__Group__0"


    // $ANTLR start "rule__Grammar__Group__0__Impl"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:332:1: rule__Grammar__Group__0__Impl : ( () ) ;
    public final void rule__Grammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:336:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:337:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:337:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:338:1: ()
            {
             before(grammarAccess.getGrammarAccess().getGrammarAction_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:339:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:341:1: 
            {
            }

             after(grammarAccess.getGrammarAccess().getGrammarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__0__Impl"


    // $ANTLR start "rule__Grammar__Group__1"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:351:1: rule__Grammar__Group__1 : rule__Grammar__Group__1__Impl ;
    public final void rule__Grammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:355:1: ( rule__Grammar__Group__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:356:2: rule__Grammar__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grammar__Group__1__Impl_in_rule__Grammar__Group__1704);
            rule__Grammar__Group__1__Impl();

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
    // $ANTLR end "rule__Grammar__Group__1"


    // $ANTLR start "rule__Grammar__Group__1__Impl"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:362:1: rule__Grammar__Group__1__Impl : ( ( rule__Grammar__DefinitionsAssignment_1 )* ) ;
    public final void rule__Grammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:366:1: ( ( ( rule__Grammar__DefinitionsAssignment_1 )* ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:367:1: ( ( rule__Grammar__DefinitionsAssignment_1 )* )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:367:1: ( ( rule__Grammar__DefinitionsAssignment_1 )* )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:368:1: ( rule__Grammar__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getGrammarAccess().getDefinitionsAssignment_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:369:1: ( rule__Grammar__DefinitionsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:369:2: rule__Grammar__DefinitionsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Grammar__DefinitionsAssignment_1_in_rule__Grammar__Group__1__Impl731);
            	    rule__Grammar__DefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getDefinitionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:383:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:387:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:388:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0766);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0769);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:395:1: rule__Definition__Group__0__Impl : ( () ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:399:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:400:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:400:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:401:1: ()
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAction_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:402:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:404:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:414:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:418:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:419:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1827);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1830);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:426:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__LexicalAssignment_1 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:430:1: ( ( ( rule__Definition__LexicalAssignment_1 )? ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:431:1: ( ( rule__Definition__LexicalAssignment_1 )? )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:431:1: ( ( rule__Definition__LexicalAssignment_1 )? )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:432:1: ( rule__Definition__LexicalAssignment_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getLexicalAssignment_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:433:1: ( rule__Definition__LexicalAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:433:2: rule__Definition__LexicalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Definition__LexicalAssignment_1_in_rule__Definition__Group__1__Impl857);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:443:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:447:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:448:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2888);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__2891);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:455:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__NameAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:459:1: ( ( ( rule__Definition__NameAssignment_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:460:1: ( ( rule__Definition__NameAssignment_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:460:1: ( ( rule__Definition__NameAssignment_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:461:1: ( rule__Definition__NameAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:462:1: ( rule__Definition__NameAssignment_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:462:2: rule__Definition__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__NameAssignment_2_in_rule__Definition__Group__2__Impl918);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:472:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:476:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:477:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__3948);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__3951);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:484:1: rule__Definition__Group__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:488:1: ( ( ':' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:489:1: ( ':' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:489:1: ( ':' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:490:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Definition__Group__3__Impl979); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:503:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:507:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:508:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__41010);
            rule__Definition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__41013);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:515:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__RhsAssignment_4 ) ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:519:1: ( ( ( rule__Definition__RhsAssignment_4 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:520:1: ( ( rule__Definition__RhsAssignment_4 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:520:1: ( ( rule__Definition__RhsAssignment_4 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:521:1: ( rule__Definition__RhsAssignment_4 )
            {
             before(grammarAccess.getDefinitionAccess().getRhsAssignment_4()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:522:1: ( rule__Definition__RhsAssignment_4 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:522:2: rule__Definition__RhsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__RhsAssignment_4_in_rule__Definition__Group__4__Impl1040);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:532:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:536:1: ( rule__Definition__Group__5__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:537:2: rule__Definition__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__51070);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:543:1: rule__Definition__Group__5__Impl : ( ';' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:547:1: ( ( ';' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:548:1: ( ';' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:548:1: ( ';' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:549:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Definition__Group__5__Impl1098); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:574:1: rule__Construct0__Group__0 : rule__Construct0__Group__0__Impl rule__Construct0__Group__1 ;
    public final void rule__Construct0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:578:1: ( rule__Construct0__Group__0__Impl rule__Construct0__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:579:2: rule__Construct0__Group__0__Impl rule__Construct0__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group__0__Impl_in_rule__Construct0__Group__01141);
            rule__Construct0__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group__1_in_rule__Construct0__Group__01144);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:586:1: rule__Construct0__Group__0__Impl : ( ruleConstruct1 ) ;
    public final void rule__Construct0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:590:1: ( ( ruleConstruct1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:591:1: ( ruleConstruct1 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:591:1: ( ruleConstruct1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:592:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_rule__Construct0__Group__0__Impl1171);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:603:1: rule__Construct0__Group__1 : rule__Construct0__Group__1__Impl ;
    public final void rule__Construct0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:607:1: ( rule__Construct0__Group__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:608:2: rule__Construct0__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group__1__Impl_in_rule__Construct0__Group__11200);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:614:1: rule__Construct0__Group__1__Impl : ( ( rule__Construct0__Group_1__0 )? ) ;
    public final void rule__Construct0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:618:1: ( ( ( rule__Construct0__Group_1__0 )? ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:619:1: ( ( rule__Construct0__Group_1__0 )? )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:619:1: ( ( rule__Construct0__Group_1__0 )? )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:620:1: ( rule__Construct0__Group_1__0 )?
            {
             before(grammarAccess.getConstruct0Access().getGroup_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:621:1: ( rule__Construct0__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:621:2: rule__Construct0__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__0_in_rule__Construct0__Group__1__Impl1227);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:635:1: rule__Construct0__Group_1__0 : rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1 ;
    public final void rule__Construct0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:639:1: ( rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:640:2: rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__0__Impl_in_rule__Construct0__Group_1__01262);
            rule__Construct0__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__1_in_rule__Construct0__Group_1__01265);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:647:1: rule__Construct0__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:651:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:652:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:652:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:653:1: ()
            {
             before(grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:654:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:656:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:666:1: rule__Construct0__Group_1__1 : rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2 ;
    public final void rule__Construct0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:670:1: ( rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:671:2: rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__1__Impl_in_rule__Construct0__Group_1__11323);
            rule__Construct0__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__2_in_rule__Construct0__Group_1__11326);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:678:1: rule__Construct0__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Construct0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:682:1: ( ( '|' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:683:1: ( '|' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:683:1: ( '|' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:684:1: '|'
            {
             before(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Construct0__Group_1__1__Impl1354); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:697:1: rule__Construct0__Group_1__2 : rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3 ;
    public final void rule__Construct0__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:701:1: ( rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:702:2: rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__2__Impl_in_rule__Construct0__Group_1__21385);
            rule__Construct0__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__3_in_rule__Construct0__Group_1__21388);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:709:1: rule__Construct0__Group_1__2__Impl : ( ( rule__Construct0__OperandsAssignment_1_2 ) ) ;
    public final void rule__Construct0__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:713:1: ( ( ( rule__Construct0__OperandsAssignment_1_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:714:1: ( ( rule__Construct0__OperandsAssignment_1_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:714:1: ( ( rule__Construct0__OperandsAssignment_1_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:715:1: ( rule__Construct0__OperandsAssignment_1_2 )
            {
             before(grammarAccess.getConstruct0Access().getOperandsAssignment_1_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:716:1: ( rule__Construct0__OperandsAssignment_1_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:716:2: rule__Construct0__OperandsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__OperandsAssignment_1_2_in_rule__Construct0__Group_1__2__Impl1415);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:726:1: rule__Construct0__Group_1__3 : rule__Construct0__Group_1__3__Impl ;
    public final void rule__Construct0__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:730:1: ( rule__Construct0__Group_1__3__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:731:2: rule__Construct0__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__3__Impl_in_rule__Construct0__Group_1__31445);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:737:1: rule__Construct0__Group_1__3__Impl : ( ( rule__Construct0__Group_1_3__0 )* ) ;
    public final void rule__Construct0__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:741:1: ( ( ( rule__Construct0__Group_1_3__0 )* ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:742:1: ( ( rule__Construct0__Group_1_3__0 )* )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:742:1: ( ( rule__Construct0__Group_1_3__0 )* )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:743:1: ( rule__Construct0__Group_1_3__0 )*
            {
             before(grammarAccess.getConstruct0Access().getGroup_1_3()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:744:1: ( rule__Construct0__Group_1_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:744:2: rule__Construct0__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1_3__0_in_rule__Construct0__Group_1__3__Impl1472);
            	    rule__Construct0__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:762:1: rule__Construct0__Group_1_3__0 : rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1 ;
    public final void rule__Construct0__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:766:1: ( rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:767:2: rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1_3__0__Impl_in_rule__Construct0__Group_1_3__01511);
            rule__Construct0__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1_3__1_in_rule__Construct0__Group_1_3__01514);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:774:1: rule__Construct0__Group_1_3__0__Impl : ( '|' ) ;
    public final void rule__Construct0__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:778:1: ( ( '|' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:779:1: ( '|' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:779:1: ( '|' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:780:1: '|'
            {
             before(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Construct0__Group_1_3__0__Impl1542); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:793:1: rule__Construct0__Group_1_3__1 : rule__Construct0__Group_1_3__1__Impl ;
    public final void rule__Construct0__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:797:1: ( rule__Construct0__Group_1_3__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:798:2: rule__Construct0__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1_3__1__Impl_in_rule__Construct0__Group_1_3__11573);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:804:1: rule__Construct0__Group_1_3__1__Impl : ( ( rule__Construct0__OperandsAssignment_1_3_1 ) ) ;
    public final void rule__Construct0__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:808:1: ( ( ( rule__Construct0__OperandsAssignment_1_3_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:809:1: ( ( rule__Construct0__OperandsAssignment_1_3_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:809:1: ( ( rule__Construct0__OperandsAssignment_1_3_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:810:1: ( rule__Construct0__OperandsAssignment_1_3_1 )
            {
             before(grammarAccess.getConstruct0Access().getOperandsAssignment_1_3_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:811:1: ( rule__Construct0__OperandsAssignment_1_3_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:811:2: rule__Construct0__OperandsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__OperandsAssignment_1_3_1_in_rule__Construct0__Group_1_3__1__Impl1600);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:825:1: rule__Construct1__Group__0 : rule__Construct1__Group__0__Impl rule__Construct1__Group__1 ;
    public final void rule__Construct1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:829:1: ( rule__Construct1__Group__0__Impl rule__Construct1__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:830:2: rule__Construct1__Group__0__Impl rule__Construct1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group__0__Impl_in_rule__Construct1__Group__01634);
            rule__Construct1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group__1_in_rule__Construct1__Group__01637);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:837:1: rule__Construct1__Group__0__Impl : ( ruleConstruct2 ) ;
    public final void rule__Construct1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:841:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:842:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:842:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:843:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct1__Group__0__Impl1664);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:854:1: rule__Construct1__Group__1 : rule__Construct1__Group__1__Impl ;
    public final void rule__Construct1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:858:1: ( rule__Construct1__Group__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:859:2: rule__Construct1__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group__1__Impl_in_rule__Construct1__Group__11693);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:865:1: rule__Construct1__Group__1__Impl : ( ( rule__Construct1__Group_1__0 )? ) ;
    public final void rule__Construct1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:869:1: ( ( ( rule__Construct1__Group_1__0 )? ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:870:1: ( ( rule__Construct1__Group_1__0 )? )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:870:1: ( ( rule__Construct1__Group_1__0 )? )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:871:1: ( rule__Construct1__Group_1__0 )?
            {
             before(grammarAccess.getConstruct1Access().getGroup_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:872:1: ( rule__Construct1__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=RULE_CHAR && LA7_0<=RULE_STRING)||LA7_0==14||(LA7_0>=18 && LA7_0<=19)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:872:2: rule__Construct1__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__0_in_rule__Construct1__Group__1__Impl1720);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:886:1: rule__Construct1__Group_1__0 : rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1 ;
    public final void rule__Construct1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:890:1: ( rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:891:2: rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__0__Impl_in_rule__Construct1__Group_1__01755);
            rule__Construct1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__1_in_rule__Construct1__Group_1__01758);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:898:1: rule__Construct1__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:902:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:903:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:903:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:904:1: ()
            {
             before(grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:905:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:907:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:917:1: rule__Construct1__Group_1__1 : rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2 ;
    public final void rule__Construct1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:921:1: ( rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:922:2: rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__1__Impl_in_rule__Construct1__Group_1__11816);
            rule__Construct1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__2_in_rule__Construct1__Group_1__11819);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:929:1: rule__Construct1__Group_1__1__Impl : ( ( rule__Construct1__OperandsAssignment_1_1 ) ) ;
    public final void rule__Construct1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:933:1: ( ( ( rule__Construct1__OperandsAssignment_1_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:934:1: ( ( rule__Construct1__OperandsAssignment_1_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:934:1: ( ( rule__Construct1__OperandsAssignment_1_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:935:1: ( rule__Construct1__OperandsAssignment_1_1 )
            {
             before(grammarAccess.getConstruct1Access().getOperandsAssignment_1_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:936:1: ( rule__Construct1__OperandsAssignment_1_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:936:2: rule__Construct1__OperandsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__OperandsAssignment_1_1_in_rule__Construct1__Group_1__1__Impl1846);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:946:1: rule__Construct1__Group_1__2 : rule__Construct1__Group_1__2__Impl ;
    public final void rule__Construct1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:950:1: ( rule__Construct1__Group_1__2__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:951:2: rule__Construct1__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__2__Impl_in_rule__Construct1__Group_1__21876);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:957:1: rule__Construct1__Group_1__2__Impl : ( ( rule__Construct1__OperandsAssignment_1_2 )* ) ;
    public final void rule__Construct1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:961:1: ( ( ( rule__Construct1__OperandsAssignment_1_2 )* ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:962:1: ( ( rule__Construct1__OperandsAssignment_1_2 )* )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:962:1: ( ( rule__Construct1__OperandsAssignment_1_2 )* )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:963:1: ( rule__Construct1__OperandsAssignment_1_2 )*
            {
             before(grammarAccess.getConstruct1Access().getOperandsAssignment_1_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:964:1: ( rule__Construct1__OperandsAssignment_1_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=RULE_CHAR && LA8_0<=RULE_STRING)||LA8_0==14||(LA8_0>=18 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:964:2: rule__Construct1__OperandsAssignment_1_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Construct1__OperandsAssignment_1_2_in_rule__Construct1__Group_1__2__Impl1903);
            	    rule__Construct1__OperandsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:980:1: rule__Construct2__Group_0__0 : rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1 ;
    public final void rule__Construct2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:984:1: ( rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:985:2: rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__0__Impl_in_rule__Construct2__Group_0__01940);
            rule__Construct2__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__1_in_rule__Construct2__Group_0__01943);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:992:1: rule__Construct2__Group_0__0__Impl : ( () ) ;
    public final void rule__Construct2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:996:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:997:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:997:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:998:1: ()
            {
             before(grammarAccess.getConstruct2Access().getNotAction_0_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:999:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1001:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1011:1: rule__Construct2__Group_0__1 : rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2 ;
    public final void rule__Construct2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1015:1: ( rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1016:2: rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__1__Impl_in_rule__Construct2__Group_0__12001);
            rule__Construct2__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__2_in_rule__Construct2__Group_0__12004);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1023:1: rule__Construct2__Group_0__1__Impl : ( '!' ) ;
    public final void rule__Construct2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1027:1: ( ( '!' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1028:1: ( '!' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1028:1: ( '!' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1029:1: '!'
            {
             before(grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Construct2__Group_0__1__Impl2032); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1042:1: rule__Construct2__Group_0__2 : rule__Construct2__Group_0__2__Impl ;
    public final void rule__Construct2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1046:1: ( rule__Construct2__Group_0__2__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1047:2: rule__Construct2__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__2__Impl_in_rule__Construct2__Group_0__22063);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1053:1: rule__Construct2__Group_0__2__Impl : ( ( rule__Construct2__OperandAssignment_0_2 ) ) ;
    public final void rule__Construct2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1057:1: ( ( ( rule__Construct2__OperandAssignment_0_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1058:1: ( ( rule__Construct2__OperandAssignment_0_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1058:1: ( ( rule__Construct2__OperandAssignment_0_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1059:1: ( rule__Construct2__OperandAssignment_0_2 )
            {
             before(grammarAccess.getConstruct2Access().getOperandAssignment_0_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1060:1: ( rule__Construct2__OperandAssignment_0_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1060:2: rule__Construct2__OperandAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__OperandAssignment_0_2_in_rule__Construct2__Group_0__2__Impl2090);
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


    // $ANTLR start "rule__Construct3__Group__0"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1076:1: rule__Construct3__Group__0 : rule__Construct3__Group__0__Impl rule__Construct3__Group__1 ;
    public final void rule__Construct3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1080:1: ( rule__Construct3__Group__0__Impl rule__Construct3__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1081:2: rule__Construct3__Group__0__Impl rule__Construct3__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group__0__Impl_in_rule__Construct3__Group__02126);
            rule__Construct3__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group__1_in_rule__Construct3__Group__02129);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1088:1: rule__Construct3__Group__0__Impl : ( ruleConstruct4 ) ;
    public final void rule__Construct3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1092:1: ( ( ruleConstruct4 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1093:1: ( ruleConstruct4 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1093:1: ( ruleConstruct4 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1094:1: ruleConstruct4
            {
             before(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct4_in_rule__Construct3__Group__0__Impl2156);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1105:1: rule__Construct3__Group__1 : rule__Construct3__Group__1__Impl ;
    public final void rule__Construct3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1109:1: ( rule__Construct3__Group__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1110:2: rule__Construct3__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group__1__Impl_in_rule__Construct3__Group__12185);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1116:1: rule__Construct3__Group__1__Impl : ( ( rule__Construct3__Group_1__0 )* ) ;
    public final void rule__Construct3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1120:1: ( ( ( rule__Construct3__Group_1__0 )* ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1121:1: ( ( rule__Construct3__Group_1__0 )* )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1121:1: ( ( rule__Construct3__Group_1__0 )* )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1122:1: ( rule__Construct3__Group_1__0 )*
            {
             before(grammarAccess.getConstruct3Access().getGroup_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1123:1: ( rule__Construct3__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1123:2: rule__Construct3__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__0_in_rule__Construct3__Group__1__Impl2212);
            	    rule__Construct3__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1137:1: rule__Construct3__Group_1__0 : rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1 ;
    public final void rule__Construct3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1141:1: ( rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1142:2: rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__0__Impl_in_rule__Construct3__Group_1__02247);
            rule__Construct3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__1_in_rule__Construct3__Group_1__02250);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1149:1: rule__Construct3__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1153:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1154:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1154:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1155:1: ()
            {
             before(grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1156:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1158:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1168:1: rule__Construct3__Group_1__1 : rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2 ;
    public final void rule__Construct3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1172:1: ( rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1173:2: rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__1__Impl_in_rule__Construct3__Group_1__12308);
            rule__Construct3__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__2_in_rule__Construct3__Group_1__12311);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1180:1: rule__Construct3__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Construct3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1184:1: ( ( '{' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1185:1: ( '{' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1185:1: ( '{' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1186:1: '{'
            {
             before(grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Construct3__Group_1__1__Impl2339); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1199:1: rule__Construct3__Group_1__2 : rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3 ;
    public final void rule__Construct3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1203:1: ( rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1204:2: rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__2__Impl_in_rule__Construct3__Group_1__22370);
            rule__Construct3__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__3_in_rule__Construct3__Group_1__22373);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1211:1: rule__Construct3__Group_1__2__Impl : ( ( rule__Construct3__MinAssignment_1_2 ) ) ;
    public final void rule__Construct3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1215:1: ( ( ( rule__Construct3__MinAssignment_1_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1216:1: ( ( rule__Construct3__MinAssignment_1_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1216:1: ( ( rule__Construct3__MinAssignment_1_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1217:1: ( rule__Construct3__MinAssignment_1_2 )
            {
             before(grammarAccess.getConstruct3Access().getMinAssignment_1_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1218:1: ( rule__Construct3__MinAssignment_1_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1218:2: rule__Construct3__MinAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__MinAssignment_1_2_in_rule__Construct3__Group_1__2__Impl2400);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1228:1: rule__Construct3__Group_1__3 : rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4 ;
    public final void rule__Construct3__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1232:1: ( rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1233:2: rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__3__Impl_in_rule__Construct3__Group_1__32430);
            rule__Construct3__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__4_in_rule__Construct3__Group_1__32433);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1240:1: rule__Construct3__Group_1__3__Impl : ( ( rule__Construct3__Group_1_3__0 )? ) ;
    public final void rule__Construct3__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1244:1: ( ( ( rule__Construct3__Group_1_3__0 )? ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1245:1: ( ( rule__Construct3__Group_1_3__0 )? )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1245:1: ( ( rule__Construct3__Group_1_3__0 )? )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1246:1: ( rule__Construct3__Group_1_3__0 )?
            {
             before(grammarAccess.getConstruct3Access().getGroup_1_3()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1247:1: ( rule__Construct3__Group_1_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1247:2: rule__Construct3__Group_1_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1_3__0_in_rule__Construct3__Group_1__3__Impl2460);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1257:1: rule__Construct3__Group_1__4 : rule__Construct3__Group_1__4__Impl ;
    public final void rule__Construct3__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1261:1: ( rule__Construct3__Group_1__4__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1262:2: rule__Construct3__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__4__Impl_in_rule__Construct3__Group_1__42491);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1268:1: rule__Construct3__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Construct3__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1272:1: ( ( '}' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1273:1: ( '}' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1273:1: ( '}' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1274:1: '}'
            {
             before(grammarAccess.getConstruct3Access().getRightCurlyBracketKeyword_1_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Construct3__Group_1__4__Impl2519); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1297:1: rule__Construct3__Group_1_3__0 : rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1 ;
    public final void rule__Construct3__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1301:1: ( rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1302:2: rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1_3__0__Impl_in_rule__Construct3__Group_1_3__02560);
            rule__Construct3__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1_3__1_in_rule__Construct3__Group_1_3__02563);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1309:1: rule__Construct3__Group_1_3__0__Impl : ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) ) ;
    public final void rule__Construct3__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1313:1: ( ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1314:1: ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1314:1: ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1315:1: ( rule__Construct3__UpperBoundedAssignment_1_3_0 )
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedAssignment_1_3_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1316:1: ( rule__Construct3__UpperBoundedAssignment_1_3_0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1316:2: rule__Construct3__UpperBoundedAssignment_1_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__UpperBoundedAssignment_1_3_0_in_rule__Construct3__Group_1_3__0__Impl2590);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1326:1: rule__Construct3__Group_1_3__1 : rule__Construct3__Group_1_3__1__Impl ;
    public final void rule__Construct3__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1330:1: ( rule__Construct3__Group_1_3__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1331:2: rule__Construct3__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1_3__1__Impl_in_rule__Construct3__Group_1_3__12620);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1337:1: rule__Construct3__Group_1_3__1__Impl : ( ( rule__Construct3__MaxAssignment_1_3_1 ) ) ;
    public final void rule__Construct3__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1341:1: ( ( ( rule__Construct3__MaxAssignment_1_3_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1342:1: ( ( rule__Construct3__MaxAssignment_1_3_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1342:1: ( ( rule__Construct3__MaxAssignment_1_3_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1343:1: ( rule__Construct3__MaxAssignment_1_3_1 )
            {
             before(grammarAccess.getConstruct3Access().getMaxAssignment_1_3_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1344:1: ( rule__Construct3__MaxAssignment_1_3_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1344:2: rule__Construct3__MaxAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__MaxAssignment_1_3_1_in_rule__Construct3__Group_1_3__1__Impl2647);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1358:1: rule__Construct4__Group_0__0 : rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1 ;
    public final void rule__Construct4__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1362:1: ( rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1363:2: rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__0__Impl_in_rule__Construct4__Group_0__02681);
            rule__Construct4__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__1_in_rule__Construct4__Group_0__02684);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1370:1: rule__Construct4__Group_0__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1374:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1375:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1375:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1376:1: ()
            {
             before(grammarAccess.getConstruct4Access().getReferenceAction_0_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1377:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1379:1: 
            {
            }

             after(grammarAccess.getConstruct4Access().getReferenceAction_0_0()); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1389:1: rule__Construct4__Group_0__1 : rule__Construct4__Group_0__1__Impl ;
    public final void rule__Construct4__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1393:1: ( rule__Construct4__Group_0__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1394:2: rule__Construct4__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__1__Impl_in_rule__Construct4__Group_0__12742);
            rule__Construct4__Group_0__1__Impl();

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1400:1: rule__Construct4__Group_0__1__Impl : ( ( rule__Construct4__TargetAssignment_0_1 ) ) ;
    public final void rule__Construct4__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1404:1: ( ( ( rule__Construct4__TargetAssignment_0_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1405:1: ( ( rule__Construct4__TargetAssignment_0_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1405:1: ( ( rule__Construct4__TargetAssignment_0_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1406:1: ( rule__Construct4__TargetAssignment_0_1 )
            {
             before(grammarAccess.getConstruct4Access().getTargetAssignment_0_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1407:1: ( rule__Construct4__TargetAssignment_0_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1407:2: rule__Construct4__TargetAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__TargetAssignment_0_1_in_rule__Construct4__Group_0__1__Impl2769);
            rule__Construct4__TargetAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getTargetAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Construct4__Group_1__0"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1421:1: rule__Construct4__Group_1__0 : rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1 ;
    public final void rule__Construct4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1425:1: ( rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1426:2: rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__0__Impl_in_rule__Construct4__Group_1__02803);
            rule__Construct4__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__1_in_rule__Construct4__Group_1__02806);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1433:1: rule__Construct4__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1437:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1438:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1438:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1439:1: ()
            {
             before(grammarAccess.getConstruct4Access().getRangeAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1440:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1442:1: 
            {
            }

             after(grammarAccess.getConstruct4Access().getRangeAction_1_0()); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1452:1: rule__Construct4__Group_1__1 : rule__Construct4__Group_1__1__Impl rule__Construct4__Group_1__2 ;
    public final void rule__Construct4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1456:1: ( rule__Construct4__Group_1__1__Impl rule__Construct4__Group_1__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1457:2: rule__Construct4__Group_1__1__Impl rule__Construct4__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__1__Impl_in_rule__Construct4__Group_1__12864);
            rule__Construct4__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__2_in_rule__Construct4__Group_1__12867);
            rule__Construct4__Group_1__2();

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1464:1: rule__Construct4__Group_1__1__Impl : ( ( rule__Construct4__MinAssignment_1_1 ) ) ;
    public final void rule__Construct4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1468:1: ( ( ( rule__Construct4__MinAssignment_1_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1469:1: ( ( rule__Construct4__MinAssignment_1_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1469:1: ( ( rule__Construct4__MinAssignment_1_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1470:1: ( rule__Construct4__MinAssignment_1_1 )
            {
             before(grammarAccess.getConstruct4Access().getMinAssignment_1_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1471:1: ( rule__Construct4__MinAssignment_1_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1471:2: rule__Construct4__MinAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__MinAssignment_1_1_in_rule__Construct4__Group_1__1__Impl2894);
            rule__Construct4__MinAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getMinAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Construct4__Group_1__2"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1481:1: rule__Construct4__Group_1__2 : rule__Construct4__Group_1__2__Impl rule__Construct4__Group_1__3 ;
    public final void rule__Construct4__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1485:1: ( rule__Construct4__Group_1__2__Impl rule__Construct4__Group_1__3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1486:2: rule__Construct4__Group_1__2__Impl rule__Construct4__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__2__Impl_in_rule__Construct4__Group_1__22924);
            rule__Construct4__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__3_in_rule__Construct4__Group_1__22927);
            rule__Construct4__Group_1__3();

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
    // $ANTLR end "rule__Construct4__Group_1__2"


    // $ANTLR start "rule__Construct4__Group_1__2__Impl"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1493:1: rule__Construct4__Group_1__2__Impl : ( '..' ) ;
    public final void rule__Construct4__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1497:1: ( ( '..' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1498:1: ( '..' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1498:1: ( '..' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1499:1: '..'
            {
             before(grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_1_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Construct4__Group_1__2__Impl2955); 
             after(grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__Group_1__2__Impl"


    // $ANTLR start "rule__Construct4__Group_1__3"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1512:1: rule__Construct4__Group_1__3 : rule__Construct4__Group_1__3__Impl ;
    public final void rule__Construct4__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1516:1: ( rule__Construct4__Group_1__3__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1517:2: rule__Construct4__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__3__Impl_in_rule__Construct4__Group_1__32986);
            rule__Construct4__Group_1__3__Impl();

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
    // $ANTLR end "rule__Construct4__Group_1__3"


    // $ANTLR start "rule__Construct4__Group_1__3__Impl"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1523:1: rule__Construct4__Group_1__3__Impl : ( ( rule__Construct4__MaxAssignment_1_3 ) ) ;
    public final void rule__Construct4__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1527:1: ( ( ( rule__Construct4__MaxAssignment_1_3 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1528:1: ( ( rule__Construct4__MaxAssignment_1_3 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1528:1: ( ( rule__Construct4__MaxAssignment_1_3 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1529:1: ( rule__Construct4__MaxAssignment_1_3 )
            {
             before(grammarAccess.getConstruct4Access().getMaxAssignment_1_3()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1530:1: ( rule__Construct4__MaxAssignment_1_3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1530:2: rule__Construct4__MaxAssignment_1_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__MaxAssignment_1_3_in_rule__Construct4__Group_1__3__Impl3013);
            rule__Construct4__MaxAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getMaxAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__Group_1__3__Impl"


    // $ANTLR start "rule__Construct4__Group_2__0"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1548:1: rule__Construct4__Group_2__0 : rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1 ;
    public final void rule__Construct4__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1552:1: ( rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1553:2: rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_2__0__Impl_in_rule__Construct4__Group_2__03051);
            rule__Construct4__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_2__1_in_rule__Construct4__Group_2__03054);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1560:1: rule__Construct4__Group_2__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1564:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1565:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1565:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1566:1: ()
            {
             before(grammarAccess.getConstruct4Access().getKeywordAction_2_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1567:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1569:1: 
            {
            }

             after(grammarAccess.getConstruct4Access().getKeywordAction_2_0()); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1579:1: rule__Construct4__Group_2__1 : rule__Construct4__Group_2__1__Impl ;
    public final void rule__Construct4__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1583:1: ( rule__Construct4__Group_2__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1584:2: rule__Construct4__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_2__1__Impl_in_rule__Construct4__Group_2__13112);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1590:1: rule__Construct4__Group_2__1__Impl : ( ( rule__Construct4__ValueAssignment_2_1 ) ) ;
    public final void rule__Construct4__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1594:1: ( ( ( rule__Construct4__ValueAssignment_2_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1595:1: ( ( rule__Construct4__ValueAssignment_2_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1595:1: ( ( rule__Construct4__ValueAssignment_2_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1596:1: ( rule__Construct4__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstruct4Access().getValueAssignment_2_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1597:1: ( rule__Construct4__ValueAssignment_2_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1597:2: rule__Construct4__ValueAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__ValueAssignment_2_1_in_rule__Construct4__Group_2__1__Impl3139);
            rule__Construct4__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstruct4Access().getValueAssignment_2_1()); 

            }


            }

        }
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1611:1: rule__Construct4__Group_3__0 : rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1 ;
    public final void rule__Construct4__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1615:1: ( rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1616:2: rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_3__0__Impl_in_rule__Construct4__Group_3__03173);
            rule__Construct4__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_3__1_in_rule__Construct4__Group_3__03176);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1623:1: rule__Construct4__Group_3__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1627:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1628:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1628:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1629:1: ()
            {
             before(grammarAccess.getConstruct4Access().getAnyAction_3_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1630:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1632:1: 
            {
            }

             after(grammarAccess.getConstruct4Access().getAnyAction_3_0()); 

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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1642:1: rule__Construct4__Group_3__1 : rule__Construct4__Group_3__1__Impl ;
    public final void rule__Construct4__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1646:1: ( rule__Construct4__Group_3__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1647:2: rule__Construct4__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_3__1__Impl_in_rule__Construct4__Group_3__13234);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1653:1: rule__Construct4__Group_3__1__Impl : ( '.' ) ;
    public final void rule__Construct4__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1657:1: ( ( '.' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1658:1: ( '.' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1658:1: ( '.' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1659:1: '.'
            {
             before(grammarAccess.getConstruct4Access().getFullStopKeyword_3_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Construct4__Group_3__1__Impl3262); 
             after(grammarAccess.getConstruct4Access().getFullStopKeyword_3_1()); 

            }


            }

        }
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1676:1: rule__Construct4__Group_4__0 : rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1 ;
    public final void rule__Construct4__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1680:1: ( rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1681:2: rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__0__Impl_in_rule__Construct4__Group_4__03297);
            rule__Construct4__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__1_in_rule__Construct4__Group_4__03300);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1688:1: rule__Construct4__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Construct4__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1692:1: ( ( '(' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1693:1: ( '(' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1693:1: ( '(' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1694:1: '('
            {
             before(grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Construct4__Group_4__0__Impl3328); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1707:1: rule__Construct4__Group_4__1 : rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2 ;
    public final void rule__Construct4__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1711:1: ( rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1712:2: rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__1__Impl_in_rule__Construct4__Group_4__13359);
            rule__Construct4__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__2_in_rule__Construct4__Group_4__13362);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1719:1: rule__Construct4__Group_4__1__Impl : ( ruleConstruct0 ) ;
    public final void rule__Construct4__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1723:1: ( ( ruleConstruct0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1724:1: ( ruleConstruct0 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1724:1: ( ruleConstruct0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1725:1: ruleConstruct0
            {
             before(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct0_in_rule__Construct4__Group_4__1__Impl3389);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1736:1: rule__Construct4__Group_4__2 : rule__Construct4__Group_4__2__Impl ;
    public final void rule__Construct4__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1740:1: ( rule__Construct4__Group_4__2__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1741:2: rule__Construct4__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__2__Impl_in_rule__Construct4__Group_4__23418);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1747:1: rule__Construct4__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Construct4__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1751:1: ( ( ')' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1752:1: ( ')' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1752:1: ( ')' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1753:1: ')'
            {
             before(grammarAccess.getConstruct4Access().getRightParenthesisKeyword_4_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Construct4__Group_4__2__Impl3446); 
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


    // $ANTLR start "rule__Grammar__DefinitionsAssignment_1"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1773:1: rule__Grammar__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Grammar__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1777:1: ( ( ruleDefinition ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1778:1: ( ruleDefinition )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1778:1: ( ruleDefinition )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1779:1: ruleDefinition
            {
             before(grammarAccess.getGrammarAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDefinition_in_rule__Grammar__DefinitionsAssignment_13488);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__DefinitionsAssignment_1"


    // $ANTLR start "rule__Definition__LexicalAssignment_1"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1788:1: rule__Definition__LexicalAssignment_1 : ( ( 'lexical' ) ) ;
    public final void rule__Definition__LexicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1792:1: ( ( ( 'lexical' ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1793:1: ( ( 'lexical' ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1793:1: ( ( 'lexical' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1794:1: ( 'lexical' )
            {
             before(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1795:1: ( 'lexical' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1796:1: 'lexical'
            {
             before(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Definition__LexicalAssignment_13524); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1811:1: rule__Definition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1815:1: ( ( RULE_ID ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1816:1: ( RULE_ID )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1816:1: ( RULE_ID )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1817:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_23563); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1826:1: rule__Definition__RhsAssignment_4 : ( ruleConstruct0 ) ;
    public final void rule__Definition__RhsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1830:1: ( ( ruleConstruct0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1831:1: ( ruleConstruct0 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1831:1: ( ruleConstruct0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1832:1: ruleConstruct0
            {
             before(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct0_in_rule__Definition__RhsAssignment_43594);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1841:1: rule__Construct0__OperandsAssignment_1_2 : ( ruleConstruct1 ) ;
    public final void rule__Construct0__OperandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1845:1: ( ( ruleConstruct1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1846:1: ( ruleConstruct1 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1846:1: ( ruleConstruct1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1847:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_23625);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1856:1: rule__Construct0__OperandsAssignment_1_3_1 : ( ruleConstruct1 ) ;
    public final void rule__Construct0__OperandsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1860:1: ( ( ruleConstruct1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1861:1: ( ruleConstruct1 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1861:1: ( ruleConstruct1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1862:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_3_13656);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1871:1: rule__Construct1__OperandsAssignment_1_1 : ( ruleConstruct2 ) ;
    public final void rule__Construct1__OperandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1875:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1876:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1876:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1877:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_13687);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1886:1: rule__Construct1__OperandsAssignment_1_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct1__OperandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1890:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1891:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1891:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1892:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_23718);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1901:1: rule__Construct2__OperandAssignment_0_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct2__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1905:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1906:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1906:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1907:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_0_23749);
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


    // $ANTLR start "rule__Construct3__MinAssignment_1_2"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1916:1: rule__Construct3__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Construct3__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1920:1: ( ( RULE_INT ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1921:1: ( RULE_INT )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1921:1: ( RULE_INT )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1922:1: RULE_INT
            {
             before(grammarAccess.getConstruct3Access().getMinINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Construct3__MinAssignment_1_23780); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1931:1: rule__Construct3__UpperBoundedAssignment_1_3_0 : ( ( ',' ) ) ;
    public final void rule__Construct3__UpperBoundedAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1935:1: ( ( ( ',' ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1936:1: ( ( ',' ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1936:1: ( ( ',' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1937:1: ( ',' )
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1938:1: ( ',' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1939:1: ','
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Construct3__UpperBoundedAssignment_1_3_03816); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1954:1: rule__Construct3__MaxAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__Construct3__MaxAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1958:1: ( ( RULE_INT ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1959:1: ( RULE_INT )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1959:1: ( RULE_INT )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1960:1: RULE_INT
            {
             before(grammarAccess.getConstruct3Access().getMaxINTTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Construct3__MaxAssignment_1_3_13855); 
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


    // $ANTLR start "rule__Construct4__TargetAssignment_0_1"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1969:1: rule__Construct4__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Construct4__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1973:1: ( ( ( RULE_ID ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1974:1: ( ( RULE_ID ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1974:1: ( ( RULE_ID ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1975:1: ( RULE_ID )
            {
             before(grammarAccess.getConstruct4Access().getTargetDefinitionCrossReference_0_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1976:1: ( RULE_ID )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1977:1: RULE_ID
            {
             before(grammarAccess.getConstruct4Access().getTargetDefinitionIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Construct4__TargetAssignment_0_13890); 
             after(grammarAccess.getConstruct4Access().getTargetDefinitionIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getConstruct4Access().getTargetDefinitionCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__TargetAssignment_0_1"


    // $ANTLR start "rule__Construct4__MinAssignment_1_1"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1988:1: rule__Construct4__MinAssignment_1_1 : ( RULE_CHAR ) ;
    public final void rule__Construct4__MinAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1992:1: ( ( RULE_CHAR ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1993:1: ( RULE_CHAR )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1993:1: ( RULE_CHAR )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1994:1: RULE_CHAR
            {
             before(grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_1_1_0()); 
            match(input,RULE_CHAR,FollowSets000.FOLLOW_RULE_CHAR_in_rule__Construct4__MinAssignment_1_13925); 
             after(grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__MinAssignment_1_1"


    // $ANTLR start "rule__Construct4__MaxAssignment_1_3"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2003:1: rule__Construct4__MaxAssignment_1_3 : ( RULE_CHAR ) ;
    public final void rule__Construct4__MaxAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2007:1: ( ( RULE_CHAR ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2008:1: ( RULE_CHAR )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2008:1: ( RULE_CHAR )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2009:1: RULE_CHAR
            {
             before(grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_1_3_0()); 
            match(input,RULE_CHAR,FollowSets000.FOLLOW_RULE_CHAR_in_rule__Construct4__MaxAssignment_1_33956); 
             after(grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__MaxAssignment_1_3"


    // $ANTLR start "rule__Construct4__ValueAssignment_2_1"
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2018:1: rule__Construct4__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Construct4__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2022:1: ( ( RULE_STRING ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2023:1: ( RULE_STRING )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2023:1: ( RULE_STRING )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2024:1: RULE_STRING
            {
             before(grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Construct4__ValueAssignment_2_13987); 
             after(grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Construct4__ValueAssignment_2_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGrammar_in_entryRuleGrammar61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammar68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grammar__Group__0_in_ruleGrammar94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefinition128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct0_in_entryRuleConstruct0181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct0188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group__0_in_ruleConstruct0214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_entryRuleConstruct1241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct1248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group__0_in_ruleConstruct1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_entryRuleConstruct2301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Alternatives_in_ruleConstruct2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct3_in_entryRuleConstruct3361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct3368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group__0_in_ruleConstruct3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct4_in_entryRuleConstruct4421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct4428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Alternatives_in_ruleConstruct4454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__0_in_rule__Construct2__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct3_in_rule__Construct2__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__0_in_rule__Construct4__Alternatives540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__0_in_rule__Construct4__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_2__0_in_rule__Construct4__Alternatives576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_3__0_in_rule__Construct4__Alternatives594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__0_in_rule__Construct4__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grammar__Group__0__Impl_in_rule__Grammar__Group__0643 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_rule__Grammar__Group__1_in_rule__Grammar__Group__0646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grammar__Group__1__Impl_in_rule__Grammar__Group__1704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grammar__DefinitionsAssignment_1_in_rule__Grammar__Group__1__Impl731 = new BitSet(new long[]{0x0000000000200012L});
        public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0766 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1827 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__LexicalAssignment_1_in_rule__Definition__Group__1__Impl857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2888 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__2891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__NameAssignment_2_in_rule__Definition__Group__2__Impl918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__3948 = new BitSet(new long[]{0x00000000000C40D0L});
        public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__3951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Definition__Group__3__Impl979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__41010 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__41013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__RhsAssignment_4_in_rule__Definition__Group__4__Impl1040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__51070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Definition__Group__5__Impl1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group__0__Impl_in_rule__Construct0__Group__01141 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Construct0__Group__1_in_rule__Construct0__Group__01144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__Group__0__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group__1__Impl_in_rule__Construct0__Group__11200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__0_in_rule__Construct0__Group__1__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__0__Impl_in_rule__Construct0__Group_1__01262 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__1_in_rule__Construct0__Group_1__01265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__1__Impl_in_rule__Construct0__Group_1__11323 = new BitSet(new long[]{0x00000000000C40D0L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__2_in_rule__Construct0__Group_1__11326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Construct0__Group_1__1__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__2__Impl_in_rule__Construct0__Group_1__21385 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__3_in_rule__Construct0__Group_1__21388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__OperandsAssignment_1_2_in_rule__Construct0__Group_1__2__Impl1415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__3__Impl_in_rule__Construct0__Group_1__31445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1_3__0_in_rule__Construct0__Group_1__3__Impl1472 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1_3__0__Impl_in_rule__Construct0__Group_1_3__01511 = new BitSet(new long[]{0x00000000000C40D0L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1_3__1_in_rule__Construct0__Group_1_3__01514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Construct0__Group_1_3__0__Impl1542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1_3__1__Impl_in_rule__Construct0__Group_1_3__11573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__OperandsAssignment_1_3_1_in_rule__Construct0__Group_1_3__1__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group__0__Impl_in_rule__Construct1__Group__01634 = new BitSet(new long[]{0x00000000000C40D0L});
        public static final BitSet FOLLOW_rule__Construct1__Group__1_in_rule__Construct1__Group__01637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__Group__0__Impl1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group__1__Impl_in_rule__Construct1__Group__11693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__0_in_rule__Construct1__Group__1__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__0__Impl_in_rule__Construct1__Group_1__01755 = new BitSet(new long[]{0x00000000000C40D0L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__1_in_rule__Construct1__Group_1__01758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__1__Impl_in_rule__Construct1__Group_1__11816 = new BitSet(new long[]{0x00000000000C40D0L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__2_in_rule__Construct1__Group_1__11819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__OperandsAssignment_1_1_in_rule__Construct1__Group_1__1__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__2__Impl_in_rule__Construct1__Group_1__21876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__OperandsAssignment_1_2_in_rule__Construct1__Group_1__2__Impl1903 = new BitSet(new long[]{0x00000000000C40D2L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__0__Impl_in_rule__Construct2__Group_0__01940 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__1_in_rule__Construct2__Group_0__01943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__1__Impl_in_rule__Construct2__Group_0__12001 = new BitSet(new long[]{0x00000000000C40D0L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__2_in_rule__Construct2__Group_0__12004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Construct2__Group_0__1__Impl2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__2__Impl_in_rule__Construct2__Group_0__22063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__OperandAssignment_0_2_in_rule__Construct2__Group_0__2__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group__0__Impl_in_rule__Construct3__Group__02126 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Construct3__Group__1_in_rule__Construct3__Group__02129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct4_in_rule__Construct3__Group__0__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group__1__Impl_in_rule__Construct3__Group__12185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__0_in_rule__Construct3__Group__1__Impl2212 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__0__Impl_in_rule__Construct3__Group_1__02247 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__1_in_rule__Construct3__Group_1__02250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__1__Impl_in_rule__Construct3__Group_1__12308 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__2_in_rule__Construct3__Group_1__12311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Construct3__Group_1__1__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__2__Impl_in_rule__Construct3__Group_1__22370 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__3_in_rule__Construct3__Group_1__22373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__MinAssignment_1_2_in_rule__Construct3__Group_1__2__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__3__Impl_in_rule__Construct3__Group_1__32430 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__4_in_rule__Construct3__Group_1__32433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1_3__0_in_rule__Construct3__Group_1__3__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__4__Impl_in_rule__Construct3__Group_1__42491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Construct3__Group_1__4__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1_3__0__Impl_in_rule__Construct3__Group_1_3__02560 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1_3__1_in_rule__Construct3__Group_1_3__02563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__UpperBoundedAssignment_1_3_0_in_rule__Construct3__Group_1_3__0__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1_3__1__Impl_in_rule__Construct3__Group_1_3__12620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__MaxAssignment_1_3_1_in_rule__Construct3__Group_1_3__1__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__0__Impl_in_rule__Construct4__Group_0__02681 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__1_in_rule__Construct4__Group_0__02684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__1__Impl_in_rule__Construct4__Group_0__12742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__TargetAssignment_0_1_in_rule__Construct4__Group_0__1__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__0__Impl_in_rule__Construct4__Group_1__02803 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__1_in_rule__Construct4__Group_1__02806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__1__Impl_in_rule__Construct4__Group_1__12864 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__2_in_rule__Construct4__Group_1__12867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__MinAssignment_1_1_in_rule__Construct4__Group_1__1__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__2__Impl_in_rule__Construct4__Group_1__22924 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__3_in_rule__Construct4__Group_1__22927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Construct4__Group_1__2__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__3__Impl_in_rule__Construct4__Group_1__32986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__MaxAssignment_1_3_in_rule__Construct4__Group_1__3__Impl3013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_2__0__Impl_in_rule__Construct4__Group_2__03051 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__Construct4__Group_2__1_in_rule__Construct4__Group_2__03054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_2__1__Impl_in_rule__Construct4__Group_2__13112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__ValueAssignment_2_1_in_rule__Construct4__Group_2__1__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_3__0__Impl_in_rule__Construct4__Group_3__03173 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Construct4__Group_3__1_in_rule__Construct4__Group_3__03176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_3__1__Impl_in_rule__Construct4__Group_3__13234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Construct4__Group_3__1__Impl3262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__0__Impl_in_rule__Construct4__Group_4__03297 = new BitSet(new long[]{0x00000000000C40D0L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__1_in_rule__Construct4__Group_4__03300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Construct4__Group_4__0__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__1__Impl_in_rule__Construct4__Group_4__13359 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__2_in_rule__Construct4__Group_4__13362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct0_in_rule__Construct4__Group_4__1__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__2__Impl_in_rule__Construct4__Group_4__23418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Construct4__Group_4__2__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefinition_in_rule__Grammar__DefinitionsAssignment_13488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Definition__LexicalAssignment_13524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_23563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct0_in_rule__Definition__RhsAssignment_43594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_23625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_3_13656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_13687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_23718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_0_23749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Construct3__MinAssignment_1_23780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Construct3__UpperBoundedAssignment_1_3_03816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Construct3__MaxAssignment_1_3_13855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Construct4__TargetAssignment_0_13890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CHAR_in_rule__Construct4__MinAssignment_1_13925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CHAR_in_rule__Construct4__MaxAssignment_1_33956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Construct4__ValueAssignment_2_13987 = new BitSet(new long[]{0x0000000000000002L});
    }


}