/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.identifier;
import compilador.pascal.stringtype;
import compilador.pascal.unsignedNumber;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stringtype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.impl.stringtypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link compilador.pascal.impl.stringtypeImpl#getUnsignedNumber <em>Unsigned Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class stringtypeImpl extends MinimalEObjectImpl.Container implements stringtype
{
  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected identifier identifier;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stringtypeImpl()
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
    return PascalPackage.Literals.STRINGTYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier(identifier newIdentifier, NotificationChain msgs)
  {
    identifier oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRINGTYPE__IDENTIFIER, oldIdentifier, newIdentifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(identifier newIdentifier)
  {
    if (newIdentifier != identifier)
    {
      NotificationChain msgs = null;
      if (identifier != null)
        msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRINGTYPE__IDENTIFIER, null, msgs);
      if (newIdentifier != null)
        msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRINGTYPE__IDENTIFIER, null, msgs);
      msgs = basicSetIdentifier(newIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRINGTYPE__IDENTIFIER, newIdentifier, newIdentifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRINGTYPE__UNSIGNED_NUMBER, oldUnsignedNumber, newUnsignedNumber);
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
        msgs = ((InternalEObject)unsignedNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRINGTYPE__UNSIGNED_NUMBER, null, msgs);
      if (newUnsignedNumber != null)
        msgs = ((InternalEObject)newUnsignedNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRINGTYPE__UNSIGNED_NUMBER, null, msgs);
      msgs = basicSetUnsignedNumber(newUnsignedNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRINGTYPE__UNSIGNED_NUMBER, newUnsignedNumber, newUnsignedNumber));
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
      case PascalPackage.STRINGTYPE__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
      case PascalPackage.STRINGTYPE__UNSIGNED_NUMBER:
        return basicSetUnsignedNumber(null, msgs);
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
      case PascalPackage.STRINGTYPE__IDENTIFIER:
        return getIdentifier();
      case PascalPackage.STRINGTYPE__UNSIGNED_NUMBER:
        return getUnsignedNumber();
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
      case PascalPackage.STRINGTYPE__IDENTIFIER:
        setIdentifier((identifier)newValue);
        return;
      case PascalPackage.STRINGTYPE__UNSIGNED_NUMBER:
        setUnsignedNumber((unsignedNumber)newValue);
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
      case PascalPackage.STRINGTYPE__IDENTIFIER:
        setIdentifier((identifier)null);
        return;
      case PascalPackage.STRINGTYPE__UNSIGNED_NUMBER:
        setUnsignedNumber((unsignedNumber)null);
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
      case PascalPackage.STRINGTYPE__IDENTIFIER:
        return identifier != null;
      case PascalPackage.STRINGTYPE__UNSIGNED_NUMBER:
        return unsignedNumber != null;
    }
    return super.eIsSet(featureID);
  }

} //stringtypeImpl
