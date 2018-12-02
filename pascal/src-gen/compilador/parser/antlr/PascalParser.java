/*
 * generated by Xtext 2.15.0
 */
package compilador.parser.antlr;

import com.google.inject.Inject;
import compilador.parser.antlr.internal.InternalPascalParser;
import compilador.services.PascalGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PascalParser extends AbstractAntlrParser {

	@Inject
	private PascalGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPascalParser createParser(XtextTokenStream stream) {
		return new InternalPascalParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "pascal";
	}

	public PascalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}