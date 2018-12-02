/*
 * generated by Xtext 2.15.0
 */
package compilador.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import compilador.ide.contentassist.antlr.internal.InternalPascalParser;
import compilador.services.PascalGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PascalParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PascalGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PascalGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getBlockAccess().getAlternatives_1(), "rule__Block__Alternatives_1");
			builder.put(grammarAccess.getLabelAccess().getAlternatives(), "rule__Label__Alternatives");
			builder.put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
			builder.put(grammarAccess.getUnsignedNumberAccess().getAlternatives(), "rule__UnsignedNumber__Alternatives");
			builder.put(grammarAccess.getSignAccess().getAlternatives(), "rule__Sign__Alternatives");
			builder.put(grammarAccess.getTypeDefinitionAccess().getAlternatives_2(), "rule__TypeDefinition__Alternatives_2");
			builder.put(grammarAccess.getFormalParameterSectionAccess().getAlternatives(), "rule__FormalParameterSection__Alternatives");
			builder.put(grammarAccess.getTypeIdentifierAccess().getAlternatives(), "rule__TypeIdentifier__Alternatives");
			builder.put(grammarAccess.getTypeIdentifierAccess().getAlternatives_1(), "rule__TypeIdentifier__Alternatives_1");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getSimpleTypeAccess().getAlternatives(), "rule__SimpleType__Alternatives");
			builder.put(grammarAccess.getStructuredTypeAccess().getAlternatives(), "rule__StructuredType__Alternatives");
			builder.put(grammarAccess.getStringtypeAccess().getAlternatives_2(), "rule__Stringtype__Alternatives_2");
			builder.put(grammarAccess.getFieldListAccess().getAlternatives(), "rule__FieldList__Alternatives");
			builder.put(grammarAccess.getTagAccess().getAlternatives(), "rule__Tag__Alternatives");
			builder.put(grammarAccess.getProcedureOrFunctionDeclarationAccess().getAlternatives(), "rule__ProcedureOrFunctionDeclaration__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getUnlabelledStatementAccess().getAlternatives(), "rule__UnlabelledStatement__Alternatives");
			builder.put(grammarAccess.getSimpleStatementAccess().getAlternatives_1(), "rule__SimpleStatement__Alternatives_1");
			builder.put(grammarAccess.getVariableAccess().getAlternatives_0(), "rule__Variable__Alternatives_0");
			builder.put(grammarAccess.getVariableAccess().getAlternatives_1(), "rule__Variable__Alternatives_1");
			builder.put(grammarAccess.getRelationaloperatorAccess().getAlternatives(), "rule__Relationaloperator__Alternatives");
			builder.put(grammarAccess.getAdditiveoperatorAccess().getAlternatives(), "rule__Additiveoperator__Alternatives");
			builder.put(grammarAccess.getMultiplicativeoperatorAccess().getAlternatives(), "rule__Multiplicativeoperator__Alternatives");
			builder.put(grammarAccess.getSignedFactorAccess().getAlternatives_0(), "rule__SignedFactor__Alternatives_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives(), "rule__Factor__Alternatives");
			builder.put(grammarAccess.getUnsignedConstantAccess().getAlternatives(), "rule__UnsignedConstant__Alternatives");
			builder.put(grammarAccess.getStructuredStatementAccess().getAlternatives(), "rule__StructuredStatement__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getProgramHeadingAccess().getGroup(), "rule__ProgramHeading__Group__0");
			builder.put(grammarAccess.getProgramHeadingAccess().getGroup_2(), "rule__ProgramHeading__Group_2__0");
			builder.put(grammarAccess.getIdentifierListAccess().getGroup(), "rule__IdentifierList__Group__0");
			builder.put(grammarAccess.getIdentifierListAccess().getGroup_1(), "rule__IdentifierList__Group_1__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getLabel_declaration_partAccess().getGroup(), "rule__Label_declaration_part__Group__0");
			builder.put(grammarAccess.getLabel_declaration_partAccess().getGroup_2(), "rule__Label_declaration_part__Group_2__0");
			builder.put(grammarAccess.getConstantDefinitionPartAccess().getGroup(), "rule__ConstantDefinitionPart__Group__0");
			builder.put(grammarAccess.getConstantDefinitionPartAccess().getGroup_1(), "rule__ConstantDefinitionPart__Group_1__0");
			builder.put(grammarAccess.getConstantDefinitionAccess().getGroup(), "rule__ConstantDefinition__Group__0");
			builder.put(grammarAccess.getConstantAccess().getGroup_1(), "rule__Constant__Group_1__0");
			builder.put(grammarAccess.getConstantAccess().getGroup_4(), "rule__Constant__Group_4__0");
			builder.put(grammarAccess.getConstantChrAccess().getGroup(), "rule__ConstantChr__Group__0");
			builder.put(grammarAccess.getUsesUnitsPartAccess().getGroup(), "rule__UsesUnitsPart__Group__0");
			builder.put(grammarAccess.getTypeDefinitionPartAccess().getGroup(), "rule__TypeDefinitionPart__Group__0");
			builder.put(grammarAccess.getTypeDefinitionPartAccess().getGroup_1(), "rule__TypeDefinitionPart__Group_1__0");
			builder.put(grammarAccess.getTypeDefinitionAccess().getGroup(), "rule__TypeDefinition__Group__0");
			builder.put(grammarAccess.getFunctionTypeAccess().getGroup(), "rule__FunctionType__Group__0");
			builder.put(grammarAccess.getFormalParameterListAccess().getGroup(), "rule__FormalParameterList__Group__0");
			builder.put(grammarAccess.getFormalParameterListAccess().getGroup_2(), "rule__FormalParameterList__Group_2__0");
			builder.put(grammarAccess.getFormalParameterSectionAccess().getGroup_1(), "rule__FormalParameterSection__Group_1__0");
			builder.put(grammarAccess.getFormalParameterSectionAccess().getGroup_2(), "rule__FormalParameterSection__Group_2__0");
			builder.put(grammarAccess.getFormalParameterSectionAccess().getGroup_3(), "rule__FormalParameterSection__Group_3__0");
			builder.put(grammarAccess.getParameterGroupAccess().getGroup(), "rule__ParameterGroup__Group__0");
			builder.put(grammarAccess.getTypeIdentifierAccess().getGroup_1_0(), "rule__TypeIdentifier__Group_1_0__0");
			builder.put(grammarAccess.getTypeIdentifierAccess().getGroup_1_1(), "rule__TypeIdentifier__Group_1_1__0");
			builder.put(grammarAccess.getTypeIdentifierAccess().getGroup_1_2(), "rule__TypeIdentifier__Group_1_2__0");
			builder.put(grammarAccess.getTypeIdentifierAccess().getGroup_1_3(), "rule__TypeIdentifier__Group_1_3__0");
			builder.put(grammarAccess.getTypeIdentifierAccess().getGroup_1_4(), "rule__TypeIdentifier__Group_1_4__0");
			builder.put(grammarAccess.getProcedureTypeAccess().getGroup(), "rule__ProcedureType__Group__0");
			builder.put(grammarAccess.getPointerTypeAccess().getGroup(), "rule__PointerType__Group__0");
			builder.put(grammarAccess.getScalarTypeAccess().getGroup(), "rule__ScalarType__Group__0");
			builder.put(grammarAccess.getSubrangeTypeAccess().getGroup(), "rule__SubrangeType__Group__0");
			builder.put(grammarAccess.getStructuredTypeAccess().getGroup_0(), "rule__StructuredType__Group_0__0");
			builder.put(grammarAccess.getStringtypeAccess().getGroup(), "rule__Stringtype__Group__0");
			builder.put(grammarAccess.getRecordTypeAccess().getGroup(), "rule__RecordType__Group__0");
			builder.put(grammarAccess.getFieldListAccess().getGroup_0(), "rule__FieldList__Group_0__0");
			builder.put(grammarAccess.getFieldListAccess().getGroup_0_1(), "rule__FieldList__Group_0_1__0");
			builder.put(grammarAccess.getFixedPartAccess().getGroup(), "rule__FixedPart__Group__0");
			builder.put(grammarAccess.getFixedPartAccess().getGroup_1(), "rule__FixedPart__Group_1__0");
			builder.put(grammarAccess.getRecordSectionAccess().getGroup(), "rule__RecordSection__Group__0");
			builder.put(grammarAccess.getVariantPartAccess().getGroup(), "rule__VariantPart__Group__0");
			builder.put(grammarAccess.getVariantPartAccess().getGroup_4(), "rule__VariantPart__Group_4__0");
			builder.put(grammarAccess.getTagAccess().getGroup_0(), "rule__Tag__Group_0__0");
			builder.put(grammarAccess.getVariantAccess().getGroup(), "rule__Variant__Group__0");
			builder.put(grammarAccess.getVariantAccess().getGroup_1(), "rule__Variant__Group_1__0");
			builder.put(grammarAccess.getConstListAccess().getGroup(), "rule__ConstList__Group__0");
			builder.put(grammarAccess.getConstListAccess().getGroup_1(), "rule__ConstList__Group_1__0");
			builder.put(grammarAccess.getVariableDeclarationPartAccess().getGroup(), "rule__VariableDeclarationPart__Group__0");
			builder.put(grammarAccess.getVariableDeclarationPartAccess().getGroup_2(), "rule__VariableDeclarationPart__Group_2__0");
			builder.put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
			builder.put(grammarAccess.getProcedureAndFunctionDeclarationPartAccess().getGroup(), "rule__ProcedureAndFunctionDeclarationPart__Group__0");
			builder.put(grammarAccess.getProcedureDeclarationAccess().getGroup(), "rule__ProcedureDeclaration__Group__0");
			builder.put(grammarAccess.getFunctionDeclarationAccess().getGroup(), "rule__FunctionDeclaration__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
			builder.put(grammarAccess.getUnlabelledStatementAccess().getGroup_2(), "rule__UnlabelledStatement__Group_2__0");
			builder.put(grammarAccess.getUnlabelledStatementAccess().getGroup_2_1(), "rule__UnlabelledStatement__Group_2_1__0");
			builder.put(grammarAccess.getSimpleStatementAccess().getGroup(), "rule__SimpleStatement__Group__0");
			builder.put(grammarAccess.getAssignmentStatementAccess().getGroup(), "rule__AssignmentStatement__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_0_0(), "rule__Variable__Group_0_0__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1_0(), "rule__Variable__Group_1_0__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1_0_2(), "rule__Variable__Group_1_0_2__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1_1(), "rule__Variable__Group_1_1__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1_1_2(), "rule__Variable__Group_1_1_2__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1_2(), "rule__Variable__Group_1_2__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getSimpleExpressionAccess().getGroup(), "rule__SimpleExpression__Group__0");
			builder.put(grammarAccess.getSimpleExpressionAccess().getGroup_1(), "rule__SimpleExpression__Group_1__0");
			builder.put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
			builder.put(grammarAccess.getSignedFactorAccess().getGroup(), "rule__SignedFactor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_0(), "rule__Factor__Group_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_2(), "rule__Factor__Group_2__0");
			builder.put(grammarAccess.getUnsignedConstantAccess().getGroup_3(), "rule__UnsignedConstant__Group_3__0");
			builder.put(grammarAccess.getFunctionDesignatorAccess().getGroup(), "rule__FunctionDesignator__Group__0");
			builder.put(grammarAccess.getParameterListAccess().getGroup(), "rule__ParameterList__Group__0");
			builder.put(grammarAccess.getParameterListAccess().getGroup_1(), "rule__ParameterList__Group_1__0");
			builder.put(grammarAccess.getGotoStatementAccess().getGroup(), "rule__GotoStatement__Group__0");
			builder.put(grammarAccess.getCompoundStatementAccess().getGroup(), "rule__CompoundStatement__Group__0");
			builder.put(grammarAccess.getStatementsAccess().getGroup(), "rule__Statements__Group__0");
			builder.put(grammarAccess.getStatementsAccess().getGroup_1(), "rule__Statements__Group_1__0");
			builder.put(grammarAccess.getCaseStatementAccess().getGroup(), "rule__CaseStatement__Group__0");
			builder.put(grammarAccess.getCaseStatementAccess().getGroup_4(), "rule__CaseStatement__Group_4__0");
			builder.put(grammarAccess.getCaseStatementAccess().getGroup_5(), "rule__CaseStatement__Group_5__0");
			builder.put(grammarAccess.getCaseListElementAccess().getGroup(), "rule__CaseListElement__Group__0");
			builder.put(grammarAccess.getPascalAccess().getProgramAssignment(), "rule__Pascal__ProgramAssignment");
			builder.put(grammarAccess.getProgramAccess().getHeadAssignment_0(), "rule__Program__HeadAssignment_0");
			builder.put(grammarAccess.getProgramAccess().getBlockAssignment_2(), "rule__Program__BlockAssignment_2");
			builder.put(grammarAccess.getProgramHeadingAccess().getIdentiferAssignment_1(), "rule__ProgramHeading__IdentiferAssignment_1");
			builder.put(grammarAccess.getProgramHeadingAccess().getIdentifierListAssignment_2_1(), "rule__ProgramHeading__IdentifierListAssignment_2_1");
			builder.put(grammarAccess.getIdentifierListAccess().getIdentifierAssignment_0(), "rule__IdentifierList__IdentifierAssignment_0");
			builder.put(grammarAccess.getIdentifierListAccess().getIdentifierAssignment_1_1(), "rule__IdentifierList__IdentifierAssignment_1_1");
			builder.put(grammarAccess.getBlockAccess().getLabelAssignment_1_0(), "rule__Block__LabelAssignment_1_0");
			builder.put(grammarAccess.getBlockAccess().getConstantDefinitionPartAssignment_1_1(), "rule__Block__ConstantDefinitionPartAssignment_1_1");
			builder.put(grammarAccess.getBlockAccess().getTypeDefinitionPartAssignment_1_2(), "rule__Block__TypeDefinitionPartAssignment_1_2");
			builder.put(grammarAccess.getBlockAccess().getVariableDeclarationPartAssignment_1_3(), "rule__Block__VariableDeclarationPartAssignment_1_3");
			builder.put(grammarAccess.getBlockAccess().getProcedureAndFunctionDeclarationPartAssignment_1_4(), "rule__Block__ProcedureAndFunctionDeclarationPartAssignment_1_4");
			builder.put(grammarAccess.getBlockAccess().getUsesUnitsPartAssignment_1_5(), "rule__Block__UsesUnitsPartAssignment_1_5");
			builder.put(grammarAccess.getBlockAccess().getCompoundStatementAssignment_2(), "rule__Block__CompoundStatementAssignment_2");
			builder.put(grammarAccess.getLabel_declaration_partAccess().getLabelAssignment_2_1(), "rule__Label_declaration_part__LabelAssignment_2_1");
			builder.put(grammarAccess.getLabelAccess().getUnsignedIntegerAssignment_0(), "rule__Label__UnsignedIntegerAssignment_0");
			builder.put(grammarAccess.getLabelAccess().getIdentifierAssignment_1(), "rule__Label__IdentifierAssignment_1");
			builder.put(grammarAccess.getUnsignedIntegerAccess().getNumberAssignment(), "rule__UnsignedInteger__NumberAssignment");
			builder.put(grammarAccess.getConstantDefinitionPartAccess().getConstantDefinitionAssignment_1_0(), "rule__ConstantDefinitionPart__ConstantDefinitionAssignment_1_0");
			builder.put(grammarAccess.getConstantDefinitionAccess().getIdentifierAssignment_0(), "rule__ConstantDefinition__IdentifierAssignment_0");
			builder.put(grammarAccess.getConstantDefinitionAccess().getConstantAssignment_2(), "rule__ConstantDefinition__ConstantAssignment_2");
			builder.put(grammarAccess.getConstantAccess().getNumberAssignment_0(), "rule__Constant__NumberAssignment_0");
			builder.put(grammarAccess.getConstantAccess().getSignAssignment_1_0(), "rule__Constant__SignAssignment_1_0");
			builder.put(grammarAccess.getConstantAccess().getNumber1Assignment_1_1(), "rule__Constant__Number1Assignment_1_1");
			builder.put(grammarAccess.getConstantAccess().getIdentifierAssignment_2(), "rule__Constant__IdentifierAssignment_2");
			builder.put(grammarAccess.getConstantAccess().getSTRING_LITERALAssignment_3(), "rule__Constant__STRING_LITERALAssignment_3");
			builder.put(grammarAccess.getConstantAccess().getSign2Assignment_4_0(), "rule__Constant__Sign2Assignment_4_0");
			builder.put(grammarAccess.getConstantAccess().getIdentifier1Assignment_4_1(), "rule__Constant__Identifier1Assignment_4_1");
			builder.put(grammarAccess.getConstantAccess().getConstantChrAssignment_5(), "rule__Constant__ConstantChrAssignment_5");
			builder.put(grammarAccess.getConstantChrAccess().getUnsignedIntegerAssignment_2(), "rule__ConstantChr__UnsignedIntegerAssignment_2");
			builder.put(grammarAccess.getUnsignedNumberAccess().getUnsignedIntegerAssignment_0(), "rule__UnsignedNumber__UnsignedIntegerAssignment_0");
			builder.put(grammarAccess.getUnsignedNumberAccess().getUnsignedRealAssignment_1(), "rule__UnsignedNumber__UnsignedRealAssignment_1");
			builder.put(grammarAccess.getUsesUnitsPartAccess().getIdentifierListAssignment_1(), "rule__UsesUnitsPart__IdentifierListAssignment_1");
			builder.put(grammarAccess.getTypeDefinitionPartAccess().getTypeDefinitionAssignment_1_0(), "rule__TypeDefinitionPart__TypeDefinitionAssignment_1_0");
			builder.put(grammarAccess.getTypeDefinitionAccess().getIndentifierAssignment_0(), "rule__TypeDefinition__IndentifierAssignment_0");
			builder.put(grammarAccess.getTypeDefinitionAccess().getTypeAssignment_2_0(), "rule__TypeDefinition__TypeAssignment_2_0");
			builder.put(grammarAccess.getTypeDefinitionAccess().getFunctionTypeAssignment_2_1(), "rule__TypeDefinition__FunctionTypeAssignment_2_1");
			builder.put(grammarAccess.getTypeDefinitionAccess().getProcedureTypeAssignment_2_2(), "rule__TypeDefinition__ProcedureTypeAssignment_2_2");
			builder.put(grammarAccess.getFunctionTypeAccess().getFormalParameterListAssignment_1(), "rule__FunctionType__FormalParameterListAssignment_1");
			builder.put(grammarAccess.getFunctionTypeAccess().getResultTypeAssignment_3(), "rule__FunctionType__ResultTypeAssignment_3");
			builder.put(grammarAccess.getFormalParameterListAccess().getFormalParameterSectionAssignment_1(), "rule__FormalParameterList__FormalParameterSectionAssignment_1");
			builder.put(grammarAccess.getFormalParameterListAccess().getFormalParameterSection2Assignment_2_1(), "rule__FormalParameterList__FormalParameterSection2Assignment_2_1");
			builder.put(grammarAccess.getFormalParameterSectionAccess().getParameterGroupAssignment_0(), "rule__FormalParameterSection__ParameterGroupAssignment_0");
			builder.put(grammarAccess.getFormalParameterSectionAccess().getParameterGroup2Assignment_1_1(), "rule__FormalParameterSection__ParameterGroup2Assignment_1_1");
			builder.put(grammarAccess.getFormalParameterSectionAccess().getParameterGroup3Assignment_2_1(), "rule__FormalParameterSection__ParameterGroup3Assignment_2_1");
			builder.put(grammarAccess.getFormalParameterSectionAccess().getParameterGroup4Assignment_3_1(), "rule__FormalParameterSection__ParameterGroup4Assignment_3_1");
			builder.put(grammarAccess.getParameterGroupAccess().getIdentifierListAssignment_0(), "rule__ParameterGroup__IdentifierListAssignment_0");
			builder.put(grammarAccess.getParameterGroupAccess().getTypeIdentifierAssignment_2(), "rule__ParameterGroup__TypeIdentifierAssignment_2");
			builder.put(grammarAccess.getTypeIdentifierAccess().getIdentifierAssignment_0(), "rule__TypeIdentifier__IdentifierAssignment_0");
			builder.put(grammarAccess.getProcedureTypeAccess().getFormalParameterListAssignment_2(), "rule__ProcedureType__FormalParameterListAssignment_2");
			builder.put(grammarAccess.getTypeAccess().getSimpleTypeAssignment_0(), "rule__Type__SimpleTypeAssignment_0");
			builder.put(grammarAccess.getTypeAccess().getStructuredTypeAssignment_1(), "rule__Type__StructuredTypeAssignment_1");
			builder.put(grammarAccess.getTypeAccess().getPointerTypeAssignment_2(), "rule__Type__PointerTypeAssignment_2");
			builder.put(grammarAccess.getPointerTypeAccess().getTypeIdentifierAssignment_1(), "rule__PointerType__TypeIdentifierAssignment_1");
			builder.put(grammarAccess.getSimpleTypeAccess().getScalarTypeAssignment_0(), "rule__SimpleType__ScalarTypeAssignment_0");
			builder.put(grammarAccess.getSimpleTypeAccess().getSubrangeTypeAssignment_1(), "rule__SimpleType__SubrangeTypeAssignment_1");
			builder.put(grammarAccess.getSimpleTypeAccess().getTypeIdentifierAssignment_2(), "rule__SimpleType__TypeIdentifierAssignment_2");
			builder.put(grammarAccess.getSimpleTypeAccess().getStringtypeAssignment_3(), "rule__SimpleType__StringtypeAssignment_3");
			builder.put(grammarAccess.getScalarTypeAccess().getIdentifierListAssignment_1(), "rule__ScalarType__IdentifierListAssignment_1");
			builder.put(grammarAccess.getSubrangeTypeAccess().getConstantAssignment_0(), "rule__SubrangeType__ConstantAssignment_0");
			builder.put(grammarAccess.getSubrangeTypeAccess().getConstant2Assignment_2(), "rule__SubrangeType__Constant2Assignment_2");
			builder.put(grammarAccess.getStructuredTypeAccess().getUnpackedStructuredTypeAssignment_0_1(), "rule__StructuredType__UnpackedStructuredTypeAssignment_0_1");
			builder.put(grammarAccess.getStructuredTypeAccess().getUnpackedStructuredType1Assignment_1(), "rule__StructuredType__UnpackedStructuredType1Assignment_1");
			builder.put(grammarAccess.getUnpackedStructuredTypeAccess().getRecordTypeAssignment(), "rule__UnpackedStructuredType__RecordTypeAssignment");
			builder.put(grammarAccess.getStringtypeAccess().getIdentifierAssignment_2_0(), "rule__Stringtype__IdentifierAssignment_2_0");
			builder.put(grammarAccess.getStringtypeAccess().getUnsignedNumberAssignment_2_1(), "rule__Stringtype__UnsignedNumberAssignment_2_1");
			builder.put(grammarAccess.getRecordTypeAccess().getFieldListAssignment_2(), "rule__RecordType__FieldListAssignment_2");
			builder.put(grammarAccess.getFieldListAccess().getFixedPartAssignment_0_0(), "rule__FieldList__FixedPartAssignment_0_0");
			builder.put(grammarAccess.getFieldListAccess().getVariantPartAssignment_0_1_1(), "rule__FieldList__VariantPartAssignment_0_1_1");
			builder.put(grammarAccess.getFieldListAccess().getVariantPart1Assignment_1(), "rule__FieldList__VariantPart1Assignment_1");
			builder.put(grammarAccess.getFixedPartAccess().getRecordSectionAssignment_0(), "rule__FixedPart__RecordSectionAssignment_0");
			builder.put(grammarAccess.getFixedPartAccess().getRecordSection1Assignment_1_1(), "rule__FixedPart__RecordSection1Assignment_1_1");
			builder.put(grammarAccess.getRecordSectionAccess().getIdentifierListAssignment_0(), "rule__RecordSection__IdentifierListAssignment_0");
			builder.put(grammarAccess.getRecordSectionAccess().getTypeAssignment_2(), "rule__RecordSection__TypeAssignment_2");
			builder.put(grammarAccess.getVariantPartAccess().getTagAssignment_1(), "rule__VariantPart__TagAssignment_1");
			builder.put(grammarAccess.getVariantPartAccess().getVariantAssignment_3(), "rule__VariantPart__VariantAssignment_3");
			builder.put(grammarAccess.getVariantPartAccess().getVariant1Assignment_4_1(), "rule__VariantPart__Variant1Assignment_4_1");
			builder.put(grammarAccess.getTagAccess().getIdentifierAssignment_0_0(), "rule__Tag__IdentifierAssignment_0_0");
			builder.put(grammarAccess.getTagAccess().getTypeIdentifierAssignment_0_2(), "rule__Tag__TypeIdentifierAssignment_0_2");
			builder.put(grammarAccess.getTagAccess().getTypeIdentifier1Assignment_1(), "rule__Tag__TypeIdentifier1Assignment_1");
			builder.put(grammarAccess.getVariantAccess().getConstantAssignment_1_1(), "rule__Variant__ConstantAssignment_1_1");
			builder.put(grammarAccess.getVariantAccess().getFieldListAssignment_4(), "rule__Variant__FieldListAssignment_4");
			builder.put(grammarAccess.getConstListAccess().getConstantAssignment_0(), "rule__ConstList__ConstantAssignment_0");
			builder.put(grammarAccess.getConstListAccess().getConstant1Assignment_1_1(), "rule__ConstList__Constant1Assignment_1_1");
			builder.put(grammarAccess.getVariableDeclarationPartAccess().getVariableDeclarationAssignment_1(), "rule__VariableDeclarationPart__VariableDeclarationAssignment_1");
			builder.put(grammarAccess.getVariableDeclarationPartAccess().getVariableDeclaration1Assignment_2_1(), "rule__VariableDeclarationPart__VariableDeclaration1Assignment_2_1");
			builder.put(grammarAccess.getVariableDeclarationAccess().getIdentifierListAssignment_0(), "rule__VariableDeclaration__IdentifierListAssignment_0");
			builder.put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2(), "rule__VariableDeclaration__TypeAssignment_2");
			builder.put(grammarAccess.getProcedureAndFunctionDeclarationPartAccess().getProcedureOrFunctionDeclarationAssignment_0(), "rule__ProcedureAndFunctionDeclarationPart__ProcedureOrFunctionDeclarationAssignment_0");
			builder.put(grammarAccess.getProcedureOrFunctionDeclarationAccess().getProcedureDeclarationAssignment_0(), "rule__ProcedureOrFunctionDeclaration__ProcedureDeclarationAssignment_0");
			builder.put(grammarAccess.getProcedureOrFunctionDeclarationAccess().getFunctionDeclarationAssignment_1(), "rule__ProcedureOrFunctionDeclaration__FunctionDeclarationAssignment_1");
			builder.put(grammarAccess.getProcedureDeclarationAccess().getIdentifierAssignment_1(), "rule__ProcedureDeclaration__IdentifierAssignment_1");
			builder.put(grammarAccess.getProcedureDeclarationAccess().getFormalParameterListAssignment_2(), "rule__ProcedureDeclaration__FormalParameterListAssignment_2");
			builder.put(grammarAccess.getProcedureDeclarationAccess().getBlockAssignment_4(), "rule__ProcedureDeclaration__BlockAssignment_4");
			builder.put(grammarAccess.getFunctionDeclarationAccess().getIdentifierAssignment_1(), "rule__FunctionDeclaration__IdentifierAssignment_1");
			builder.put(grammarAccess.getFunctionDeclarationAccess().getFormalParameterListAssignment_2(), "rule__FunctionDeclaration__FormalParameterListAssignment_2");
			builder.put(grammarAccess.getFunctionDeclarationAccess().getResultTypeAssignment_4(), "rule__FunctionDeclaration__ResultTypeAssignment_4");
			builder.put(grammarAccess.getFunctionDeclarationAccess().getBlockAssignment_6(), "rule__FunctionDeclaration__BlockAssignment_6");
			builder.put(grammarAccess.getStatementAccess().getUnlabelledStatementAssignment_0_2(), "rule__Statement__UnlabelledStatementAssignment_0_2");
			builder.put(grammarAccess.getStatementAccess().getUnlabelledStatementAssignment_1(), "rule__Statement__UnlabelledStatementAssignment_1");
			builder.put(grammarAccess.getUnlabelledStatementAccess().getSimpleStatementAssignment_0(), "rule__UnlabelledStatement__SimpleStatementAssignment_0");
			builder.put(grammarAccess.getUnlabelledStatementAccess().getStructuredStatementAssignment_1(), "rule__UnlabelledStatement__StructuredStatementAssignment_1");
			builder.put(grammarAccess.getUnlabelledStatementAccess().getIdentifierAssignment_2_0(), "rule__UnlabelledStatement__IdentifierAssignment_2_0");
			builder.put(grammarAccess.getUnlabelledStatementAccess().getParameterListAssignment_2_1_1(), "rule__UnlabelledStatement__ParameterListAssignment_2_1_1");
			builder.put(grammarAccess.getSimpleStatementAccess().getGotoStatementAssignment_1_0(), "rule__SimpleStatement__GotoStatementAssignment_1_0");
			builder.put(grammarAccess.getSimpleStatementAccess().getAssignmentStatementAssignment_1_1(), "rule__SimpleStatement__AssignmentStatementAssignment_1_1");
			builder.put(grammarAccess.getAssignmentStatementAccess().getVariableAssignment_0(), "rule__AssignmentStatement__VariableAssignment_0");
			builder.put(grammarAccess.getAssignmentStatementAccess().getExpressionAssignment_2(), "rule__AssignmentStatement__ExpressionAssignment_2");
			builder.put(grammarAccess.getVariableAccess().getIdentifierAssignment_0_0_1(), "rule__Variable__IdentifierAssignment_0_0_1");
			builder.put(grammarAccess.getVariableAccess().getIdentifierAssignment_0_1(), "rule__Variable__IdentifierAssignment_0_1");
			builder.put(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_1(), "rule__Variable__ExpressionAssignment_1_0_1");
			builder.put(grammarAccess.getVariableAccess().getExpression1Assignment_1_0_2_1(), "rule__Variable__Expression1Assignment_1_0_2_1");
			builder.put(grammarAccess.getVariableAccess().getExpression2Assignment_1_1_1(), "rule__Variable__Expression2Assignment_1_1_1");
			builder.put(grammarAccess.getVariableAccess().getExpression3Assignment_1_1_2_1(), "rule__Variable__Expression3Assignment_1_1_2_1");
			builder.put(grammarAccess.getVariableAccess().getIdentifier2Assignment_1_2_1(), "rule__Variable__Identifier2Assignment_1_2_1");
			builder.put(grammarAccess.getExpressionAccess().getSimpleExpressionAssignment_0(), "rule__Expression__SimpleExpressionAssignment_0");
			builder.put(grammarAccess.getExpressionAccess().getRelationaloperatorAssignment_1_0(), "rule__Expression__RelationaloperatorAssignment_1_0");
			builder.put(grammarAccess.getExpressionAccess().getExpressionAssignment_1_1(), "rule__Expression__ExpressionAssignment_1_1");
			builder.put(grammarAccess.getSimpleExpressionAccess().getTermAssignment_0(), "rule__SimpleExpression__TermAssignment_0");
			builder.put(grammarAccess.getSimpleExpressionAccess().getAdditiveoperatorAssignment_1_0(), "rule__SimpleExpression__AdditiveoperatorAssignment_1_0");
			builder.put(grammarAccess.getSimpleExpressionAccess().getSimpleExpressionAssignment_1_1(), "rule__SimpleExpression__SimpleExpressionAssignment_1_1");
			builder.put(grammarAccess.getTermAccess().getSignedFactorAssignment_0(), "rule__Term__SignedFactorAssignment_0");
			builder.put(grammarAccess.getTermAccess().getMultiplicativeoperatorAssignment_1_0(), "rule__Term__MultiplicativeoperatorAssignment_1_0");
			builder.put(grammarAccess.getTermAccess().getTermAssignment_1_1(), "rule__Term__TermAssignment_1_1");
			builder.put(grammarAccess.getSignedFactorAccess().getFactorAssignment_1(), "rule__SignedFactor__FactorAssignment_1");
			builder.put(grammarAccess.getFactorAccess().getExpressionAssignment_0_1(), "rule__Factor__ExpressionAssignment_0_1");
			builder.put(grammarAccess.getFactorAccess().getUnsignedConstantAssignment_1(), "rule__Factor__UnsignedConstantAssignment_1");
			builder.put(grammarAccess.getFactorAccess().getFactorAssignment_2_1(), "rule__Factor__FactorAssignment_2_1");
			builder.put(grammarAccess.getFactorAccess().getBoolAssignment_3(), "rule__Factor__BoolAssignment_3");
			builder.put(grammarAccess.getFactorAccess().getFunctionDesignatorAssignment_4(), "rule__Factor__FunctionDesignatorAssignment_4");
			builder.put(grammarAccess.getFactorAccess().getVariableAssignment_5(), "rule__Factor__VariableAssignment_5");
			builder.put(grammarAccess.getUnsignedConstantAccess().getUnsignedNumberAssignment_0(), "rule__UnsignedConstant__UnsignedNumberAssignment_0");
			builder.put(grammarAccess.getUnsignedConstantAccess().getString_literalAssignment_1(), "rule__UnsignedConstant__String_literalAssignment_1");
			builder.put(grammarAccess.getUnsignedConstantAccess().getConstantChrAssignment_2(), "rule__UnsignedConstant__ConstantChrAssignment_2");
			builder.put(grammarAccess.getFunctionDesignatorAccess().getIdentifierAssignment_0(), "rule__FunctionDesignator__IdentifierAssignment_0");
			builder.put(grammarAccess.getFunctionDesignatorAccess().getParameterListAssignment_2(), "rule__FunctionDesignator__ParameterListAssignment_2");
			builder.put(grammarAccess.getParameterListAccess().getActualParameterAssignment_1_1(), "rule__ParameterList__ActualParameterAssignment_1_1");
			builder.put(grammarAccess.getActualParameterAccess().getExpressionAssignment(), "rule__ActualParameter__ExpressionAssignment");
			builder.put(grammarAccess.getGotoStatementAccess().getLabelAssignment_1(), "rule__GotoStatement__LabelAssignment_1");
			builder.put(grammarAccess.getStructuredStatementAccess().getCompoundStatementAssignment_0(), "rule__StructuredStatement__CompoundStatementAssignment_0");
			builder.put(grammarAccess.getStructuredStatementAccess().getConditionalStatementAssignment_1(), "rule__StructuredStatement__ConditionalStatementAssignment_1");
			builder.put(grammarAccess.getStatementsAccess().getStatementAssignment_0(), "rule__Statements__StatementAssignment_0");
			builder.put(grammarAccess.getStatementsAccess().getStatementAssignment_1_1(), "rule__Statements__StatementAssignment_1_1");
			builder.put(grammarAccess.getConditionalStatementAccess().getCaseStatementAssignment(), "rule__ConditionalStatement__CaseStatementAssignment");
			builder.put(grammarAccess.getCaseStatementAccess().getExpressionAssignment_1(), "rule__CaseStatement__ExpressionAssignment_1");
			builder.put(grammarAccess.getCaseStatementAccess().getCaseListElementAssignment_3(), "rule__CaseStatement__CaseListElementAssignment_3");
			builder.put(grammarAccess.getCaseStatementAccess().getCaseListElement1Assignment_4_1(), "rule__CaseStatement__CaseListElement1Assignment_4_1");
			builder.put(grammarAccess.getCaseStatementAccess().getStatementsAssignment_5_2(), "rule__CaseStatement__StatementsAssignment_5_2");
			builder.put(grammarAccess.getCaseListElementAccess().getConstListAssignment_0(), "rule__CaseListElement__ConstListAssignment_0");
			builder.put(grammarAccess.getCaseListElementAccess().getStatementAssignment_2(), "rule__CaseListElement__StatementAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PascalGrammarAccess grammarAccess;

	@Override
	protected InternalPascalParser createParser() {
		InternalPascalParser result = new InternalPascalParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PascalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
