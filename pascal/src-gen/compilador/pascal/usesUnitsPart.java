/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uses Units Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.usesUnitsPart#getIdentifierList <em>Identifier List</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#getusesUnitsPart()
 * @model
 * @generated
 */
public interface usesUnitsPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' containment reference.
   * @see #setIdentifierList(identifierList)
   * @see compilador.pascal.PascalPackage#getusesUnitsPart_IdentifierList()
   * @model containment="true"
   * @generated
   */
  identifierList getIdentifierList();

  /**
   * Sets the value of the '{@link compilador.pascal.usesUnitsPart#getIdentifierList <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' containment reference.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(identifierList value);

} // usesUnitsPart
