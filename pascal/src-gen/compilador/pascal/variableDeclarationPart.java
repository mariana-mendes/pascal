/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Declaration Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.variableDeclarationPart#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link compilador.pascal.variableDeclarationPart#getVariableDeclaration1 <em>Variable Declaration1</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getvariableDeclarationPart()
 * @model
 * @generated
 */
public interface variableDeclarationPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declaration</em>' containment reference.
   * @see #setVariableDeclaration(variableDeclaration)
   * @see compilador.pascal.PascalPackage#getvariableDeclarationPart_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  variableDeclaration getVariableDeclaration();

  /**
   * Sets the value of the '{@link compilador.pascal.variableDeclarationPart#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Declaration</em>' containment reference.
   * @see #getVariableDeclaration()
   * @generated
   */
  void setVariableDeclaration(variableDeclaration value);

  /**
   * Returns the value of the '<em><b>Variable Declaration1</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.variableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declaration1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declaration1</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getvariableDeclarationPart_VariableDeclaration1()
   * @model containment="true"
   * @generated
   */
  EList<variableDeclaration> getVariableDeclaration1();

} // variableDeclarationPart
