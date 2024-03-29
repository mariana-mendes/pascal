/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.caseStatement;
import compilador.pascal.conditionalStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.impl.conditionalStatementImpl#getCaseStatement <em>Case Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class conditionalStatementImpl extends MinimalEObjectImpl.Container implements conditionalStatement
{
  /**
   * The cached value of the '{@link #getCaseStatement() <em>Case Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseStatement()
   * @generated
   * @ordered
   */
  protected caseStatement caseStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected conditionalStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.CONDITIONAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public caseStatement getCaseStatement()
  {
    return caseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseStatement(caseStatement newCaseStatement, NotificationChain msgs)
  {
    caseStatement oldCaseStatement = caseStatement;
    caseStatement = newCaseStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT, oldCaseStatement, newCaseStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseStatement(caseStatement newCaseStatement)
  {
    if (newCaseStatement != caseStatement)
    {
      NotificationChain msgs = null;
      if (caseStatement != null)
        msgs = ((InternalEObject)caseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT, null, msgs);
      if (newCaseStatement != null)
        msgs = ((InternalEObject)newCaseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT, null, msgs);
      msgs = basicSetCaseStatement(newCaseStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT, newCaseStatement, newCaseStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        return basicSetCaseStatement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        return getCaseStatement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        setCaseStatement((caseStatement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        setCaseStatement((caseStatement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        return caseStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //conditionalStatementImpl
