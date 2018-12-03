/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.recordType;
import compilador.pascal.unpackedStructuredType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unpacked Structured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.impl.unpackedStructuredTypeImpl#getRecordType <em>Record Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class unpackedStructuredTypeImpl extends MinimalEObjectImpl.Container implements unpackedStructuredType
{
  /**
   * The cached value of the '{@link #getRecordType() <em>Record Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordType()
   * @generated
   * @ordered
   */
  protected recordType recordType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unpackedStructuredTypeImpl()
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
    return PascalPackage.Literals.UNPACKED_STRUCTURED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public recordType getRecordType()
  {
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordType(recordType newRecordType, NotificationChain msgs)
  {
    recordType oldRecordType = recordType;
    recordType = newRecordType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE, oldRecordType, newRecordType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordType(recordType newRecordType)
  {
    if (newRecordType != recordType)
    {
      NotificationChain msgs = null;
      if (recordType != null)
        msgs = ((InternalEObject)recordType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE, null, msgs);
      if (newRecordType != null)
        msgs = ((InternalEObject)newRecordType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE, null, msgs);
      msgs = basicSetRecordType(newRecordType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE, newRecordType, newRecordType));
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        return basicSetRecordType(null, msgs);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        return getRecordType();
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        setRecordType((recordType)newValue);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        setRecordType((recordType)null);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        return recordType != null;
    }
    return super.eIsSet(featureID);
  }

} //unpackedStructuredTypeImpl
