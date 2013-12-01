package tp4.gbs.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tp4.gbs.services.GobstonsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGobstonsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'Main'", "'()'", "'{'", "'}'", "'Mover'", "'('", "')'", "'Poner'", "'Norte'", "'Sur'", "'Este'", "'Oeste'", "'Rojo'", "'Verde'", "'Azul'", "'Negro'"
    };
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGobstonsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGobstonsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGobstonsParser.tokenNames; }
    public String getGrammarFileName() { return "../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g"; }



     	private GobstonsGrammarAccess grammarAccess;
     	
        public InternalGobstonsParser(TokenStream input, GobstonsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ProcedureDeclaration";	
       	}
       	
       	@Override
       	protected GobstonsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProcedureDeclaration"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:67:1: entryRuleProcedureDeclaration returns [EObject current=null] : iv_ruleProcedureDeclaration= ruleProcedureDeclaration EOF ;
    public final EObject entryRuleProcedureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureDeclaration = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:68:2: (iv_ruleProcedureDeclaration= ruleProcedureDeclaration EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:69:2: iv_ruleProcedureDeclaration= ruleProcedureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcedureDeclarationRule()); 
            pushFollow(FOLLOW_ruleProcedureDeclaration_in_entryRuleProcedureDeclaration75);
            iv_ruleProcedureDeclaration=ruleProcedureDeclaration();

            state._fsp--;

             current =iv_ruleProcedureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedureDeclaration85); 

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
    // $ANTLR end "entryRuleProcedureDeclaration"


    // $ANTLR start "ruleProcedureDeclaration"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:76:1: ruleProcedureDeclaration returns [EObject current=null] : (otherlv_0= 'procedure' otherlv_1= 'Main' otherlv_2= '()' otherlv_3= '{' ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' ) ;
    public final EObject ruleProcedureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operations_4_0 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:79:28: ( (otherlv_0= 'procedure' otherlv_1= 'Main' otherlv_2= '()' otherlv_3= '{' ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:80:1: (otherlv_0= 'procedure' otherlv_1= 'Main' otherlv_2= '()' otherlv_3= '{' ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:80:1: (otherlv_0= 'procedure' otherlv_1= 'Main' otherlv_2= '()' otherlv_3= '{' ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:80:3: otherlv_0= 'procedure' otherlv_1= 'Main' otherlv_2= '()' otherlv_3= '{' ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProcedureDeclaration122); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleProcedureDeclaration134); 

                	newLeafNode(otherlv_1, grammarAccess.getProcedureDeclarationAccess().getMainKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProcedureDeclaration146); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleProcedureDeclaration158); 

                	newLeafNode(otherlv_3, grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:96:1: ( (lv_operations_4_0= ruleOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:97:1: (lv_operations_4_0= ruleOperation )
            	    {
            	    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:97:1: (lv_operations_4_0= ruleOperation )
            	    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:98:3: lv_operations_4_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleProcedureDeclaration179);
            	    lv_operations_4_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operations",
            	            		lv_operations_4_0, 
            	            		"Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleProcedureDeclaration192); 

                	newLeafNode(otherlv_5, grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleProcedureDeclaration"


    // $ANTLR start "entryRuleOperation"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:126:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:127:2: (iv_ruleOperation= ruleOperation EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:128:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation228);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation238); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:135:1: ruleOperation returns [EObject current=null] : (this_Mover_0= ruleMover | this_Poner_1= rulePoner ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Mover_0 = null;

        EObject this_Poner_1 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:138:28: ( (this_Mover_0= ruleMover | this_Poner_1= rulePoner ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:139:1: (this_Mover_0= ruleMover | this_Poner_1= rulePoner )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:139:1: (this_Mover_0= ruleMover | this_Poner_1= rulePoner )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:140:5: this_Mover_0= ruleMover
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getMoverParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMover_in_ruleOperation285);
                    this_Mover_0=ruleMover();

                    state._fsp--;

                     
                            current = this_Mover_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:150:5: this_Poner_1= rulePoner
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getPonerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePoner_in_ruleOperation312);
                    this_Poner_1=rulePoner();

                    state._fsp--;

                     
                            current = this_Poner_1; 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleMover"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:166:1: entryRuleMover returns [EObject current=null] : iv_ruleMover= ruleMover EOF ;
    public final EObject entryRuleMover() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMover = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:167:2: (iv_ruleMover= ruleMover EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:168:2: iv_ruleMover= ruleMover EOF
            {
             newCompositeNode(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover347);
            iv_ruleMover=ruleMover();

            state._fsp--;

             current =iv_ruleMover; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover357); 

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
    // $ANTLR end "entryRuleMover"


    // $ANTLR start "ruleMover"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:175:1: ruleMover returns [EObject current=null] : (otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')' ) ;
    public final EObject ruleMover() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:178:28: ( (otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:179:1: (otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:179:1: (otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')' )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:179:3: otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleMover394); 

                	newLeafNode(otherlv_0, grammarAccess.getMoverAccess().getMoverKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMover406); 

                	newLeafNode(otherlv_1, grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:187:1: ( (lv_param_2_0= ruleDireccion ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:188:1: (lv_param_2_0= ruleDireccion )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:188:1: (lv_param_2_0= ruleDireccion )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:189:3: lv_param_2_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_ruleMover427);
            lv_param_2_0=ruleDireccion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoverRule());
            	        }
                   		set(
                   			current, 
                   			"param",
                    		lv_param_2_0, 
                    		"Direccion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMover439); 

                	newLeafNode(otherlv_3, grammarAccess.getMoverAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMover"


    // $ANTLR start "entryRulePoner"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:217:1: entryRulePoner returns [EObject current=null] : iv_rulePoner= rulePoner EOF ;
    public final EObject entryRulePoner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoner = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:218:2: (iv_rulePoner= rulePoner EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:219:2: iv_rulePoner= rulePoner EOF
            {
             newCompositeNode(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner475);
            iv_rulePoner=rulePoner();

            state._fsp--;

             current =iv_rulePoner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner485); 

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
    // $ANTLR end "entryRulePoner"


    // $ANTLR start "rulePoner"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:226:1: rulePoner returns [EObject current=null] : (otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' ) ;
    public final EObject rulePoner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:229:28: ( (otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:230:1: (otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:230:1: (otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:230:3: otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePoner522); 

                	newLeafNode(otherlv_0, grammarAccess.getPonerAccess().getPonerKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePoner534); 

                	newLeafNode(otherlv_1, grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:238:1: ( (lv_param_2_0= ruleColor ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:239:1: (lv_param_2_0= ruleColor )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:239:1: (lv_param_2_0= ruleColor )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:240:3: lv_param_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_rulePoner555);
            lv_param_2_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPonerRule());
            	        }
                   		set(
                   			current, 
                   			"param",
                    		lv_param_2_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePoner567); 

                	newLeafNode(otherlv_3, grammarAccess.getPonerAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulePoner"


    // $ANTLR start "entryRuleDireccion"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:268:1: entryRuleDireccion returns [String current=null] : iv_ruleDireccion= ruleDireccion EOF ;
    public final String entryRuleDireccion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDireccion = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:269:2: (iv_ruleDireccion= ruleDireccion EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:270:2: iv_ruleDireccion= ruleDireccion EOF
            {
             newCompositeNode(grammarAccess.getDireccionRule()); 
            pushFollow(FOLLOW_ruleDireccion_in_entryRuleDireccion604);
            iv_ruleDireccion=ruleDireccion();

            state._fsp--;

             current =iv_ruleDireccion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDireccion615); 

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
    // $ANTLR end "entryRuleDireccion"


    // $ANTLR start "ruleDireccion"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:277:1: ruleDireccion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Norte' | kw= 'Sur' | kw= 'Este' | kw= 'Oeste' ) ;
    public final AntlrDatatypeRuleToken ruleDireccion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:280:28: ( (kw= 'Norte' | kw= 'Sur' | kw= 'Este' | kw= 'Oeste' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:281:1: (kw= 'Norte' | kw= 'Sur' | kw= 'Este' | kw= 'Oeste' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:281:1: (kw= 'Norte' | kw= 'Sur' | kw= 'Este' | kw= 'Oeste' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:282:2: kw= 'Norte'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleDireccion653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDireccionAccess().getNorteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:289:2: kw= 'Sur'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleDireccion672); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDireccionAccess().getSurKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:296:2: kw= 'Este'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleDireccion691); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDireccionAccess().getEsteKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:303:2: kw= 'Oeste'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleDireccion710); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDireccionAccess().getOesteKeyword_3()); 
                        

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
    // $ANTLR end "ruleDireccion"


    // $ANTLR start "entryRuleColor"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:316:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:317:2: (iv_ruleColor= ruleColor EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:318:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor751);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor762); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:325:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Rojo' | kw= 'Verde' | kw= 'Azul' | kw= 'Negro' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:328:28: ( (kw= 'Rojo' | kw= 'Verde' | kw= 'Azul' | kw= 'Negro' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:329:1: (kw= 'Rojo' | kw= 'Verde' | kw= 'Azul' | kw= 'Negro' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:329:1: (kw= 'Rojo' | kw= 'Verde' | kw= 'Azul' | kw= 'Negro' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:330:2: kw= 'Rojo'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleColor800); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getRojoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:337:2: kw= 'Verde'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleColor819); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getVerdeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:344:2: kw= 'Azul'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleColor838); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getAzulKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:351:2: kw= 'Negro'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleColor857); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getNegroKeyword_3()); 
                        

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
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProcedureDeclaration_in_entryRuleProcedureDeclaration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedureDeclaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcedureDeclaration122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcedureDeclaration134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProcedureDeclaration146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcedureDeclaration158 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleProcedureDeclaration179 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_15_in_ruleProcedureDeclaration192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_ruleOperation285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_ruleOperation312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMover394 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMover406 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleDireccion_in_ruleMover427 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMover439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePoner522 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePoner534 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_ruleColor_in_rulePoner555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePoner567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_entryRuleDireccion604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDireccion615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDireccion653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDireccion672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDireccion691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDireccion710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleColor800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleColor819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleColor838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleColor857 = new BitSet(new long[]{0x0000000000000002L});

}