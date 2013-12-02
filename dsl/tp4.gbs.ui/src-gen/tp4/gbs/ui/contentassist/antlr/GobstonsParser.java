/*
* generated by Xtext
*/
package tp4.gbs.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import tp4.gbs.services.GobstonsGrammarAccess;

public class GobstonsParser extends AbstractContentAssistParser {
	
	@Inject
	private GobstonsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected tp4.gbs.ui.contentassist.antlr.internal.InternalGobstonsParser createParser() {
		tp4.gbs.ui.contentassist.antlr.internal.InternalGobstonsParser result = new tp4.gbs.ui.contentassist.antlr.internal.InternalGobstonsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
					put(grammarAccess.getDireccionAccess().getAlternatives(), "rule__Direccion__Alternatives");
					put(grammarAccess.getColorAccess().getAlternatives(), "rule__Color__Alternatives");
					put(grammarAccess.getProcedureDeclarationAccess().getGroup(), "rule__ProcedureDeclaration__Group__0");
					put(grammarAccess.getHayBolitasAccess().getGroup(), "rule__HayBolitas__Group__0");
					put(grammarAccess.getMoverAccess().getGroup(), "rule__Mover__Group__0");
					put(grammarAccess.getPonerAccess().getGroup(), "rule__Poner__Group__0");
					put(grammarAccess.getProcedureDeclarationAccess().getOperationsAssignment_4(), "rule__ProcedureDeclaration__OperationsAssignment_4");
					put(grammarAccess.getHayBolitasAccess().getParamAssignment_2(), "rule__HayBolitas__ParamAssignment_2");
					put(grammarAccess.getMoverAccess().getParamAssignment_2(), "rule__Mover__ParamAssignment_2");
					put(grammarAccess.getPonerAccess().getParamAssignment_2(), "rule__Poner__ParamAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			tp4.gbs.ui.contentassist.antlr.internal.InternalGobstonsParser typedParser = (tp4.gbs.ui.contentassist.antlr.internal.InternalGobstonsParser) parser;
			typedParser.entryRuleProcedureDeclaration();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GobstonsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GobstonsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
