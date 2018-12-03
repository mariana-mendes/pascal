/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unsigned Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.unsignedConstant#getUnsignedNumber <em>Unsigned Number</em>}</li>
 *   <li>{@link compilador.pascal.unsignedConstant#getString_literal <em>String literal</em>}</li>
 *   <li>{@link compilador.pascal.unsignedConstant#getConstantChr <em>Constant Chr</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getunsignedConstant()
 * @model
 * @generated
 */
public interface unsignedConstant extends EObject
{
  /**
   * Returns the value of the '<em><b>Unsigned Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsigned Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsigned Number</em>' containment reference.
   * @see #setUnsignedNumber(unsignedNumber)
   * @see compilador.pascal.PascalPackage#getunsignedConstant_UnsignedNumber()
   * @model containment="true"
   * @generated
   */
  unsignedNumber getUnsignedNumber();

  /**
   * Sets the value of the '{@link compilador.pascal.unsignedConstant#getUnsignedNumber <em>Unsigned Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned Number</em>' containment reference.
   * @see #getUnsignedNumber()
   * @generated
   */
  void setUnsignedNumber(unsignedNumber value);

  /**
   * Returns the value of the '<em><b>String literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String literal</em>' attribute.
   * @see #setString_literal(String)
   * @see compilador.pascal.PascalPackage#getunsignedConstant_String_literal()
   * @model
   * @generated
   */
  String getString_literal();

  /**
   * Sets the value of the '{@link compilador.pascal.unsignedConstant#getString_literal <em>String literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String literal</em>' attribute.
   * @see #getString_literal()
   * @generated
   */
  void setString_literal(String value);

  /**
   * Returns the value of the '<em><b>Constant Chr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant Chr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant Chr</em>' containment reference.
   * @see #setConstantChr(constantChr)
   * @see compilador.pascal.PascalPackage#getunsignedConstant_ConstantChr()
   * @model containment="true"
   * @generated
   */
  constantChr getConstantChr();

  /**
   * Sets the value of the '{@link compilador.pascal.unsignedConstant#getConstantChr <em>Constant Chr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant Chr</em>' containment reference.
   * @see #getConstantChr()
   * @generated
   */
  void setConstantChr(constantChr value);

} // unsignedConstant
