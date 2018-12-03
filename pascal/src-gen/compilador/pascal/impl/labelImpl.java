/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.label;
import compilador.pascal.statement;
import compilador.pascal.unlabelledStatement;
import compilador.pascal.unsignedInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.pascal.impl.labelImpl#getUnlabelledStatement <em>Unlabelled Statement</em>}</li>
 *   <li>{@link compilador.pascal.impl.labelImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link compilador.pascal.impl.labelImpl#getUnsignedInteger <em>Unsigned Integer</em>}</li>
 *   <li>{@link compilador.pascal.impl.labelImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class labelImpl extends label_declaration_partImpl implements label
{
  /**
   * The cached value of the '{@link #getUnlabelledStatement() <em>Unlabelled Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnlabelledStatement()
   * @generated
   * @ordered
   */
  protected unlabelledStatement unlabelledStatement;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected EList<label> label;

  /**
   * The cached value of the '{@link #getUnsignedInteger() <em>Unsigned Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsignedInteger()
   * @generated
   * @ordered
   */
  protected unsignedInteger unsignedInteger;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected labelImpl()
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
    return PascalPackage.Literals.LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unlabelledStatement getUnlabelledStatement()
  {
    return unlabelledStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnlabelledStatement(unlabelledStatement newUnlabelledStatement, NotificationChain msgs)
  {
    unlabelledStatement oldUnlabelledStatement = unlabelledStatement;
    unlabelledStatement = newUnlabelledStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.LABEL__UNLABELLED_STATEMENT, oldUnlabelledStatement, newUnlabelledStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnlabelledStatement(unlabelledStatement newUnlabelledStatement)
  {
    if (newUnlabelledStatement != unlabelledStatement)
    {
      NotificationChain msgs = null;
      if (unlabelledStatement != null)
        msgs = ((InternalEObject)unlabelledStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.LABEL__UNLABELLED_STATEMENT, null, msgs);
      if (newUnlabelledStatement != null)
        msgs = ((InternalEObject)newUnlabelledStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.LABEL__UNLABELLED_STATEMENT, null, msgs);
      msgs = basicSetUnlabelledStatement(newUnlabelledStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.LABEL__UNLABELLED_STATEMENT, newUnlabelledStatement, newUnlabelledStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<label> getLabel()
  {
    if (label == null)
    {
      label = new EObjectContainmentEList<label>(label.class, this, PascalPackage.LABEL__LABEL);
    }
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedInteger getUnsignedInteger()
  {
    return unsignedInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnsignedInteger(unsignedInteger newUnsignedInteger, NotificationChain msgs)
  {
    unsignedInteger oldUnsignedInteger = unsignedInteger;
    unsignedInteger = newUnsignedInteger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.LABEL__UNSIGNED_INTEGER, oldUnsignedInteger, newUnsignedInteger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsignedInteger(unsignedInteger newUnsignedInteger)
  {
    if (newUnsignedInteger != unsignedInteger)
    {
      NotificationChain msgs = null;
      if (unsignedInteger != null)
        msgs = ((InternalEObject)unsignedInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.LABEL__UNSIGNED_INTEGER, null, msgs);
      if (newUnsignedInteger != null)
        msgs = ((InternalEObject)newUnsignedInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.LABEL__UNSIGNED_INTEGER, null, msgs);
      msgs = basicSetUnsignedInteger(newUnsignedInteger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.LABEL__UNSIGNED_INTEGER, newUnsignedInteger, newUnsignedInteger));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.LABEL__IDENTIFIER, oldIdentifier, identifier));
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
      case PascalPackage.LABEL__UNLABELLED_STATEMENT:
        return basicSetUnlabelledStatement(null, msgs);
      case PascalPackage.LABEL__LABEL:
        return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
      case PascalPackage.LABEL__UNSIGNED_INTEGER:
        return basicSetUnsignedInteger(null, msgs);
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
      case PascalPackage.LABEL__UNLABELLED_STATEMENT:
        return getUnlabelledStatement();
      case PascalPackage.LABEL__LABEL:
        return getLabel();
      case PascalPackage.LABEL__UNSIGNED_INTEGER:
        return getUnsignedInteger();
      case PascalPackage.LABEL__IDENTIFIER:
        return getIdentifier();
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
      case PascalPackage.LABEL__UNLABELLED_STATEMENT:
        setUnlabelledStatement((unlabelledStatement)newValue);
        return;
      case PascalPackage.LABEL__LABEL:
        getLabel().clear();
        getLabel().addAll((Collection<? extends label>)newValue);
        return;
      case PascalPackage.LABEL__UNSIGNED_INTEGER:
        setUnsignedInteger((unsignedInteger)newValue);
        return;
      case PascalPackage.LABEL__IDENTIFIER:
        setIdentifier((String)newValue);
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
      case PascalPackage.LABEL__UNLABELLED_STATEMENT:
        setUnlabelledStatement((unlabelledStatement)null);
        return;
      case PascalPackage.LABEL__LABEL:
        getLabel().clear();
        return;
      case PascalPackage.LABEL__UNSIGNED_INTEGER:
        setUnsignedInteger((unsignedInteger)null);
        return;
      case PascalPackage.LABEL__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
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
      case PascalPackage.LABEL__UNLABELLED_STATEMENT:
        return unlabelledStatement != null;
      case PascalPackage.LABEL__LABEL:
        return label != null && !label.isEmpty();
      case PascalPackage.LABEL__UNSIGNED_INTEGER:
        return unsignedInteger != null;
      case PascalPackage.LABEL__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == statement.class)
    {
      switch (derivedFeatureID)
      {
        case PascalPackage.LABEL__UNLABELLED_STATEMENT: return PascalPackage.STATEMENT__UNLABELLED_STATEMENT;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == statement.class)
    {
      switch (baseFeatureID)
      {
        case PascalPackage.STATEMENT__UNLABELLED_STATEMENT: return PascalPackage.LABEL__UNLABELLED_STATEMENT;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //labelImpl
