package tp4.gbs.ui.contentassist.antlr.internal; 

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
import tp4.gbs.services.GobstonsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGobstonsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Norte'", "'Sur'", "'Este'", "'Oeste'", "'Rojo'", "'Verde'", "'Azul'", "'Negro'", "'procedure'", "'Main'", "'()'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'hayBolitas'", "'Mover'", "'Poner'"
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
    public String getGrammarFileName() { return "../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g"; }


     
     	private GobstonsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GobstonsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProcedureDeclaration"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:60:1: entryRuleProcedureDeclaration : ruleProcedureDeclaration EOF ;
    public final void entryRuleProcedureDeclaration() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:61:1: ( ruleProcedureDeclaration EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:62:1: ruleProcedureDeclaration EOF
            {
             before(grammarAccess.getProcedureDeclarationRule()); 
            pushFollow(FOLLOW_ruleProcedureDeclaration_in_entryRuleProcedureDeclaration61);
            ruleProcedureDeclaration();

            state._fsp--;

             after(grammarAccess.getProcedureDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedureDeclaration68); 

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
    // $ANTLR end "entryRuleProcedureDeclaration"


    // $ANTLR start "ruleProcedureDeclaration"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:69:1: ruleProcedureDeclaration : ( ( rule__ProcedureDeclaration__Group__0 ) ) ;
    public final void ruleProcedureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:73:2: ( ( ( rule__ProcedureDeclaration__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:74:1: ( ( rule__ProcedureDeclaration__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:74:1: ( ( rule__ProcedureDeclaration__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:75:1: ( rule__ProcedureDeclaration__Group__0 )
            {
             before(grammarAccess.getProcedureDeclarationAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:76:1: ( rule__ProcedureDeclaration__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:76:2: rule__ProcedureDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__0_in_ruleProcedureDeclaration94);
            rule__ProcedureDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedureDeclaration"


    // $ANTLR start "entryRuleOperation"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:88:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:89:1: ( ruleOperation EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:90:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation121);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation128); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:97:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:101:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:102:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:102:1: ( ( rule__Operation__Alternatives ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:103:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:104:1: ( rule__Operation__Alternatives )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:104:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation154);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleFunction"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:116:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:117:1: ( ruleFunction EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:118:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction181);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction188); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:125:1: ruleFunction : ( ( rule__Function__Alternatives ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:129:2: ( ( ( rule__Function__Alternatives ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:130:1: ( ( rule__Function__Alternatives ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:130:1: ( ( rule__Function__Alternatives ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:131:1: ( rule__Function__Alternatives )
            {
             before(grammarAccess.getFunctionAccess().getAlternatives()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:132:1: ( rule__Function__Alternatives )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:132:2: rule__Function__Alternatives
            {
            pushFollow(FOLLOW_rule__Function__Alternatives_in_ruleFunction214);
            rule__Function__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleConditional"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:144:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:145:1: ( ruleConditional EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:146:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional241);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional248); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:153:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:157:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:158:1: ( ( rule__Conditional__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:158:1: ( ( rule__Conditional__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:159:1: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:160:1: ( rule__Conditional__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:160:2: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_rule__Conditional__Group__0_in_ruleConditional274);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleHayBolitas"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:172:1: entryRuleHayBolitas : ruleHayBolitas EOF ;
    public final void entryRuleHayBolitas() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:173:1: ( ruleHayBolitas EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:174:1: ruleHayBolitas EOF
            {
             before(grammarAccess.getHayBolitasRule()); 
            pushFollow(FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas301);
            ruleHayBolitas();

            state._fsp--;

             after(grammarAccess.getHayBolitasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHayBolitas308); 

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
    // $ANTLR end "entryRuleHayBolitas"


    // $ANTLR start "ruleHayBolitas"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:181:1: ruleHayBolitas : ( ( rule__HayBolitas__Group__0 ) ) ;
    public final void ruleHayBolitas() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:185:2: ( ( ( rule__HayBolitas__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:186:1: ( ( rule__HayBolitas__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:186:1: ( ( rule__HayBolitas__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:187:1: ( rule__HayBolitas__Group__0 )
            {
             before(grammarAccess.getHayBolitasAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:188:1: ( rule__HayBolitas__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:188:2: rule__HayBolitas__Group__0
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__0_in_ruleHayBolitas334);
            rule__HayBolitas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHayBolitasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHayBolitas"


    // $ANTLR start "entryRuleMover"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:200:1: entryRuleMover : ruleMover EOF ;
    public final void entryRuleMover() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:201:1: ( ruleMover EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:202:1: ruleMover EOF
            {
             before(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover361);
            ruleMover();

            state._fsp--;

             after(grammarAccess.getMoverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover368); 

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
    // $ANTLR end "entryRuleMover"


    // $ANTLR start "ruleMover"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:209:1: ruleMover : ( ( rule__Mover__Group__0 ) ) ;
    public final void ruleMover() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:213:2: ( ( ( rule__Mover__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:214:1: ( ( rule__Mover__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:214:1: ( ( rule__Mover__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:215:1: ( rule__Mover__Group__0 )
            {
             before(grammarAccess.getMoverAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:216:1: ( rule__Mover__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:216:2: rule__Mover__Group__0
            {
            pushFollow(FOLLOW_rule__Mover__Group__0_in_ruleMover394);
            rule__Mover__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMover"


    // $ANTLR start "entryRulePoner"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:228:1: entryRulePoner : rulePoner EOF ;
    public final void entryRulePoner() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:229:1: ( rulePoner EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:230:1: rulePoner EOF
            {
             before(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner421);
            rulePoner();

            state._fsp--;

             after(grammarAccess.getPonerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner428); 

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
    // $ANTLR end "entryRulePoner"


    // $ANTLR start "rulePoner"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:237:1: rulePoner : ( ( rule__Poner__Group__0 ) ) ;
    public final void rulePoner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:241:2: ( ( ( rule__Poner__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:242:1: ( ( rule__Poner__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:242:1: ( ( rule__Poner__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:243:1: ( rule__Poner__Group__0 )
            {
             before(grammarAccess.getPonerAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:244:1: ( rule__Poner__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:244:2: rule__Poner__Group__0
            {
            pushFollow(FOLLOW_rule__Poner__Group__0_in_rulePoner454);
            rule__Poner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPonerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoner"


    // $ANTLR start "entryRuleDireccion"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:256:1: entryRuleDireccion : ruleDireccion EOF ;
    public final void entryRuleDireccion() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:257:1: ( ruleDireccion EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:258:1: ruleDireccion EOF
            {
             before(grammarAccess.getDireccionRule()); 
            pushFollow(FOLLOW_ruleDireccion_in_entryRuleDireccion481);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getDireccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDireccion488); 

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
    // $ANTLR end "entryRuleDireccion"


    // $ANTLR start "ruleDireccion"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:265:1: ruleDireccion : ( ( rule__Direccion__Alternatives ) ) ;
    public final void ruleDireccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:269:2: ( ( ( rule__Direccion__Alternatives ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:270:1: ( ( rule__Direccion__Alternatives ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:270:1: ( ( rule__Direccion__Alternatives ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:271:1: ( rule__Direccion__Alternatives )
            {
             before(grammarAccess.getDireccionAccess().getAlternatives()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:272:1: ( rule__Direccion__Alternatives )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:272:2: rule__Direccion__Alternatives
            {
            pushFollow(FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion514);
            rule__Direccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDireccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDireccion"


    // $ANTLR start "entryRuleColor"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:284:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:285:1: ( ruleColor EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:286:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor541);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor548); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:293:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:297:2: ( ( ( rule__Color__Alternatives ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:298:1: ( ( rule__Color__Alternatives ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:298:1: ( ( rule__Color__Alternatives ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:299:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:300:1: ( rule__Color__Alternatives )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:300:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor574);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rule__Operation__Alternatives"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:312:1: rule__Operation__Alternatives : ( ( ruleFunction ) | ( ruleConditional ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:316:1: ( ( ruleFunction ) | ( ruleConditional ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=28 && LA1_0<=30)) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:317:1: ( ruleFunction )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:317:1: ( ruleFunction )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:318:1: ruleFunction
                    {
                     before(grammarAccess.getOperationAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__Operation__Alternatives610);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:323:6: ( ruleConditional )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:323:6: ( ruleConditional )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:324:1: ruleConditional
                    {
                     before(grammarAccess.getOperationAccess().getConditionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConditional_in_rule__Operation__Alternatives627);
                    ruleConditional();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getConditionalParserRuleCall_1()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Function__Alternatives"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:334:1: rule__Function__Alternatives : ( ( ruleMover ) | ( rulePoner ) | ( ruleHayBolitas ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:338:1: ( ( ruleMover ) | ( rulePoner ) | ( ruleHayBolitas ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:339:1: ( ruleMover )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:339:1: ( ruleMover )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:340:1: ruleMover
                    {
                     before(grammarAccess.getFunctionAccess().getMoverParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMover_in_rule__Function__Alternatives659);
                    ruleMover();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getMoverParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:345:6: ( rulePoner )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:345:6: ( rulePoner )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:346:1: rulePoner
                    {
                     before(grammarAccess.getFunctionAccess().getPonerParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePoner_in_rule__Function__Alternatives676);
                    rulePoner();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getPonerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:351:6: ( ruleHayBolitas )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:351:6: ( ruleHayBolitas )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:352:1: ruleHayBolitas
                    {
                     before(grammarAccess.getFunctionAccess().getHayBolitasParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHayBolitas_in_rule__Function__Alternatives693);
                    ruleHayBolitas();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getHayBolitasParserRuleCall_2()); 

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
    // $ANTLR end "rule__Function__Alternatives"


    // $ANTLR start "rule__Direccion__Alternatives"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:362:1: rule__Direccion__Alternatives : ( ( 'Norte' ) | ( 'Sur' ) | ( 'Este' ) | ( 'Oeste' ) );
    public final void rule__Direccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:366:1: ( ( 'Norte' ) | ( 'Sur' ) | ( 'Este' ) | ( 'Oeste' ) )
            int alt3=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:367:1: ( 'Norte' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:367:1: ( 'Norte' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:368:1: 'Norte'
                    {
                     before(grammarAccess.getDireccionAccess().getNorteKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Direccion__Alternatives726); 
                     after(grammarAccess.getDireccionAccess().getNorteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:375:6: ( 'Sur' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:375:6: ( 'Sur' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:376:1: 'Sur'
                    {
                     before(grammarAccess.getDireccionAccess().getSurKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Direccion__Alternatives746); 
                     after(grammarAccess.getDireccionAccess().getSurKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:383:6: ( 'Este' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:383:6: ( 'Este' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:384:1: 'Este'
                    {
                     before(grammarAccess.getDireccionAccess().getEsteKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Direccion__Alternatives766); 
                     after(grammarAccess.getDireccionAccess().getEsteKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:391:6: ( 'Oeste' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:391:6: ( 'Oeste' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:392:1: 'Oeste'
                    {
                     before(grammarAccess.getDireccionAccess().getOesteKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Direccion__Alternatives786); 
                     after(grammarAccess.getDireccionAccess().getOesteKeyword_3()); 

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
    // $ANTLR end "rule__Direccion__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:404:1: rule__Color__Alternatives : ( ( 'Rojo' ) | ( 'Verde' ) | ( 'Azul' ) | ( 'Negro' ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:408:1: ( ( 'Rojo' ) | ( 'Verde' ) | ( 'Azul' ) | ( 'Negro' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
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
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:409:1: ( 'Rojo' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:409:1: ( 'Rojo' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:410:1: 'Rojo'
                    {
                     before(grammarAccess.getColorAccess().getRojoKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Color__Alternatives821); 
                     after(grammarAccess.getColorAccess().getRojoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:417:6: ( 'Verde' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:417:6: ( 'Verde' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:418:1: 'Verde'
                    {
                     before(grammarAccess.getColorAccess().getVerdeKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__Color__Alternatives841); 
                     after(grammarAccess.getColorAccess().getVerdeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:425:6: ( 'Azul' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:425:6: ( 'Azul' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:426:1: 'Azul'
                    {
                     before(grammarAccess.getColorAccess().getAzulKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__Color__Alternatives861); 
                     after(grammarAccess.getColorAccess().getAzulKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:433:6: ( 'Negro' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:433:6: ( 'Negro' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:434:1: 'Negro'
                    {
                     before(grammarAccess.getColorAccess().getNegroKeyword_3()); 
                    match(input,18,FOLLOW_18_in_rule__Color__Alternatives881); 
                     after(grammarAccess.getColorAccess().getNegroKeyword_3()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__ProcedureDeclaration__Group__0"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:448:1: rule__ProcedureDeclaration__Group__0 : rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1 ;
    public final void rule__ProcedureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:452:1: ( rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:453:2: rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__0__Impl_in_rule__ProcedureDeclaration__Group__0913);
            rule__ProcedureDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__1_in_rule__ProcedureDeclaration__Group__0916);
            rule__ProcedureDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__0"


    // $ANTLR start "rule__ProcedureDeclaration__Group__0__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:460:1: rule__ProcedureDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ProcedureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:464:1: ( ( () ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:465:1: ( () )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:465:1: ( () )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:466:1: ()
            {
             before(grammarAccess.getProcedureDeclarationAccess().getProcedureDeclarationAction_0()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:467:1: ()
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:469:1: 
            {
            }

             after(grammarAccess.getProcedureDeclarationAccess().getProcedureDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ProcedureDeclaration__Group__1"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:479:1: rule__ProcedureDeclaration__Group__1 : rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2 ;
    public final void rule__ProcedureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:483:1: ( rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:484:2: rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__1__Impl_in_rule__ProcedureDeclaration__Group__1974);
            rule__ProcedureDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__2_in_rule__ProcedureDeclaration__Group__1977);
            rule__ProcedureDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__1"


    // $ANTLR start "rule__ProcedureDeclaration__Group__1__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:491:1: rule__ProcedureDeclaration__Group__1__Impl : ( 'procedure' ) ;
    public final void rule__ProcedureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:495:1: ( ( 'procedure' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:496:1: ( 'procedure' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:496:1: ( 'procedure' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:497:1: 'procedure'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ProcedureDeclaration__Group__1__Impl1005); 
             after(grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ProcedureDeclaration__Group__2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:510:1: rule__ProcedureDeclaration__Group__2 : rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3 ;
    public final void rule__ProcedureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:514:1: ( rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:515:2: rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__2__Impl_in_rule__ProcedureDeclaration__Group__21036);
            rule__ProcedureDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__3_in_rule__ProcedureDeclaration__Group__21039);
            rule__ProcedureDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__2"


    // $ANTLR start "rule__ProcedureDeclaration__Group__2__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:522:1: rule__ProcedureDeclaration__Group__2__Impl : ( 'Main' ) ;
    public final void rule__ProcedureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:526:1: ( ( 'Main' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:527:1: ( 'Main' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:527:1: ( 'Main' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:528:1: 'Main'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getMainKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__ProcedureDeclaration__Group__2__Impl1067); 
             after(grammarAccess.getProcedureDeclarationAccess().getMainKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ProcedureDeclaration__Group__3"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:541:1: rule__ProcedureDeclaration__Group__3 : rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4 ;
    public final void rule__ProcedureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:545:1: ( rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:546:2: rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__3__Impl_in_rule__ProcedureDeclaration__Group__31098);
            rule__ProcedureDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__4_in_rule__ProcedureDeclaration__Group__31101);
            rule__ProcedureDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__3"


    // $ANTLR start "rule__ProcedureDeclaration__Group__3__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:553:1: rule__ProcedureDeclaration__Group__3__Impl : ( '()' ) ;
    public final void rule__ProcedureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:557:1: ( ( '()' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:558:1: ( '()' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:558:1: ( '()' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:559:1: '()'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ProcedureDeclaration__Group__3__Impl1129); 
             after(grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ProcedureDeclaration__Group__4"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:572:1: rule__ProcedureDeclaration__Group__4 : rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5 ;
    public final void rule__ProcedureDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:576:1: ( rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:577:2: rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__4__Impl_in_rule__ProcedureDeclaration__Group__41160);
            rule__ProcedureDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__5_in_rule__ProcedureDeclaration__Group__41163);
            rule__ProcedureDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__4"


    // $ANTLR start "rule__ProcedureDeclaration__Group__4__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:584:1: rule__ProcedureDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__ProcedureDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:588:1: ( ( '{' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:589:1: ( '{' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:589:1: ( '{' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:590:1: '{'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ProcedureDeclaration__Group__4__Impl1191); 
             after(grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ProcedureDeclaration__Group__5"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:603:1: rule__ProcedureDeclaration__Group__5 : rule__ProcedureDeclaration__Group__5__Impl rule__ProcedureDeclaration__Group__6 ;
    public final void rule__ProcedureDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:607:1: ( rule__ProcedureDeclaration__Group__5__Impl rule__ProcedureDeclaration__Group__6 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:608:2: rule__ProcedureDeclaration__Group__5__Impl rule__ProcedureDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__5__Impl_in_rule__ProcedureDeclaration__Group__51222);
            rule__ProcedureDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__6_in_rule__ProcedureDeclaration__Group__51225);
            rule__ProcedureDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__5"


    // $ANTLR start "rule__ProcedureDeclaration__Group__5__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:615:1: rule__ProcedureDeclaration__Group__5__Impl : ( ( rule__ProcedureDeclaration__OperationsAssignment_5 )* ) ;
    public final void rule__ProcedureDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:619:1: ( ( ( rule__ProcedureDeclaration__OperationsAssignment_5 )* ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:620:1: ( ( rule__ProcedureDeclaration__OperationsAssignment_5 )* )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:620:1: ( ( rule__ProcedureDeclaration__OperationsAssignment_5 )* )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:621:1: ( rule__ProcedureDeclaration__OperationsAssignment_5 )*
            {
             before(grammarAccess.getProcedureDeclarationAccess().getOperationsAssignment_5()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:622:1: ( rule__ProcedureDeclaration__OperationsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24||(LA5_0>=28 && LA5_0<=30)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:622:2: rule__ProcedureDeclaration__OperationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ProcedureDeclaration__OperationsAssignment_5_in_rule__ProcedureDeclaration__Group__5__Impl1252);
            	    rule__ProcedureDeclaration__OperationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcedureDeclarationAccess().getOperationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ProcedureDeclaration__Group__6"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:632:1: rule__ProcedureDeclaration__Group__6 : rule__ProcedureDeclaration__Group__6__Impl ;
    public final void rule__ProcedureDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:636:1: ( rule__ProcedureDeclaration__Group__6__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:637:2: rule__ProcedureDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__6__Impl_in_rule__ProcedureDeclaration__Group__61283);
            rule__ProcedureDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__6"


    // $ANTLR start "rule__ProcedureDeclaration__Group__6__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:643:1: rule__ProcedureDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__ProcedureDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:647:1: ( ( '}' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:648:1: ( '}' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:648:1: ( '}' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:649:1: '}'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__ProcedureDeclaration__Group__6__Impl1311); 
             after(grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__6__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:676:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:680:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:681:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__01356);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__01359);
            rule__Conditional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:688:1: rule__Conditional__Group__0__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:692:1: ( ( 'if' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:693:1: ( 'if' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:693:1: ( 'if' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:694:1: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Conditional__Group__0__Impl1387); 
             after(grammarAccess.getConditionalAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:707:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:711:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:712:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__11418);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__11421);
            rule__Conditional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:719:1: rule__Conditional__Group__1__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:723:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:724:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:724:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:725:1: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Conditional__Group__1__Impl1449); 
             after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:738:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:742:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:743:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__21480);
            rule__Conditional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__21483);
            rule__Conditional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:750:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__BoolExpresionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:754:1: ( ( ( rule__Conditional__BoolExpresionAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:755:1: ( ( rule__Conditional__BoolExpresionAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:755:1: ( ( rule__Conditional__BoolExpresionAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:756:1: ( rule__Conditional__BoolExpresionAssignment_2 )
            {
             before(grammarAccess.getConditionalAccess().getBoolExpresionAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:757:1: ( rule__Conditional__BoolExpresionAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:757:2: rule__Conditional__BoolExpresionAssignment_2
            {
            pushFollow(FOLLOW_rule__Conditional__BoolExpresionAssignment_2_in_rule__Conditional__Group__2__Impl1510);
            rule__Conditional__BoolExpresionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getBoolExpresionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:767:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:771:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:772:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__31540);
            rule__Conditional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__31543);
            rule__Conditional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:779:1: rule__Conditional__Group__3__Impl : ( ')' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:783:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:784:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:784:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:785:1: ')'
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Conditional__Group__3__Impl1571); 
             after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:798:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:802:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:803:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__41602);
            rule__Conditional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__41605);
            rule__Conditional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:810:1: rule__Conditional__Group__4__Impl : ( '{' ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:814:1: ( ( '{' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:815:1: ( '{' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:815:1: ( '{' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:816:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Conditional__Group__4__Impl1633); 
             after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:829:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:833:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:834:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__51664);
            rule__Conditional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__51667);
            rule__Conditional__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:841:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__TrueBlockAssignment_5 ) ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:845:1: ( ( ( rule__Conditional__TrueBlockAssignment_5 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:846:1: ( ( rule__Conditional__TrueBlockAssignment_5 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:846:1: ( ( rule__Conditional__TrueBlockAssignment_5 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:847:1: ( rule__Conditional__TrueBlockAssignment_5 )
            {
             before(grammarAccess.getConditionalAccess().getTrueBlockAssignment_5()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:848:1: ( rule__Conditional__TrueBlockAssignment_5 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:848:2: rule__Conditional__TrueBlockAssignment_5
            {
            pushFollow(FOLLOW_rule__Conditional__TrueBlockAssignment_5_in_rule__Conditional__Group__5__Impl1694);
            rule__Conditional__TrueBlockAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getTrueBlockAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__Conditional__Group__6"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:858:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl rule__Conditional__Group__7 ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:862:1: ( rule__Conditional__Group__6__Impl rule__Conditional__Group__7 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:863:2: rule__Conditional__Group__6__Impl rule__Conditional__Group__7
            {
            pushFollow(FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__61724);
            rule__Conditional__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__7_in_rule__Conditional__Group__61727);
            rule__Conditional__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__6"


    // $ANTLR start "rule__Conditional__Group__6__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:870:1: rule__Conditional__Group__6__Impl : ( '}' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:874:1: ( ( '}' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:875:1: ( '}' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:875:1: ( '}' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:876:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__Conditional__Group__6__Impl1755); 
             after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__6__Impl"


    // $ANTLR start "rule__Conditional__Group__7"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:889:1: rule__Conditional__Group__7 : rule__Conditional__Group__7__Impl rule__Conditional__Group__8 ;
    public final void rule__Conditional__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:893:1: ( rule__Conditional__Group__7__Impl rule__Conditional__Group__8 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:894:2: rule__Conditional__Group__7__Impl rule__Conditional__Group__8
            {
            pushFollow(FOLLOW_rule__Conditional__Group__7__Impl_in_rule__Conditional__Group__71786);
            rule__Conditional__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__8_in_rule__Conditional__Group__71789);
            rule__Conditional__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__7"


    // $ANTLR start "rule__Conditional__Group__7__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:901:1: rule__Conditional__Group__7__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:905:1: ( ( 'else' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:906:1: ( 'else' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:906:1: ( 'else' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:907:1: 'else'
            {
             before(grammarAccess.getConditionalAccess().getElseKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__Conditional__Group__7__Impl1817); 
             after(grammarAccess.getConditionalAccess().getElseKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__7__Impl"


    // $ANTLR start "rule__Conditional__Group__8"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:920:1: rule__Conditional__Group__8 : rule__Conditional__Group__8__Impl rule__Conditional__Group__9 ;
    public final void rule__Conditional__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:924:1: ( rule__Conditional__Group__8__Impl rule__Conditional__Group__9 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:925:2: rule__Conditional__Group__8__Impl rule__Conditional__Group__9
            {
            pushFollow(FOLLOW_rule__Conditional__Group__8__Impl_in_rule__Conditional__Group__81848);
            rule__Conditional__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__9_in_rule__Conditional__Group__81851);
            rule__Conditional__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__8"


    // $ANTLR start "rule__Conditional__Group__8__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:932:1: rule__Conditional__Group__8__Impl : ( '{' ) ;
    public final void rule__Conditional__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:936:1: ( ( '{' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:937:1: ( '{' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:937:1: ( '{' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:938:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_22_in_rule__Conditional__Group__8__Impl1879); 
             after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__8__Impl"


    // $ANTLR start "rule__Conditional__Group__9"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:951:1: rule__Conditional__Group__9 : rule__Conditional__Group__9__Impl rule__Conditional__Group__10 ;
    public final void rule__Conditional__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:955:1: ( rule__Conditional__Group__9__Impl rule__Conditional__Group__10 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:956:2: rule__Conditional__Group__9__Impl rule__Conditional__Group__10
            {
            pushFollow(FOLLOW_rule__Conditional__Group__9__Impl_in_rule__Conditional__Group__91910);
            rule__Conditional__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__10_in_rule__Conditional__Group__91913);
            rule__Conditional__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__9"


    // $ANTLR start "rule__Conditional__Group__9__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:963:1: rule__Conditional__Group__9__Impl : ( ( rule__Conditional__FalseBlockAssignment_9 ) ) ;
    public final void rule__Conditional__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:967:1: ( ( ( rule__Conditional__FalseBlockAssignment_9 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:968:1: ( ( rule__Conditional__FalseBlockAssignment_9 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:968:1: ( ( rule__Conditional__FalseBlockAssignment_9 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:969:1: ( rule__Conditional__FalseBlockAssignment_9 )
            {
             before(grammarAccess.getConditionalAccess().getFalseBlockAssignment_9()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:970:1: ( rule__Conditional__FalseBlockAssignment_9 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:970:2: rule__Conditional__FalseBlockAssignment_9
            {
            pushFollow(FOLLOW_rule__Conditional__FalseBlockAssignment_9_in_rule__Conditional__Group__9__Impl1940);
            rule__Conditional__FalseBlockAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getFalseBlockAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__9__Impl"


    // $ANTLR start "rule__Conditional__Group__10"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:980:1: rule__Conditional__Group__10 : rule__Conditional__Group__10__Impl ;
    public final void rule__Conditional__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:984:1: ( rule__Conditional__Group__10__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:985:2: rule__Conditional__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group__10__Impl_in_rule__Conditional__Group__101970);
            rule__Conditional__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__10"


    // $ANTLR start "rule__Conditional__Group__10__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:991:1: rule__Conditional__Group__10__Impl : ( '}' ) ;
    public final void rule__Conditional__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:995:1: ( ( '}' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:996:1: ( '}' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:996:1: ( '}' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:997:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FOLLOW_23_in_rule__Conditional__Group__10__Impl1998); 
             after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__10__Impl"


    // $ANTLR start "rule__HayBolitas__Group__0"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1032:1: rule__HayBolitas__Group__0 : rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1 ;
    public final void rule__HayBolitas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1036:1: ( rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1037:2: rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__0__Impl_in_rule__HayBolitas__Group__02051);
            rule__HayBolitas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__1_in_rule__HayBolitas__Group__02054);
            rule__HayBolitas__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__0"


    // $ANTLR start "rule__HayBolitas__Group__0__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1044:1: rule__HayBolitas__Group__0__Impl : ( 'hayBolitas' ) ;
    public final void rule__HayBolitas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1048:1: ( ( 'hayBolitas' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1049:1: ( 'hayBolitas' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1049:1: ( 'hayBolitas' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1050:1: 'hayBolitas'
            {
             before(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__HayBolitas__Group__0__Impl2082); 
             after(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__0__Impl"


    // $ANTLR start "rule__HayBolitas__Group__1"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1063:1: rule__HayBolitas__Group__1 : rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2 ;
    public final void rule__HayBolitas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1067:1: ( rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1068:2: rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__1__Impl_in_rule__HayBolitas__Group__12113);
            rule__HayBolitas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__2_in_rule__HayBolitas__Group__12116);
            rule__HayBolitas__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__1"


    // $ANTLR start "rule__HayBolitas__Group__1__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1075:1: rule__HayBolitas__Group__1__Impl : ( '(' ) ;
    public final void rule__HayBolitas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1079:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1080:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1080:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1081:1: '('
            {
             before(grammarAccess.getHayBolitasAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__HayBolitas__Group__1__Impl2144); 
             after(grammarAccess.getHayBolitasAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__1__Impl"


    // $ANTLR start "rule__HayBolitas__Group__2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1094:1: rule__HayBolitas__Group__2 : rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3 ;
    public final void rule__HayBolitas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1098:1: ( rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1099:2: rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__2__Impl_in_rule__HayBolitas__Group__22175);
            rule__HayBolitas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__3_in_rule__HayBolitas__Group__22178);
            rule__HayBolitas__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__2"


    // $ANTLR start "rule__HayBolitas__Group__2__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1106:1: rule__HayBolitas__Group__2__Impl : ( ( rule__HayBolitas__ParamAssignment_2 ) ) ;
    public final void rule__HayBolitas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1110:1: ( ( ( rule__HayBolitas__ParamAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1111:1: ( ( rule__HayBolitas__ParamAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1111:1: ( ( rule__HayBolitas__ParamAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1112:1: ( rule__HayBolitas__ParamAssignment_2 )
            {
             before(grammarAccess.getHayBolitasAccess().getParamAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1113:1: ( rule__HayBolitas__ParamAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1113:2: rule__HayBolitas__ParamAssignment_2
            {
            pushFollow(FOLLOW_rule__HayBolitas__ParamAssignment_2_in_rule__HayBolitas__Group__2__Impl2205);
            rule__HayBolitas__ParamAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHayBolitasAccess().getParamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__2__Impl"


    // $ANTLR start "rule__HayBolitas__Group__3"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1123:1: rule__HayBolitas__Group__3 : rule__HayBolitas__Group__3__Impl ;
    public final void rule__HayBolitas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1127:1: ( rule__HayBolitas__Group__3__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1128:2: rule__HayBolitas__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__3__Impl_in_rule__HayBolitas__Group__32235);
            rule__HayBolitas__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__3"


    // $ANTLR start "rule__HayBolitas__Group__3__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1134:1: rule__HayBolitas__Group__3__Impl : ( ')' ) ;
    public final void rule__HayBolitas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1138:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1139:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1139:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1140:1: ')'
            {
             before(grammarAccess.getHayBolitasAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__HayBolitas__Group__3__Impl2263); 
             after(grammarAccess.getHayBolitasAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__3__Impl"


    // $ANTLR start "rule__Mover__Group__0"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1161:1: rule__Mover__Group__0 : rule__Mover__Group__0__Impl rule__Mover__Group__1 ;
    public final void rule__Mover__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1165:1: ( rule__Mover__Group__0__Impl rule__Mover__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1166:2: rule__Mover__Group__0__Impl rule__Mover__Group__1
            {
            pushFollow(FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__02302);
            rule__Mover__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__02305);
            rule__Mover__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__0"


    // $ANTLR start "rule__Mover__Group__0__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1173:1: rule__Mover__Group__0__Impl : ( 'Mover' ) ;
    public final void rule__Mover__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1177:1: ( ( 'Mover' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1178:1: ( 'Mover' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1178:1: ( 'Mover' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1179:1: 'Mover'
            {
             before(grammarAccess.getMoverAccess().getMoverKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Mover__Group__0__Impl2333); 
             after(grammarAccess.getMoverAccess().getMoverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__0__Impl"


    // $ANTLR start "rule__Mover__Group__1"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1192:1: rule__Mover__Group__1 : rule__Mover__Group__1__Impl rule__Mover__Group__2 ;
    public final void rule__Mover__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1196:1: ( rule__Mover__Group__1__Impl rule__Mover__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1197:2: rule__Mover__Group__1__Impl rule__Mover__Group__2
            {
            pushFollow(FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__12364);
            rule__Mover__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__12367);
            rule__Mover__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__1"


    // $ANTLR start "rule__Mover__Group__1__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1204:1: rule__Mover__Group__1__Impl : ( '(' ) ;
    public final void rule__Mover__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1208:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1209:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1209:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1210:1: '('
            {
             before(grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Mover__Group__1__Impl2395); 
             after(grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__1__Impl"


    // $ANTLR start "rule__Mover__Group__2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1223:1: rule__Mover__Group__2 : rule__Mover__Group__2__Impl rule__Mover__Group__3 ;
    public final void rule__Mover__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1227:1: ( rule__Mover__Group__2__Impl rule__Mover__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1228:2: rule__Mover__Group__2__Impl rule__Mover__Group__3
            {
            pushFollow(FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__22426);
            rule__Mover__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__22429);
            rule__Mover__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__2"


    // $ANTLR start "rule__Mover__Group__2__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1235:1: rule__Mover__Group__2__Impl : ( ( rule__Mover__ParamAssignment_2 ) ) ;
    public final void rule__Mover__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1239:1: ( ( ( rule__Mover__ParamAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1240:1: ( ( rule__Mover__ParamAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1240:1: ( ( rule__Mover__ParamAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1241:1: ( rule__Mover__ParamAssignment_2 )
            {
             before(grammarAccess.getMoverAccess().getParamAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1242:1: ( rule__Mover__ParamAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1242:2: rule__Mover__ParamAssignment_2
            {
            pushFollow(FOLLOW_rule__Mover__ParamAssignment_2_in_rule__Mover__Group__2__Impl2456);
            rule__Mover__ParamAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoverAccess().getParamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__2__Impl"


    // $ANTLR start "rule__Mover__Group__3"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1252:1: rule__Mover__Group__3 : rule__Mover__Group__3__Impl ;
    public final void rule__Mover__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1256:1: ( rule__Mover__Group__3__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1257:2: rule__Mover__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__32486);
            rule__Mover__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__3"


    // $ANTLR start "rule__Mover__Group__3__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1263:1: rule__Mover__Group__3__Impl : ( ')' ) ;
    public final void rule__Mover__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1267:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1268:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1268:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1269:1: ')'
            {
             before(grammarAccess.getMoverAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Mover__Group__3__Impl2514); 
             after(grammarAccess.getMoverAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__3__Impl"


    // $ANTLR start "rule__Poner__Group__0"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1290:1: rule__Poner__Group__0 : rule__Poner__Group__0__Impl rule__Poner__Group__1 ;
    public final void rule__Poner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1294:1: ( rule__Poner__Group__0__Impl rule__Poner__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1295:2: rule__Poner__Group__0__Impl rule__Poner__Group__1
            {
            pushFollow(FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__02553);
            rule__Poner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__02556);
            rule__Poner__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__0"


    // $ANTLR start "rule__Poner__Group__0__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1302:1: rule__Poner__Group__0__Impl : ( 'Poner' ) ;
    public final void rule__Poner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1306:1: ( ( 'Poner' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1307:1: ( 'Poner' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1307:1: ( 'Poner' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1308:1: 'Poner'
            {
             before(grammarAccess.getPonerAccess().getPonerKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Poner__Group__0__Impl2584); 
             after(grammarAccess.getPonerAccess().getPonerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__0__Impl"


    // $ANTLR start "rule__Poner__Group__1"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1321:1: rule__Poner__Group__1 : rule__Poner__Group__1__Impl rule__Poner__Group__2 ;
    public final void rule__Poner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1325:1: ( rule__Poner__Group__1__Impl rule__Poner__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1326:2: rule__Poner__Group__1__Impl rule__Poner__Group__2
            {
            pushFollow(FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__12615);
            rule__Poner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__12618);
            rule__Poner__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__1"


    // $ANTLR start "rule__Poner__Group__1__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1333:1: rule__Poner__Group__1__Impl : ( '(' ) ;
    public final void rule__Poner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1337:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1338:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1338:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1339:1: '('
            {
             before(grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Poner__Group__1__Impl2646); 
             after(grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__1__Impl"


    // $ANTLR start "rule__Poner__Group__2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1352:1: rule__Poner__Group__2 : rule__Poner__Group__2__Impl rule__Poner__Group__3 ;
    public final void rule__Poner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1356:1: ( rule__Poner__Group__2__Impl rule__Poner__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1357:2: rule__Poner__Group__2__Impl rule__Poner__Group__3
            {
            pushFollow(FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__22677);
            rule__Poner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__22680);
            rule__Poner__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__2"


    // $ANTLR start "rule__Poner__Group__2__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1364:1: rule__Poner__Group__2__Impl : ( ( rule__Poner__ParamAssignment_2 ) ) ;
    public final void rule__Poner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1368:1: ( ( ( rule__Poner__ParamAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1369:1: ( ( rule__Poner__ParamAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1369:1: ( ( rule__Poner__ParamAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1370:1: ( rule__Poner__ParamAssignment_2 )
            {
             before(grammarAccess.getPonerAccess().getParamAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1371:1: ( rule__Poner__ParamAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1371:2: rule__Poner__ParamAssignment_2
            {
            pushFollow(FOLLOW_rule__Poner__ParamAssignment_2_in_rule__Poner__Group__2__Impl2707);
            rule__Poner__ParamAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPonerAccess().getParamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__2__Impl"


    // $ANTLR start "rule__Poner__Group__3"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1381:1: rule__Poner__Group__3 : rule__Poner__Group__3__Impl ;
    public final void rule__Poner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1385:1: ( rule__Poner__Group__3__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1386:2: rule__Poner__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__32737);
            rule__Poner__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__3"


    // $ANTLR start "rule__Poner__Group__3__Impl"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1392:1: rule__Poner__Group__3__Impl : ( ')' ) ;
    public final void rule__Poner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1396:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1397:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1397:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1398:1: ')'
            {
             before(grammarAccess.getPonerAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Poner__Group__3__Impl2765); 
             after(grammarAccess.getPonerAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__3__Impl"


    // $ANTLR start "rule__ProcedureDeclaration__OperationsAssignment_5"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1420:1: rule__ProcedureDeclaration__OperationsAssignment_5 : ( ruleOperation ) ;
    public final void rule__ProcedureDeclaration__OperationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1424:1: ( ( ruleOperation ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1425:1: ( ruleOperation )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1425:1: ( ruleOperation )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1426:1: ruleOperation
            {
             before(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__ProcedureDeclaration__OperationsAssignment_52809);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__OperationsAssignment_5"


    // $ANTLR start "rule__Conditional__BoolExpresionAssignment_2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1435:1: rule__Conditional__BoolExpresionAssignment_2 : ( ruleHayBolitas ) ;
    public final void rule__Conditional__BoolExpresionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1439:1: ( ( ruleHayBolitas ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1440:1: ( ruleHayBolitas )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1440:1: ( ruleHayBolitas )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1441:1: ruleHayBolitas
            {
             before(grammarAccess.getConditionalAccess().getBoolExpresionHayBolitasParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHayBolitas_in_rule__Conditional__BoolExpresionAssignment_22840);
            ruleHayBolitas();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getBoolExpresionHayBolitasParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__BoolExpresionAssignment_2"


    // $ANTLR start "rule__Conditional__TrueBlockAssignment_5"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1450:1: rule__Conditional__TrueBlockAssignment_5 : ( ruleOperation ) ;
    public final void rule__Conditional__TrueBlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1454:1: ( ( ruleOperation ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1455:1: ( ruleOperation )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1455:1: ( ruleOperation )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1456:1: ruleOperation
            {
             before(grammarAccess.getConditionalAccess().getTrueBlockOperationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Conditional__TrueBlockAssignment_52871);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getTrueBlockOperationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__TrueBlockAssignment_5"


    // $ANTLR start "rule__Conditional__FalseBlockAssignment_9"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1465:1: rule__Conditional__FalseBlockAssignment_9 : ( ruleOperation ) ;
    public final void rule__Conditional__FalseBlockAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1469:1: ( ( ruleOperation ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1470:1: ( ruleOperation )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1470:1: ( ruleOperation )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1471:1: ruleOperation
            {
             before(grammarAccess.getConditionalAccess().getFalseBlockOperationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Conditional__FalseBlockAssignment_92902);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getFalseBlockOperationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__FalseBlockAssignment_9"


    // $ANTLR start "rule__HayBolitas__ParamAssignment_2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1480:1: rule__HayBolitas__ParamAssignment_2 : ( ruleColor ) ;
    public final void rule__HayBolitas__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1484:1: ( ( ruleColor ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1485:1: ( ruleColor )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1485:1: ( ruleColor )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1486:1: ruleColor
            {
             before(grammarAccess.getHayBolitasAccess().getParamColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__HayBolitas__ParamAssignment_22933);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getHayBolitasAccess().getParamColorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__ParamAssignment_2"


    // $ANTLR start "rule__Mover__ParamAssignment_2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1495:1: rule__Mover__ParamAssignment_2 : ( ruleDireccion ) ;
    public final void rule__Mover__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1499:1: ( ( ruleDireccion ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1500:1: ( ruleDireccion )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1500:1: ( ruleDireccion )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1501:1: ruleDireccion
            {
             before(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__Mover__ParamAssignment_22964);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__ParamAssignment_2"


    // $ANTLR start "rule__Poner__ParamAssignment_2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1510:1: rule__Poner__ParamAssignment_2 : ( ruleColor ) ;
    public final void rule__Poner__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1514:1: ( ( ruleColor ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1515:1: ( ruleColor )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1515:1: ( ruleColor )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1516:1: ruleColor
            {
             before(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__Poner__ParamAssignment_22995);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__ParamAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProcedureDeclaration_in_entryRuleProcedureDeclaration61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedureDeclaration68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__0_in_ruleProcedureDeclaration94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Alternatives_in_ruleFunction214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__0_in_ruleConditional274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHayBolitas308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__0_in_ruleHayBolitas334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0_in_ruleMover394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0_in_rulePoner454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_entryRuleDireccion481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDireccion488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Operation__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_rule__Operation__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_rule__Function__Alternatives659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_rule__Function__Alternatives676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_rule__Function__Alternatives693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Direccion__Alternatives726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Direccion__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Direccion__Alternatives766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Direccion__Alternatives786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Color__Alternatives821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Color__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Color__Alternatives861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Color__Alternatives881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__0__Impl_in_rule__ProcedureDeclaration__Group__0913 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__1_in_rule__ProcedureDeclaration__Group__0916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__1__Impl_in_rule__ProcedureDeclaration__Group__1974 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__2_in_rule__ProcedureDeclaration__Group__1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProcedureDeclaration__Group__1__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__2__Impl_in_rule__ProcedureDeclaration__Group__21036 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__3_in_rule__ProcedureDeclaration__Group__21039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProcedureDeclaration__Group__2__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__3__Impl_in_rule__ProcedureDeclaration__Group__31098 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__4_in_rule__ProcedureDeclaration__Group__31101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ProcedureDeclaration__Group__3__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__4__Impl_in_rule__ProcedureDeclaration__Group__41160 = new BitSet(new long[]{0x0000000071800000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__5_in_rule__ProcedureDeclaration__Group__41163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ProcedureDeclaration__Group__4__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__5__Impl_in_rule__ProcedureDeclaration__Group__51222 = new BitSet(new long[]{0x0000000071800000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__6_in_rule__ProcedureDeclaration__Group__51225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__OperationsAssignment_5_in_rule__ProcedureDeclaration__Group__5__Impl1252 = new BitSet(new long[]{0x0000000071000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__6__Impl_in_rule__ProcedureDeclaration__Group__61283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ProcedureDeclaration__Group__6__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__01356 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__01359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Conditional__Group__0__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__11418 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__11421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Conditional__Group__1__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__21480 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__21483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__BoolExpresionAssignment_2_in_rule__Conditional__Group__2__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__31540 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__31543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Conditional__Group__3__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__41602 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__41605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Conditional__Group__4__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__51664 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__51667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__TrueBlockAssignment_5_in_rule__Conditional__Group__5__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__61724 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__7_in_rule__Conditional__Group__61727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Conditional__Group__6__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__7__Impl_in_rule__Conditional__Group__71786 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__8_in_rule__Conditional__Group__71789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Conditional__Group__7__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__8__Impl_in_rule__Conditional__Group__81848 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__9_in_rule__Conditional__Group__81851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Conditional__Group__8__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__9__Impl_in_rule__Conditional__Group__91910 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__10_in_rule__Conditional__Group__91913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__FalseBlockAssignment_9_in_rule__Conditional__Group__9__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__10__Impl_in_rule__Conditional__Group__101970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Conditional__Group__10__Impl1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__0__Impl_in_rule__HayBolitas__Group__02051 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__1_in_rule__HayBolitas__Group__02054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__HayBolitas__Group__0__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__1__Impl_in_rule__HayBolitas__Group__12113 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__2_in_rule__HayBolitas__Group__12116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HayBolitas__Group__1__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__2__Impl_in_rule__HayBolitas__Group__22175 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__3_in_rule__HayBolitas__Group__22178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__ParamAssignment_2_in_rule__HayBolitas__Group__2__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__3__Impl_in_rule__HayBolitas__Group__32235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__HayBolitas__Group__3__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__02302 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__02305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Mover__Group__0__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__12364 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Mover__Group__1__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__22426 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__22429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__ParamAssignment_2_in_rule__Mover__Group__2__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__32486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Mover__Group__3__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__02553 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Poner__Group__0__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__12615 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Poner__Group__1__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__22677 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__22680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__ParamAssignment_2_in_rule__Poner__Group__2__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__32737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Poner__Group__3__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__ProcedureDeclaration__OperationsAssignment_52809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_rule__Conditional__BoolExpresionAssignment_22840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Conditional__TrueBlockAssignment_52871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Conditional__FalseBlockAssignment_92902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__HayBolitas__ParamAssignment_22933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__Mover__ParamAssignment_22964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Poner__ParamAssignment_22995 = new BitSet(new long[]{0x0000000000000002L});

}