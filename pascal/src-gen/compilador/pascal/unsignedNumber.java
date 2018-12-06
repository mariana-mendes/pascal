/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unsigned Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.unsignedNumber#getUnsignedInteger <em>Unsigned Integer</em>}</li>
 *   <li>{@link compilador.pascal.unsignedNumber#getUnsignedReal <em>Unsigned Real</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getunsignedNumber()
 * @model
 * @generated
 */
public interface unsignedNumber extends EObject
{
  /**
   * Returns the value of the '<em><b>Unsigned Integer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsigned Integer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsigned Integer</em>' containment reference.
   * @see #setUnsignedInteger(unsignedInteger)
   * @see compilador.pascal.PascalPackage#getunsignedNumber_UnsignedInteger()
   * @model containment="true"
   * @generated
   */
  unsignedInteger getUnsignedInteger();

  /**
   * Sets the value of the '{@link compilador.pascal.unsignedNumber#getUnsignedInteger <em>Unsigned Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned Integer</em>' containment reference.
   * @see #getUnsignedInteger()
   * @generated
   */
  void setUnsignedInteger(unsignedInteger value);

  /**
   * Returns the value of the '<em><b>Unsigned Real</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsigned Real</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsigned Real</em>' attribute.
   * @see #setUnsignedReal(String)
   * @see compilador.pascal.PascalPackage#getunsignedNumber_UnsignedReal()
   * @model
   * @generated
   */
  String getUnsignedReal();

  /**
   * Sets the value of the '{@link compilador.pascal.unsignedNumber#getUnsignedReal <em>Unsigned Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned Real</em>' attribute.
   * @see #getUnsignedReal()
   * @generated
   */
  void setUnsignedReal(String value);

} // unsignedNumber
