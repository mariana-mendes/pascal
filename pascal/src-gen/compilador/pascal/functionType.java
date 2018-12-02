/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.functionType#getFormalParameterList <em>Formal Parameter List</em>}</li>
 *   <li>{@link compilador.pascal.functionType#getResultType <em>Result Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#getfunctionType()
 * @model
 * @generated
 */
public interface functionType extends EObject
{
  /**
   * Returns the value of the '<em><b>Formal Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Parameter List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Parameter List</em>' containment reference.
   * @see #setFormalParameterList(formalParameterList)
   * @see compilador.pascal.PascalPackage#getfunctionType_FormalParameterList()
   * @model containment="true"
   * @generated
   */
  formalParameterList getFormalParameterList();

  /**
   * Sets the value of the '{@link compilador.pascal.functionType#getFormalParameterList <em>Formal Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Parameter List</em>' containment reference.
   * @see #getFormalParameterList()
   * @generated
   */
  void setFormalParameterList(formalParameterList value);

  /**
   * Returns the value of the '<em><b>Result Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Type</em>' containment reference.
   * @see #setResultType(resultType)
   * @see compilador.pascal.PascalPackage#getfunctionType_ResultType()
   * @model containment="true"
   * @generated
   */
  resultType getResultType();

  /**
   * Sets the value of the '{@link compilador.pascal.functionType#getResultType <em>Result Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Type</em>' containment reference.
   * @see #getResultType()
   * @generated
   */
  void setResultType(resultType value);

} // functionType
