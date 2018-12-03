/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>identifier List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.identifierList#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link compilador.pascal.identifierList#getIdentifierList <em>Identifier List</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getidentifierList()
 * @model
 * @generated
 */
public interface identifierList extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see compilador.pascal.PascalPackage#getidentifierList_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link compilador.pascal.identifierList#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' attribute list.
   * @see compilador.pascal.PascalPackage#getidentifierList_IdentifierList()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdentifierList();

} // identifierList
