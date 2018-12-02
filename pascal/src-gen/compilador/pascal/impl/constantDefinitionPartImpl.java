/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.constantDefinition;
import compilador.pascal.constantDefinitionPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant Definition Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.constantDefinitionPartImpl#getConstantDefinition <em>Constant Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constantDefinitionPartImpl extends MinimalEObjectImpl.Container implements constantDefinitionPart
{
  /**
   * The cached value of the '{@link #getConstantDefinition() <em>Constant Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantDefinition()
   * @generated
   * @ordered
   */
  protected EList<constantDefinition> constantDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constantDefinitionPartImpl()
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
    return PascalPackage.Literals.CONSTANT_DEFINITION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<constantDefinition> getConstantDefinition()
  {
    if (constantDefinition == null)
    {
      constantDefinition = new EObjectContainmentEList<constantDefinition>(constantDefinition.class, this, PascalPackage.CONSTANT_DEFINITION_PART__CONSTANT_DEFINITION);
    }
    return constantDefinition;
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTANT_DEFINITION:
        return ((InternalEList<?>)getConstantDefinition()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTANT_DEFINITION:
        return getConstantDefinition();
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTANT_DEFINITION:
        getConstantDefinition().clear();
        getConstantDefinition().addAll((Collection<? extends constantDefinition>)newValue);
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTANT_DEFINITION:
        getConstantDefinition().clear();
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTANT_DEFINITION:
        return constantDefinition != null && !constantDefinition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //constantDefinitionPartImpl
