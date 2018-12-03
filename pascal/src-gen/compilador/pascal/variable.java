/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.variable#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link compilador.pascal.variable#getExpression <em>Expression</em>}</li>
 *   <li>{@link compilador.pascal.variable#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link compilador.pascal.variable#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link compilador.pascal.variable#getExpression3 <em>Expression3</em>}</li>
 *   <li>{@link compilador.pascal.variable#getIdentifier2 <em>Identifier2</em>}</li>
 * </ul>
 *
 * @see compilador.pascal.PascalPackage#getvariable()
 * @model
 * @generated
 */
public interface variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see compilador.pascal.PascalPackage#getvariable_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link compilador.pascal.variable#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getvariable_Expression()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpression();

  /**
   * Returns the value of the '<em><b>Expression1</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression1</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getvariable_Expression1()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpression1();

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getvariable_Expression2()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpression2();

  /**
   * Returns the value of the '<em><b>Expression3</b></em>' containment reference list.
   * The list contents are of type {@link compilador.pascal.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression3</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression3</em>' containment reference list.
   * @see compilador.pascal.PascalPackage#getvariable_Expression3()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpression3();

  /**
   * Returns the value of the '<em><b>Identifier2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier2</em>' attribute list.
   * @see compilador.pascal.PascalPackage#getvariable_Identifier2()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdentifier2();

} // variable
