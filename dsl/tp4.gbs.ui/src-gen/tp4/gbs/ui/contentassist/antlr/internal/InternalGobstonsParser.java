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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Norte'", "'Sur'", "'Este'", "'Oeste'", "'Rojo'", "'Verde'", "'Azul'", "'Negro'", "'procedure'", "'Main'", "'()'", "'{'", "'}'", "'Mover'", "'('", "')'", "'Poner'"
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


    // $ANTLR start "entryRuleMover"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:116:1: entryRuleMover : ruleMover EOF ;
    public final void entryRuleMover() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:117:1: ( ruleMover EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:118:1: ruleMover EOF
            {
             before(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover181);
            ruleMover();

            state._fsp--;

             after(grammarAccess.getMoverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover188); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:125:1: ruleMover : ( ( rule__Mover__Group__0 ) ) ;
    public final void ruleMover() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:129:2: ( ( ( rule__Mover__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:130:1: ( ( rule__Mover__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:130:1: ( ( rule__Mover__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:131:1: ( rule__Mover__Group__0 )
            {
             before(grammarAccess.getMoverAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:132:1: ( rule__Mover__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:132:2: rule__Mover__Group__0
            {
            pushFollow(FOLLOW_rule__Mover__Group__0_in_ruleMover214);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:144:1: entryRulePoner : rulePoner EOF ;
    public final void entryRulePoner() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:145:1: ( rulePoner EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:146:1: rulePoner EOF
            {
             before(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner241);
            rulePoner();

            state._fsp--;

             after(grammarAccess.getPonerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner248); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:153:1: rulePoner : ( ( rule__Poner__Group__0 ) ) ;
    public final void rulePoner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:157:2: ( ( ( rule__Poner__Group__0 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:158:1: ( ( rule__Poner__Group__0 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:158:1: ( ( rule__Poner__Group__0 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:159:1: ( rule__Poner__Group__0 )
            {
             before(grammarAccess.getPonerAccess().getGroup()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:160:1: ( rule__Poner__Group__0 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:160:2: rule__Poner__Group__0
            {
            pushFollow(FOLLOW_rule__Poner__Group__0_in_rulePoner274);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:172:1: entryRuleDireccion : ruleDireccion EOF ;
    public final void entryRuleDireccion() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:173:1: ( ruleDireccion EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:174:1: ruleDireccion EOF
            {
             before(grammarAccess.getDireccionRule()); 
            pushFollow(FOLLOW_ruleDireccion_in_entryRuleDireccion301);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getDireccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDireccion308); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:181:1: ruleDireccion : ( ( rule__Direccion__Alternatives ) ) ;
    public final void ruleDireccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:185:2: ( ( ( rule__Direccion__Alternatives ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:186:1: ( ( rule__Direccion__Alternatives ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:186:1: ( ( rule__Direccion__Alternatives ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:187:1: ( rule__Direccion__Alternatives )
            {
             before(grammarAccess.getDireccionAccess().getAlternatives()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:188:1: ( rule__Direccion__Alternatives )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:188:2: rule__Direccion__Alternatives
            {
            pushFollow(FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion334);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:200:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:201:1: ( ruleColor EOF )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:202:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor361);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor368); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:209:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:213:2: ( ( ( rule__Color__Alternatives ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:214:1: ( ( rule__Color__Alternatives ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:214:1: ( ( rule__Color__Alternatives ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:215:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:216:1: ( rule__Color__Alternatives )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:216:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor394);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:228:1: rule__Operation__Alternatives : ( ( ruleMover ) | ( rulePoner ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:232:1: ( ( ruleMover ) | ( rulePoner ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:233:1: ( ruleMover )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:233:1: ( ruleMover )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:234:1: ruleMover
                    {
                     before(grammarAccess.getOperationAccess().getMoverParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMover_in_rule__Operation__Alternatives430);
                    ruleMover();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getMoverParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:239:6: ( rulePoner )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:239:6: ( rulePoner )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:240:1: rulePoner
                    {
                     before(grammarAccess.getOperationAccess().getPonerParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePoner_in_rule__Operation__Alternatives447);
                    rulePoner();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getPonerParserRuleCall_1()); 

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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:250:1: rule__Direccion__Alternatives : ( ( 'Norte' ) | ( 'Sur' ) | ( 'Este' ) | ( 'Oeste' ) );
    public final void rule__Direccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:254:1: ( ( 'Norte' ) | ( 'Sur' ) | ( 'Este' ) | ( 'Oeste' ) )
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
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:255:1: ( 'Norte' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:255:1: ( 'Norte' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:256:1: 'Norte'
                    {
                     before(grammarAccess.getDireccionAccess().getNorteKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Direccion__Alternatives480); 
                     after(grammarAccess.getDireccionAccess().getNorteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:263:6: ( 'Sur' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:263:6: ( 'Sur' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:264:1: 'Sur'
                    {
                     before(grammarAccess.getDireccionAccess().getSurKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Direccion__Alternatives500); 
                     after(grammarAccess.getDireccionAccess().getSurKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:271:6: ( 'Este' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:271:6: ( 'Este' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:272:1: 'Este'
                    {
                     before(grammarAccess.getDireccionAccess().getEsteKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Direccion__Alternatives520); 
                     after(grammarAccess.getDireccionAccess().getEsteKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:279:6: ( 'Oeste' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:279:6: ( 'Oeste' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:280:1: 'Oeste'
                    {
                     before(grammarAccess.getDireccionAccess().getOesteKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Direccion__Alternatives540); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:292:1: rule__Color__Alternatives : ( ( 'Rojo' ) | ( 'Verde' ) | ( 'Azul' ) | ( 'Negro' ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:296:1: ( ( 'Rojo' ) | ( 'Verde' ) | ( 'Azul' ) | ( 'Negro' ) )
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
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:297:1: ( 'Rojo' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:297:1: ( 'Rojo' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:298:1: 'Rojo'
                    {
                     before(grammarAccess.getColorAccess().getRojoKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Color__Alternatives575); 
                     after(grammarAccess.getColorAccess().getRojoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:305:6: ( 'Verde' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:305:6: ( 'Verde' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:306:1: 'Verde'
                    {
                     before(grammarAccess.getColorAccess().getVerdeKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__Color__Alternatives595); 
                     after(grammarAccess.getColorAccess().getVerdeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:313:6: ( 'Azul' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:313:6: ( 'Azul' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:314:1: 'Azul'
                    {
                     before(grammarAccess.getColorAccess().getAzulKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__Color__Alternatives615); 
                     after(grammarAccess.getColorAccess().getAzulKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:321:6: ( 'Negro' )
                    {
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:321:6: ( 'Negro' )
                    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:322:1: 'Negro'
                    {
                     before(grammarAccess.getColorAccess().getNegroKeyword_3()); 
                    match(input,18,FOLLOW_18_in_rule__Color__Alternatives635); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:336:1: rule__ProcedureDeclaration__Group__0 : rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1 ;
    public final void rule__ProcedureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:340:1: ( rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:341:2: rule__ProcedureDeclaration__Group__0__Impl rule__ProcedureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__0__Impl_in_rule__ProcedureDeclaration__Group__0667);
            rule__ProcedureDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__1_in_rule__ProcedureDeclaration__Group__0670);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:348:1: rule__ProcedureDeclaration__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__ProcedureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:352:1: ( ( 'procedure' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:353:1: ( 'procedure' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:353:1: ( 'procedure' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:354:1: 'procedure'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ProcedureDeclaration__Group__0__Impl698); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:367:1: rule__ProcedureDeclaration__Group__1 : rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2 ;
    public final void rule__ProcedureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:371:1: ( rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:372:2: rule__ProcedureDeclaration__Group__1__Impl rule__ProcedureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__1__Impl_in_rule__ProcedureDeclaration__Group__1729);
            rule__ProcedureDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__2_in_rule__ProcedureDeclaration__Group__1732);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:379:1: rule__ProcedureDeclaration__Group__1__Impl : ( 'Main' ) ;
    public final void rule__ProcedureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:383:1: ( ( 'Main' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:384:1: ( 'Main' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:384:1: ( 'Main' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:385:1: 'Main'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getMainKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ProcedureDeclaration__Group__1__Impl760); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:398:1: rule__ProcedureDeclaration__Group__2 : rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3 ;
    public final void rule__ProcedureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:402:1: ( rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:403:2: rule__ProcedureDeclaration__Group__2__Impl rule__ProcedureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__2__Impl_in_rule__ProcedureDeclaration__Group__2791);
            rule__ProcedureDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__3_in_rule__ProcedureDeclaration__Group__2794);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:410:1: rule__ProcedureDeclaration__Group__2__Impl : ( '()' ) ;
    public final void rule__ProcedureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:414:1: ( ( '()' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:415:1: ( '()' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:415:1: ( '()' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:416:1: '()'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__ProcedureDeclaration__Group__2__Impl822); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:429:1: rule__ProcedureDeclaration__Group__3 : rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4 ;
    public final void rule__ProcedureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:433:1: ( rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:434:2: rule__ProcedureDeclaration__Group__3__Impl rule__ProcedureDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__3__Impl_in_rule__ProcedureDeclaration__Group__3853);
            rule__ProcedureDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__4_in_rule__ProcedureDeclaration__Group__3856);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:441:1: rule__ProcedureDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ProcedureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:445:1: ( ( '{' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:446:1: ( '{' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:446:1: ( '{' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:447:1: '{'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ProcedureDeclaration__Group__3__Impl884); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:460:1: rule__ProcedureDeclaration__Group__4 : rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5 ;
    public final void rule__ProcedureDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:464:1: ( rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:465:2: rule__ProcedureDeclaration__Group__4__Impl rule__ProcedureDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__4__Impl_in_rule__ProcedureDeclaration__Group__4915);
            rule__ProcedureDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__5_in_rule__ProcedureDeclaration__Group__4918);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:472:1: rule__ProcedureDeclaration__Group__4__Impl : ( ( rule__ProcedureDeclaration__OperationsAssignment_4 )* ) ;
    public final void rule__ProcedureDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:476:1: ( ( ( rule__ProcedureDeclaration__OperationsAssignment_4 )* ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:477:1: ( ( rule__ProcedureDeclaration__OperationsAssignment_4 )* )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:477:1: ( ( rule__ProcedureDeclaration__OperationsAssignment_4 )* )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:478:1: ( rule__ProcedureDeclaration__OperationsAssignment_4 )*
            {
             before(grammarAccess.getProcedureDeclarationAccess().getOperationsAssignment_4()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:479:1: ( rule__ProcedureDeclaration__OperationsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24||LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:479:2: rule__ProcedureDeclaration__OperationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ProcedureDeclaration__OperationsAssignment_4_in_rule__ProcedureDeclaration__Group__4__Impl945);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:489:1: rule__ProcedureDeclaration__Group__5 : rule__ProcedureDeclaration__Group__5__Impl ;
    public final void rule__ProcedureDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:493:1: ( rule__ProcedureDeclaration__Group__5__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:494:2: rule__ProcedureDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ProcedureDeclaration__Group__5__Impl_in_rule__ProcedureDeclaration__Group__5976);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:500:1: rule__ProcedureDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ProcedureDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:504:1: ( ( '}' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:505:1: ( '}' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:505:1: ( '}' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:506:1: '}'
            {
             before(grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__ProcedureDeclaration__Group__5__Impl1004); 
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


    // $ANTLR start "rule__Mover__Group__0"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:531:1: rule__Mover__Group__0 : rule__Mover__Group__0__Impl rule__Mover__Group__1 ;
    public final void rule__Mover__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:535:1: ( rule__Mover__Group__0__Impl rule__Mover__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:536:2: rule__Mover__Group__0__Impl rule__Mover__Group__1
            {
            pushFollow(FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__01047);
            rule__Mover__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__01050);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:543:1: rule__Mover__Group__0__Impl : ( 'Mover' ) ;
    public final void rule__Mover__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:547:1: ( ( 'Mover' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:548:1: ( 'Mover' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:548:1: ( 'Mover' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:549:1: 'Mover'
            {
             before(grammarAccess.getMoverAccess().getMoverKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Mover__Group__0__Impl1078); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:562:1: rule__Mover__Group__1 : rule__Mover__Group__1__Impl rule__Mover__Group__2 ;
    public final void rule__Mover__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:566:1: ( rule__Mover__Group__1__Impl rule__Mover__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:567:2: rule__Mover__Group__1__Impl rule__Mover__Group__2
            {
            pushFollow(FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__11109);
            rule__Mover__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__11112);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:574:1: rule__Mover__Group__1__Impl : ( '(' ) ;
    public final void rule__Mover__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:578:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:579:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:579:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:580:1: '('
            {
             before(grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Mover__Group__1__Impl1140); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:593:1: rule__Mover__Group__2 : rule__Mover__Group__2__Impl rule__Mover__Group__3 ;
    public final void rule__Mover__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:597:1: ( rule__Mover__Group__2__Impl rule__Mover__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:598:2: rule__Mover__Group__2__Impl rule__Mover__Group__3
            {
            pushFollow(FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__21171);
            rule__Mover__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__21174);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:605:1: rule__Mover__Group__2__Impl : ( ( rule__Mover__ParamAssignment_2 ) ) ;
    public final void rule__Mover__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:609:1: ( ( ( rule__Mover__ParamAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:610:1: ( ( rule__Mover__ParamAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:610:1: ( ( rule__Mover__ParamAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:611:1: ( rule__Mover__ParamAssignment_2 )
            {
             before(grammarAccess.getMoverAccess().getParamAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:612:1: ( rule__Mover__ParamAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:612:2: rule__Mover__ParamAssignment_2
            {
            pushFollow(FOLLOW_rule__Mover__ParamAssignment_2_in_rule__Mover__Group__2__Impl1201);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:622:1: rule__Mover__Group__3 : rule__Mover__Group__3__Impl ;
    public final void rule__Mover__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:626:1: ( rule__Mover__Group__3__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:627:2: rule__Mover__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__31231);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:633:1: rule__Mover__Group__3__Impl : ( ')' ) ;
    public final void rule__Mover__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:637:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:638:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:638:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:639:1: ')'
            {
             before(grammarAccess.getMoverAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Mover__Group__3__Impl1259); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:660:1: rule__Poner__Group__0 : rule__Poner__Group__0__Impl rule__Poner__Group__1 ;
    public final void rule__Poner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:664:1: ( rule__Poner__Group__0__Impl rule__Poner__Group__1 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:665:2: rule__Poner__Group__0__Impl rule__Poner__Group__1
            {
            pushFollow(FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__01298);
            rule__Poner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__01301);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:672:1: rule__Poner__Group__0__Impl : ( 'Poner' ) ;
    public final void rule__Poner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:676:1: ( ( 'Poner' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:677:1: ( 'Poner' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:677:1: ( 'Poner' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:678:1: 'Poner'
            {
             before(grammarAccess.getPonerAccess().getPonerKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Poner__Group__0__Impl1329); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:691:1: rule__Poner__Group__1 : rule__Poner__Group__1__Impl rule__Poner__Group__2 ;
    public final void rule__Poner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:695:1: ( rule__Poner__Group__1__Impl rule__Poner__Group__2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:696:2: rule__Poner__Group__1__Impl rule__Poner__Group__2
            {
            pushFollow(FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__11360);
            rule__Poner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__11363);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:703:1: rule__Poner__Group__1__Impl : ( '(' ) ;
    public final void rule__Poner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:707:1: ( ( '(' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:708:1: ( '(' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:708:1: ( '(' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:709:1: '('
            {
             before(grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Poner__Group__1__Impl1391); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:722:1: rule__Poner__Group__2 : rule__Poner__Group__2__Impl rule__Poner__Group__3 ;
    public final void rule__Poner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:726:1: ( rule__Poner__Group__2__Impl rule__Poner__Group__3 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:727:2: rule__Poner__Group__2__Impl rule__Poner__Group__3
            {
            pushFollow(FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__21422);
            rule__Poner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__21425);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:734:1: rule__Poner__Group__2__Impl : ( ( rule__Poner__ParamAssignment_2 ) ) ;
    public final void rule__Poner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:738:1: ( ( ( rule__Poner__ParamAssignment_2 ) ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:739:1: ( ( rule__Poner__ParamAssignment_2 ) )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:739:1: ( ( rule__Poner__ParamAssignment_2 ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:740:1: ( rule__Poner__ParamAssignment_2 )
            {
             before(grammarAccess.getPonerAccess().getParamAssignment_2()); 
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:741:1: ( rule__Poner__ParamAssignment_2 )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:741:2: rule__Poner__ParamAssignment_2
            {
            pushFollow(FOLLOW_rule__Poner__ParamAssignment_2_in_rule__Poner__Group__2__Impl1452);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:751:1: rule__Poner__Group__3 : rule__Poner__Group__3__Impl ;
    public final void rule__Poner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:755:1: ( rule__Poner__Group__3__Impl )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:756:2: rule__Poner__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__31482);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:762:1: rule__Poner__Group__3__Impl : ( ')' ) ;
    public final void rule__Poner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:766:1: ( ( ')' ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:767:1: ( ')' )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:767:1: ( ')' )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:768:1: ')'
            {
             before(grammarAccess.getPonerAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Poner__Group__3__Impl1510); 
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:790:1: rule__ProcedureDeclaration__OperationsAssignment_4 : ( ruleOperation ) ;
    public final void rule__ProcedureDeclaration__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:794:1: ( ( ruleOperation ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:795:1: ( ruleOperation )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:795:1: ( ruleOperation )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:796:1: ruleOperation
            {
             before(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__ProcedureDeclaration__OperationsAssignment_41554);
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


    // $ANTLR start "rule__Mover__ParamAssignment_2"
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:805:1: rule__Mover__ParamAssignment_2 : ( ruleDireccion ) ;
    public final void rule__Mover__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:809:1: ( ( ruleDireccion ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:810:1: ( ruleDireccion )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:810:1: ( ruleDireccion )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:811:1: ruleDireccion
            {
             before(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__Mover__ParamAssignment_21585);
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
    // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:820:1: rule__Poner__ParamAssignment_2 : ( ruleColor ) ;
    public final void rule__Poner__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:824:1: ( ( ruleColor ) )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:825:1: ( ruleColor )
            {
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:825:1: ( ruleColor )
            // ../tp4.gbs.ui/src-gen/tp4/gbs/ui/contentassist/antlr/internal/InternalGobstons.g:826:1: ruleColor
            {
             before(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__Poner__ParamAssignment_21616);
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
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0_in_ruleMover214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0_in_rulePoner274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_entryRuleDireccion301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDireccion308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_rule__Operation__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_rule__Operation__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Direccion__Alternatives480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Direccion__Alternatives500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Direccion__Alternatives520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Direccion__Alternatives540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Color__Alternatives575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Color__Alternatives595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Color__Alternatives615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Color__Alternatives635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__0__Impl_in_rule__ProcedureDeclaration__Group__0667 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__1_in_rule__ProcedureDeclaration__Group__0670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProcedureDeclaration__Group__0__Impl698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__1__Impl_in_rule__ProcedureDeclaration__Group__1729 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__2_in_rule__ProcedureDeclaration__Group__1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProcedureDeclaration__Group__1__Impl760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__2__Impl_in_rule__ProcedureDeclaration__Group__2791 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__3_in_rule__ProcedureDeclaration__Group__2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ProcedureDeclaration__Group__2__Impl822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__3__Impl_in_rule__ProcedureDeclaration__Group__3853 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__4_in_rule__ProcedureDeclaration__Group__3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ProcedureDeclaration__Group__3__Impl884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__4__Impl_in_rule__ProcedureDeclaration__Group__4915 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__5_in_rule__ProcedureDeclaration__Group__4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__OperationsAssignment_4_in_rule__ProcedureDeclaration__Group__4__Impl945 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_rule__ProcedureDeclaration__Group__5__Impl_in_rule__ProcedureDeclaration__Group__5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ProcedureDeclaration__Group__5__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__01047 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__01050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mover__Group__0__Impl1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__11109 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Mover__Group__1__Impl1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__21171 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__21174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__ParamAssignment_2_in_rule__Mover__Group__2__Impl1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__31231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Mover__Group__3__Impl1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__01298 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__01301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Poner__Group__0__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__11360 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Poner__Group__1__Impl1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__21422 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__21425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__ParamAssignment_2_in_rule__Poner__Group__2__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__31482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Poner__Group__3__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__ProcedureDeclaration__OperationsAssignment_41554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__Mover__ParamAssignment_21585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Poner__ParamAssignment_21616 = new BitSet(new long[]{0x0000000000000002L});

}