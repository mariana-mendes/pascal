/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pointer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.pointerType#getTypeIdentifier <em>Type Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#getpointerType()
 * @model
 * @generated
 */
public interface pointerType extends EObject
{
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
   * @see compilador.pascal.PascalPackage#getpointerType_TypeIdentifier()
   * @model containment="true"
   * @generated
   */
  typeIdentifier getTypeIdentifier();

  /**
   * Sets the value of the '{@link compilador.pascal.pointerType#getTypeIdentifier <em>Type Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Identifier</em>' containment reference.
   * @see #getTypeIdentifier()
   * @generated
   */
  void setTypeIdentifier(typeIdentifier value);

} // pointerType
