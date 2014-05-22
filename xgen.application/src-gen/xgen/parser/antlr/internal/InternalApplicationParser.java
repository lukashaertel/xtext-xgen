package xgen.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xgen.services.ApplicationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:115:1: ruleApply returns [EObject current=null] : ( () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_callReplacements_8_0= ruleCallReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token otherlv_4=null;
        Token lv_max_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_callReplacements_8_0 = null;

        EObject lv_ruleReplacements_9_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:118:28: ( ( () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_callReplacements_8_0= ruleCallReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )? ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:119:1: ( () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_callReplacements_8_0= ruleCallReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )? )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:119:1: ( () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_callReplacements_8_0= ruleCallReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )? )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:119:2: () ( ( ruleQID ) ) otherlv_2= '(' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= '{' ( ( (lv_callReplacements_8_0= ruleCallReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )?
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
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:188:1: (otherlv_7= '{' ( ( (lv_callReplacements_8_0= ruleCallReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:188:3: otherlv_7= '{' ( ( (lv_callReplacements_8_0= ruleCallReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleApply326); 

                        	newLeafNode(otherlv_7, grammarAccess.getApplyAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:192:1: ( ( (lv_callReplacements_8_0= ruleCallReplacement ) ) | ( (lv_ruleReplacements_9_0= ruleRuleReplacement ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            int LA2_2 = input.LA(2);

                            if ( (LA2_2==RULE_ID) ) {
                                int LA2_3 = input.LA(3);

                                if ( ((LA2_3>=17 && LA2_3<=18)) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_3==19) ) {
                                    alt2=2;
                                }


                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:192:2: ( (lv_callReplacements_8_0= ruleCallReplacement ) )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:192:2: ( (lv_callReplacements_8_0= ruleCallReplacement ) )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:193:1: (lv_callReplacements_8_0= ruleCallReplacement )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:193:1: (lv_callReplacements_8_0= ruleCallReplacement )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:194:3: lv_callReplacements_8_0= ruleCallReplacement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getApplyAccess().getCallReplacementsCallReplacementParserRuleCall_7_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCallReplacement_in_ruleApply348);
                    	    lv_callReplacements_8_0=ruleCallReplacement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getApplyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"callReplacements",
                    	            		lv_callReplacements_8_0, 
                    	            		"CallReplacement");
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


    // $ANTLR start "entryRuleCallReplacement"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:241:1: entryRuleCallReplacement returns [EObject current=null] : iv_ruleCallReplacement= ruleCallReplacement EOF ;
    public final EObject entryRuleCallReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallReplacement = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:242:2: (iv_ruleCallReplacement= ruleCallReplacement EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:243:2: iv_ruleCallReplacement= ruleCallReplacement EOF
            {
             newCompositeNode(grammarAccess.getCallReplacementRule()); 
            pushFollow(FOLLOW_ruleCallReplacement_in_entryRuleCallReplacement427);
            iv_ruleCallReplacement=ruleCallReplacement();

            state._fsp--;

             current =iv_ruleCallReplacement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallReplacement437); 

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
    // $ANTLR end "entryRuleCallReplacement"


    // $ANTLR start "ruleCallReplacement"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:250:1: ruleCallReplacement returns [EObject current=null] : (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) ) ) ;
    public final EObject ruleCallReplacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_positioned_2_0=null;
        Token lv_position_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_replacement_7_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:253:28: ( (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:254:1: (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) ) )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:254:1: (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:254:3: otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )? otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (lv_replacement_7_0= ruleConstruct0 ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleCallReplacement474); 

                	newLeafNode(otherlv_0, grammarAccess.getCallReplacementAccess().getReplaceKeyword_0());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:258:1: ( (otherlv_1= RULE_ID ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:259:1: (otherlv_1= RULE_ID )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:259:1: (otherlv_1= RULE_ID )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:260:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCallReplacementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallReplacement494); 

            		newLeafNode(otherlv_1, grammarAccess.getCallReplacementAccess().getSelectorAbstractRuleCrossReference_1_0()); 
            	

            }


            }

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:271:2: ( ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:271:3: ( (lv_positioned_2_0= '/' ) ) ( (lv_position_3_0= RULE_INT ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:271:3: ( (lv_positioned_2_0= '/' ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:272:1: (lv_positioned_2_0= '/' )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:272:1: (lv_positioned_2_0= '/' )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:273:3: lv_positioned_2_0= '/'
                    {
                    lv_positioned_2_0=(Token)match(input,17,FOLLOW_17_in_ruleCallReplacement513); 

                            newLeafNode(lv_positioned_2_0, grammarAccess.getCallReplacementAccess().getPositionedSolidusKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCallReplacementRule());
                    	        }
                           		setWithLastConsumed(current, "positioned", true, "/");
                    	    

                    }


                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:286:2: ( (lv_position_3_0= RULE_INT ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:287:1: (lv_position_3_0= RULE_INT )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:287:1: (lv_position_3_0= RULE_INT )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:288:3: lv_position_3_0= RULE_INT
                    {
                    lv_position_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallReplacement543); 

                    			newLeafNode(lv_position_3_0, grammarAccess.getCallReplacementAccess().getPositionINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCallReplacementRule());
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleCallReplacement562); 

                	newLeafNode(otherlv_4, grammarAccess.getCallReplacementAccess().getInKeyword_3());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:308:1: ( (otherlv_5= RULE_ID ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:309:1: (otherlv_5= RULE_ID )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:309:1: (otherlv_5= RULE_ID )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:310:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCallReplacementRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallReplacement582); 

            		newLeafNode(otherlv_5, grammarAccess.getCallReplacementAccess().getTargetAbstractRuleCrossReference_4_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleCallReplacement594); 

                	newLeafNode(otherlv_6, grammarAccess.getCallReplacementAccess().getWithKeyword_5());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:325:1: ( (lv_replacement_7_0= ruleConstruct0 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:326:1: (lv_replacement_7_0= ruleConstruct0 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:326:1: (lv_replacement_7_0= ruleConstruct0 )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:327:3: lv_replacement_7_0= ruleConstruct0
            {
             
            	        newCompositeNode(grammarAccess.getCallReplacementAccess().getReplacementConstruct0ParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleConstruct0_in_ruleCallReplacement615);
            lv_replacement_7_0=ruleConstruct0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallReplacementRule());
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
    // $ANTLR end "ruleCallReplacement"


    // $ANTLR start "entryRuleRuleReplacement"
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:351:1: entryRuleRuleReplacement returns [EObject current=null] : iv_ruleRuleReplacement= ruleRuleReplacement EOF ;
    public final EObject entryRuleRuleReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleReplacement = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:352:2: (iv_ruleRuleReplacement= ruleRuleReplacement EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:353:2: iv_ruleRuleReplacement= ruleRuleReplacement EOF
            {
             newCompositeNode(grammarAccess.getRuleReplacementRule()); 
            pushFollow(FOLLOW_ruleRuleReplacement_in_entryRuleRuleReplacement651);
            iv_ruleRuleReplacement=ruleRuleReplacement();

            state._fsp--;

             current =iv_ruleRuleReplacement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleReplacement661); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:360:1: ruleRuleReplacement returns [EObject current=null] : (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) ) ) ;
    public final EObject ruleRuleReplacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_replacement_3_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:363:28: ( (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:364:1: (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) ) )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:364:1: (otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:364:3: otherlv_0= 'replace' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_replacement_3_0= ruleConstruct0 ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRuleReplacement698); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleReplacementAccess().getReplaceKeyword_0());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:368:1: ( (otherlv_1= RULE_ID ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:369:1: (otherlv_1= RULE_ID )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:369:1: (otherlv_1= RULE_ID )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:370:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleReplacementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleReplacement718); 

            		newLeafNode(otherlv_1, grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRuleReplacement730); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleReplacementAccess().getWithKeyword_2());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:385:1: ( (lv_replacement_3_0= ruleConstruct0 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:386:1: (lv_replacement_3_0= ruleConstruct0 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:386:1: (lv_replacement_3_0= ruleConstruct0 )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:387:3: lv_replacement_3_0= ruleConstruct0
            {
             
            	        newCompositeNode(grammarAccess.getRuleReplacementAccess().getReplacementConstruct0ParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConstruct0_in_ruleRuleReplacement751);
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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:411:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:412:2: (iv_ruleQID= ruleQID EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:413:2: iv_ruleQID= ruleQID EOF
            {
             newCompositeNode(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID788);
            iv_ruleQID=ruleQID();

            state._fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID799); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:420:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:423:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:424:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:424:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:424:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID839); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:431:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:432:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQID858); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID873); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:454:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:455:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:456:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition922);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition932); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:463:1: ruleDefinition returns [EObject current=null] : ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_lexical_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:466:28: ( ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:467:1: ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:467:1: ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:467:2: () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';'
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:467:2: ()
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:468:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDefinitionAccess().getDefinitionAction_0(),
                        current);
                

            }

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:473:2: ( (lv_lexical_1_0= 'lexical' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:474:1: (lv_lexical_1_0= 'lexical' )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:474:1: (lv_lexical_1_0= 'lexical' )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:475:3: lv_lexical_1_0= 'lexical'
                    {
                    lv_lexical_1_0=(Token)match(input,21,FOLLOW_21_in_ruleDefinition984); 

                            newLeafNode(lv_lexical_1_0, grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "lexical", true, "lexical");
                    	    

                    }


                    }
                    break;

            }

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:488:3: ( (lv_name_2_0= RULE_ID ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:489:1: (lv_name_2_0= RULE_ID )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:489:1: (lv_name_2_0= RULE_ID )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:490:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition1015); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleDefinition1032); 

                	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getColonKeyword_3());
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:510:1: ( (lv_rhs_4_0= ruleConstruct0 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:511:1: (lv_rhs_4_0= ruleConstruct0 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:511:1: (lv_rhs_4_0= ruleConstruct0 )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:512:3: lv_rhs_4_0= ruleConstruct0
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConstruct0_in_ruleDefinition1053);
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

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleDefinition1065); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:540:1: entryRuleConstruct0 returns [EObject current=null] : iv_ruleConstruct0= ruleConstruct0 EOF ;
    public final EObject entryRuleConstruct0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct0 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:541:2: (iv_ruleConstruct0= ruleConstruct0 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:542:2: iv_ruleConstruct0= ruleConstruct0 EOF
            {
             newCompositeNode(grammarAccess.getConstruct0Rule()); 
            pushFollow(FOLLOW_ruleConstruct0_in_entryRuleConstruct01101);
            iv_ruleConstruct0=ruleConstruct0();

            state._fsp--;

             current =iv_ruleConstruct0; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct01111); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:549:1: ruleConstruct0 returns [EObject current=null] : (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? ) ;
    public final EObject ruleConstruct0() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Construct1_0 = null;

        EObject lv_operands_3_0 = null;

        EObject lv_operands_5_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:552:28: ( (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:553:1: (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:553:1: (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:554:5: this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )?
            {
             
                    newCompositeNode(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConstruct1_in_ruleConstruct01158);
            this_Construct1_0=ruleConstruct1();

            state._fsp--;

             
                    current = this_Construct1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:562:1: ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:562:2: () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )*
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:562:2: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:563:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConstruct01179); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:572:1: ( (lv_operands_3_0= ruleConstruct1 ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:573:1: (lv_operands_3_0= ruleConstruct1 )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:573:1: (lv_operands_3_0= ruleConstruct1 )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:574:3: lv_operands_3_0= ruleConstruct1
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstruct1_in_ruleConstruct01200);
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

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:590:2: (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==24) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:590:4: otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleConstruct01213); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0());
                    	        
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:594:1: ( (lv_operands_5_0= ruleConstruct1 ) )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:595:1: (lv_operands_5_0= ruleConstruct1 )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:595:1: (lv_operands_5_0= ruleConstruct1 )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:596:3: lv_operands_5_0= ruleConstruct1
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstruct1_in_ruleConstruct01234);
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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:620:1: entryRuleConstruct1 returns [EObject current=null] : iv_ruleConstruct1= ruleConstruct1 EOF ;
    public final EObject entryRuleConstruct1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct1 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:621:2: (iv_ruleConstruct1= ruleConstruct1 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:622:2: iv_ruleConstruct1= ruleConstruct1 EOF
            {
             newCompositeNode(grammarAccess.getConstruct1Rule()); 
            pushFollow(FOLLOW_ruleConstruct1_in_entryRuleConstruct11274);
            iv_ruleConstruct1=ruleConstruct1();

            state._fsp--;

             current =iv_ruleConstruct1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct11284); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:629:1: ruleConstruct1 returns [EObject current=null] : (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? ) ;
    public final EObject ruleConstruct1() throws RecognitionException {
        EObject current = null;

        EObject this_Construct2_0 = null;

        EObject lv_operands_2_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:632:28: ( (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:633:1: (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:633:1: (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:634:5: this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )?
            {
             
                    newCompositeNode(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct11331);
            this_Construct2_0=ruleConstruct2();

            state._fsp--;

             
                    current = this_Construct2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:642:1: ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==11||LA10_0==20||(LA10_0>=25 && LA10_0<=26)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:642:2: () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )*
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:642:2: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:643:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0(),
                                current);
                        

                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:648:2: ( (lv_operands_2_0= ruleConstruct2 ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:649:1: (lv_operands_2_0= ruleConstruct2 )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:649:1: (lv_operands_2_0= ruleConstruct2 )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:650:3: lv_operands_2_0= ruleConstruct2
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct11361);
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

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:666:2: ( (lv_operands_3_0= ruleConstruct2 ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==11||LA9_0==20||(LA9_0>=25 && LA9_0<=26)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:667:1: (lv_operands_3_0= ruleConstruct2 )
                    	    {
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:667:1: (lv_operands_3_0= ruleConstruct2 )
                    	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:668:3: lv_operands_3_0= ruleConstruct2
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct11382);
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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:692:1: entryRuleConstruct2 returns [EObject current=null] : iv_ruleConstruct2= ruleConstruct2 EOF ;
    public final EObject entryRuleConstruct2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct2 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:693:2: (iv_ruleConstruct2= ruleConstruct2 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:694:2: iv_ruleConstruct2= ruleConstruct2 EOF
            {
             newCompositeNode(grammarAccess.getConstruct2Rule()); 
            pushFollow(FOLLOW_ruleConstruct2_in_entryRuleConstruct21421);
            iv_ruleConstruct2=ruleConstruct2();

            state._fsp--;

             current =iv_ruleConstruct2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct21431); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:701:1: ruleConstruct2 returns [EObject current=null] : ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) ) | this_Construct3_6= ruleConstruct3 ) ;
    public final EObject ruleConstruct2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;

        EObject this_Construct3_6 = null;


         enterRule(); 
            
        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:704:28: ( ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) ) | this_Construct3_6= ruleConstruct3 ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:705:1: ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) ) | this_Construct3_6= ruleConstruct3 )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:705:1: ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) ) | this_Construct3_6= ruleConstruct3 )
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
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:705:2: ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:705:2: ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:705:3: () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:705:3: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:706:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct2Access().getNotAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleConstruct21478); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:715:1: ( (lv_operand_2_0= ruleConstruct2 ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:716:1: (lv_operand_2_0= ruleConstruct2 )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:716:1: (lv_operand_2_0= ruleConstruct2 )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:717:3: lv_operand_2_0= ruleConstruct2
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct21499);
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
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:734:6: ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:734:6: ( () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:734:7: () otherlv_4= '->' ( (lv_operand_5_0= ruleConstruct2 ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:734:7: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:735:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct2Access().getUntilAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleConstruct21528); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstruct2Access().getHyphenMinusGreaterThanSignKeyword_1_1());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:744:1: ( (lv_operand_5_0= ruleConstruct2 ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:745:1: (lv_operand_5_0= ruleConstruct2 )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:745:1: (lv_operand_5_0= ruleConstruct2 )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:746:3: lv_operand_5_0= ruleConstruct2
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstruct2_in_ruleConstruct21549);
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
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:764:5: this_Construct3_6= ruleConstruct3
                    {
                     
                            newCompositeNode(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstruct3_in_ruleConstruct21578);
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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:780:1: entryRuleConstruct3 returns [EObject current=null] : iv_ruleConstruct3= ruleConstruct3 EOF ;
    public final EObject entryRuleConstruct3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct3 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:781:2: (iv_ruleConstruct3= ruleConstruct3 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:782:2: iv_ruleConstruct3= ruleConstruct3 EOF
            {
             newCompositeNode(grammarAccess.getConstruct3Rule()); 
            pushFollow(FOLLOW_ruleConstruct3_in_entryRuleConstruct31613);
            iv_ruleConstruct3=ruleConstruct3();

            state._fsp--;

             current =iv_ruleConstruct3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct31623); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:789:1: ruleConstruct3 returns [EObject current=null] : (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* ) ;
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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:792:28: ( (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:793:1: (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:793:1: (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:794:5: this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )*
            {
             
                    newCompositeNode(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConstruct4_in_ruleConstruct31670);
            this_Construct4_0=ruleConstruct4();

            state._fsp--;

             
                    current = this_Construct4_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:802:1: ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:802:2: () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}'
            	    {
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:802:2: ()
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:803:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleConstruct31691); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1());
            	        
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:812:1: ( (lv_min_3_0= RULE_INT ) )
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:813:1: (lv_min_3_0= RULE_INT )
            	    {
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:813:1: (lv_min_3_0= RULE_INT )
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:814:3: lv_min_3_0= RULE_INT
            	    {
            	    lv_min_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstruct31708); 

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

            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:830:2: ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==27) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:830:3: ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) )
            	            {
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:830:3: ( (lv_upperBounded_4_0= ',' ) )
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:831:1: (lv_upperBounded_4_0= ',' )
            	            {
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:831:1: (lv_upperBounded_4_0= ',' )
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:832:3: lv_upperBounded_4_0= ','
            	            {
            	            lv_upperBounded_4_0=(Token)match(input,27,FOLLOW_27_in_ruleConstruct31732); 

            	                    newLeafNode(lv_upperBounded_4_0, grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getConstruct3Rule());
            	            	        }
            	                   		setWithLastConsumed(current, "upperBounded", true, ",");
            	            	    

            	            }


            	            }

            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:845:2: ( (lv_max_5_0= RULE_INT ) )
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:846:1: (lv_max_5_0= RULE_INT )
            	            {
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:846:1: (lv_max_5_0= RULE_INT )
            	            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:847:3: lv_max_5_0= RULE_INT
            	            {
            	            lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstruct31762); 

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

            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleConstruct31781); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:875:1: entryRuleConstruct4 returns [EObject current=null] : iv_ruleConstruct4= ruleConstruct4 EOF ;
    public final EObject entryRuleConstruct4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct4 = null;


        try {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:876:2: (iv_ruleConstruct4= ruleConstruct4 EOF )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:877:2: iv_ruleConstruct4= ruleConstruct4 EOF
            {
             newCompositeNode(grammarAccess.getConstruct4Rule()); 
            pushFollow(FOLLOW_ruleConstruct4_in_entryRuleConstruct41819);
            iv_ruleConstruct4=ruleConstruct4();

            state._fsp--;

             current =iv_ruleConstruct4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct41829); 

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
    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:884:1: ruleConstruct4 returns [EObject current=null] : ( ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () otherlv_7= '.' ) | ( () ( (lv_target_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' ) ) ;
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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:887:28: ( ( ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () otherlv_7= '.' ) | ( () ( (lv_target_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' ) ) )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:888:1: ( ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () otherlv_7= '.' ) | ( () ( (lv_target_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' ) )
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:888:1: ( ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () otherlv_7= '.' ) | ( () ( (lv_target_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' ) )
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
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:888:2: ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:888:2: ( () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:888:3: () ( (lv_min_1_0= RULE_CHAR ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_CHAR ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:888:3: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:889:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getRangeAction_0_0(),
                                current);
                        

                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:894:2: ( (lv_min_1_0= RULE_CHAR ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:895:1: (lv_min_1_0= RULE_CHAR )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:895:1: (lv_min_1_0= RULE_CHAR )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:896:3: lv_min_1_0= RULE_CHAR
                    {
                    lv_min_1_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleConstruct41881); 

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

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConstruct41898); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_0_2());
                        
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:916:1: ( (lv_max_3_0= RULE_CHAR ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:917:1: (lv_max_3_0= RULE_CHAR )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:917:1: (lv_max_3_0= RULE_CHAR )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:918:3: lv_max_3_0= RULE_CHAR
                    {
                    lv_max_3_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleConstruct41915); 

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
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:935:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:935:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:935:7: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:935:7: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:936:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getKeywordAction_1_0(),
                                current);
                        

                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:941:2: ( (lv_value_5_0= RULE_STRING ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:942:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:942:1: (lv_value_5_0= RULE_STRING )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:943:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstruct41954); 

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
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:960:6: ( () otherlv_7= '.' )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:960:6: ( () otherlv_7= '.' )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:960:7: () otherlv_7= '.'
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:960:7: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:961:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getAnyAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleConstruct41988); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstruct4Access().getFullStopKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:971:6: ( () ( (lv_target_9_0= RULE_ID ) ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:971:6: ( () ( (lv_target_9_0= RULE_ID ) ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:971:7: () ( (lv_target_9_0= RULE_ID ) )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:971:7: ()
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:972:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getReferenceAction_3_0(),
                                current);
                        

                    }

                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:977:2: ( (lv_target_9_0= RULE_ID ) )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:978:1: (lv_target_9_0= RULE_ID )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:978:1: (lv_target_9_0= RULE_ID )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:979:3: lv_target_9_0= RULE_ID
                    {
                    lv_target_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstruct42022); 

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
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:996:6: (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' )
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:996:6: (otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')' )
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:996:8: otherlv_10= '(' this_Construct0_11= ruleConstruct0 otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleConstruct42047); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleConstruct0_in_ruleConstruct42069);
                    this_Construct0_11=ruleConstruct0();

                    state._fsp--;

                     
                            current = this_Construct0_11; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleConstruct42080); 

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
    public static final BitSet FOLLOW_ruleCallReplacement_in_ruleApply348 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleRuleReplacement_in_ruleApply375 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleApply389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallReplacement_in_entryRuleCallReplacement427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallReplacement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCallReplacement474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallReplacement494 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCallReplacement513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallReplacement543 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCallReplacement562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallReplacement582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCallReplacement594 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleCallReplacement615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleReplacement_in_entryRuleRuleReplacement651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleReplacement661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRuleReplacement698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleReplacement718 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRuleReplacement730 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleRuleReplacement751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID839 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQID858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID873 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDefinition984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition1015 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDefinition1032 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleDefinition1053 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinition1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct0_in_entryRuleConstruct01101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct01111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct01158 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleConstruct01179 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct01200 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleConstruct01213 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct01234 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleConstruct1_in_entryRuleConstruct11274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct11284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct11331 = new BitSet(new long[]{0x00000000061008E2L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct11361 = new BitSet(new long[]{0x00000000061008E2L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct11382 = new BitSet(new long[]{0x00000000061008E2L});
    public static final BitSet FOLLOW_ruleConstruct2_in_entryRuleConstruct21421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct21431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConstruct21478 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct21499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConstruct21528 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct21549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct3_in_ruleConstruct21578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct3_in_entryRuleConstruct31613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct31623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct4_in_ruleConstruct31670 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleConstruct31691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstruct31708 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_27_in_ruleConstruct31732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstruct31762 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstruct31781 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleConstruct4_in_entryRuleConstruct41819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct41829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleConstruct41881 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstruct41898 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleConstruct41915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstruct41954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConstruct41988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstruct42022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConstruct42047 = new BitSet(new long[]{0x00000000061008E0L});
    public static final BitSet FOLLOW_ruleConstruct0_in_ruleConstruct42069 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstruct42080 = new BitSet(new long[]{0x0000000000000002L});

}