/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.structuredType;
import compilador.pascal.unpackedStructuredType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>structured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.structuredTypeImpl#getUnpackedStructuredType <em>Unpacked Structured Type</em>}</li>
 *   <li>{@link compilador.pascal.impl.structuredTypeImpl#getUnpackedStructuredType1 <em>Unpacked Structured Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class structuredTypeImpl extends MinimalEObjectImpl.Container implements structuredType
{
  /**
   * The cached value of the '{@link #getUnpackedStructuredType() <em>Unpacked Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnpackedStructuredType()
   * @generated
   * @ordered
   */
  protected unpackedStructuredType unpackedStructuredType;

  /**
   * The cached value of the '{@link #getUnpackedStructuredType1() <em>Unpacked Structured Type1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnpackedStructuredType1()
   * @generated
   * @ordered
   */
  protected EList<unpackedStructuredType> unpackedStructuredType1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structuredTypeImpl()
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
    return PascalPackage.Literals.STRUCTURED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpackedStructuredType getUnpackedStructuredType()
  {
    return unpackedStructuredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnpackedStructuredType(unpackedStructuredType newUnpackedStructuredType, NotificationChain msgs)
  {
    unpackedStructuredType oldUnpackedStructuredType = unpackedStructuredType;
    unpackedStructuredType = newUnpackedStructuredType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, oldUnpackedStructuredType, newUnpackedStructuredType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnpackedStructuredType(unpackedStructuredType newUnpackedStructuredType)
  {
    if (newUnpackedStructuredType != unpackedStructuredType)
    {
      NotificationChain msgs = null;
      if (unpackedStructuredType != null)
        msgs = ((InternalEObject)unpackedStructuredType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, null, msgs);
      if (newUnpackedStructuredType != null)
        msgs = ((InternalEObject)newUnpackedStructuredType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, null, msgs);
      msgs = basicSetUnpackedStructuredType(newUnpackedStructuredType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, newUnpackedStructuredType, newUnpackedStructuredType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<unpackedStructuredType> getUnpackedStructuredType1()
  {
    if (unpackedStructuredType1 == null)
    {
      unpackedStructuredType1 = new EObjectContainmentEList<unpackedStructuredType>(unpackedStructuredType.class, this, PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE1);
    }
    return unpackedStructuredType1;
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return basicSetUnpackedStructuredType(null, msgs);
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE1:
        return ((InternalEList<?>)getUnpackedStructuredType1()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return getUnpackedStructuredType();
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE1:
        return getUnpackedStructuredType1();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        setUnpackedStructuredType((unpackedStructuredType)newValue);
        return;
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE1:
        getUnpackedStructuredType1().clear();
        getUnpackedStructuredType1().addAll((Collection<? extends unpackedStructuredType>)newValue);
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        setUnpackedStructuredType((unpackedStructuredType)null);
        return;
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE1:
        getUnpackedStructuredType1().clear();
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return unpackedStructuredType != null;
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE1:
        return unpackedStructuredType1 != null && !unpackedStructuredType1.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //structuredTypeImpl
