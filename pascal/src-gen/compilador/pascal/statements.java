/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.statements#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getstatements()
 * @model
 * @generated
 */
public interface statements extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getstatements_Statement()
   * @model containment="true"
   * @generated
   */
  EList<statement> getStatement();

} // statements
