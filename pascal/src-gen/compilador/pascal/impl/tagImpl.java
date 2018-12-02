/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.tag;
import compilador.pascal.typeIdentifier;

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
 * An implementation of the model object '<em><b>tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.tagImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link compilador.pascal.impl.tagImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link compilador.pascal.impl.tagImpl#getTypeIdentifier1 <em>Type Identifier1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class tagImpl extends MinimalEObjectImpl.Container implements tag
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

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
   * The cached value of the '{@link #getTypeIdentifier1() <em>Type Identifier1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeIdentifier1()
   * @generated
   * @ordered
   */
  protected EList<typeIdentifier> typeIdentifier1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected tagImpl()
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
    return PascalPackage.Literals.TAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TAG__IDENTIFIER, oldIdentifier, identifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TAG__TYPE_IDENTIFIER, oldTypeIdentifier, newTypeIdentifier);
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
        msgs = ((InternalEObject)typeIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TAG__TYPE_IDENTIFIER, null, msgs);
      if (newTypeIdentifier != null)
        msgs = ((InternalEObject)newTypeIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TAG__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetTypeIdentifier(newTypeIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TAG__TYPE_IDENTIFIER, newTypeIdentifier, newTypeIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<typeIdentifier> getTypeIdentifier1()
  {
    if (typeIdentifier1 == null)
    {
      typeIdentifier1 = new EObjectContainmentEList<typeIdentifier>(typeIdentifier.class, this, PascalPackage.TAG__TYPE_IDENTIFIER1);
    }
    return typeIdentifier1;
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
      case PascalPackage.TAG__TYPE_IDENTIFIER:
        return basicSetTypeIdentifier(null, msgs);
      case PascalPackage.TAG__TYPE_IDENTIFIER1:
        return ((InternalEList<?>)getTypeIdentifier1()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.TAG__IDENTIFIER:
        return getIdentifier();
      case PascalPackage.TAG__TYPE_IDENTIFIER:
        return getTypeIdentifier();
      case PascalPackage.TAG__TYPE_IDENTIFIER1:
        return getTypeIdentifier1();
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
      case PascalPackage.TAG__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case PascalPackage.TAG__TYPE_IDENTIFIER:
        setTypeIdentifier((typeIdentifier)newValue);
        return;
      case PascalPackage.TAG__TYPE_IDENTIFIER1:
        getTypeIdentifier1().clear();
        getTypeIdentifier1().addAll((Collection<? extends typeIdentifier>)newValue);
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
      case PascalPackage.TAG__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case PascalPackage.TAG__TYPE_IDENTIFIER:
        setTypeIdentifier((typeIdentifier)null);
        return;
      case PascalPackage.TAG__TYPE_IDENTIFIER1:
        getTypeIdentifier1().clear();
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
      case PascalPackage.TAG__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case PascalPackage.TAG__TYPE_IDENTIFIER:
        return typeIdentifier != null;
      case PascalPackage.TAG__TYPE_IDENTIFIER1:
        return typeIdentifier1 != null && !typeIdentifier1.isEmpty();
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //tagImpl
