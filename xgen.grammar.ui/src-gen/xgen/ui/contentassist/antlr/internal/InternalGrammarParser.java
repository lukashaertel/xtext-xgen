package xgen.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import xgen.services.GrammarGrammarAccess;

@SuppressWarnings("all")
public class InternalGrammarParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_CHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "':'", "';'", "'|'", "'!'", "'->'", "'{'", "'}'", "'..'", "'.'", "'('", "')'", "'lexical'", "','"
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
    public static final int T__23=23;
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:256:1: rule__Construct2__Alternatives : ( ( ( rule__Construct2__Group_0__0 ) ) | ( ( rule__Construct2__Group_1__0 ) ) | ( ruleConstruct3 ) );
    public final void rule__Construct2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:260:1: ( ( ( rule__Construct2__Group_0__0 ) ) | ( ( rule__Construct2__Group_1__0 ) ) | ( ruleConstruct3 ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
            case RULE_CHAR:
            case RULE_STRING:
            case 19:
            case 20:
                {
                alt1=3;
                }
                break;
            default:
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
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:267:6: ( ( rule__Construct2__Group_1__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:267:6: ( ( rule__Construct2__Group_1__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:268:1: ( rule__Construct2__Group_1__0 )
                    {
                     before(grammarAccess.getConstruct2Access().getGroup_1()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:269:1: ( rule__Construct2__Group_1__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:269:2: rule__Construct2__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_1__0_in_rule__Construct2__Alternatives508);
                    rule__Construct2__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct2Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:273:6: ( ruleConstruct3 )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:273:6: ( ruleConstruct3 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:274:1: ruleConstruct3
                    {
                     before(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstruct3_in_rule__Construct2__Alternatives526);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:284:1: rule__Construct4__Alternatives : ( ( ( rule__Construct4__Group_0__0 ) ) | ( ( rule__Construct4__Group_1__0 ) ) | ( ( rule__Construct4__Group_2__0 ) ) | ( ( rule__Construct4__Group_3__0 ) ) | ( ( rule__Construct4__Group_4__0 ) ) );
    public final void rule__Construct4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:288:1: ( ( ( rule__Construct4__Group_0__0 ) ) | ( ( rule__Construct4__Group_1__0 ) ) | ( ( rule__Construct4__Group_2__0 ) ) | ( ( rule__Construct4__Group_3__0 ) ) | ( ( rule__Construct4__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_CHAR:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
                {
                alt2=4;
                }
                break;
            case 20:
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
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:289:1: ( ( rule__Construct4__Group_0__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:289:1: ( ( rule__Construct4__Group_0__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:290:1: ( rule__Construct4__Group_0__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_0()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:291:1: ( rule__Construct4__Group_0__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:291:2: rule__Construct4__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__0_in_rule__Construct4__Alternatives558);
                    rule__Construct4__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:295:6: ( ( rule__Construct4__Group_1__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:295:6: ( ( rule__Construct4__Group_1__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:296:1: ( rule__Construct4__Group_1__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_1()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:297:1: ( rule__Construct4__Group_1__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:297:2: rule__Construct4__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__0_in_rule__Construct4__Alternatives576);
                    rule__Construct4__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:301:6: ( ( rule__Construct4__Group_2__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:301:6: ( ( rule__Construct4__Group_2__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:302:1: ( rule__Construct4__Group_2__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_2()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:303:1: ( rule__Construct4__Group_2__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:303:2: rule__Construct4__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_2__0_in_rule__Construct4__Alternatives594);
                    rule__Construct4__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:307:6: ( ( rule__Construct4__Group_3__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:307:6: ( ( rule__Construct4__Group_3__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:308:1: ( rule__Construct4__Group_3__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_3()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:309:1: ( rule__Construct4__Group_3__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:309:2: rule__Construct4__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_3__0_in_rule__Construct4__Alternatives612);
                    rule__Construct4__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstruct4Access().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:313:6: ( ( rule__Construct4__Group_4__0 ) )
                    {
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:313:6: ( ( rule__Construct4__Group_4__0 ) )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:314:1: ( rule__Construct4__Group_4__0 )
                    {
                     before(grammarAccess.getConstruct4Access().getGroup_4()); 
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:315:1: ( rule__Construct4__Group_4__0 )
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:315:2: rule__Construct4__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__0_in_rule__Construct4__Alternatives630);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:326:1: rule__Grammar__Group__0 : rule__Grammar__Group__0__Impl rule__Grammar__Group__1 ;
    public final void rule__Grammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:330:1: ( rule__Grammar__Group__0__Impl rule__Grammar__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:331:2: rule__Grammar__Group__0__Impl rule__Grammar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grammar__Group__0__Impl_in_rule__Grammar__Group__0661);
            rule__Grammar__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grammar__Group__1_in_rule__Grammar__Group__0664);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:338:1: rule__Grammar__Group__0__Impl : ( () ) ;
    public final void rule__Grammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:342:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:343:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:343:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:344:1: ()
            {
             before(grammarAccess.getGrammarAccess().getGrammarAction_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:345:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:347:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:357:1: rule__Grammar__Group__1 : rule__Grammar__Group__1__Impl ;
    public final void rule__Grammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:361:1: ( rule__Grammar__Group__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:362:2: rule__Grammar__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grammar__Group__1__Impl_in_rule__Grammar__Group__1722);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:368:1: rule__Grammar__Group__1__Impl : ( ( rule__Grammar__DefinitionsAssignment_1 )* ) ;
    public final void rule__Grammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:372:1: ( ( ( rule__Grammar__DefinitionsAssignment_1 )* ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:373:1: ( ( rule__Grammar__DefinitionsAssignment_1 )* )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:373:1: ( ( rule__Grammar__DefinitionsAssignment_1 )* )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:374:1: ( rule__Grammar__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getGrammarAccess().getDefinitionsAssignment_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:375:1: ( rule__Grammar__DefinitionsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:375:2: rule__Grammar__DefinitionsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Grammar__DefinitionsAssignment_1_in_rule__Grammar__Group__1__Impl749);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:389:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:393:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:394:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0784);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0787);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:401:1: rule__Definition__Group__0__Impl : ( () ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:405:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:406:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:406:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:407:1: ()
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAction_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:408:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:410:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:420:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:424:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:425:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1845);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1848);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:432:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__LexicalAssignment_1 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:436:1: ( ( ( rule__Definition__LexicalAssignment_1 )? ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:437:1: ( ( rule__Definition__LexicalAssignment_1 )? )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:437:1: ( ( rule__Definition__LexicalAssignment_1 )? )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:438:1: ( rule__Definition__LexicalAssignment_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getLexicalAssignment_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:439:1: ( rule__Definition__LexicalAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:439:2: rule__Definition__LexicalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Definition__LexicalAssignment_1_in_rule__Definition__Group__1__Impl875);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:449:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:453:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:454:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2906);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__2909);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:461:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__NameAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:465:1: ( ( ( rule__Definition__NameAssignment_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:466:1: ( ( rule__Definition__NameAssignment_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:466:1: ( ( rule__Definition__NameAssignment_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:467:1: ( rule__Definition__NameAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:468:1: ( rule__Definition__NameAssignment_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:468:2: rule__Definition__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__NameAssignment_2_in_rule__Definition__Group__2__Impl936);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:478:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:482:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:483:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__3966);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__3969);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:490:1: rule__Definition__Group__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:494:1: ( ( ':' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:495:1: ( ':' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:495:1: ( ':' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:496:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Definition__Group__3__Impl997); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:509:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:513:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:514:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__41028);
            rule__Definition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__41031);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:521:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__RhsAssignment_4 ) ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:525:1: ( ( ( rule__Definition__RhsAssignment_4 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:526:1: ( ( rule__Definition__RhsAssignment_4 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:526:1: ( ( rule__Definition__RhsAssignment_4 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:527:1: ( rule__Definition__RhsAssignment_4 )
            {
             before(grammarAccess.getDefinitionAccess().getRhsAssignment_4()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:528:1: ( rule__Definition__RhsAssignment_4 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:528:2: rule__Definition__RhsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__RhsAssignment_4_in_rule__Definition__Group__4__Impl1058);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:538:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:542:1: ( rule__Definition__Group__5__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:543:2: rule__Definition__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__51088);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:549:1: rule__Definition__Group__5__Impl : ( ';' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:553:1: ( ( ';' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:554:1: ( ';' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:554:1: ( ';' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:555:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Definition__Group__5__Impl1116); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:580:1: rule__Construct0__Group__0 : rule__Construct0__Group__0__Impl rule__Construct0__Group__1 ;
    public final void rule__Construct0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:584:1: ( rule__Construct0__Group__0__Impl rule__Construct0__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:585:2: rule__Construct0__Group__0__Impl rule__Construct0__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group__0__Impl_in_rule__Construct0__Group__01159);
            rule__Construct0__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group__1_in_rule__Construct0__Group__01162);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:592:1: rule__Construct0__Group__0__Impl : ( ruleConstruct1 ) ;
    public final void rule__Construct0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:596:1: ( ( ruleConstruct1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:597:1: ( ruleConstruct1 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:597:1: ( ruleConstruct1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:598:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_rule__Construct0__Group__0__Impl1189);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:609:1: rule__Construct0__Group__1 : rule__Construct0__Group__1__Impl ;
    public final void rule__Construct0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:613:1: ( rule__Construct0__Group__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:614:2: rule__Construct0__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group__1__Impl_in_rule__Construct0__Group__11218);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:620:1: rule__Construct0__Group__1__Impl : ( ( rule__Construct0__Group_1__0 )? ) ;
    public final void rule__Construct0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:624:1: ( ( ( rule__Construct0__Group_1__0 )? ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:625:1: ( ( rule__Construct0__Group_1__0 )? )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:625:1: ( ( rule__Construct0__Group_1__0 )? )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:626:1: ( rule__Construct0__Group_1__0 )?
            {
             before(grammarAccess.getConstruct0Access().getGroup_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:627:1: ( rule__Construct0__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:627:2: rule__Construct0__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__0_in_rule__Construct0__Group__1__Impl1245);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:641:1: rule__Construct0__Group_1__0 : rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1 ;
    public final void rule__Construct0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:645:1: ( rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:646:2: rule__Construct0__Group_1__0__Impl rule__Construct0__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__0__Impl_in_rule__Construct0__Group_1__01280);
            rule__Construct0__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__1_in_rule__Construct0__Group_1__01283);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:653:1: rule__Construct0__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:657:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:658:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:658:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:659:1: ()
            {
             before(grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:660:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:662:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:672:1: rule__Construct0__Group_1__1 : rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2 ;
    public final void rule__Construct0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:676:1: ( rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:677:2: rule__Construct0__Group_1__1__Impl rule__Construct0__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__1__Impl_in_rule__Construct0__Group_1__11341);
            rule__Construct0__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__2_in_rule__Construct0__Group_1__11344);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:684:1: rule__Construct0__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Construct0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:688:1: ( ( '|' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:689:1: ( '|' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:689:1: ( '|' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:690:1: '|'
            {
             before(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Construct0__Group_1__1__Impl1372); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:703:1: rule__Construct0__Group_1__2 : rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3 ;
    public final void rule__Construct0__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:707:1: ( rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:708:2: rule__Construct0__Group_1__2__Impl rule__Construct0__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__2__Impl_in_rule__Construct0__Group_1__21403);
            rule__Construct0__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__3_in_rule__Construct0__Group_1__21406);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:715:1: rule__Construct0__Group_1__2__Impl : ( ( rule__Construct0__OperandsAssignment_1_2 ) ) ;
    public final void rule__Construct0__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:719:1: ( ( ( rule__Construct0__OperandsAssignment_1_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:720:1: ( ( rule__Construct0__OperandsAssignment_1_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:720:1: ( ( rule__Construct0__OperandsAssignment_1_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:721:1: ( rule__Construct0__OperandsAssignment_1_2 )
            {
             before(grammarAccess.getConstruct0Access().getOperandsAssignment_1_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:722:1: ( rule__Construct0__OperandsAssignment_1_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:722:2: rule__Construct0__OperandsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__OperandsAssignment_1_2_in_rule__Construct0__Group_1__2__Impl1433);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:732:1: rule__Construct0__Group_1__3 : rule__Construct0__Group_1__3__Impl ;
    public final void rule__Construct0__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:736:1: ( rule__Construct0__Group_1__3__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:737:2: rule__Construct0__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1__3__Impl_in_rule__Construct0__Group_1__31463);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:743:1: rule__Construct0__Group_1__3__Impl : ( ( rule__Construct0__Group_1_3__0 )* ) ;
    public final void rule__Construct0__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:747:1: ( ( ( rule__Construct0__Group_1_3__0 )* ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:748:1: ( ( rule__Construct0__Group_1_3__0 )* )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:748:1: ( ( rule__Construct0__Group_1_3__0 )* )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:749:1: ( rule__Construct0__Group_1_3__0 )*
            {
             before(grammarAccess.getConstruct0Access().getGroup_1_3()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:750:1: ( rule__Construct0__Group_1_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:750:2: rule__Construct0__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1_3__0_in_rule__Construct0__Group_1__3__Impl1490);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:768:1: rule__Construct0__Group_1_3__0 : rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1 ;
    public final void rule__Construct0__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:772:1: ( rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:773:2: rule__Construct0__Group_1_3__0__Impl rule__Construct0__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1_3__0__Impl_in_rule__Construct0__Group_1_3__01529);
            rule__Construct0__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1_3__1_in_rule__Construct0__Group_1_3__01532);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:780:1: rule__Construct0__Group_1_3__0__Impl : ( '|' ) ;
    public final void rule__Construct0__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:784:1: ( ( '|' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:785:1: ( '|' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:785:1: ( '|' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:786:1: '|'
            {
             before(grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Construct0__Group_1_3__0__Impl1560); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:799:1: rule__Construct0__Group_1_3__1 : rule__Construct0__Group_1_3__1__Impl ;
    public final void rule__Construct0__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:803:1: ( rule__Construct0__Group_1_3__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:804:2: rule__Construct0__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__Group_1_3__1__Impl_in_rule__Construct0__Group_1_3__11591);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:810:1: rule__Construct0__Group_1_3__1__Impl : ( ( rule__Construct0__OperandsAssignment_1_3_1 ) ) ;
    public final void rule__Construct0__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:814:1: ( ( ( rule__Construct0__OperandsAssignment_1_3_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:815:1: ( ( rule__Construct0__OperandsAssignment_1_3_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:815:1: ( ( rule__Construct0__OperandsAssignment_1_3_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:816:1: ( rule__Construct0__OperandsAssignment_1_3_1 )
            {
             before(grammarAccess.getConstruct0Access().getOperandsAssignment_1_3_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:817:1: ( rule__Construct0__OperandsAssignment_1_3_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:817:2: rule__Construct0__OperandsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct0__OperandsAssignment_1_3_1_in_rule__Construct0__Group_1_3__1__Impl1618);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:831:1: rule__Construct1__Group__0 : rule__Construct1__Group__0__Impl rule__Construct1__Group__1 ;
    public final void rule__Construct1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:835:1: ( rule__Construct1__Group__0__Impl rule__Construct1__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:836:2: rule__Construct1__Group__0__Impl rule__Construct1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group__0__Impl_in_rule__Construct1__Group__01652);
            rule__Construct1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group__1_in_rule__Construct1__Group__01655);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:843:1: rule__Construct1__Group__0__Impl : ( ruleConstruct2 ) ;
    public final void rule__Construct1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:847:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:848:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:848:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:849:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct1__Group__0__Impl1682);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:860:1: rule__Construct1__Group__1 : rule__Construct1__Group__1__Impl ;
    public final void rule__Construct1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:864:1: ( rule__Construct1__Group__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:865:2: rule__Construct1__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group__1__Impl_in_rule__Construct1__Group__11711);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:871:1: rule__Construct1__Group__1__Impl : ( ( rule__Construct1__Group_1__0 )? ) ;
    public final void rule__Construct1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:875:1: ( ( ( rule__Construct1__Group_1__0 )? ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:876:1: ( ( rule__Construct1__Group_1__0 )? )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:876:1: ( ( rule__Construct1__Group_1__0 )? )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:877:1: ( rule__Construct1__Group_1__0 )?
            {
             before(grammarAccess.getConstruct1Access().getGroup_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:878:1: ( rule__Construct1__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=RULE_CHAR && LA7_0<=RULE_STRING)||(LA7_0>=14 && LA7_0<=15)||(LA7_0>=19 && LA7_0<=20)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:878:2: rule__Construct1__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__0_in_rule__Construct1__Group__1__Impl1738);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:892:1: rule__Construct1__Group_1__0 : rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1 ;
    public final void rule__Construct1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:896:1: ( rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:897:2: rule__Construct1__Group_1__0__Impl rule__Construct1__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__0__Impl_in_rule__Construct1__Group_1__01773);
            rule__Construct1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__1_in_rule__Construct1__Group_1__01776);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:904:1: rule__Construct1__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:908:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:909:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:909:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:910:1: ()
            {
             before(grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:911:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:913:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:923:1: rule__Construct1__Group_1__1 : rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2 ;
    public final void rule__Construct1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:927:1: ( rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:928:2: rule__Construct1__Group_1__1__Impl rule__Construct1__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__1__Impl_in_rule__Construct1__Group_1__11834);
            rule__Construct1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__2_in_rule__Construct1__Group_1__11837);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:935:1: rule__Construct1__Group_1__1__Impl : ( ( rule__Construct1__OperandsAssignment_1_1 ) ) ;
    public final void rule__Construct1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:939:1: ( ( ( rule__Construct1__OperandsAssignment_1_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:940:1: ( ( rule__Construct1__OperandsAssignment_1_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:940:1: ( ( rule__Construct1__OperandsAssignment_1_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:941:1: ( rule__Construct1__OperandsAssignment_1_1 )
            {
             before(grammarAccess.getConstruct1Access().getOperandsAssignment_1_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:942:1: ( rule__Construct1__OperandsAssignment_1_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:942:2: rule__Construct1__OperandsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__OperandsAssignment_1_1_in_rule__Construct1__Group_1__1__Impl1864);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:952:1: rule__Construct1__Group_1__2 : rule__Construct1__Group_1__2__Impl ;
    public final void rule__Construct1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:956:1: ( rule__Construct1__Group_1__2__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:957:2: rule__Construct1__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct1__Group_1__2__Impl_in_rule__Construct1__Group_1__21894);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:963:1: rule__Construct1__Group_1__2__Impl : ( ( rule__Construct1__OperandsAssignment_1_2 )* ) ;
    public final void rule__Construct1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:967:1: ( ( ( rule__Construct1__OperandsAssignment_1_2 )* ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:968:1: ( ( rule__Construct1__OperandsAssignment_1_2 )* )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:968:1: ( ( rule__Construct1__OperandsAssignment_1_2 )* )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:969:1: ( rule__Construct1__OperandsAssignment_1_2 )*
            {
             before(grammarAccess.getConstruct1Access().getOperandsAssignment_1_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:970:1: ( rule__Construct1__OperandsAssignment_1_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=RULE_CHAR && LA8_0<=RULE_STRING)||(LA8_0>=14 && LA8_0<=15)||(LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:970:2: rule__Construct1__OperandsAssignment_1_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Construct1__OperandsAssignment_1_2_in_rule__Construct1__Group_1__2__Impl1921);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:986:1: rule__Construct2__Group_0__0 : rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1 ;
    public final void rule__Construct2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:990:1: ( rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:991:2: rule__Construct2__Group_0__0__Impl rule__Construct2__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__0__Impl_in_rule__Construct2__Group_0__01958);
            rule__Construct2__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__1_in_rule__Construct2__Group_0__01961);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:998:1: rule__Construct2__Group_0__0__Impl : ( () ) ;
    public final void rule__Construct2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1002:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1003:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1003:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1004:1: ()
            {
             before(grammarAccess.getConstruct2Access().getNotAction_0_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1005:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1007:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1017:1: rule__Construct2__Group_0__1 : rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2 ;
    public final void rule__Construct2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1021:1: ( rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1022:2: rule__Construct2__Group_0__1__Impl rule__Construct2__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__1__Impl_in_rule__Construct2__Group_0__12019);
            rule__Construct2__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__2_in_rule__Construct2__Group_0__12022);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1029:1: rule__Construct2__Group_0__1__Impl : ( '!' ) ;
    public final void rule__Construct2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1033:1: ( ( '!' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1034:1: ( '!' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1034:1: ( '!' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1035:1: '!'
            {
             before(grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Construct2__Group_0__1__Impl2050); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1048:1: rule__Construct2__Group_0__2 : rule__Construct2__Group_0__2__Impl ;
    public final void rule__Construct2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1052:1: ( rule__Construct2__Group_0__2__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1053:2: rule__Construct2__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_0__2__Impl_in_rule__Construct2__Group_0__22081);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1059:1: rule__Construct2__Group_0__2__Impl : ( ( rule__Construct2__OperandAssignment_0_2 ) ) ;
    public final void rule__Construct2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1063:1: ( ( ( rule__Construct2__OperandAssignment_0_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1064:1: ( ( rule__Construct2__OperandAssignment_0_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1064:1: ( ( rule__Construct2__OperandAssignment_0_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1065:1: ( rule__Construct2__OperandAssignment_0_2 )
            {
             before(grammarAccess.getConstruct2Access().getOperandAssignment_0_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1066:1: ( rule__Construct2__OperandAssignment_0_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1066:2: rule__Construct2__OperandAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__OperandAssignment_0_2_in_rule__Construct2__Group_0__2__Impl2108);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1082:1: rule__Construct2__Group_1__0 : rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1 ;
    public final void rule__Construct2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1086:1: ( rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1087:2: rule__Construct2__Group_1__0__Impl rule__Construct2__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_1__0__Impl_in_rule__Construct2__Group_1__02144);
            rule__Construct2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_1__1_in_rule__Construct2__Group_1__02147);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1094:1: rule__Construct2__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1098:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1099:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1099:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1100:1: ()
            {
             before(grammarAccess.getConstruct2Access().getUntilAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1101:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1103:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1113:1: rule__Construct2__Group_1__1 : rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2 ;
    public final void rule__Construct2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1117:1: ( rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1118:2: rule__Construct2__Group_1__1__Impl rule__Construct2__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_1__1__Impl_in_rule__Construct2__Group_1__12205);
            rule__Construct2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_1__2_in_rule__Construct2__Group_1__12208);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1125:1: rule__Construct2__Group_1__1__Impl : ( '->' ) ;
    public final void rule__Construct2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1129:1: ( ( '->' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1130:1: ( '->' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1130:1: ( '->' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1131:1: '->'
            {
             before(grammarAccess.getConstruct2Access().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Construct2__Group_1__1__Impl2236); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1144:1: rule__Construct2__Group_1__2 : rule__Construct2__Group_1__2__Impl ;
    public final void rule__Construct2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1148:1: ( rule__Construct2__Group_1__2__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1149:2: rule__Construct2__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__Group_1__2__Impl_in_rule__Construct2__Group_1__22267);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1155:1: rule__Construct2__Group_1__2__Impl : ( ( rule__Construct2__OperandAssignment_1_2 ) ) ;
    public final void rule__Construct2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1159:1: ( ( ( rule__Construct2__OperandAssignment_1_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1160:1: ( ( rule__Construct2__OperandAssignment_1_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1160:1: ( ( rule__Construct2__OperandAssignment_1_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1161:1: ( rule__Construct2__OperandAssignment_1_2 )
            {
             before(grammarAccess.getConstruct2Access().getOperandAssignment_1_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1162:1: ( rule__Construct2__OperandAssignment_1_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1162:2: rule__Construct2__OperandAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct2__OperandAssignment_1_2_in_rule__Construct2__Group_1__2__Impl2294);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1178:1: rule__Construct3__Group__0 : rule__Construct3__Group__0__Impl rule__Construct3__Group__1 ;
    public final void rule__Construct3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1182:1: ( rule__Construct3__Group__0__Impl rule__Construct3__Group__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1183:2: rule__Construct3__Group__0__Impl rule__Construct3__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group__0__Impl_in_rule__Construct3__Group__02330);
            rule__Construct3__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group__1_in_rule__Construct3__Group__02333);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1190:1: rule__Construct3__Group__0__Impl : ( ruleConstruct4 ) ;
    public final void rule__Construct3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1194:1: ( ( ruleConstruct4 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1195:1: ( ruleConstruct4 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1195:1: ( ruleConstruct4 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1196:1: ruleConstruct4
            {
             before(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct4_in_rule__Construct3__Group__0__Impl2360);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1207:1: rule__Construct3__Group__1 : rule__Construct3__Group__1__Impl ;
    public final void rule__Construct3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1211:1: ( rule__Construct3__Group__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1212:2: rule__Construct3__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group__1__Impl_in_rule__Construct3__Group__12389);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1218:1: rule__Construct3__Group__1__Impl : ( ( rule__Construct3__Group_1__0 )* ) ;
    public final void rule__Construct3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1222:1: ( ( ( rule__Construct3__Group_1__0 )* ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1223:1: ( ( rule__Construct3__Group_1__0 )* )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1223:1: ( ( rule__Construct3__Group_1__0 )* )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1224:1: ( rule__Construct3__Group_1__0 )*
            {
             before(grammarAccess.getConstruct3Access().getGroup_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1225:1: ( rule__Construct3__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1225:2: rule__Construct3__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__0_in_rule__Construct3__Group__1__Impl2416);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1239:1: rule__Construct3__Group_1__0 : rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1 ;
    public final void rule__Construct3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1243:1: ( rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1244:2: rule__Construct3__Group_1__0__Impl rule__Construct3__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__0__Impl_in_rule__Construct3__Group_1__02451);
            rule__Construct3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__1_in_rule__Construct3__Group_1__02454);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1251:1: rule__Construct3__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1255:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1256:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1256:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1257:1: ()
            {
             before(grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1258:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1260:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1270:1: rule__Construct3__Group_1__1 : rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2 ;
    public final void rule__Construct3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1274:1: ( rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1275:2: rule__Construct3__Group_1__1__Impl rule__Construct3__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__1__Impl_in_rule__Construct3__Group_1__12512);
            rule__Construct3__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__2_in_rule__Construct3__Group_1__12515);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1282:1: rule__Construct3__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Construct3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1286:1: ( ( '{' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1287:1: ( '{' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1287:1: ( '{' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1288:1: '{'
            {
             before(grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Construct3__Group_1__1__Impl2543); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1301:1: rule__Construct3__Group_1__2 : rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3 ;
    public final void rule__Construct3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1305:1: ( rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1306:2: rule__Construct3__Group_1__2__Impl rule__Construct3__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__2__Impl_in_rule__Construct3__Group_1__22574);
            rule__Construct3__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__3_in_rule__Construct3__Group_1__22577);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1313:1: rule__Construct3__Group_1__2__Impl : ( ( rule__Construct3__MinAssignment_1_2 ) ) ;
    public final void rule__Construct3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1317:1: ( ( ( rule__Construct3__MinAssignment_1_2 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1318:1: ( ( rule__Construct3__MinAssignment_1_2 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1318:1: ( ( rule__Construct3__MinAssignment_1_2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1319:1: ( rule__Construct3__MinAssignment_1_2 )
            {
             before(grammarAccess.getConstruct3Access().getMinAssignment_1_2()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1320:1: ( rule__Construct3__MinAssignment_1_2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1320:2: rule__Construct3__MinAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__MinAssignment_1_2_in_rule__Construct3__Group_1__2__Impl2604);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1330:1: rule__Construct3__Group_1__3 : rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4 ;
    public final void rule__Construct3__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1334:1: ( rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1335:2: rule__Construct3__Group_1__3__Impl rule__Construct3__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__3__Impl_in_rule__Construct3__Group_1__32634);
            rule__Construct3__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__4_in_rule__Construct3__Group_1__32637);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1342:1: rule__Construct3__Group_1__3__Impl : ( ( rule__Construct3__Group_1_3__0 )? ) ;
    public final void rule__Construct3__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1346:1: ( ( ( rule__Construct3__Group_1_3__0 )? ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1347:1: ( ( rule__Construct3__Group_1_3__0 )? )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1347:1: ( ( rule__Construct3__Group_1_3__0 )? )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1348:1: ( rule__Construct3__Group_1_3__0 )?
            {
             before(grammarAccess.getConstruct3Access().getGroup_1_3()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1349:1: ( rule__Construct3__Group_1_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1349:2: rule__Construct3__Group_1_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1_3__0_in_rule__Construct3__Group_1__3__Impl2664);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1359:1: rule__Construct3__Group_1__4 : rule__Construct3__Group_1__4__Impl ;
    public final void rule__Construct3__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1363:1: ( rule__Construct3__Group_1__4__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1364:2: rule__Construct3__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1__4__Impl_in_rule__Construct3__Group_1__42695);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1370:1: rule__Construct3__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Construct3__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1374:1: ( ( '}' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1375:1: ( '}' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1375:1: ( '}' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1376:1: '}'
            {
             before(grammarAccess.getConstruct3Access().getRightCurlyBracketKeyword_1_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Construct3__Group_1__4__Impl2723); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1399:1: rule__Construct3__Group_1_3__0 : rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1 ;
    public final void rule__Construct3__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1403:1: ( rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1404:2: rule__Construct3__Group_1_3__0__Impl rule__Construct3__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1_3__0__Impl_in_rule__Construct3__Group_1_3__02764);
            rule__Construct3__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1_3__1_in_rule__Construct3__Group_1_3__02767);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1411:1: rule__Construct3__Group_1_3__0__Impl : ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) ) ;
    public final void rule__Construct3__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1415:1: ( ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1416:1: ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1416:1: ( ( rule__Construct3__UpperBoundedAssignment_1_3_0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1417:1: ( rule__Construct3__UpperBoundedAssignment_1_3_0 )
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedAssignment_1_3_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1418:1: ( rule__Construct3__UpperBoundedAssignment_1_3_0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1418:2: rule__Construct3__UpperBoundedAssignment_1_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__UpperBoundedAssignment_1_3_0_in_rule__Construct3__Group_1_3__0__Impl2794);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1428:1: rule__Construct3__Group_1_3__1 : rule__Construct3__Group_1_3__1__Impl ;
    public final void rule__Construct3__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1432:1: ( rule__Construct3__Group_1_3__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1433:2: rule__Construct3__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__Group_1_3__1__Impl_in_rule__Construct3__Group_1_3__12824);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1439:1: rule__Construct3__Group_1_3__1__Impl : ( ( rule__Construct3__MaxAssignment_1_3_1 ) ) ;
    public final void rule__Construct3__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1443:1: ( ( ( rule__Construct3__MaxAssignment_1_3_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1444:1: ( ( rule__Construct3__MaxAssignment_1_3_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1444:1: ( ( rule__Construct3__MaxAssignment_1_3_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1445:1: ( rule__Construct3__MaxAssignment_1_3_1 )
            {
             before(grammarAccess.getConstruct3Access().getMaxAssignment_1_3_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1446:1: ( rule__Construct3__MaxAssignment_1_3_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1446:2: rule__Construct3__MaxAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct3__MaxAssignment_1_3_1_in_rule__Construct3__Group_1_3__1__Impl2851);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1460:1: rule__Construct4__Group_0__0 : rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1 ;
    public final void rule__Construct4__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1464:1: ( rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1465:2: rule__Construct4__Group_0__0__Impl rule__Construct4__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__0__Impl_in_rule__Construct4__Group_0__02885);
            rule__Construct4__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__1_in_rule__Construct4__Group_0__02888);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1472:1: rule__Construct4__Group_0__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1476:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1477:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1477:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1478:1: ()
            {
             before(grammarAccess.getConstruct4Access().getRangeAction_0_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1479:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1481:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1491:1: rule__Construct4__Group_0__1 : rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2 ;
    public final void rule__Construct4__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1495:1: ( rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1496:2: rule__Construct4__Group_0__1__Impl rule__Construct4__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__1__Impl_in_rule__Construct4__Group_0__12946);
            rule__Construct4__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__2_in_rule__Construct4__Group_0__12949);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1503:1: rule__Construct4__Group_0__1__Impl : ( ( rule__Construct4__MinAssignment_0_1 ) ) ;
    public final void rule__Construct4__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1507:1: ( ( ( rule__Construct4__MinAssignment_0_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1508:1: ( ( rule__Construct4__MinAssignment_0_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1508:1: ( ( rule__Construct4__MinAssignment_0_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1509:1: ( rule__Construct4__MinAssignment_0_1 )
            {
             before(grammarAccess.getConstruct4Access().getMinAssignment_0_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1510:1: ( rule__Construct4__MinAssignment_0_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1510:2: rule__Construct4__MinAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__MinAssignment_0_1_in_rule__Construct4__Group_0__1__Impl2976);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1520:1: rule__Construct4__Group_0__2 : rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3 ;
    public final void rule__Construct4__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1524:1: ( rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1525:2: rule__Construct4__Group_0__2__Impl rule__Construct4__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__2__Impl_in_rule__Construct4__Group_0__23006);
            rule__Construct4__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__3_in_rule__Construct4__Group_0__23009);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1532:1: rule__Construct4__Group_0__2__Impl : ( '..' ) ;
    public final void rule__Construct4__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1536:1: ( ( '..' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1537:1: ( '..' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1537:1: ( '..' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1538:1: '..'
            {
             before(grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_0_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Construct4__Group_0__2__Impl3037); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1551:1: rule__Construct4__Group_0__3 : rule__Construct4__Group_0__3__Impl ;
    public final void rule__Construct4__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1555:1: ( rule__Construct4__Group_0__3__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1556:2: rule__Construct4__Group_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_0__3__Impl_in_rule__Construct4__Group_0__33068);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1562:1: rule__Construct4__Group_0__3__Impl : ( ( rule__Construct4__MaxAssignment_0_3 ) ) ;
    public final void rule__Construct4__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1566:1: ( ( ( rule__Construct4__MaxAssignment_0_3 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1567:1: ( ( rule__Construct4__MaxAssignment_0_3 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1567:1: ( ( rule__Construct4__MaxAssignment_0_3 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1568:1: ( rule__Construct4__MaxAssignment_0_3 )
            {
             before(grammarAccess.getConstruct4Access().getMaxAssignment_0_3()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1569:1: ( rule__Construct4__MaxAssignment_0_3 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1569:2: rule__Construct4__MaxAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__MaxAssignment_0_3_in_rule__Construct4__Group_0__3__Impl3095);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1587:1: rule__Construct4__Group_1__0 : rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1 ;
    public final void rule__Construct4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1591:1: ( rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1592:2: rule__Construct4__Group_1__0__Impl rule__Construct4__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__0__Impl_in_rule__Construct4__Group_1__03133);
            rule__Construct4__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__1_in_rule__Construct4__Group_1__03136);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1599:1: rule__Construct4__Group_1__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1603:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1604:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1604:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1605:1: ()
            {
             before(grammarAccess.getConstruct4Access().getKeywordAction_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1606:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1608:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1618:1: rule__Construct4__Group_1__1 : rule__Construct4__Group_1__1__Impl ;
    public final void rule__Construct4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1622:1: ( rule__Construct4__Group_1__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1623:2: rule__Construct4__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_1__1__Impl_in_rule__Construct4__Group_1__13194);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1629:1: rule__Construct4__Group_1__1__Impl : ( ( rule__Construct4__ValueAssignment_1_1 ) ) ;
    public final void rule__Construct4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1633:1: ( ( ( rule__Construct4__ValueAssignment_1_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1634:1: ( ( rule__Construct4__ValueAssignment_1_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1634:1: ( ( rule__Construct4__ValueAssignment_1_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1635:1: ( rule__Construct4__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstruct4Access().getValueAssignment_1_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1636:1: ( rule__Construct4__ValueAssignment_1_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1636:2: rule__Construct4__ValueAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__ValueAssignment_1_1_in_rule__Construct4__Group_1__1__Impl3221);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1650:1: rule__Construct4__Group_2__0 : rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1 ;
    public final void rule__Construct4__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1654:1: ( rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1655:2: rule__Construct4__Group_2__0__Impl rule__Construct4__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_2__0__Impl_in_rule__Construct4__Group_2__03255);
            rule__Construct4__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_2__1_in_rule__Construct4__Group_2__03258);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1662:1: rule__Construct4__Group_2__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1666:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1667:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1667:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1668:1: ()
            {
             before(grammarAccess.getConstruct4Access().getAnyAction_2_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1669:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1671:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1681:1: rule__Construct4__Group_2__1 : rule__Construct4__Group_2__1__Impl ;
    public final void rule__Construct4__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1685:1: ( rule__Construct4__Group_2__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1686:2: rule__Construct4__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_2__1__Impl_in_rule__Construct4__Group_2__13316);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1692:1: rule__Construct4__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Construct4__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1696:1: ( ( '.' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1697:1: ( '.' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1697:1: ( '.' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1698:1: '.'
            {
             before(grammarAccess.getConstruct4Access().getFullStopKeyword_2_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Construct4__Group_2__1__Impl3344); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1715:1: rule__Construct4__Group_3__0 : rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1 ;
    public final void rule__Construct4__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1719:1: ( rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1720:2: rule__Construct4__Group_3__0__Impl rule__Construct4__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_3__0__Impl_in_rule__Construct4__Group_3__03379);
            rule__Construct4__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_3__1_in_rule__Construct4__Group_3__03382);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1727:1: rule__Construct4__Group_3__0__Impl : ( () ) ;
    public final void rule__Construct4__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1731:1: ( ( () ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1732:1: ( () )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1732:1: ( () )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1733:1: ()
            {
             before(grammarAccess.getConstruct4Access().getReferenceAction_3_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1734:1: ()
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1736:1: 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1746:1: rule__Construct4__Group_3__1 : rule__Construct4__Group_3__1__Impl ;
    public final void rule__Construct4__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1750:1: ( rule__Construct4__Group_3__1__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1751:2: rule__Construct4__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_3__1__Impl_in_rule__Construct4__Group_3__13440);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1757:1: rule__Construct4__Group_3__1__Impl : ( ( rule__Construct4__TargetAssignment_3_1 ) ) ;
    public final void rule__Construct4__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1761:1: ( ( ( rule__Construct4__TargetAssignment_3_1 ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1762:1: ( ( rule__Construct4__TargetAssignment_3_1 ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1762:1: ( ( rule__Construct4__TargetAssignment_3_1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1763:1: ( rule__Construct4__TargetAssignment_3_1 )
            {
             before(grammarAccess.getConstruct4Access().getTargetAssignment_3_1()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1764:1: ( rule__Construct4__TargetAssignment_3_1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1764:2: rule__Construct4__TargetAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__TargetAssignment_3_1_in_rule__Construct4__Group_3__1__Impl3467);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1778:1: rule__Construct4__Group_4__0 : rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1 ;
    public final void rule__Construct4__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1782:1: ( rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1783:2: rule__Construct4__Group_4__0__Impl rule__Construct4__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__0__Impl_in_rule__Construct4__Group_4__03501);
            rule__Construct4__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__1_in_rule__Construct4__Group_4__03504);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1790:1: rule__Construct4__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Construct4__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1794:1: ( ( '(' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1795:1: ( '(' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1795:1: ( '(' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1796:1: '('
            {
             before(grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Construct4__Group_4__0__Impl3532); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1809:1: rule__Construct4__Group_4__1 : rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2 ;
    public final void rule__Construct4__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1813:1: ( rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1814:2: rule__Construct4__Group_4__1__Impl rule__Construct4__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__1__Impl_in_rule__Construct4__Group_4__13563);
            rule__Construct4__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__2_in_rule__Construct4__Group_4__13566);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1821:1: rule__Construct4__Group_4__1__Impl : ( ruleConstruct0 ) ;
    public final void rule__Construct4__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1825:1: ( ( ruleConstruct0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1826:1: ( ruleConstruct0 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1826:1: ( ruleConstruct0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1827:1: ruleConstruct0
            {
             before(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct0_in_rule__Construct4__Group_4__1__Impl3593);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1838:1: rule__Construct4__Group_4__2 : rule__Construct4__Group_4__2__Impl ;
    public final void rule__Construct4__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1842:1: ( rule__Construct4__Group_4__2__Impl )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1843:2: rule__Construct4__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Construct4__Group_4__2__Impl_in_rule__Construct4__Group_4__23622);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1849:1: rule__Construct4__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Construct4__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1853:1: ( ( ')' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1854:1: ( ')' )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1854:1: ( ')' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1855:1: ')'
            {
             before(grammarAccess.getConstruct4Access().getRightParenthesisKeyword_4_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Construct4__Group_4__2__Impl3650); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1875:1: rule__Grammar__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Grammar__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1879:1: ( ( ruleDefinition ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1880:1: ( ruleDefinition )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1880:1: ( ruleDefinition )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1881:1: ruleDefinition
            {
             before(grammarAccess.getGrammarAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDefinition_in_rule__Grammar__DefinitionsAssignment_13692);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1890:1: rule__Definition__LexicalAssignment_1 : ( ( 'lexical' ) ) ;
    public final void rule__Definition__LexicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1894:1: ( ( ( 'lexical' ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1895:1: ( ( 'lexical' ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1895:1: ( ( 'lexical' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1896:1: ( 'lexical' )
            {
             before(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1897:1: ( 'lexical' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1898:1: 'lexical'
            {
             before(grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Definition__LexicalAssignment_13728); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1913:1: rule__Definition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1917:1: ( ( RULE_ID ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1918:1: ( RULE_ID )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1918:1: ( RULE_ID )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1919:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_23767); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1928:1: rule__Definition__RhsAssignment_4 : ( ruleConstruct0 ) ;
    public final void rule__Definition__RhsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1932:1: ( ( ruleConstruct0 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1933:1: ( ruleConstruct0 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1933:1: ( ruleConstruct0 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1934:1: ruleConstruct0
            {
             before(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct0_in_rule__Definition__RhsAssignment_43798);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1943:1: rule__Construct0__OperandsAssignment_1_2 : ( ruleConstruct1 ) ;
    public final void rule__Construct0__OperandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1947:1: ( ( ruleConstruct1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1948:1: ( ruleConstruct1 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1948:1: ( ruleConstruct1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1949:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_23829);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1958:1: rule__Construct0__OperandsAssignment_1_3_1 : ( ruleConstruct1 ) ;
    public final void rule__Construct0__OperandsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1962:1: ( ( ruleConstruct1 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1963:1: ( ruleConstruct1 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1963:1: ( ruleConstruct1 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1964:1: ruleConstruct1
            {
             before(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_3_13860);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1973:1: rule__Construct1__OperandsAssignment_1_1 : ( ruleConstruct2 ) ;
    public final void rule__Construct1__OperandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1977:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1978:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1978:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1979:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_13891);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1988:1: rule__Construct1__OperandsAssignment_1_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct1__OperandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1992:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1993:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1993:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:1994:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_23922);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2003:1: rule__Construct2__OperandAssignment_0_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct2__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2007:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2008:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2008:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2009:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_0_23953);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2018:1: rule__Construct2__OperandAssignment_1_2 : ( ruleConstruct2 ) ;
    public final void rule__Construct2__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2022:1: ( ( ruleConstruct2 ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2023:1: ( ruleConstruct2 )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2023:1: ( ruleConstruct2 )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2024:1: ruleConstruct2
            {
             before(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_1_23984);
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2033:1: rule__Construct3__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Construct3__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2037:1: ( ( RULE_INT ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2038:1: ( RULE_INT )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2038:1: ( RULE_INT )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2039:1: RULE_INT
            {
             before(grammarAccess.getConstruct3Access().getMinINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Construct3__MinAssignment_1_24015); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2048:1: rule__Construct3__UpperBoundedAssignment_1_3_0 : ( ( ',' ) ) ;
    public final void rule__Construct3__UpperBoundedAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2052:1: ( ( ( ',' ) ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2053:1: ( ( ',' ) )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2053:1: ( ( ',' ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2054:1: ( ',' )
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2055:1: ( ',' )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2056:1: ','
            {
             before(grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Construct3__UpperBoundedAssignment_1_3_04051); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2071:1: rule__Construct3__MaxAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__Construct3__MaxAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2075:1: ( ( RULE_INT ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2076:1: ( RULE_INT )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2076:1: ( RULE_INT )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2077:1: RULE_INT
            {
             before(grammarAccess.getConstruct3Access().getMaxINTTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Construct3__MaxAssignment_1_3_14090); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2086:1: rule__Construct4__MinAssignment_0_1 : ( RULE_CHAR ) ;
    public final void rule__Construct4__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2090:1: ( ( RULE_CHAR ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2091:1: ( RULE_CHAR )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2091:1: ( RULE_CHAR )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2092:1: RULE_CHAR
            {
             before(grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_0_1_0()); 
            match(input,RULE_CHAR,FollowSets000.FOLLOW_RULE_CHAR_in_rule__Construct4__MinAssignment_0_14121); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2101:1: rule__Construct4__MaxAssignment_0_3 : ( RULE_CHAR ) ;
    public final void rule__Construct4__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2105:1: ( ( RULE_CHAR ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2106:1: ( RULE_CHAR )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2106:1: ( RULE_CHAR )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2107:1: RULE_CHAR
            {
             before(grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_0_3_0()); 
            match(input,RULE_CHAR,FollowSets000.FOLLOW_RULE_CHAR_in_rule__Construct4__MaxAssignment_0_34152); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2116:1: rule__Construct4__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Construct4__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2120:1: ( ( RULE_STRING ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2121:1: ( RULE_STRING )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2121:1: ( RULE_STRING )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2122:1: RULE_STRING
            {
             before(grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Construct4__ValueAssignment_1_14183); 
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
    // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2131:1: rule__Construct4__TargetAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Construct4__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2135:1: ( ( RULE_ID ) )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2136:1: ( RULE_ID )
            {
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2136:1: ( RULE_ID )
            // ../xgen.grammar.ui/src-gen/xgen/ui/contentassist/antlr/internal/InternalGrammar.g:2137:1: RULE_ID
            {
             before(grammarAccess.getConstruct4Access().getTargetIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Construct4__TargetAssignment_3_14214); 
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
        public static final BitSet FOLLOW_rule__Construct2__Group_1__0_in_rule__Construct2__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct3_in_rule__Construct2__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__0_in_rule__Construct4__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__0_in_rule__Construct4__Alternatives576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_2__0_in_rule__Construct4__Alternatives594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_3__0_in_rule__Construct4__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__0_in_rule__Construct4__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grammar__Group__0__Impl_in_rule__Grammar__Group__0661 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_rule__Grammar__Group__1_in_rule__Grammar__Group__0664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grammar__Group__1__Impl_in_rule__Grammar__Group__1722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grammar__DefinitionsAssignment_1_in_rule__Grammar__Group__1__Impl749 = new BitSet(new long[]{0x0000000000400012L});
        public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0784 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1845 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__LexicalAssignment_1_in_rule__Definition__Group__1__Impl875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2906 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__2909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__NameAssignment_2_in_rule__Definition__Group__2__Impl936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__3966 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__3969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Definition__Group__3__Impl997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__41028 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__41031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__RhsAssignment_4_in_rule__Definition__Group__4__Impl1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__51088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Definition__Group__5__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group__0__Impl_in_rule__Construct0__Group__01159 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Construct0__Group__1_in_rule__Construct0__Group__01162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__Group__0__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group__1__Impl_in_rule__Construct0__Group__11218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__0_in_rule__Construct0__Group__1__Impl1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__0__Impl_in_rule__Construct0__Group_1__01280 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__1_in_rule__Construct0__Group_1__01283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__1__Impl_in_rule__Construct0__Group_1__11341 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__2_in_rule__Construct0__Group_1__11344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Construct0__Group_1__1__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__2__Impl_in_rule__Construct0__Group_1__21403 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__3_in_rule__Construct0__Group_1__21406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__OperandsAssignment_1_2_in_rule__Construct0__Group_1__2__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1__3__Impl_in_rule__Construct0__Group_1__31463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1_3__0_in_rule__Construct0__Group_1__3__Impl1490 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1_3__0__Impl_in_rule__Construct0__Group_1_3__01529 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1_3__1_in_rule__Construct0__Group_1_3__01532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Construct0__Group_1_3__0__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__Group_1_3__1__Impl_in_rule__Construct0__Group_1_3__11591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct0__OperandsAssignment_1_3_1_in_rule__Construct0__Group_1_3__1__Impl1618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group__0__Impl_in_rule__Construct1__Group__01652 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Construct1__Group__1_in_rule__Construct1__Group__01655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__Group__0__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group__1__Impl_in_rule__Construct1__Group__11711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__0_in_rule__Construct1__Group__1__Impl1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__0__Impl_in_rule__Construct1__Group_1__01773 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__1_in_rule__Construct1__Group_1__01776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__1__Impl_in_rule__Construct1__Group_1__11834 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__2_in_rule__Construct1__Group_1__11837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__OperandsAssignment_1_1_in_rule__Construct1__Group_1__1__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__Group_1__2__Impl_in_rule__Construct1__Group_1__21894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct1__OperandsAssignment_1_2_in_rule__Construct1__Group_1__2__Impl1921 = new BitSet(new long[]{0x000000000018C0D2L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__0__Impl_in_rule__Construct2__Group_0__01958 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__1_in_rule__Construct2__Group_0__01961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__1__Impl_in_rule__Construct2__Group_0__12019 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__2_in_rule__Construct2__Group_0__12022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Construct2__Group_0__1__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Group_0__2__Impl_in_rule__Construct2__Group_0__22081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__OperandAssignment_0_2_in_rule__Construct2__Group_0__2__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Group_1__0__Impl_in_rule__Construct2__Group_1__02144 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Construct2__Group_1__1_in_rule__Construct2__Group_1__02147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Group_1__1__Impl_in_rule__Construct2__Group_1__12205 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Construct2__Group_1__2_in_rule__Construct2__Group_1__12208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Construct2__Group_1__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__Group_1__2__Impl_in_rule__Construct2__Group_1__22267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct2__OperandAssignment_1_2_in_rule__Construct2__Group_1__2__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group__0__Impl_in_rule__Construct3__Group__02330 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Construct3__Group__1_in_rule__Construct3__Group__02333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct4_in_rule__Construct3__Group__0__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group__1__Impl_in_rule__Construct3__Group__12389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__0_in_rule__Construct3__Group__1__Impl2416 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__0__Impl_in_rule__Construct3__Group_1__02451 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__1_in_rule__Construct3__Group_1__02454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__1__Impl_in_rule__Construct3__Group_1__12512 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__2_in_rule__Construct3__Group_1__12515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Construct3__Group_1__1__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__2__Impl_in_rule__Construct3__Group_1__22574 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__3_in_rule__Construct3__Group_1__22577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__MinAssignment_1_2_in_rule__Construct3__Group_1__2__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__3__Impl_in_rule__Construct3__Group_1__32634 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__4_in_rule__Construct3__Group_1__32637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1_3__0_in_rule__Construct3__Group_1__3__Impl2664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1__4__Impl_in_rule__Construct3__Group_1__42695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Construct3__Group_1__4__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1_3__0__Impl_in_rule__Construct3__Group_1_3__02764 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1_3__1_in_rule__Construct3__Group_1_3__02767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__UpperBoundedAssignment_1_3_0_in_rule__Construct3__Group_1_3__0__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__Group_1_3__1__Impl_in_rule__Construct3__Group_1_3__12824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct3__MaxAssignment_1_3_1_in_rule__Construct3__Group_1_3__1__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__0__Impl_in_rule__Construct4__Group_0__02885 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__1_in_rule__Construct4__Group_0__02888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__1__Impl_in_rule__Construct4__Group_0__12946 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__2_in_rule__Construct4__Group_0__12949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__MinAssignment_0_1_in_rule__Construct4__Group_0__1__Impl2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__2__Impl_in_rule__Construct4__Group_0__23006 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__3_in_rule__Construct4__Group_0__23009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Construct4__Group_0__2__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_0__3__Impl_in_rule__Construct4__Group_0__33068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__MaxAssignment_0_3_in_rule__Construct4__Group_0__3__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__0__Impl_in_rule__Construct4__Group_1__03133 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__1_in_rule__Construct4__Group_1__03136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_1__1__Impl_in_rule__Construct4__Group_1__13194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__ValueAssignment_1_1_in_rule__Construct4__Group_1__1__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_2__0__Impl_in_rule__Construct4__Group_2__03255 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Construct4__Group_2__1_in_rule__Construct4__Group_2__03258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_2__1__Impl_in_rule__Construct4__Group_2__13316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Construct4__Group_2__1__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_3__0__Impl_in_rule__Construct4__Group_3__03379 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Construct4__Group_3__1_in_rule__Construct4__Group_3__03382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_3__1__Impl_in_rule__Construct4__Group_3__13440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__TargetAssignment_3_1_in_rule__Construct4__Group_3__1__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__0__Impl_in_rule__Construct4__Group_4__03501 = new BitSet(new long[]{0x000000000018C0D0L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__1_in_rule__Construct4__Group_4__03504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Construct4__Group_4__0__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__1__Impl_in_rule__Construct4__Group_4__13563 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__2_in_rule__Construct4__Group_4__13566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct0_in_rule__Construct4__Group_4__1__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Construct4__Group_4__2__Impl_in_rule__Construct4__Group_4__23622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Construct4__Group_4__2__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefinition_in_rule__Grammar__DefinitionsAssignment_13692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Definition__LexicalAssignment_13728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_23767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct0_in_rule__Definition__RhsAssignment_43798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_23829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_rule__Construct0__OperandsAssignment_1_3_13860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_13891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct1__OperandsAssignment_1_23922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_0_23953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_rule__Construct2__OperandAssignment_1_23984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Construct3__MinAssignment_1_24015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Construct3__UpperBoundedAssignment_1_3_04051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Construct3__MaxAssignment_1_3_14090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CHAR_in_rule__Construct4__MinAssignment_0_14121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CHAR_in_rule__Construct4__MaxAssignment_0_34152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Construct4__ValueAssignment_1_14183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Construct4__TargetAssignment_3_14214 = new BitSet(new long[]{0x0000000000000002L});
    }


}