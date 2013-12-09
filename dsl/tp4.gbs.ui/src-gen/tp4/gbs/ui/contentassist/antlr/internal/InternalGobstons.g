/*
* generated by Xtext
*/
grammar InternalGobstons;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package tp4.gbs.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleProcedureDeclaration
entryRuleProcedureDeclaration 
:
{ before(grammarAccess.getProcedureDeclarationRule()); }
	 ruleProcedureDeclaration
{ after(grammarAccess.getProcedureDeclarationRule()); } 
	 EOF 
;

// Rule ProcedureDeclaration
ruleProcedureDeclaration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getGroup()); }
(rule__ProcedureDeclaration__Group__0)
{ after(grammarAccess.getProcedureDeclarationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOperation
entryRuleOperation 
:
{ before(grammarAccess.getOperationRule()); }
	 ruleOperation
{ after(grammarAccess.getOperationRule()); } 
	 EOF 
;

// Rule Operation
ruleOperation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOperationAccess().getAlternatives()); }
(rule__Operation__Alternatives)
{ after(grammarAccess.getOperationAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFunction
entryRuleFunction 
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFunctionAccess().getAlternatives()); }
(rule__Function__Alternatives)
{ after(grammarAccess.getFunctionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConditional
entryRuleConditional 
:
{ before(grammarAccess.getConditionalRule()); }
	 ruleConditional
{ after(grammarAccess.getConditionalRule()); } 
	 EOF 
;

// Rule Conditional
ruleConditional
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConditionalAccess().getGroup()); }
(rule__Conditional__Group__0)
{ after(grammarAccess.getConditionalAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHayBolitas
entryRuleHayBolitas 
:
{ before(grammarAccess.getHayBolitasRule()); }
	 ruleHayBolitas
{ after(grammarAccess.getHayBolitasRule()); } 
	 EOF 
;

// Rule HayBolitas
ruleHayBolitas
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getHayBolitasAccess().getGroup()); }
(rule__HayBolitas__Group__0)
{ after(grammarAccess.getHayBolitasAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMover
entryRuleMover 
:
{ before(grammarAccess.getMoverRule()); }
	 ruleMover
{ after(grammarAccess.getMoverRule()); } 
	 EOF 
;

// Rule Mover
ruleMover
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMoverAccess().getGroup()); }
(rule__Mover__Group__0)
{ after(grammarAccess.getMoverAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePoner
entryRulePoner 
:
{ before(grammarAccess.getPonerRule()); }
	 rulePoner
{ after(grammarAccess.getPonerRule()); } 
	 EOF 
;

// Rule Poner
rulePoner
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPonerAccess().getGroup()); }
(rule__Poner__Group__0)
{ after(grammarAccess.getPonerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDireccion
entryRuleDireccion 
:
{ before(grammarAccess.getDireccionRule()); }
	 ruleDireccion
{ after(grammarAccess.getDireccionRule()); } 
	 EOF 
;

// Rule Direccion
ruleDireccion
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDireccionAccess().getAlternatives()); }
(rule__Direccion__Alternatives)
{ after(grammarAccess.getDireccionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleColor
entryRuleColor 
:
{ before(grammarAccess.getColorRule()); }
	 ruleColor
{ after(grammarAccess.getColorRule()); } 
	 EOF 
;

// Rule Color
ruleColor
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getColorAccess().getAlternatives()); }
(rule__Color__Alternatives)
{ after(grammarAccess.getColorAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Operation__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getFunctionParserRuleCall_0()); }
	ruleFunction
{ after(grammarAccess.getOperationAccess().getFunctionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getOperationAccess().getConditionalParserRuleCall_1()); }
	ruleConditional
{ after(grammarAccess.getOperationAccess().getConditionalParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getMoverParserRuleCall_0()); }
	ruleMover
{ after(grammarAccess.getFunctionAccess().getMoverParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getFunctionAccess().getPonerParserRuleCall_1()); }
	rulePoner
{ after(grammarAccess.getFunctionAccess().getPonerParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getFunctionAccess().getHayBolitasParserRuleCall_2()); }
	ruleHayBolitas
{ after(grammarAccess.getFunctionAccess().getHayBolitasParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Direccion__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDireccionAccess().getNorteKeyword_0()); }

	'Norte' 

{ after(grammarAccess.getDireccionAccess().getNorteKeyword_0()); }
)

    |(
{ before(grammarAccess.getDireccionAccess().getSurKeyword_1()); }

	'Sur' 

{ after(grammarAccess.getDireccionAccess().getSurKeyword_1()); }
)

    |(
{ before(grammarAccess.getDireccionAccess().getEsteKeyword_2()); }

	'Este' 

{ after(grammarAccess.getDireccionAccess().getEsteKeyword_2()); }
)

    |(
{ before(grammarAccess.getDireccionAccess().getOesteKeyword_3()); }

	'Oeste' 

{ after(grammarAccess.getDireccionAccess().getOesteKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Color__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getColorAccess().getRojoKeyword_0()); }

	'Rojo' 

{ after(grammarAccess.getColorAccess().getRojoKeyword_0()); }
)

    |(
{ before(grammarAccess.getColorAccess().getVerdeKeyword_1()); }

	'Verde' 

{ after(grammarAccess.getColorAccess().getVerdeKeyword_1()); }
)

    |(
{ before(grammarAccess.getColorAccess().getAzulKeyword_2()); }

	'Azul' 

{ after(grammarAccess.getColorAccess().getAzulKeyword_2()); }
)

    |(
{ before(grammarAccess.getColorAccess().getNegroKeyword_3()); }

	'Negro' 

{ after(grammarAccess.getColorAccess().getNegroKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__ProcedureDeclaration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProcedureDeclaration__Group__0__Impl
	rule__ProcedureDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcedureDeclaration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getProcedureDeclarationAction_0()); }
(

)
{ after(grammarAccess.getProcedureDeclarationAccess().getProcedureDeclarationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ProcedureDeclaration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProcedureDeclaration__Group__1__Impl
	rule__ProcedureDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcedureDeclaration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_1()); }

	'procedure' 

{ after(grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ProcedureDeclaration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProcedureDeclaration__Group__2__Impl
	rule__ProcedureDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcedureDeclaration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getMainKeyword_2()); }

	'Main' 

{ after(grammarAccess.getProcedureDeclarationAccess().getMainKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ProcedureDeclaration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProcedureDeclaration__Group__3__Impl
	rule__ProcedureDeclaration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcedureDeclaration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_3()); }

	'()' 

{ after(grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ProcedureDeclaration__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProcedureDeclaration__Group__4__Impl
	rule__ProcedureDeclaration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcedureDeclaration__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getProcedureDeclarationAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ProcedureDeclaration__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProcedureDeclaration__Group__5__Impl
	rule__ProcedureDeclaration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcedureDeclaration__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getOperationsAssignment_5()); }
(rule__ProcedureDeclaration__OperationsAssignment_5)*
{ after(grammarAccess.getProcedureDeclarationAccess().getOperationsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ProcedureDeclaration__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProcedureDeclaration__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcedureDeclaration__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getProcedureDeclarationAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Conditional__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__0__Impl
	rule__Conditional__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getIfKeyword_0()); }

	'if' 

{ after(grammarAccess.getConditionalAccess().getIfKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__1__Impl
	rule__Conditional__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__2__Impl
	rule__Conditional__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getBoolExpresionAssignment_2()); }
(rule__Conditional__BoolExpresionAssignment_2)
{ after(grammarAccess.getConditionalAccess().getBoolExpresionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__3__Impl
	rule__Conditional__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__4__Impl
	rule__Conditional__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__5__Impl
	rule__Conditional__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getTrueBlockAssignment_5()); }
(rule__Conditional__TrueBlockAssignment_5)
{ after(grammarAccess.getConditionalAccess().getTrueBlockAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__6__Impl
	rule__Conditional__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__7__Impl
	rule__Conditional__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getElseKeyword_7()); }

	'else' 

{ after(grammarAccess.getConditionalAccess().getElseKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__8__Impl
	rule__Conditional__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_8()); }

	'{' 

{ after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__9__Impl
	rule__Conditional__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getFalseBlockAssignment_9()); }
(rule__Conditional__FalseBlockAssignment_9)
{ after(grammarAccess.getConditionalAccess().getFalseBlockAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Conditional__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_10()); }

	'}' 

{ after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__HayBolitas__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HayBolitas__Group__0__Impl
	rule__HayBolitas__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); }

	'hayBolitas' 

{ after(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HayBolitas__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HayBolitas__Group__1__Impl
	rule__HayBolitas__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getHayBolitasAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HayBolitas__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HayBolitas__Group__2__Impl
	rule__HayBolitas__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getParamAssignment_2()); }
(rule__HayBolitas__ParamAssignment_2)
{ after(grammarAccess.getHayBolitasAccess().getParamAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HayBolitas__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HayBolitas__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getHayBolitasAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Mover__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__0__Impl
	rule__Mover__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getMoverKeyword_0()); }

	'Mover' 

{ after(grammarAccess.getMoverAccess().getMoverKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mover__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__1__Impl
	rule__Mover__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getMoverAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mover__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__2__Impl
	rule__Mover__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getParamAssignment_2()); }
(rule__Mover__ParamAssignment_2)
{ after(grammarAccess.getMoverAccess().getParamAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mover__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getMoverAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Poner__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__0__Impl
	rule__Poner__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getPonerKeyword_0()); }

	'Poner' 

{ after(grammarAccess.getPonerAccess().getPonerKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poner__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__1__Impl
	rule__Poner__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getPonerAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poner__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__2__Impl
	rule__Poner__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getParamAssignment_2()); }
(rule__Poner__ParamAssignment_2)
{ after(grammarAccess.getPonerAccess().getParamAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poner__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getPonerAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__ProcedureDeclaration__OperationsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_5_0()); }
	ruleOperation{ after(grammarAccess.getProcedureDeclarationAccess().getOperationsOperationParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__BoolExpresionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getBoolExpresionHayBolitasParserRuleCall_2_0()); }
	ruleHayBolitas{ after(grammarAccess.getConditionalAccess().getBoolExpresionHayBolitasParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__TrueBlockAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getTrueBlockOperationParserRuleCall_5_0()); }
	ruleOperation{ after(grammarAccess.getConditionalAccess().getTrueBlockOperationParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__FalseBlockAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionalAccess().getFalseBlockOperationParserRuleCall_9_0()); }
	ruleOperation{ after(grammarAccess.getConditionalAccess().getFalseBlockOperationParserRuleCall_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__ParamAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getParamColorParserRuleCall_2_0()); }
	ruleColor{ after(grammarAccess.getHayBolitasAccess().getParamColorParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__ParamAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); }
	ruleDireccion{ after(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__ParamAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); }
	ruleColor{ after(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


