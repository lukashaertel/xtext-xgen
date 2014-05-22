package xgen.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;

import xgen.services.ApplicationGrammarAccess;

@SuppressWarnings("all")
public class InternalApplicationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_CHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'('", "'..'", "')'", "'{'", "'}'", "'replace'", "'/'", "'in'", "'with'", "'.'", "'lexical'", "':'", "';'", "'|'", "'!'", "'->'", "','"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g"; }



     	private ApplicationGrammarAccess grammarAccess;
     	
        public InternalApplicationParser(TokenStream input, ApplicationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ApplicationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:76:1: ruleModel returns [EObject current=null] : ( (lv_applications_0_0= ruleApply ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_applications_0_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:79:28: ( ( (lv_applications_0_0= ruleApply ) )* )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:80:1: ( (lv_applications_0_0= ruleApply ) )*
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:80:1: ( (lv_applications_0_0= ruleApply ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:81:1: (lv_applications_0_0= ruleApply )
            	    {
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:81:1: (lv_applications_0_0= ruleApply )
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:82:3: lv_applications_0_0= ruleApply
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getApplicationsApplyParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleApply_in_ruleModel130);
            	    lv_applications_0_0=ruleApply();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"applications",
            	            		lv_applications_0_0, 
            	            		"Apply");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApply"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:106:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:107:2: (iv_ruleApply= ruleApply EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:108:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply166);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply176); 

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
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:115:1: ruleApply returns [EObject current=null] : ( () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_constructReplacements_8_0= ruleConstructReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token otherlv_4=null;
        Token lv_max_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_constructReplacements_8_0 = null;

        EObject lv_ruleReplacements_9_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:118:28: ( ( () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_constructReplacements_8_0= ruleConstructReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )? ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:119:1: ( () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_constructReplacements_8_0= ruleConstructReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )? )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:119:1: ( () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_constructReplacements_8_0= ruleConstructReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )? )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:119:2: () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_constructReplacements_8_0= ruleConstructReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )?
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:119:2: ()
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:120:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getApplyAccess().getApplicationAction_0(),
                        current);
                

            }

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:125:2: ( ( ruleQID ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:126:1: ( ruleQID )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:126:1: ( ruleQID )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:127:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getApplyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getApplyAccess().getTargetGrammarCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQID_in_ruleApply233);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleApply245); 

                	newLeafNode(otherlv_2, grammarAccess.getApplyAccess().getLeftParenthesisKeyword_2());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:144:1: ( (lv_min_3_0= RULE_INT ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:145:1: (lv_min_3_0= RULE_INT )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:145:1: (lv_min_3_0= RULE_INT )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:146:3: lv_min_3_0= RULE_INT
            {
            lv_min_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApply262); 

            			newLeafNode(lv_min_3_0, grammarAccess.getApplyAccess().getMinINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"min",
                    		lv_min_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleApply279); 

                	newLeafNode(otherlv_4, grammarAccess.getApplyAccess().getFullStopFullStopKeyword_4());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:166:1: ( (lv_max_5_0= RULE_INT ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:167:1: (lv_max_5_0= RULE_INT )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:167:1: (lv_max_5_0= RULE_INT )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:168:3: lv_max_5_0= RULE_INT
            {
            lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApply296); 

            			newLeafNode(lv_max_5_0, grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"max",
                    		lv_max_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleApply313); 

                	newLeafNode(otherlv_6, grammarAccess.getApplyAccess().getRightParenthesisKeyword_6());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:188:1: (otherlv_7= '{' ( ( (lv_constructReplacements_8_0= ruleConstructReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:188:3: otherlv_7= '{' ( ( (lv_constructReplacements_8_0= ruleConstructReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleApply326); 

                        	newLeafNode(otherlv_7, grammarAccess.getApplyAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:192:1: ( ( (lv_constructReplacements_8_0= ruleConstructReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            int LA2_2 = input.LA(2);

                            if ( (LA2_2==RULE_ID) ) {
                                int LA2_3 = input.LA(3);

                                if ( ((LA2_3>=RULE_ID && LA2_3<=RULE_STRING)||LA2_3==11||LA2_3==14||(LA2_3>=17 && LA2_3<=18)||LA2_3==20||(LA2_3>=24 && LA2_3<=26)) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_3==19) ) {
                                    alt2=2;
                                }


                            }
                            else if ( ((LA2_2>=RULE_CHAR && LA2_2<=RULE_STRING)||LA2_2==11||LA2_2==20||(LA2_2>=25 && LA2_2<=26)) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:192:2: ( (lv_constructReplacements_8_0= ruleConstructReplacement ) )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:192:2: ( (lv_constructReplacements_8_0= ruleConstructReplacement ) )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:193:1: (lv_constructReplacements_8_0= ruleConstructReplacement )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:193:1: (lv_constructReplacements_8_0= ruleConstructReplacement )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:194:3: lv_constructReplacements_8_0= ruleConstructReplacement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getApplyAccess().getConstructReplacementsConstructReplacementParserRuleCall_7_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstructReplacement_in_ruleApply348);
                    	    lv_constructReplacements_8_0=ruleConstructReplacement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getApplyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constructReplacements",
                    	            		lv_constructReplacements_8_0, 
                    	            		"ConstructReplacement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:211:6: ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:211:6: ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:212:1: (lv_ruleReplacements_9_0= ruleRuleReplacement )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:212:1: (lv_ruleReplacements_9_0= ruleRuleReplacement )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:213:3: lv_ruleReplacements_9_0= ruleRuleReplacement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getApplyAccess().getRuleReplacementsRuleReplacementParserRuleCall_7_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleReplacement_in_ruleApply375);
                    	    lv_ruleReplacements_9_0=ruleRuleReplacement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getApplyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ruleReplacements",
                    	            		lv_ruleReplacements_9_0, 
                    	            		"RuleReplacement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleApply389); 

                        	newLeafNode(otherlv_10, grammarAccess.getApplyAccess().getRightCurlyBracketKeyword_7_2());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleConstructReplacement"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:241:1: entryRuleConstructReplacement returns [EObject current=null] : iv_ruleConstructReplacement= ruleConstructReplacement EOF ;
    public final EObject entryRuleConstructReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructReplacement = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:242:2: (iv_ruleConstructReplacement= ruleConstructReplacement EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:243:2: iv_ruleConstructReplacement= ruleConstructReplacement EOF
            {
             newCompositeNode(grammarAccess.getConstructReplacementRule()); 
            pushFollow(FOLLOW_ruleConstructReplacement_in_entryRuleConstructReplacement427);
            iv_ruleConstructReplacement=ruleConstructReplacement();

            state._fsp--;

             current =iv_ruleConstructReplacement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructReplacement437); 

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
    // $ANTLR end "entryRuleConstructReplacement"


    // $ANTLR start "ruleConstructReplacement"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:250:1: ruleConstructReplacement returns [EObject current=null] : (otherlv_0= 'replace' ( (lv_selector_1_0= ruleConstruct0 ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) ) ) ;
    public final EObject ruleConstructReplacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_positioned_2_0=null;
        Token lv_position_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_selector_1_0 = null;

        EObject lv_replacement_7_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:253:28: ( (otherlv_0= 'replace' ( (lv_selector_1_0= ruleConstruct0 ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:254:1: (otherlv_0= 'replace' ( (lv_selector_1_0= ruleConstruct0 ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) ) )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:254:1: (otherlv_0= 'replace' ( (lv_selector_1_0= ruleConstruct0 ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:254:3: otherlv_0= 'replace' ( (lv_selector_1_0= ruleConstruct0 ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleConstructReplacement474); 

                	newLeafNode(otherlv_0, grammarAccess.getConstructReplacementAccess().getReplaceKeyword_0());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:258:1: ( (lv_selector_1_0= ruleConstruct0 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:259:1: (lv_selector_1_0= ruleConstruct0 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:259:1: (lv_selector_1_0= ruleConstruct0 )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:260:3: lv_selector_1_0= ruleConstruct0
            {
             
            	        newCompositeNode(grammarAccess.getConstructReplacementAccess().getSelectorConstruct0ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstruct0_in_ruleConstructReplacement495);
            lv_selector_1_0=ruleConstruct0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstructReplacementRule());
            	        }
                   		set(
                   			current, 
                   			"selector",
                    		lv_selector_1_0, 
                    		"Construct0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:276:2: ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:276:3: ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:276:3: ( (lv_positioned_2_0= '/' ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:277:1: (lv_positioned_2_0= '/' )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:277:1: (lv_positioned_2_0= '/' )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:278:3: lv_positioned_2_0= '/'
                    {
                    lv_positioned_2_0=(Token)match(input,17,FOLLOW_17_in_ruleConstructReplacement514); 

                            newLeafNode(lv_positioned_2_0, grammarAccess.getConstructReplacementAccess().getPositionedSolidusKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructReplacementRule());
                    	        }
                           		setWithLastConsumed(current, "positioned", true, "/");
                    	    

                    }


                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:291:2: ( (lv_position_3_0= RULE_INT ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:292:1: (lv_position_3_0= RULE_INT )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:292:1: (lv_position_3_0= RULE_INT )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:293:3: lv_position_3_0= RULE_INT
                    {
                    lv_position_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstructReplacement544); 

                    			newLeafNode(lv_position_3_0, grammarAccess.getConstructReplacementAccess().getPositionINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructReplacementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"position",
                            		lv_position_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleConstructReplacement563); 

                	newLeafNode(otherlv_4, grammarAccess.getConstructReplacementAccess().getInKeyword_3());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:313:1: ( (otherlv_5= RULE_ID ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:314:1: (otherlv_5= RULE_ID )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:314:1: (otherlv_5= RULE_ID )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:315:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstructReplacementRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructReplacement583); 

            		newLeafNode(otherlv_5, grammarAccess.getConstructReplacementAccess().getTargetAbstractRuleCrossReference_4_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleConstructReplacement595); 

                	newLeafNode(otherlv_6, grammarAccess.getConstructReplacementAccess().getWithKeyword_5());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:330:1: ( (lv_replacement_7_0= ruleConstruct0 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:331:1: (lv_replacement_7_0= ruleConstruct0 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:331:1: (lv_replacement_7_0= ruleConstruct0 )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:332:3: lv_replacement_7_0= ruleConstruct0
            {
             
            	        newCompositeNode(grammarAccess.getConstructReplacementAccess().getReplacementConstruct0ParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleConstruct0_in_ruleConstructReplacement616);
            lv_replacement_7_0=ruleConstruct0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstructReplacementRule());
            	        }
                   		set(
                   			current, 
                   			"replacement",
                    		lv_replacement_7_0, 
                    		"Construct0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleConstructReplacement"


    // $ANTLR start "entryRuleRuleReplacement"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:356:1: entryRuleRuleReplacement returns [EObject current=null] : iv_ruleRuleReplacement= ruleRuleReplacement EOF ;
    public final EObject entryRuleRuleReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleReplacement = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:357:2: (iv_ruleRuleReplacement= ruleRuleReplacement EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:358:2: iv_ruleRuleReplacement= ruleRuleReplacement EOF
            {
             newCompositeNode(grammarAccess.getRuleReplacementRule()); 
            pushFollow(FOLLOW_ruleRuleReplacement_in_entryRuleRuleReplacement652);
            iv_ruleRuleReplacement=ruleRuleReplacement();

            state._fsp--;

             current =iv_ruleRuleReplacement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleReplacement662); 

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
    // $ANTLR end "entryRuleRuleReplacement"


    // $ANTLR start "ruleRuleReplacement"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:365:1: ruleRuleReplacement returns [EObject current=null] : (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) ) ) ;
    public final EObject ruleRuleReplacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_replacement_3_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:368:28: ( (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:369:1: (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) ) )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:369:1: (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:369:3: otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRuleReplacement699); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleReplacementAccess().getReplaceKeyword_0());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:373:1: ( (otherlv_1= RULE_ID ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:374:1: (otherlv_1= RULE_ID )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:374:1: (otherlv_1= RULE_ID )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:375:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleReplacementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleReplacement719); 

            		newLeafNode(otherlv_1, grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRuleReplacement731); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleReplacementAccess().getWithKeyword_2());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:390:1: ( (lv_replacement_3_0= ruleConstruct0 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:391:1: (lv_replacement_3_0= ruleConstruct0 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:391:1: (lv_replacement_3_0= ruleConstruct0 )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:392:3: lv_replacement_3_0= ruleConstruct0
            {
             
            	        newCompositeNode(grammarAccess.getRuleReplacementAccess().getReplacementConstruct0ParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConstruct0_in_ruleRuleReplacement752);
            lv_replacement_3_0=ruleConstruct0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleReplacementRule());
            	        }
                   		set(
                   			current, 
                   			"replacement",
                    		lv_replacement_3_0, 
                    		"Construct0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleRuleReplacement"


    // $ANTLR start "entryRuleQID"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:416:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:417:2: (iv_ruleQID= ruleQID EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:418:2: iv_ruleQID= ruleQID EOF
            {
             newCompositeNode(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID789);
            iv_ruleQID=ruleQID();

            state._fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID800); 

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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:425:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:428:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:429:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:429:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:429:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID840); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:436:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:437:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQID859); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID874); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleQID"


    // $ANTLR start "entryRuleDefinition"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:459:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:460:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:461:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition923);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition933); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:468:1: ruleDefinition returns [EObject current=null] : ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_lexical_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:471:28: ( ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:472:1: ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:472:1: ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:472:2: () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';'
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:472:2: ()
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:473:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDefinitionAccess().getDefinitionAction_0(),
                        current);
                

            }

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:478:2: ( (lv_lexical_1_0= 'lexical' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:479:1: (lv_lexical_1_0= 'lexical' )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:479:1: (lv_lexical_1_0= 'lexical' )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:480:3: lv_lexical_1_0= 'lexical'
                    {
                    lv_lexical_1_0=(Token)match(input,21,FOLLOW_21_in_ruleDefinition985); 

                            newLeafNode(lv_lexical_1_0, grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "lexical", true, "lexical");
                    	    

                    }


                    }
                    break;

            }

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:493:3: ( (lv_name_2_0= RULE_ID ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:494:1: (lv_name_2_0= RULE_ID )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:494:1: (lv_name_2_0= RULE_ID )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:495:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition1016); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleDefinition1033); 

                	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getColonKeyword_3());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:515:1: ( (lv_rhs_4_0= ruleConstruct0 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:516:1: (lv_rhs_4_0= ruleConstruct0 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:516:1: (lv_rhs_4_0= ruleConstruct0 )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:517:3: lv_rhs_4_0= ruleConstruct0
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConstruct0_in_ruleDefinition1054);
            lv_rhs_4_0=ruleConstruct0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_4_0, 
                    		"Construct0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleDefinition1066); 

                	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleConstruct0"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:545:1: entryRuleConstruct0 returns [EObject current=null] : iv_ruleConstruct0= ruleConstruct0 EOF ;
    public final EObject entryRuleConstruct0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct0 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:546:2: (iv_ruleConstruct0= ruleConstruct0 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:547:2: iv_ruleConstruct0= ruleConstruct0 EOF
            {
             newCompositeNode(grammarAccess.getConstruct0Rule()); 
            pushFollow(FOLLOW_ruleConstruct0_in_entryRuleConstruct01102);
            iv_ruleConstruct0=ruleConstruct0();

            state._fsp--;

             current =iv_ruleConstruct0; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct01112); 

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
    // $ANTLR end "entryRuleConstruct0"


    // $ANTLR start "ruleConstruct0"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:554:1: ruleConstruct0 returns [EObject current=null] : (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? ) ;
    public final EObject ruleConstruct0() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Construct1_0 = null;

        EObject lv_operands_3_0 = null;

        EObject lv_operands_5_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:557:28: ( (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:558:1: (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:558:1: (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:559:5: this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )?
            {
             
                    newCompositeNode(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConstruct1_in_ruleConstruct01159);
            this_Construct1_0=ruleConstruct1();

            state._fsp--;

             
                    current = this_Construct1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:567:1: ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:567:2: () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )*
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:567:2: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:568:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConstruct01180); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:577:1: ( (lv_operands_3_0= ruleConstruct1 ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:578:1: (lv_operands_3_0= ruleConstruct1 )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:578:1: (lv_operands_3_0= ruleConstruct1 )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:579:3: lv_operands_3_0= ruleConstruct1
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstruct1_in_ruleConstruct01201);
                    lv_operands_3_0=ruleConstruct1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstruct0Rule());
                    	        }
                           		add(
                           			current, 
                           			"operands",
                            		lv_operands_3_0, 
                            		"Construct1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:595:2: (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==24) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:595:4: otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleConstruct01214); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0());
                    	        
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:599:1: ( (lv_operands_5_0= ruleConstruct1 ) )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:600:1: (lv_operands_5_0= ruleConstruct1 )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:600:1: (lv_operands_5_0= ruleConstruct1 )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:601:3: lv_operands_5_0= ruleConstruct1
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstruct1_in_ruleConstruct01235);
                    	    lv_operands_5_0=ruleConstruct1();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstruct0Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operands",
                    	            		lv_operands_5_0, 
                    	            		"Construct1");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleConstruct0"


    // $ANTLR start "entryRuleConstruct1"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:625:1: entryRuleConstruct1 returns [EObject current=null] : iv_ruleConstruct1= ruleConstruct1 EOF ;
    public final EObject entryRuleConstruct1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct1 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:626:2: (iv_ruleConstruct1= ruleConstruct1 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:627:2: iv_ruleConstruct1= ruleConstruct1 EOF
            {
             newCompositeNode(grammarAccess.getConstruct1Rule()); 
            pushFollow(FOLLOW_ruleConstruct1_in_entryRuleConstruct11275);
            iv_ruleConstruct1=ruleConstruct1();

            state._fsp--;

             current =iv_ruleConstruct1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct11285); 

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
    // $ANTLR end "entryRuleConstruct1"


    // $ANTLR start "ruleConstruct1"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:634:1: ruleConstruct1 returns [EObject current=null] : (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? ) ;
    public final EObject ruleConstruct1() throws RecognitionException {
        EObject current = null;

        EObject this_Construct2_0 = null;

        EObject lv_operands_2_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:637:28: ( (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:638:1: (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:638:1: (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:639:5: this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )?
            {
             
                    newCompositeNode(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct11332);
            this_Construct2_0=ruleConstruct2();

            state._fsp--;

             
                    current = this_Construct2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:647:1: ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==11||LA10_0==20||(LA10_0>=25 && LA10_0<=26)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:647:2: () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )*
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:647:2: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:648:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0(),
                                current);
                        

                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:653:2: ( (lv_operands_2_0= ruleConstruct2 ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:654:1: (lv_operands_2_0= ruleConstruct2 )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:654:1: (lv_operands_2_0= ruleConstruct2 )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:655:3: lv_operands_2_0= ruleConstruct2
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct11362);
                    lv_operands_2_0=ruleConstruct2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstruct1Rule());
                    	        }
                           		add(
                           			current, 
                           			"operands",
                            		lv_operands_2_0, 
                            		"Construct2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:671:2: ( (lv_operands_3_0= ruleConstruct2 ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==11||LA9_0==20||(LA9_0>=25 && LA9_0<=26)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:672:1: (lv_operands_3_0= ruleConstruct2 )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:672:1: (lv_operands_3_0= ruleConstruct2 )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:673:3: lv_operands_3_0= ruleConstruct2
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct11383);
                    	    lv_operands_3_0=ruleConstruct2();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstruct1Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operands",
                    	            		lv_operands_3_0, 
                    	            		"Construct2");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleConstruct1"


    // $ANTLR start "entryRuleConstruct2"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:697:1: entryRuleConstruct2 returns [EObject current=null] : iv_ruleConstruct2= ruleConstruct2 EOF ;
    public final EObject entryRuleConstruct2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct2 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:698:2: (iv_ruleConstruct2= ruleConstruct2 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:699:2: iv_ruleConstruct2= ruleConstruct2 EOF
            {
             newCompositeNode(grammarAccess.getConstruct2Rule()); 
            pushFollow(FOLLOW_ruleConstruct2_in_entryRuleConstruct21422);
            iv_ruleConstruct2=ruleConstruct2();

            state._fsp--;

             current =iv_ruleConstruct2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct21432); 

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
    // $ANTLR end "entryRuleConstruct2"


    // $ANTLR start "ruleConstruct2"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:706:1: ruleConstruct2 returns [EObject current=null] : ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) ) | this_Construct3_6= ruleConstruct3 ) ;
    public final EObject ruleConstruct2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;

        EObject this_Construct3_6 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:709:28: ( ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) ) | this_Construct3_6= ruleConstruct3 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:710:1: ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) ) | this_Construct3_6= ruleConstruct3 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:710:1: ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) ) | this_Construct3_6= ruleConstruct3 )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
            case RULE_CHAR:
            case RULE_STRING:
            case 11:
            case 20:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:710:2: ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:710:2: ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:710:3: () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:710:3: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:711:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct2Access().getNotAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleConstruct21479); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:720:1: ( (lv_operand_2_0= ruleConstruct2 ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:721:1: (lv_operand_2_0= ruleConstruct2 )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:721:1: (lv_operand_2_0= ruleConstruct2 )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:722:3: lv_operand_2_0= ruleConstruct2
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct21500);
                    lv_operand_2_0=ruleConstruct2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstruct2Rule());
                    	        }
                           		set(
                           			current, 
                           			"operand",
                            		lv_operand_2_0, 
                            		"Construct2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:739:6: ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:739:6: ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:739:7: () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:739:7: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:740:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct2Access().getUntilAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleConstruct21529); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstruct2Access().getHyphenMinusGreaterThanSignKeyword_1_1());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:749:1: ( (lv_operand_5_0= ruleConstruct2 ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:750:1: (lv_operand_5_0= ruleConstruct2 )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:750:1: (lv_operand_5_0= ruleConstruct2 )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:751:3: lv_operand_5_0= ruleConstruct2
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct21550);
                    lv_operand_5_0=ruleConstruct2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstruct2Rule());
                    	        }
                           		set(
                           			current, 
                           			"operand",
                            		lv_operand_5_0, 
                            		"Construct2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:769:5: this_Construct3_6= ruleConstruct3
                    {
                     
                            newCompositeNode(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstruct3_in_ruleConstruct21579);
                    this_Construct3_6=ruleConstruct3();

                    state._fsp--;

                     
                            current = this_Construct3_6; 
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
    // $ANTLR end "ruleConstruct2"


    // $ANTLR start "entryRuleConstruct3"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:785:1: entryRuleConstruct3 returns [EObject current=null] : iv_ruleConstruct3= ruleConstruct3 EOF ;
    public final EObject entryRuleConstruct3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct3 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:786:2: (iv_ruleConstruct3= ruleConstruct3 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:787:2: iv_ruleConstruct3= ruleConstruct3 EOF
            {
             newCompositeNode(grammarAccess.getConstruct3Rule()); 
            pushFollow(FOLLOW_ruleConstruct3_in_entryRuleConstruct31614);
            iv_ruleConstruct3=ruleConstruct3();

            state._fsp--;

             current =iv_ruleConstruct3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct31624); 

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
    // $ANTLR end "entryRuleConstruct3"


    // $ANTLR start "ruleConstruct3"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:794:1: ruleConstruct3 returns [EObject current=null] : (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* ) ;
    public final EObject ruleConstruct3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token lv_upperBounded_4_0=null;
        Token lv_max_5_0=null;
        Token otherlv_6=null;
        EObject this_Construct4_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:797:28: ( (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:798:1: (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:798:1: (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:799:5: this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )*
            {
             
                    newCompositeNode(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConstruct4_in_ruleConstruct31671);
            this_Construct4_0=ruleConstruct4();

            state._fsp--;

             
                    current = this_Construct4_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:807:1: ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:807:2: () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}'
            	    {
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:807:2: ()
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:808:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleConstruct31692); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1());
            	        
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:817:1: ( (lv_min_3_0= RULE_INT ) )
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:818:1: (lv_min_3_0= RULE_INT )
            	    {
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:818:1: (lv_min_3_0= RULE_INT )
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:819:3: lv_min_3_0= RULE_INT
            	    {
            	    lv_min_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstruct31709); 

            	    			newLeafNode(lv_min_3_0, grammarAccess.getConstruct3Access().getMinINTTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConstruct3Rule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"min",
            	            		lv_min_3_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:835:2: ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==27) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:835:3: ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) )
            	            {
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:835:3: ( (lv_upperBounded_4_0= ',' ) )
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:836:1: (lv_upperBounded_4_0= ',' )
            	            {
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:836:1: (lv_upperBounded_4_0= ',' )
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:837:3: lv_upperBounded_4_0= ','
            	            {
            	            lv_upperBounded_4_0=(Token)match(input,27,FOLLOW_27_in_ruleConstruct31733); 

            	                    newLeafNode(lv_upperBounded_4_0, grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getConstruct3Rule());
            	            	        }
            	                   		setWithLastConsumed(current, "upperBounded", true, ",");
            	            	    

            	            }


            	            }

            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:850:2: ( (lv_max_5_0= RULE_INT ) )
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:851:1: (lv_max_5_0= RULE_INT )
            	            {
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:851:1: (lv_max_5_0= RULE_INT )
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:852:3: lv_max_5_0= RULE_INT
            	            {
            	            lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstruct31763); 

            	            			newLeafNode(lv_max_5_0, grammarAccess.getConstruct3Access().getMaxINTTerminalRuleCall_1_3_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getConstruct3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"max",
            	                    		lv_max_5_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleConstruct31782); 

            	        	newLeafNode(otherlv_6, grammarAccess.getConstruct3Access().getRightCurlyBracketKeyword_1_4());
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleConstruct3"


    // $ANTLR start "entryRuleConstruct4"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:880:1: entryRuleConstruct4 returns [EObject current=null] : iv_ruleConstruct4= ruleConstruct4 EOF ;
    public final EObject entryRuleConstruct4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct4 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:881:2: (iv_ruleConstruct4= ruleConstruct4 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:882:2: iv_ruleConstruct4= ruleConstruct4 EOF
            {
             newCompositeNode(grammarAccess.getConstruct4Rule()); 
            pushFollow(FOLLOW_ruleConstruct4_in_entryRuleConstruct41820);
            iv_ruleConstruct4=ruleConstruct4();

            state._fsp--;

             current =iv_ruleConstruct4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct41830); 

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
    // $ANTLR end "entryRuleConstruct4"


    // $ANTLR start "ruleConstruct4"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:889:1: ruleConstruct4 returns [EObject current=null] : ( ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () otherlv_7= '.' ) | ( () ( (lv_target_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' ) ) ;
    public final EObject ruleConstruct4() throws RecognitionException {
        EObject current = null;

        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_7=null;
        Token lv_target_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_Construct0_11 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:892:28: ( ( ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () otherlv_7= '.' ) | ( () ( (lv_target_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:893:1: ( ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () otherlv_7= '.' ) | ( () ( (lv_target_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' ) )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:893:1: ( ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () otherlv_7= '.' ) | ( () ( (lv_target_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_CHAR:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case 20:
                {
                alt14=3;
                }
                break;
            case RULE_ID:
                {
                alt14=4;
                }
                break;
            case 11:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:893:2: ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:893:2: ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:893:3: () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:893:3: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:894:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getRangeAction_0_0(),
                                current);
                        

                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:899:2: ( (lv_min_1_0= RULE_CHAR ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:900:1: (lv_min_1_0= RULE_CHAR )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:900:1: (lv_min_1_0= RULE_CHAR )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:901:3: lv_min_1_0= RULE_CHAR
                    {
                    lv_min_1_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleConstruct41882); 

                    			newLeafNode(lv_min_1_0, grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstruct4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"min",
                            		lv_min_1_0, 
                            		"CHAR");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConstruct41899); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_0_2());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:921:1: ( (lv_max_3_0= RULE_CHAR ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:922:1: (lv_max_3_0= RULE_CHAR )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:922:1: (lv_max_3_0= RULE_CHAR )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:923:3: lv_max_3_0= RULE_CHAR
                    {
                    lv_max_3_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleConstruct41916); 

                    			newLeafNode(lv_max_3_0, grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstruct4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"max",
                            		lv_max_3_0, 
                            		"CHAR");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:940:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:940:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:940:7: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:940:7: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:941:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getKeywordAction_1_0(),
                                current);
                        

                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:946:2: ( (lv_value_5_0= RULE_STRING ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:947:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:947:1: (lv_value_5_0= RULE_STRING )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:948:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstruct41955); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstruct4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:965:6: ( () otherlv_7= '.' )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:965:6: ( () otherlv_7= '.' )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:965:7: () otherlv_7= '.'
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:965:7: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:966:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getAnyAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleConstruct41989); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstruct4Access().getFullStopKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:976:6: ( () ( (lv_target_9_0= RULE_ID ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:976:6: ( () ( (lv_target_9_0= RULE_ID ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:976:7: () ( (lv_target_9_0= RULE_ID ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:976:7: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:977:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getReferenceAction_3_0(),
                                current);
                        

                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:982:2: ( (lv_target_9_0= RULE_ID ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:983:1: (lv_target_9_0= RULE_ID )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:983:1: (lv_target_9_0= RULE_ID )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:984:3: lv_target_9_0= RULE_ID
                    {
                    lv_target_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstruct42023); 

                    			newLeafNode(lv_target_9_0, grammarAccess.getConstruct4Access().getTargetIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstruct4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"target",
                            		lv_target_9_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1001:6: (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1001:6: (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1001:8: otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleConstruct42048); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleConstruct0_in_ruleConstruct42070);
                    this_Construct0_11=ruleConstruct0();

                    state._fsp--;

                     
                            current = this_Construct0_11; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleConstruct42081); 

                        	newLeafNode(otherlv_12, grammarAccess.getConstruct4Access().getRightParenthesisKeyword_4_2());
                        

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
    // $ANTLR end "ruleConstruct4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_ruleModel130 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_ruleApply233 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleApply245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApply262 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApply279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApply296 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApply313 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleApply326 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleConstructReplacement_in_ruleApply348 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleRuleReplacement_in_ruleApply375 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleApply389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructReplacement_in_entryRuleConstructReplacement427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructReplacement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConstructReplacement474 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleConstructReplacement495 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleConstructReplacement514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstructReplacement544 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstructReplacement563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructReplacement583 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstructReplacement595 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleConstructReplacement616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleReplacement_in_entryRuleRuleReplacement652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleReplacement662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRuleReplacement699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleReplacement719 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRuleReplacement731 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleRuleReplacement752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID840 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQID859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID874 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDefinition985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition1016 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDefinition1033 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleDefinition1054 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinition1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_entryRuleConstruct01102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct01112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct01159 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleConstruct01180 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct01201 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleConstruct01214 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct01235 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_entryRuleConstruct11275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct11285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct11332 = new BitSet(new long[]{0x00000000061008E2L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct11362 = new BitSet(new long[]{0x00000000061008E2L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct11383 = new BitSet(new long[]{0x00000000061008E2L});
    public static final BitSet FOLLOW_ruleConstruct2_in_entryRuleConstruct21422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct21432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConstruct21479 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct21500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConstruct21529 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct21550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct3_in_ruleConstruct21579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct3_in_entryRuleConstruct31614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct31624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct4_in_ruleConstruct31671 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleConstruct31692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstruct31709 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_27_in_ruleConstruct31733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstruct31763 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstruct31782 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleConstruct4_in_entryRuleConstruct41820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct41830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleConstruct41882 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstruct41899 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleConstruct41916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstruct41955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConstruct41989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstruct42023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConstruct42048 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleConstruct42070 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstruct42081 = new BitSet(new long[]{0x0000000000000002L});

}