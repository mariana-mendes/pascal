/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.identifier;
import compilador.pascal.identifierList;
import compilador.pascal.programHeading;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>program Heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.programHeadingImpl#getIdentifer <em>Identifer</em>}</li>
 *   <li>{@link compilador.pascal.impl.programHeadingImpl#getIdentifierList <em>Identifier List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class programHeadingImpl extends MinimalEObjectImpl.Container implements programHeading
{
  /**
   * The cached value of the '{@link #getIdentifer() <em>Identifer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifer()
   * @generated
   * @ordered
   */
  protected identifier identifer;

  /**
   * The cached value of the '{@link #getIdentifierList() <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierList()
   * @generated
   * @ordered
   */
  protected identifierList identifierList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected programHeadingImpl()
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
    return PascalPackage.Literals.PROGRAM_HEADING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getIdentifer()
  {
    return identifer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifer(identifier newIdentifer, NotificationChain msgs)
  {
    identifier oldIdentifer = identifer;
    identifer = newIdentifer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM_HEADING__IDENTIFER, oldIdentifer, newIdentifer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifer(identifier newIdentifer)
  {
    if (newIdentifer != identifer)
    {
      NotificationChain msgs = null;
      if (identifer != null)
        msgs = ((InternalEObject)identifer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM_HEADING__IDENTIFER, null, msgs);
      if (newIdentifer != null)
        msgs = ((InternalEObject)newIdentifer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM_HEADING__IDENTIFER, null, msgs);
      msgs = basicSetIdentifer(newIdentifer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM_HEADING__IDENTIFER, newIdentifer, newIdentifer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifierList getIdentifierList()
  {
    return identifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifierList(identifierList newIdentifierList, NotificationChain msgs)
  {
    identifierList oldIdentifierList = identifierList;
    identifierList = newIdentifierList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST, oldIdentifierList, newIdentifierList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifierList(identifierList newIdentifierList)
  {
    if (newIdentifierList != identifierList)
    {
      NotificationChain msgs = null;
      if (identifierList != null)
        msgs = ((InternalEObject)identifierList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST, null, msgs);
      if (newIdentifierList != null)
        msgs = ((InternalEObject)newIdentifierList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifierList(newIdentifierList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST, newIdentifierList, newIdentifierList));
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFER:
        return basicSetIdentifer(null, msgs);
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        return basicSetIdentifierList(null, msgs);
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFER:
        return getIdentifer();
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        return getIdentifierList();
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFER:
        setIdentifer((identifier)newValue);
        return;
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        setIdentifierList((identifierList)newValue);
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFER:
        setIdentifer((identifier)null);
        return;
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        setIdentifierList((identifierList)null);
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFER:
        return identifer != null;
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        return identifierList != null;
    }
    return super.eIsSet(featureID);
  }

} //programHeadingImpl
