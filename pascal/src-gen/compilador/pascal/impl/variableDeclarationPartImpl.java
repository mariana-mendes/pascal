/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.variableDeclaration;
import compilador.pascal.variableDeclarationPart;

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
 * An implementation of the model object '<em><b>variable Declaration Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.variableDeclarationPartImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link compilador.pascal.impl.variableDeclarationPartImpl#getVariableDeclaration1 <em>Variable Declaration1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variableDeclarationPartImpl extends MinimalEObjectImpl.Container implements variableDeclarationPart
{
  /**
   * The cached value of the '{@link #getVariableDeclaration() <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclaration()
   * @generated
   * @ordered
   */
  protected variableDeclaration variableDeclaration;

  /**
   * The cached value of the '{@link #getVariableDeclaration1() <em>Variable Declaration1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclaration1()
   * @generated
   * @ordered
   */
  protected EList<variableDeclaration> variableDeclaration1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variableDeclarationPartImpl()
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
    return PascalPackage.Literals.VARIABLE_DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variableDeclaration getVariableDeclaration()
  {
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableDeclaration(variableDeclaration newVariableDeclaration, NotificationChain msgs)
  {
    variableDeclaration oldVariableDeclaration = variableDeclaration;
    variableDeclaration = newVariableDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION, oldVariableDeclaration, newVariableDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableDeclaration(variableDeclaration newVariableDeclaration)
  {
    if (newVariableDeclaration != variableDeclaration)
    {
      NotificationChain msgs = null;
      if (variableDeclaration != null)
        msgs = ((InternalEObject)variableDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION, null, msgs);
      if (newVariableDeclaration != null)
        msgs = ((InternalEObject)newVariableDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION, null, msgs);
      msgs = basicSetVariableDeclaration(newVariableDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION, newVariableDeclaration, newVariableDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variableDeclaration> getVariableDeclaration1()
  {
    if (variableDeclaration1 == null)
    {
      variableDeclaration1 = new EObjectContainmentEList<variableDeclaration>(variableDeclaration.class, this, PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION1);
    }
    return variableDeclaration1;
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        return basicSetVariableDeclaration(null, msgs);
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION1:
        return ((InternalEList<?>)getVariableDeclaration1()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        return getVariableDeclaration();
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION1:
        return getVariableDeclaration1();
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        setVariableDeclaration((variableDeclaration)newValue);
        return;
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION1:
        getVariableDeclaration1().clear();
        getVariableDeclaration1().addAll((Collection<? extends variableDeclaration>)newValue);
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        setVariableDeclaration((variableDeclaration)null);
        return;
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION1:
        getVariableDeclaration1().clear();
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        return variableDeclaration != null;
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION1:
        return variableDeclaration1 != null && !variableDeclaration1.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //variableDeclarationPartImpl