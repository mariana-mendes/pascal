/**
 * generated by Xtext 2.15.0
 */
package compilador.validation;

import compilador.pascal.block;
import compilador.pascal.identifier;
import compilador.pascal.pointerType;
import compilador.pascal.program;
import compilador.pascal.recordType;
import compilador.pascal.simpleType;
import compilador.pascal.stringtype;
import compilador.pascal.structuredType;
import compilador.pascal.subrangeType;
import compilador.pascal.type;
import compilador.pascal.typeDefinition;
import compilador.pascal.typeDefinitionPart;
import compilador.pascal.typeIdentifier;
import compilador.pascal.unpackedStructuredType;
import compilador.pascal.variableDeclaration;
import compilador.pascal.variableDeclarationPart;
import compilador.validation.AbstractPascalValidator;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class PascalValidator extends AbstractPascalValidator {
  private HashMap<String, identifier> variaveisDeclaradas = new HashMap<String, identifier>();
  
  private HashMap<String, String> variaveisTipo = new HashMap<String, String>();
  
  private HashSet<String> tiposCriados = new HashSet<String>();
  
  @Check
  public void restart(final program init) {
    this.variaveisDeclaradas.clear();
    this.variaveisTipo.clear();
    this.tiposCriados.clear();
  }
  
  /**
   * -------------------- block -> typeDefinitionPart ----------------------
   */
  @Check
  public void checkDefinicoesTipo(final typeDefinitionPart deftype) {
    typeDefinition _typeDefinition = deftype.getTypeDefinition();
    boolean _tripleNotEquals = (_typeDefinition != null);
    if (_tripleNotEquals) {
      this.checkDefTipo(deftype.getTypeDefinition());
    }
    EList<typeDefinition> definicoes = deftype.getTypeDefinition1();
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(definicoes);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      for (final typeDefinition defPart : definicoes) {
        this.checkDefTipo(defPart);
      }
    }
  }
  
  public Boolean checkDefTipo(final typeDefinition definition) {
    boolean _xblockexpression = false;
    {
      String tipoCriado = definition.getIdentifier().getIdentifier();
      InputOutput.<String>println(tipoCriado);
      boolean _xifexpression = false;
      boolean _contains = this.tiposCriados.contains(tipoCriado);
      if (_contains) {
        this.error(("um tipo ja foi criado com id " + tipoCriado), null);
      } else {
        _xifexpression = this.tiposCriados.add(tipoCriado);
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  /**
   * variableDeclaration: Podemos declarar mais de uma variavel usando apenas uma palavra chave 'var',
   *  Ex: var nome1, nome2...
   *  Ent�o colocamos o id dessas variaveis no map, caso ja exista, retornar um erro de id duplicado
   *  Ao percorrer a lista, adicionar no mapa a variavel e o seu tipo declarado
   */
  public String checkDeclaracaoVariavel(final variableDeclaration vd) {
    String _xblockexpression = null;
    {
      EList<identifier> declaracoes = vd.getIdentifierList().getIdentifierList1();
      identifier declaracaoUnica = vd.getIdentifierList().getIdentifier();
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(declaracoes);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        for (final identifier id : declaracoes) {
          boolean _jaDeclarada = this.jaDeclarada(id);
          if (_jaDeclarada) {
            String _identifier = id.getIdentifier();
            String _plus = ("id variavel duplicado: " + _identifier);
            this.error(_plus, null, id.getIdentifier());
          } else {
            this.variaveisDeclaradas.put(id.getIdentifier(), id);
            this.variaveisTipo.put(id.getIdentifier(), this.getTypeVar(vd.getType()));
          }
        }
      }
      String _xifexpression = null;
      if (((declaracaoUnica != null) && this.jaDeclarada(declaracaoUnica))) {
        String _identifier_1 = declaracaoUnica.getIdentifier();
        String _plus_1 = ("id variavel duplicado: " + _identifier_1);
        this.error(_plus_1, null, declaracaoUnica.getIdentifier());
      } else {
        String _xblockexpression_1 = null;
        {
          this.variaveisDeclaradas.put(declaracaoUnica.getIdentifier(), declaracaoUnica);
          InputOutput.<String>println(declaracaoUnica.getIdentifier());
          _xblockexpression_1 = this.variaveisTipo.put(declaracaoUnica.getIdentifier(), this.getTypeVar(vd.getType()));
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean jaDeclarada(final identifier variavel) {
    return this.variaveisDeclaradas.containsKey(variavel.getIdentifier());
  }
  
  public String getTypeVar(final type tipoVariavel) {
    simpleType _simpleType = tipoVariavel.getSimpleType();
    boolean _tripleNotEquals = (_simpleType != null);
    if (_tripleNotEquals) {
      return this.getSimpleType(tipoVariavel);
    }
    structuredType _structuredType = tipoVariavel.getStructuredType();
    boolean _tripleNotEquals_1 = (_structuredType != null);
    if (_tripleNotEquals_1) {
      return this.getStructuredType(tipoVariavel.getStructuredType());
    }
    pointerType _pointerType = tipoVariavel.getPointerType();
    boolean _tripleNotEquals_2 = (_pointerType != null);
    if (_tripleNotEquals_2) {
      return this.getPointerType(tipoVariavel.getPointerType());
    }
    return null;
  }
  
  public String getSimpleType(final type st) {
    Object _xblockexpression = null;
    {
      subrangeType _subrangeType = st.getSimpleType().getSubrangeType();
      boolean _tripleNotEquals = (_subrangeType != null);
      if (_tripleNotEquals) {
        if (((st.getSimpleType().getSubrangeType().getConstant() != null) && (st.getSimpleType().getSubrangeType().getConstant2() != null))) {
          return "range";
        } else {
          this.error("sao necessarias duas constantes para  intervalo", null);
        }
      }
      typeIdentifier _typeIdentifier = st.getSimpleType().getTypeIdentifier();
      boolean _tripleNotEquals_1 = (_typeIdentifier != null);
      if (_tripleNotEquals_1) {
        String _char = st.getSimpleType().getTypeIdentifier().getChar();
        boolean _tripleNotEquals_2 = (_char != null);
        if (_tripleNotEquals_2) {
          return st.getSimpleType().getTypeIdentifier().getChar();
        }
        String _boolean = st.getSimpleType().getTypeIdentifier().getBoolean();
        boolean _tripleNotEquals_3 = (_boolean != null);
        if (_tripleNotEquals_3) {
          return st.getSimpleType().getTypeIdentifier().getBoolean();
        }
        String _integer = st.getSimpleType().getTypeIdentifier().getInteger();
        boolean _tripleNotEquals_4 = (_integer != null);
        if (_tripleNotEquals_4) {
          return st.getSimpleType().getTypeIdentifier().getInteger();
        }
        String _real = st.getSimpleType().getTypeIdentifier().getReal();
        boolean _tripleNotEquals_5 = (_real != null);
        if (_tripleNotEquals_5) {
          return st.getSimpleType().getTypeIdentifier().getReal();
        }
        String _string = st.getSimpleType().getTypeIdentifier().getString();
        boolean _tripleNotEquals_6 = (_string != null);
        if (_tripleNotEquals_6) {
          return st.getSimpleType().getTypeIdentifier().getString();
        }
        identifier _identifier = st.getSimpleType().getTypeIdentifier().getIdentifier();
        boolean _tripleNotEquals_7 = (_identifier != null);
        if (_tripleNotEquals_7) {
          boolean _contains = this.tiposCriados.contains(st.getSimpleType().getTypeIdentifier().getIdentifier().getIdentifier());
          boolean _not = (!_contains);
          if (_not) {
            String _identifier_1 = st.getSimpleType().getTypeIdentifier().getIdentifier().getIdentifier();
            String _plus = ("tipo " + _identifier_1);
            String _plus_1 = (_plus + " nao existe!");
            this.error(_plus_1, null);
          } else {
            return st.getSimpleType().getTypeIdentifier().getIdentifier().getIdentifier();
          }
        }
      }
      Object _xifexpression = null;
      stringtype _stringtype = st.getSimpleType().getStringtype();
      boolean _tripleNotEquals_8 = (_stringtype != null);
      if (_tripleNotEquals_8) {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return ((String)_xblockexpression);
  }
  
  /**
   * Retonar o tipo "record" da variavel, como na declaracao queremos apenas guardar qual o tipo daquela variavel
   * ser� guardado no mapa de declaracao <identifier, "record">
   */
  public String getStructuredType(final structuredType type) {
    Object _xblockexpression = null;
    {
      EList<unpackedStructuredType> unpackeds = type.getUnpackedStructuredType1();
      Object _xifexpression = null;
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(unpackeds);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        for (final unpackedStructuredType t : unpackeds) {
          {
            recordType possivelRecord = t.getRecordType();
            if ((possivelRecord != null)) {
              return "record";
            }
          }
        }
      }
      _xblockexpression = _xifexpression;
    }
    return ((String)_xblockexpression);
  }
  
  public String getPointerType(final pointerType type) {
    String _pointerType = this.getPointerType(type);
    boolean _tripleNotEquals = (_pointerType != null);
    if (_tripleNotEquals) {
      return "^";
    }
    return null;
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
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(listaDeclaracoes);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      for (final variableDeclaration declaracao : listaDeclaracoes) {
        this.checkDeclaracaoVariavel(declaracao);
      }
    }
  }
  
  @Check
  public Object runChecks(final block b) {
    return null;
  }
}
