/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.tag#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link compilador.pascal.tag#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link compilador.pascal.tag#getTypeIdentifier1 <em>Type Identifier1</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#gettag()
 * @model
 * @generated
 */
public interface tag extends EObject
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
   * @see compilador.pascal.PascalPackage#gettag_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link compilador.pascal.tag#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Type Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Identifier</em>' containment reference.
   * @see #setTypeIdentifier(typeIdentifier)
   * @see compilador.pascal.PascalPackage#gettag_TypeIdentifier()
   * @model containment="true"
   * @generated
   */
  typeIdentifier getTypeIdentifier();

  /**
   * Sets the value of the '{@link compilador.pascal.tag#getTypeIdentifier <em>Type Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Identifier</em>' containment reference.
   * @see #getTypeIdentifier()
   * @generated
   */
  void setTypeIdentifier(typeIdentifier value);

  /**
   * Returns the value of the '<em><b>Type Identifier1</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.typeIdentifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Identifier1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Identifier1</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#gettag_TypeIdentifier1()
   * @model containment="true"
   * @generated
   */
  EList<typeIdentifier> getTypeIdentifier1();

} // tag