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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Norte'", "'Sur'", "'Este'", "'Oeste'", "'Rojo'", "'Verde'", "'Azul'", "'Negro'", "'procedure'", "'Main'", "'()'", "'{'", "'}'", "'hayBolitas'", "'('", "')'", "'Mover'", "'Poner'"
    };
    public static final int RULE_ID=4;
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


    // $ANTLR start "entryRuleHayBolitas"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:116:1: entryRuleHayBolitas : ruleHayBolitas EOF ;
    public final void entryRuleHayBolitas() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:117:1: ( ruleHayBolitas EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:118:1: ruleHayBolitas EOF
            {
             before(grammarAccess.getHayBolitasRule()); 
            pushFollow(FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas181);
            ruleHayBolitas();

            state._fsp--;

             after(grammarAccess.getHayBolitasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHayBolitas188); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:125:1: ruleHayBolitas : ( ( rule__HayBolitas__Group__0 ) ) ;
    public final void ruleHayBolitas() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:129:2: ( ( ( rule__HayBolitas__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:130:1: ( ( rule__HayBolitas__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:130:1: ( ( rule__HayBolitas__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:131:1: ( rule__HayBolitas__Group__0 )
            {
             before(grammarAccess.getHayBolitasAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:132:1: ( rule__HayBolitas__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:132:2: rule__HayBolitas__Group__0
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__0_in_ruleHayBolitas214);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:144:1: entryRuleMover : ruleMover EOF ;
    public final void entryRuleMover() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:145:1: ( ruleMover EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:146:1: ruleMover EOF
            {
             before(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover241);
            ruleMover();

            state._fsp--;

             after(grammarAccess.getMoverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover248); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:153:1: ruleMover : ( ( rule__Mover__Group__0 ) ) ;
    public final void ruleMover() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:157:2: ( ( ( rule__Mover__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:158:1: ( ( rule__Mover__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:158:1: ( ( rule__Mover__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:159:1: ( rule__Mover__Group__0 )
            {
             before(grammarAccess.getMoverAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:160:1: ( rule__Mover__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:160:2: rule__Mover__Group__0
            {
            pushFollow(FOLLOW_rule__Mover__Group__0_in_ruleMover274);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:172:1: entryRulePoner : rulePoner EOF ;
    public final void entryRulePoner() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:173:1: ( rulePoner EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:174:1: rulePoner EOF
            {
             before(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner301);
            rulePoner();

            state._fsp--;

             after(grammarAccess.getPonerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner308); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:181:1: rulePoner : ( ( rule__Poner__Group__0 ) ) ;
    public final void rulePoner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:185:2: ( ( ( rule__Poner__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:186:1: ( ( rule__Poner__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:186:1: ( ( rule__Poner__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:187:1: ( rule__Poner__Group__0 )
            {
             before(grammarAccess.getPonerAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:188:1: ( rule__Poner__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:188:2: rule__Poner__Group__0
            {
            pushFollow(FOLLOW_rule__Poner__Group__0_in_rulePoner334);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:200:1: entryRuleDireccion : ruleDireccion EOF ;
    public final void entryRuleDireccion() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:201:1: ( ruleDireccion EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:202:1: ruleDireccion EOF
            {
             before(grammarAccess.getDireccionRule()); 
            pushFollow(FOLLOW_ruleDireccion_in_entryRuleDireccion361);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getDireccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDireccion368); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:209:1: ruleDireccion : ( ( rule__Direccion__Alternatives ) ) ;
    public final void ruleDireccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:213:2: ( ( ( rule__Direccion__Alternatives ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:214:1: ( ( rule__Direccion__Alternatives ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:214:1: ( ( rule__Direccion__Alternatives ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:215:1: ( rule__Direccion__Alternatives )
            {
             before(grammarAccess.getDireccionAccess().getAlternatives()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:216:1: ( rule__Direccion__Alternatives )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:216:2: rule__Direccion__Alternatives
            {
            pushFollow(FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion394);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:228:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:229:1: ( ruleColor EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:230:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor421);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor428); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:237:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:241:2: ( ( ( rule__Color__Alternatives ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:242:1: ( ( rule__Color__Alternatives ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:242:1: ( ( rule__Color__Alternatives ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:243:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:244:1: ( rule__Color__Alternatives )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:244:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor454);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:256:1: rule__Operation__Alternatives : ( ( ruleMover ) | ( rulePoner ) | ( ruleHayBolitas ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:260:1: ( ( ruleMover ) | ( rulePoner ) | ( ruleHayBolitas ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 24:
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
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:261:1: ( ruleMover )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:261:1: ( ruleMover )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:262:1: ruleMover
                    {
                     before(grammarAccess.getOperationAccess().getMoverParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMover_in_rule__Operation__Alternatives490);
                    ruleMover();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getMoverParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:267:6: ( rulePoner )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:267:6: ( rulePoner )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:268:1: rulePoner
                    {
                     before(grammarAccess.getOperationAccess().getPonerParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePoner_in_rule__Operation__Alternatives507);
                    rulePoner();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getPonerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:273:6: ( ruleHayBolitas )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:273:6: ( ruleHayBolitas )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:274:1: ruleHayBolitas
                    {
                     before(grammarAccess.getOperationAccess().getHayBolitasParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHayBolitas_in_rule__Operation__Alternatives524);
                    ruleHayBolitas();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getHayBolitasParserRuleCall_2()); 

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


    // $ANTLR start "rule__Direccion__Alternatives"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:284:1: rule__Direccion__Alternatives : ( ( 'Norte' ) | ( 'Sur' ) | ( 'Este' ) | ( 'Oeste' ) );
    public final void rule__Direccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:288:1: ( ( 'Norte' ) | ( 'Sur' ) | ( 'Este' ) | ( 'Oeste' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:289:1: ( 'Norte' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:289:1: ( 'Norte' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:290:1: 'Norte'
                    {
                     before(grammarAccess.getDireccionAccess().getNorteKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Direccion__Alternatives557); 
                     after(grammarAccess.getDireccionAccess().getNorteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:297:6: ( 'Sur' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:297:6: ( 'Sur' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:298:1: 'Sur'
                    {
                     before(grammarAccess.getDireccionAccess().getSurKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Direccion__Alternatives577); 
                     after(grammarAccess.getDireccionAccess().getSurKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:305:6: ( 'Este' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:305:6: ( 'Este' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:306:1: 'Este'
                    {
                     before(grammarAccess.getDireccionAccess().getEsteKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Direccion__Alternatives597); 
                     after(grammarAccess.getDireccionAccess().getEsteKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:313:6: ( 'Oeste' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:313:6: ( 'Oeste' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:314:1: 'Oeste'
                    {
                     before(grammarAccess.getDireccionAccess().getOesteKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Direccion__Alternatives617); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:326:1: rule__Color__Alternatives : ( ( 'Rojo' ) | ( 'Verde' ) | ( 'Azul' ) | ( 'Negro' ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:330:1: ( ( 'Rojo' ) | ( 'Verde' ) | ( 'Azul' ) | ( 'Negro' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
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
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:331:1: ( 'Rojo' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:331:1: ( 'Rojo' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:332:1: 'Rojo'
                    {
                     before(grammarAccess.getColorAccess().getRojoKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Color__Alternatives652); 
                     after(grammarAccess.getColorAccess().getRojoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:339:6: ( 'Verde' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:339:6: ( 'Verde' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:340:1: 'Verde'
                    {
                     before(grammarAccess.getColorAccess().getVerdeKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__Color__Alternatives672); 
                     after(grammarAccess.getColorAccess().getVerdeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:347:6: ( 'Azul' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:347:6: ( 'Azul' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:348:1: 'Azul'
                    {
                     before(grammarAccess.getColorAccess().getAzulKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__Color__Alternatives692); 
                     after(grammarAccess.getColorAccess().getAzulKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:355:6: ( 'Negro' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:355:6: ( 'Negro' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:356:1: 'Negro'
                    {
                     before(grammarAccess.getColorAccess().getNegroKeyword_3()); 
                    match(input,18,FOLLOW_18_in_rule__Color__Alternatives712); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:370:1: rule__ProcedureDeclaration__Group__0 : rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1 ;
    public final void rule__ProcedureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:374:1: ( rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:375:2: rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__0__Impl_in_rule__ProcedureDeclaration__Group__0744);
            rule__ProcedureDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__1_in_rule__ProcedureDeclaration__Group__0747);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:382:1: rule__ProcedureDeclaration__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__ProcedureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:386:1: ( ( 'procedure' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:387:1: ( 'procedure' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:387:1: ( 'procedure' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:388:1: 'procedure'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ProcedureDeclaration__Group__0__Impl775); 
             after(grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ProcedureDeclaration__Group__1"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:401:1: rule__ProcedureDeclaration__Group__1 : rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2 ;
    public final void rule__ProcedureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:405:1: ( rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:406:2: rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__1__Impl_in_rule__ProcedureDeclaration__Group__1806);
            rule__ProcedureDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__2_in_rule__ProcedureDeclaration__Group__1809);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:413:1: rule__ProcedureDeclaration__Group__1__Impl : ( 'Main' ) ;
    public final void rule__ProcedureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:417:1: ( ( 'Main' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:418:1: ( 'Main' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:418:1: ( 'Main' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:419:1: 'Main'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getMainKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ProcedureDeclaration__Group__1__Impl837); 
             after(grammarAccess.getProcedureDeclarationAccess().getMainKeyword_1()); 

            }


            }

        }
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:432:1: rule__ProcedureDeclaration__Group__2 : rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3 ;
    public final void rule__ProcedureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:436:1: ( rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:437:2: rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__2__Impl_in_rule__ProcedureDeclaration__Group__2868);
            rule__ProcedureDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__3_in_rule__ProcedureDeclaration__Group__2871);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:444:1: rule__ProcedureDeclaration__Group__2__Impl : ( '()' ) ;
    public final void rule__ProcedureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:448:1: ( ( '()' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:449:1: ( '()' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:449:1: ( '()' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:450:1: '()'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__ProcedureDeclaration__Group__2__Impl899); 
             after(grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_2()); 

            }


            }

        }
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:463:1: rule__ProcedureDeclaration__Group__3 : rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4 ;
    public final void rule__ProcedureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:467:1: ( rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:468:2: rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__3__Impl_in_rule__ProcedureDeclaration__Group__3930);
            rule__ProcedureDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__4_in_rule__ProcedureDeclaration__Group__3933);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:475:1: rule__ProcedureDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ProcedureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:479:1: ( ( '{' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:480:1: ( '{' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:480:1: ( '{' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:481:1: '{'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ProcedureDeclaration__Group__3__Impl961); 
             after(grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:494:1: rule__ProcedureDeclaration__Group__4 : rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5 ;
    public final void rule__ProcedureDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:498:1: ( rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:499:2: rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__4__Impl_in_rule__ProcedureDeclaration__Group__4992);
            rule__ProcedureDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__5_in_rule__ProcedureDeclaration__Group__4995);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:506:1: rule__ProcedureDeclaration__Group__4__Impl : ( ( rule__ProcedureDeclaration__OperationsAssignment_4 )* ) ;
    public final void rule__ProcedureDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:510:1: ( ( ( rule__ProcedureDeclaration__OperationsAssignment_4 )* ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:511:1: ( ( rule__ProcedureDeclaration__OperationsAssignment_4 )* )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:511:1: ( ( rule__ProcedureDeclaration__OperationsAssignment_4 )* )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:512:1: ( rule__ProcedureDeclaration__OperationsAssignment_4 )*
            {
             before(grammarAccess.getProcedureDeclarationAccess().getOperationsAssignment_4()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:513:1: ( rule__ProcedureDeclaration__OperationsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24||(LA4_0>=27 && LA4_0<=28)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:513:2: rule__ProcedureDeclaration__OperationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ProcedureDeclaration__OperationsAssignment_4_in_rule__ProcedureDeclaration__Group__4__Impl1022);
            	    rule__ProcedureDeclaration__OperationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcedureDeclarationAccess().getOperationsAssignment_4()); 

            }


            }

        }
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:523:1: rule__ProcedureDeclaration__Group__5 : rule__ProcedureDeclaration__Group__5__Impl ;
    public final void rule__ProcedureDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:527:1: ( rule__ProcedureDeclaration__Group__5__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:528:2: rule__ProcedureDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__5__Impl_in_rule__ProcedureDeclaration__Group__51053);
            rule__ProcedureDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:534:1: rule__ProcedureDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ProcedureDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:538:1: ( ( '}' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:539:1: ( '}' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:539:1: ( '}' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:540:1: '}'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__ProcedureDeclaration__Group__5__Impl1081); 
             after(grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__HayBolitas__Group__0"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:565:1: rule__HayBolitas__Group__0 : rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1 ;
    public final void rule__HayBolitas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:569:1: ( rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:570:2: rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__0__Impl_in_rule__HayBolitas__Group__01124);
            rule__HayBolitas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__1_in_rule__HayBolitas__Group__01127);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:577:1: rule__HayBolitas__Group__0__Impl : ( 'hayBolitas' ) ;
    public final void rule__HayBolitas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:581:1: ( ( 'hayBolitas' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:582:1: ( 'hayBolitas' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:582:1: ( 'hayBolitas' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:583:1: 'hayBolitas'
            {
             before(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__HayBolitas__Group__0__Impl1155); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:596:1: rule__HayBolitas__Group__1 : rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2 ;
    public final void rule__HayBolitas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:600:1: ( rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:601:2: rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__1__Impl_in_rule__HayBolitas__Group__11186);
            rule__HayBolitas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__2_in_rule__HayBolitas__Group__11189);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:608:1: rule__HayBolitas__Group__1__Impl : ( '(' ) ;
    public final void rule__HayBolitas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:612:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:613:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:613:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:614:1: '('
            {
             before(grammarAccess.getHayBolitasAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__HayBolitas__Group__1__Impl1217); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:627:1: rule__HayBolitas__Group__2 : rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3 ;
    public final void rule__HayBolitas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:631:1: ( rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:632:2: rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__2__Impl_in_rule__HayBolitas__Group__21248);
            rule__HayBolitas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__3_in_rule__HayBolitas__Group__21251);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:639:1: rule__HayBolitas__Group__2__Impl : ( ( rule__HayBolitas__ParamAssignment_2 ) ) ;
    public final void rule__HayBolitas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:643:1: ( ( ( rule__HayBolitas__ParamAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:644:1: ( ( rule__HayBolitas__ParamAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:644:1: ( ( rule__HayBolitas__ParamAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:645:1: ( rule__HayBolitas__ParamAssignment_2 )
            {
             before(grammarAccess.getHayBolitasAccess().getParamAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:646:1: ( rule__HayBolitas__ParamAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:646:2: rule__HayBolitas__ParamAssignment_2
            {
            pushFollow(FOLLOW_rule__HayBolitas__ParamAssignment_2_in_rule__HayBolitas__Group__2__Impl1278);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:656:1: rule__HayBolitas__Group__3 : rule__HayBolitas__Group__3__Impl ;
    public final void rule__HayBolitas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:660:1: ( rule__HayBolitas__Group__3__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:661:2: rule__HayBolitas__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__3__Impl_in_rule__HayBolitas__Group__31308);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:667:1: rule__HayBolitas__Group__3__Impl : ( ')' ) ;
    public final void rule__HayBolitas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:671:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:672:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:672:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:673:1: ')'
            {
             before(grammarAccess.getHayBolitasAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__HayBolitas__Group__3__Impl1336); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:694:1: rule__Mover__Group__0 : rule__Mover__Group__0__Impl rule__Mover__Group__1 ;
    public final void rule__Mover__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:698:1: ( rule__Mover__Group__0__Impl rule__Mover__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:699:2: rule__Mover__Group__0__Impl rule__Mover__Group__1
            {
            pushFollow(FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__01375);
            rule__Mover__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__01378);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:706:1: rule__Mover__Group__0__Impl : ( 'Mover' ) ;
    public final void rule__Mover__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:710:1: ( ( 'Mover' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:711:1: ( 'Mover' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:711:1: ( 'Mover' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:712:1: 'Mover'
            {
             before(grammarAccess.getMoverAccess().getMoverKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Mover__Group__0__Impl1406); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:725:1: rule__Mover__Group__1 : rule__Mover__Group__1__Impl rule__Mover__Group__2 ;
    public final void rule__Mover__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:729:1: ( rule__Mover__Group__1__Impl rule__Mover__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:730:2: rule__Mover__Group__1__Impl rule__Mover__Group__2
            {
            pushFollow(FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__11437);
            rule__Mover__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__11440);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:737:1: rule__Mover__Group__1__Impl : ( '(' ) ;
    public final void rule__Mover__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:741:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:742:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:742:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:743:1: '('
            {
             before(grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Mover__Group__1__Impl1468); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:756:1: rule__Mover__Group__2 : rule__Mover__Group__2__Impl rule__Mover__Group__3 ;
    public final void rule__Mover__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:760:1: ( rule__Mover__Group__2__Impl rule__Mover__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:761:2: rule__Mover__Group__2__Impl rule__Mover__Group__3
            {
            pushFollow(FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__21499);
            rule__Mover__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__21502);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:768:1: rule__Mover__Group__2__Impl : ( ( rule__Mover__ParamAssignment_2 ) ) ;
    public final void rule__Mover__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:772:1: ( ( ( rule__Mover__ParamAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:773:1: ( ( rule__Mover__ParamAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:773:1: ( ( rule__Mover__ParamAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:774:1: ( rule__Mover__ParamAssignment_2 )
            {
             before(grammarAccess.getMoverAccess().getParamAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:775:1: ( rule__Mover__ParamAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:775:2: rule__Mover__ParamAssignment_2
            {
            pushFollow(FOLLOW_rule__Mover__ParamAssignment_2_in_rule__Mover__Group__2__Impl1529);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:785:1: rule__Mover__Group__3 : rule__Mover__Group__3__Impl ;
    public final void rule__Mover__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:789:1: ( rule__Mover__Group__3__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:790:2: rule__Mover__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__31559);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:796:1: rule__Mover__Group__3__Impl : ( ')' ) ;
    public final void rule__Mover__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:800:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:801:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:801:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:802:1: ')'
            {
             before(grammarAccess.getMoverAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Mover__Group__3__Impl1587); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:823:1: rule__Poner__Group__0 : rule__Poner__Group__0__Impl rule__Poner__Group__1 ;
    public final void rule__Poner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:827:1: ( rule__Poner__Group__0__Impl rule__Poner__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:828:2: rule__Poner__Group__0__Impl rule__Poner__Group__1
            {
            pushFollow(FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__01626);
            rule__Poner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__01629);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:835:1: rule__Poner__Group__0__Impl : ( 'Poner' ) ;
    public final void rule__Poner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:839:1: ( ( 'Poner' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:840:1: ( 'Poner' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:840:1: ( 'Poner' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:841:1: 'Poner'
            {
             before(grammarAccess.getPonerAccess().getPonerKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Poner__Group__0__Impl1657); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:854:1: rule__Poner__Group__1 : rule__Poner__Group__1__Impl rule__Poner__Group__2 ;
    public final void rule__Poner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:858:1: ( rule__Poner__Group__1__Impl rule__Poner__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:859:2: rule__Poner__Group__1__Impl rule__Poner__Group__2
            {
            pushFollow(FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__11688);
            rule__Poner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__11691);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:866:1: rule__Poner__Group__1__Impl : ( '(' ) ;
    public final void rule__Poner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:870:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:871:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:871:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:872:1: '('
            {
             before(grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Poner__Group__1__Impl1719); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:885:1: rule__Poner__Group__2 : rule__Poner__Group__2__Impl rule__Poner__Group__3 ;
    public final void rule__Poner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:889:1: ( rule__Poner__Group__2__Impl rule__Poner__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:890:2: rule__Poner__Group__2__Impl rule__Poner__Group__3
            {
            pushFollow(FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__21750);
            rule__Poner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__21753);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:897:1: rule__Poner__Group__2__Impl : ( ( rule__Poner__ParamAssignment_2 ) ) ;
    public final void rule__Poner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:901:1: ( ( ( rule__Poner__ParamAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:902:1: ( ( rule__Poner__ParamAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:902:1: ( ( rule__Poner__ParamAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:903:1: ( rule__Poner__ParamAssignment_2 )
            {
             before(grammarAccess.getPonerAccess().getParamAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:904:1: ( rule__Poner__ParamAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:904:2: rule__Poner__ParamAssignment_2
            {
            pushFollow(FOLLOW_rule__Poner__ParamAssignment_2_in_rule__Poner__Group__2__Impl1780);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:914:1: rule__Poner__Group__3 : rule__Poner__Group__3__Impl ;
    public final void rule__Poner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:918:1: ( rule__Poner__Group__3__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:919:2: rule__Poner__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__31810);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:925:1: rule__Poner__Group__3__Impl : ( ')' ) ;
    public final void rule__Poner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:929:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:930:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:930:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:931:1: ')'
            {
             before(grammarAccess.getPonerAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Poner__Group__3__Impl1838); 
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


    // $ANTLR start "rule__ProcedureDeclaration__OperationsAssignment_4"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:953:1: rule__ProcedureDeclaration__OperationsAssignment_4 : ( ruleOperation ) ;
    public final void rule__ProcedureDeclaration__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:957:1: ( ( ruleOperation ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:958:1: ( ruleOperation )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:958:1: ( ruleOperation )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:959:1: ruleOperation
            {
             before(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__ProcedureDeclaration__OperationsAssignment_41882);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDeclaration__OperationsAssignment_4"


    // $ANTLR start "rule__HayBolitas__ParamAssignment_2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:968:1: rule__HayBolitas__ParamAssignment_2 : ( ruleColor ) ;
    public final void rule__HayBolitas__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:972:1: ( ( ruleColor ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:973:1: ( ruleColor )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:973:1: ( ruleColor )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:974:1: ruleColor
            {
             before(grammarAccess.getHayBolitasAccess().getParamColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__HayBolitas__ParamAssignment_21913);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:983:1: rule__Mover__ParamAssignment_2 : ( ruleDireccion ) ;
    public final void rule__Mover__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:987:1: ( ( ruleDireccion ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:988:1: ( ruleDireccion )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:988:1: ( ruleDireccion )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:989:1: ruleDireccion
            {
             before(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__Mover__ParamAssignment_21944);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:998:1: rule__Poner__ParamAssignment_2 : ( ruleColor ) ;
    public final void rule__Poner__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1002:1: ( ( ruleColor ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1003:1: ( ruleColor )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1003:1: ( ruleColor )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:1004:1: ruleColor
            {
             before(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__Poner__ParamAssignment_21975);
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
    public static final BitSet FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHayBolitas188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__0_in_ruleHayBolitas214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0_in_ruleMover274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0_in_rulePoner334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_entryRuleDireccion361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDireccion368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_rule__Operation__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_rule__Operation__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_rule__Operation__Alternatives524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Direccion__Alternatives557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Direccion__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Direccion__Alternatives597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Direccion__Alternatives617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Color__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Color__Alternatives672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Color__Alternatives692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Color__Alternatives712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__0__Impl_in_rule__ProcedureDeclaration__Group__0744 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__1_in_rule__ProcedureDeclaration__Group__0747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProcedureDeclaration__Group__0__Impl775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__1__Impl_in_rule__ProcedureDeclaration__Group__1806 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__2_in_rule__ProcedureDeclaration__Group__1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProcedureDeclaration__Group__1__Impl837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__2__Impl_in_rule__ProcedureDeclaration__Group__2868 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__3_in_rule__ProcedureDeclaration__Group__2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ProcedureDeclaration__Group__2__Impl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__3__Impl_in_rule__ProcedureDeclaration__Group__3930 = new BitSet(new long[]{0x0000000019800000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__4_in_rule__ProcedureDeclaration__Group__3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ProcedureDeclaration__Group__3__Impl961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__4__Impl_in_rule__ProcedureDeclaration__Group__4992 = new BitSet(new long[]{0x0000000019800000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__5_in_rule__ProcedureDeclaration__Group__4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__OperationsAssignment_4_in_rule__ProcedureDeclaration__Group__4__Impl1022 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__5__Impl_in_rule__ProcedureDeclaration__Group__51053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ProcedureDeclaration__Group__5__Impl1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__0__Impl_in_rule__HayBolitas__Group__01124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__1_in_rule__HayBolitas__Group__01127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__HayBolitas__Group__0__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__1__Impl_in_rule__HayBolitas__Group__11186 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__2_in_rule__HayBolitas__Group__11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HayBolitas__Group__1__Impl1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__2__Impl_in_rule__HayBolitas__Group__21248 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__3_in_rule__HayBolitas__Group__21251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__ParamAssignment_2_in_rule__HayBolitas__Group__2__Impl1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__3__Impl_in_rule__HayBolitas__Group__31308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__HayBolitas__Group__3__Impl1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__01375 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__01378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Mover__Group__0__Impl1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__11437 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__11440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Mover__Group__1__Impl1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__21499 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__21502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__ParamAssignment_2_in_rule__Mover__Group__2__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__31559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Mover__Group__3__Impl1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__01626 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__01629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Poner__Group__0__Impl1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__11688 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__11691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Poner__Group__1__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__21750 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__21753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__ParamAssignment_2_in_rule__Poner__Group__2__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__31810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Poner__Group__3__Impl1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__ProcedureDeclaration__OperationsAssignment_41882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__HayBolitas__ParamAssignment_21913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__Mover__ParamAssignment_21944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Poner__ParamAssignment_21975 = new BitSet(new long[]{0x0000000000000002L});

}