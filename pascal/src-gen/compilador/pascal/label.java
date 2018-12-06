/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.label#getLabel <em>Label</em>}</li>
 *   <li>{@link compilador.pascal.label#getUnsignedInteger <em>Unsigned Integer</em>}</li>
 *   <li>{@link compilador.pascal.label#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getlabel()
 * @model
 * @generated
 */
public interface label extends label_declaration_part, statement
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getlabel_Label()
   * @model containment="true"
   * @generated
   */
  EList<label> getLabel();

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
   * @see compilador.pascal.PascalPackage#getlabel_UnsignedInteger()
   * @model containment="true"
   * @generated
   */
  unsignedInteger getUnsignedInteger();

  /**
   * Sets the value of the '{@link compilador.pascal.label#getUnsignedInteger <em>Unsigned Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned Integer</em>' containment reference.
   * @see #getUnsignedInteger()
   * @generated
   */
  void setUnsignedInteger(unsignedInteger value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(identifier)
   * @see compilador.pascal.PascalPackage#getlabel_Identifier()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier();

  /**
   * Sets the value of the '{@link compilador.pascal.label#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(identifier value);

} // label
