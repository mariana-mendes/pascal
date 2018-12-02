/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.PascalPackage;
import compilador.pascal.block;
import compilador.pascal.compoundStatement;
import compilador.pascal.constantDefinitionPart;
import compilador.pascal.label_declaration_part;
import compilador.pascal.procedureAndFunctionDeclarationPart;
import compilador.pascal.typeDefinitionPart;
import compilador.pascal.usesUnitsPart;
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
 * An implementation of the model object '<em><b>block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compilador.pascal.impl.blockImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link compilador.pascal.impl.blockImpl#getConstantDefinitionPart <em>Constant Definition Part</em>}</li>
 *   <li>{@link compilador.pascal.impl.blockImpl#getTypeDefinitionPart <em>Type Definition Part</em>}</li>
 *   <li>{@link compilador.pascal.impl.blockImpl#getVariableDeclarationPart <em>Variable Declaration Part</em>}</li>
 *   <li>{@link compilador.pascal.impl.blockImpl#getProcedureAndFunctionDeclarationPart <em>Procedure And Function Declaration Part</em>}</li>
 *   <li>{@link compilador.pascal.impl.blockImpl#getUsesUnitsPart <em>Uses Units Part</em>}</li>
 *   <li>{@link compilador.pascal.impl.blockImpl#getCompoundStatement <em>Compound Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class blockImpl extends MinimalEObjectImpl.Container implements block
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected EList<label_declaration_part> label;

  /**
   * The cached value of the '{@link #getConstantDefinitionPart() <em>Constant Definition Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantDefinitionPart()
   * @generated
   * @ordered
   */
  protected EList<constantDefinitionPart> constantDefinitionPart;

  /**
   * The cached value of the '{@link #getTypeDefinitionPart() <em>Type Definition Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinitionPart()
   * @generated
   * @ordered
   */
  protected EList<typeDefinitionPart> typeDefinitionPart;

  /**
   * The cached value of the '{@link #getVariableDeclarationPart() <em>Variable Declaration Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclarationPart()
   * @generated
   * @ordered
   */
  protected EList<variableDeclarationPart> variableDeclarationPart;

  /**
   * The cached value of the '{@link #getProcedureAndFunctionDeclarationPart() <em>Procedure And Function Declaration Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedureAndFunctionDeclarationPart()
   * @generated
   * @ordered
   */
  protected EList<procedureAndFunctionDeclarationPart> procedureAndFunctionDeclarationPart;

  /**
   * The cached value of the '{@link #getUsesUnitsPart() <em>Uses Units Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsesUnitsPart()
   * @generated
   * @ordered
   */
  protected EList<usesUnitsPart> usesUnitsPart;

  /**
   * The cached value of the '{@link #getCompoundStatement() <em>Compound Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompoundStatement()
   * @generated
   * @ordered
   */
  protected compoundStatement compoundStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected blockImpl()
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
    return PascalPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<label_declaration_part> getLabel()
  {
    if (label == null)
    {
      label = new EObjectContainmentEList<label_declaration_part>(label_declaration_part.class, this, PascalPackage.BLOCK__LABEL);
    }
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<constantDefinitionPart> getConstantDefinitionPart()
  {
    if (constantDefinitionPart == null)
    {
      constantDefinitionPart = new EObjectContainmentEList<constantDefinitionPart>(constantDefinitionPart.class, this, PascalPackage.BLOCK__CONSTANT_DEFINITION_PART);
    }
    return constantDefinitionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<typeDefinitionPart> getTypeDefinitionPart()
  {
    if (typeDefinitionPart == null)
    {
      typeDefinitionPart = new EObjectContainmentEList<typeDefinitionPart>(typeDefinitionPart.class, this, PascalPackage.BLOCK__TYPE_DEFINITION_PART);
    }
    return typeDefinitionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variableDeclarationPart> getVariableDeclarationPart()
  {
    if (variableDeclarationPart == null)
    {
      variableDeclarationPart = new EObjectContainmentEList<variableDeclarationPart>(variableDeclarationPart.class, this, PascalPackage.BLOCK__VARIABLE_DECLARATION_PART);
    }
    return variableDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<procedureAndFunctionDeclarationPart> getProcedureAndFunctionDeclarationPart()
  {
    if (procedureAndFunctionDeclarationPart == null)
    {
      procedureAndFunctionDeclarationPart = new EObjectContainmentEList<procedureAndFunctionDeclarationPart>(procedureAndFunctionDeclarationPart.class, this, PascalPackage.BLOCK__PROCEDURE_AND_FUNCTION_DECLARATION_PART);
    }
    return procedureAndFunctionDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<usesUnitsPart> getUsesUnitsPart()
  {
    if (usesUnitsPart == null)
    {
      usesUnitsPart = new EObjectContainmentEList<usesUnitsPart>(usesUnitsPart.class, this, PascalPackage.BLOCK__USES_UNITS_PART);
    }
    return usesUnitsPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compoundStatement getCompoundStatement()
  {
    return compoundStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompoundStatement(compoundStatement newCompoundStatement, NotificationChain msgs)
  {
    compoundStatement oldCompoundStatement = compoundStatement;
    compoundStatement = newCompoundStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__COMPOUND_STATEMENT, oldCompoundStatement, newCompoundStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompoundStatement(compoundStatement newCompoundStatement)
  {
    if (newCompoundStatement != compoundStatement)
    {
      NotificationChain msgs = null;
      if (compoundStatement != null)
        msgs = ((InternalEObject)compoundStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__COMPOUND_STATEMENT, null, msgs);
      if (newCompoundStatement != null)
        msgs = ((InternalEObject)newCompoundStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__COMPOUND_STATEMENT, null, msgs);
      msgs = basicSetCompoundStatement(newCompoundStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__COMPOUND_STATEMENT, newCompoundStatement, newCompoundStatement));
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
      case PascalPackage.BLOCK__LABEL:
        return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
      case PascalPackage.BLOCK__CONSTANT_DEFINITION_PART:
        return ((InternalEList<?>)getConstantDefinitionPart()).basicRemove(otherEnd, msgs);
      case PascalPackage.BLOCK__TYPE_DEFINITION_PART:
        return ((InternalEList<?>)getTypeDefinitionPart()).basicRemove(otherEnd, msgs);
      case PascalPackage.BLOCK__VARIABLE_DECLARATION_PART:
        return ((InternalEList<?>)getVariableDeclarationPart()).basicRemove(otherEnd, msgs);
      case PascalPackage.BLOCK__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        return ((InternalEList<?>)getProcedureAndFunctionDeclarationPart()).basicRemove(otherEnd, msgs);
      case PascalPackage.BLOCK__USES_UNITS_PART:
        return ((InternalEList<?>)getUsesUnitsPart()).basicRemove(otherEnd, msgs);
      case PascalPackage.BLOCK__COMPOUND_STATEMENT:
        return basicSetCompoundStatement(null, msgs);
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
      case PascalPackage.BLOCK__LABEL:
        return getLabel();
      case PascalPackage.BLOCK__CONSTANT_DEFINITION_PART:
        return getConstantDefinitionPart();
      case PascalPackage.BLOCK__TYPE_DEFINITION_PART:
        return getTypeDefinitionPart();
      case PascalPackage.BLOCK__VARIABLE_DECLARATION_PART:
        return getVariableDeclarationPart();
      case PascalPackage.BLOCK__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        return getProcedureAndFunctionDeclarationPart();
      case PascalPackage.BLOCK__USES_UNITS_PART:
        return getUsesUnitsPart();
      case PascalPackage.BLOCK__COMPOUND_STATEMENT:
        return getCompoundStatement();
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
      case PascalPackage.BLOCK__LABEL:
        getLabel().clear();
        getLabel().addAll((Collection<? extends label_declaration_part>)newValue);
        return;
      case PascalPackage.BLOCK__CONSTANT_DEFINITION_PART:
        getConstantDefinitionPart().clear();
        getConstantDefinitionPart().addAll((Collection<? extends constantDefinitionPart>)newValue);
        return;
      case PascalPackage.BLOCK__TYPE_DEFINITION_PART:
        getTypeDefinitionPart().clear();
        getTypeDefinitionPart().addAll((Collection<? extends typeDefinitionPart>)newValue);
        return;
      case PascalPackage.BLOCK__VARIABLE_DECLARATION_PART:
        getVariableDeclarationPart().clear();
        getVariableDeclarationPart().addAll((Collection<? extends variableDeclarationPart>)newValue);
        return;
      case PascalPackage.BLOCK__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        getProcedureAndFunctionDeclarationPart().clear();
        getProcedureAndFunctionDeclarationPart().addAll((Collection<? extends procedureAndFunctionDeclarationPart>)newValue);
        return;
      case PascalPackage.BLOCK__USES_UNITS_PART:
        getUsesUnitsPart().clear();
        getUsesUnitsPart().addAll((Collection<? extends usesUnitsPart>)newValue);
        return;
      case PascalPackage.BLOCK__COMPOUND_STATEMENT:
        setCompoundStatement((compoundStatement)newValue);
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
      case PascalPackage.BLOCK__LABEL:
        getLabel().clear();
        return;
      case PascalPackage.BLOCK__CONSTANT_DEFINITION_PART:
        getConstantDefinitionPart().clear();
        return;
      case PascalPackage.BLOCK__TYPE_DEFINITION_PART:
        getTypeDefinitionPart().clear();
        return;
      case PascalPackage.BLOCK__VARIABLE_DECLARATION_PART:
        getVariableDeclarationPart().clear();
        return;
      case PascalPackage.BLOCK__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        getProcedureAndFunctionDeclarationPart().clear();
        return;
      case PascalPackage.BLOCK__USES_UNITS_PART:
        getUsesUnitsPart().clear();
        return;
      case PascalPackage.BLOCK__COMPOUND_STATEMENT:
        setCompoundStatement((compoundStatement)null);
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
      case PascalPackage.BLOCK__LABEL:
        return label != null && !label.isEmpty();
      case PascalPackage.BLOCK__CONSTANT_DEFINITION_PART:
        return constantDefinitionPart != null && !constantDefinitionPart.isEmpty();
      case PascalPackage.BLOCK__TYPE_DEFINITION_PART:
        return typeDefinitionPart != null && !typeDefinitionPart.isEmpty();
      case PascalPackage.BLOCK__VARIABLE_DECLARATION_PART:
        return variableDeclarationPart != null && !variableDeclarationPart.isEmpty();
      case PascalPackage.BLOCK__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        return procedureAndFunctionDeclarationPart != null && !procedureAndFunctionDeclarationPart.isEmpty();
      case PascalPackage.BLOCK__USES_UNITS_PART:
        return usesUnitsPart != null && !usesUnitsPart.isEmpty();
      case PascalPackage.BLOCK__COMPOUND_STATEMENT:
        return compoundStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //blockImpl