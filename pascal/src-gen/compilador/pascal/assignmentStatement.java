/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.assignmentStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link compilador.pascal.assignmentStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getassignmentStatement()
 * @model
 * @generated
 */
public interface assignmentStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(variable)
   * @see compilador.pascal.PascalPackage#getassignmentStatement_Variable()
   * @model containment="true"
   * @generated
   */
  variable getVariable();

  /**
   * Sets the value of the '{@link compilador.pascal.assignmentStatement#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(variable value);

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
   * @see compilador.pascal.PascalPackage#getassignmentStatement_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link compilador.pascal.assignmentStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

} // assignmentStatement
