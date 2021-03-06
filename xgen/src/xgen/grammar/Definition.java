/**
 */
package xgen.grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.grammar.Definition#getName <em>Name</em>}</li>
 *   <li>{@link xgen.grammar.Definition#isLexical <em>Lexical</em>}</li>
 *   <li>{@link xgen.grammar.Definition#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.grammar.GrammarPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xgen.grammar.GrammarPackage#getDefinition_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xgen.grammar.Definition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lexical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical</em>' attribute.
	 * @see #setLexical(boolean)
	 * @see xgen.grammar.GrammarPackage#getDefinition_Lexical()
	 * @model unique="false"
	 * @generated
	 */
	boolean isLexical();

	/**
	 * Sets the value of the '{@link xgen.grammar.Definition#isLexical <em>Lexical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical</em>' attribute.
	 * @see #isLexical()
	 * @generated
	 */
	void setLexical(boolean value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Construct)
	 * @see xgen.grammar.GrammarPackage#getDefinition_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	Construct getRhs();

	/**
	 * Sets the value of the '{@link xgen.grammar.Definition#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Construct value);

} // Definition
