/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>structured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.structuredType#getUnpackedStructuredType <em>Unpacked Structured Type</em>}</li>
 *   <li>{@link compilador.pascal.structuredType#getUnpackedStructuredType1 <em>Unpacked Structured Type1</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getstructuredType()
 * @model
 * @generated
 */
public interface structuredType extends EObject
{
  /**
   * Returns the value of the '<em><b>Unpacked Structured Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unpacked Structured Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unpacked Structured Type</em>' containment reference.
   * @see #setUnpackedStructuredType(unpackedStructuredType)
   * @see compilador.pascal.PascalPackage#getstructuredType_UnpackedStructuredType()
   * @model containment="true"
   * @generated
   */
  unpackedStructuredType getUnpackedStructuredType();

  /**
   * Sets the value of the '{@link compilador.pascal.structuredType#getUnpackedStructuredType <em>Unpacked Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unpacked Structured Type</em>' containment reference.
   * @see #getUnpackedStructuredType()
   * @generated
   */
  void setUnpackedStructuredType(unpackedStructuredType value);

  /**
   * Returns the value of the '<em><b>Unpacked Structured Type1</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.unpackedStructuredType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unpacked Structured Type1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unpacked Structured Type1</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getstructuredType_UnpackedStructuredType1()
   * @model containment="true"
   * @generated
   */
  EList<unpackedStructuredType> getUnpackedStructuredType1();

} // structuredType
