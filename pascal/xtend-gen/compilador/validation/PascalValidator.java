/**
 * generated by Xtext 2.15.0
 */
package compilador.validation;

import compilador.pascal.type;
import compilador.pascal.variableDeclaration;
import compilador.pascal.variableDeclarationPart;
import compilador.validation.AbstractPascalValidator;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class PascalValidator extends AbstractPascalValidator {
  public Map<String, String> variaveisDeclaradas = new HashMap<String, String>();
  
  public Map<String, type> variaveisTipo = new HashMap<String, type>();
  
  /**
   * variableDeclaration: Podemos declarar mais de uma variavel usando apenas uma palavra chave 'var',
   *  Ex: var nome1, nome2...
   *  Ent�o colocamos o id dessas variaveis no map, caso ja exista, retornar um erro de id duplicado
   *  Ao percorrer a lista, adicionar no mapa a variavel e o seu tipo declarado
   */
  @Check
  public void checkDeclaracaoVariavel(final variableDeclaration vd) {
    EList<String> nomesVar = vd.getIdentifierList().getIdentifierList();
    for (final String nome : nomesVar) {
    }
  }
  
  public type getTypeVar() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * variableDeclarationPart: Pode ter varias declaracoes:
   * 		Ex: var....; var ....;
   * Se for so uma, chama o metodo que verifica a declaracao
   * Se for uma lista, fazer um for na mesma e chamar o metodo que verifica a declaracao pra cada uma
   */
  @Check
  public void checkDeclaracao(final variableDeclarationPart decla) {
    variableDeclaration declaracaoUmaVar = decla.getVariableDeclaration();
    EList<variableDeclaration> listaDeclaracoes = decla.getVariableDeclaration1();
    if ((declaracaoUmaVar != null)) {
      this.checkDeclaracaoVariavel(declaracaoUmaVar);
    }
    if ((listaDeclaracoes != null)) {
      for (final variableDeclaration declaracao : listaDeclaracoes) {
        this.checkDeclaracaoVariavel(declaracao);
      }
    }
  }
}
