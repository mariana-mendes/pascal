/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.scalarType;
import compilador.pascal.simpleType;
import compilador.pascal.stringtype;
import compilador.pascal.subrangeType;
import compilador.pascal.typeIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.simpleTypeImpl#getScalarType <em>Scalar Type</em>}</li>
 *   <li>{@link compilador.pascal.impl.simpleTypeImpl#getSubrangeType <em>Subrange Type</em>}</li>
 *   <li>{@link compilador.pascal.impl.simpleTypeImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link compilador.pascal.impl.simpleTypeImpl#getStringtype <em>Stringtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simpleTypeImpl extends MinimalEObjectImpl.Container implements simpleType
{
  /**
   * The cached value of the '{@link #getScalarType() <em>Scalar Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScalarType()
   * @generated
   * @ordered
   */
  protected scalarType scalarType;

  /**
   * The cached value of the '{@link #getSubrangeType() <em>Subrange Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubrangeType()
   * @generated
   * @ordered
   */
  protected subrangeType subrangeType;

  /**
   * The cached value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeIdentifier()
   * @generated
   * @ordered
   */
  protected typeIdentifier typeIdentifier;

  /**
   * The cached value of the '{@link #getStringtype() <em>Stringtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringtype()
   * @generated
   * @ordered
   */
  protected stringtype stringtype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simpleTypeImpl()
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
    return PascalPackage.Literals.SIMPLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scalarType getScalarType()
  {
    return scalarType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScalarType(scalarType newScalarType, NotificationChain msgs)
  {
    scalarType oldScalarType = scalarType;
    scalarType = newScalarType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SCALAR_TYPE, oldScalarType, newScalarType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScalarType(scalarType newScalarType)
  {
    if (newScalarType != scalarType)
    {
      NotificationChain msgs = null;
      if (scalarType != null)
        msgs = ((InternalEObject)scalarType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SCALAR_TYPE, null, msgs);
      if (newScalarType != null)
        msgs = ((InternalEObject)newScalarType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SCALAR_TYPE, null, msgs);
      msgs = basicSetScalarType(newScalarType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SCALAR_TYPE, newScalarType, newScalarType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subrangeType getSubrangeType()
  {
    return subrangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubrangeType(subrangeType newSubrangeType, NotificationChain msgs)
  {
    subrangeType oldSubrangeType = subrangeType;
    subrangeType = newSubrangeType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, oldSubrangeType, newSubrangeType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubrangeType(subrangeType newSubrangeType)
  {
    if (newSubrangeType != subrangeType)
    {
      NotificationChain msgs = null;
      if (subrangeType != null)
        msgs = ((InternalEObject)subrangeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, null, msgs);
      if (newSubrangeType != null)
        msgs = ((InternalEObject)newSubrangeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, null, msgs);
      msgs = basicSetSubrangeType(newSubrangeType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, newSubrangeType, newSubrangeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeIdentifier getTypeIdentifier()
  {
    return typeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeIdentifier(typeIdentifier newTypeIdentifier, NotificationChain msgs)
  {
    typeIdentifier oldTypeIdentifier = typeIdentifier;
    typeIdentifier = newTypeIdentifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER, oldTypeIdentifier, newTypeIdentifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeIdentifier(typeIdentifier newTypeIdentifier)
  {
    if (newTypeIdentifier != typeIdentifier)
    {
      NotificationChain msgs = null;
      if (typeIdentifier != null)
        msgs = ((InternalEObject)typeIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER, null, msgs);
      if (newTypeIdentifier != null)
        msgs = ((InternalEObject)newTypeIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetTypeIdentifier(newTypeIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER, newTypeIdentifier, newTypeIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stringtype getStringtype()
  {
    return stringtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStringtype(stringtype newStringtype, NotificationChain msgs)
  {
    stringtype oldStringtype = stringtype;
    stringtype = newStringtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__STRINGTYPE, oldStringtype, newStringtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringtype(stringtype newStringtype)
  {
    if (newStringtype != stringtype)
    {
      NotificationChain msgs = null;
      if (stringtype != null)
        msgs = ((InternalEObject)stringtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__STRINGTYPE, null, msgs);
      if (newStringtype != null)
        msgs = ((InternalEObject)newStringtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__STRINGTYPE, null, msgs);
      msgs = basicSetStringtype(newStringtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__STRINGTYPE, newStringtype, newStringtype));
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
      case PascalPackage.SIMPLE_TYPE__SCALAR_TYPE:
        return basicSetScalarType(null, msgs);
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return basicSetSubrangeType(null, msgs);
      case PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER:
        return basicSetTypeIdentifier(null, msgs);
      case PascalPackage.SIMPLE_TYPE__STRINGTYPE:
        return basicSetStringtype(null, msgs);
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
      case PascalPackage.SIMPLE_TYPE__SCALAR_TYPE:
        return getScalarType();
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return getSubrangeType();
      case PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER:
        return getTypeIdentifier();
      case PascalPackage.SIMPLE_TYPE__STRINGTYPE:
        return getStringtype();
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
      case PascalPackage.SIMPLE_TYPE__SCALAR_TYPE:
        setScalarType((scalarType)newValue);
        return;
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        setSubrangeType((subrangeType)newValue);
        return;
      case PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER:
        setTypeIdentifier((typeIdentifier)newValue);
        return;
      case PascalPackage.SIMPLE_TYPE__STRINGTYPE:
        setStringtype((stringtype)newValue);
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
      case PascalPackage.SIMPLE_TYPE__SCALAR_TYPE:
        setScalarType((scalarType)null);
        return;
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        setSubrangeType((subrangeType)null);
        return;
      case PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER:
        setTypeIdentifier((typeIdentifier)null);
        return;
      case PascalPackage.SIMPLE_TYPE__STRINGTYPE:
        setStringtype((stringtype)null);
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
      case PascalPackage.SIMPLE_TYPE__SCALAR_TYPE:
        return scalarType != null;
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return subrangeType != null;
      case PascalPackage.SIMPLE_TYPE__TYPE_IDENTIFIER:
        return typeIdentifier != null;
      case PascalPackage.SIMPLE_TYPE__STRINGTYPE:
        return stringtype != null;
    }
    return super.eIsSet(featureID);
  }

} //simpleTypeImpl