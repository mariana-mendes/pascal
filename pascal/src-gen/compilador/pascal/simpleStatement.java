/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.simpleStatement#getGotoStatement <em>Goto Statement</em>}</li>
 *   <li>{@link compilador.pascal.simpleStatement#getAssignmentStatement <em>Assignment Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#getsimpleStatement()
 * @model
 * @generated
 */
public interface simpleStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Goto Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goto Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto Statement</em>' containment reference.
   * @see #setGotoStatement(gotoStatement)
   * @see compilador.pascal.PascalPackage#getsimpleStatement_GotoStatement()
   * @model containment="true"
   * @generated
   */
  gotoStatement getGotoStatement();

  /**
   * Sets the value of the '{@link compilador.pascal.simpleStatement#getGotoStatement <em>Goto Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto Statement</em>' containment reference.
   * @see #getGotoStatement()
   * @generated
   */
  void setGotoStatement(gotoStatement value);

  /**
   * Returns the value of the '<em><b>Assignment Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment Statement</em>' containment reference.
   * @see #setAssignmentStatement(assignmentStatement)
   * @see compilador.pascal.PascalPackage#getsimpleStatement_AssignmentStatement()
   * @model containment="true"
   * @generated
   */
  assignmentStatement getAssignmentStatement();

  /**
   * Sets the value of the '{@link compilador.pascal.simpleStatement#getAssignmentStatement <em>Assignment Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment Statement</em>' containment reference.
   * @see #getAssignmentStatement()
   * @generated
   */
  void setAssignmentStatement(assignmentStatement value);

} // simpleStatement
