/**
 * generated by Xtext 2.16.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.formalParameterSection;
import compilador.pascal.parameterGroup;

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
 * An implementation of the model object '<em><b>formal Parameter Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.impl.formalParameterSectionImpl#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link compilador.pascal.impl.formalParameterSectionImpl#getParameterGroup2 <em>Parameter Group2</em>}</li>
 *   <li>{@link compilador.pascal.impl.formalParameterSectionImpl#getParameterGroup3 <em>Parameter Group3</em>}</li>
 *   <li>{@link compilador.pascal.impl.formalParameterSectionImpl#getParameterGroup4 <em>Parameter Group4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class formalParameterSectionImpl extends MinimalEObjectImpl.Container implements formalParameterSection
{
  /**
   * The cached value of the '{@link #getParameterGroup() <em>Parameter Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterGroup()
   * @generated
   * @ordered
   */
  protected parameterGroup parameterGroup;

  /**
   * The cached value of the '{@link #getParameterGroup2() <em>Parameter Group2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterGroup2()
   * @generated
   * @ordered
   */
  protected EList<parameterGroup> parameterGroup2;

  /**
   * The cached value of the '{@link #getParameterGroup3() <em>Parameter Group3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterGroup3()
   * @generated
   * @ordered
   */
  protected EList<parameterGroup> parameterGroup3;

  /**
   * The cached value of the '{@link #getParameterGroup4() <em>Parameter Group4</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterGroup4()
   * @generated
   * @ordered
   */
  protected EList<parameterGroup> parameterGroup4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected formalParameterSectionImpl()
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
    return PascalPackage.Literals.FORMAL_PARAMETER_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterGroup getParameterGroup()
  {
    return parameterGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterGroup(parameterGroup newParameterGroup, NotificationChain msgs)
  {
    parameterGroup oldParameterGroup = parameterGroup;
    parameterGroup = newParameterGroup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP, oldParameterGroup, newParameterGroup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterGroup(parameterGroup newParameterGroup)
  {
    if (newParameterGroup != parameterGroup)
    {
      NotificationChain msgs = null;
      if (parameterGroup != null)
        msgs = ((InternalEObject)parameterGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP, null, msgs);
      if (newParameterGroup != null)
        msgs = ((InternalEObject)newParameterGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP, null, msgs);
      msgs = basicSetParameterGroup(newParameterGroup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP, newParameterGroup, newParameterGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<parameterGroup> getParameterGroup2()
  {
    if (parameterGroup2 == null)
    {
      parameterGroup2 = new EObjectContainmentEList<parameterGroup>(parameterGroup.class, this, PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP2);
    }
    return parameterGroup2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<parameterGroup> getParameterGroup3()
  {
    if (parameterGroup3 == null)
    {
      parameterGroup3 = new EObjectContainmentEList<parameterGroup>(parameterGroup.class, this, PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP3);
    }
    return parameterGroup3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<parameterGroup> getParameterGroup4()
  {
    if (parameterGroup4 == null)
    {
      parameterGroup4 = new EObjectContainmentEList<parameterGroup>(parameterGroup.class, this, PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP4);
    }
    return parameterGroup4;
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP:
        return basicSetParameterGroup(null, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP2:
        return ((InternalEList<?>)getParameterGroup2()).basicRemove(otherEnd, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP3:
        return ((InternalEList<?>)getParameterGroup3()).basicRemove(otherEnd, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP4:
        return ((InternalEList<?>)getParameterGroup4()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP:
        return getParameterGroup();
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP2:
        return getParameterGroup2();
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP3:
        return getParameterGroup3();
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP4:
        return getParameterGroup4();
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP:
        setParameterGroup((parameterGroup)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP2:
        getParameterGroup2().clear();
        getParameterGroup2().addAll((Collection<? extends parameterGroup>)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP3:
        getParameterGroup3().clear();
        getParameterGroup3().addAll((Collection<? extends parameterGroup>)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP4:
        getParameterGroup4().clear();
        getParameterGroup4().addAll((Collection<? extends parameterGroup>)newValue);
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP:
        setParameterGroup((parameterGroup)null);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP2:
        getParameterGroup2().clear();
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP3:
        getParameterGroup3().clear();
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP4:
        getParameterGroup4().clear();
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP:
        return parameterGroup != null;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP2:
        return parameterGroup2 != null && !parameterGroup2.isEmpty();
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP3:
        return parameterGroup3 != null && !parameterGroup3.isEmpty();
      case PascalPackage.FORMAL_PARAMETER_SECTION__PARAMETER_GROUP4:
        return parameterGroup4 != null && !parameterGroup4.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //formalParameterSectionImpl
