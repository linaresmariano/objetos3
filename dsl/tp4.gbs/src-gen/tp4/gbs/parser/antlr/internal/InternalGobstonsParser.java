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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'Main'", "'()'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'hayBolitas'", "'Mover'", "'Poner'", "'Norte'", "'Sur'", "'Este'", "'Oeste'", "'Rojo'", "'Verde'", "'Azul'", "'Negro'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
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
    public static final int T__30=30;
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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:76:1: ruleProcedureDeclaration returns [EObject current=null] : ( () otherlv_1= 'procedure' otherlv_2= 'Main' otherlv_3= '()' otherlv_4= '{' ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}' ) ;
    public final EObject ruleProcedureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_operations_5_0 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:79:28: ( ( () otherlv_1= 'procedure' otherlv_2= 'Main' otherlv_3= '()' otherlv_4= '{' ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:80:1: ( () otherlv_1= 'procedure' otherlv_2= 'Main' otherlv_3= '()' otherlv_4= '{' ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:80:1: ( () otherlv_1= 'procedure' otherlv_2= 'Main' otherlv_3= '()' otherlv_4= '{' ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}' )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:80:2: () otherlv_1= 'procedure' otherlv_2= 'Main' otherlv_3= '()' otherlv_4= '{' ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}'
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:80:2: ()
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcedureDeclarationAccess().getProcedureDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleProcedureDeclaration131); 

                	newLeafNode(otherlv_1, grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProcedureDeclaration143); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedureDeclarationAccess().getMainKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProcedureDeclaration155); 

                	newLeafNode(otherlv_3, grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProcedureDeclaration167); 

                	newLeafNode(otherlv_4, grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_4());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:102:1: ( (lv_operations_5_0= ruleOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||(LA1_0>=20 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:103:1: (lv_operations_5_0= ruleOperation )
            	    {
            	    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:103:1: (lv_operations_5_0= ruleOperation )
            	    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:104:3: lv_operations_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleProcedureDeclaration188);
            	    lv_operations_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operations",
            	            		lv_operations_5_0, 
            	            		"Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleProcedureDeclaration201); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:132:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:133:2: (iv_ruleOperation= ruleOperation EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:134:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation237);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation247); 

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:141:1: ruleOperation returns [EObject current=null] : (this_Function_0= ruleFunction | this_Conditional_1= ruleConditional ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_Conditional_1 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:144:28: ( (this_Function_0= ruleFunction | this_Conditional_1= ruleConditional ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:145:1: (this_Function_0= ruleFunction | this_Conditional_1= ruleConditional )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:145:1: (this_Function_0= ruleFunction | this_Conditional_1= ruleConditional )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=20 && LA2_0<=22)) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:146:5: this_Function_0= ruleFunction
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getFunctionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleOperation294);
                    this_Function_0=ruleFunction();

                    state._fsp--;

                     
                            current = this_Function_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:156:5: this_Conditional_1= ruleConditional
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getConditionalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConditional_in_ruleOperation321);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;

                     
                            current = this_Conditional_1; 
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


    // $ANTLR start "entryRuleFunction"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:172:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:173:2: (iv_ruleFunction= ruleFunction EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:174:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction356);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction366); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:181:1: ruleFunction returns [EObject current=null] : (this_Mover_0= ruleMover | this_Poner_1= rulePoner | this_HayBolitas_2= ruleHayBolitas ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_Mover_0 = null;

        EObject this_Poner_1 = null;

        EObject this_HayBolitas_2 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:184:28: ( (this_Mover_0= ruleMover | this_Poner_1= rulePoner | this_HayBolitas_2= ruleHayBolitas ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:185:1: (this_Mover_0= ruleMover | this_Poner_1= rulePoner | this_HayBolitas_2= ruleHayBolitas )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:185:1: (this_Mover_0= ruleMover | this_Poner_1= rulePoner | this_HayBolitas_2= ruleHayBolitas )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 20:
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
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:186:5: this_Mover_0= ruleMover
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionAccess().getMoverParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMover_in_ruleFunction413);
                    this_Mover_0=ruleMover();

                    state._fsp--;

                     
                            current = this_Mover_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:196:5: this_Poner_1= rulePoner
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionAccess().getPonerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePoner_in_ruleFunction440);
                    this_Poner_1=rulePoner();

                    state._fsp--;

                     
                            current = this_Poner_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:206:5: this_HayBolitas_2= ruleHayBolitas
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionAccess().getHayBolitasParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHayBolitas_in_ruleFunction467);
                    this_HayBolitas_2=ruleHayBolitas();

                    state._fsp--;

                     
                            current = this_HayBolitas_2; 
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleConditional"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:222:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:223:2: (iv_ruleConditional= ruleConditional EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:224:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional502);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional512); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:231:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_boolExpresion_2_0= ruleHayBolitas ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_trueBlock_5_0= ruleOperation ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_falseBlock_9_0= ruleOperation ) ) otherlv_10= '}' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_boolExpresion_2_0 = null;

        EObject lv_trueBlock_5_0 = null;

        EObject lv_falseBlock_9_0 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:234:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_boolExpresion_2_0= ruleHayBolitas ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_trueBlock_5_0= ruleOperation ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_falseBlock_9_0= ruleOperation ) ) otherlv_10= '}' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:235:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_boolExpresion_2_0= ruleHayBolitas ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_trueBlock_5_0= ruleOperation ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_falseBlock_9_0= ruleOperation ) ) otherlv_10= '}' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:235:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_boolExpresion_2_0= ruleHayBolitas ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_trueBlock_5_0= ruleOperation ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_falseBlock_9_0= ruleOperation ) ) otherlv_10= '}' )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:235:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_boolExpresion_2_0= ruleHayBolitas ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_trueBlock_5_0= ruleOperation ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_falseBlock_9_0= ruleOperation ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleConditional549); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleConditional561); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:243:1: ( (lv_boolExpresion_2_0= ruleHayBolitas ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:244:1: (lv_boolExpresion_2_0= ruleHayBolitas )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:244:1: (lv_boolExpresion_2_0= ruleHayBolitas )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:245:3: lv_boolExpresion_2_0= ruleHayBolitas
            {
             
            	        newCompositeNode(grammarAccess.getConditionalAccess().getBoolExpresionHayBolitasParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleHayBolitas_in_ruleConditional582);
            lv_boolExpresion_2_0=ruleHayBolitas();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	        }
                   		set(
                   			current, 
                   			"boolExpresion",
                    		lv_boolExpresion_2_0, 
                    		"HayBolitas");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleConditional594); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleConditional606); 

                	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:269:1: ( (lv_trueBlock_5_0= ruleOperation ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:270:1: (lv_trueBlock_5_0= ruleOperation )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:270:1: (lv_trueBlock_5_0= ruleOperation )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:271:3: lv_trueBlock_5_0= ruleOperation
            {
             
            	        newCompositeNode(grammarAccess.getConditionalAccess().getTrueBlockOperationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleOperation_in_ruleConditional627);
            lv_trueBlock_5_0=ruleOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	        }
                   		set(
                   			current, 
                   			"trueBlock",
                    		lv_trueBlock_5_0, 
                    		"Operation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleConditional639); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleConditional651); 

                	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getElseKeyword_7());
                
            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleConditional663); 

                	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_8());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:299:1: ( (lv_falseBlock_9_0= ruleOperation ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:300:1: (lv_falseBlock_9_0= ruleOperation )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:300:1: (lv_falseBlock_9_0= ruleOperation )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:301:3: lv_falseBlock_9_0= ruleOperation
            {
             
            	        newCompositeNode(grammarAccess.getConditionalAccess().getFalseBlockOperationParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleOperation_in_ruleConditional684);
            lv_falseBlock_9_0=ruleOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	        }
                   		set(
                   			current, 
                   			"falseBlock",
                    		lv_falseBlock_9_0, 
                    		"Operation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleConditional696); 

                	newLeafNode(otherlv_10, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleHayBolitas"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:329:1: entryRuleHayBolitas returns [EObject current=null] : iv_ruleHayBolitas= ruleHayBolitas EOF ;
    public final EObject entryRuleHayBolitas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHayBolitas = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:330:2: (iv_ruleHayBolitas= ruleHayBolitas EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:331:2: iv_ruleHayBolitas= ruleHayBolitas EOF
            {
             newCompositeNode(grammarAccess.getHayBolitasRule()); 
            pushFollow(FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas732);
            iv_ruleHayBolitas=ruleHayBolitas();

            state._fsp--;

             current =iv_ruleHayBolitas; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHayBolitas742); 

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
    // $ANTLR end "entryRuleHayBolitas"


    // $ANTLR start "ruleHayBolitas"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:338:1: ruleHayBolitas returns [EObject current=null] : (otherlv_0= 'hayBolitas' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' ) ;
    public final EObject ruleHayBolitas() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:341:28: ( (otherlv_0= 'hayBolitas' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:342:1: (otherlv_0= 'hayBolitas' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:342:1: (otherlv_0= 'hayBolitas' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:342:3: otherlv_0= 'hayBolitas' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleHayBolitas779); 

                	newLeafNode(otherlv_0, grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleHayBolitas791); 

                	newLeafNode(otherlv_1, grammarAccess.getHayBolitasAccess().getLeftParenthesisKeyword_1());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:350:1: ( (lv_param_2_0= ruleColor ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:351:1: (lv_param_2_0= ruleColor )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:351:1: (lv_param_2_0= ruleColor )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:352:3: lv_param_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getHayBolitasAccess().getParamColorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleHayBolitas812);
            lv_param_2_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHayBolitasRule());
            	        }
                   		set(
                   			current, 
                   			"param",
                    		lv_param_2_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleHayBolitas824); 

                	newLeafNode(otherlv_3, grammarAccess.getHayBolitasAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleHayBolitas"


    // $ANTLR start "entryRuleMover"
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:380:1: entryRuleMover returns [EObject current=null] : iv_ruleMover= ruleMover EOF ;
    public final EObject entryRuleMover() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMover = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:381:2: (iv_ruleMover= ruleMover EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:382:2: iv_ruleMover= ruleMover EOF
            {
             newCompositeNode(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover860);
            iv_ruleMover=ruleMover();

            state._fsp--;

             current =iv_ruleMover; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover870); 

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:389:1: ruleMover returns [EObject current=null] : (otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')' ) ;
    public final EObject ruleMover() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:392:28: ( (otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:393:1: (otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:393:1: (otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')' )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:393:3: otherlv_0= 'Mover' otherlv_1= '(' ( (lv_param_2_0= ruleDireccion ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMover907); 

                	newLeafNode(otherlv_0, grammarAccess.getMoverAccess().getMoverKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMover919); 

                	newLeafNode(otherlv_1, grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:401:1: ( (lv_param_2_0= ruleDireccion ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:402:1: (lv_param_2_0= ruleDireccion )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:402:1: (lv_param_2_0= ruleDireccion )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:403:3: lv_param_2_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_ruleMover940);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMover952); 

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:431:1: entryRulePoner returns [EObject current=null] : iv_rulePoner= rulePoner EOF ;
    public final EObject entryRulePoner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoner = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:432:2: (iv_rulePoner= rulePoner EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:433:2: iv_rulePoner= rulePoner EOF
            {
             newCompositeNode(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner988);
            iv_rulePoner=rulePoner();

            state._fsp--;

             current =iv_rulePoner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner998); 

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:440:1: rulePoner returns [EObject current=null] : (otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' ) ;
    public final EObject rulePoner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:443:28: ( (otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:444:1: (otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:444:1: (otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')' )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:444:3: otherlv_0= 'Poner' otherlv_1= '(' ( (lv_param_2_0= ruleColor ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePoner1035); 

                	newLeafNode(otherlv_0, grammarAccess.getPonerAccess().getPonerKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePoner1047); 

                	newLeafNode(otherlv_1, grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1());
                
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:452:1: ( (lv_param_2_0= ruleColor ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:453:1: (lv_param_2_0= ruleColor )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:453:1: (lv_param_2_0= ruleColor )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:454:3: lv_param_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_rulePoner1068);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePoner1080); 

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:482:1: entryRuleDireccion returns [String current=null] : iv_ruleDireccion= ruleDireccion EOF ;
    public final String entryRuleDireccion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDireccion = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:483:2: (iv_ruleDireccion= ruleDireccion EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:484:2: iv_ruleDireccion= ruleDireccion EOF
            {
             newCompositeNode(grammarAccess.getDireccionRule()); 
            pushFollow(FOLLOW_ruleDireccion_in_entryRuleDireccion1117);
            iv_ruleDireccion=ruleDireccion();

            state._fsp--;

             current =iv_ruleDireccion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDireccion1128); 

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:491:1: ruleDireccion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Norte' | kw= 'Sur' | kw= 'Este' | kw= 'Oeste' ) ;
    public final AntlrDatatypeRuleToken ruleDireccion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:494:28: ( (kw= 'Norte' | kw= 'Sur' | kw= 'Este' | kw= 'Oeste' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:495:1: (kw= 'Norte' | kw= 'Sur' | kw= 'Este' | kw= 'Oeste' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:495:1: (kw= 'Norte' | kw= 'Sur' | kw= 'Este' | kw= 'Oeste' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
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
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:496:2: kw= 'Norte'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleDireccion1166); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDireccionAccess().getNorteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:503:2: kw= 'Sur'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleDireccion1185); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDireccionAccess().getSurKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:510:2: kw= 'Este'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleDireccion1204); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDireccionAccess().getEsteKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:517:2: kw= 'Oeste'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleDireccion1223); 

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:530:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:531:2: (iv_ruleColor= ruleColor EOF )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:532:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor1264);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor1275); 

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
    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:539:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Rojo' | kw= 'Verde' | kw= 'Azul' | kw= 'Negro' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:542:28: ( (kw= 'Rojo' | kw= 'Verde' | kw= 'Azul' | kw= 'Negro' ) )
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:543:1: (kw= 'Rojo' | kw= 'Verde' | kw= 'Azul' | kw= 'Negro' )
            {
            // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:543:1: (kw= 'Rojo' | kw= 'Verde' | kw= 'Azul' | kw= 'Negro' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:544:2: kw= 'Rojo'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleColor1313); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getRojoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:551:2: kw= 'Verde'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleColor1332); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getVerdeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:558:2: kw= 'Azul'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleColor1351); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getAzulKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../tp4.gbs/src-gen/tp4/gbs/parser/antlr/internal/InternalGobstons.g:565:2: kw= 'Negro'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleColor1370); 

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
    public static final BitSet FOLLOW_11_in_ruleProcedureDeclaration131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcedureDeclaration143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProcedureDeclaration155 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcedureDeclaration167 = new BitSet(new long[]{0x0000000000718000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleProcedureDeclaration188 = new BitSet(new long[]{0x0000000000718000L});
    public static final BitSet FOLLOW_15_in_ruleProcedureDeclaration201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleOperation294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleOperation321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_ruleFunction413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_ruleFunction440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_ruleFunction467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConditional549 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConditional561 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_ruleConditional582 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConditional594 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConditional606 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleConditional627 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConditional639 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConditional651 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConditional663 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleConditional684 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConditional696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHayBolitas742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHayBolitas779 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHayBolitas791 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleHayBolitas812 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHayBolitas824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMover907 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMover919 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_ruleDireccion_in_ruleMover940 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMover952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePoner1035 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePoner1047 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_ruleColor_in_rulePoner1068 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePoner1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_entryRuleDireccion1117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDireccion1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDireccion1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDireccion1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDireccion1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDireccion1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleColor1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleColor1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleColor1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleColor1370 = new BitSet(new long[]{0x0000000000000002L});

}