/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.simpleExpression;
import compilador.pascal.term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.simpleExpressionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link compilador.pascal.impl.simpleExpressionImpl#getAdditiveoperator <em>Additiveoperator</em>}</li>
 *   <li>{@link compilador.pascal.impl.simpleExpressionImpl#getSimpleExpression <em>Simple Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simpleExpressionImpl extends MinimalEObjectImpl.Container implements simpleExpression
{
  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected term term;

  /**
   * The default value of the '{@link #getAdditiveoperator() <em>Additiveoperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditiveoperator()
   * @generated
   * @ordered
   */
  protected static final String ADDITIVEOPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdditiveoperator() <em>Additiveoperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditiveoperator()
   * @generated
   * @ordered
   */
  protected String additiveoperator = ADDITIVEOPERATOR_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simpleExpressionImpl()
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
    return PascalPackage.Literals.SIMPLE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(term newTerm, NotificationChain msgs)
  {
    term oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(term newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_EXPRESSION__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_EXPRESSION__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdditiveoperator()
  {
    return additiveoperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdditiveoperator(String newAdditiveoperator)
  {
    String oldAdditiveoperator = additiveoperator;
    additiveoperator = newAdditiveoperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__ADDITIVEOPERATOR, oldAdditiveoperator, additiveoperator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION, oldSimpleExpression, newSimpleExpression);
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
        msgs = ((InternalEObject)simpleExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION, null, msgs);
      if (newSimpleExpression != null)
        msgs = ((InternalEObject)newSimpleExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION, null, msgs);
      msgs = basicSetSimpleExpression(newSimpleExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION, newSimpleExpression, newSimpleExpression));
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        return basicSetTerm(null, msgs);
      case PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION:
        return basicSetSimpleExpression(null, msgs);
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        return getTerm();
      case PascalPackage.SIMPLE_EXPRESSION__ADDITIVEOPERATOR:
        return getAdditiveoperator();
      case PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION:
        return getSimpleExpression();
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        setTerm((term)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__ADDITIVEOPERATOR:
        setAdditiveoperator((String)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION:
        setSimpleExpression((simpleExpression)newValue);
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        setTerm((term)null);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__ADDITIVEOPERATOR:
        setAdditiveoperator(ADDITIVEOPERATOR_EDEFAULT);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION:
        setSimpleExpression((simpleExpression)null);
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        return term != null;
      case PascalPackage.SIMPLE_EXPRESSION__ADDITIVEOPERATOR:
        return ADDITIVEOPERATOR_EDEFAULT == null ? additiveoperator != null : !ADDITIVEOPERATOR_EDEFAULT.equals(additiveoperator);
      case PascalPackage.SIMPLE_EXPRESSION__SIMPLE_EXPRESSION:
        return simpleExpression != null;
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
    result.append(" (additiveoperator: ");
    result.append(additiveoperator);
    result.append(')');
    return result.toString();
  }

} //simpleExpressionImpl
