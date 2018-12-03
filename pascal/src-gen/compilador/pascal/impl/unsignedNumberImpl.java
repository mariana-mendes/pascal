/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.unsignedInteger;
import compilador.pascal.unsignedNumber;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unsigned Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.impl.unsignedNumberImpl#getUnsignedInteger <em>Unsigned Integer</em>}</li>
 *   <li>{@link compilador.pascal.impl.unsignedNumberImpl#getUnsignedReal <em>Unsigned Real</em>}</li>
 * </ul>
 *
 * @generated
 */
public class unsignedNumberImpl extends MinimalEObjectImpl.Container implements unsignedNumber
{
  /**
   * The cached value of the '{@link #getUnsignedInteger() <em>Unsigned Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsignedInteger()
   * @generated
   * @ordered
   */
  protected unsignedInteger unsignedInteger;

  /**
   * The default value of the '{@link #getUnsignedReal() <em>Unsigned Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsignedReal()
   * @generated
   * @ordered
   */
  protected static final String UNSIGNED_REAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnsignedReal() <em>Unsigned Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsignedReal()
   * @generated
   * @ordered
   */
  protected String unsignedReal = UNSIGNED_REAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unsignedNumberImpl()
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
    return PascalPackage.Literals.UNSIGNED_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedInteger getUnsignedInteger()
  {
    return unsignedInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnsignedInteger(unsignedInteger newUnsignedInteger, NotificationChain msgs)
  {
    unsignedInteger oldUnsignedInteger = unsignedInteger;
    unsignedInteger = newUnsignedInteger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER, oldUnsignedInteger, newUnsignedInteger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsignedInteger(unsignedInteger newUnsignedInteger)
  {
    if (newUnsignedInteger != unsignedInteger)
    {
      NotificationChain msgs = null;
      if (unsignedInteger != null)
        msgs = ((InternalEObject)unsignedInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER, null, msgs);
      if (newUnsignedInteger != null)
        msgs = ((InternalEObject)newUnsignedInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER, null, msgs);
      msgs = basicSetUnsignedInteger(newUnsignedInteger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER, newUnsignedInteger, newUnsignedInteger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnsignedReal()
  {
    return unsignedReal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsignedReal(String newUnsignedReal)
  {
    String oldUnsignedReal = unsignedReal;
    unsignedReal = newUnsignedReal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL, oldUnsignedReal, unsignedReal));
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        return basicSetUnsignedInteger(null, msgs);
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        return getUnsignedInteger();
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        return getUnsignedReal();
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        setUnsignedInteger((unsignedInteger)newValue);
        return;
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        setUnsignedReal((String)newValue);
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        setUnsignedInteger((unsignedInteger)null);
        return;
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        setUnsignedReal(UNSIGNED_REAL_EDEFAULT);
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        return unsignedInteger != null;
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        return UNSIGNED_REAL_EDEFAULT == null ? unsignedReal != null : !UNSIGNED_REAL_EDEFAULT.equals(unsignedReal);
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
    result.append(" (unsignedReal: ");
    result.append(unsignedReal);
    result.append(')');
    return result.toString();
  }

} //unsignedNumberImpl
