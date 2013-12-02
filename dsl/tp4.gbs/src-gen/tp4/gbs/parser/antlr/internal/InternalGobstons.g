/*
* generated by Xtext
*/
grammar InternalGobstons;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package tp4.gbs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProcedureDeclaration
entryRuleProcedureDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProcedureDeclarationRule()); }
	 iv_ruleProcedureDeclaration=ruleProcedureDeclaration 
	 { $current=$iv_ruleProcedureDeclaration.current; } 
	 EOF 
;

// Rule ProcedureDeclaration
ruleProcedureDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='procedure' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_0());
    }
	otherlv_1='Main' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProcedureDeclarationAccess().getMainKeyword_1());
    }
	otherlv_2='()' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_4_0()); 
	    }
		lv_operations_4_0=ruleOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
	        }
       		add(
       			$current, 
       			"operations",
        		lv_operations_4_0, 
        		"Operation");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	 iv_ruleOperation=ruleOperation 
	 { $current=$iv_ruleOperation.current; } 
	 EOF 
;

// Rule Operation
ruleOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOperationAccess().getMoverParserRuleCall_0()); 
    }
    this_Mover_0=ruleMover
    { 
        $current = $this_Mover_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getOperationAccess().getPonerParserRuleCall_1()); 
    }
    this_Poner_1=rulePoner
    { 
        $current = $this_Poner_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getOperationAccess().getHayBolitasParserRuleCall_2()); 
    }
    this_HayBolitas_2=ruleHayBolitas
    { 
        $current = $this_HayBolitas_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleHayBolitas
entryRuleHayBolitas returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHayBolitasRule()); }
	 iv_ruleHayBolitas=ruleHayBolitas 
	 { $current=$iv_ruleHayBolitas.current; } 
	 EOF 
;

// Rule HayBolitas
ruleHayBolitas returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='hayBolitas' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getHayBolitasAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHayBolitasAccess().getParamColorParserRuleCall_2_0()); 
	    }
		lv_param_2_0=ruleColor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHayBolitasRule());
	        }
       		set(
       			$current, 
       			"param",
        		lv_param_2_0, 
        		"Color");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getHayBolitasAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleMover
entryRuleMover returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMoverRule()); }
	 iv_ruleMover=ruleMover 
	 { $current=$iv_ruleMover.current; } 
	 EOF 
;

// Rule Mover
ruleMover returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Mover' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMoverAccess().getMoverKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); 
	    }
		lv_param_2_0=ruleDireccion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMoverRule());
	        }
       		set(
       			$current, 
       			"param",
        		lv_param_2_0, 
        		"Direccion");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMoverAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRulePoner
entryRulePoner returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPonerRule()); }
	 iv_rulePoner=rulePoner 
	 { $current=$iv_rulePoner.current; } 
	 EOF 
;

// Rule Poner
rulePoner returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Poner' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPonerAccess().getPonerKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); 
	    }
		lv_param_2_0=ruleColor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPonerRule());
	        }
       		set(
       			$current, 
       			"param",
        		lv_param_2_0, 
        		"Color");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPonerAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleDireccion
entryRuleDireccion returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDireccionRule()); } 
	 iv_ruleDireccion=ruleDireccion 
	 { $current=$iv_ruleDireccion.current.getText(); }  
	 EOF 
;

// Rule Direccion
ruleDireccion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='Norte' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDireccionAccess().getNorteKeyword_0()); 
    }

    |
	kw='Sur' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDireccionAccess().getSurKeyword_1()); 
    }

    |
	kw='Este' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDireccionAccess().getEsteKeyword_2()); 
    }

    |
	kw='Oeste' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDireccionAccess().getOesteKeyword_3()); 
    }
)
    ;





// Entry rule entryRuleColor
entryRuleColor returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getColorRule()); } 
	 iv_ruleColor=ruleColor 
	 { $current=$iv_ruleColor.current.getText(); }  
	 EOF 
;

// Rule Color
ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='Rojo' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getColorAccess().getRojoKeyword_0()); 
    }

    |
	kw='Verde' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getColorAccess().getVerdeKeyword_1()); 
    }

    |
	kw='Azul' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getColorAccess().getAzulKeyword_2()); 
    }

    |
	kw='Negro' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getColorAccess().getNegroKeyword_3()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


