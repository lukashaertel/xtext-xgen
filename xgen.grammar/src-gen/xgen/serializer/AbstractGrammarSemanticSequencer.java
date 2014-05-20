package xgen.serializer;

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
import xgen.services.GrammarGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractGrammarSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GrammarGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GrammarPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (operands+=Construct0_Alternative_1_0 operands+=Construct1 operands+=Construct1*)
	 */
	protected void sequence_Construct0(EObject context, Alternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=Construct1_Sequence_1_0 operands+=Construct2 operands+=Construct2*)
	 */
	protected void sequence_Construct1(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     operand=Construct2
	 */
	protected void sequence_Construct2(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GrammarPackage.Literals.UNARY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GrammarPackage.Literals.UNARY__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operand=Construct3_Multiplicity_1_0 min=INT (upperBounded?=',' max=INT)?)
	 */
	protected void sequence_Construct3(EObject context, Multiplicity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Any}
	 */
	protected void sequence_Construct4(EObject context, Any semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Construct4(EObject context, Keyword semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GrammarPackage.Literals.KEYWORD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GrammarPackage.Literals.KEYWORD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (min=CHAR max=CHAR)
	 */
	protected void sequence_Construct4(EObject context, Range semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GrammarPackage.Literals.RANGE__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GrammarPackage.Literals.RANGE__MIN));
			if(transientValues.isValueTransient(semanticObject, GrammarPackage.Literals.RANGE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GrammarPackage.Literals.RANGE__MAX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_1_1_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_1_2_0(), semanticObject.getMax());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     target=[Definition|ID]
	 */
	protected void sequence_Construct4(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GrammarPackage.Literals.REFERENCE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GrammarPackage.Literals.REFERENCE__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstruct4Access().getTargetDefinitionIDTerminalRuleCall_0_1_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lexical?='lexical'? lhs=ID rhs=Construct0)
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (definitions+=Definition*)
	 */
	protected void sequence_Grammar(EObject context, Grammar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
