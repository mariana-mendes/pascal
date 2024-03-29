/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.block;
import compilador.pascal.formalParameterList;
import compilador.pascal.functionDeclaration;
import compilador.pascal.identifier;
import compilador.pascal.typeIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.impl.functionDeclarationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link compilador.pascal.impl.functionDeclarationImpl#getFormalParameterList <em>Formal Parameter List</em>}</li>
 *   <li>{@link compilador.pascal.impl.functionDeclarationImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link compilador.pascal.impl.functionDeclarationImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class functionDeclarationImpl extends MinimalEObjectImpl.Container implements functionDeclaration
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
   * The cached value of the '{@link #getFormalParameterList() <em>Formal Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalParameterList()
   * @generated
   * @ordered
   */
  protected formalParameterList formalParameterList;

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
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected block block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected functionDeclarationImpl()
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
    return PascalPackage.Literals.FUNCTION_DECLARATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DECLARATION__IDENTIFIER, oldIdentifier, newIdentifier);
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
        msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DECLARATION__IDENTIFIER, null, msgs);
      if (newIdentifier != null)
        msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DECLARATION__IDENTIFIER, null, msgs);
      msgs = basicSetIdentifier(newIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DECLARATION__IDENTIFIER, newIdentifier, newIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formalParameterList getFormalParameterList()
  {
    return formalParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalParameterList(formalParameterList newFormalParameterList, NotificationChain msgs)
  {
    formalParameterList oldFormalParameterList = formalParameterList;
    formalParameterList = newFormalParameterList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST, oldFormalParameterList, newFormalParameterList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalParameterList(formalParameterList newFormalParameterList)
  {
    if (newFormalParameterList != formalParameterList)
    {
      NotificationChain msgs = null;
      if (formalParameterList != null)
        msgs = ((InternalEObject)formalParameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST, null, msgs);
      if (newFormalParameterList != null)
        msgs = ((InternalEObject)newFormalParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST, null, msgs);
      msgs = basicSetFormalParameterList(newFormalParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST, newFormalParameterList, newFormalParameterList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER, oldTypeIdentifier, newTypeIdentifier);
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
        msgs = ((InternalEObject)typeIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER, null, msgs);
      if (newTypeIdentifier != null)
        msgs = ((InternalEObject)newTypeIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetTypeIdentifier(newTypeIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER, newTypeIdentifier, newTypeIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(block newBlock, NotificationChain msgs)
  {
    block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DECLARATION__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DECLARATION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DECLARATION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DECLARATION__BLOCK, newBlock, newBlock));
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
      case PascalPackage.FUNCTION_DECLARATION__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
      case PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST:
        return basicSetFormalParameterList(null, msgs);
      case PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER:
        return basicSetTypeIdentifier(null, msgs);
      case PascalPackage.FUNCTION_DECLARATION__BLOCK:
        return basicSetBlock(null, msgs);
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
      case PascalPackage.FUNCTION_DECLARATION__IDENTIFIER:
        return getIdentifier();
      case PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST:
        return getFormalParameterList();
      case PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER:
        return getTypeIdentifier();
      case PascalPackage.FUNCTION_DECLARATION__BLOCK:
        return getBlock();
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
      case PascalPackage.FUNCTION_DECLARATION__IDENTIFIER:
        setIdentifier((identifier)newValue);
        return;
      case PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST:
        setFormalParameterList((formalParameterList)newValue);
        return;
      case PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER:
        setTypeIdentifier((typeIdentifier)newValue);
        return;
      case PascalPackage.FUNCTION_DECLARATION__BLOCK:
        setBlock((block)newValue);
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
      case PascalPackage.FUNCTION_DECLARATION__IDENTIFIER:
        setIdentifier((identifier)null);
        return;
      case PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST:
        setFormalParameterList((formalParameterList)null);
        return;
      case PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER:
        setTypeIdentifier((typeIdentifier)null);
        return;
      case PascalPackage.FUNCTION_DECLARATION__BLOCK:
        setBlock((block)null);
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
      case PascalPackage.FUNCTION_DECLARATION__IDENTIFIER:
        return identifier != null;
      case PascalPackage.FUNCTION_DECLARATION__FORMAL_PARAMETER_LIST:
        return formalParameterList != null;
      case PascalPackage.FUNCTION_DECLARATION__TYPE_IDENTIFIER:
        return typeIdentifier != null;
      case PascalPackage.FUNCTION_DECLARATION__BLOCK:
        return block != null;
    }
    return super.eIsSet(featureID);
  }

} //functionDeclarationImpl
