/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.caseListElement#getConstList <em>Const List</em>}</li>
 *   <li>{@link compilador.pascal.caseListElement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getcaseListElement()
 * @model
 * @generated
 */
public interface caseListElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Const List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const List</em>' containment reference.
   * @see #setConstList(constList)
   * @see compilador.pascal.PascalPackage#getcaseListElement_ConstList()
   * @model containment="true"
   * @generated
   */
  constList getConstList();

  /**
   * Sets the value of the '{@link compilador.pascal.caseListElement#getConstList <em>Const List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const List</em>' containment reference.
   * @see #getConstList()
   * @generated
   */
  void setConstList(constList value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(statement)
   * @see compilador.pascal.PascalPackage#getcaseListElement_Statement()
   * @model containment="true"
   * @generated
   */
  statement getStatement();

  /**
   * Sets the value of the '{@link compilador.pascal.caseListElement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(statement value);

} // caseListElement
