/*
 * generated by Xtext 2.15.0
 */
package compilador.validation

import org.eclipse.xtext.validation.Check
import compilador.pascal.caseStatement;
import compilador.pascal.*;

import java.util.HashMap
import java.util.Map
import compilador.pascal.structuredType
import compilador.pascal.pointerType
import compilador.pascal.identifier
import compilador.pascal.recordType
import java.util.HashSet
import compilador.pascal.typeDefinition
import compilador.pascal.expression
import compilador.pascal.variable
import compilador.pascal.unsignedConstant
import compilador.pascal.caseListElement
import org.eclipse.emf.common.util.EList

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PascalValidator extends AbstractPascalValidator {

	var variaveisDeclaradas = new HashMap<String, identifier>();
	var variaveisTipo = new HashMap<String, String>();
	var tiposCriados = new HashSet<String>();
	var funcoesCriadas = new HashMap<String, String>();


	@Check
	def restart(program init) {
		variaveisDeclaradas.clear();
		variaveisTipo.clear();
		tiposCriados.clear();
		funcoesCriadas.clear();
	}

	/* -------------------- block ----------------------  */
	/* -------------------- block -> typeDefinitionPart ----------------------  */
	@Check
	def checkDefinicoesTipo(typeDefinitionPart deftype) {
		if (deftype.typeDefinition !== null) {
			checkDefTipo(deftype.typeDefinition);
		}
		var definicoes = deftype.typeDefinition1;
		if (!definicoes.isNullOrEmpty()) {
			for (typeDefinition defPart : definicoes) {
				checkDefTipo(defPart);
			}
		}

	}

	def checkDefTipo(typeDefinition definition) {
		var tipoCriado = definition.identifier.identifier;

		if (tiposCriados.contains(tipoCriado)) {
			error("um tipo ja foi criado com id " + tipoCriado, null);
		} else {
			tiposCriados.add(tipoCriado);
		}
	}

	/* -------------------- block -> variableDeclarationPart ----------------------  */
	/**
	 * variableDeclaration: Podemos declarar mais de uma variavel usando apenas uma palavra chave 'var',
	 *  Ex: var nome1, nome2...
	 *  Ent�o colocamos o id dessas variaveis no map, caso ja exista, retornar um erro de id duplicado
	 *  Ao percorrer a lista, adicionar no mapa a variavel e o seu tipo declarado
	 */
	def checkDeclaracaoVariavel(variableDeclaration vd) {
		var declaracoes = vd.identifierList.identifierList1;
		var declaracaoUnica = vd.identifierList.identifier;

		if (!declaracoes.isNullOrEmpty()) {
			for (identifier id : declaracoes) {
				if (jaDeclarada(id)) {
					error("id variavel duplicado: " + id.identifier, null, id.identifier);
				} else {
					variaveisDeclaradas.put(id.identifier, id);
					variaveisTipo.put(id.identifier, getTypeVar(vd.type));
				}
			}
		}
		if (declaracaoUnica !== null && jaDeclarada(declaracaoUnica)) {
			error("id variavel duplicado: " + declaracaoUnica.identifier, null, declaracaoUnica.identifier);
		} else {
			variaveisDeclaradas.put(declaracaoUnica.identifier, declaracaoUnica);
			variaveisTipo.put(declaracaoUnica.identifier, getTypeVar(vd.type));
		}

	}

	def boolean jaDeclarada(identifier variavel) {
		return (this.variaveisDeclaradas.containsKey(variavel.identifier))
	}

	def String getTypeVar(type tipoVariavel) {

		if (tipoVariavel.simpleType !== null) {
			return getSimpleType(tipoVariavel);
		}
		if (tipoVariavel.structuredType !== null) {
			return getStructuredType(tipoVariavel.structuredType);
		}

		if (tipoVariavel.pointerType !== null) {
			return getPointerType(tipoVariavel.pointerType);
		}
	}

	def getSimpleType(type st) {
		// scalarType   TO-DO: N�O ENTENDI MUITO BEM COMO FUNCIONA ESSE SCALARTYPE ://
		// subrangeType
		if (st.simpleType.subrangeType !== null) {
			if (st.simpleType.subrangeType.constant !== null && st.simpleType.subrangeType.constant2 !== null) {
				return "range";
			} else {
				error("sao necessarias duas constantes para  intervalo", null);
			}
		}

		// typeIdentifier
		if (st.simpleType.typeIdentifier !== null) {
			return getTypeTypeIdentifier(st.simpleType.typeIdentifier);
		}

		if (st.simpleType.stringtype !== null) {
//			return st.stringtype;
		}
	// stringType
	//
	}

	def getTypeTypeIdentifier(typeIdentifier ti) {
		if (ti.char !== null) {
			return (ti.char);
		}

		if (ti.boolean !== null) {
			return (ti.boolean);
		}
		if (ti.integer !== null) {
			return (ti.integer);
		}
		if (ti.real !== null) {
			return (ti.real);
		}
		if (ti.string !== null) {
			return (ti.string);
		}

		if (ti.identifier !== null) {
			if (!tiposCriados.contains(ti.identifier.identifier)) {
				error("tipo " + ti.identifier.identifier + " nao existe!", null);
			} else {
				return ti.identifier.identifier;
			}
		// Verificacao pra quando sao criados tipos durante o programa,
		// precisa criar um Map de "tipos criados pra fazer essa verifica��o					
		}
	}

	/**
	 * Retonar o tipo "record" da variavel, como na declaracao queremos apenas guardar qual o tipo daquela variavel
	 * ser� guardado no mapa de declaracao <identifier, "record">
	 */
	def String getStructuredType(structuredType type) {
		// Record eh structured type, nao sei seprecisaria verificar array, set, etc... 
		var unpackeds = type.unpackedStructuredType1;
		if (!unpackeds.isNullOrEmpty()) {
			for (unpackedStructuredType t : unpackeds) {
				var possivelRecord = t.recordType;

				if (possivelRecord !== null) {
					return "record";
				}
			}
		}
	}

	def String getPointerType(pointerType type) {
		if (type.pointerType !== null) {
			return "^"
		}
	}

	/**
	 * variableDeclarationPart: Pode ter varias declaracoes: 
	 * 		Ex: var....; var ....;
	 * Se for so uma, chama o metodo que verifica a declaracao
	 * Se for uma lista, fazer um for na mesma e chamar o metodo que verifica a declaracao pra cada uma
	 */
	@Check
	def checkDeclaracao(variableDeclarationPart decla) {
		var declaracaoUmaVar = decla.variableDeclaration;
		var listaDeclaracoes = decla.variableDeclaration1;

		if (declaracaoUmaVar !== null) {
			checkDeclaracaoVariavel(declaracaoUmaVar);
		}

		if (!listaDeclaracoes.isNullOrEmpty()) {
			for (variableDeclaration declaracao : listaDeclaracoes) {
				checkDeclaracaoVariavel(declaracao);
			}
		}

	}

	@Check
	def checkConditionalStatement(conditionalStatement cst) {
		var caseStatement = cst.caseStatement;
		var expType = checkExpressionType(caseStatement.expression);
		if (expType.isEmpty()) {
			error("variavel nao declarada. tipo do case invalido", null);
		}

		var String tipoCaseUnico = getCaseListUnico(caseStatement.caseListElement);
		var boolean listaTodaValida = checkCaseList(caseStatement.caseListElement1, tipoCaseUnico);

		if (tipoCaseUnico.isEmpty() || !listaTodaValida || tipoCaseUnico !== expType) {
			error("Tipos incompativeis", null);
		}

	}

	def boolean checkCaseList(EList<caseListElement> list, String expType) {
		var boolean isValido = true;
		for (caseListElement e : list) {
			if (getCaseListUnico(e).isEmpty() || getCaseListUnico(e) !== expType) {
				isValido = false;
			}
		}

		return isValido;

	}

	def String getCaseListUnico(caseListElement element) {
		var constant constUnica = element.constList.constant;
		var EList<constant> constLista = element.constList.constant1;
		var String tipoPrincipal;

		if (constUnica !== null) {
			tipoPrincipal = getTypeConst(constUnica);
		}

		if (!constLista.isNullOrEmpty()) {
			for (constant e : constLista) {
				if (!tipoPrincipal.equalsIgnoreCase(getTypeConst(e))) {
					tipoPrincipal = "";

					return "";
				}
			}

		}

		return tipoPrincipal;
	}

	def String getTypeConst(constant c) {
		if (c.string !== null) {
			return "string";
		}

		if (c.constantChr !== null) {
			return "char";

		}

		if (c.bool !== null) {
			return "boolean";
		}

		if (c.identifier !== null) {
			// veriicar se tipo existe
		}
		if (c.unsignedNumber.unsignedReal !== null) {
			return "real";
		}

		if (c.unsignedNumber !== null) {
			return "integer";
		}

	}

	def String checkExpressionType(expression expression) {
		var String tipoExp = "";
		var simple = expression.simpleExpression.term.signedFactor.factor;

		if (simple.unsignedConstant !== null) {
			tipoExp = getTypeUnsignedConst(simple.unsignedConstant);
		}

		if (simple.factor !== null) {
			tipoExp = "boolean";
		}

		if (simple.bool !== null) {
			tipoExp = "boolean";
		}

		if (simple.functionDesignator !== null) {
			var funcao = funcoesCriadas.get(simple.functionDesignator.identifier.identifier);
			if (funcao !== null && !funcao.isEmpty()) {
				tipoExp = funcao;
			} else {
				error("funcao nao declarada", null);
				return "";
			}
		}

		if (simple.variable !== null) {
			tipoExp = getTypeVariable(simple.variable);
		}

		if (simple.expression !== null) {
			tipoExp = checkExpressionType(simple.expression);
		}

		if (expression.relationaloperator !== null) {
			tipoExp = "boolean";
		}

		if (expression.simpleExpression.additiveoperator !== null) {
			tipoExp = "integer";
		}

		if (expression.simpleExpression.term.multiplicativeoperator !== null) {
			tipoExp = "integer";
		}
		
		return tipoExp;

	}
	def String getTypeUnsignedConst(unsignedConstant constant) {
		if (constant.unsignedNumber !== null) {
			if (constant.unsignedNumber.unsignedInteger !== null) {
				return "integer";
			}

			if (constant.unsignedNumber.unsignedReal !== null) {
				return "real";
			}
		}

		if (constant.string_literal !== null) {
			return "string";
		}

		if (constant.constantChr !== null) {
			return "integer";
		}

	}

	def String getTypeVariable(variable variable) {
		var possivelTipoDeclarado = variable.identifier.identifier;
		if (variaveisDeclaradas.containsKey(possivelTipoDeclarado)) {
			return variaveisDeclaradas.get(possivelTipoDeclarado).identifier;
		} else {
			return "";
		}
	}

	@Check
	def boolean checkRelationalExpression(expression exp) {
		var expType = checkRelationOperands(exp);

		if (exp.expression !== null) {
			if (exp.relationaloperator !== null) {
				var rightExp = checkRelationOperands(exp.expression);
				if (expType.equals(rightExp)) {
					return checkRelationalExpression(exp.expression);
				}
				error("Tipos n�o conferem", null);
				return false;

			}

		}
		return true;

	}
	
	def String checkRelationOperands(expression expression) {
		var String tipoExp = "";
		var simple = expression.simpleExpression.term.signedFactor.factor;

		if (simple.unsignedConstant !== null) {
			tipoExp = getTypeUnsignedConst(simple.unsignedConstant);
		}

		if (simple.factor !== null) {
			tipoExp = "boolean";
		}

		if (simple.bool !== null) {
			tipoExp = "boolean";
		}

		if (simple.functionDesignator !== null) {
			var funcao = funcoesCriadas.get(simple.functionDesignator.identifier.identifier);
			if (funcao !== null && !funcao.isEmpty()) {
				tipoExp = funcao;
			} else {
				error("funcao nao declarada", null);
				return "";
			}
		}

		if (simple.variable !== null) {
			tipoExp = getTypeVariable(simple.variable);
		}

		if (simple.expression !== null) {
			tipoExp = checkExpressionType(simple.expression);
		}

		return tipoExp;
	}
	
	@Check
	def checkAssignmentStatement(assignmentStatement assign) {
		var vari = assign.variable;
		if (variaveisDeclaradas.containsKey(vari.identifier.identifier)) {
			var varType = variaveisTipo.get(vari.identifier.identifier);
			var expType = checkExpressionType(assign.expression);
			
			if (!varType.equals(expType)) {
				error("Variavel declarada com tipo diferente", null);
			}
		} else {
			error("Variavel n�o declarada", null)
		}
	}

	@Check
	def registerFunction(functionDeclaration funcDecl) {
		if (funcoesCriadas.containsKey(funcDecl.identifier.identifier)) {
			error("funcao de nome " + funcDecl.identifier.identifier + " j� existe", null);
		} else {
			funcoesCriadas.put(funcDecl.identifier.identifier, getTypeTypeIdentifier(funcDecl.typeIdentifier))
		}
	}



	@Check
	def runChecks(block b) {
//		var declaracoes = b.variableDeclarationParts;
//		for (variableDeclarationPart e : declaracoes) {
//			checkDeclaracao(e);
//		}
	}
}
