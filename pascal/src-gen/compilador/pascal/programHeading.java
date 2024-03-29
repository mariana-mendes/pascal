/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>program Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.programHeading#getIdentifer <em>Identifer</em>}</li>
 *   <li>{@link compilador.pascal.programHeading#getIdentifierList <em>Identifier List</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getprogramHeading()
 * @model
 * @generated
 */
public interface programHeading extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifer</em>' containment reference.
   * @see #setIdentifer(identifier)
   * @see compilador.pascal.PascalPackage#getprogramHeading_Identifer()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifer();

  /**
   * Sets the value of the '{@link compilador.pascal.programHeading#getIdentifer <em>Identifer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifer</em>' containment reference.
   * @see #getIdentifer()
   * @generated
   */
  void setIdentifer(identifier value);

  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' containment reference.
   * @see #setIdentifierList(identifierList)
   * @see compilador.pascal.PascalPackage#getprogramHeading_IdentifierList()
   * @model containment="true"
   * @generated
   */
  identifierList getIdentifierList();

  /**
   * Sets the value of the '{@link compilador.pascal.programHeading#getIdentifierList <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' containment reference.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(identifierList value);

} // programHeading
