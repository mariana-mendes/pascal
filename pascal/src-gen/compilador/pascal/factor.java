/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compilador.pascal.factor#getExpression <em>Expression</em>}</li>
 *   <li>{@link compilador.pascal.factor#getUnsignedConstant <em>Unsigned Constant</em>}</li>
 *   <li>{@link compilador.pascal.factor#getFactor <em>Factor</em>}</li>
 *   <li>{@link compilador.pascal.factor#getBool <em>Bool</em>}</li>
 *   <li>{@link compilador.pascal.factor#getFunctionDesignator <em>Function Designator</em>}</li>
 *   <li>{@link compilador.pascal.factor#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see compilador.pascal.PascalPackage#getfactor()
 * @model
 * @generated
 */
public interface factor extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see compilador.pascal.PascalPackage#getfactor_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link compilador.pascal.factor#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

  /**
   * Returns the value of the '<em><b>Unsigned Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsigned Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsigned Constant</em>' containment reference.
   * @see #setUnsignedConstant(unsignedConstant)
   * @see compilador.pascal.PascalPackage#getfactor_UnsignedConstant()
   * @model containment="true"
   * @generated
   */
  unsignedConstant getUnsignedConstant();

  /**
   * Sets the value of the '{@link compilador.pascal.factor#getUnsignedConstant <em>Unsigned Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned Constant</em>' containment reference.
   * @see #getUnsignedConstant()
   * @generated
   */
  void setUnsignedConstant(unsignedConstant value);

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
   * @see compilador.pascal.PascalPackage#getfactor_Factor()
   * @model containment="true"
   * @generated
   */
  factor getFactor();

  /**
   * Sets the value of the '{@link compilador.pascal.factor#getFactor <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' containment reference.
   * @see #getFactor()
   * @generated
   */
  void setFactor(factor value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see #setBool(String)
   * @see compilador.pascal.PascalPackage#getfactor_Bool()
   * @model
   * @generated
   */
  String getBool();

  /**
   * Sets the value of the '{@link compilador.pascal.factor#getBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see #getBool()
   * @generated
   */
  void setBool(String value);

  /**
   * Returns the value of the '<em><b>Function Designator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Designator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Designator</em>' containment reference.
   * @see #setFunctionDesignator(functionDesignator)
   * @see compilador.pascal.PascalPackage#getfactor_FunctionDesignator()
   * @model containment="true"
   * @generated
   */
  functionDesignator getFunctionDesignator();

  /**
   * Sets the value of the '{@link compilador.pascal.factor#getFunctionDesignator <em>Function Designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Designator</em>' containment reference.
   * @see #getFunctionDesignator()
   * @generated
   */
  void setFunctionDesignator(functionDesignator value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(variable)
   * @see compilador.pascal.PascalPackage#getfactor_Variable()
   * @model containment="true"
   * @generated
   */
  variable getVariable();

  /**
   * Sets the value of the '{@link compilador.pascal.factor#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(variable value);

} // factor
