/**
 * generated by Xtext 2.15.0
 */
package compilador.pascal.impl;

import compilador.pascal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalFactoryImpl extends EFactoryImpl implements PascalFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PascalFactory init()
  {
    try
    {
      PascalFactory thePascalFactory = (PascalFactory)EPackage.Registry.INSTANCE.getEFactory(PascalPackage.eNS_URI);
      if (thePascalFactory != null)
      {
        return thePascalFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PascalFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PascalPackage.PASCAL: return createpascal();
      case PascalPackage.PROGRAM: return createprogram();
      case PascalPackage.PROGRAM_HEADING: return createprogramHeading();
      case PascalPackage.IDENTIFIER_LIST: return createidentifierList();
      case PascalPackage.BLOCK: return createblock();
      case PascalPackage.LABEL_DECLARATION_PART: return createlabel_declaration_part();
      case PascalPackage.LABEL: return createlabel();
      case PascalPackage.UNSIGNED_INTEGER: return createunsignedInteger();
      case PascalPackage.CONSTANT_DEFINITION_PART: return createconstantDefinitionPart();
      case PascalPackage.CONSTANT_DEFINITION: return createconstantDefinition();
      case PascalPackage.CONSTANT: return createconstant();
      case PascalPackage.CONSTANT_CHR: return createconstantChr();
      case PascalPackage.UNSIGNED_NUMBER: return createunsignedNumber();
      case PascalPackage.USES_UNITS_PART: return createusesUnitsPart();
      case PascalPackage.TYPE_DEFINITION_PART: return createtypeDefinitionPart();
      case PascalPackage.TYPE_DEFINITION: return createtypeDefinition();
      case PascalPackage.FUNCTION_TYPE: return createfunctionType();
      case PascalPackage.RESULT_TYPE: return createresultType();
      case PascalPackage.FORMAL_PARAMETER_LIST: return createformalParameterList();
      case PascalPackage.FORMAL_PARAMETER_SECTION: return createformalParameterSection();
      case PascalPackage.PARAMETER_GROUP: return createparameterGroup();
      case PascalPackage.TYPE_IDENTIFIER: return createtypeIdentifier();
      case PascalPackage.PROCEDURE_TYPE: return createprocedureType();
      case PascalPackage.TYPE: return createtype();
      case PascalPackage.POINTER_TYPE: return createpointerType();
      case PascalPackage.SIMPLE_TYPE: return createsimpleType();
      case PascalPackage.SCALAR_TYPE: return createscalarType();
      case PascalPackage.SUBRANGE_TYPE: return createsubrangeType();
      case PascalPackage.STRUCTURED_TYPE: return createstructuredType();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE: return createunpackedStructuredType();
      case PascalPackage.STRINGTYPE: return createstringtype();
      case PascalPackage.RECORD_TYPE: return createrecordType();
      case PascalPackage.FIELD_LIST: return createfieldList();
      case PascalPackage.FIXED_PART: return createfixedPart();
      case PascalPackage.RECORD_SECTION: return createrecordSection();
      case PascalPackage.VARIANT_PART: return createvariantPart();
      case PascalPackage.TAG: return createtag();
      case PascalPackage.VARIANT: return createvariant();
      case PascalPackage.CONST_LIST: return createconstList();
      case PascalPackage.VARIABLE_DECLARATION_PART: return createvariableDeclarationPart();
      case PascalPackage.VARIABLE_DECLARATION: return createvariableDeclaration();
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART: return createprocedureAndFunctionDeclarationPart();
      case PascalPackage.PROCEDURE_OR_FUNCTION_DECLARATION: return createprocedureOrFunctionDeclaration();
      case PascalPackage.PROCEDURE_DECLARATION: return createprocedureDeclaration();
      case PascalPackage.FUNCTION_DECLARATION: return createfunctionDeclaration();
      case PascalPackage.STATEMENT: return createstatement();
      case PascalPackage.UNLABELLED_STATEMENT: return createunlabelledStatement();
      case PascalPackage.SIMPLE_STATEMENT: return createsimpleStatement();
      case PascalPackage.ASSIGNMENT_STATEMENT: return createassignmentStatement();
      case PascalPackage.VARIABLE: return createvariable();
      case PascalPackage.EXPRESSION: return createexpression();
      case PascalPackage.SIMPLE_EXPRESSION: return createsimpleExpression();
      case PascalPackage.TERM: return createterm();
      case PascalPackage.SIGNED_FACTOR: return createsignedFactor();
      case PascalPackage.FACTOR: return createfactor();
      case PascalPackage.UNSIGNED_CONSTANT: return createunsignedConstant();
      case PascalPackage.FUNCTION_DESIGNATOR: return createfunctionDesignator();
      case PascalPackage.PARAMETER_LIST: return createparameterList();
      case PascalPackage.ACTUAL_PARAMETER: return createactualParameter();
      case PascalPackage.GOTO_STATEMENT: return creategotoStatement();
      case PascalPackage.STRUCTURED_STATEMENT: return createstructuredStatement();
      case PascalPackage.COMPOUND_STATEMENT: return createcompoundStatement();
      case PascalPackage.STATEMENTS: return createstatements();
      case PascalPackage.CONDITIONAL_STATEMENT: return createconditionalStatement();
      case PascalPackage.CASE_STATEMENT: return createcaseStatement();
      case PascalPackage.CASE_LIST_ELEMENT: return createcaseListElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pascal createpascal()
  {
    pascalImpl pascal = new pascalImpl();
    return pascal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program createprogram()
  {
    programImpl program = new programImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public programHeading createprogramHeading()
  {
    programHeadingImpl programHeading = new programHeadingImpl();
    return programHeading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifierList createidentifierList()
  {
    identifierListImpl identifierList = new identifierListImpl();
    return identifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block createblock()
  {
    blockImpl block = new blockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_declaration_part createlabel_declaration_part()
  {
    label_declaration_partImpl label_declaration_part = new label_declaration_partImpl();
    return label_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label createlabel()
  {
    labelImpl label = new labelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedInteger createunsignedInteger()
  {
    unsignedIntegerImpl unsignedInteger = new unsignedIntegerImpl();
    return unsignedInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constantDefinitionPart createconstantDefinitionPart()
  {
    constantDefinitionPartImpl constantDefinitionPart = new constantDefinitionPartImpl();
    return constantDefinitionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constantDefinition createconstantDefinition()
  {
    constantDefinitionImpl constantDefinition = new constantDefinitionImpl();
    return constantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant createconstant()
  {
    constantImpl constant = new constantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constantChr createconstantChr()
  {
    constantChrImpl constantChr = new constantChrImpl();
    return constantChr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedNumber createunsignedNumber()
  {
    unsignedNumberImpl unsignedNumber = new unsignedNumberImpl();
    return unsignedNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public usesUnitsPart createusesUnitsPart()
  {
    usesUnitsPartImpl usesUnitsPart = new usesUnitsPartImpl();
    return usesUnitsPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeDefinitionPart createtypeDefinitionPart()
  {
    typeDefinitionPartImpl typeDefinitionPart = new typeDefinitionPartImpl();
    return typeDefinitionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeDefinition createtypeDefinition()
  {
    typeDefinitionImpl typeDefinition = new typeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionType createfunctionType()
  {
    functionTypeImpl functionType = new functionTypeImpl();
    return functionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public resultType createresultType()
  {
    resultTypeImpl resultType = new resultTypeImpl();
    return resultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formalParameterList createformalParameterList()
  {
    formalParameterListImpl formalParameterList = new formalParameterListImpl();
    return formalParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formalParameterSection createformalParameterSection()
  {
    formalParameterSectionImpl formalParameterSection = new formalParameterSectionImpl();
    return formalParameterSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterGroup createparameterGroup()
  {
    parameterGroupImpl parameterGroup = new parameterGroupImpl();
    return parameterGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeIdentifier createtypeIdentifier()
  {
    typeIdentifierImpl typeIdentifier = new typeIdentifierImpl();
    return typeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedureType createprocedureType()
  {
    procedureTypeImpl procedureType = new procedureTypeImpl();
    return procedureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointerType createpointerType()
  {
    pointerTypeImpl pointerType = new pointerTypeImpl();
    return pointerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simpleType createsimpleType()
  {
    simpleTypeImpl simpleType = new simpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scalarType createscalarType()
  {
    scalarTypeImpl scalarType = new scalarTypeImpl();
    return scalarType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subrangeType createsubrangeType()
  {
    subrangeTypeImpl subrangeType = new subrangeTypeImpl();
    return subrangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structuredType createstructuredType()
  {
    structuredTypeImpl structuredType = new structuredTypeImpl();
    return structuredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpackedStructuredType createunpackedStructuredType()
  {
    unpackedStructuredTypeImpl unpackedStructuredType = new unpackedStructuredTypeImpl();
    return unpackedStructuredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stringtype createstringtype()
  {
    stringtypeImpl stringtype = new stringtypeImpl();
    return stringtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public recordType createrecordType()
  {
    recordTypeImpl recordType = new recordTypeImpl();
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldList createfieldList()
  {
    fieldListImpl fieldList = new fieldListImpl();
    return fieldList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fixedPart createfixedPart()
  {
    fixedPartImpl fixedPart = new fixedPartImpl();
    return fixedPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public recordSection createrecordSection()
  {
    recordSectionImpl recordSection = new recordSectionImpl();
    return recordSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variantPart createvariantPart()
  {
    variantPartImpl variantPart = new variantPartImpl();
    return variantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tag createtag()
  {
    tagImpl tag = new tagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variant createvariant()
  {
    variantImpl variant = new variantImpl();
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constList createconstList()
  {
    constListImpl constList = new constListImpl();
    return constList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variableDeclarationPart createvariableDeclarationPart()
  {
    variableDeclarationPartImpl variableDeclarationPart = new variableDeclarationPartImpl();
    return variableDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variableDeclaration createvariableDeclaration()
  {
    variableDeclarationImpl variableDeclaration = new variableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedureAndFunctionDeclarationPart createprocedureAndFunctionDeclarationPart()
  {
    procedureAndFunctionDeclarationPartImpl procedureAndFunctionDeclarationPart = new procedureAndFunctionDeclarationPartImpl();
    return procedureAndFunctionDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedureOrFunctionDeclaration createprocedureOrFunctionDeclaration()
  {
    procedureOrFunctionDeclarationImpl procedureOrFunctionDeclaration = new procedureOrFunctionDeclarationImpl();
    return procedureOrFunctionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedureDeclaration createprocedureDeclaration()
  {
    procedureDeclarationImpl procedureDeclaration = new procedureDeclarationImpl();
    return procedureDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionDeclaration createfunctionDeclaration()
  {
    functionDeclarationImpl functionDeclaration = new functionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unlabelledStatement createunlabelledStatement()
  {
    unlabelledStatementImpl unlabelledStatement = new unlabelledStatementImpl();
    return unlabelledStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simpleStatement createsimpleStatement()
  {
    simpleStatementImpl simpleStatement = new simpleStatementImpl();
    return simpleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignmentStatement createassignmentStatement()
  {
    assignmentStatementImpl assignmentStatement = new assignmentStatementImpl();
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable createvariable()
  {
    variableImpl variable = new variableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simpleExpression createsimpleExpression()
  {
    simpleExpressionImpl simpleExpression = new simpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term createterm()
  {
    termImpl term = new termImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public signedFactor createsignedFactor()
  {
    signedFactorImpl signedFactor = new signedFactorImpl();
    return signedFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factor createfactor()
  {
    factorImpl factor = new factorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedConstant createunsignedConstant()
  {
    unsignedConstantImpl unsignedConstant = new unsignedConstantImpl();
    return unsignedConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionDesignator createfunctionDesignator()
  {
    functionDesignatorImpl functionDesignator = new functionDesignatorImpl();
    return functionDesignator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterList createparameterList()
  {
    parameterListImpl parameterList = new parameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actualParameter createactualParameter()
  {
    actualParameterImpl actualParameter = new actualParameterImpl();
    return actualParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public gotoStatement creategotoStatement()
  {
    gotoStatementImpl gotoStatement = new gotoStatementImpl();
    return gotoStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structuredStatement createstructuredStatement()
  {
    structuredStatementImpl structuredStatement = new structuredStatementImpl();
    return structuredStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compoundStatement createcompoundStatement()
  {
    compoundStatementImpl compoundStatement = new compoundStatementImpl();
    return compoundStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statements createstatements()
  {
    statementsImpl statements = new statementsImpl();
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditionalStatement createconditionalStatement()
  {
    conditionalStatementImpl conditionalStatement = new conditionalStatementImpl();
    return conditionalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public caseStatement createcaseStatement()
  {
    caseStatementImpl caseStatement = new caseStatementImpl();
    return caseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public caseListElement createcaseListElement()
  {
    caseListElementImpl caseListElement = new caseListElementImpl();
    return caseListElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalPackage getPascalPackage()
  {
    return (PascalPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PascalPackage getPackage()
  {
    return PascalPackage.eINSTANCE;
  }

} //PascalFactoryImpl
