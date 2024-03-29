/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variant Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.variantPart#getTag <em>Tag</em>}</li>
 *   <li>{@link compilador.pascal.variantPart#getVariant <em>Variant</em>}</li>
 *   <li>{@link compilador.pascal.variantPart#getVariant1 <em>Variant1</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getvariantPart()
 * @model
 * @generated
 */
public interface variantPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' containment reference.
   * @see #setTag(tag)
   * @see compilador.pascal.PascalPackage#getvariantPart_Tag()
   * @model containment="true"
   * @generated
   */
  tag getTag();

  /**
   * Sets the value of the '{@link compilador.pascal.variantPart#getTag <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' containment reference.
   * @see #getTag()
   * @generated
   */
  void setTag(tag value);

  /**
   * Returns the value of the '<em><b>Variant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' containment reference.
   * @see #setVariant(variant)
   * @see compilador.pascal.PascalPackage#getvariantPart_Variant()
   * @model containment="true"
   * @generated
   */
  variant getVariant();

  /**
   * Sets the value of the '{@link compilador.pascal.variantPart#getVariant <em>Variant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' containment reference.
   * @see #getVariant()
   * @generated
   */
  void setVariant(variant value);

  /**
   * Returns the value of the '<em><b>Variant1</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.variant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant1</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getvariantPart_Variant1()
   * @model containment="true"
   * @generated
   */
  EList<variant> getVariant1();

} // variantPart
