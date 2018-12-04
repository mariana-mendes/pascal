/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.fieldList;
import compilador.pascal.fixedPart;
import compilador.pascal.variantPart;

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
 * An implementation of the model object '<em><b>field List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.fieldListImpl#getFixedPart <em>Fixed Part</em>}</li>
 *   <li>{@link compilador.pascal.impl.fieldListImpl#getVariantPart <em>Variant Part</em>}</li>
 *   <li>{@link compilador.pascal.impl.fieldListImpl#getVariantPart1 <em>Variant Part1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fieldListImpl extends MinimalEObjectImpl.Container implements fieldList
{
  /**
   * The cached value of the '{@link #getFixedPart() <em>Fixed Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixedPart()
   * @generated
   * @ordered
   */
  protected fixedPart fixedPart;

  /**
   * The cached value of the '{@link #getVariantPart() <em>Variant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariantPart()
   * @generated
   * @ordered
   */
  protected variantPart variantPart;

  /**
   * The cached value of the '{@link #getVariantPart1() <em>Variant Part1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariantPart1()
   * @generated
   * @ordered
   */
  protected EList<variantPart> variantPart1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fieldListImpl()
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
    return PascalPackage.Literals.FIELD_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fixedPart getFixedPart()
  {
    return fixedPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFixedPart(fixedPart newFixedPart, NotificationChain msgs)
  {
    fixedPart oldFixedPart = fixedPart;
    fixedPart = newFixedPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__FIXED_PART, oldFixedPart, newFixedPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixedPart(fixedPart newFixedPart)
  {
    if (newFixedPart != fixedPart)
    {
      NotificationChain msgs = null;
      if (fixedPart != null)
        msgs = ((InternalEObject)fixedPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__FIXED_PART, null, msgs);
      if (newFixedPart != null)
        msgs = ((InternalEObject)newFixedPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__FIXED_PART, null, msgs);
      msgs = basicSetFixedPart(newFixedPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__FIXED_PART, newFixedPart, newFixedPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variantPart getVariantPart()
  {
    return variantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariantPart(variantPart newVariantPart, NotificationChain msgs)
  {
    variantPart oldVariantPart = variantPart;
    variantPart = newVariantPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__VARIANT_PART, oldVariantPart, newVariantPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariantPart(variantPart newVariantPart)
  {
    if (newVariantPart != variantPart)
    {
      NotificationChain msgs = null;
      if (variantPart != null)
        msgs = ((InternalEObject)variantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__VARIANT_PART, null, msgs);
      if (newVariantPart != null)
        msgs = ((InternalEObject)newVariantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__VARIANT_PART, null, msgs);
      msgs = basicSetVariantPart(newVariantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__VARIANT_PART, newVariantPart, newVariantPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variantPart> getVariantPart1()
  {
    if (variantPart1 == null)
    {
      variantPart1 = new EObjectContainmentEList<variantPart>(variantPart.class, this, PascalPackage.FIELD_LIST__VARIANT_PART1);
    }
    return variantPart1;
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return basicSetFixedPart(null, msgs);
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return basicSetVariantPart(null, msgs);
      case PascalPackage.FIELD_LIST__VARIANT_PART1:
        return ((InternalEList<?>)getVariantPart1()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return getFixedPart();
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return getVariantPart();
      case PascalPackage.FIELD_LIST__VARIANT_PART1:
        return getVariantPart1();
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        setFixedPart((fixedPart)newValue);
        return;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        setVariantPart((variantPart)newValue);
        return;
      case PascalPackage.FIELD_LIST__VARIANT_PART1:
        getVariantPart1().clear();
        getVariantPart1().addAll((Collection<? extends variantPart>)newValue);
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        setFixedPart((fixedPart)null);
        return;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        setVariantPart((variantPart)null);
        return;
      case PascalPackage.FIELD_LIST__VARIANT_PART1:
        getVariantPart1().clear();
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return fixedPart != null;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return variantPart != null;
      case PascalPackage.FIELD_LIST__VARIANT_PART1:
        return variantPart1 != null && !variantPart1.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //fieldListImpl
