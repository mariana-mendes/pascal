/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.type#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link compilador.pascal.type#getStructuredType <em>Structured Type</em>}</li>
 *   <li>{@link compilador.pascal.type#getPointerType <em>Pointer Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#gettype()
 * @model
 * @generated
 */
public interface type extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Type</em>' containment reference.
   * @see #setSimpleType(simpleType)
   * @see compilador.pascal.PascalPackage#gettype_SimpleType()
   * @model containment="true"
   * @generated
   */
  simpleType getSimpleType();

  /**
   * Sets the value of the '{@link compilador.pascal.type#getSimpleType <em>Simple Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Type</em>' containment reference.
   * @see #getSimpleType()
   * @generated
   */
  void setSimpleType(simpleType value);

  /**
   * Returns the value of the '<em><b>Structured Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structured Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured Type</em>' containment reference.
   * @see #setStructuredType(structuredType)
   * @see compilador.pascal.PascalPackage#gettype_StructuredType()
   * @model containment="true"
   * @generated
   */
  structuredType getStructuredType();

  /**
   * Sets the value of the '{@link compilador.pascal.type#getStructuredType <em>Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structured Type</em>' containment reference.
   * @see #getStructuredType()
   * @generated
   */
  void setStructuredType(structuredType value);

  /**
   * Returns the value of the '<em><b>Pointer Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer Type</em>' containment reference.
   * @see #setPointerType(pointerType)
   * @see compilador.pascal.PascalPackage#gettype_PointerType()
   * @model containment="true"
   * @generated
   */
  pointerType getPointerType();

  /**
   * Sets the value of the '{@link compilador.pascal.type#getPointerType <em>Pointer Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer Type</em>' containment reference.
   * @see #getPointerType()
   * @generated
   */
  void setPointerType(pointerType value);

} // type
