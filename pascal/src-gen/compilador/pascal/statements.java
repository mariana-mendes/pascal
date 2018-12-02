/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.statements#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#getstatements()
 * @model
 * @generated
 */
public interface statements extends compoundStatement
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