/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.expression;
import compilador.pascal.simpleExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.expressionImpl#getSimpleExpression <em>Simple Expression</em>}</li>
 *   <li>{@link compilador.pascal.impl.expressionImpl#getRelationaloperator <em>Relationaloperator</em>}</li>
 *   <li>{@link compilador.pascal.impl.expressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expressionImpl extends MinimalEObjectImpl.Container implements expression
{
  /**
   * The cached value of the '{@link #getSimpleExpression() <em>Simple Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleExpression()
   * @generated
   * @ordered
   */
  protected simpleExpression simpleExpression;

  /**
   * The default value of the '{@link #getRelationaloperator() <em>Relationaloperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationaloperator()
   * @generated
   * @ordered
   */
  protected static final String RELATIONALOPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelationaloperator() <em>Relationaloperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationaloperator()
   * @generated
   * @ordered
   */
  protected String relationaloperator = RELATIONALOPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expressionImpl()
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
    return PascalPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simpleExpression getSimpleExpression()
  {
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleExpression(simpleExpression newSimpleExpression, NotificationChain msgs)
  {
    simpleExpression oldSimpleExpression = simpleExpression;
    simpleExpression = newSimpleExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.EXPRESSION__SIMPLE_EXPRESSION, oldSimpleExpression, newSimpleExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleExpression(simpleExpression newSimpleExpression)
  {
    if (newSimpleExpression != simpleExpression)
    {
      NotificationChain msgs = null;
      if (simpleExpression != null)
        msgs = ((InternalEObject)simpleExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.EXPRESSION__SIMPLE_EXPRESSION, null, msgs);
      if (newSimpleExpression != null)
        msgs = ((InternalEObject)newSimpleExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.EXPRESSION__SIMPLE_EXPRESSION, null, msgs);
      msgs = basicSetSimpleExpression(newSimpleExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.EXPRESSION__SIMPLE_EXPRESSION, newSimpleExpression, newSimpleExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelationaloperator()
  {
    return relationaloperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationaloperator(String newRelationaloperator)
  {
    String oldRelationaloperator = relationaloperator;
    relationaloperator = newRelationaloperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.EXPRESSION__RELATIONALOPERATOR, oldRelationaloperator, relationaloperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.EXPRESSION__EXPRESSION, newExpression, newExpression));
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSION:
        return basicSetSimpleExpression(null, msgs);
      case PascalPackage.EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSION:
        return getSimpleExpression();
      case PascalPackage.EXPRESSION__RELATIONALOPERATOR:
        return getRelationaloperator();
      case PascalPackage.EXPRESSION__EXPRESSION:
        return getExpression();
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSION:
        setSimpleExpression((simpleExpression)newValue);
        return;
      case PascalPackage.EXPRESSION__RELATIONALOPERATOR:
        setRelationaloperator((String)newValue);
        return;
      case PascalPackage.EXPRESSION__EXPRESSION:
        setExpression((expression)newValue);
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSION:
        setSimpleExpression((simpleExpression)null);
        return;
      case PascalPackage.EXPRESSION__RELATIONALOPERATOR:
        setRelationaloperator(RELATIONALOPERATOR_EDEFAULT);
        return;
      case PascalPackage.EXPRESSION__EXPRESSION:
        setExpression((expression)null);
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSION:
        return simpleExpression != null;
      case PascalPackage.EXPRESSION__RELATIONALOPERATOR:
        return RELATIONALOPERATOR_EDEFAULT == null ? relationaloperator != null : !RELATIONALOPERATOR_EDEFAULT.equals(relationaloperator);
      case PascalPackage.EXPRESSION__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (relationaloperator: ");
    result.append(relationaloperator);
    result.append(')');
    return result.toString();
  }

} //expressionImpl