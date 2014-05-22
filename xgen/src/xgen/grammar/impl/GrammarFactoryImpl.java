/**
 */
package xgen.grammar.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xgen.grammar.Alternative;
import xgen.grammar.Any;
import xgen.grammar.Definition;
import xgen.grammar.Grammar;
import xgen.grammar.GrammarFactory;
import xgen.grammar.GrammarPackage;
import xgen.grammar.Keyword;
import xgen.grammar.Multiplicity;
import xgen.grammar.Not;
import xgen.grammar.Placeholder;
import xgen.grammar.Prefix;
import xgen.grammar.Range;
import xgen.grammar.Reference;
import xgen.grammar.Sequence;
import xgen.grammar.Suffix;
import xgen.grammar.Until;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrammarFactoryImpl extends EFactoryImpl implements GrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammarFactory init() {
		try
		{
			GrammarFactory theGrammarFactory = (GrammarFactory)EPackage.Registry.INSTANCE.getEFactory(GrammarPackage.eNS_URI);
			if (theGrammarFactory != null)
			{
				return theGrammarFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID())
		{
			case GrammarPackage.GRAMMAR: return createGrammar();
			case GrammarPackage.DEFINITION: return createDefinition();
			case GrammarPackage.PREFIX: return createPrefix();
			case GrammarPackage.SUFFIX: return createSuffix();
			case GrammarPackage.ANY: return createAny();
			case GrammarPackage.KEYWORD: return createKeyword();
			case GrammarPackage.RANGE: return createRange();
			case GrammarPackage.REFERENCE: return createReference();
			case GrammarPackage.PLACEHOLDER: return createPlaceholder();
			case GrammarPackage.NOT: return createNot();
			case GrammarPackage.UNTIL: return createUntil();
			case GrammarPackage.MULTIPLICITY: return createMultiplicity();
			case GrammarPackage.ALTERNATIVE: return createAlternative();
			case GrammarPackage.SEQUENCE: return createSequence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar createGrammar() {
		GrammarImpl grammar = new GrammarImpl();
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword createKeyword() {
		KeywordImpl keyword = new KeywordImpl();
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicity() {
		MultiplicityImpl multiplicity = new MultiplicityImpl();
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Until createUntil()
	{
		UntilImpl until = new UntilImpl();
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placeholder createPlaceholder()
	{
		PlaceholderImpl placeholder = new PlaceholderImpl();
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prefix createPrefix()
	{
		PrefixImpl prefix = new PrefixImpl();
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suffix createSuffix()
	{
		SuffixImpl suffix = new SuffixImpl();
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarPackage getGrammarPackage() {
		return (GrammarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammarPackage getPackage() {
		return GrammarPackage.eINSTANCE;
	}

} //GrammarFactoryImpl
