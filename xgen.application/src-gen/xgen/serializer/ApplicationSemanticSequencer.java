package xgen.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

import xgen.application.Application;
import xgen.application.ApplicationPackage;
import xgen.application.ConstructReplacement;
import xgen.application.Model;
import xgen.application.RuleReplacement;
import xgen.grammar.Alternative;
import xgen.grammar.Any;
import xgen.grammar.Definition;
import xgen.grammar.Grammar;
import xgen.grammar.GrammarPackage;
import xgen.grammar.Keyword;
import xgen.grammar.Multiplicity;
import xgen.grammar.Not;
import xgen.grammar.Range;
import xgen.grammar.Reference;
import xgen.grammar.Sequence;
import xgen.grammar.Until;
import xgen.services.ApplicationGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class ApplicationSemanticSequencer extends GrammarSemanticSequencer {

	@Inject
	private ApplicationGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ApplicationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ApplicationPackage.APPLICATION:
				if(context == grammarAccess.getApplyRule()) {
					sequence_Apply(context, (Application) semanticObject); 
					return; 
				}
				else break;
			case ApplicationPackage.CONSTRUCT_REPLACEMENT:
				if(context == grammarAccess.getConstructReplacementRule()) {
					sequence_ConstructReplacement(context, (ConstructReplacement) semanticObject); 
					return; 
				}
				else break;
			case ApplicationPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ApplicationPackage.RULE_REPLACEMENT:
				if(context == grammarAccess.getRuleReplacementRule()) {
					sequence_RuleReplacement(context, (RuleReplacement) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == GrammarPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GrammarPackage.ALTERNATIVE:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct0(context, (Alternative) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.ANY:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct4(context, (Any) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.GRAMMAR:
				if(context == grammarAccess.getGrammarRule()) {
					sequence_Grammar(context, (Grammar) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.KEYWORD:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct4(context, (Keyword) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.MULTIPLICITY:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct3(context, (Multiplicity) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.NOT:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct2(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.RANGE:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct4(context, (Range) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.REFERENCE:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct4(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.SEQUENCE:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct1(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case GrammarPackage.UNTIL:
				if(context == grammarAccess.getConstruct0Rule() ||
				   context == grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct1Rule() ||
				   context == grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0() ||
				   context == grammarAccess.getConstruct2Rule() ||
				   context == grammarAccess.getConstruct3Rule() ||
				   context == grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0() ||
				   context == grammarAccess.getConstruct4Rule()) {
					sequence_Construct2(context, (Until) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (target=[Grammar|QID] min=INT max=INT (constructReplacements+=ConstructReplacement | ruleReplacements+=RuleReplacement)*)
	 */
	protected void sequence_Apply(EObject context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selector=Construct0 (positioned?='/' position=INT)? target=[AbstractRule|ID] replacement=Construct0)
	 */
	protected void sequence_ConstructReplacement(EObject context, ConstructReplacement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     applications+=Apply*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=[AbstractRule|ID] replacement=Construct0)
	 */
	protected void sequence_RuleReplacement(EObject context, RuleReplacement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplicationPackage.Literals.RULE_REPLACEMENT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationPackage.Literals.RULE_REPLACEMENT__TARGET));
			if(transientValues.isValueTransient(semanticObject, ApplicationPackage.Literals.RULE_REPLACEMENT__REPLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationPackage.Literals.RULE_REPLACEMENT__REPLACEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRuleReplacementAccess().getTargetAbstractRuleIDTerminalRuleCall_1_0_1(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getRuleReplacementAccess().getReplacementConstruct0ParserRuleCall_3_0(), semanticObject.getReplacement());
		feeder.finish();
	}
}
