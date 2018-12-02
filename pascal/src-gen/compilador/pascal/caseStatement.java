/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.caseStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link compilador.pascal.caseStatement#getCaseListElement <em>Case List Element</em>}</li>
 *   <li>{@link compilador.pascal.caseStatement#getCaseListElement1 <em>Case List Element1</em>}</li>
 *   <li>{@link compilador.pascal.caseStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#getcaseStatement()
 * @model
 * @generated
 */
public interface caseStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see compilador.pascal.PascalPackage#getcaseStatement_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link compilador.pascal.caseStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

  /**
   * Returns the value of the '<em><b>Case List Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case List Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case List Element</em>' containment reference.
   * @see #setCaseListElement(caseListElement)
   * @see compilador.pascal.PascalPackage#getcaseStatement_CaseListElement()
   * @model containment="true"
   * @generated
   */
  caseListElement getCaseListElement();

  /**
   * Sets the value of the '{@link compilador.pascal.caseStatement#getCaseListElement <em>Case List Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case List Element</em>' containment reference.
   * @see #getCaseListElement()
   * @generated
   */
  void setCaseListElement(caseListElement value);

  /**
   * Returns the value of the '<em><b>Case List Element1</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.caseListElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case List Element1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case List Element1</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getcaseStatement_CaseListElement1()
   * @model containment="true"
   * @generated
   */
  EList<caseListElement> getCaseListElement1();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference.
   * @see #setStatements(statements)
   * @see compilador.pascal.PascalPackage#getcaseStatement_Statements()
   * @model containment="true"
   * @generated
   */
  statements getStatements();

  /**
   * Sets the value of the '{@link compilador.pascal.caseStatement#getStatements <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statements</em>' containment reference.
   * @see #getStatements()
   * @generated
   */
  void setStatements(statements value);

} // caseStatement