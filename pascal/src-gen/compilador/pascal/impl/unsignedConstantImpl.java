/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.constantChr;
import compilador.pascal.unsignedConstant;
import compilador.pascal.unsignedNumber;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unsigned Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.unsignedConstantImpl#getUnsignedNumber <em>Unsigned Number</em>}</li>
 *   <li>{@link compilador.pascal.impl.unsignedConstantImpl#getString_literal <em>String literal</em>}</li>
 *   <li>{@link compilador.pascal.impl.unsignedConstantImpl#getConstantChr <em>Constant Chr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unsignedConstantImpl extends MinimalEObjectImpl.Container implements unsignedConstant
{
  /**
   * The cached value of the '{@link #getUnsignedNumber() <em>Unsigned Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsignedNumber()
   * @generated
   * @ordered
   */
  protected unsignedNumber unsignedNumber;

  /**
   * The default value of the '{@link #getString_literal() <em>String literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString_literal()
   * @generated
   * @ordered
   */
  protected static final String STRING_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString_literal() <em>String literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString_literal()
   * @generated
   * @ordered
   */
  protected String string_literal = STRING_LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstantChr() <em>Constant Chr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantChr()
   * @generated
   * @ordered
   */
  protected constantChr constantChr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unsignedConstantImpl()
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
    return PascalPackage.Literals.UNSIGNED_CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedNumber getUnsignedNumber()
  {
    return unsignedNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnsignedNumber(unsignedNumber newUnsignedNumber, NotificationChain msgs)
  {
    unsignedNumber oldUnsignedNumber = unsignedNumber;
    unsignedNumber = newUnsignedNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER, oldUnsignedNumber, newUnsignedNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsignedNumber(unsignedNumber newUnsignedNumber)
  {
    if (newUnsignedNumber != unsignedNumber)
    {
      NotificationChain msgs = null;
      if (unsignedNumber != null)
        msgs = ((InternalEObject)unsignedNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER, null, msgs);
      if (newUnsignedNumber != null)
        msgs = ((InternalEObject)newUnsignedNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER, null, msgs);
      msgs = basicSetUnsignedNumber(newUnsignedNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER, newUnsignedNumber, newUnsignedNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString_literal()
  {
    return string_literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString_literal(String newString_literal)
  {
    String oldString_literal = string_literal;
    string_literal = newString_literal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_CONSTANT__STRING_LITERAL, oldString_literal, string_literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constantChr getConstantChr()
  {
    return constantChr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstantChr(constantChr newConstantChr, NotificationChain msgs)
  {
    constantChr oldConstantChr = constantChr;
    constantChr = newConstantChr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR, oldConstantChr, newConstantChr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantChr(constantChr newConstantChr)
  {
    if (newConstantChr != constantChr)
    {
      NotificationChain msgs = null;
      if (constantChr != null)
        msgs = ((InternalEObject)constantChr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR, null, msgs);
      if (newConstantChr != null)
        msgs = ((InternalEObject)newConstantChr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR, null, msgs);
      msgs = basicSetConstantChr(newConstantChr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR, newConstantChr, newConstantChr));
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
      case PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER:
        return basicSetUnsignedNumber(null, msgs);
      case PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR:
        return basicSetConstantChr(null, msgs);
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
      case PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER:
        return getUnsignedNumber();
      case PascalPackage.UNSIGNED_CONSTANT__STRING_LITERAL:
        return getString_literal();
      case PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR:
        return getConstantChr();
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
      case PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER:
        setUnsignedNumber((unsignedNumber)newValue);
        return;
      case PascalPackage.UNSIGNED_CONSTANT__STRING_LITERAL:
        setString_literal((String)newValue);
        return;
      case PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR:
        setConstantChr((constantChr)newValue);
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
      case PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER:
        setUnsignedNumber((unsignedNumber)null);
        return;
      case PascalPackage.UNSIGNED_CONSTANT__STRING_LITERAL:
        setString_literal(STRING_LITERAL_EDEFAULT);
        return;
      case PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR:
        setConstantChr((constantChr)null);
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
      case PascalPackage.UNSIGNED_CONSTANT__UNSIGNED_NUMBER:
        return unsignedNumber != null;
      case PascalPackage.UNSIGNED_CONSTANT__STRING_LITERAL:
        return STRING_LITERAL_EDEFAULT == null ? string_literal != null : !STRING_LITERAL_EDEFAULT.equals(string_literal);
      case PascalPackage.UNSIGNED_CONSTANT__CONSTANT_CHR:
        return constantChr != null;
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
    result.append(" (string_literal: ");
    result.append(string_literal);
    result.append(')');
    return result.toString();
  }

} //unsignedConstantImpl
