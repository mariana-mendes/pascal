/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.statement;
import compilador.pascal.unlabelledStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.statementImpl#getUnlabelledStatement <em>Unlabelled Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statementImpl extends MinimalEObjectImpl.Container implements statement
{
  /**
   * The cached value of the '{@link #getUnlabelledStatement() <em>Unlabelled Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnlabelledStatement()
   * @generated
   * @ordered
   */
  protected unlabelledStatement unlabelledStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statementImpl()
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
    return PascalPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unlabelledStatement getUnlabelledStatement()
  {
    return unlabelledStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnlabelledStatement(unlabelledStatement newUnlabelledStatement, NotificationChain msgs)
  {
    unlabelledStatement oldUnlabelledStatement = unlabelledStatement;
    unlabelledStatement = newUnlabelledStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__UNLABELLED_STATEMENT, oldUnlabelledStatement, newUnlabelledStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnlabelledStatement(unlabelledStatement newUnlabelledStatement)
  {
    if (newUnlabelledStatement != unlabelledStatement)
    {
      NotificationChain msgs = null;
      if (unlabelledStatement != null)
        msgs = ((InternalEObject)unlabelledStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__UNLABELLED_STATEMENT, null, msgs);
      if (newUnlabelledStatement != null)
        msgs = ((InternalEObject)newUnlabelledStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__UNLABELLED_STATEMENT, null, msgs);
      msgs = basicSetUnlabelledStatement(newUnlabelledStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__UNLABELLED_STATEMENT, newUnlabelledStatement, newUnlabelledStatement));
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
      case PascalPackage.STATEMENT__UNLABELLED_STATEMENT:
        return basicSetUnlabelledStatement(null, msgs);
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
      case PascalPackage.STATEMENT__UNLABELLED_STATEMENT:
        return getUnlabelledStatement();
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
      case PascalPackage.STATEMENT__UNLABELLED_STATEMENT:
        setUnlabelledStatement((unlabelledStatement)newValue);
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
      case PascalPackage.STATEMENT__UNLABELLED_STATEMENT:
        setUnlabelledStatement((unlabelledStatement)null);
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
      case PascalPackage.STATEMENT__UNLABELLED_STATEMENT:
        return unlabelledStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //statementImpl