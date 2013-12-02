package tp4.gbs.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import tp4.gbs.gobstons.GobstonsPackage;
import tp4.gbs.gobstons.HayBolitas;
import tp4.gbs.gobstons.Mover;
import tp4.gbs.gobstons.Poner;
import tp4.gbs.gobstons.ProcedureDeclaration;
import tp4.gbs.services.GobstonsGrammarAccess;

@SuppressWarnings("all")
public class GobstonsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GobstonsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GobstonsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GobstonsPackage.HAY_BOLITAS:
				if(context == grammarAccess.getHayBolitasRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_HayBolitas(context, (HayBolitas) semanticObject); 
					return; 
				}
				else break;
			case GobstonsPackage.MOVER:
				if(context == grammarAccess.getMoverRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_Mover(context, (Mover) semanticObject); 
					return; 
				}
				else break;
			case GobstonsPackage.PONER:
				if(context == grammarAccess.getOperationRule() ||
				   context == grammarAccess.getPonerRule()) {
					sequence_Poner(context, (Poner) semanticObject); 
					return; 
				}
				else break;
			case GobstonsPackage.PROCEDURE_DECLARATION:
				if(context == grammarAccess.getProcedureDeclarationRule()) {
					sequence_ProcedureDeclaration(context, (ProcedureDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     param=Color
	 */
	protected void sequence_HayBolitas(EObject context, HayBolitas semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GobstonsPackage.Literals.OPERATION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GobstonsPackage.Literals.OPERATION__PARAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHayBolitasAccess().getParamColorParserRuleCall_2_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     param=Direccion
	 */
	protected void sequence_Mover(EObject context, Mover semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GobstonsPackage.Literals.OPERATION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GobstonsPackage.Literals.OPERATION__PARAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMoverAccess().getParamDireccionParserRuleCall_2_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     param=Color
	 */
	protected void sequence_Poner(EObject context, Poner semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GobstonsPackage.Literals.OPERATION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GobstonsPackage.Literals.OPERATION__PARAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPonerAccess().getParamColorParserRuleCall_2_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operations+=Operation*
	 */
	protected void sequence_ProcedureDeclaration(EObject context, ProcedureDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
