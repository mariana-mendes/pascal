/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>signed Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.signedFactor#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getsignedFactor()
 * @model
 * @generated
 */
public interface signedFactor extends EObject
{
  /**
   * Returns the value of the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' containment reference.
   * @see #setFactor(factor)
   * @see compilador.pascal.PascalPackage#getsignedFactor_Factor()
   * @model containment="true"
   * @generated
   */
  factor getFactor();

  /**
   * Sets the value of the '{@link compilador.pascal.signedFactor#getFactor <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' containment reference.
   * @see #getFactor()
   * @generated
   */
  void setFactor(factor value);

} // signedFactor
