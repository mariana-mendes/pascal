package compilador.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import compilador.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_NUM", "RULE_STRING_LITERAL", "RULE_NUM_REAL", "RULE_BOOL", "RULE_EXPONENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'.'", "'program'", "'('", "')'", "';'", "','", "'implemetation'", "'label'", "'const'", "'='", "'chr'", "'+'", "'-'", "'uses'", "'type'", "'function'", "':'", "'var'", "'procedure'", "'char'", "'boolean'", "'integer'", "'real'", "'string'", "'^'", "'..'", "'packed'", "'['", "']'", "'record'", "'end'", "'case'", "'of'", "':='", "'@'", "'(.'", "'.)'", "'<>'", "'<'", "'<='", "'>='", "'>'", "'in'", "'or'", "'*'", "'/'", "'div'", "'mod'", "'and'", "'not'", "'nil'", "'goto'", "'begin'", "'else'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_NUM=5;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=12;
    public static final int RULE_STRING_LITERAL=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_NUM_REAL=7;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=8;
    public static final int RULE_EXPONENT=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }



     	private PascalGrammarAccess grammarAccess;

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "pascal";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulepascal"
    // InternalPascal.g:64:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // InternalPascal.g:64:47: (iv_rulepascal= rulepascal EOF )
            // InternalPascal.g:65:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalPascal.g:71:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( ( (lv_program_0_0= ruleprogram ) ) )
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            {
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            {
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            // InternalPascal.g:80:4: lv_program_0_0= ruleprogram
            {

            				newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleprogram();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPascalRule());
            				}
            				add(
            					current,
            					"program",
            					lv_program_0_0,
            					"compilador.Pascal.program");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:100:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:100:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:101:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:107:1: ruleprogram returns [EObject current=null] : ( ( (lv_head_0_0= ruleprogramHeading ) ) (otherlv_1= 'interface' )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_head_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:113:2: ( ( ( (lv_head_0_0= ruleprogramHeading ) ) (otherlv_1= 'interface' )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' ) )
            // InternalPascal.g:114:2: ( ( (lv_head_0_0= ruleprogramHeading ) ) (otherlv_1= 'interface' )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )
            {
            // InternalPascal.g:114:2: ( ( (lv_head_0_0= ruleprogramHeading ) ) (otherlv_1= 'interface' )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )
            // InternalPascal.g:115:3: ( (lv_head_0_0= ruleprogramHeading ) ) (otherlv_1= 'interface' )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.'
            {
            // InternalPascal.g:115:3: ( (lv_head_0_0= ruleprogramHeading ) )
            // InternalPascal.g:116:4: (lv_head_0_0= ruleprogramHeading )
            {
            // InternalPascal.g:116:4: (lv_head_0_0= ruleprogramHeading )
            // InternalPascal.g:117:5: lv_head_0_0= ruleprogramHeading
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHeadProgramHeadingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_head_0_0=ruleprogramHeading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_0_0,
            						"compilador.Pascal.programHeading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:134:3: (otherlv_1= 'interface' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:135:4: otherlv_1= 'interface'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getInterfaceKeyword_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:140:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:141:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:141:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:142:5: lv_block_2_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_block_2_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_2_0,
            						"compilador.Pascal.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getFullStopKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogramHeading"
    // InternalPascal.g:167:1: entryRuleprogramHeading returns [EObject current=null] : iv_ruleprogramHeading= ruleprogramHeading EOF ;
    public final EObject entryRuleprogramHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogramHeading = null;


        try {
            // InternalPascal.g:167:55: (iv_ruleprogramHeading= ruleprogramHeading EOF )
            // InternalPascal.g:168:2: iv_ruleprogramHeading= ruleprogramHeading EOF
            {
             newCompositeNode(grammarAccess.getProgramHeadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogramHeading=ruleprogramHeading();

            state._fsp--;

             current =iv_ruleprogramHeading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogramHeading"


    // $ANTLR start "ruleprogramHeading"
    // InternalPascal.g:174:1: ruleprogramHeading returns [EObject current=null] : (otherlv_0= 'program' ( (lv_identifer_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleprogramHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_identifer_1_0 = null;

        EObject lv_identifierList_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:180:2: ( (otherlv_0= 'program' ( (lv_identifer_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalPascal.g:181:2: (otherlv_0= 'program' ( (lv_identifer_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalPascal.g:181:2: (otherlv_0= 'program' ( (lv_identifer_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalPascal.g:182:3: otherlv_0= 'program' ( (lv_identifer_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramHeadingAccess().getProgramKeyword_0());
            		
            // InternalPascal.g:186:3: ( (lv_identifer_1_0= ruleidentifier ) )
            // InternalPascal.g:187:4: (lv_identifer_1_0= ruleidentifier )
            {
            // InternalPascal.g:187:4: (lv_identifer_1_0= ruleidentifier )
            // InternalPascal.g:188:5: lv_identifer_1_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getProgramHeadingAccess().getIdentiferIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_identifer_1_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramHeadingRule());
            					}
            					set(
            						current,
            						"identifer",
            						lv_identifer_1_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:205:3: (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:206:4: otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgramHeadingAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalPascal.g:210:4: ( (lv_identifierList_3_0= ruleidentifierList ) )
                    // InternalPascal.g:211:5: (lv_identifierList_3_0= ruleidentifierList )
                    {
                    // InternalPascal.g:211:5: (lv_identifierList_3_0= ruleidentifierList )
                    // InternalPascal.g:212:6: lv_identifierList_3_0= ruleidentifierList
                    {

                    						newCompositeNode(grammarAccess.getProgramHeadingAccess().getIdentifierListIdentifierListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_identifierList_3_0=ruleidentifierList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramHeadingRule());
                    						}
                    						set(
                    							current,
                    							"identifierList",
                    							lv_identifierList_3_0,
                    							"compilador.Pascal.identifierList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgramHeadingAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgramHeadingAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogramHeading"


    // $ANTLR start "entryRuleidentifierList"
    // InternalPascal.g:242:1: entryRuleidentifierList returns [EObject current=null] : iv_ruleidentifierList= ruleidentifierList EOF ;
    public final EObject entryRuleidentifierList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifierList = null;


        try {
            // InternalPascal.g:242:55: (iv_ruleidentifierList= ruleidentifierList EOF )
            // InternalPascal.g:243:2: iv_ruleidentifierList= ruleidentifierList EOF
            {
             newCompositeNode(grammarAccess.getIdentifierListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifierList=ruleidentifierList();

            state._fsp--;

             current =iv_ruleidentifierList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifierList"


    // $ANTLR start "ruleidentifierList"
    // InternalPascal.g:249:1: ruleidentifierList returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= ',' ( (lv_identifier_2_0= ruleidentifier ) ) )* ) ;
    public final EObject ruleidentifierList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_identifier_0_0 = null;

        AntlrDatatypeRuleToken lv_identifier_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:255:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= ',' ( (lv_identifier_2_0= ruleidentifier ) ) )* ) )
            // InternalPascal.g:256:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= ',' ( (lv_identifier_2_0= ruleidentifier ) ) )* )
            {
            // InternalPascal.g:256:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= ',' ( (lv_identifier_2_0= ruleidentifier ) ) )* )
            // InternalPascal.g:257:3: ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= ',' ( (lv_identifier_2_0= ruleidentifier ) ) )*
            {
            // InternalPascal.g:257:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:258:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:258:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:259:5: lv_identifier_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getIdentifierListAccess().getIdentifierIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentifierListRule());
            					}
            					add(
            						current,
            						"identifier",
            						lv_identifier_0_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:276:3: (otherlv_1= ',' ( (lv_identifier_2_0= ruleidentifier ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:277:4: otherlv_1= ',' ( (lv_identifier_2_0= ruleidentifier ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifierListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:281:4: ( (lv_identifier_2_0= ruleidentifier ) )
            	    // InternalPascal.g:282:5: (lv_identifier_2_0= ruleidentifier )
            	    {
            	    // InternalPascal.g:282:5: (lv_identifier_2_0= ruleidentifier )
            	    // InternalPascal.g:283:6: lv_identifier_2_0= ruleidentifier
            	    {

            	    						newCompositeNode(grammarAccess.getIdentifierListAccess().getIdentifierIdentifierParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_identifier_2_0=ruleidentifier();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIdentifierListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"identifier",
            	    							lv_identifier_2_0,
            	    							"compilador.Pascal.identifier");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifierList"


    // $ANTLR start "entryRuleidentifier"
    // InternalPascal.g:305:1: entryRuleidentifier returns [String current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final String entryRuleidentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier = null;


        try {
            // InternalPascal.g:305:50: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalPascal.g:306:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // InternalPascal.g:312:1: ruleidentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENT_0= RULE_IDENT ;
    public final AntlrDatatypeRuleToken ruleidentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;


        	enterRule();

        try {
            // InternalPascal.g:318:2: (this_IDENT_0= RULE_IDENT )
            // InternalPascal.g:319:2: this_IDENT_0= RULE_IDENT
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            		current.merge(this_IDENT_0);
            	

            		newLeafNode(this_IDENT_0, grammarAccess.getIdentifierAccess().getIDENTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:329:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:329:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:330:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:336:1: ruleblock returns [EObject current=null] : ( () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        EObject lv_label_1_0 = null;

        EObject lv_constantDefinitionPart_2_0 = null;

        EObject lv_typeDefinitionPart_3_0 = null;

        EObject lv_variableDeclarationPart_4_0 = null;

        EObject lv_procedureAndFunctionDeclarationPart_5_0 = null;

        EObject lv_usesUnitsPart_6_0 = null;

        EObject lv_compoundStatement_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:342:2: ( ( () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) ) ) )
            // InternalPascal.g:343:2: ( () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) ) )
            {
            // InternalPascal.g:343:2: ( () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) ) )
            // InternalPascal.g:344:3: () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) )
            {
            // InternalPascal.g:344:3: ()
            // InternalPascal.g:345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            // InternalPascal.g:351:3: ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )*
            loop4:
            do {
                int alt4=8;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    alt4=1;
                    }
                    break;
                case 26:
                    {
                    alt4=2;
                    }
                    break;
                case 32:
                    {
                    alt4=3;
                    }
                    break;
                case 35:
                    {
                    alt4=4;
                    }
                    break;
                case 33:
                case 36:
                    {
                    alt4=5;
                    }
                    break;
                case 31:
                    {
                    alt4=6;
                    }
                    break;
                case 24:
                    {
                    alt4=7;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalPascal.g:352:4: ( (lv_label_1_0= rulelabel_declaration_part ) )
            	    {
            	    // InternalPascal.g:352:4: ( (lv_label_1_0= rulelabel_declaration_part ) )
            	    // InternalPascal.g:353:5: (lv_label_1_0= rulelabel_declaration_part )
            	    {
            	    // InternalPascal.g:353:5: (lv_label_1_0= rulelabel_declaration_part )
            	    // InternalPascal.g:354:6: lv_label_1_0= rulelabel_declaration_part
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getLabelLabel_declaration_partParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_label_1_0=rulelabel_declaration_part();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"label",
            	    							lv_label_1_0,
            	    							"compilador.Pascal.label_declaration_part");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:372:4: ( (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart ) )
            	    {
            	    // InternalPascal.g:372:4: ( (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart ) )
            	    // InternalPascal.g:373:5: (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart )
            	    {
            	    // InternalPascal.g:373:5: (lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart )
            	    // InternalPascal.g:374:6: lv_constantDefinitionPart_2_0= ruleconstantDefinitionPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getConstantDefinitionPartConstantDefinitionPartParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_constantDefinitionPart_2_0=ruleconstantDefinitionPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constantDefinitionPart",
            	    							lv_constantDefinitionPart_2_0,
            	    							"compilador.Pascal.constantDefinitionPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:392:4: ( (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart ) )
            	    {
            	    // InternalPascal.g:392:4: ( (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart ) )
            	    // InternalPascal.g:393:5: (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart )
            	    {
            	    // InternalPascal.g:393:5: (lv_typeDefinitionPart_3_0= ruletypeDefinitionPart )
            	    // InternalPascal.g:394:6: lv_typeDefinitionPart_3_0= ruletypeDefinitionPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getTypeDefinitionPartTypeDefinitionPartParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_typeDefinitionPart_3_0=ruletypeDefinitionPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeDefinitionPart",
            	    							lv_typeDefinitionPart_3_0,
            	    							"compilador.Pascal.typeDefinitionPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPascal.g:412:4: ( (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart ) )
            	    {
            	    // InternalPascal.g:412:4: ( (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart ) )
            	    // InternalPascal.g:413:5: (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart )
            	    {
            	    // InternalPascal.g:413:5: (lv_variableDeclarationPart_4_0= rulevariableDeclarationPart )
            	    // InternalPascal.g:414:6: lv_variableDeclarationPart_4_0= rulevariableDeclarationPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getVariableDeclarationPartVariableDeclarationPartParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_variableDeclarationPart_4_0=rulevariableDeclarationPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variableDeclarationPart",
            	    							lv_variableDeclarationPart_4_0,
            	    							"compilador.Pascal.variableDeclarationPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPascal.g:432:4: ( (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart ) )
            	    {
            	    // InternalPascal.g:432:4: ( (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart ) )
            	    // InternalPascal.g:433:5: (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart )
            	    {
            	    // InternalPascal.g:433:5: (lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart )
            	    // InternalPascal.g:434:6: lv_procedureAndFunctionDeclarationPart_5_0= ruleprocedureAndFunctionDeclarationPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getProcedureAndFunctionDeclarationPartProcedureAndFunctionDeclarationPartParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_procedureAndFunctionDeclarationPart_5_0=ruleprocedureAndFunctionDeclarationPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"procedureAndFunctionDeclarationPart",
            	    							lv_procedureAndFunctionDeclarationPart_5_0,
            	    							"compilador.Pascal.procedureAndFunctionDeclarationPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalPascal.g:452:4: ( (lv_usesUnitsPart_6_0= ruleusesUnitsPart ) )
            	    {
            	    // InternalPascal.g:452:4: ( (lv_usesUnitsPart_6_0= ruleusesUnitsPart ) )
            	    // InternalPascal.g:453:5: (lv_usesUnitsPart_6_0= ruleusesUnitsPart )
            	    {
            	    // InternalPascal.g:453:5: (lv_usesUnitsPart_6_0= ruleusesUnitsPart )
            	    // InternalPascal.g:454:6: lv_usesUnitsPart_6_0= ruleusesUnitsPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getUsesUnitsPartUsesUnitsPartParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_usesUnitsPart_6_0=ruleusesUnitsPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"usesUnitsPart",
            	    							lv_usesUnitsPart_6_0,
            	    							"compilador.Pascal.usesUnitsPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalPascal.g:472:4: otherlv_7= 'implemetation'
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBlockAccess().getImplemetationKeyword_1_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalPascal.g:477:3: ( (lv_compoundStatement_8_0= rulecompoundStatement ) )
            // InternalPascal.g:478:4: (lv_compoundStatement_8_0= rulecompoundStatement )
            {
            // InternalPascal.g:478:4: (lv_compoundStatement_8_0= rulecompoundStatement )
            // InternalPascal.g:479:5: lv_compoundStatement_8_0= rulecompoundStatement
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getCompoundStatementCompoundStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_compoundStatement_8_0=rulecompoundStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"compoundStatement",
            						lv_compoundStatement_8_0,
            						"compilador.Pascal.compoundStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulelabel_declaration_part"
    // InternalPascal.g:500:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // InternalPascal.g:500:63: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // InternalPascal.g:501:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // InternalPascal.g:507:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_label_1 = null;

        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:513:2: ( (otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:514:2: (otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:514:2: (otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:515:3: otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_label_1=rulelabel();

            state._fsp--;


            			current = this_label_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:527:3: (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascal.g:528:4: otherlv_2= ',' ( (lv_label_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPascal.g:532:4: ( (lv_label_3_0= rulelabel ) )
            	    // InternalPascal.g:533:5: (lv_label_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:533:5: (lv_label_3_0= rulelabel )
            	    // InternalPascal.g:534:6: lv_label_3_0= rulelabel
            	    {

            	    						newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelLabelParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_label_3_0=rulelabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"label",
            	    							lv_label_3_0,
            	    							"compilador.Pascal.label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:560:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:560:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:561:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:567:1: rulelabel returns [EObject current=null] : ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_identifier_1_0= ruleidentifier ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        EObject lv_unsignedInteger_0_0 = null;

        AntlrDatatypeRuleToken lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:573:2: ( ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_identifier_1_0= ruleidentifier ) ) ) )
            // InternalPascal.g:574:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_identifier_1_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:574:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_identifier_1_0= ruleidentifier ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NUM) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_IDENT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:575:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    {
                    // InternalPascal.g:575:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    // InternalPascal.g:576:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    {
                    // InternalPascal.g:576:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    // InternalPascal.g:577:5: lv_unsignedInteger_0_0= ruleunsignedInteger
                    {

                    					newCompositeNode(grammarAccess.getLabelAccess().getUnsignedIntegerUnsignedIntegerParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedInteger_0_0=ruleunsignedInteger();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLabelRule());
                    					}
                    					set(
                    						current,
                    						"unsignedInteger",
                    						lv_unsignedInteger_0_0,
                    						"compilador.Pascal.unsignedInteger");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:595:3: ( (lv_identifier_1_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:595:3: ( (lv_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:596:4: (lv_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:596:4: (lv_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:597:5: lv_identifier_1_0= ruleidentifier
                    {

                    					newCompositeNode(grammarAccess.getLabelAccess().getIdentifierIdentifierParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_identifier_1_0=ruleidentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLabelRule());
                    					}
                    					set(
                    						current,
                    						"identifier",
                    						lv_identifier_1_0,
                    						"compilador.Pascal.identifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRuleunsignedInteger"
    // InternalPascal.g:618:1: entryRuleunsignedInteger returns [EObject current=null] : iv_ruleunsignedInteger= ruleunsignedInteger EOF ;
    public final EObject entryRuleunsignedInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedInteger = null;


        try {
            // InternalPascal.g:618:56: (iv_ruleunsignedInteger= ruleunsignedInteger EOF )
            // InternalPascal.g:619:2: iv_ruleunsignedInteger= ruleunsignedInteger EOF
            {
             newCompositeNode(grammarAccess.getUnsignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsignedInteger=ruleunsignedInteger();

            state._fsp--;

             current =iv_ruleunsignedInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsignedInteger"


    // $ANTLR start "ruleunsignedInteger"
    // InternalPascal.g:625:1: ruleunsignedInteger returns [EObject current=null] : ( (lv_number_0_0= RULE_NUM ) ) ;
    public final EObject ruleunsignedInteger() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:631:2: ( ( (lv_number_0_0= RULE_NUM ) ) )
            // InternalPascal.g:632:2: ( (lv_number_0_0= RULE_NUM ) )
            {
            // InternalPascal.g:632:2: ( (lv_number_0_0= RULE_NUM ) )
            // InternalPascal.g:633:3: (lv_number_0_0= RULE_NUM )
            {
            // InternalPascal.g:633:3: (lv_number_0_0= RULE_NUM )
            // InternalPascal.g:634:4: lv_number_0_0= RULE_NUM
            {
            lv_number_0_0=(Token)match(input,RULE_NUM,FOLLOW_2); 

            				newLeafNode(lv_number_0_0, grammarAccess.getUnsignedIntegerAccess().getNumberNUMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUnsignedIntegerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"number",
            					lv_number_0_0,
            					"compilador.Pascal.NUM");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsignedInteger"


    // $ANTLR start "entryRuleconstantDefinitionPart"
    // InternalPascal.g:653:1: entryRuleconstantDefinitionPart returns [EObject current=null] : iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF ;
    public final EObject entryRuleconstantDefinitionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefinitionPart = null;


        try {
            // InternalPascal.g:653:63: (iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF )
            // InternalPascal.g:654:2: iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF
            {
             newCompositeNode(grammarAccess.getConstantDefinitionPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstantDefinitionPart=ruleconstantDefinitionPart();

            state._fsp--;

             current =iv_ruleconstantDefinitionPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstantDefinitionPart"


    // $ANTLR start "ruleconstantDefinitionPart"
    // InternalPascal.g:660:1: ruleconstantDefinitionPart returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstantDefinitionPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constantDefinition_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:666:2: ( (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:667:2: (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:667:2: (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:668:3: otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionPartAccess().getConstKeyword_0());
            		
            // InternalPascal.g:672:3: ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_IDENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:673:4: ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:673:4: ( (lv_constantDefinition_1_0= ruleconstantDefinition ) )
            	    // InternalPascal.g:674:5: (lv_constantDefinition_1_0= ruleconstantDefinition )
            	    {
            	    // InternalPascal.g:674:5: (lv_constantDefinition_1_0= ruleconstantDefinition )
            	    // InternalPascal.g:675:6: lv_constantDefinition_1_0= ruleconstantDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getConstantDefinitionPartAccess().getConstantDefinitionConstantDefinitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_constantDefinition_1_0=ruleconstantDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstantDefinitionPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constantDefinition",
            	    							lv_constantDefinition_1_0,
            	    							"compilador.Pascal.constantDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstantDefinitionPartAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstantDefinitionPart"


    // $ANTLR start "entryRuleconstantDefinition"
    // InternalPascal.g:701:1: entryRuleconstantDefinition returns [EObject current=null] : iv_ruleconstantDefinition= ruleconstantDefinition EOF ;
    public final EObject entryRuleconstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefinition = null;


        try {
            // InternalPascal.g:701:59: (iv_ruleconstantDefinition= ruleconstantDefinition EOF )
            // InternalPascal.g:702:2: iv_ruleconstantDefinition= ruleconstantDefinition EOF
            {
             newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstantDefinition=ruleconstantDefinition();

            state._fsp--;

             current =iv_ruleconstantDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstantDefinition"


    // $ANTLR start "ruleconstantDefinition"
    // InternalPascal.g:708:1: ruleconstantDefinition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_identifier_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:714:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:715:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:715:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            // InternalPascal.g:716:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) )
            {
            // InternalPascal.g:716:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:717:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:717:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:718:5: lv_identifier_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getConstantDefinitionAccess().getIdentifierIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_0_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantDefinitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:739:3: ( (lv_constant_2_0= ruleconstant ) )
            // InternalPascal.g:740:4: (lv_constant_2_0= ruleconstant )
            {
            // InternalPascal.g:740:4: (lv_constant_2_0= ruleconstant )
            // InternalPascal.g:741:5: lv_constant_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstantDefinitionAccess().getConstantConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constant_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
            					}
            					set(
            						current,
            						"constant",
            						lv_constant_2_0,
            						"compilador.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstantDefinition"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:762:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:762:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:763:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:769:1: ruleconstant returns [EObject current=null] : ( ( (lv_number_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign_1_0= rulesign ) ) ( (lv_number1_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign2_5_0= rulesign ) ) ( (lv_identifier1_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_STRING_LITERAL_4_0=null;
        EObject lv_number_0_0 = null;

        AntlrDatatypeRuleToken lv_sign_1_0 = null;

        EObject lv_number1_2_0 = null;

        AntlrDatatypeRuleToken lv_identifier_3_0 = null;

        AntlrDatatypeRuleToken lv_sign2_5_0 = null;

        AntlrDatatypeRuleToken lv_identifier1_6_0 = null;

        EObject lv_constantChr_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:775:2: ( ( ( (lv_number_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign_1_0= rulesign ) ) ( (lv_number1_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign2_5_0= rulesign ) ) ( (lv_identifier1_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) ) )
            // InternalPascal.g:776:2: ( ( (lv_number_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign_1_0= rulesign ) ) ( (lv_number1_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign2_5_0= rulesign ) ) ( (lv_identifier1_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) )
            {
            // InternalPascal.g:776:2: ( ( (lv_number_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign_1_0= rulesign ) ) ( (lv_number1_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign2_5_0= rulesign ) ) ( (lv_identifier1_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_NUM:
            case RULE_NUM_REAL:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_IDENT) ) {
                    alt8=5;
                }
                else if ( (LA8_2==RULE_NUM||LA8_2==RULE_NUM_REAL) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==RULE_NUM||LA8_3==RULE_NUM_REAL) ) {
                    alt8=2;
                }
                else if ( (LA8_3==RULE_IDENT) ) {
                    alt8=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_IDENT:
                {
                alt8=3;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPascal.g:777:3: ( (lv_number_0_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:777:3: ( (lv_number_0_0= ruleunsignedNumber ) )
                    // InternalPascal.g:778:4: (lv_number_0_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:778:4: (lv_number_0_0= ruleunsignedNumber )
                    // InternalPascal.g:779:5: lv_number_0_0= ruleunsignedNumber
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getNumberUnsignedNumberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_0_0=ruleunsignedNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"compilador.Pascal.unsignedNumber");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:797:3: ( ( (lv_sign_1_0= rulesign ) ) ( (lv_number1_2_0= ruleunsignedNumber ) ) )
                    {
                    // InternalPascal.g:797:3: ( ( (lv_sign_1_0= rulesign ) ) ( (lv_number1_2_0= ruleunsignedNumber ) ) )
                    // InternalPascal.g:798:4: ( (lv_sign_1_0= rulesign ) ) ( (lv_number1_2_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:798:4: ( (lv_sign_1_0= rulesign ) )
                    // InternalPascal.g:799:5: (lv_sign_1_0= rulesign )
                    {
                    // InternalPascal.g:799:5: (lv_sign_1_0= rulesign )
                    // InternalPascal.g:800:6: lv_sign_1_0= rulesign
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getSignSignParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_sign_1_0=rulesign();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"sign",
                    							lv_sign_1_0,
                    							"compilador.Pascal.sign");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:817:4: ( (lv_number1_2_0= ruleunsignedNumber ) )
                    // InternalPascal.g:818:5: (lv_number1_2_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:818:5: (lv_number1_2_0= ruleunsignedNumber )
                    // InternalPascal.g:819:6: lv_number1_2_0= ruleunsignedNumber
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getNumber1UnsignedNumberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number1_2_0=ruleunsignedNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"number1",
                    							lv_number1_2_0,
                    							"compilador.Pascal.unsignedNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:838:3: ( (lv_identifier_3_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:838:3: ( (lv_identifier_3_0= ruleidentifier ) )
                    // InternalPascal.g:839:4: (lv_identifier_3_0= ruleidentifier )
                    {
                    // InternalPascal.g:839:4: (lv_identifier_3_0= ruleidentifier )
                    // InternalPascal.g:840:5: lv_identifier_3_0= ruleidentifier
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getIdentifierIdentifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_identifier_3_0=ruleidentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"identifier",
                    						lv_identifier_3_0,
                    						"compilador.Pascal.identifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:858:3: ( (lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL ) )
                    {
                    // InternalPascal.g:858:3: ( (lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL ) )
                    // InternalPascal.g:859:4: (lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL )
                    {
                    // InternalPascal.g:859:4: (lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL )
                    // InternalPascal.g:860:5: lv_STRING_LITERAL_4_0= RULE_STRING_LITERAL
                    {
                    lv_STRING_LITERAL_4_0=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_STRING_LITERAL_4_0, grammarAccess.getConstantAccess().getSTRING_LITERALSTRING_LITERALTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"STRING_LITERAL",
                    						lv_STRING_LITERAL_4_0,
                    						"compilador.Pascal.STRING_LITERAL");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:877:3: ( ( (lv_sign2_5_0= rulesign ) ) ( (lv_identifier1_6_0= ruleidentifier ) ) )
                    {
                    // InternalPascal.g:877:3: ( ( (lv_sign2_5_0= rulesign ) ) ( (lv_identifier1_6_0= ruleidentifier ) ) )
                    // InternalPascal.g:878:4: ( (lv_sign2_5_0= rulesign ) ) ( (lv_identifier1_6_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:878:4: ( (lv_sign2_5_0= rulesign ) )
                    // InternalPascal.g:879:5: (lv_sign2_5_0= rulesign )
                    {
                    // InternalPascal.g:879:5: (lv_sign2_5_0= rulesign )
                    // InternalPascal.g:880:6: lv_sign2_5_0= rulesign
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getSign2SignParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_sign2_5_0=rulesign();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						add(
                    							current,
                    							"sign2",
                    							lv_sign2_5_0,
                    							"compilador.Pascal.sign");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:897:4: ( (lv_identifier1_6_0= ruleidentifier ) )
                    // InternalPascal.g:898:5: (lv_identifier1_6_0= ruleidentifier )
                    {
                    // InternalPascal.g:898:5: (lv_identifier1_6_0= ruleidentifier )
                    // InternalPascal.g:899:6: lv_identifier1_6_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getIdentifier1IdentifierParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_identifier1_6_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						add(
                    							current,
                    							"identifier1",
                    							lv_identifier1_6_0,
                    							"compilador.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:918:3: ( (lv_constantChr_7_0= ruleconstantChr ) )
                    {
                    // InternalPascal.g:918:3: ( (lv_constantChr_7_0= ruleconstantChr ) )
                    // InternalPascal.g:919:4: (lv_constantChr_7_0= ruleconstantChr )
                    {
                    // InternalPascal.g:919:4: (lv_constantChr_7_0= ruleconstantChr )
                    // InternalPascal.g:920:5: lv_constantChr_7_0= ruleconstantChr
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getConstantChrConstantChrParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constantChr_7_0=ruleconstantChr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"constantChr",
                    						lv_constantChr_7_0,
                    						"compilador.Pascal.constantChr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuleconstantChr"
    // InternalPascal.g:941:1: entryRuleconstantChr returns [EObject current=null] : iv_ruleconstantChr= ruleconstantChr EOF ;
    public final EObject entryRuleconstantChr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantChr = null;


        try {
            // InternalPascal.g:941:52: (iv_ruleconstantChr= ruleconstantChr EOF )
            // InternalPascal.g:942:2: iv_ruleconstantChr= ruleconstantChr EOF
            {
             newCompositeNode(grammarAccess.getConstantChrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstantChr=ruleconstantChr();

            state._fsp--;

             current =iv_ruleconstantChr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstantChr"


    // $ANTLR start "ruleconstantChr"
    // InternalPascal.g:948:1: ruleconstantChr returns [EObject current=null] : (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' ) ;
    public final EObject ruleconstantChr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_unsignedInteger_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:954:2: ( (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' ) )
            // InternalPascal.g:955:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:955:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' )
            // InternalPascal.g:956:3: otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantChrAccess().getChrKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantChrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:964:3: ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) )
            // InternalPascal.g:965:4: (lv_unsignedInteger_2_0= ruleunsignedInteger )
            {
            // InternalPascal.g:965:4: (lv_unsignedInteger_2_0= ruleunsignedInteger )
            // InternalPascal.g:966:5: lv_unsignedInteger_2_0= ruleunsignedInteger
            {

            					newCompositeNode(grammarAccess.getConstantChrAccess().getUnsignedIntegerUnsignedIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_unsignedInteger_2_0=ruleunsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantChrRule());
            					}
            					set(
            						current,
            						"unsignedInteger",
            						lv_unsignedInteger_2_0,
            						"compilador.Pascal.unsignedInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstantChrAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstantChr"


    // $ANTLR start "entryRuleunsignedNumber"
    // InternalPascal.g:991:1: entryRuleunsignedNumber returns [EObject current=null] : iv_ruleunsignedNumber= ruleunsignedNumber EOF ;
    public final EObject entryRuleunsignedNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedNumber = null;


        try {
            // InternalPascal.g:991:55: (iv_ruleunsignedNumber= ruleunsignedNumber EOF )
            // InternalPascal.g:992:2: iv_ruleunsignedNumber= ruleunsignedNumber EOF
            {
             newCompositeNode(grammarAccess.getUnsignedNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsignedNumber=ruleunsignedNumber();

            state._fsp--;

             current =iv_ruleunsignedNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsignedNumber"


    // $ANTLR start "ruleunsignedNumber"
    // InternalPascal.g:998:1: ruleunsignedNumber returns [EObject current=null] : ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) ) ;
    public final EObject ruleunsignedNumber() throws RecognitionException {
        EObject current = null;

        EObject lv_unsignedInteger_0_0 = null;

        AntlrDatatypeRuleToken lv_unsignedReal_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1004:2: ( ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) ) )
            // InternalPascal.g:1005:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) )
            {
            // InternalPascal.g:1005:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NUM) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_NUM_REAL) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1006:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    {
                    // InternalPascal.g:1006:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    // InternalPascal.g:1007:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    {
                    // InternalPascal.g:1007:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    // InternalPascal.g:1008:5: lv_unsignedInteger_0_0= ruleunsignedInteger
                    {

                    					newCompositeNode(grammarAccess.getUnsignedNumberAccess().getUnsignedIntegerUnsignedIntegerParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedInteger_0_0=ruleunsignedInteger();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedNumberRule());
                    					}
                    					set(
                    						current,
                    						"unsignedInteger",
                    						lv_unsignedInteger_0_0,
                    						"compilador.Pascal.unsignedInteger");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1026:3: ( (lv_unsignedReal_1_0= ruleunsignedReal ) )
                    {
                    // InternalPascal.g:1026:3: ( (lv_unsignedReal_1_0= ruleunsignedReal ) )
                    // InternalPascal.g:1027:4: (lv_unsignedReal_1_0= ruleunsignedReal )
                    {
                    // InternalPascal.g:1027:4: (lv_unsignedReal_1_0= ruleunsignedReal )
                    // InternalPascal.g:1028:5: lv_unsignedReal_1_0= ruleunsignedReal
                    {

                    					newCompositeNode(grammarAccess.getUnsignedNumberAccess().getUnsignedRealUnsignedRealParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedReal_1_0=ruleunsignedReal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedNumberRule());
                    					}
                    					set(
                    						current,
                    						"unsignedReal",
                    						lv_unsignedReal_1_0,
                    						"compilador.Pascal.unsignedReal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsignedNumber"


    // $ANTLR start "entryRuleunsignedReal"
    // InternalPascal.g:1049:1: entryRuleunsignedReal returns [String current=null] : iv_ruleunsignedReal= ruleunsignedReal EOF ;
    public final String entryRuleunsignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsignedReal = null;


        try {
            // InternalPascal.g:1049:52: (iv_ruleunsignedReal= ruleunsignedReal EOF )
            // InternalPascal.g:1050:2: iv_ruleunsignedReal= ruleunsignedReal EOF
            {
             newCompositeNode(grammarAccess.getUnsignedRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsignedReal=ruleunsignedReal();

            state._fsp--;

             current =iv_ruleunsignedReal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsignedReal"


    // $ANTLR start "ruleunsignedReal"
    // InternalPascal.g:1056:1: ruleunsignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_REAL_0= RULE_NUM_REAL ;
    public final AntlrDatatypeRuleToken ruleunsignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_REAL_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1062:2: (this_NUM_REAL_0= RULE_NUM_REAL )
            // InternalPascal.g:1063:2: this_NUM_REAL_0= RULE_NUM_REAL
            {
            this_NUM_REAL_0=(Token)match(input,RULE_NUM_REAL,FOLLOW_2); 

            		current.merge(this_NUM_REAL_0);
            	

            		newLeafNode(this_NUM_REAL_0, grammarAccess.getUnsignedRealAccess().getNUM_REALTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsignedReal"


    // $ANTLR start "entryRulesign"
    // InternalPascal.g:1073:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // InternalPascal.g:1073:44: (iv_rulesign= rulesign EOF )
            // InternalPascal.g:1074:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // InternalPascal.g:1080:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1086:2: ( (kw= '+' | kw= '-' ) )
            // InternalPascal.g:1087:2: (kw= '+' | kw= '-' )
            {
            // InternalPascal.g:1087:2: (kw= '+' | kw= '-' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( (LA10_0==30) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1088:3: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1094:3: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesign"


    // $ANTLR start "entryRuleusesUnitsPart"
    // InternalPascal.g:1103:1: entryRuleusesUnitsPart returns [EObject current=null] : iv_ruleusesUnitsPart= ruleusesUnitsPart EOF ;
    public final EObject entryRuleusesUnitsPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleusesUnitsPart = null;


        try {
            // InternalPascal.g:1103:54: (iv_ruleusesUnitsPart= ruleusesUnitsPart EOF )
            // InternalPascal.g:1104:2: iv_ruleusesUnitsPart= ruleusesUnitsPart EOF
            {
             newCompositeNode(grammarAccess.getUsesUnitsPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleusesUnitsPart=ruleusesUnitsPart();

            state._fsp--;

             current =iv_ruleusesUnitsPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleusesUnitsPart"


    // $ANTLR start "ruleusesUnitsPart"
    // InternalPascal.g:1110:1: ruleusesUnitsPart returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' ) ;
    public final EObject ruleusesUnitsPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifierList_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1116:2: ( (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' ) )
            // InternalPascal.g:1117:2: (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' )
            {
            // InternalPascal.g:1117:2: (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' )
            // InternalPascal.g:1118:3: otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUsesUnitsPartAccess().getUsesKeyword_0());
            		
            // InternalPascal.g:1122:3: ( (lv_identifierList_1_0= ruleidentifierList ) )
            // InternalPascal.g:1123:4: (lv_identifierList_1_0= ruleidentifierList )
            {
            // InternalPascal.g:1123:4: (lv_identifierList_1_0= ruleidentifierList )
            // InternalPascal.g:1124:5: lv_identifierList_1_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getUsesUnitsPartAccess().getIdentifierListIdentifierListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_identifierList_1_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsesUnitsPartRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_1_0,
            						"compilador.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getUsesUnitsPartAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleusesUnitsPart"


    // $ANTLR start "entryRuletypeDefinitionPart"
    // InternalPascal.g:1149:1: entryRuletypeDefinitionPart returns [EObject current=null] : iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF ;
    public final EObject entryRuletypeDefinitionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeDefinitionPart = null;


        try {
            // InternalPascal.g:1149:59: (iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF )
            // InternalPascal.g:1150:2: iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletypeDefinitionPart=ruletypeDefinitionPart();

            state._fsp--;

             current =iv_ruletypeDefinitionPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletypeDefinitionPart"


    // $ANTLR start "ruletypeDefinitionPart"
    // InternalPascal.g:1156:1: ruletypeDefinitionPart returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruletypeDefinitionPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_typeDefinition_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1162:2: ( (otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:1163:2: (otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:1163:2: (otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:1164:3: otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionPartAccess().getTypeKeyword_0());
            		
            // InternalPascal.g:1168:3: ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) otherlv_2= ';' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_IDENT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:1169:4: ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:1169:4: ( (lv_typeDefinition_1_0= ruletypeDefinition ) )
            	    // InternalPascal.g:1170:5: (lv_typeDefinition_1_0= ruletypeDefinition )
            	    {
            	    // InternalPascal.g:1170:5: (lv_typeDefinition_1_0= ruletypeDefinition )
            	    // InternalPascal.g:1171:6: lv_typeDefinition_1_0= ruletypeDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDefinitionPartAccess().getTypeDefinitionTypeDefinitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_typeDefinition_1_0=ruletypeDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeDefinitionPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeDefinition",
            	    							lv_typeDefinition_1_0,
            	    							"compilador.Pascal.typeDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDefinitionPartAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeDefinitionPart"


    // $ANTLR start "entryRuletypeDefinition"
    // InternalPascal.g:1197:1: entryRuletypeDefinition returns [EObject current=null] : iv_ruletypeDefinition= ruletypeDefinition EOF ;
    public final EObject entryRuletypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeDefinition = null;


        try {
            // InternalPascal.g:1197:55: (iv_ruletypeDefinition= ruletypeDefinition EOF )
            // InternalPascal.g:1198:2: iv_ruletypeDefinition= ruletypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletypeDefinition=ruletypeDefinition();

            state._fsp--;

             current =iv_ruletypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletypeDefinition"


    // $ANTLR start "ruletypeDefinition"
    // InternalPascal.g:1204:1: ruletypeDefinition returns [EObject current=null] : ( ( (lv_indentifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) ) ) ;
    public final EObject ruletypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_indentifier_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_functionType_3_0 = null;

        EObject lv_procedureType_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1210:2: ( ( ( (lv_indentifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) ) ) )
            // InternalPascal.g:1211:2: ( ( (lv_indentifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) ) )
            {
            // InternalPascal.g:1211:2: ( ( (lv_indentifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) ) )
            // InternalPascal.g:1212:3: ( (lv_indentifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) )
            {
            // InternalPascal.g:1212:3: ( (lv_indentifier_0_0= ruleidentifier ) )
            // InternalPascal.g:1213:4: (lv_indentifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:1213:4: (lv_indentifier_0_0= ruleidentifier )
            // InternalPascal.g:1214:5: lv_indentifier_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getTypeDefinitionAccess().getIndentifierIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_indentifier_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            					}
            					add(
            						current,
            						"indentifier",
            						lv_indentifier_0_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeDefinitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:1235:3: ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_NUM:
            case RULE_STRING_LITERAL:
            case RULE_NUM_REAL:
            case 20:
            case 28:
            case 29:
            case 30:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 44:
            case 47:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1236:4: ( (lv_type_2_0= ruletype ) )
                    {
                    // InternalPascal.g:1236:4: ( (lv_type_2_0= ruletype ) )
                    // InternalPascal.g:1237:5: (lv_type_2_0= ruletype )
                    {
                    // InternalPascal.g:1237:5: (lv_type_2_0= ruletype )
                    // InternalPascal.g:1238:6: lv_type_2_0= ruletype
                    {

                    						newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruletype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"compilador.Pascal.type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1256:4: ( (lv_functionType_3_0= rulefunctionType ) )
                    {
                    // InternalPascal.g:1256:4: ( (lv_functionType_3_0= rulefunctionType ) )
                    // InternalPascal.g:1257:5: (lv_functionType_3_0= rulefunctionType )
                    {
                    // InternalPascal.g:1257:5: (lv_functionType_3_0= rulefunctionType )
                    // InternalPascal.g:1258:6: lv_functionType_3_0= rulefunctionType
                    {

                    						newCompositeNode(grammarAccess.getTypeDefinitionAccess().getFunctionTypeFunctionTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionType_3_0=rulefunctionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"functionType",
                    							lv_functionType_3_0,
                    							"compilador.Pascal.functionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1276:4: ( (lv_procedureType_4_0= ruleprocedureType ) )
                    {
                    // InternalPascal.g:1276:4: ( (lv_procedureType_4_0= ruleprocedureType ) )
                    // InternalPascal.g:1277:5: (lv_procedureType_4_0= ruleprocedureType )
                    {
                    // InternalPascal.g:1277:5: (lv_procedureType_4_0= ruleprocedureType )
                    // InternalPascal.g:1278:6: lv_procedureType_4_0= ruleprocedureType
                    {

                    						newCompositeNode(grammarAccess.getTypeDefinitionAccess().getProcedureTypeProcedureTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_procedureType_4_0=ruleprocedureType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"procedureType",
                    							lv_procedureType_4_0,
                    							"compilador.Pascal.procedureType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeDefinition"


    // $ANTLR start "entryRulefunctionType"
    // InternalPascal.g:1300:1: entryRulefunctionType returns [EObject current=null] : iv_rulefunctionType= rulefunctionType EOF ;
    public final EObject entryRulefunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionType = null;


        try {
            // InternalPascal.g:1300:53: (iv_rulefunctionType= rulefunctionType EOF )
            // InternalPascal.g:1301:2: iv_rulefunctionType= rulefunctionType EOF
            {
             newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunctionType=rulefunctionType();

            state._fsp--;

             current =iv_rulefunctionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunctionType"


    // $ANTLR start "rulefunctionType"
    // InternalPascal.g:1307:1: rulefunctionType returns [EObject current=null] : (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) ) ) ;
    public final EObject rulefunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_formalParameterList_1_0 = null;

        EObject lv_resultType_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1313:2: ( (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) ) ) )
            // InternalPascal.g:1314:2: (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) ) )
            {
            // InternalPascal.g:1314:2: (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) ) )
            // InternalPascal.g:1315:3: otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionTypeAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:1319:3: ( (lv_formalParameterList_1_0= ruleformalParameterList ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1320:4: (lv_formalParameterList_1_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:1320:4: (lv_formalParameterList_1_0= ruleformalParameterList )
                    // InternalPascal.g:1321:5: lv_formalParameterList_1_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getFunctionTypeAccess().getFormalParameterListFormalParameterListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_formalParameterList_1_0=ruleformalParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
                    					}
                    					set(
                    						current,
                    						"formalParameterList",
                    						lv_formalParameterList_1_0,
                    						"compilador.Pascal.formalParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionTypeAccess().getColonKeyword_2());
            		
            // InternalPascal.g:1342:3: ( (lv_resultType_3_0= ruleresultType ) )
            // InternalPascal.g:1343:4: (lv_resultType_3_0= ruleresultType )
            {
            // InternalPascal.g:1343:4: (lv_resultType_3_0= ruleresultType )
            // InternalPascal.g:1344:5: lv_resultType_3_0= ruleresultType
            {

            					newCompositeNode(grammarAccess.getFunctionTypeAccess().getResultTypeResultTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_resultType_3_0=ruleresultType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
            					}
            					set(
            						current,
            						"resultType",
            						lv_resultType_3_0,
            						"compilador.Pascal.resultType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunctionType"


    // $ANTLR start "entryRuleresultType"
    // InternalPascal.g:1365:1: entryRuleresultType returns [EObject current=null] : iv_ruleresultType= ruleresultType EOF ;
    public final EObject entryRuleresultType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresultType = null;


        try {
            // InternalPascal.g:1365:51: (iv_ruleresultType= ruleresultType EOF )
            // InternalPascal.g:1366:2: iv_ruleresultType= ruleresultType EOF
            {
             newCompositeNode(grammarAccess.getResultTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleresultType=ruleresultType();

            state._fsp--;

             current =iv_ruleresultType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleresultType"


    // $ANTLR start "ruleresultType"
    // InternalPascal.g:1372:1: ruleresultType returns [EObject current=null] : this_typeIdentifier_0= ruletypeIdentifier ;
    public final EObject ruleresultType() throws RecognitionException {
        EObject current = null;

        EObject this_typeIdentifier_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1378:2: (this_typeIdentifier_0= ruletypeIdentifier )
            // InternalPascal.g:1379:2: this_typeIdentifier_0= ruletypeIdentifier
            {

            		newCompositeNode(grammarAccess.getResultTypeAccess().getTypeIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_typeIdentifier_0=ruletypeIdentifier();

            state._fsp--;


            		current = this_typeIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleresultType"


    // $ANTLR start "entryRuleformalParameterList"
    // InternalPascal.g:1390:1: entryRuleformalParameterList returns [EObject current=null] : iv_ruleformalParameterList= ruleformalParameterList EOF ;
    public final EObject entryRuleformalParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameterList = null;


        try {
            // InternalPascal.g:1390:60: (iv_ruleformalParameterList= ruleformalParameterList EOF )
            // InternalPascal.g:1391:2: iv_ruleformalParameterList= ruleformalParameterList EOF
            {
             newCompositeNode(grammarAccess.getFormalParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformalParameterList=ruleformalParameterList();

            state._fsp--;

             current =iv_ruleformalParameterList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformalParameterList"


    // $ANTLR start "ruleformalParameterList"
    // InternalPascal.g:1397:1: ruleformalParameterList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformalParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameterSection_1_0 = null;

        EObject lv_formalParameterSection2_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1403:2: ( (otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:1404:2: (otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:1404:2: (otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' )
            // InternalPascal.g:1405:3: otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getFormalParameterListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:1409:3: ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) )
            // InternalPascal.g:1410:4: (lv_formalParameterSection_1_0= ruleformalParameterSection )
            {
            // InternalPascal.g:1410:4: (lv_formalParameterSection_1_0= ruleformalParameterSection )
            // InternalPascal.g:1411:5: lv_formalParameterSection_1_0= ruleformalParameterSection
            {

            					newCompositeNode(grammarAccess.getFormalParameterListAccess().getFormalParameterSectionFormalParameterSectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_formalParameterSection_1_0=ruleformalParameterSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
            					}
            					set(
            						current,
            						"formalParameterSection",
            						lv_formalParameterSection_1_0,
            						"compilador.Pascal.formalParameterSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1428:3: (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:1429:4: otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormalParameterListAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:1433:4: ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) )
            	    // InternalPascal.g:1434:5: (lv_formalParameterSection2_3_0= ruleformalParameterSection )
            	    {
            	    // InternalPascal.g:1434:5: (lv_formalParameterSection2_3_0= ruleformalParameterSection )
            	    // InternalPascal.g:1435:6: lv_formalParameterSection2_3_0= ruleformalParameterSection
            	    {

            	    						newCompositeNode(grammarAccess.getFormalParameterListAccess().getFormalParameterSection2FormalParameterSectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_formalParameterSection2_3_0=ruleformalParameterSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"formalParameterSection2",
            	    							lv_formalParameterSection2_3_0,
            	    							"compilador.Pascal.formalParameterSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormalParameterListAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformalParameterList"


    // $ANTLR start "entryRuleformalParameterSection"
    // InternalPascal.g:1461:1: entryRuleformalParameterSection returns [EObject current=null] : iv_ruleformalParameterSection= ruleformalParameterSection EOF ;
    public final EObject entryRuleformalParameterSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameterSection = null;


        try {
            // InternalPascal.g:1461:63: (iv_ruleformalParameterSection= ruleformalParameterSection EOF )
            // InternalPascal.g:1462:2: iv_ruleformalParameterSection= ruleformalParameterSection EOF
            {
             newCompositeNode(grammarAccess.getFormalParameterSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformalParameterSection=ruleformalParameterSection();

            state._fsp--;

             current =iv_ruleformalParameterSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformalParameterSection"


    // $ANTLR start "ruleformalParameterSection"
    // InternalPascal.g:1468:1: ruleformalParameterSection returns [EObject current=null] : ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) ) ) ;
    public final EObject ruleformalParameterSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterGroup_0_0 = null;

        EObject lv_parameterGroup2_2_0 = null;

        EObject lv_parameterGroup3_4_0 = null;

        EObject lv_parameterGroup4_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1474:2: ( ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) ) ) )
            // InternalPascal.g:1475:2: ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) ) )
            {
            // InternalPascal.g:1475:2: ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1476:3: ( (lv_parameterGroup_0_0= ruleparameterGroup ) )
                    {
                    // InternalPascal.g:1476:3: ( (lv_parameterGroup_0_0= ruleparameterGroup ) )
                    // InternalPascal.g:1477:4: (lv_parameterGroup_0_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:1477:4: (lv_parameterGroup_0_0= ruleparameterGroup )
                    // InternalPascal.g:1478:5: lv_parameterGroup_0_0= ruleparameterGroup
                    {

                    					newCompositeNode(grammarAccess.getFormalParameterSectionAccess().getParameterGroupParameterGroupParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameterGroup_0_0=ruleparameterGroup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormalParameterSectionRule());
                    					}
                    					set(
                    						current,
                    						"parameterGroup",
                    						lv_parameterGroup_0_0,
                    						"compilador.Pascal.parameterGroup");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1496:3: (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:1496:3: (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:1497:4: otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormalParameterSectionAccess().getVarKeyword_1_0());
                    			
                    // InternalPascal.g:1501:4: ( (lv_parameterGroup2_2_0= ruleparameterGroup ) )
                    // InternalPascal.g:1502:5: (lv_parameterGroup2_2_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:1502:5: (lv_parameterGroup2_2_0= ruleparameterGroup )
                    // InternalPascal.g:1503:6: lv_parameterGroup2_2_0= ruleparameterGroup
                    {

                    						newCompositeNode(grammarAccess.getFormalParameterSectionAccess().getParameterGroup2ParameterGroupParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameterGroup2_2_0=ruleparameterGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormalParameterSectionRule());
                    						}
                    						add(
                    							current,
                    							"parameterGroup2",
                    							lv_parameterGroup2_2_0,
                    							"compilador.Pascal.parameterGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1522:3: (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:1522:3: (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:1523:4: otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getFormalParameterSectionAccess().getFunctionKeyword_2_0());
                    			
                    // InternalPascal.g:1527:4: ( (lv_parameterGroup3_4_0= ruleparameterGroup ) )
                    // InternalPascal.g:1528:5: (lv_parameterGroup3_4_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:1528:5: (lv_parameterGroup3_4_0= ruleparameterGroup )
                    // InternalPascal.g:1529:6: lv_parameterGroup3_4_0= ruleparameterGroup
                    {

                    						newCompositeNode(grammarAccess.getFormalParameterSectionAccess().getParameterGroup3ParameterGroupParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameterGroup3_4_0=ruleparameterGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormalParameterSectionRule());
                    						}
                    						add(
                    							current,
                    							"parameterGroup3",
                    							lv_parameterGroup3_4_0,
                    							"compilador.Pascal.parameterGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1548:3: (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:1548:3: (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:1549:4: otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormalParameterSectionAccess().getProcedureKeyword_3_0());
                    			
                    // InternalPascal.g:1553:4: ( (lv_parameterGroup4_6_0= ruleparameterGroup ) )
                    // InternalPascal.g:1554:5: (lv_parameterGroup4_6_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:1554:5: (lv_parameterGroup4_6_0= ruleparameterGroup )
                    // InternalPascal.g:1555:6: lv_parameterGroup4_6_0= ruleparameterGroup
                    {

                    						newCompositeNode(grammarAccess.getFormalParameterSectionAccess().getParameterGroup4ParameterGroupParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameterGroup4_6_0=ruleparameterGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormalParameterSectionRule());
                    						}
                    						add(
                    							current,
                    							"parameterGroup4",
                    							lv_parameterGroup4_6_0,
                    							"compilador.Pascal.parameterGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformalParameterSection"


    // $ANTLR start "entryRuleparameterGroup"
    // InternalPascal.g:1577:1: entryRuleparameterGroup returns [EObject current=null] : iv_ruleparameterGroup= ruleparameterGroup EOF ;
    public final EObject entryRuleparameterGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterGroup = null;


        try {
            // InternalPascal.g:1577:55: (iv_ruleparameterGroup= ruleparameterGroup EOF )
            // InternalPascal.g:1578:2: iv_ruleparameterGroup= ruleparameterGroup EOF
            {
             newCompositeNode(grammarAccess.getParameterGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameterGroup=ruleparameterGroup();

            state._fsp--;

             current =iv_ruleparameterGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterGroup"


    // $ANTLR start "ruleparameterGroup"
    // InternalPascal.g:1584:1: ruleparameterGroup returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) ;
    public final EObject ruleparameterGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_typeIdentifier_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1590:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:1591:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:1591:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
            // InternalPascal.g:1592:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
            {
            // InternalPascal.g:1592:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:1593:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:1593:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:1594:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getParameterGroupAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_identifierList_0_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_0_0,
            						"compilador.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterGroupAccess().getColonKeyword_1());
            		
            // InternalPascal.g:1615:3: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
            // InternalPascal.g:1616:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
            {
            // InternalPascal.g:1616:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
            // InternalPascal.g:1617:5: lv_typeIdentifier_2_0= ruletypeIdentifier
            {

            					newCompositeNode(grammarAccess.getParameterGroupAccess().getTypeIdentifierTypeIdentifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeIdentifier_2_0=ruletypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            					}
            					set(
            						current,
            						"typeIdentifier",
            						lv_typeIdentifier_2_0,
            						"compilador.Pascal.typeIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterGroup"


    // $ANTLR start "entryRuletypeIdentifier"
    // InternalPascal.g:1638:1: entryRuletypeIdentifier returns [EObject current=null] : iv_ruletypeIdentifier= ruletypeIdentifier EOF ;
    public final EObject entryRuletypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeIdentifier = null;


        try {
            // InternalPascal.g:1638:55: (iv_ruletypeIdentifier= ruletypeIdentifier EOF )
            // InternalPascal.g:1639:2: iv_ruletypeIdentifier= ruletypeIdentifier EOF
            {
             newCompositeNode(grammarAccess.getTypeIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletypeIdentifier=ruletypeIdentifier();

            state._fsp--;

             current =iv_ruletypeIdentifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletypeIdentifier"


    // $ANTLR start "ruletypeIdentifier"
    // InternalPascal.g:1645:1: ruletypeIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( ( () otherlv_2= 'char' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'integer' ) | ( () otherlv_8= 'real' ) | ( () otherlv_10= 'string' ) ) ) ;
    public final EObject ruletypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1651:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( ( () otherlv_2= 'char' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'integer' ) | ( () otherlv_8= 'real' ) | ( () otherlv_10= 'string' ) ) ) )
            // InternalPascal.g:1652:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( ( () otherlv_2= 'char' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'integer' ) | ( () otherlv_8= 'real' ) | ( () otherlv_10= 'string' ) ) )
            {
            // InternalPascal.g:1652:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( ( () otherlv_2= 'char' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'integer' ) | ( () otherlv_8= 'real' ) | ( () otherlv_10= 'string' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENT) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=37 && LA17_0<=41)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1653:3: ( (lv_identifier_0_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1653:3: ( (lv_identifier_0_0= ruleidentifier ) )
                    // InternalPascal.g:1654:4: (lv_identifier_0_0= ruleidentifier )
                    {
                    // InternalPascal.g:1654:4: (lv_identifier_0_0= ruleidentifier )
                    // InternalPascal.g:1655:5: lv_identifier_0_0= ruleidentifier
                    {

                    					newCompositeNode(grammarAccess.getTypeIdentifierAccess().getIdentifierIdentifierParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_identifier_0_0=ruleidentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeIdentifierRule());
                    					}
                    					set(
                    						current,
                    						"identifier",
                    						lv_identifier_0_0,
                    						"compilador.Pascal.identifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1673:3: ( ( () otherlv_2= 'char' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'integer' ) | ( () otherlv_8= 'real' ) | ( () otherlv_10= 'string' ) )
                    {
                    // InternalPascal.g:1673:3: ( ( () otherlv_2= 'char' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'integer' ) | ( () otherlv_8= 'real' ) | ( () otherlv_10= 'string' ) )
                    int alt16=5;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt16=1;
                        }
                        break;
                    case 38:
                        {
                        alt16=2;
                        }
                        break;
                    case 39:
                        {
                        alt16=3;
                        }
                        break;
                    case 40:
                        {
                        alt16=4;
                        }
                        break;
                    case 41:
                        {
                        alt16=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // InternalPascal.g:1674:4: ( () otherlv_2= 'char' )
                            {
                            // InternalPascal.g:1674:4: ( () otherlv_2= 'char' )
                            // InternalPascal.g:1675:5: () otherlv_2= 'char'
                            {
                            // InternalPascal.g:1675:5: ()
                            // InternalPascal.g:1676:6: 
                            {

                            						current = forceCreateModelElement(
                            							grammarAccess.getTypeIdentifierAccess().getTypeIdentifierAction_1_0_0(),
                            							current);
                            					

                            }

                            otherlv_2=(Token)match(input,37,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getTypeIdentifierAccess().getCharKeyword_1_0_1());
                            				

                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:1688:4: ( () otherlv_4= 'boolean' )
                            {
                            // InternalPascal.g:1688:4: ( () otherlv_4= 'boolean' )
                            // InternalPascal.g:1689:5: () otherlv_4= 'boolean'
                            {
                            // InternalPascal.g:1689:5: ()
                            // InternalPascal.g:1690:6: 
                            {

                            						current = forceCreateModelElement(
                            							grammarAccess.getTypeIdentifierAccess().getTypeIdentifierAction_1_1_0(),
                            							current);
                            					

                            }

                            otherlv_4=(Token)match(input,38,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getTypeIdentifierAccess().getBooleanKeyword_1_1_1());
                            				

                            }


                            }
                            break;
                        case 3 :
                            // InternalPascal.g:1702:4: ( () otherlv_6= 'integer' )
                            {
                            // InternalPascal.g:1702:4: ( () otherlv_6= 'integer' )
                            // InternalPascal.g:1703:5: () otherlv_6= 'integer'
                            {
                            // InternalPascal.g:1703:5: ()
                            // InternalPascal.g:1704:6: 
                            {

                            						current = forceCreateModelElement(
                            							grammarAccess.getTypeIdentifierAccess().getTypeIdentifierAction_1_2_0(),
                            							current);
                            					

                            }

                            otherlv_6=(Token)match(input,39,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getTypeIdentifierAccess().getIntegerKeyword_1_2_1());
                            				

                            }


                            }
                            break;
                        case 4 :
                            // InternalPascal.g:1716:4: ( () otherlv_8= 'real' )
                            {
                            // InternalPascal.g:1716:4: ( () otherlv_8= 'real' )
                            // InternalPascal.g:1717:5: () otherlv_8= 'real'
                            {
                            // InternalPascal.g:1717:5: ()
                            // InternalPascal.g:1718:6: 
                            {

                            						current = forceCreateModelElement(
                            							grammarAccess.getTypeIdentifierAccess().getTypeIdentifierAction_1_3_0(),
                            							current);
                            					

                            }

                            otherlv_8=(Token)match(input,40,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getTypeIdentifierAccess().getRealKeyword_1_3_1());
                            				

                            }


                            }
                            break;
                        case 5 :
                            // InternalPascal.g:1730:4: ( () otherlv_10= 'string' )
                            {
                            // InternalPascal.g:1730:4: ( () otherlv_10= 'string' )
                            // InternalPascal.g:1731:5: () otherlv_10= 'string'
                            {
                            // InternalPascal.g:1731:5: ()
                            // InternalPascal.g:1732:6: 
                            {

                            						current = forceCreateModelElement(
                            							grammarAccess.getTypeIdentifierAccess().getTypeIdentifierAction_1_4_0(),
                            							current);
                            					

                            }

                            otherlv_10=(Token)match(input,41,FOLLOW_2); 

                            					newLeafNode(otherlv_10, grammarAccess.getTypeIdentifierAccess().getStringKeyword_1_4_1());
                            				

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeIdentifier"


    // $ANTLR start "entryRuleprocedureType"
    // InternalPascal.g:1748:1: entryRuleprocedureType returns [EObject current=null] : iv_ruleprocedureType= ruleprocedureType EOF ;
    public final EObject entryRuleprocedureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureType = null;


        try {
            // InternalPascal.g:1748:54: (iv_ruleprocedureType= ruleprocedureType EOF )
            // InternalPascal.g:1749:2: iv_ruleprocedureType= ruleprocedureType EOF
            {
             newCompositeNode(grammarAccess.getProcedureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureType=ruleprocedureType();

            state._fsp--;

             current =iv_ruleprocedureType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedureType"


    // $ANTLR start "ruleprocedureType"
    // InternalPascal.g:1755:1: ruleprocedureType returns [EObject current=null] : ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? ) ;
    public final EObject ruleprocedureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_formalParameterList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1761:2: ( ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? ) )
            // InternalPascal.g:1762:2: ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? )
            {
            // InternalPascal.g:1762:2: ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? )
            // InternalPascal.g:1763:3: () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            {
            // InternalPascal.g:1763:3: ()
            // InternalPascal.g:1764:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcedureTypeAccess().getProcedureTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedureTypeAccess().getProcedureKeyword_1());
            		
            // InternalPascal.g:1774:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1775:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:1775:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:1776:5: lv_formalParameterList_2_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getProcedureTypeAccess().getFormalParameterListFormalParameterListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_formalParameterList_2_0=ruleformalParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureTypeRule());
                    					}
                    					set(
                    						current,
                    						"formalParameterList",
                    						lv_formalParameterList_2_0,
                    						"compilador.Pascal.formalParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedureType"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:1797:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:1797:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:1798:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:1804:1: ruletype returns [EObject current=null] : ( ( (lv_simpleType_0_0= rulesimpleType ) ) | ( (lv_structuredType_1_0= rulestructuredType ) ) | ( (lv_pointerType_2_0= rulepointerType ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleType_0_0 = null;

        EObject lv_structuredType_1_0 = null;

        EObject lv_pointerType_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1810:2: ( ( ( (lv_simpleType_0_0= rulesimpleType ) ) | ( (lv_structuredType_1_0= rulestructuredType ) ) | ( (lv_pointerType_2_0= rulepointerType ) ) ) )
            // InternalPascal.g:1811:2: ( ( (lv_simpleType_0_0= rulesimpleType ) ) | ( (lv_structuredType_1_0= rulestructuredType ) ) | ( (lv_pointerType_2_0= rulepointerType ) ) )
            {
            // InternalPascal.g:1811:2: ( ( (lv_simpleType_0_0= rulesimpleType ) ) | ( (lv_structuredType_1_0= rulestructuredType ) ) | ( (lv_pointerType_2_0= rulepointerType ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_NUM:
            case RULE_STRING_LITERAL:
            case RULE_NUM_REAL:
            case 20:
            case 28:
            case 29:
            case 30:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt19=1;
                }
                break;
            case 44:
            case 47:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1812:3: ( (lv_simpleType_0_0= rulesimpleType ) )
                    {
                    // InternalPascal.g:1812:3: ( (lv_simpleType_0_0= rulesimpleType ) )
                    // InternalPascal.g:1813:4: (lv_simpleType_0_0= rulesimpleType )
                    {
                    // InternalPascal.g:1813:4: (lv_simpleType_0_0= rulesimpleType )
                    // InternalPascal.g:1814:5: lv_simpleType_0_0= rulesimpleType
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeSimpleTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simpleType_0_0=rulesimpleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"simpleType",
                    						lv_simpleType_0_0,
                    						"compilador.Pascal.simpleType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1832:3: ( (lv_structuredType_1_0= rulestructuredType ) )
                    {
                    // InternalPascal.g:1832:3: ( (lv_structuredType_1_0= rulestructuredType ) )
                    // InternalPascal.g:1833:4: (lv_structuredType_1_0= rulestructuredType )
                    {
                    // InternalPascal.g:1833:4: (lv_structuredType_1_0= rulestructuredType )
                    // InternalPascal.g:1834:5: lv_structuredType_1_0= rulestructuredType
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getStructuredTypeStructuredTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structuredType_1_0=rulestructuredType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"structuredType",
                    						lv_structuredType_1_0,
                    						"compilador.Pascal.structuredType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1852:3: ( (lv_pointerType_2_0= rulepointerType ) )
                    {
                    // InternalPascal.g:1852:3: ( (lv_pointerType_2_0= rulepointerType ) )
                    // InternalPascal.g:1853:4: (lv_pointerType_2_0= rulepointerType )
                    {
                    // InternalPascal.g:1853:4: (lv_pointerType_2_0= rulepointerType )
                    // InternalPascal.g:1854:5: lv_pointerType_2_0= rulepointerType
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getPointerTypePointerTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pointerType_2_0=rulepointerType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"pointerType",
                    						lv_pointerType_2_0,
                    						"compilador.Pascal.pointerType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulepointerType"
    // InternalPascal.g:1875:1: entryRulepointerType returns [EObject current=null] : iv_rulepointerType= rulepointerType EOF ;
    public final EObject entryRulepointerType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointerType = null;


        try {
            // InternalPascal.g:1875:52: (iv_rulepointerType= rulepointerType EOF )
            // InternalPascal.g:1876:2: iv_rulepointerType= rulepointerType EOF
            {
             newCompositeNode(grammarAccess.getPointerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepointerType=rulepointerType();

            state._fsp--;

             current =iv_rulepointerType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepointerType"


    // $ANTLR start "rulepointerType"
    // InternalPascal.g:1882:1: rulepointerType returns [EObject current=null] : (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) ) ;
    public final EObject rulepointerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeIdentifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1888:2: ( (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:1889:2: (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:1889:2: (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) )
            // InternalPascal.g:1890:3: otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getPointerTypeAccess().getCircumflexAccentKeyword_0());
            		
            // InternalPascal.g:1894:3: ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) )
            // InternalPascal.g:1895:4: (lv_typeIdentifier_1_0= ruletypeIdentifier )
            {
            // InternalPascal.g:1895:4: (lv_typeIdentifier_1_0= ruletypeIdentifier )
            // InternalPascal.g:1896:5: lv_typeIdentifier_1_0= ruletypeIdentifier
            {

            					newCompositeNode(grammarAccess.getPointerTypeAccess().getTypeIdentifierTypeIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeIdentifier_1_0=ruletypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointerTypeRule());
            					}
            					set(
            						current,
            						"typeIdentifier",
            						lv_typeIdentifier_1_0,
            						"compilador.Pascal.typeIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepointerType"


    // $ANTLR start "entryRulesimpleType"
    // InternalPascal.g:1917:1: entryRulesimpleType returns [EObject current=null] : iv_rulesimpleType= rulesimpleType EOF ;
    public final EObject entryRulesimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleType = null;


        try {
            // InternalPascal.g:1917:51: (iv_rulesimpleType= rulesimpleType EOF )
            // InternalPascal.g:1918:2: iv_rulesimpleType= rulesimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimpleType=rulesimpleType();

            state._fsp--;

             current =iv_rulesimpleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimpleType"


    // $ANTLR start "rulesimpleType"
    // InternalPascal.g:1924:1: rulesimpleType returns [EObject current=null] : ( ( (lv_scalarType_0_0= rulescalarType ) ) | ( (lv_subrangeType_1_0= rulesubrangeType ) ) | ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) | ( (lv_stringtype_3_0= rulestringtype ) ) ) ;
    public final EObject rulesimpleType() throws RecognitionException {
        EObject current = null;

        EObject lv_scalarType_0_0 = null;

        EObject lv_subrangeType_1_0 = null;

        EObject lv_typeIdentifier_2_0 = null;

        EObject lv_stringtype_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1930:2: ( ( ( (lv_scalarType_0_0= rulescalarType ) ) | ( (lv_subrangeType_1_0= rulesubrangeType ) ) | ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) | ( (lv_stringtype_3_0= rulestringtype ) ) ) )
            // InternalPascal.g:1931:2: ( ( (lv_scalarType_0_0= rulescalarType ) ) | ( (lv_subrangeType_1_0= rulesubrangeType ) ) | ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) | ( (lv_stringtype_3_0= rulestringtype ) ) )
            {
            // InternalPascal.g:1931:2: ( ( (lv_scalarType_0_0= rulescalarType ) ) | ( (lv_subrangeType_1_0= rulesubrangeType ) ) | ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) | ( (lv_stringtype_3_0= rulestringtype ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt20=1;
                }
                break;
            case RULE_NUM:
            case RULE_STRING_LITERAL:
            case RULE_NUM_REAL:
            case 28:
            case 29:
            case 30:
                {
                alt20=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==43) ) {
                    alt20=2;
                }
                else if ( (LA20_3==EOF||(LA20_3>=21 && LA20_3<=22)||LA20_3==48) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt20=3;
                }
                break;
            case 41:
                {
                int LA20_5 = input.LA(2);

                if ( (LA20_5==45) ) {
                    alt20=4;
                }
                else if ( (LA20_5==EOF||(LA20_5>=21 && LA20_5<=22)||LA20_5==48) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1932:3: ( (lv_scalarType_0_0= rulescalarType ) )
                    {
                    // InternalPascal.g:1932:3: ( (lv_scalarType_0_0= rulescalarType ) )
                    // InternalPascal.g:1933:4: (lv_scalarType_0_0= rulescalarType )
                    {
                    // InternalPascal.g:1933:4: (lv_scalarType_0_0= rulescalarType )
                    // InternalPascal.g:1934:5: lv_scalarType_0_0= rulescalarType
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getScalarTypeScalarTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_scalarType_0_0=rulescalarType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"scalarType",
                    						lv_scalarType_0_0,
                    						"compilador.Pascal.scalarType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1952:3: ( (lv_subrangeType_1_0= rulesubrangeType ) )
                    {
                    // InternalPascal.g:1952:3: ( (lv_subrangeType_1_0= rulesubrangeType ) )
                    // InternalPascal.g:1953:4: (lv_subrangeType_1_0= rulesubrangeType )
                    {
                    // InternalPascal.g:1953:4: (lv_subrangeType_1_0= rulesubrangeType )
                    // InternalPascal.g:1954:5: lv_subrangeType_1_0= rulesubrangeType
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getSubrangeTypeSubrangeTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subrangeType_1_0=rulesubrangeType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"subrangeType",
                    						lv_subrangeType_1_0,
                    						"compilador.Pascal.subrangeType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1972:3: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
                    {
                    // InternalPascal.g:1972:3: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
                    // InternalPascal.g:1973:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
                    {
                    // InternalPascal.g:1973:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
                    // InternalPascal.g:1974:5: lv_typeIdentifier_2_0= ruletypeIdentifier
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeIdentifierTypeIdentifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeIdentifier_2_0=ruletypeIdentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"typeIdentifier",
                    						lv_typeIdentifier_2_0,
                    						"compilador.Pascal.typeIdentifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1992:3: ( (lv_stringtype_3_0= rulestringtype ) )
                    {
                    // InternalPascal.g:1992:3: ( (lv_stringtype_3_0= rulestringtype ) )
                    // InternalPascal.g:1993:4: (lv_stringtype_3_0= rulestringtype )
                    {
                    // InternalPascal.g:1993:4: (lv_stringtype_3_0= rulestringtype )
                    // InternalPascal.g:1994:5: lv_stringtype_3_0= rulestringtype
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getStringtypeStringtypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_stringtype_3_0=rulestringtype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"stringtype",
                    						lv_stringtype_3_0,
                    						"compilador.Pascal.stringtype");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimpleType"


    // $ANTLR start "entryRulescalarType"
    // InternalPascal.g:2015:1: entryRulescalarType returns [EObject current=null] : iv_rulescalarType= rulescalarType EOF ;
    public final EObject entryRulescalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulescalarType = null;


        try {
            // InternalPascal.g:2015:51: (iv_rulescalarType= rulescalarType EOF )
            // InternalPascal.g:2016:2: iv_rulescalarType= rulescalarType EOF
            {
             newCompositeNode(grammarAccess.getScalarTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulescalarType=rulescalarType();

            state._fsp--;

             current =iv_rulescalarType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulescalarType"


    // $ANTLR start "rulescalarType"
    // InternalPascal.g:2022:1: rulescalarType returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' ) ;
    public final EObject rulescalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifierList_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2028:2: ( (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' ) )
            // InternalPascal.g:2029:2: (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:2029:2: (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' )
            // InternalPascal.g:2030:3: otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarTypeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:2034:3: ( (lv_identifierList_1_0= ruleidentifierList ) )
            // InternalPascal.g:2035:4: (lv_identifierList_1_0= ruleidentifierList )
            {
            // InternalPascal.g:2035:4: (lv_identifierList_1_0= ruleidentifierList )
            // InternalPascal.g:2036:5: lv_identifierList_1_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getScalarTypeAccess().getIdentifierListIdentifierListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_identifierList_1_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScalarTypeRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_1_0,
            						"compilador.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getScalarTypeAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulescalarType"


    // $ANTLR start "entryRulesubrangeType"
    // InternalPascal.g:2061:1: entryRulesubrangeType returns [EObject current=null] : iv_rulesubrangeType= rulesubrangeType EOF ;
    public final EObject entryRulesubrangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrangeType = null;


        try {
            // InternalPascal.g:2061:53: (iv_rulesubrangeType= rulesubrangeType EOF )
            // InternalPascal.g:2062:2: iv_rulesubrangeType= rulesubrangeType EOF
            {
             newCompositeNode(grammarAccess.getSubrangeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubrangeType=rulesubrangeType();

            state._fsp--;

             current =iv_rulesubrangeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesubrangeType"


    // $ANTLR start "rulesubrangeType"
    // InternalPascal.g:2068:1: rulesubrangeType returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) ) ) ;
    public final EObject rulesubrangeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constant_0_0 = null;

        EObject lv_constant2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2074:2: ( ( ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:2075:2: ( ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:2075:2: ( ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) ) )
            // InternalPascal.g:2076:3: ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) )
            {
            // InternalPascal.g:2076:3: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:2077:4: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:2077:4: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:2078:5: lv_constant_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrangeTypeAccess().getConstantConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_constant_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubrangeTypeRule());
            					}
            					set(
            						current,
            						"constant",
            						lv_constant_0_0,
            						"compilador.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSubrangeTypeAccess().getFullStopFullStopKeyword_1());
            		
            // InternalPascal.g:2099:3: ( (lv_constant2_2_0= ruleconstant ) )
            // InternalPascal.g:2100:4: (lv_constant2_2_0= ruleconstant )
            {
            // InternalPascal.g:2100:4: (lv_constant2_2_0= ruleconstant )
            // InternalPascal.g:2101:5: lv_constant2_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrangeTypeAccess().getConstant2ConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constant2_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubrangeTypeRule());
            					}
            					set(
            						current,
            						"constant2",
            						lv_constant2_2_0,
            						"compilador.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesubrangeType"


    // $ANTLR start "entryRulestructuredType"
    // InternalPascal.g:2122:1: entryRulestructuredType returns [EObject current=null] : iv_rulestructuredType= rulestructuredType EOF ;
    public final EObject entryRulestructuredType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructuredType = null;


        try {
            // InternalPascal.g:2122:55: (iv_rulestructuredType= rulestructuredType EOF )
            // InternalPascal.g:2123:2: iv_rulestructuredType= rulestructuredType EOF
            {
             newCompositeNode(grammarAccess.getStructuredTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructuredType=rulestructuredType();

            state._fsp--;

             current =iv_rulestructuredType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructuredType"


    // $ANTLR start "rulestructuredType"
    // InternalPascal.g:2129:1: rulestructuredType returns [EObject current=null] : ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) ) ) ;
    public final EObject rulestructuredType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_unpackedStructuredType_1_0 = null;

        EObject lv_unpackedStructuredType1_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2135:2: ( ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) ) ) )
            // InternalPascal.g:2136:2: ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) ) )
            {
            // InternalPascal.g:2136:2: ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            else if ( (LA21_0==47) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:2137:3: (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) )
                    {
                    // InternalPascal.g:2137:3: (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) )
                    // InternalPascal.g:2138:4: otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getStructuredTypeAccess().getPackedKeyword_0_0());
                    			
                    // InternalPascal.g:2142:4: ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) )
                    // InternalPascal.g:2143:5: (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType )
                    {
                    // InternalPascal.g:2143:5: (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType )
                    // InternalPascal.g:2144:6: lv_unpackedStructuredType_1_0= ruleunpackedStructuredType
                    {

                    						newCompositeNode(grammarAccess.getStructuredTypeAccess().getUnpackedStructuredTypeUnpackedStructuredTypeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unpackedStructuredType_1_0=ruleunpackedStructuredType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructuredTypeRule());
                    						}
                    						set(
                    							current,
                    							"unpackedStructuredType",
                    							lv_unpackedStructuredType_1_0,
                    							"compilador.Pascal.unpackedStructuredType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2163:3: ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) )
                    {
                    // InternalPascal.g:2163:3: ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) )
                    // InternalPascal.g:2164:4: (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType )
                    {
                    // InternalPascal.g:2164:4: (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType )
                    // InternalPascal.g:2165:5: lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType
                    {

                    					newCompositeNode(grammarAccess.getStructuredTypeAccess().getUnpackedStructuredType1UnpackedStructuredTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unpackedStructuredType1_2_0=ruleunpackedStructuredType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructuredTypeRule());
                    					}
                    					add(
                    						current,
                    						"unpackedStructuredType1",
                    						lv_unpackedStructuredType1_2_0,
                    						"compilador.Pascal.unpackedStructuredType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructuredType"


    // $ANTLR start "entryRuleunpackedStructuredType"
    // InternalPascal.g:2186:1: entryRuleunpackedStructuredType returns [EObject current=null] : iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF ;
    public final EObject entryRuleunpackedStructuredType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpackedStructuredType = null;


        try {
            // InternalPascal.g:2186:63: (iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF )
            // InternalPascal.g:2187:2: iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF
            {
             newCompositeNode(grammarAccess.getUnpackedStructuredTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpackedStructuredType=ruleunpackedStructuredType();

            state._fsp--;

             current =iv_ruleunpackedStructuredType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpackedStructuredType"


    // $ANTLR start "ruleunpackedStructuredType"
    // InternalPascal.g:2193:1: ruleunpackedStructuredType returns [EObject current=null] : ( (lv_recordType_0_0= rulerecordType ) ) ;
    public final EObject ruleunpackedStructuredType() throws RecognitionException {
        EObject current = null;

        EObject lv_recordType_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2199:2: ( ( (lv_recordType_0_0= rulerecordType ) ) )
            // InternalPascal.g:2200:2: ( (lv_recordType_0_0= rulerecordType ) )
            {
            // InternalPascal.g:2200:2: ( (lv_recordType_0_0= rulerecordType ) )
            // InternalPascal.g:2201:3: (lv_recordType_0_0= rulerecordType )
            {
            // InternalPascal.g:2201:3: (lv_recordType_0_0= rulerecordType )
            // InternalPascal.g:2202:4: lv_recordType_0_0= rulerecordType
            {

            				newCompositeNode(grammarAccess.getUnpackedStructuredTypeAccess().getRecordTypeRecordTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_recordType_0_0=rulerecordType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getUnpackedStructuredTypeRule());
            				}
            				set(
            					current,
            					"recordType",
            					lv_recordType_0_0,
            					"compilador.Pascal.recordType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpackedStructuredType"


    // $ANTLR start "entryRulestringtype"
    // InternalPascal.g:2222:1: entryRulestringtype returns [EObject current=null] : iv_rulestringtype= rulestringtype EOF ;
    public final EObject entryRulestringtype() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringtype = null;


        try {
            // InternalPascal.g:2222:51: (iv_rulestringtype= rulestringtype EOF )
            // InternalPascal.g:2223:2: iv_rulestringtype= rulestringtype EOF
            {
             newCompositeNode(grammarAccess.getStringtypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestringtype=rulestringtype();

            state._fsp--;

             current =iv_rulestringtype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestringtype"


    // $ANTLR start "rulestringtype"
    // InternalPascal.g:2229:1: rulestringtype returns [EObject current=null] : (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' ) ;
    public final EObject rulestringtype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_identifier_2_0 = null;

        EObject lv_unsignedNumber_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2235:2: ( (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' ) )
            // InternalPascal.g:2236:2: (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' )
            {
            // InternalPascal.g:2236:2: (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' )
            // InternalPascal.g:2237:3: otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getStringtypeAccess().getStringKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getStringtypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:2245:3: ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_IDENT) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_NUM||LA22_0==RULE_NUM_REAL) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2246:4: ( (lv_identifier_2_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:2246:4: ( (lv_identifier_2_0= ruleidentifier ) )
                    // InternalPascal.g:2247:5: (lv_identifier_2_0= ruleidentifier )
                    {
                    // InternalPascal.g:2247:5: (lv_identifier_2_0= ruleidentifier )
                    // InternalPascal.g:2248:6: lv_identifier_2_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getStringtypeAccess().getIdentifierIdentifierParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_identifier_2_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringtypeRule());
                    						}
                    						set(
                    							current,
                    							"identifier",
                    							lv_identifier_2_0,
                    							"compilador.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2266:4: ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:2266:4: ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) )
                    // InternalPascal.g:2267:5: (lv_unsignedNumber_3_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:2267:5: (lv_unsignedNumber_3_0= ruleunsignedNumber )
                    // InternalPascal.g:2268:6: lv_unsignedNumber_3_0= ruleunsignedNumber
                    {

                    						newCompositeNode(grammarAccess.getStringtypeAccess().getUnsignedNumberUnsignedNumberParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_unsignedNumber_3_0=ruleunsignedNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringtypeRule());
                    						}
                    						set(
                    							current,
                    							"unsignedNumber",
                    							lv_unsignedNumber_3_0,
                    							"compilador.Pascal.unsignedNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringtypeAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestringtype"


    // $ANTLR start "entryRulerecordType"
    // InternalPascal.g:2294:1: entryRulerecordType returns [EObject current=null] : iv_rulerecordType= rulerecordType EOF ;
    public final EObject entryRulerecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecordType = null;


        try {
            // InternalPascal.g:2294:51: (iv_rulerecordType= rulerecordType EOF )
            // InternalPascal.g:2295:2: iv_rulerecordType= rulerecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecordType=rulerecordType();

            state._fsp--;

             current =iv_rulerecordType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecordType"


    // $ANTLR start "rulerecordType"
    // InternalPascal.g:2301:1: rulerecordType returns [EObject current=null] : ( () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end' ) ;
    public final EObject rulerecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fieldList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2307:2: ( ( () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end' ) )
            // InternalPascal.g:2308:2: ( () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end' )
            {
            // InternalPascal.g:2308:2: ( () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end' )
            // InternalPascal.g:2309:3: () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end'
            {
            // InternalPascal.g:2309:3: ()
            // InternalPascal.g:2310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecordTypeAccess().getRecordTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getRecordKeyword_1());
            		
            // InternalPascal.g:2320:3: ( (lv_fieldList_2_0= rulefieldList ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_IDENT||LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2321:4: (lv_fieldList_2_0= rulefieldList )
                    {
                    // InternalPascal.g:2321:4: (lv_fieldList_2_0= rulefieldList )
                    // InternalPascal.g:2322:5: lv_fieldList_2_0= rulefieldList
                    {

                    					newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_fieldList_2_0=rulefieldList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
                    					}
                    					set(
                    						current,
                    						"fieldList",
                    						lv_fieldList_2_0,
                    						"compilador.Pascal.fieldList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getEndKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecordType"


    // $ANTLR start "entryRulefieldList"
    // InternalPascal.g:2347:1: entryRulefieldList returns [EObject current=null] : iv_rulefieldList= rulefieldList EOF ;
    public final EObject entryRulefieldList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefieldList = null;


        try {
            // InternalPascal.g:2347:50: (iv_rulefieldList= rulefieldList EOF )
            // InternalPascal.g:2348:2: iv_rulefieldList= rulefieldList EOF
            {
             newCompositeNode(grammarAccess.getFieldListRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefieldList=rulefieldList();

            state._fsp--;

             current =iv_rulefieldList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefieldList"


    // $ANTLR start "rulefieldList"
    // InternalPascal.g:2354:1: rulefieldList returns [EObject current=null] : ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart1_3_0= rulevariantPart ) ) ) ;
    public final EObject rulefieldList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fixedPart_0_0 = null;

        EObject lv_variantPart_2_0 = null;

        EObject lv_variantPart1_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2360:2: ( ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart1_3_0= rulevariantPart ) ) ) )
            // InternalPascal.g:2361:2: ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart1_3_0= rulevariantPart ) ) )
            {
            // InternalPascal.g:2361:2: ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart1_3_0= rulevariantPart ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_IDENT) ) {
                alt25=1;
            }
            else if ( (LA25_0==49) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2362:3: ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? )
                    {
                    // InternalPascal.g:2362:3: ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? )
                    // InternalPascal.g:2363:4: ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )?
                    {
                    // InternalPascal.g:2363:4: ( (lv_fixedPart_0_0= rulefixedPart ) )
                    // InternalPascal.g:2364:5: (lv_fixedPart_0_0= rulefixedPart )
                    {
                    // InternalPascal.g:2364:5: (lv_fixedPart_0_0= rulefixedPart )
                    // InternalPascal.g:2365:6: lv_fixedPart_0_0= rulefixedPart
                    {

                    						newCompositeNode(grammarAccess.getFieldListAccess().getFixedPartFixedPartParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_fixedPart_0_0=rulefixedPart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldListRule());
                    						}
                    						set(
                    							current,
                    							"fixedPart",
                    							lv_fixedPart_0_0,
                    							"compilador.Pascal.fixedPart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:2382:4: (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==22) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalPascal.g:2383:5: otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) )
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_33); 

                            					newLeafNode(otherlv_1, grammarAccess.getFieldListAccess().getSemicolonKeyword_0_1_0());
                            				
                            // InternalPascal.g:2387:5: ( (lv_variantPart_2_0= rulevariantPart ) )
                            // InternalPascal.g:2388:6: (lv_variantPart_2_0= rulevariantPart )
                            {
                            // InternalPascal.g:2388:6: (lv_variantPart_2_0= rulevariantPart )
                            // InternalPascal.g:2389:7: lv_variantPart_2_0= rulevariantPart
                            {

                            							newCompositeNode(grammarAccess.getFieldListAccess().getVariantPartVariantPartParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_variantPart_2_0=rulevariantPart();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFieldListRule());
                            							}
                            							set(
                            								current,
                            								"variantPart",
                            								lv_variantPart_2_0,
                            								"compilador.Pascal.variantPart");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2409:3: ( (lv_variantPart1_3_0= rulevariantPart ) )
                    {
                    // InternalPascal.g:2409:3: ( (lv_variantPart1_3_0= rulevariantPart ) )
                    // InternalPascal.g:2410:4: (lv_variantPart1_3_0= rulevariantPart )
                    {
                    // InternalPascal.g:2410:4: (lv_variantPart1_3_0= rulevariantPart )
                    // InternalPascal.g:2411:5: lv_variantPart1_3_0= rulevariantPart
                    {

                    					newCompositeNode(grammarAccess.getFieldListAccess().getVariantPart1VariantPartParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variantPart1_3_0=rulevariantPart();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldListRule());
                    					}
                    					add(
                    						current,
                    						"variantPart1",
                    						lv_variantPart1_3_0,
                    						"compilador.Pascal.variantPart");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefieldList"


    // $ANTLR start "entryRulefixedPart"
    // InternalPascal.g:2432:1: entryRulefixedPart returns [EObject current=null] : iv_rulefixedPart= rulefixedPart EOF ;
    public final EObject entryRulefixedPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixedPart = null;


        try {
            // InternalPascal.g:2432:50: (iv_rulefixedPart= rulefixedPart EOF )
            // InternalPascal.g:2433:2: iv_rulefixedPart= rulefixedPart EOF
            {
             newCompositeNode(grammarAccess.getFixedPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefixedPart=rulefixedPart();

            state._fsp--;

             current =iv_rulefixedPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefixedPart"


    // $ANTLR start "rulefixedPart"
    // InternalPascal.g:2439:1: rulefixedPart returns [EObject current=null] : ( ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )* ) ;
    public final EObject rulefixedPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_recordSection_0_0 = null;

        EObject lv_recordSection1_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2445:2: ( ( ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )* ) )
            // InternalPascal.g:2446:2: ( ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )* )
            {
            // InternalPascal.g:2446:2: ( ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )* )
            // InternalPascal.g:2447:3: ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )*
            {
            // InternalPascal.g:2447:3: ( (lv_recordSection_0_0= rulerecordSection ) )
            // InternalPascal.g:2448:4: (lv_recordSection_0_0= rulerecordSection )
            {
            // InternalPascal.g:2448:4: (lv_recordSection_0_0= rulerecordSection )
            // InternalPascal.g:2449:5: lv_recordSection_0_0= rulerecordSection
            {

            					newCompositeNode(grammarAccess.getFixedPartAccess().getRecordSectionRecordSectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_recordSection_0_0=rulerecordSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFixedPartRule());
            					}
            					set(
            						current,
            						"recordSection",
            						lv_recordSection_0_0,
            						"compilador.Pascal.recordSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2466:3: (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_IDENT) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:2467:4: otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFixedPartAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:2471:4: ( (lv_recordSection1_2_0= rulerecordSection ) )
            	    // InternalPascal.g:2472:5: (lv_recordSection1_2_0= rulerecordSection )
            	    {
            	    // InternalPascal.g:2472:5: (lv_recordSection1_2_0= rulerecordSection )
            	    // InternalPascal.g:2473:6: lv_recordSection1_2_0= rulerecordSection
            	    {

            	    						newCompositeNode(grammarAccess.getFixedPartAccess().getRecordSection1RecordSectionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_recordSection1_2_0=rulerecordSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFixedPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recordSection1",
            	    							lv_recordSection1_2_0,
            	    							"compilador.Pascal.recordSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefixedPart"


    // $ANTLR start "entryRulerecordSection"
    // InternalPascal.g:2495:1: entryRulerecordSection returns [EObject current=null] : iv_rulerecordSection= rulerecordSection EOF ;
    public final EObject entryRulerecordSection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecordSection = null;


        try {
            // InternalPascal.g:2495:54: (iv_rulerecordSection= rulerecordSection EOF )
            // InternalPascal.g:2496:2: iv_rulerecordSection= rulerecordSection EOF
            {
             newCompositeNode(grammarAccess.getRecordSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecordSection=rulerecordSection();

            state._fsp--;

             current =iv_rulerecordSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecordSection"


    // $ANTLR start "rulerecordSection"
    // InternalPascal.g:2502:1: rulerecordSection returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecordSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2508:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:2509:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:2509:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:2510:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:2510:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:2511:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:2511:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:2512:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getRecordSectionAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_identifierList_0_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordSectionRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_0_0,
            						"compilador.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordSectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:2533:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:2534:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:2534:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:2535:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getRecordSectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordSectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"compilador.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecordSection"


    // $ANTLR start "entryRulevariantPart"
    // InternalPascal.g:2556:1: entryRulevariantPart returns [EObject current=null] : iv_rulevariantPart= rulevariantPart EOF ;
    public final EObject entryRulevariantPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariantPart = null;


        try {
            // InternalPascal.g:2556:52: (iv_rulevariantPart= rulevariantPart EOF )
            // InternalPascal.g:2557:2: iv_rulevariantPart= rulevariantPart EOF
            {
             newCompositeNode(grammarAccess.getVariantPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariantPart=rulevariantPart();

            state._fsp--;

             current =iv_rulevariantPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariantPart"


    // $ANTLR start "rulevariantPart"
    // InternalPascal.g:2563:1: rulevariantPart returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )* ) ;
    public final EObject rulevariantPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tag_1_0 = null;

        EObject lv_variant_3_0 = null;

        EObject lv_variant1_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2569:2: ( (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )* ) )
            // InternalPascal.g:2570:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:2570:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )* )
            // InternalPascal.g:2571:3: otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getVariantPartAccess().getCaseKeyword_0());
            		
            // InternalPascal.g:2575:3: ( (lv_tag_1_0= ruletag ) )
            // InternalPascal.g:2576:4: (lv_tag_1_0= ruletag )
            {
            // InternalPascal.g:2576:4: (lv_tag_1_0= ruletag )
            // InternalPascal.g:2577:5: lv_tag_1_0= ruletag
            {

            					newCompositeNode(grammarAccess.getVariantPartAccess().getTagTagParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_tag_1_0=ruletag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantPartRule());
            					}
            					set(
            						current,
            						"tag",
            						lv_tag_1_0,
            						"compilador.Pascal.tag");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantPartAccess().getOfKeyword_2());
            		
            // InternalPascal.g:2598:3: ( (lv_variant_3_0= rulevariant ) )
            // InternalPascal.g:2599:4: (lv_variant_3_0= rulevariant )
            {
            // InternalPascal.g:2599:4: (lv_variant_3_0= rulevariant )
            // InternalPascal.g:2600:5: lv_variant_3_0= rulevariant
            {

            					newCompositeNode(grammarAccess.getVariantPartAccess().getVariantVariantParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_variant_3_0=rulevariant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantPartRule());
            					}
            					set(
            						current,
            						"variant",
            						lv_variant_3_0,
            						"compilador.Pascal.variant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2617:3: (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascal.g:2618:4: otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVariantPartAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalPascal.g:2622:4: ( (lv_variant1_5_0= rulevariant ) )
            	    // InternalPascal.g:2623:5: (lv_variant1_5_0= rulevariant )
            	    {
            	    // InternalPascal.g:2623:5: (lv_variant1_5_0= rulevariant )
            	    // InternalPascal.g:2624:6: lv_variant1_5_0= rulevariant
            	    {

            	    						newCompositeNode(grammarAccess.getVariantPartAccess().getVariant1VariantParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_variant1_5_0=rulevariant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariantPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variant1",
            	    							lv_variant1_5_0,
            	    							"compilador.Pascal.variant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariantPart"


    // $ANTLR start "entryRuletag"
    // InternalPascal.g:2646:1: entryRuletag returns [EObject current=null] : iv_ruletag= ruletag EOF ;
    public final EObject entryRuletag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag = null;


        try {
            // InternalPascal.g:2646:44: (iv_ruletag= ruletag EOF )
            // InternalPascal.g:2647:2: iv_ruletag= ruletag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletag=ruletag();

            state._fsp--;

             current =iv_ruletag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletag"


    // $ANTLR start "ruletag"
    // InternalPascal.g:2653:1: ruletag returns [EObject current=null] : ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) ) ) ;
    public final EObject ruletag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_identifier_0_0 = null;

        EObject lv_typeIdentifier_2_0 = null;

        EObject lv_typeIdentifier1_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2659:2: ( ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:2660:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:2660:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IDENT) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==34) ) {
                    alt28=1;
                }
                else if ( (LA28_1==EOF||LA28_1==50) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA28_0>=37 && LA28_0<=41)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2661:3: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
                    {
                    // InternalPascal.g:2661:3: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
                    // InternalPascal.g:2662:4: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
                    {
                    // InternalPascal.g:2662:4: ( (lv_identifier_0_0= ruleidentifier ) )
                    // InternalPascal.g:2663:5: (lv_identifier_0_0= ruleidentifier )
                    {
                    // InternalPascal.g:2663:5: (lv_identifier_0_0= ruleidentifier )
                    // InternalPascal.g:2664:6: lv_identifier_0_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getTagAccess().getIdentifierIdentifierParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_identifier_0_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTagRule());
                    						}
                    						set(
                    							current,
                    							"identifier",
                    							lv_identifier_0_0,
                    							"compilador.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getTagAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:2685:4: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
                    // InternalPascal.g:2686:5: (lv_typeIdentifier_2_0= ruletypeIdentifier )
                    {
                    // InternalPascal.g:2686:5: (lv_typeIdentifier_2_0= ruletypeIdentifier )
                    // InternalPascal.g:2687:6: lv_typeIdentifier_2_0= ruletypeIdentifier
                    {

                    						newCompositeNode(grammarAccess.getTagAccess().getTypeIdentifierTypeIdentifierParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_typeIdentifier_2_0=ruletypeIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTagRule());
                    						}
                    						set(
                    							current,
                    							"typeIdentifier",
                    							lv_typeIdentifier_2_0,
                    							"compilador.Pascal.typeIdentifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2706:3: ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) )
                    {
                    // InternalPascal.g:2706:3: ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) )
                    // InternalPascal.g:2707:4: (lv_typeIdentifier1_3_0= ruletypeIdentifier )
                    {
                    // InternalPascal.g:2707:4: (lv_typeIdentifier1_3_0= ruletypeIdentifier )
                    // InternalPascal.g:2708:5: lv_typeIdentifier1_3_0= ruletypeIdentifier
                    {

                    					newCompositeNode(grammarAccess.getTagAccess().getTypeIdentifier1TypeIdentifierParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeIdentifier1_3_0=ruletypeIdentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTagRule());
                    					}
                    					add(
                    						current,
                    						"typeIdentifier1",
                    						lv_typeIdentifier1_3_0,
                    						"compilador.Pascal.typeIdentifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletag"


    // $ANTLR start "entryRulevariant"
    // InternalPascal.g:2729:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:2729:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:2730:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // InternalPascal.g:2736:1: rulevariant returns [EObject current=null] : (this_constant_0= ruleconstant (otherlv_1= ':' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_constant_0 = null;

        EObject lv_constant_2_0 = null;

        EObject lv_fieldList_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2742:2: ( (this_constant_0= ruleconstant (otherlv_1= ':' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')' ) )
            // InternalPascal.g:2743:2: (this_constant_0= ruleconstant (otherlv_1= ':' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')' )
            {
            // InternalPascal.g:2743:2: (this_constant_0= ruleconstant (otherlv_1= ':' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')' )
            // InternalPascal.g:2744:3: this_constant_0= ruleconstant (otherlv_1= ':' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')'
            {

            			newCompositeNode(grammarAccess.getVariantAccess().getConstantParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_constant_0=ruleconstant();

            state._fsp--;


            			current = this_constant_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:2752:3: (otherlv_1= ':' ( (lv_constant_2_0= ruleconstant ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    int LA29_1 = input.LA(2);

                    if ( ((LA29_1>=RULE_IDENT && LA29_1<=RULE_NUM_REAL)||(LA29_1>=28 && LA29_1<=30)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:2753:4: otherlv_1= ':' ( (lv_constant_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1_0());
            	    			
            	    // InternalPascal.g:2757:4: ( (lv_constant_2_0= ruleconstant ) )
            	    // InternalPascal.g:2758:5: (lv_constant_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:2758:5: (lv_constant_2_0= ruleconstant )
            	    // InternalPascal.g:2759:6: lv_constant_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getVariantAccess().getConstantConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_constant_2_0=ruleconstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariantRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constant",
            	    							lv_constant_2_0,
            	    							"compilador.Pascal.constant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getVariantAccess().getColonKeyword_2());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPascal.g:2785:3: ( (lv_fieldList_5_0= rulefieldList ) )
            // InternalPascal.g:2786:4: (lv_fieldList_5_0= rulefieldList )
            {
            // InternalPascal.g:2786:4: (lv_fieldList_5_0= rulefieldList )
            // InternalPascal.g:2787:5: lv_fieldList_5_0= rulefieldList
            {

            					newCompositeNode(grammarAccess.getVariantAccess().getFieldListFieldListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_fieldList_5_0=rulefieldList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantRule());
            					}
            					set(
            						current,
            						"fieldList",
            						lv_fieldList_5_0,
            						"compilador.Pascal.fieldList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVariantAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRuleconstList"
    // InternalPascal.g:2812:1: entryRuleconstList returns [EObject current=null] : iv_ruleconstList= ruleconstList EOF ;
    public final EObject entryRuleconstList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstList = null;


        try {
            // InternalPascal.g:2812:50: (iv_ruleconstList= ruleconstList EOF )
            // InternalPascal.g:2813:2: iv_ruleconstList= ruleconstList EOF
            {
             newCompositeNode(grammarAccess.getConstListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstList=ruleconstList();

            state._fsp--;

             current =iv_ruleconstList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstList"


    // $ANTLR start "ruleconstList"
    // InternalPascal.g:2819:1: ruleconstList returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ':' ( (lv_constant1_2_0= ruleconstant ) ) )* ) ;
    public final EObject ruleconstList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constant_0_0 = null;

        EObject lv_constant1_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2825:2: ( ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ':' ( (lv_constant1_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:2826:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ':' ( (lv_constant1_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:2826:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ':' ( (lv_constant1_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:2827:3: ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ':' ( (lv_constant1_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:2827:3: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:2828:4: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:2828:4: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:2829:5: lv_constant_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstListAccess().getConstantConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_constant_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstListRule());
            					}
            					set(
            						current,
            						"constant",
            						lv_constant_0_0,
            						"compilador.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2846:3: (otherlv_1= ':' ( (lv_constant1_2_0= ruleconstant ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    switch ( input.LA(2) ) {
                    case RULE_NUM:
                        {
                        int LA30_3 = input.LA(3);

                        if ( (LA30_3==EOF||LA30_3==34) ) {
                            alt30=1;
                        }


                        }
                        break;
                    case RULE_IDENT:
                        {
                        int LA30_4 = input.LA(3);

                        if ( (LA30_4==34) ) {
                            alt30=1;
                        }
                        else if ( (LA30_4==EOF) ) {
                            int LA30_7 = input.LA(4);

                            if ( (LA30_7==EOF) ) {
                                alt30=1;
                            }


                        }


                        }
                        break;
                    case RULE_STRING_LITERAL:
                    case RULE_NUM_REAL:
                    case 28:
                    case 29:
                    case 30:
                        {
                        alt30=1;
                        }
                        break;

                    }

                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2847:4: otherlv_1= ':' ( (lv_constant1_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConstListAccess().getColonKeyword_1_0());
            	    			
            	    // InternalPascal.g:2851:4: ( (lv_constant1_2_0= ruleconstant ) )
            	    // InternalPascal.g:2852:5: (lv_constant1_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:2852:5: (lv_constant1_2_0= ruleconstant )
            	    // InternalPascal.g:2853:6: lv_constant1_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getConstListAccess().getConstant1ConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_constant1_2_0=ruleconstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constant1",
            	    							lv_constant1_2_0,
            	    							"compilador.Pascal.constant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstList"


    // $ANTLR start "entryRulevariableDeclarationPart"
    // InternalPascal.g:2875:1: entryRulevariableDeclarationPart returns [EObject current=null] : iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF ;
    public final EObject entryRulevariableDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableDeclarationPart = null;


        try {
            // InternalPascal.g:2875:64: (iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF )
            // InternalPascal.g:2876:2: iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariableDeclarationPart=rulevariableDeclarationPart();

            state._fsp--;

             current =iv_rulevariableDeclarationPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariableDeclarationPart"


    // $ANTLR start "rulevariableDeclarationPart"
    // InternalPascal.g:2882:1: rulevariableDeclarationPart returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' ) ;
    public final EObject rulevariableDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclaration_1_0 = null;

        EObject lv_variableDeclaration1_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2888:2: ( (otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:2889:2: (otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:2889:2: (otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' )
            // InternalPascal.g:2890:3: otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationPartAccess().getVarKeyword_0());
            		
            // InternalPascal.g:2894:3: ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) )
            // InternalPascal.g:2895:4: (lv_variableDeclaration_1_0= rulevariableDeclaration )
            {
            // InternalPascal.g:2895:4: (lv_variableDeclaration_1_0= rulevariableDeclaration )
            // InternalPascal.g:2896:5: lv_variableDeclaration_1_0= rulevariableDeclaration
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationPartAccess().getVariableDeclarationVariableDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_variableDeclaration_1_0=rulevariableDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationPartRule());
            					}
            					set(
            						current,
            						"variableDeclaration",
            						lv_variableDeclaration_1_0,
            						"compilador.Pascal.variableDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2913:3: (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==RULE_IDENT) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:2914:4: otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationPartAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:2918:4: ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) )
            	    // InternalPascal.g:2919:5: (lv_variableDeclaration1_3_0= rulevariableDeclaration )
            	    {
            	    // InternalPascal.g:2919:5: (lv_variableDeclaration1_3_0= rulevariableDeclaration )
            	    // InternalPascal.g:2920:6: lv_variableDeclaration1_3_0= rulevariableDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getVariableDeclarationPartAccess().getVariableDeclaration1VariableDeclarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_variableDeclaration1_3_0=rulevariableDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariableDeclarationPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variableDeclaration1",
            	    							lv_variableDeclaration1_3_0,
            	    							"compilador.Pascal.variableDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationPartAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariableDeclarationPart"


    // $ANTLR start "entryRulevariableDeclaration"
    // InternalPascal.g:2946:1: entryRulevariableDeclaration returns [EObject current=null] : iv_rulevariableDeclaration= rulevariableDeclaration EOF ;
    public final EObject entryRulevariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableDeclaration = null;


        try {
            // InternalPascal.g:2946:60: (iv_rulevariableDeclaration= rulevariableDeclaration EOF )
            // InternalPascal.g:2947:2: iv_rulevariableDeclaration= rulevariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariableDeclaration=rulevariableDeclaration();

            state._fsp--;

             current =iv_rulevariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariableDeclaration"


    // $ANTLR start "rulevariableDeclaration"
    // InternalPascal.g:2953:1: rulevariableDeclaration returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2959:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:2960:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:2960:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:2961:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:2961:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:2962:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:2962:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:2963:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_identifierList_0_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_0_0,
            						"compilador.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalPascal.g:2984:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:2985:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:2985:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:2986:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"compilador.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariableDeclaration"


    // $ANTLR start "entryRuleprocedureAndFunctionDeclarationPart"
    // InternalPascal.g:3007:1: entryRuleprocedureAndFunctionDeclarationPart returns [EObject current=null] : iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF ;
    public final EObject entryRuleprocedureAndFunctionDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureAndFunctionDeclarationPart = null;


        try {
            // InternalPascal.g:3007:76: (iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF )
            // InternalPascal.g:3008:2: iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF
            {
             newCompositeNode(grammarAccess.getProcedureAndFunctionDeclarationPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureAndFunctionDeclarationPart=ruleprocedureAndFunctionDeclarationPart();

            state._fsp--;

             current =iv_ruleprocedureAndFunctionDeclarationPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedureAndFunctionDeclarationPart"


    // $ANTLR start "ruleprocedureAndFunctionDeclarationPart"
    // InternalPascal.g:3014:1: ruleprocedureAndFunctionDeclarationPart returns [EObject current=null] : ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' ) ;
    public final EObject ruleprocedureAndFunctionDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_procedureOrFunctionDeclaration_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3020:2: ( ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' ) )
            // InternalPascal.g:3021:2: ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' )
            {
            // InternalPascal.g:3021:2: ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' )
            // InternalPascal.g:3022:3: ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';'
            {
            // InternalPascal.g:3022:3: ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) )
            // InternalPascal.g:3023:4: (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration )
            {
            // InternalPascal.g:3023:4: (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration )
            // InternalPascal.g:3024:5: lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration
            {

            					newCompositeNode(grammarAccess.getProcedureAndFunctionDeclarationPartAccess().getProcedureOrFunctionDeclarationProcedureOrFunctionDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_procedureOrFunctionDeclaration_0_0=ruleprocedureOrFunctionDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureAndFunctionDeclarationPartRule());
            					}
            					set(
            						current,
            						"procedureOrFunctionDeclaration",
            						lv_procedureOrFunctionDeclaration_0_0,
            						"compilador.Pascal.procedureOrFunctionDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedureAndFunctionDeclarationPartAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedureAndFunctionDeclarationPart"


    // $ANTLR start "entryRuleprocedureOrFunctionDeclaration"
    // InternalPascal.g:3049:1: entryRuleprocedureOrFunctionDeclaration returns [EObject current=null] : iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF ;
    public final EObject entryRuleprocedureOrFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureOrFunctionDeclaration = null;


        try {
            // InternalPascal.g:3049:71: (iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF )
            // InternalPascal.g:3050:2: iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcedureOrFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureOrFunctionDeclaration=ruleprocedureOrFunctionDeclaration();

            state._fsp--;

             current =iv_ruleprocedureOrFunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedureOrFunctionDeclaration"


    // $ANTLR start "ruleprocedureOrFunctionDeclaration"
    // InternalPascal.g:3056:1: ruleprocedureOrFunctionDeclaration returns [EObject current=null] : ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) ) ;
    public final EObject ruleprocedureOrFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_procedureDeclaration_0_0 = null;

        EObject lv_functionDeclaration_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3062:2: ( ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) ) )
            // InternalPascal.g:3063:2: ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) )
            {
            // InternalPascal.g:3063:2: ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            else if ( (LA32_0==33) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalPascal.g:3064:3: ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) )
                    {
                    // InternalPascal.g:3064:3: ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) )
                    // InternalPascal.g:3065:4: (lv_procedureDeclaration_0_0= ruleprocedureDeclaration )
                    {
                    // InternalPascal.g:3065:4: (lv_procedureDeclaration_0_0= ruleprocedureDeclaration )
                    // InternalPascal.g:3066:5: lv_procedureDeclaration_0_0= ruleprocedureDeclaration
                    {

                    					newCompositeNode(grammarAccess.getProcedureOrFunctionDeclarationAccess().getProcedureDeclarationProcedureDeclarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedureDeclaration_0_0=ruleprocedureDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureOrFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"procedureDeclaration",
                    						lv_procedureDeclaration_0_0,
                    						"compilador.Pascal.procedureDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3084:3: ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) )
                    {
                    // InternalPascal.g:3084:3: ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) )
                    // InternalPascal.g:3085:4: (lv_functionDeclaration_1_0= rulefunctionDeclaration )
                    {
                    // InternalPascal.g:3085:4: (lv_functionDeclaration_1_0= rulefunctionDeclaration )
                    // InternalPascal.g:3086:5: lv_functionDeclaration_1_0= rulefunctionDeclaration
                    {

                    					newCompositeNode(grammarAccess.getProcedureOrFunctionDeclarationAccess().getFunctionDeclarationFunctionDeclarationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionDeclaration_1_0=rulefunctionDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureOrFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"functionDeclaration",
                    						lv_functionDeclaration_1_0,
                    						"compilador.Pascal.functionDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedureOrFunctionDeclaration"


    // $ANTLR start "entryRuleprocedureDeclaration"
    // InternalPascal.g:3107:1: entryRuleprocedureDeclaration returns [EObject current=null] : iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF ;
    public final EObject entryRuleprocedureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureDeclaration = null;


        try {
            // InternalPascal.g:3107:61: (iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF )
            // InternalPascal.g:3108:2: iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcedureDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureDeclaration=ruleprocedureDeclaration();

            state._fsp--;

             current =iv_ruleprocedureDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedureDeclaration"


    // $ANTLR start "ruleprocedureDeclaration"
    // InternalPascal.g:3114:1: ruleprocedureDeclaration returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) ) ;
    public final EObject ruleprocedureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_identifier_1_0 = null;

        EObject lv_formalParameterList_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3120:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) ) )
            // InternalPascal.g:3121:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) )
            {
            // InternalPascal.g:3121:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) )
            // InternalPascal.g:3122:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_0());
            		
            // InternalPascal.g:3126:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:3127:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:3127:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:3128:5: lv_identifier_1_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getIdentifierIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_identifier_1_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_1_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3145:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPascal.g:3146:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:3146:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:3147:5: lv_formalParameterList_2_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getFormalParameterListFormalParameterListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_formalParameterList_2_0=ruleformalParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"formalParameterList",
                    						lv_formalParameterList_2_0,
                    						"compilador.Pascal.formalParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProcedureDeclarationAccess().getSemicolonKeyword_3());
            		
            // InternalPascal.g:3168:3: ( (lv_block_4_0= ruleblock ) )
            // InternalPascal.g:3169:4: (lv_block_4_0= ruleblock )
            {
            // InternalPascal.g:3169:4: (lv_block_4_0= ruleblock )
            // InternalPascal.g:3170:5: lv_block_4_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getBlockBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_4_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_4_0,
            						"compilador.Pascal.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedureDeclaration"


    // $ANTLR start "entryRulefunctionDeclaration"
    // InternalPascal.g:3191:1: entryRulefunctionDeclaration returns [EObject current=null] : iv_rulefunctionDeclaration= rulefunctionDeclaration EOF ;
    public final EObject entryRulefunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDeclaration = null;


        try {
            // InternalPascal.g:3191:60: (iv_rulefunctionDeclaration= rulefunctionDeclaration EOF )
            // InternalPascal.g:3192:2: iv_rulefunctionDeclaration= rulefunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunctionDeclaration=rulefunctionDeclaration();

            state._fsp--;

             current =iv_rulefunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunctionDeclaration"


    // $ANTLR start "rulefunctionDeclaration"
    // InternalPascal.g:3198:1: rulefunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) ) ;
    public final EObject rulefunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_identifier_1_0 = null;

        EObject lv_formalParameterList_2_0 = null;

        EObject lv_resultType_4_0 = null;

        EObject lv_block_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3204:2: ( (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) ) )
            // InternalPascal.g:3205:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) )
            {
            // InternalPascal.g:3205:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) )
            // InternalPascal.g:3206:3: otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:3210:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:3211:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:3211:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:3212:5: lv_identifier_1_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getIdentifierIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifier_1_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_1_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3229:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:3230:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:3230:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:3231:5: lv_formalParameterList_2_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getFormalParameterListFormalParameterListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_formalParameterList_2_0=ruleformalParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"formalParameterList",
                    						lv_formalParameterList_2_0,
                    						"compilador.Pascal.formalParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getColonKeyword_3());
            		
            // InternalPascal.g:3252:3: ( (lv_resultType_4_0= ruleresultType ) )
            // InternalPascal.g:3253:4: (lv_resultType_4_0= ruleresultType )
            {
            // InternalPascal.g:3253:4: (lv_resultType_4_0= ruleresultType )
            // InternalPascal.g:3254:5: lv_resultType_4_0= ruleresultType
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getResultTypeResultTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_resultType_4_0=ruleresultType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"resultType",
            						lv_resultType_4_0,
            						"compilador.Pascal.resultType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_5());
            		
            // InternalPascal.g:3275:3: ( (lv_block_6_0= ruleblock ) )
            // InternalPascal.g:3276:4: (lv_block_6_0= ruleblock )
            {
            // InternalPascal.g:3276:4: (lv_block_6_0= ruleblock )
            // InternalPascal.g:3277:5: lv_block_6_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBlockBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_6_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_6_0,
            						"compilador.Pascal.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunctionDeclaration"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:3298:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:3298:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:3299:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:3305:1: rulestatement returns [EObject current=null] : ( (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_label_0 = null;

        EObject lv_unlabelledStatement_2_0 = null;

        EObject lv_unlabelledStatement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3311:2: ( ( (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) ) )
            // InternalPascal.g:3312:2: ( (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) )
            {
            // InternalPascal.g:3312:2: ( (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) )
            int alt35=2;
            switch ( input.LA(1) ) {
            case RULE_NUM:
                {
                alt35=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==EOF||LA35_2==18||LA35_2==20||LA35_2==22||LA35_2==42||LA35_2==45||LA35_2==48||LA35_2==51||LA35_2==53) ) {
                    alt35=2;
                }
                else if ( (LA35_2==34) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 22:
            case 48:
            case 49:
            case 52:
            case 69:
            case 70:
                {
                alt35=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3313:3: (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) )
                    {
                    // InternalPascal.g:3313:3: (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) )
                    // InternalPascal.g:3314:4: this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) )
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_20);
                    this_label_0=rulelabel();

                    state._fsp--;


                    				current = this_label_0;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,34,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:3326:4: ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) )
                    // InternalPascal.g:3327:5: (lv_unlabelledStatement_2_0= ruleunlabelledStatement )
                    {
                    // InternalPascal.g:3327:5: (lv_unlabelledStatement_2_0= ruleunlabelledStatement )
                    // InternalPascal.g:3328:6: lv_unlabelledStatement_2_0= ruleunlabelledStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getUnlabelledStatementUnlabelledStatementParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unlabelledStatement_2_0=ruleunlabelledStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"unlabelledStatement",
                    							lv_unlabelledStatement_2_0,
                    							"compilador.Pascal.unlabelledStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3347:3: ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) )
                    {
                    // InternalPascal.g:3347:3: ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) )
                    // InternalPascal.g:3348:4: (lv_unlabelledStatement_3_0= ruleunlabelledStatement )
                    {
                    // InternalPascal.g:3348:4: (lv_unlabelledStatement_3_0= ruleunlabelledStatement )
                    // InternalPascal.g:3349:5: lv_unlabelledStatement_3_0= ruleunlabelledStatement
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getUnlabelledStatementUnlabelledStatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unlabelledStatement_3_0=ruleunlabelledStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"unlabelledStatement",
                    						lv_unlabelledStatement_3_0,
                    						"compilador.Pascal.unlabelledStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuleunlabelledStatement"
    // InternalPascal.g:3370:1: entryRuleunlabelledStatement returns [EObject current=null] : iv_ruleunlabelledStatement= ruleunlabelledStatement EOF ;
    public final EObject entryRuleunlabelledStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunlabelledStatement = null;


        try {
            // InternalPascal.g:3370:60: (iv_ruleunlabelledStatement= ruleunlabelledStatement EOF )
            // InternalPascal.g:3371:2: iv_ruleunlabelledStatement= ruleunlabelledStatement EOF
            {
             newCompositeNode(grammarAccess.getUnlabelledStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunlabelledStatement=ruleunlabelledStatement();

            state._fsp--;

             current =iv_ruleunlabelledStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunlabelledStatement"


    // $ANTLR start "ruleunlabelledStatement"
    // InternalPascal.g:3377:1: ruleunlabelledStatement returns [EObject current=null] : ( ( (lv_simpleStatement_0_0= rulesimpleStatement ) ) | ( (lv_structuredStatement_1_0= rulestructuredStatement ) ) | ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? ) ) ;
    public final EObject ruleunlabelledStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_simpleStatement_0_0 = null;

        EObject lv_structuredStatement_1_0 = null;

        AntlrDatatypeRuleToken lv_identifier_2_0 = null;

        EObject lv_parameterList_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3383:2: ( ( ( (lv_simpleStatement_0_0= rulesimpleStatement ) ) | ( (lv_structuredStatement_1_0= rulestructuredStatement ) ) | ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? ) ) )
            // InternalPascal.g:3384:2: ( ( (lv_simpleStatement_0_0= rulesimpleStatement ) ) | ( (lv_structuredStatement_1_0= rulestructuredStatement ) ) | ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? ) )
            {
            // InternalPascal.g:3384:2: ( ( (lv_simpleStatement_0_0= rulesimpleStatement ) ) | ( (lv_structuredStatement_1_0= rulestructuredStatement ) ) | ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case EOF:
            case 22:
            case 48:
            case 52:
            case 69:
                {
                alt37=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==18||LA37_2==42||LA37_2==45||LA37_2==51||LA37_2==53) ) {
                    alt37=1;
                }
                else if ( (LA37_2==EOF||LA37_2==20||LA37_2==22||LA37_2==48) ) {
                    alt37=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
            case 70:
                {
                alt37=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalPascal.g:3385:3: ( (lv_simpleStatement_0_0= rulesimpleStatement ) )
                    {
                    // InternalPascal.g:3385:3: ( (lv_simpleStatement_0_0= rulesimpleStatement ) )
                    // InternalPascal.g:3386:4: (lv_simpleStatement_0_0= rulesimpleStatement )
                    {
                    // InternalPascal.g:3386:4: (lv_simpleStatement_0_0= rulesimpleStatement )
                    // InternalPascal.g:3387:5: lv_simpleStatement_0_0= rulesimpleStatement
                    {

                    					newCompositeNode(grammarAccess.getUnlabelledStatementAccess().getSimpleStatementSimpleStatementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simpleStatement_0_0=rulesimpleStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnlabelledStatementRule());
                    					}
                    					set(
                    						current,
                    						"simpleStatement",
                    						lv_simpleStatement_0_0,
                    						"compilador.Pascal.simpleStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3405:3: ( (lv_structuredStatement_1_0= rulestructuredStatement ) )
                    {
                    // InternalPascal.g:3405:3: ( (lv_structuredStatement_1_0= rulestructuredStatement ) )
                    // InternalPascal.g:3406:4: (lv_structuredStatement_1_0= rulestructuredStatement )
                    {
                    // InternalPascal.g:3406:4: (lv_structuredStatement_1_0= rulestructuredStatement )
                    // InternalPascal.g:3407:5: lv_structuredStatement_1_0= rulestructuredStatement
                    {

                    					newCompositeNode(grammarAccess.getUnlabelledStatementAccess().getStructuredStatementStructuredStatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structuredStatement_1_0=rulestructuredStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnlabelledStatementRule());
                    					}
                    					set(
                    						current,
                    						"structuredStatement",
                    						lv_structuredStatement_1_0,
                    						"compilador.Pascal.structuredStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3425:3: ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? )
                    {
                    // InternalPascal.g:3425:3: ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? )
                    // InternalPascal.g:3426:4: ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )?
                    {
                    // InternalPascal.g:3426:4: ( (lv_identifier_2_0= ruleidentifier ) )
                    // InternalPascal.g:3427:5: (lv_identifier_2_0= ruleidentifier )
                    {
                    // InternalPascal.g:3427:5: (lv_identifier_2_0= ruleidentifier )
                    // InternalPascal.g:3428:6: lv_identifier_2_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getUnlabelledStatementAccess().getIdentifierIdentifierParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_identifier_2_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnlabelledStatementRule());
                    						}
                    						set(
                    							current,
                    							"identifier",
                    							lv_identifier_2_0,
                    							"compilador.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:3445:4: (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==20) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalPascal.g:3446:5: otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_38); 

                            					newLeafNode(otherlv_3, grammarAccess.getUnlabelledStatementAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalPascal.g:3450:5: ( (lv_parameterList_4_0= ruleparameterList ) )
                            // InternalPascal.g:3451:6: (lv_parameterList_4_0= ruleparameterList )
                            {
                            // InternalPascal.g:3451:6: (lv_parameterList_4_0= ruleparameterList )
                            // InternalPascal.g:3452:7: lv_parameterList_4_0= ruleparameterList
                            {

                            							newCompositeNode(grammarAccess.getUnlabelledStatementAccess().getParameterListParameterListParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_parameterList_4_0=ruleparameterList();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUnlabelledStatementRule());
                            							}
                            							set(
                            								current,
                            								"parameterList",
                            								lv_parameterList_4_0,
                            								"compilador.Pascal.parameterList");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_5=(Token)match(input,21,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getUnlabelledStatementAccess().getRightParenthesisKeyword_2_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunlabelledStatement"


    // $ANTLR start "entryRulesimpleStatement"
    // InternalPascal.g:3479:1: entryRulesimpleStatement returns [EObject current=null] : iv_rulesimpleStatement= rulesimpleStatement EOF ;
    public final EObject entryRulesimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleStatement = null;


        try {
            // InternalPascal.g:3479:56: (iv_rulesimpleStatement= rulesimpleStatement EOF )
            // InternalPascal.g:3480:2: iv_rulesimpleStatement= rulesimpleStatement EOF
            {
             newCompositeNode(grammarAccess.getSimpleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimpleStatement=rulesimpleStatement();

            state._fsp--;

             current =iv_rulesimpleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimpleStatement"


    // $ANTLR start "rulesimpleStatement"
    // InternalPascal.g:3486:1: rulesimpleStatement returns [EObject current=null] : ( () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )? ) ;
    public final EObject rulesimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_gotoStatement_1_0 = null;

        EObject lv_assignmentStatement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3492:2: ( ( () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )? ) )
            // InternalPascal.g:3493:2: ( () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )? )
            {
            // InternalPascal.g:3493:2: ( () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )? )
            // InternalPascal.g:3494:3: () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )?
            {
            // InternalPascal.g:3494:3: ()
            // InternalPascal.g:3495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleStatementAccess().getSimpleStatementAction_0(),
            					current);
            			

            }

            // InternalPascal.g:3501:3: ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==69) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_IDENT||LA38_0==52) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:3502:4: ( (lv_gotoStatement_1_0= rulegotoStatement ) )
                    {
                    // InternalPascal.g:3502:4: ( (lv_gotoStatement_1_0= rulegotoStatement ) )
                    // InternalPascal.g:3503:5: (lv_gotoStatement_1_0= rulegotoStatement )
                    {
                    // InternalPascal.g:3503:5: (lv_gotoStatement_1_0= rulegotoStatement )
                    // InternalPascal.g:3504:6: lv_gotoStatement_1_0= rulegotoStatement
                    {

                    						newCompositeNode(grammarAccess.getSimpleStatementAccess().getGotoStatementGotoStatementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_gotoStatement_1_0=rulegotoStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                    						}
                    						set(
                    							current,
                    							"gotoStatement",
                    							lv_gotoStatement_1_0,
                    							"compilador.Pascal.gotoStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3522:4: ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) )
                    {
                    // InternalPascal.g:3522:4: ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) )
                    // InternalPascal.g:3523:5: (lv_assignmentStatement_2_0= ruleassignmentStatement )
                    {
                    // InternalPascal.g:3523:5: (lv_assignmentStatement_2_0= ruleassignmentStatement )
                    // InternalPascal.g:3524:6: lv_assignmentStatement_2_0= ruleassignmentStatement
                    {

                    						newCompositeNode(grammarAccess.getSimpleStatementAccess().getAssignmentStatementAssignmentStatementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_assignmentStatement_2_0=ruleassignmentStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                    						}
                    						set(
                    							current,
                    							"assignmentStatement",
                    							lv_assignmentStatement_2_0,
                    							"compilador.Pascal.assignmentStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimpleStatement"


    // $ANTLR start "entryRuleassignmentStatement"
    // InternalPascal.g:3546:1: entryRuleassignmentStatement returns [EObject current=null] : iv_ruleassignmentStatement= ruleassignmentStatement EOF ;
    public final EObject entryRuleassignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignmentStatement = null;


        try {
            // InternalPascal.g:3546:60: (iv_ruleassignmentStatement= ruleassignmentStatement EOF )
            // InternalPascal.g:3547:2: iv_ruleassignmentStatement= ruleassignmentStatement EOF
            {
             newCompositeNode(grammarAccess.getAssignmentStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassignmentStatement=ruleassignmentStatement();

            state._fsp--;

             current =iv_ruleassignmentStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignmentStatement"


    // $ANTLR start "ruleassignmentStatement"
    // InternalPascal.g:3553:1: ruleassignmentStatement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3559:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:3560:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:3560:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:3561:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:3561:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:3562:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:3562:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:3563:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignmentStatementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentStatementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"compilador.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentStatementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPascal.g:3584:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:3585:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:3585:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:3586:5: lv_expression_2_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentStatementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"compilador.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignmentStatement"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:3607:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:3607:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:3608:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:3614:1: rulevariable returns [EObject current=null] : ( ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )* ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_identifier_1_0 = null;

        AntlrDatatypeRuleToken lv_identifier_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression1_6_0 = null;

        EObject lv_expression2_9_0 = null;

        EObject lv_expression3_11_0 = null;

        AntlrDatatypeRuleToken lv_identifier2_14_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3620:2: ( ( ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )* ) )
            // InternalPascal.g:3621:2: ( ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )* )
            {
            // InternalPascal.g:3621:2: ( ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )* )
            // InternalPascal.g:3622:3: ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )*
            {
            // InternalPascal.g:3622:3: ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==52) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_IDENT) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:3623:4: (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) )
                    {
                    // InternalPascal.g:3623:4: (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) )
                    // InternalPascal.g:3624:5: otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) )
                    {
                    otherlv_0=(Token)match(input,52,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0());
                    				
                    // InternalPascal.g:3628:5: ( (lv_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:3629:6: (lv_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:3629:6: (lv_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:3630:7: lv_identifier_1_0= ruleidentifier
                    {

                    							newCompositeNode(grammarAccess.getVariableAccess().getIdentifierIdentifierParserRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_40);
                    lv_identifier_1_0=ruleidentifier();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVariableRule());
                    							}
                    							set(
                    								current,
                    								"identifier",
                    								lv_identifier_1_0,
                    								"compilador.Pascal.identifier");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3649:4: ( (lv_identifier_2_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:3649:4: ( (lv_identifier_2_0= ruleidentifier ) )
                    // InternalPascal.g:3650:5: (lv_identifier_2_0= ruleidentifier )
                    {
                    // InternalPascal.g:3650:5: (lv_identifier_2_0= ruleidentifier )
                    // InternalPascal.g:3651:6: lv_identifier_2_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getIdentifierIdentifierParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_identifier_2_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"identifier",
                    							lv_identifier_2_0,
                    							"compilador.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascal.g:3669:3: ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )*
            loop42:
            do {
                int alt42=5;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    alt42=1;
                    }
                    break;
                case 53:
                    {
                    alt42=2;
                    }
                    break;
                case 18:
                    {
                    alt42=3;
                    }
                    break;
                case 42:
                    {
                    alt42=4;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:3670:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    {
            	    // InternalPascal.g:3670:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    // InternalPascal.g:3671:5: otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )* otherlv_7= ']'
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_38); 

            	    					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0());
            	    				
            	    // InternalPascal.g:3675:5: ( (lv_expression_4_0= ruleexpression ) )
            	    // InternalPascal.g:3676:6: (lv_expression_4_0= ruleexpression )
            	    {
            	    // InternalPascal.g:3676:6: (lv_expression_4_0= ruleexpression )
            	    // InternalPascal.g:3677:7: lv_expression_4_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_41);
            	    lv_expression_4_0=ruleexpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"expression",
            	    								lv_expression_4_0,
            	    								"compilador.Pascal.expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPascal.g:3694:5: (otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) ) )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==23) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalPascal.g:3695:6: otherlv_5= ',' ( (lv_expression1_6_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,23,FOLLOW_38); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0());
            	    	    					
            	    	    // InternalPascal.g:3699:6: ( (lv_expression1_6_0= ruleexpression ) )
            	    	    // InternalPascal.g:3700:7: (lv_expression1_6_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:3700:7: (lv_expression1_6_0= ruleexpression )
            	    	    // InternalPascal.g:3701:8: lv_expression1_6_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpression1ExpressionParserRuleCall_1_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_41);
            	    	    lv_expression1_6_0=ruleexpression();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"expression1",
            	    	    									lv_expression1_6_0,
            	    	    									"compilador.Pascal.expression");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,46,FOLLOW_40); 

            	    					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:3725:4: (otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    {
            	    // InternalPascal.g:3725:4: (otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    // InternalPascal.g:3726:5: otherlv_8= '(.' ( (lv_expression2_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )* otherlv_12= '.)'
            	    {
            	    otherlv_8=(Token)match(input,53,FOLLOW_38); 

            	    					newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0());
            	    				
            	    // InternalPascal.g:3730:5: ( (lv_expression2_9_0= ruleexpression ) )
            	    // InternalPascal.g:3731:6: (lv_expression2_9_0= ruleexpression )
            	    {
            	    // InternalPascal.g:3731:6: (lv_expression2_9_0= ruleexpression )
            	    // InternalPascal.g:3732:7: lv_expression2_9_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpression2ExpressionParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_42);
            	    lv_expression2_9_0=ruleexpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"expression2",
            	    								lv_expression2_9_0,
            	    								"compilador.Pascal.expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPascal.g:3749:5: (otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==23) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalPascal.g:3750:6: otherlv_10= ',' ( (lv_expression3_11_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,23,FOLLOW_38); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0());
            	    	    					
            	    	    // InternalPascal.g:3754:6: ( (lv_expression3_11_0= ruleexpression ) )
            	    	    // InternalPascal.g:3755:7: (lv_expression3_11_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:3755:7: (lv_expression3_11_0= ruleexpression )
            	    	    // InternalPascal.g:3756:8: lv_expression3_11_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpression3ExpressionParserRuleCall_1_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_42);
            	    	    lv_expression3_11_0=ruleexpression();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"expression3",
            	    	    									lv_expression3_11_0,
            	    	    									"compilador.Pascal.expression");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,54,FOLLOW_40); 

            	    					newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:3780:4: (otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) ) )
            	    {
            	    // InternalPascal.g:3780:4: (otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) ) )
            	    // InternalPascal.g:3781:5: otherlv_13= '.' ( (lv_identifier2_14_0= ruleidentifier ) )
            	    {
            	    otherlv_13=(Token)match(input,18,FOLLOW_5); 

            	    					newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0());
            	    				
            	    // InternalPascal.g:3785:5: ( (lv_identifier2_14_0= ruleidentifier ) )
            	    // InternalPascal.g:3786:6: (lv_identifier2_14_0= ruleidentifier )
            	    {
            	    // InternalPascal.g:3786:6: (lv_identifier2_14_0= ruleidentifier )
            	    // InternalPascal.g:3787:7: lv_identifier2_14_0= ruleidentifier
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getIdentifier2IdentifierParserRuleCall_1_2_1_0());
            	    						
            	    pushFollow(FOLLOW_40);
            	    lv_identifier2_14_0=ruleidentifier();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"identifier2",
            	    								lv_identifier2_14_0,
            	    								"compilador.Pascal.identifier");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPascal.g:3806:4: otherlv_15= '^'
            	    {
            	    otherlv_15=(Token)match(input,42,FOLLOW_40); 

            	    				newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:3815:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:3815:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:3816:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:3822:1: ruleexpression returns [EObject current=null] : ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleExpression_0_0 = null;

        AntlrDatatypeRuleToken lv_relationaloperator_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3828:2: ( ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:3829:2: ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:3829:2: ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )? )
            // InternalPascal.g:3830:3: ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:3830:3: ( (lv_simpleExpression_0_0= rulesimpleExpression ) )
            // InternalPascal.g:3831:4: (lv_simpleExpression_0_0= rulesimpleExpression )
            {
            // InternalPascal.g:3831:4: (lv_simpleExpression_0_0= rulesimpleExpression )
            // InternalPascal.g:3832:5: lv_simpleExpression_0_0= rulesimpleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_simpleExpression_0_0=rulesimpleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"simpleExpression",
            						lv_simpleExpression_0_0,
            						"compilador.Pascal.simpleExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3849:3: ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==27||(LA43_0>=55 && LA43_0<=60)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPascal.g:3850:4: ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) )
                    {
                    // InternalPascal.g:3850:4: ( (lv_relationaloperator_1_0= rulerelationaloperator ) )
                    // InternalPascal.g:3851:5: (lv_relationaloperator_1_0= rulerelationaloperator )
                    {
                    // InternalPascal.g:3851:5: (lv_relationaloperator_1_0= rulerelationaloperator )
                    // InternalPascal.g:3852:6: lv_relationaloperator_1_0= rulerelationaloperator
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getRelationaloperatorRelationaloperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_relationaloperator_1_0=rulerelationaloperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"relationaloperator",
                    							lv_relationaloperator_1_0,
                    							"compilador.Pascal.relationaloperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:3869:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascal.g:3870:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascal.g:3870:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascal.g:3871:6: lv_expression_2_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"compilador.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulerelationaloperator"
    // InternalPascal.g:3893:1: entryRulerelationaloperator returns [String current=null] : iv_rulerelationaloperator= rulerelationaloperator EOF ;
    public final String entryRulerelationaloperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelationaloperator = null;


        try {
            // InternalPascal.g:3893:58: (iv_rulerelationaloperator= rulerelationaloperator EOF )
            // InternalPascal.g:3894:2: iv_rulerelationaloperator= rulerelationaloperator EOF
            {
             newCompositeNode(grammarAccess.getRelationaloperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerelationaloperator=rulerelationaloperator();

            state._fsp--;

             current =iv_rulerelationaloperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerelationaloperator"


    // $ANTLR start "rulerelationaloperator"
    // InternalPascal.g:3900:1: rulerelationaloperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>=' | kw= '>' | kw= 'in' ) ;
    public final AntlrDatatypeRuleToken rulerelationaloperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:3906:2: ( (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>=' | kw= '>' | kw= 'in' ) )
            // InternalPascal.g:3907:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>=' | kw= '>' | kw= 'in' )
            {
            // InternalPascal.g:3907:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>=' | kw= '>' | kw= 'in' )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt44=1;
                }
                break;
            case 55:
                {
                alt44=2;
                }
                break;
            case 56:
                {
                alt44=3;
                }
                break;
            case 57:
                {
                alt44=4;
                }
                break;
            case 58:
                {
                alt44=5;
                }
                break;
            case 59:
                {
                alt44=6;
                }
                break;
            case 60:
                {
                alt44=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalPascal.g:3908:3: kw= '='
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3914:3: kw= '<>'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getLessThanSignGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:3920:3: kw= '<'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:3926:3: kw= '<='
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:3932:3: kw= '>='
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPascal.g:3938:3: kw= '>'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getGreaterThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPascal.g:3944:3: kw= 'in'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getInKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerelationaloperator"


    // $ANTLR start "entryRulesimpleExpression"
    // InternalPascal.g:3953:1: entryRulesimpleExpression returns [EObject current=null] : iv_rulesimpleExpression= rulesimpleExpression EOF ;
    public final EObject entryRulesimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleExpression = null;


        try {
            // InternalPascal.g:3953:57: (iv_rulesimpleExpression= rulesimpleExpression EOF )
            // InternalPascal.g:3954:2: iv_rulesimpleExpression= rulesimpleExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimpleExpression=rulesimpleExpression();

            state._fsp--;

             current =iv_rulesimpleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimpleExpression"


    // $ANTLR start "rulesimpleExpression"
    // InternalPascal.g:3960:1: rulesimpleExpression returns [EObject current=null] : ( ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? ) ;
    public final EObject rulesimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_0 = null;

        AntlrDatatypeRuleToken lv_additiveoperator_1_0 = null;

        EObject lv_simpleExpression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3966:2: ( ( ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? ) )
            // InternalPascal.g:3967:2: ( ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? )
            {
            // InternalPascal.g:3967:2: ( ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? )
            // InternalPascal.g:3968:3: ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )?
            {
            // InternalPascal.g:3968:3: ( (lv_term_0_0= ruleterm ) )
            // InternalPascal.g:3969:4: (lv_term_0_0= ruleterm )
            {
            // InternalPascal.g:3969:4: (lv_term_0_0= ruleterm )
            // InternalPascal.g:3970:5: lv_term_0_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimpleExpressionAccess().getTermTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_term_0_0=ruleterm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_0_0,
            						"compilador.Pascal.term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3987:3: ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=29 && LA45_0<=30)||LA45_0==61) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:3988:4: ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) )
                    {
                    // InternalPascal.g:3988:4: ( (lv_additiveoperator_1_0= ruleadditiveoperator ) )
                    // InternalPascal.g:3989:5: (lv_additiveoperator_1_0= ruleadditiveoperator )
                    {
                    // InternalPascal.g:3989:5: (lv_additiveoperator_1_0= ruleadditiveoperator )
                    // InternalPascal.g:3990:6: lv_additiveoperator_1_0= ruleadditiveoperator
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAdditiveoperatorAdditiveoperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_additiveoperator_1_0=ruleadditiveoperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    						}
                    						set(
                    							current,
                    							"additiveoperator",
                    							lv_additiveoperator_1_0,
                    							"compilador.Pascal.additiveoperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:4007:4: ( (lv_simpleExpression_2_0= rulesimpleExpression ) )
                    // InternalPascal.g:4008:5: (lv_simpleExpression_2_0= rulesimpleExpression )
                    {
                    // InternalPascal.g:4008:5: (lv_simpleExpression_2_0= rulesimpleExpression )
                    // InternalPascal.g:4009:6: lv_simpleExpression_2_0= rulesimpleExpression
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_simpleExpression_2_0=rulesimpleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    						}
                    						set(
                    							current,
                    							"simpleExpression",
                    							lv_simpleExpression_2_0,
                    							"compilador.Pascal.simpleExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimpleExpression"


    // $ANTLR start "entryRuleadditiveoperator"
    // InternalPascal.g:4031:1: entryRuleadditiveoperator returns [String current=null] : iv_ruleadditiveoperator= ruleadditiveoperator EOF ;
    public final String entryRuleadditiveoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadditiveoperator = null;


        try {
            // InternalPascal.g:4031:56: (iv_ruleadditiveoperator= ruleadditiveoperator EOF )
            // InternalPascal.g:4032:2: iv_ruleadditiveoperator= ruleadditiveoperator EOF
            {
             newCompositeNode(grammarAccess.getAdditiveoperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleadditiveoperator=ruleadditiveoperator();

            state._fsp--;

             current =iv_ruleadditiveoperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleadditiveoperator"


    // $ANTLR start "ruleadditiveoperator"
    // InternalPascal.g:4038:1: ruleadditiveoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleadditiveoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:4044:2: ( (kw= '+' | kw= '-' | kw= 'or' ) )
            // InternalPascal.g:4045:2: (kw= '+' | kw= '-' | kw= 'or' )
            {
            // InternalPascal.g:4045:2: (kw= '+' | kw= '-' | kw= 'or' )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt46=1;
                }
                break;
            case 30:
                {
                alt46=2;
                }
                break;
            case 61:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalPascal.g:4046:3: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4052:3: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:4058:3: kw= 'or'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getOrKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleadditiveoperator"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:4067:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:4067:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:4068:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:4074:1: ruleterm returns [EObject current=null] : ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )? ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_signedFactor_0_0 = null;

        AntlrDatatypeRuleToken lv_multiplicativeoperator_1_0 = null;

        EObject lv_term_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4080:2: ( ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )? ) )
            // InternalPascal.g:4081:2: ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )? )
            {
            // InternalPascal.g:4081:2: ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )? )
            // InternalPascal.g:4082:3: ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )?
            {
            // InternalPascal.g:4082:3: ( (lv_signedFactor_0_0= rulesignedFactor ) )
            // InternalPascal.g:4083:4: (lv_signedFactor_0_0= rulesignedFactor )
            {
            // InternalPascal.g:4083:4: (lv_signedFactor_0_0= rulesignedFactor )
            // InternalPascal.g:4084:5: lv_signedFactor_0_0= rulesignedFactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getSignedFactorSignedFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
            lv_signedFactor_0_0=rulesignedFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					set(
            						current,
            						"signedFactor",
            						lv_signedFactor_0_0,
            						"compilador.Pascal.signedFactor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4101:3: ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=62 && LA47_0<=66)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:4102:4: ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) )
                    {
                    // InternalPascal.g:4102:4: ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) )
                    // InternalPascal.g:4103:5: (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator )
                    {
                    // InternalPascal.g:4103:5: (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator )
                    // InternalPascal.g:4104:6: lv_multiplicativeoperator_1_0= rulemultiplicativeoperator
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getMultiplicativeoperatorMultiplicativeoperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_multiplicativeoperator_1_0=rulemultiplicativeoperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						set(
                    							current,
                    							"multiplicativeoperator",
                    							lv_multiplicativeoperator_1_0,
                    							"compilador.Pascal.multiplicativeoperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:4121:4: ( (lv_term_2_0= ruleterm ) )
                    // InternalPascal.g:4122:5: (lv_term_2_0= ruleterm )
                    {
                    // InternalPascal.g:4122:5: (lv_term_2_0= ruleterm )
                    // InternalPascal.g:4123:6: lv_term_2_0= ruleterm
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getTermTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_term_2_0=ruleterm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						set(
                    							current,
                    							"term",
                    							lv_term_2_0,
                    							"compilador.Pascal.term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulemultiplicativeoperator"
    // InternalPascal.g:4145:1: entryRulemultiplicativeoperator returns [String current=null] : iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF ;
    public final String entryRulemultiplicativeoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicativeoperator = null;


        try {
            // InternalPascal.g:4145:62: (iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF )
            // InternalPascal.g:4146:2: iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeoperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemultiplicativeoperator=rulemultiplicativeoperator();

            state._fsp--;

             current =iv_rulemultiplicativeoperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiplicativeoperator"


    // $ANTLR start "rulemultiplicativeoperator"
    // InternalPascal.g:4152:1: rulemultiplicativeoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken rulemultiplicativeoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:4158:2: ( (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) )
            // InternalPascal.g:4159:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            {
            // InternalPascal.g:4159:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt48=1;
                }
                break;
            case 63:
                {
                alt48=2;
                }
                break;
            case 64:
                {
                alt48=3;
                }
                break;
            case 65:
                {
                alt48=4;
                }
                break;
            case 66:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalPascal.g:4160:3: kw= '*'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4166:3: kw= '/'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:4172:3: kw= 'div'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getDivKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:4178:3: kw= 'mod'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getModKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:4184:3: kw= 'and'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getAndKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiplicativeoperator"


    // $ANTLR start "entryRulesignedFactor"
    // InternalPascal.g:4193:1: entryRulesignedFactor returns [EObject current=null] : iv_rulesignedFactor= rulesignedFactor EOF ;
    public final EObject entryRulesignedFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignedFactor = null;


        try {
            // InternalPascal.g:4193:53: (iv_rulesignedFactor= rulesignedFactor EOF )
            // InternalPascal.g:4194:2: iv_rulesignedFactor= rulesignedFactor EOF
            {
             newCompositeNode(grammarAccess.getSignedFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesignedFactor=rulesignedFactor();

            state._fsp--;

             current =iv_rulesignedFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignedFactor"


    // $ANTLR start "rulesignedFactor"
    // InternalPascal.g:4200:1: rulesignedFactor returns [EObject current=null] : ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) ) ;
    public final EObject rulesignedFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4206:2: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) ) )
            // InternalPascal.g:4207:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) )
            {
            // InternalPascal.g:4207:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) )
            // InternalPascal.g:4208:3: (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) )
            {
            // InternalPascal.g:4208:3: (otherlv_0= '+' | otherlv_1= '-' )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            else if ( (LA49_0==30) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // InternalPascal.g:4209:4: otherlv_0= '+'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_38); 

                    				newLeafNode(otherlv_0, grammarAccess.getSignedFactorAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4214:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getSignedFactorAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:4219:3: ( (lv_factor_2_0= rulefactor ) )
            // InternalPascal.g:4220:4: (lv_factor_2_0= rulefactor )
            {
            // InternalPascal.g:4220:4: (lv_factor_2_0= rulefactor )
            // InternalPascal.g:4221:5: lv_factor_2_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getSignedFactorAccess().getFactorFactorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_factor_2_0=rulefactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignedFactorRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_2_0,
            						"compilador.Pascal.factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignedFactor"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:4242:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:4242:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:4243:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:4249:1: rulefactor returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' ) | ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) ) | (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) ) | ( (lv_bool_6_0= RULE_BOOL ) ) | ( (lv_functionDesignator_7_0= rulefunctionDesignator ) ) | ( (lv_variable_8_0= rulevariable ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_bool_6_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_unsignedConstant_3_0 = null;

        EObject lv_factor_5_0 = null;

        EObject lv_functionDesignator_7_0 = null;

        EObject lv_variable_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4255:2: ( ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' ) | ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) ) | (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) ) | ( (lv_bool_6_0= RULE_BOOL ) ) | ( (lv_functionDesignator_7_0= rulefunctionDesignator ) ) | ( (lv_variable_8_0= rulevariable ) ) ) )
            // InternalPascal.g:4256:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' ) | ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) ) | (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) ) | ( (lv_bool_6_0= RULE_BOOL ) ) | ( (lv_functionDesignator_7_0= rulefunctionDesignator ) ) | ( (lv_variable_8_0= rulevariable ) ) )
            {
            // InternalPascal.g:4256:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' ) | ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) ) | (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) ) | ( (lv_bool_6_0= RULE_BOOL ) ) | ( (lv_functionDesignator_7_0= rulefunctionDesignator ) ) | ( (lv_variable_8_0= rulevariable ) ) )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt50=1;
                }
                break;
            case RULE_NUM:
            case RULE_STRING_LITERAL:
            case RULE_NUM_REAL:
            case 28:
            case 68:
                {
                alt50=2;
                }
                break;
            case 67:
                {
                alt50=3;
                }
                break;
            case RULE_BOOL:
                {
                alt50=4;
                }
                break;
            case RULE_IDENT:
                {
                int LA50_5 = input.LA(2);

                if ( (LA50_5==EOF||LA50_5==18||(LA50_5>=21 && LA50_5<=23)||LA50_5==27||(LA50_5>=29 && LA50_5<=30)||LA50_5==42||(LA50_5>=45 && LA50_5<=46)||LA50_5==48||LA50_5==50||(LA50_5>=53 && LA50_5<=66)) ) {
                    alt50=6;
                }
                else if ( (LA50_5==20) ) {
                    alt50=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 5, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt50=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalPascal.g:4257:3: (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' )
                    {
                    // InternalPascal.g:4257:3: (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' )
                    // InternalPascal.g:4258:4: otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalPascal.g:4262:4: ( (lv_expression_1_0= ruleexpression ) )
                    // InternalPascal.g:4263:5: (lv_expression_1_0= ruleexpression )
                    {
                    // InternalPascal.g:4263:5: (lv_expression_1_0= ruleexpression )
                    // InternalPascal.g:4264:6: lv_expression_1_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_1_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_1_0,
                    							"compilador.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4287:3: ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) )
                    {
                    // InternalPascal.g:4287:3: ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) )
                    // InternalPascal.g:4288:4: (lv_unsignedConstant_3_0= ruleunsignedConstant )
                    {
                    // InternalPascal.g:4288:4: (lv_unsignedConstant_3_0= ruleunsignedConstant )
                    // InternalPascal.g:4289:5: lv_unsignedConstant_3_0= ruleunsignedConstant
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getUnsignedConstantUnsignedConstantParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedConstant_3_0=ruleunsignedConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"unsignedConstant",
                    						lv_unsignedConstant_3_0,
                    						"compilador.Pascal.unsignedConstant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4307:3: (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:4307:3: (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) )
                    // InternalPascal.g:4308:4: otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) )
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getNotKeyword_2_0());
                    			
                    // InternalPascal.g:4312:4: ( (lv_factor_5_0= rulefactor ) )
                    // InternalPascal.g:4313:5: (lv_factor_5_0= rulefactor )
                    {
                    // InternalPascal.g:4313:5: (lv_factor_5_0= rulefactor )
                    // InternalPascal.g:4314:6: lv_factor_5_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_factor_5_0=rulefactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"factor",
                    							lv_factor_5_0,
                    							"compilador.Pascal.factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:4333:3: ( (lv_bool_6_0= RULE_BOOL ) )
                    {
                    // InternalPascal.g:4333:3: ( (lv_bool_6_0= RULE_BOOL ) )
                    // InternalPascal.g:4334:4: (lv_bool_6_0= RULE_BOOL )
                    {
                    // InternalPascal.g:4334:4: (lv_bool_6_0= RULE_BOOL )
                    // InternalPascal.g:4335:5: lv_bool_6_0= RULE_BOOL
                    {
                    lv_bool_6_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    					newLeafNode(lv_bool_6_0, grammarAccess.getFactorAccess().getBoolBOOLTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"bool",
                    						lv_bool_6_0,
                    						"compilador.Pascal.BOOL");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:4352:3: ( (lv_functionDesignator_7_0= rulefunctionDesignator ) )
                    {
                    // InternalPascal.g:4352:3: ( (lv_functionDesignator_7_0= rulefunctionDesignator ) )
                    // InternalPascal.g:4353:4: (lv_functionDesignator_7_0= rulefunctionDesignator )
                    {
                    // InternalPascal.g:4353:4: (lv_functionDesignator_7_0= rulefunctionDesignator )
                    // InternalPascal.g:4354:5: lv_functionDesignator_7_0= rulefunctionDesignator
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFunctionDesignatorFunctionDesignatorParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionDesignator_7_0=rulefunctionDesignator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"functionDesignator",
                    						lv_functionDesignator_7_0,
                    						"compilador.Pascal.functionDesignator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:4372:3: ( (lv_variable_8_0= rulevariable ) )
                    {
                    // InternalPascal.g:4372:3: ( (lv_variable_8_0= rulevariable ) )
                    // InternalPascal.g:4373:4: (lv_variable_8_0= rulevariable )
                    {
                    // InternalPascal.g:4373:4: (lv_variable_8_0= rulevariable )
                    // InternalPascal.g:4374:5: lv_variable_8_0= rulevariable
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_8_0=rulevariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_8_0,
                    						"compilador.Pascal.variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRuleunsignedConstant"
    // InternalPascal.g:4395:1: entryRuleunsignedConstant returns [EObject current=null] : iv_ruleunsignedConstant= ruleunsignedConstant EOF ;
    public final EObject entryRuleunsignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedConstant = null;


        try {
            // InternalPascal.g:4395:57: (iv_ruleunsignedConstant= ruleunsignedConstant EOF )
            // InternalPascal.g:4396:2: iv_ruleunsignedConstant= ruleunsignedConstant EOF
            {
             newCompositeNode(grammarAccess.getUnsignedConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsignedConstant=ruleunsignedConstant();

            state._fsp--;

             current =iv_ruleunsignedConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsignedConstant"


    // $ANTLR start "ruleunsignedConstant"
    // InternalPascal.g:4402:1: ruleunsignedConstant returns [EObject current=null] : ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) ) | ( (lv_constantChr_2_0= ruleconstantChr ) ) | ( () otherlv_4= 'nil' ) ) ;
    public final EObject ruleunsignedConstant() throws RecognitionException {
        EObject current = null;

        Token lv_string_literal_1_0=null;
        Token otherlv_4=null;
        EObject lv_unsignedNumber_0_0 = null;

        EObject lv_constantChr_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4408:2: ( ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) ) | ( (lv_constantChr_2_0= ruleconstantChr ) ) | ( () otherlv_4= 'nil' ) ) )
            // InternalPascal.g:4409:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) ) | ( (lv_constantChr_2_0= ruleconstantChr ) ) | ( () otherlv_4= 'nil' ) )
            {
            // InternalPascal.g:4409:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) ) | ( (lv_constantChr_2_0= ruleconstantChr ) ) | ( () otherlv_4= 'nil' ) )
            int alt51=4;
            switch ( input.LA(1) ) {
            case RULE_NUM:
            case RULE_NUM_REAL:
                {
                alt51=1;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt51=2;
                }
                break;
            case 28:
                {
                alt51=3;
                }
                break;
            case 68:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalPascal.g:4410:3: ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:4410:3: ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) )
                    // InternalPascal.g:4411:4: (lv_unsignedNumber_0_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:4411:4: (lv_unsignedNumber_0_0= ruleunsignedNumber )
                    // InternalPascal.g:4412:5: lv_unsignedNumber_0_0= ruleunsignedNumber
                    {

                    					newCompositeNode(grammarAccess.getUnsignedConstantAccess().getUnsignedNumberUnsignedNumberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedNumber_0_0=ruleunsignedNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedConstantRule());
                    					}
                    					set(
                    						current,
                    						"unsignedNumber",
                    						lv_unsignedNumber_0_0,
                    						"compilador.Pascal.unsignedNumber");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4430:3: ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) )
                    {
                    // InternalPascal.g:4430:3: ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) )
                    // InternalPascal.g:4431:4: (lv_string_literal_1_0= RULE_STRING_LITERAL )
                    {
                    // InternalPascal.g:4431:4: (lv_string_literal_1_0= RULE_STRING_LITERAL )
                    // InternalPascal.g:4432:5: lv_string_literal_1_0= RULE_STRING_LITERAL
                    {
                    lv_string_literal_1_0=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_string_literal_1_0, grammarAccess.getUnsignedConstantAccess().getString_literalSTRING_LITERALTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsignedConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string_literal",
                    						lv_string_literal_1_0,
                    						"compilador.Pascal.STRING_LITERAL");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4449:3: ( (lv_constantChr_2_0= ruleconstantChr ) )
                    {
                    // InternalPascal.g:4449:3: ( (lv_constantChr_2_0= ruleconstantChr ) )
                    // InternalPascal.g:4450:4: (lv_constantChr_2_0= ruleconstantChr )
                    {
                    // InternalPascal.g:4450:4: (lv_constantChr_2_0= ruleconstantChr )
                    // InternalPascal.g:4451:5: lv_constantChr_2_0= ruleconstantChr
                    {

                    					newCompositeNode(grammarAccess.getUnsignedConstantAccess().getConstantChrConstantChrParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constantChr_2_0=ruleconstantChr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedConstantRule());
                    					}
                    					set(
                    						current,
                    						"constantChr",
                    						lv_constantChr_2_0,
                    						"compilador.Pascal.constantChr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:4469:3: ( () otherlv_4= 'nil' )
                    {
                    // InternalPascal.g:4469:3: ( () otherlv_4= 'nil' )
                    // InternalPascal.g:4470:4: () otherlv_4= 'nil'
                    {
                    // InternalPascal.g:4470:4: ()
                    // InternalPascal.g:4471:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnsignedConstantAccess().getUnsignedConstantAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,68,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnsignedConstantAccess().getNilKeyword_3_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsignedConstant"


    // $ANTLR start "entryRulefunctionDesignator"
    // InternalPascal.g:4486:1: entryRulefunctionDesignator returns [EObject current=null] : iv_rulefunctionDesignator= rulefunctionDesignator EOF ;
    public final EObject entryRulefunctionDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDesignator = null;


        try {
            // InternalPascal.g:4486:59: (iv_rulefunctionDesignator= rulefunctionDesignator EOF )
            // InternalPascal.g:4487:2: iv_rulefunctionDesignator= rulefunctionDesignator EOF
            {
             newCompositeNode(grammarAccess.getFunctionDesignatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunctionDesignator=rulefunctionDesignator();

            state._fsp--;

             current =iv_rulefunctionDesignator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunctionDesignator"


    // $ANTLR start "rulefunctionDesignator"
    // InternalPascal.g:4493:1: rulefunctionDesignator returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' ) ;
    public final EObject rulefunctionDesignator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_identifier_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4499:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' ) )
            // InternalPascal.g:4500:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:4500:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )
            // InternalPascal.g:4501:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')'
            {
            // InternalPascal.g:4501:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4502:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4502:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4503:5: lv_identifier_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getFunctionDesignatorAccess().getIdentifierIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDesignatorRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_0_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDesignatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:4524:3: ( (lv_parameterList_2_0= ruleparameterList ) )
            // InternalPascal.g:4525:4: (lv_parameterList_2_0= ruleparameterList )
            {
            // InternalPascal.g:4525:4: (lv_parameterList_2_0= ruleparameterList )
            // InternalPascal.g:4526:5: lv_parameterList_2_0= ruleparameterList
            {

            					newCompositeNode(grammarAccess.getFunctionDesignatorAccess().getParameterListParameterListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_parameterList_2_0=ruleparameterList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDesignatorRule());
            					}
            					set(
            						current,
            						"parameterList",
            						lv_parameterList_2_0,
            						"compilador.Pascal.parameterList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDesignatorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunctionDesignator"


    // $ANTLR start "entryRuleparameterList"
    // InternalPascal.g:4551:1: entryRuleparameterList returns [EObject current=null] : iv_ruleparameterList= ruleparameterList EOF ;
    public final EObject entryRuleparameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterList = null;


        try {
            // InternalPascal.g:4551:54: (iv_ruleparameterList= ruleparameterList EOF )
            // InternalPascal.g:4552:2: iv_ruleparameterList= ruleparameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameterList=ruleparameterList();

            state._fsp--;

             current =iv_ruleparameterList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterList"


    // $ANTLR start "ruleparameterList"
    // InternalPascal.g:4558:1: ruleparameterList returns [EObject current=null] : (this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )* ) ;
    public final EObject ruleparameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_actualParameter_0 = null;

        EObject lv_actualParameter_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4564:2: ( (this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )* ) )
            // InternalPascal.g:4565:2: (this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )* )
            {
            // InternalPascal.g:4565:2: (this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )* )
            // InternalPascal.g:4566:3: this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )*
            {

            			newCompositeNode(grammarAccess.getParameterListAccess().getActualParameterParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_actualParameter_0=ruleactualParameter();

            state._fsp--;


            			current = this_actualParameter_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:4574:3: (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==23) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPascal.g:4575:4: otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_38); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:4579:4: ( (lv_actualParameter_2_0= ruleactualParameter ) )
            	    // InternalPascal.g:4580:5: (lv_actualParameter_2_0= ruleactualParameter )
            	    {
            	    // InternalPascal.g:4580:5: (lv_actualParameter_2_0= ruleactualParameter )
            	    // InternalPascal.g:4581:6: lv_actualParameter_2_0= ruleactualParameter
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getActualParameterActualParameterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_actualParameter_2_0=ruleactualParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actualParameter",
            	    							lv_actualParameter_2_0,
            	    							"compilador.Pascal.actualParameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterList"


    // $ANTLR start "entryRuleactualParameter"
    // InternalPascal.g:4603:1: entryRuleactualParameter returns [EObject current=null] : iv_ruleactualParameter= ruleactualParameter EOF ;
    public final EObject entryRuleactualParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactualParameter = null;


        try {
            // InternalPascal.g:4603:56: (iv_ruleactualParameter= ruleactualParameter EOF )
            // InternalPascal.g:4604:2: iv_ruleactualParameter= ruleactualParameter EOF
            {
             newCompositeNode(grammarAccess.getActualParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleactualParameter=ruleactualParameter();

            state._fsp--;

             current =iv_ruleactualParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleactualParameter"


    // $ANTLR start "ruleactualParameter"
    // InternalPascal.g:4610:1: ruleactualParameter returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleactualParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4616:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:4617:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:4617:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:4618:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:4618:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:4619:4: lv_expression_0_0= ruleexpression
            {

            				newCompositeNode(grammarAccess.getActualParameterAccess().getExpressionExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleexpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getActualParameterRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"compilador.Pascal.expression");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleactualParameter"


    // $ANTLR start "entryRulegotoStatement"
    // InternalPascal.g:4639:1: entryRulegotoStatement returns [EObject current=null] : iv_rulegotoStatement= rulegotoStatement EOF ;
    public final EObject entryRulegotoStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegotoStatement = null;


        try {
            // InternalPascal.g:4639:54: (iv_rulegotoStatement= rulegotoStatement EOF )
            // InternalPascal.g:4640:2: iv_rulegotoStatement= rulegotoStatement EOF
            {
             newCompositeNode(grammarAccess.getGotoStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegotoStatement=rulegotoStatement();

            state._fsp--;

             current =iv_rulegotoStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegotoStatement"


    // $ANTLR start "rulegotoStatement"
    // InternalPascal.g:4646:1: rulegotoStatement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegotoStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4652:2: ( (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) )
            // InternalPascal.g:4653:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            {
            // InternalPascal.g:4653:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            // InternalPascal.g:4654:3: otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGotoStatementAccess().getGotoKeyword_0());
            		
            // InternalPascal.g:4658:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:4659:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:4659:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:4660:5: lv_label_1_0= rulelabel
            {

            					newCompositeNode(grammarAccess.getGotoStatementAccess().getLabelLabelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_1_0=rulelabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGotoStatementRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"compilador.Pascal.label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegotoStatement"


    // $ANTLR start "entryRulestructuredStatement"
    // InternalPascal.g:4681:1: entryRulestructuredStatement returns [EObject current=null] : iv_rulestructuredStatement= rulestructuredStatement EOF ;
    public final EObject entryRulestructuredStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructuredStatement = null;


        try {
            // InternalPascal.g:4681:60: (iv_rulestructuredStatement= rulestructuredStatement EOF )
            // InternalPascal.g:4682:2: iv_rulestructuredStatement= rulestructuredStatement EOF
            {
             newCompositeNode(grammarAccess.getStructuredStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructuredStatement=rulestructuredStatement();

            state._fsp--;

             current =iv_rulestructuredStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructuredStatement"


    // $ANTLR start "rulestructuredStatement"
    // InternalPascal.g:4688:1: rulestructuredStatement returns [EObject current=null] : ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) ) ) ;
    public final EObject rulestructuredStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_compoundStatement_0_0 = null;

        EObject lv_conditionalStatement_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4694:2: ( ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) ) ) )
            // InternalPascal.g:4695:2: ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) ) )
            {
            // InternalPascal.g:4695:2: ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==70) ) {
                alt53=1;
            }
            else if ( (LA53_0==49) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalPascal.g:4696:3: ( (lv_compoundStatement_0_0= rulecompoundStatement ) )
                    {
                    // InternalPascal.g:4696:3: ( (lv_compoundStatement_0_0= rulecompoundStatement ) )
                    // InternalPascal.g:4697:4: (lv_compoundStatement_0_0= rulecompoundStatement )
                    {
                    // InternalPascal.g:4697:4: (lv_compoundStatement_0_0= rulecompoundStatement )
                    // InternalPascal.g:4698:5: lv_compoundStatement_0_0= rulecompoundStatement
                    {

                    					newCompositeNode(grammarAccess.getStructuredStatementAccess().getCompoundStatementCompoundStatementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compoundStatement_0_0=rulecompoundStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructuredStatementRule());
                    					}
                    					set(
                    						current,
                    						"compoundStatement",
                    						lv_compoundStatement_0_0,
                    						"compilador.Pascal.compoundStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4716:3: ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) )
                    {
                    // InternalPascal.g:4716:3: ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) )
                    // InternalPascal.g:4717:4: (lv_conditionalStatement_1_0= ruleconditionalStatement )
                    {
                    // InternalPascal.g:4717:4: (lv_conditionalStatement_1_0= ruleconditionalStatement )
                    // InternalPascal.g:4718:5: lv_conditionalStatement_1_0= ruleconditionalStatement
                    {

                    					newCompositeNode(grammarAccess.getStructuredStatementAccess().getConditionalStatementConditionalStatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditionalStatement_1_0=ruleconditionalStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructuredStatementRule());
                    					}
                    					set(
                    						current,
                    						"conditionalStatement",
                    						lv_conditionalStatement_1_0,
                    						"compilador.Pascal.conditionalStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructuredStatement"


    // $ANTLR start "entryRulecompoundStatement"
    // InternalPascal.g:4739:1: entryRulecompoundStatement returns [EObject current=null] : iv_rulecompoundStatement= rulecompoundStatement EOF ;
    public final EObject entryRulecompoundStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompoundStatement = null;


        try {
            // InternalPascal.g:4739:58: (iv_rulecompoundStatement= rulecompoundStatement EOF )
            // InternalPascal.g:4740:2: iv_rulecompoundStatement= rulecompoundStatement EOF
            {
             newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecompoundStatement=rulecompoundStatement();

            state._fsp--;

             current =iv_rulecompoundStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompoundStatement"


    // $ANTLR start "rulecompoundStatement"
    // InternalPascal.g:4746:1: rulecompoundStatement returns [EObject current=null] : (otherlv_0= 'begin' this_statements_1= rulestatements otherlv_2= 'end' ) ;
    public final EObject rulecompoundStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_statements_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:4752:2: ( (otherlv_0= 'begin' this_statements_1= rulestatements otherlv_2= 'end' ) )
            // InternalPascal.g:4753:2: (otherlv_0= 'begin' this_statements_1= rulestatements otherlv_2= 'end' )
            {
            // InternalPascal.g:4753:2: (otherlv_0= 'begin' this_statements_1= rulestatements otherlv_2= 'end' )
            // InternalPascal.g:4754:3: otherlv_0= 'begin' this_statements_1= rulestatements otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundStatementAccess().getBeginKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCompoundStatementAccess().getStatementsParserRuleCall_1());
            		
            pushFollow(FOLLOW_31);
            this_statements_1=rulestatements();

            state._fsp--;


            			current = this_statements_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompoundStatementAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompoundStatement"


    // $ANTLR start "entryRulestatements"
    // InternalPascal.g:4774:1: entryRulestatements returns [EObject current=null] : iv_rulestatements= rulestatements EOF ;
    public final EObject entryRulestatements() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatements = null;


        try {
            // InternalPascal.g:4774:51: (iv_rulestatements= rulestatements EOF )
            // InternalPascal.g:4775:2: iv_rulestatements= rulestatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatements=rulestatements();

            state._fsp--;

             current =iv_rulestatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatements"


    // $ANTLR start "rulestatements"
    // InternalPascal.g:4781:1: rulestatements returns [EObject current=null] : ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statement_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4787:2: ( ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:4788:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:4788:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            // InternalPascal.g:4789:3: ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:4789:3: ( (lv_statement_0_0= rulestatement ) )
            // InternalPascal.g:4790:4: (lv_statement_0_0= rulestatement )
            {
            // InternalPascal.g:4790:4: (lv_statement_0_0= rulestatement )
            // InternalPascal.g:4791:5: lv_statement_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getStatementStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_statement_0_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementsRule());
            					}
            					add(
            						current,
            						"statement",
            						lv_statement_0_0,
            						"compilador.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4808:3: (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==22) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPascal.g:4809:4: otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_46); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:4813:4: ( (lv_statement_2_0= rulestatement ) )
            	    // InternalPascal.g:4814:5: (lv_statement_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:4814:5: (lv_statement_2_0= rulestatement )
            	    // InternalPascal.g:4815:6: lv_statement_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementsAccess().getStatementStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_statement_2_0=rulestatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatementsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statement",
            	    							lv_statement_2_0,
            	    							"compilador.Pascal.statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatements"


    // $ANTLR start "entryRuleconditionalStatement"
    // InternalPascal.g:4837:1: entryRuleconditionalStatement returns [EObject current=null] : iv_ruleconditionalStatement= ruleconditionalStatement EOF ;
    public final EObject entryRuleconditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditionalStatement = null;


        try {
            // InternalPascal.g:4837:61: (iv_ruleconditionalStatement= ruleconditionalStatement EOF )
            // InternalPascal.g:4838:2: iv_ruleconditionalStatement= ruleconditionalStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconditionalStatement=ruleconditionalStatement();

            state._fsp--;

             current =iv_ruleconditionalStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconditionalStatement"


    // $ANTLR start "ruleconditionalStatement"
    // InternalPascal.g:4844:1: ruleconditionalStatement returns [EObject current=null] : ( (lv_caseStatement_0_0= rulecaseStatement ) ) ;
    public final EObject ruleconditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_caseStatement_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4850:2: ( ( (lv_caseStatement_0_0= rulecaseStatement ) ) )
            // InternalPascal.g:4851:2: ( (lv_caseStatement_0_0= rulecaseStatement ) )
            {
            // InternalPascal.g:4851:2: ( (lv_caseStatement_0_0= rulecaseStatement ) )
            // InternalPascal.g:4852:3: (lv_caseStatement_0_0= rulecaseStatement )
            {
            // InternalPascal.g:4852:3: (lv_caseStatement_0_0= rulecaseStatement )
            // InternalPascal.g:4853:4: lv_caseStatement_0_0= rulecaseStatement
            {

            				newCompositeNode(grammarAccess.getConditionalStatementAccess().getCaseStatementCaseStatementParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_caseStatement_0_0=rulecaseStatement();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            				}
            				set(
            					current,
            					"caseStatement",
            					lv_caseStatement_0_0,
            					"compilador.Pascal.caseStatement");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditionalStatement"


    // $ANTLR start "entryRulecaseStatement"
    // InternalPascal.g:4873:1: entryRulecaseStatement returns [EObject current=null] : iv_rulecaseStatement= rulecaseStatement EOF ;
    public final EObject entryRulecaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecaseStatement = null;


        try {
            // InternalPascal.g:4873:54: (iv_rulecaseStatement= rulecaseStatement EOF )
            // InternalPascal.g:4874:2: iv_rulecaseStatement= rulecaseStatement EOF
            {
             newCompositeNode(grammarAccess.getCaseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecaseStatement=rulecaseStatement();

            state._fsp--;

             current =iv_rulecaseStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecaseStatement"


    // $ANTLR start "rulecaseStatement"
    // InternalPascal.g:4880:1: rulecaseStatement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end' ) ;
    public final EObject rulecaseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_expression_1_0 = null;

        EObject lv_caseListElement_3_0 = null;

        EObject lv_caseListElement1_5_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4886:2: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end' ) )
            // InternalPascal.g:4887:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end' )
            {
            // InternalPascal.g:4887:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end' )
            // InternalPascal.g:4888:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseStatementAccess().getCaseKeyword_0());
            		
            // InternalPascal.g:4892:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:4893:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:4893:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:4894:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getCaseStatementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseStatementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"compilador.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseStatementAccess().getOfKeyword_2());
            		
            // InternalPascal.g:4915:3: ( (lv_caseListElement_3_0= rulecaseListElement ) )
            // InternalPascal.g:4916:4: (lv_caseListElement_3_0= rulecaseListElement )
            {
            // InternalPascal.g:4916:4: (lv_caseListElement_3_0= rulecaseListElement )
            // InternalPascal.g:4917:5: lv_caseListElement_3_0= rulecaseListElement
            {

            					newCompositeNode(grammarAccess.getCaseStatementAccess().getCaseListElementCaseListElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
            lv_caseListElement_3_0=rulecaseListElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseStatementRule());
            					}
            					set(
            						current,
            						"caseListElement",
            						lv_caseListElement_3_0,
            						"compilador.Pascal.caseListElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4934:3: (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==22) ) {
                    int LA55_1 = input.LA(2);

                    if ( ((LA55_1>=RULE_IDENT && LA55_1<=RULE_NUM_REAL)||(LA55_1>=28 && LA55_1<=30)) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // InternalPascal.g:4935:4: otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCaseStatementAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalPascal.g:4939:4: ( (lv_caseListElement1_5_0= rulecaseListElement ) )
            	    // InternalPascal.g:4940:5: (lv_caseListElement1_5_0= rulecaseListElement )
            	    {
            	    // InternalPascal.g:4940:5: (lv_caseListElement1_5_0= rulecaseListElement )
            	    // InternalPascal.g:4941:6: lv_caseListElement1_5_0= rulecaseListElement
            	    {

            	    						newCompositeNode(grammarAccess.getCaseStatementAccess().getCaseListElement1CaseListElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_caseListElement1_5_0=rulecaseListElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCaseStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"caseListElement1",
            	    							lv_caseListElement1_5_0,
            	    							"compilador.Pascal.caseListElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalPascal.g:4959:3: (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==22) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPascal.g:4960:4: otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_48); 

                    				newLeafNode(otherlv_6, grammarAccess.getCaseStatementAccess().getSemicolonKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,71,FOLLOW_46); 

                    				newLeafNode(otherlv_7, grammarAccess.getCaseStatementAccess().getElseKeyword_5_1());
                    			
                    // InternalPascal.g:4968:4: ( (lv_statements_8_0= rulestatements ) )
                    // InternalPascal.g:4969:5: (lv_statements_8_0= rulestatements )
                    {
                    // InternalPascal.g:4969:5: (lv_statements_8_0= rulestatements )
                    // InternalPascal.g:4970:6: lv_statements_8_0= rulestatements
                    {

                    						newCompositeNode(grammarAccess.getCaseStatementAccess().getStatementsStatementsParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_statements_8_0=rulestatements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCaseStatementRule());
                    						}
                    						set(
                    							current,
                    							"statements",
                    							lv_statements_8_0,
                    							"compilador.Pascal.statements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCaseStatementAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecaseStatement"


    // $ANTLR start "entryRulecaseListElement"
    // InternalPascal.g:4996:1: entryRulecaseListElement returns [EObject current=null] : iv_rulecaseListElement= rulecaseListElement EOF ;
    public final EObject entryRulecaseListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecaseListElement = null;


        try {
            // InternalPascal.g:4996:56: (iv_rulecaseListElement= rulecaseListElement EOF )
            // InternalPascal.g:4997:2: iv_rulecaseListElement= rulecaseListElement EOF
            {
             newCompositeNode(grammarAccess.getCaseListElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecaseListElement=rulecaseListElement();

            state._fsp--;

             current =iv_rulecaseListElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecaseListElement"


    // $ANTLR start "rulecaseListElement"
    // InternalPascal.g:5003:1: rulecaseListElement returns [EObject current=null] : ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecaseListElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constList_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5009:2: ( ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) )
            // InternalPascal.g:5010:2: ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            {
            // InternalPascal.g:5010:2: ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            // InternalPascal.g:5011:3: ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) )
            {
            // InternalPascal.g:5011:3: ( (lv_constList_0_0= ruleconstList ) )
            // InternalPascal.g:5012:4: (lv_constList_0_0= ruleconstList )
            {
            // InternalPascal.g:5012:4: (lv_constList_0_0= ruleconstList )
            // InternalPascal.g:5013:5: lv_constList_0_0= ruleconstList
            {

            					newCompositeNode(grammarAccess.getCaseListElementAccess().getConstListConstListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_constList_0_0=ruleconstList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseListElementRule());
            					}
            					set(
            						current,
            						"constList",
            						lv_constList_0_0,
            						"compilador.Pascal.constList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseListElementAccess().getColonKeyword_1());
            		
            // InternalPascal.g:5034:3: ( (lv_statement_2_0= rulestatement ) )
            // InternalPascal.g:5035:4: (lv_statement_2_0= rulestatement )
            {
            // InternalPascal.g:5035:4: (lv_statement_2_0= rulestatement )
            // InternalPascal.g:5036:5: lv_statement_2_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getCaseListElementAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_2_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseListElementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_2_0,
            						"compilador.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecaseListElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001B87020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000700000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000097F2701000F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000003E000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001A00000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000097E0701000F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0012001B87020010L,0x0000000000000060L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00100000701001F0L,0x0000000000000018L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020240000040002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000800000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1F80000008000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000060000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0012001B87020030L,0x0000000000000060L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});

}