/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.simpleType#getScalarType <em>Scalar Type</em>}</li>
 *   <li>{@link compilador.pascal.simpleType#getSubrangeType <em>Subrange Type</em>}</li>
 *   <li>{@link compilador.pascal.simpleType#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link compilador.pascal.simpleType#getStringtype <em>Stringtype</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getsimpleType()
 * @model
 * @generated
 */
public interface simpleType extends EObject
{
  /**
   * Returns the value of the '<em><b>Scalar Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scalar Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scalar Type</em>' containment reference.
   * @see #setScalarType(scalarType)
   * @see compilador.pascal.PascalPackage#getsimpleType_ScalarType()
   * @model containment="true"
   * @generated
   */
  scalarType getScalarType();

  /**
   * Sets the value of the '{@link compilador.pascal.simpleType#getScalarType <em>Scalar Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scalar Type</em>' containment reference.
   * @see #getScalarType()
   * @generated
   */
  void setScalarType(scalarType value);

  /**
   * Returns the value of the '<em><b>Subrange Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subrange Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subrange Type</em>' containment reference.
   * @see #setSubrangeType(subrangeType)
   * @see compilador.pascal.PascalPackage#getsimpleType_SubrangeType()
   * @model containment="true"
   * @generated
   */
  subrangeType getSubrangeType();

  /**
   * Sets the value of the '{@link compilador.pascal.simpleType#getSubrangeType <em>Subrange Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subrange Type</em>' containment reference.
   * @see #getSubrangeType()
   * @generated
   */
  void setSubrangeType(subrangeType value);

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
   * @see compilador.pascal.PascalPackage#getsimpleType_TypeIdentifier()
   * @model containment="true"
   * @generated
   */
  typeIdentifier getTypeIdentifier();

  /**
   * Sets the value of the '{@link compilador.pascal.simpleType#getTypeIdentifier <em>Type Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Identifier</em>' containment reference.
   * @see #getTypeIdentifier()
   * @generated
   */
  void setTypeIdentifier(typeIdentifier value);

  /**
   * Returns the value of the '<em><b>Stringtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stringtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stringtype</em>' containment reference.
   * @see #setStringtype(stringtype)
   * @see compilador.pascal.PascalPackage#getsimpleType_Stringtype()
   * @model containment="true"
   * @generated
   */
  stringtype getStringtype();

  /**
   * Sets the value of the '{@link compilador.pascal.simpleType#getStringtype <em>Stringtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stringtype</em>' containment reference.
   * @see #getStringtype()
   * @generated
   */
  void setStringtype(stringtype value);

} // simpleType
