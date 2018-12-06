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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_NUM", "RULE_STRING_LITERAL", "RULE_BOOL", "RULE_NUM_REAL", "RULE_EXPONENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'.'", "'program'", "'('", "')'", "';'", "','", "'implemetation'", "'label'", "'const'", "'='", "'chr'", "'+'", "'-'", "'uses'", "'type'", "'function'", "':'", "'var'", "'procedure'", "'char'", "'boolean'", "'integer'", "'real'", "'string'", "'^'", "'..'", "'packed'", "'['", "']'", "'record'", "'end'", "'case'", "'of'", "':='", "'@'", "'<>'", "'<'", "'<='", "'>='", "'>'", "'in'", "'or'", "'*'", "'/'", "'div'", "'mod'", "'and'", "'not'", "'nil'", "'goto'", "'begin'", "'else'"
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
    public static final int RULE_NUM_REAL=8;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=7;
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
        EObject lv_identifer_1_0 = null;

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
    // InternalPascal.g:249:1: ruleidentifierList returns [EObject current=null] : ( () ( (lv_identifier_1_0= ruleidentifier ) ) (otherlv_2= ',' ( (lv_identifierList1_3_0= ruleidentifier ) ) )* ) ;
    public final EObject ruleidentifierList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_identifierList1_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:255:2: ( ( () ( (lv_identifier_1_0= ruleidentifier ) ) (otherlv_2= ',' ( (lv_identifierList1_3_0= ruleidentifier ) ) )* ) )
            // InternalPascal.g:256:2: ( () ( (lv_identifier_1_0= ruleidentifier ) ) (otherlv_2= ',' ( (lv_identifierList1_3_0= ruleidentifier ) ) )* )
            {
            // InternalPascal.g:256:2: ( () ( (lv_identifier_1_0= ruleidentifier ) ) (otherlv_2= ',' ( (lv_identifierList1_3_0= ruleidentifier ) ) )* )
            // InternalPascal.g:257:3: () ( (lv_identifier_1_0= ruleidentifier ) ) (otherlv_2= ',' ( (lv_identifierList1_3_0= ruleidentifier ) ) )*
            {
            // InternalPascal.g:257:3: ()
            // InternalPascal.g:258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdentifierListAccess().getIdentifierListAction_0(),
            					current);
            			

            }

            // InternalPascal.g:264:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:265:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:265:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:266:5: lv_identifier_1_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getIdentifierListAccess().getIdentifierIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_identifier_1_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentifierListRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_1_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:283:3: (otherlv_2= ',' ( (lv_identifierList1_3_0= ruleidentifier ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:284:4: otherlv_2= ',' ( (lv_identifierList1_3_0= ruleidentifier ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIdentifierListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPascal.g:288:4: ( (lv_identifierList1_3_0= ruleidentifier ) )
            	    // InternalPascal.g:289:5: (lv_identifierList1_3_0= ruleidentifier )
            	    {
            	    // InternalPascal.g:289:5: (lv_identifierList1_3_0= ruleidentifier )
            	    // InternalPascal.g:290:6: lv_identifierList1_3_0= ruleidentifier
            	    {

            	    						newCompositeNode(grammarAccess.getIdentifierListAccess().getIdentifierList1IdentifierParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_identifierList1_3_0=ruleidentifier();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIdentifierListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"identifierList1",
            	    							lv_identifierList1_3_0,
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
    // InternalPascal.g:312:1: entryRuleidentifier returns [EObject current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final EObject entryRuleidentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier = null;


        try {
            // InternalPascal.g:312:51: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalPascal.g:313:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier; 
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
    // InternalPascal.g:319:1: ruleidentifier returns [EObject current=null] : ( (lv_identifier_0_0= RULE_IDENT ) ) ;
    public final EObject ruleidentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:325:2: ( ( (lv_identifier_0_0= RULE_IDENT ) ) )
            // InternalPascal.g:326:2: ( (lv_identifier_0_0= RULE_IDENT ) )
            {
            // InternalPascal.g:326:2: ( (lv_identifier_0_0= RULE_IDENT ) )
            // InternalPascal.g:327:3: (lv_identifier_0_0= RULE_IDENT )
            {
            // InternalPascal.g:327:3: (lv_identifier_0_0= RULE_IDENT )
            // InternalPascal.g:328:4: lv_identifier_0_0= RULE_IDENT
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            				newLeafNode(lv_identifier_0_0, grammarAccess.getIdentifierAccess().getIdentifierIDENTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIdentifierRule());
            				}
            				setWithLastConsumed(
            					current,
            					"identifier",
            					lv_identifier_0_0,
            					"compilador.Pascal.IDENT");
            			

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
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:347:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:347:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:348:2: iv_ruleblock= ruleblock EOF
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
    // InternalPascal.g:354:1: ruleblock returns [EObject current=null] : ( () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsParts_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        EObject lv_label_1_0 = null;

        EObject lv_constantDefinitionParts_2_0 = null;

        EObject lv_typeDefinitionParts_3_0 = null;

        EObject lv_variableDeclarationParts_4_0 = null;

        EObject lv_procedureAndFunctionDeclarationParts_5_0 = null;

        EObject lv_usesUnitsParts_6_0 = null;

        EObject lv_compoundStatement_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:360:2: ( ( () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsParts_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) ) ) )
            // InternalPascal.g:361:2: ( () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsParts_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) ) )
            {
            // InternalPascal.g:361:2: ( () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsParts_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) ) )
            // InternalPascal.g:362:3: () ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsParts_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )* ( (lv_compoundStatement_8_0= rulecompoundStatement ) )
            {
            // InternalPascal.g:362:3: ()
            // InternalPascal.g:363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            // InternalPascal.g:369:3: ( ( (lv_label_1_0= rulelabel_declaration_part ) ) | ( (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsParts_6_0= ruleusesUnitsPart ) ) | otherlv_7= 'implemetation' )*
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
            	    // InternalPascal.g:370:4: ( (lv_label_1_0= rulelabel_declaration_part ) )
            	    {
            	    // InternalPascal.g:370:4: ( (lv_label_1_0= rulelabel_declaration_part ) )
            	    // InternalPascal.g:371:5: (lv_label_1_0= rulelabel_declaration_part )
            	    {
            	    // InternalPascal.g:371:5: (lv_label_1_0= rulelabel_declaration_part )
            	    // InternalPascal.g:372:6: lv_label_1_0= rulelabel_declaration_part
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
            	    // InternalPascal.g:390:4: ( (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart ) )
            	    {
            	    // InternalPascal.g:390:4: ( (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart ) )
            	    // InternalPascal.g:391:5: (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart )
            	    {
            	    // InternalPascal.g:391:5: (lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart )
            	    // InternalPascal.g:392:6: lv_constantDefinitionParts_2_0= ruleconstantDefinitionPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getConstantDefinitionPartsConstantDefinitionPartParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_constantDefinitionParts_2_0=ruleconstantDefinitionPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constantDefinitionParts",
            	    							lv_constantDefinitionParts_2_0,
            	    							"compilador.Pascal.constantDefinitionPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:410:4: ( (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart ) )
            	    {
            	    // InternalPascal.g:410:4: ( (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart ) )
            	    // InternalPascal.g:411:5: (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart )
            	    {
            	    // InternalPascal.g:411:5: (lv_typeDefinitionParts_3_0= ruletypeDefinitionPart )
            	    // InternalPascal.g:412:6: lv_typeDefinitionParts_3_0= ruletypeDefinitionPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getTypeDefinitionPartsTypeDefinitionPartParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_typeDefinitionParts_3_0=ruletypeDefinitionPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeDefinitionParts",
            	    							lv_typeDefinitionParts_3_0,
            	    							"compilador.Pascal.typeDefinitionPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPascal.g:430:4: ( (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart ) )
            	    {
            	    // InternalPascal.g:430:4: ( (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart ) )
            	    // InternalPascal.g:431:5: (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart )
            	    {
            	    // InternalPascal.g:431:5: (lv_variableDeclarationParts_4_0= rulevariableDeclarationPart )
            	    // InternalPascal.g:432:6: lv_variableDeclarationParts_4_0= rulevariableDeclarationPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getVariableDeclarationPartsVariableDeclarationPartParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_variableDeclarationParts_4_0=rulevariableDeclarationPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variableDeclarationParts",
            	    							lv_variableDeclarationParts_4_0,
            	    							"compilador.Pascal.variableDeclarationPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPascal.g:450:4: ( (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart ) )
            	    {
            	    // InternalPascal.g:450:4: ( (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart ) )
            	    // InternalPascal.g:451:5: (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart )
            	    {
            	    // InternalPascal.g:451:5: (lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart )
            	    // InternalPascal.g:452:6: lv_procedureAndFunctionDeclarationParts_5_0= ruleprocedureAndFunctionDeclarationPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getProcedureAndFunctionDeclarationPartsProcedureAndFunctionDeclarationPartParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_procedureAndFunctionDeclarationParts_5_0=ruleprocedureAndFunctionDeclarationPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"procedureAndFunctionDeclarationParts",
            	    							lv_procedureAndFunctionDeclarationParts_5_0,
            	    							"compilador.Pascal.procedureAndFunctionDeclarationPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalPascal.g:470:4: ( (lv_usesUnitsParts_6_0= ruleusesUnitsPart ) )
            	    {
            	    // InternalPascal.g:470:4: ( (lv_usesUnitsParts_6_0= ruleusesUnitsPart ) )
            	    // InternalPascal.g:471:5: (lv_usesUnitsParts_6_0= ruleusesUnitsPart )
            	    {
            	    // InternalPascal.g:471:5: (lv_usesUnitsParts_6_0= ruleusesUnitsPart )
            	    // InternalPascal.g:472:6: lv_usesUnitsParts_6_0= ruleusesUnitsPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getUsesUnitsPartsUsesUnitsPartParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_usesUnitsParts_6_0=ruleusesUnitsPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"usesUnitsParts",
            	    							lv_usesUnitsParts_6_0,
            	    							"compilador.Pascal.usesUnitsPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalPascal.g:490:4: otherlv_7= 'implemetation'
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBlockAccess().getImplemetationKeyword_1_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalPascal.g:495:3: ( (lv_compoundStatement_8_0= rulecompoundStatement ) )
            // InternalPascal.g:496:4: (lv_compoundStatement_8_0= rulecompoundStatement )
            {
            // InternalPascal.g:496:4: (lv_compoundStatement_8_0= rulecompoundStatement )
            // InternalPascal.g:497:5: lv_compoundStatement_8_0= rulecompoundStatement
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
    // InternalPascal.g:518:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // InternalPascal.g:518:63: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // InternalPascal.g:519:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
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
    // InternalPascal.g:525:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_label_1 = null;

        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:531:2: ( (otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:532:2: (otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:532:2: (otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:533:3: otherlv_0= 'label' this_label_1= rulelabel (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_label_1=rulelabel();

            state._fsp--;


            			current = this_label_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:545:3: (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascal.g:546:4: otherlv_2= ',' ( (lv_label_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPascal.g:550:4: ( (lv_label_3_0= rulelabel ) )
            	    // InternalPascal.g:551:5: (lv_label_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:551:5: (lv_label_3_0= rulelabel )
            	    // InternalPascal.g:552:6: lv_label_3_0= rulelabel
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
    // InternalPascal.g:578:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:578:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:579:2: iv_rulelabel= rulelabel EOF
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
    // InternalPascal.g:585:1: rulelabel returns [EObject current=null] : ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_identifier_1_0= ruleidentifier ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        EObject lv_unsignedInteger_0_0 = null;

        EObject lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:591:2: ( ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_identifier_1_0= ruleidentifier ) ) ) )
            // InternalPascal.g:592:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_identifier_1_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:592:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_identifier_1_0= ruleidentifier ) ) )
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
                    // InternalPascal.g:593:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    {
                    // InternalPascal.g:593:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    // InternalPascal.g:594:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    {
                    // InternalPascal.g:594:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    // InternalPascal.g:595:5: lv_unsignedInteger_0_0= ruleunsignedInteger
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
                    // InternalPascal.g:613:3: ( (lv_identifier_1_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:613:3: ( (lv_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:614:4: (lv_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:614:4: (lv_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:615:5: lv_identifier_1_0= ruleidentifier
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
    // InternalPascal.g:636:1: entryRuleunsignedInteger returns [EObject current=null] : iv_ruleunsignedInteger= ruleunsignedInteger EOF ;
    public final EObject entryRuleunsignedInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedInteger = null;


        try {
            // InternalPascal.g:636:56: (iv_ruleunsignedInteger= ruleunsignedInteger EOF )
            // InternalPascal.g:637:2: iv_ruleunsignedInteger= ruleunsignedInteger EOF
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
    // InternalPascal.g:643:1: ruleunsignedInteger returns [EObject current=null] : ( (lv_number_0_0= RULE_NUM ) ) ;
    public final EObject ruleunsignedInteger() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:649:2: ( ( (lv_number_0_0= RULE_NUM ) ) )
            // InternalPascal.g:650:2: ( (lv_number_0_0= RULE_NUM ) )
            {
            // InternalPascal.g:650:2: ( (lv_number_0_0= RULE_NUM ) )
            // InternalPascal.g:651:3: (lv_number_0_0= RULE_NUM )
            {
            // InternalPascal.g:651:3: (lv_number_0_0= RULE_NUM )
            // InternalPascal.g:652:4: lv_number_0_0= RULE_NUM
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
    // InternalPascal.g:671:1: entryRuleconstantDefinitionPart returns [EObject current=null] : iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF ;
    public final EObject entryRuleconstantDefinitionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefinitionPart = null;


        try {
            // InternalPascal.g:671:63: (iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF )
            // InternalPascal.g:672:2: iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF
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
    // InternalPascal.g:678:1: ruleconstantDefinitionPart returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstantDefinitionPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constantDefinition_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:684:2: ( (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:685:2: (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:685:2: (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:686:3: otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionPartAccess().getConstKeyword_0());
            		
            // InternalPascal.g:690:3: ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';' )+
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
            	    // InternalPascal.g:691:4: ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:691:4: ( (lv_constantDefinition_1_0= ruleconstantDefinition ) )
            	    // InternalPascal.g:692:5: (lv_constantDefinition_1_0= ruleconstantDefinition )
            	    {
            	    // InternalPascal.g:692:5: (lv_constantDefinition_1_0= ruleconstantDefinition )
            	    // InternalPascal.g:693:6: lv_constantDefinition_1_0= ruleconstantDefinition
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
    // InternalPascal.g:719:1: entryRuleconstantDefinition returns [EObject current=null] : iv_ruleconstantDefinition= ruleconstantDefinition EOF ;
    public final EObject entryRuleconstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefinition = null;


        try {
            // InternalPascal.g:719:59: (iv_ruleconstantDefinition= ruleconstantDefinition EOF )
            // InternalPascal.g:720:2: iv_ruleconstantDefinition= ruleconstantDefinition EOF
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
    // InternalPascal.g:726:1: ruleconstantDefinition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:732:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:733:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:733:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            // InternalPascal.g:734:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) )
            {
            // InternalPascal.g:734:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:735:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:735:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:736:5: lv_identifier_0_0= ruleidentifier
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
            		
            // InternalPascal.g:757:3: ( (lv_constant_2_0= ruleconstant ) )
            // InternalPascal.g:758:4: (lv_constant_2_0= ruleconstant )
            {
            // InternalPascal.g:758:4: (lv_constant_2_0= ruleconstant )
            // InternalPascal.g:759:5: lv_constant_2_0= ruleconstant
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
    // InternalPascal.g:780:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:780:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:781:2: iv_ruleconstant= ruleconstant EOF
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
    // InternalPascal.g:787:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_sign_0_0= rulesign ) ) ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) ) ) | ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_string_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign_5_0= rulesign ) ) ( (lv_identifier_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | ( (lv_bool_8_0= RULE_BOOL ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_string_4_0=null;
        Token lv_bool_8_0=null;
        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        EObject lv_unsignedNumber_1_0 = null;

        EObject lv_unsignedNumber_2_0 = null;

        EObject lv_identifier_3_0 = null;

        AntlrDatatypeRuleToken lv_sign_5_0 = null;

        EObject lv_identifier_6_0 = null;

        EObject lv_constantChr_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:793:2: ( ( ( ( (lv_sign_0_0= rulesign ) ) ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) ) ) | ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_string_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign_5_0= rulesign ) ) ( (lv_identifier_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | ( (lv_bool_8_0= RULE_BOOL ) ) ) )
            // InternalPascal.g:794:2: ( ( ( (lv_sign_0_0= rulesign ) ) ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) ) ) | ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_string_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign_5_0= rulesign ) ) ( (lv_identifier_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | ( (lv_bool_8_0= RULE_BOOL ) ) )
            {
            // InternalPascal.g:794:2: ( ( ( (lv_sign_0_0= rulesign ) ) ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) ) ) | ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_string_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign_5_0= rulesign ) ) ( (lv_identifier_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | ( (lv_bool_8_0= RULE_BOOL ) ) )
            int alt8=7;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:795:3: ( ( (lv_sign_0_0= rulesign ) ) ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) ) )
                    {
                    // InternalPascal.g:795:3: ( ( (lv_sign_0_0= rulesign ) ) ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) ) )
                    // InternalPascal.g:796:4: ( (lv_sign_0_0= rulesign ) ) ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:796:4: ( (lv_sign_0_0= rulesign ) )
                    // InternalPascal.g:797:5: (lv_sign_0_0= rulesign )
                    {
                    // InternalPascal.g:797:5: (lv_sign_0_0= rulesign )
                    // InternalPascal.g:798:6: lv_sign_0_0= rulesign
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getSignSignParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_sign_0_0=rulesign();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"sign",
                    							lv_sign_0_0,
                    							"compilador.Pascal.sign");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:815:4: ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) )
                    // InternalPascal.g:816:5: (lv_unsignedNumber_1_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:816:5: (lv_unsignedNumber_1_0= ruleunsignedNumber )
                    // InternalPascal.g:817:6: lv_unsignedNumber_1_0= ruleunsignedNumber
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getUnsignedNumberUnsignedNumberParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unsignedNumber_1_0=ruleunsignedNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"unsignedNumber",
                    							lv_unsignedNumber_1_0,
                    							"compilador.Pascal.unsignedNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:836:3: ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:836:3: ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) )
                    // InternalPascal.g:837:4: (lv_unsignedNumber_2_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:837:4: (lv_unsignedNumber_2_0= ruleunsignedNumber )
                    // InternalPascal.g:838:5: lv_unsignedNumber_2_0= ruleunsignedNumber
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getUnsignedNumberUnsignedNumberParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedNumber_2_0=ruleunsignedNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"unsignedNumber",
                    						lv_unsignedNumber_2_0,
                    						"compilador.Pascal.unsignedNumber");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:856:3: ( (lv_identifier_3_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:856:3: ( (lv_identifier_3_0= ruleidentifier ) )
                    // InternalPascal.g:857:4: (lv_identifier_3_0= ruleidentifier )
                    {
                    // InternalPascal.g:857:4: (lv_identifier_3_0= ruleidentifier )
                    // InternalPascal.g:858:5: lv_identifier_3_0= ruleidentifier
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
                    // InternalPascal.g:876:3: ( (lv_string_4_0= RULE_STRING_LITERAL ) )
                    {
                    // InternalPascal.g:876:3: ( (lv_string_4_0= RULE_STRING_LITERAL ) )
                    // InternalPascal.g:877:4: (lv_string_4_0= RULE_STRING_LITERAL )
                    {
                    // InternalPascal.g:877:4: (lv_string_4_0= RULE_STRING_LITERAL )
                    // InternalPascal.g:878:5: lv_string_4_0= RULE_STRING_LITERAL
                    {
                    lv_string_4_0=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_string_4_0, grammarAccess.getConstantAccess().getStringSTRING_LITERALTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_4_0,
                    						"compilador.Pascal.STRING_LITERAL");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:895:3: ( ( (lv_sign_5_0= rulesign ) ) ( (lv_identifier_6_0= ruleidentifier ) ) )
                    {
                    // InternalPascal.g:895:3: ( ( (lv_sign_5_0= rulesign ) ) ( (lv_identifier_6_0= ruleidentifier ) ) )
                    // InternalPascal.g:896:4: ( (lv_sign_5_0= rulesign ) ) ( (lv_identifier_6_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:896:4: ( (lv_sign_5_0= rulesign ) )
                    // InternalPascal.g:897:5: (lv_sign_5_0= rulesign )
                    {
                    // InternalPascal.g:897:5: (lv_sign_5_0= rulesign )
                    // InternalPascal.g:898:6: lv_sign_5_0= rulesign
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getSignSignParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_sign_5_0=rulesign();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"sign",
                    							lv_sign_5_0,
                    							"compilador.Pascal.sign");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:915:4: ( (lv_identifier_6_0= ruleidentifier ) )
                    // InternalPascal.g:916:5: (lv_identifier_6_0= ruleidentifier )
                    {
                    // InternalPascal.g:916:5: (lv_identifier_6_0= ruleidentifier )
                    // InternalPascal.g:917:6: lv_identifier_6_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getIdentifierIdentifierParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_identifier_6_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"identifier",
                    							lv_identifier_6_0,
                    							"compilador.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:936:3: ( (lv_constantChr_7_0= ruleconstantChr ) )
                    {
                    // InternalPascal.g:936:3: ( (lv_constantChr_7_0= ruleconstantChr ) )
                    // InternalPascal.g:937:4: (lv_constantChr_7_0= ruleconstantChr )
                    {
                    // InternalPascal.g:937:4: (lv_constantChr_7_0= ruleconstantChr )
                    // InternalPascal.g:938:5: lv_constantChr_7_0= ruleconstantChr
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
                case 7 :
                    // InternalPascal.g:956:3: ( (lv_bool_8_0= RULE_BOOL ) )
                    {
                    // InternalPascal.g:956:3: ( (lv_bool_8_0= RULE_BOOL ) )
                    // InternalPascal.g:957:4: (lv_bool_8_0= RULE_BOOL )
                    {
                    // InternalPascal.g:957:4: (lv_bool_8_0= RULE_BOOL )
                    // InternalPascal.g:958:5: lv_bool_8_0= RULE_BOOL
                    {
                    lv_bool_8_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    					newLeafNode(lv_bool_8_0, grammarAccess.getConstantAccess().getBoolBOOLTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"bool",
                    						lv_bool_8_0,
                    						"compilador.Pascal.BOOL");
                    				

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
    // InternalPascal.g:978:1: entryRuleconstantChr returns [EObject current=null] : iv_ruleconstantChr= ruleconstantChr EOF ;
    public final EObject entryRuleconstantChr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantChr = null;


        try {
            // InternalPascal.g:978:52: (iv_ruleconstantChr= ruleconstantChr EOF )
            // InternalPascal.g:979:2: iv_ruleconstantChr= ruleconstantChr EOF
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
    // InternalPascal.g:985:1: ruleconstantChr returns [EObject current=null] : (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' ) ;
    public final EObject ruleconstantChr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_unsignedInteger_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:991:2: ( (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' ) )
            // InternalPascal.g:992:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:992:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' )
            // InternalPascal.g:993:3: otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantChrAccess().getChrKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantChrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:1001:3: ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) )
            // InternalPascal.g:1002:4: (lv_unsignedInteger_2_0= ruleunsignedInteger )
            {
            // InternalPascal.g:1002:4: (lv_unsignedInteger_2_0= ruleunsignedInteger )
            // InternalPascal.g:1003:5: lv_unsignedInteger_2_0= ruleunsignedInteger
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
    // InternalPascal.g:1028:1: entryRuleunsignedNumber returns [EObject current=null] : iv_ruleunsignedNumber= ruleunsignedNumber EOF ;
    public final EObject entryRuleunsignedNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedNumber = null;


        try {
            // InternalPascal.g:1028:55: (iv_ruleunsignedNumber= ruleunsignedNumber EOF )
            // InternalPascal.g:1029:2: iv_ruleunsignedNumber= ruleunsignedNumber EOF
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
    // InternalPascal.g:1035:1: ruleunsignedNumber returns [EObject current=null] : ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) ) ;
    public final EObject ruleunsignedNumber() throws RecognitionException {
        EObject current = null;

        EObject lv_unsignedInteger_0_0 = null;

        AntlrDatatypeRuleToken lv_unsignedReal_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1041:2: ( ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) ) )
            // InternalPascal.g:1042:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) )
            {
            // InternalPascal.g:1042:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) )
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
                    // InternalPascal.g:1043:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    {
                    // InternalPascal.g:1043:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    // InternalPascal.g:1044:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    {
                    // InternalPascal.g:1044:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    // InternalPascal.g:1045:5: lv_unsignedInteger_0_0= ruleunsignedInteger
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
                    // InternalPascal.g:1063:3: ( (lv_unsignedReal_1_0= ruleunsignedReal ) )
                    {
                    // InternalPascal.g:1063:3: ( (lv_unsignedReal_1_0= ruleunsignedReal ) )
                    // InternalPascal.g:1064:4: (lv_unsignedReal_1_0= ruleunsignedReal )
                    {
                    // InternalPascal.g:1064:4: (lv_unsignedReal_1_0= ruleunsignedReal )
                    // InternalPascal.g:1065:5: lv_unsignedReal_1_0= ruleunsignedReal
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
    // InternalPascal.g:1086:1: entryRuleunsignedReal returns [String current=null] : iv_ruleunsignedReal= ruleunsignedReal EOF ;
    public final String entryRuleunsignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsignedReal = null;


        try {
            // InternalPascal.g:1086:52: (iv_ruleunsignedReal= ruleunsignedReal EOF )
            // InternalPascal.g:1087:2: iv_ruleunsignedReal= ruleunsignedReal EOF
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
    // InternalPascal.g:1093:1: ruleunsignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_REAL_0= RULE_NUM_REAL ;
    public final AntlrDatatypeRuleToken ruleunsignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_REAL_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1099:2: (this_NUM_REAL_0= RULE_NUM_REAL )
            // InternalPascal.g:1100:2: this_NUM_REAL_0= RULE_NUM_REAL
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
    // InternalPascal.g:1110:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // InternalPascal.g:1110:44: (iv_rulesign= rulesign EOF )
            // InternalPascal.g:1111:2: iv_rulesign= rulesign EOF
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
    // InternalPascal.g:1117:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1123:2: ( (kw= '+' | kw= '-' ) )
            // InternalPascal.g:1124:2: (kw= '+' | kw= '-' )
            {
            // InternalPascal.g:1124:2: (kw= '+' | kw= '-' )
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
                    // InternalPascal.g:1125:3: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1131:3: kw= '-'
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
    // InternalPascal.g:1140:1: entryRuleusesUnitsPart returns [EObject current=null] : iv_ruleusesUnitsPart= ruleusesUnitsPart EOF ;
    public final EObject entryRuleusesUnitsPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleusesUnitsPart = null;


        try {
            // InternalPascal.g:1140:54: (iv_ruleusesUnitsPart= ruleusesUnitsPart EOF )
            // InternalPascal.g:1141:2: iv_ruleusesUnitsPart= ruleusesUnitsPart EOF
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
    // InternalPascal.g:1147:1: ruleusesUnitsPart returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' ) ;
    public final EObject ruleusesUnitsPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifierList_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1153:2: ( (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' ) )
            // InternalPascal.g:1154:2: (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' )
            {
            // InternalPascal.g:1154:2: (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' )
            // InternalPascal.g:1155:3: otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUsesUnitsPartAccess().getUsesKeyword_0());
            		
            // InternalPascal.g:1159:3: ( (lv_identifierList_1_0= ruleidentifierList ) )
            // InternalPascal.g:1160:4: (lv_identifierList_1_0= ruleidentifierList )
            {
            // InternalPascal.g:1160:4: (lv_identifierList_1_0= ruleidentifierList )
            // InternalPascal.g:1161:5: lv_identifierList_1_0= ruleidentifierList
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
    // InternalPascal.g:1186:1: entryRuletypeDefinitionPart returns [EObject current=null] : iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF ;
    public final EObject entryRuletypeDefinitionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeDefinitionPart = null;


        try {
            // InternalPascal.g:1186:59: (iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF )
            // InternalPascal.g:1187:2: iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF
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
    // InternalPascal.g:1193:1: ruletypeDefinitionPart returns [EObject current=null] : (otherlv_0= 'type' ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_typeDefinition1_2_0= ruletypeDefinition ) )* otherlv_3= ';' ) ;
    public final EObject ruletypeDefinitionPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_typeDefinition_1_0 = null;

        EObject lv_typeDefinition1_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1199:2: ( (otherlv_0= 'type' ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_typeDefinition1_2_0= ruletypeDefinition ) )* otherlv_3= ';' ) )
            // InternalPascal.g:1200:2: (otherlv_0= 'type' ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_typeDefinition1_2_0= ruletypeDefinition ) )* otherlv_3= ';' )
            {
            // InternalPascal.g:1200:2: (otherlv_0= 'type' ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_typeDefinition1_2_0= ruletypeDefinition ) )* otherlv_3= ';' )
            // InternalPascal.g:1201:3: otherlv_0= 'type' ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_typeDefinition1_2_0= ruletypeDefinition ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionPartAccess().getTypeKeyword_0());
            		
            // InternalPascal.g:1205:3: ( (lv_typeDefinition_1_0= ruletypeDefinition ) )
            // InternalPascal.g:1206:4: (lv_typeDefinition_1_0= ruletypeDefinition )
            {
            // InternalPascal.g:1206:4: (lv_typeDefinition_1_0= ruletypeDefinition )
            // InternalPascal.g:1207:5: lv_typeDefinition_1_0= ruletypeDefinition
            {

            					newCompositeNode(grammarAccess.getTypeDefinitionPartAccess().getTypeDefinitionTypeDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_typeDefinition_1_0=ruletypeDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefinitionPartRule());
            					}
            					set(
            						current,
            						"typeDefinition",
            						lv_typeDefinition_1_0,
            						"compilador.Pascal.typeDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1224:3: ( (lv_typeDefinition1_2_0= ruletypeDefinition ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_IDENT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:1225:4: (lv_typeDefinition1_2_0= ruletypeDefinition )
            	    {
            	    // InternalPascal.g:1225:4: (lv_typeDefinition1_2_0= ruletypeDefinition )
            	    // InternalPascal.g:1226:5: lv_typeDefinition1_2_0= ruletypeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTypeDefinitionPartAccess().getTypeDefinition1TypeDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_typeDefinition1_2_0=ruletypeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeDefinitionPartRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeDefinition1",
            	    						lv_typeDefinition1_2_0,
            	    						"compilador.Pascal.typeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeDefinitionPartAccess().getSemicolonKeyword_3());
            		

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
    // InternalPascal.g:1251:1: entryRuletypeDefinition returns [EObject current=null] : iv_ruletypeDefinition= ruletypeDefinition EOF ;
    public final EObject entryRuletypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeDefinition = null;


        try {
            // InternalPascal.g:1251:55: (iv_ruletypeDefinition= ruletypeDefinition EOF )
            // InternalPascal.g:1252:2: iv_ruletypeDefinition= ruletypeDefinition EOF
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
    // InternalPascal.g:1258:1: ruletypeDefinition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) ) ) ;
    public final EObject ruletypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_functionType_3_0 = null;

        EObject lv_procedureType_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1264:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) ) ) )
            // InternalPascal.g:1265:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) ) )
            {
            // InternalPascal.g:1265:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) ) )
            // InternalPascal.g:1266:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) )
            {
            // InternalPascal.g:1266:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:1267:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:1267:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:1268:5: lv_identifier_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getTypeDefinitionAccess().getIdentifierIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_0_0,
            						"compilador.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeDefinitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:1289:3: ( ( (lv_type_2_0= ruletype ) ) | ( (lv_functionType_3_0= rulefunctionType ) ) | ( (lv_procedureType_4_0= ruleprocedureType ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_NUM:
            case RULE_STRING_LITERAL:
            case RULE_BOOL:
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
                    // InternalPascal.g:1290:4: ( (lv_type_2_0= ruletype ) )
                    {
                    // InternalPascal.g:1290:4: ( (lv_type_2_0= ruletype ) )
                    // InternalPascal.g:1291:5: (lv_type_2_0= ruletype )
                    {
                    // InternalPascal.g:1291:5: (lv_type_2_0= ruletype )
                    // InternalPascal.g:1292:6: lv_type_2_0= ruletype
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
                    // InternalPascal.g:1310:4: ( (lv_functionType_3_0= rulefunctionType ) )
                    {
                    // InternalPascal.g:1310:4: ( (lv_functionType_3_0= rulefunctionType ) )
                    // InternalPascal.g:1311:5: (lv_functionType_3_0= rulefunctionType )
                    {
                    // InternalPascal.g:1311:5: (lv_functionType_3_0= rulefunctionType )
                    // InternalPascal.g:1312:6: lv_functionType_3_0= rulefunctionType
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
                    // InternalPascal.g:1330:4: ( (lv_procedureType_4_0= ruleprocedureType ) )
                    {
                    // InternalPascal.g:1330:4: ( (lv_procedureType_4_0= ruleprocedureType ) )
                    // InternalPascal.g:1331:5: (lv_procedureType_4_0= ruleprocedureType )
                    {
                    // InternalPascal.g:1331:5: (lv_procedureType_4_0= ruleprocedureType )
                    // InternalPascal.g:1332:6: lv_procedureType_4_0= ruleprocedureType
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
    // InternalPascal.g:1354:1: entryRulefunctionType returns [EObject current=null] : iv_rulefunctionType= rulefunctionType EOF ;
    public final EObject entryRulefunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionType = null;


        try {
            // InternalPascal.g:1354:53: (iv_rulefunctionType= rulefunctionType EOF )
            // InternalPascal.g:1355:2: iv_rulefunctionType= rulefunctionType EOF
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
    // InternalPascal.g:1361:1: rulefunctionType returns [EObject current=null] : (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_typeIdentifier_3_0= ruletypeIdentifier ) ) ) ;
    public final EObject rulefunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_formalParameterList_1_0 = null;

        EObject lv_typeIdentifier_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1367:2: ( (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_typeIdentifier_3_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:1368:2: (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_typeIdentifier_3_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:1368:2: (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_typeIdentifier_3_0= ruletypeIdentifier ) ) )
            // InternalPascal.g:1369:3: otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_typeIdentifier_3_0= ruletypeIdentifier ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionTypeAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:1373:3: ( (lv_formalParameterList_1_0= ruleformalParameterList ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1374:4: (lv_formalParameterList_1_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:1374:4: (lv_formalParameterList_1_0= ruleformalParameterList )
                    // InternalPascal.g:1375:5: lv_formalParameterList_1_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getFunctionTypeAccess().getFormalParameterListFormalParameterListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionTypeAccess().getColonKeyword_2());
            		
            // InternalPascal.g:1396:3: ( (lv_typeIdentifier_3_0= ruletypeIdentifier ) )
            // InternalPascal.g:1397:4: (lv_typeIdentifier_3_0= ruletypeIdentifier )
            {
            // InternalPascal.g:1397:4: (lv_typeIdentifier_3_0= ruletypeIdentifier )
            // InternalPascal.g:1398:5: lv_typeIdentifier_3_0= ruletypeIdentifier
            {

            					newCompositeNode(grammarAccess.getFunctionTypeAccess().getTypeIdentifierTypeIdentifierParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeIdentifier_3_0=ruletypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
            					}
            					set(
            						current,
            						"typeIdentifier",
            						lv_typeIdentifier_3_0,
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
    // $ANTLR end "rulefunctionType"


    // $ANTLR start "entryRuleformalParameterList"
    // InternalPascal.g:1419:1: entryRuleformalParameterList returns [EObject current=null] : iv_ruleformalParameterList= ruleformalParameterList EOF ;
    public final EObject entryRuleformalParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameterList = null;


        try {
            // InternalPascal.g:1419:60: (iv_ruleformalParameterList= ruleformalParameterList EOF )
            // InternalPascal.g:1420:2: iv_ruleformalParameterList= ruleformalParameterList EOF
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
    // InternalPascal.g:1426:1: ruleformalParameterList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformalParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameterSection_1_0 = null;

        EObject lv_formalParameterSection2_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1432:2: ( (otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:1433:2: (otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:1433:2: (otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' )
            // InternalPascal.g:1434:3: otherlv_0= '(' ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) ) (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getFormalParameterListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:1438:3: ( (lv_formalParameterSection_1_0= ruleformalParameterSection ) )
            // InternalPascal.g:1439:4: (lv_formalParameterSection_1_0= ruleformalParameterSection )
            {
            // InternalPascal.g:1439:4: (lv_formalParameterSection_1_0= ruleformalParameterSection )
            // InternalPascal.g:1440:5: lv_formalParameterSection_1_0= ruleformalParameterSection
            {

            					newCompositeNode(grammarAccess.getFormalParameterListAccess().getFormalParameterSectionFormalParameterSectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalPascal.g:1457:3: (otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:1458:4: otherlv_2= ';' ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormalParameterListAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:1462:4: ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) )
            	    // InternalPascal.g:1463:5: (lv_formalParameterSection2_3_0= ruleformalParameterSection )
            	    {
            	    // InternalPascal.g:1463:5: (lv_formalParameterSection2_3_0= ruleformalParameterSection )
            	    // InternalPascal.g:1464:6: lv_formalParameterSection2_3_0= ruleformalParameterSection
            	    {

            	    						newCompositeNode(grammarAccess.getFormalParameterListAccess().getFormalParameterSection2FormalParameterSectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // InternalPascal.g:1490:1: entryRuleformalParameterSection returns [EObject current=null] : iv_ruleformalParameterSection= ruleformalParameterSection EOF ;
    public final EObject entryRuleformalParameterSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameterSection = null;


        try {
            // InternalPascal.g:1490:63: (iv_ruleformalParameterSection= ruleformalParameterSection EOF )
            // InternalPascal.g:1491:2: iv_ruleformalParameterSection= ruleformalParameterSection EOF
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
    // InternalPascal.g:1497:1: ruleformalParameterSection returns [EObject current=null] : ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) ) ) ;
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
            // InternalPascal.g:1503:2: ( ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) ) ) )
            // InternalPascal.g:1504:2: ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) ) )
            {
            // InternalPascal.g:1504:2: ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) ) )
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
                    // InternalPascal.g:1505:3: ( (lv_parameterGroup_0_0= ruleparameterGroup ) )
                    {
                    // InternalPascal.g:1505:3: ( (lv_parameterGroup_0_0= ruleparameterGroup ) )
                    // InternalPascal.g:1506:4: (lv_parameterGroup_0_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:1506:4: (lv_parameterGroup_0_0= ruleparameterGroup )
                    // InternalPascal.g:1507:5: lv_parameterGroup_0_0= ruleparameterGroup
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
                    // InternalPascal.g:1525:3: (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:1525:3: (otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:1526:4: otherlv_1= 'var' ( (lv_parameterGroup2_2_0= ruleparameterGroup ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormalParameterSectionAccess().getVarKeyword_1_0());
                    			
                    // InternalPascal.g:1530:4: ( (lv_parameterGroup2_2_0= ruleparameterGroup ) )
                    // InternalPascal.g:1531:5: (lv_parameterGroup2_2_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:1531:5: (lv_parameterGroup2_2_0= ruleparameterGroup )
                    // InternalPascal.g:1532:6: lv_parameterGroup2_2_0= ruleparameterGroup
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
                    // InternalPascal.g:1551:3: (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:1551:3: (otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:1552:4: otherlv_3= 'function' ( (lv_parameterGroup3_4_0= ruleparameterGroup ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getFormalParameterSectionAccess().getFunctionKeyword_2_0());
                    			
                    // InternalPascal.g:1556:4: ( (lv_parameterGroup3_4_0= ruleparameterGroup ) )
                    // InternalPascal.g:1557:5: (lv_parameterGroup3_4_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:1557:5: (lv_parameterGroup3_4_0= ruleparameterGroup )
                    // InternalPascal.g:1558:6: lv_parameterGroup3_4_0= ruleparameterGroup
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
                    // InternalPascal.g:1577:3: (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:1577:3: (otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:1578:4: otherlv_5= 'procedure' ( (lv_parameterGroup4_6_0= ruleparameterGroup ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormalParameterSectionAccess().getProcedureKeyword_3_0());
                    			
                    // InternalPascal.g:1582:4: ( (lv_parameterGroup4_6_0= ruleparameterGroup ) )
                    // InternalPascal.g:1583:5: (lv_parameterGroup4_6_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:1583:5: (lv_parameterGroup4_6_0= ruleparameterGroup )
                    // InternalPascal.g:1584:6: lv_parameterGroup4_6_0= ruleparameterGroup
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
    // InternalPascal.g:1606:1: entryRuleparameterGroup returns [EObject current=null] : iv_ruleparameterGroup= ruleparameterGroup EOF ;
    public final EObject entryRuleparameterGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterGroup = null;


        try {
            // InternalPascal.g:1606:55: (iv_ruleparameterGroup= ruleparameterGroup EOF )
            // InternalPascal.g:1607:2: iv_ruleparameterGroup= ruleparameterGroup EOF
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
    // InternalPascal.g:1613:1: ruleparameterGroup returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) ;
    public final EObject ruleparameterGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_typeIdentifier_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1619:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:1620:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:1620:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
            // InternalPascal.g:1621:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
            {
            // InternalPascal.g:1621:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:1622:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:1622:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:1623:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getParameterGroupAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_1=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterGroupAccess().getColonKeyword_1());
            		
            // InternalPascal.g:1644:3: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
            // InternalPascal.g:1645:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
            {
            // InternalPascal.g:1645:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
            // InternalPascal.g:1646:5: lv_typeIdentifier_2_0= ruletypeIdentifier
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
    // InternalPascal.g:1667:1: entryRuletypeIdentifier returns [EObject current=null] : iv_ruletypeIdentifier= ruletypeIdentifier EOF ;
    public final EObject entryRuletypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeIdentifier = null;


        try {
            // InternalPascal.g:1667:55: (iv_ruletypeIdentifier= ruletypeIdentifier EOF )
            // InternalPascal.g:1668:2: iv_ruletypeIdentifier= ruletypeIdentifier EOF
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
    // InternalPascal.g:1674:1: ruletypeIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( (lv_char_1_0= 'char' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (lv_integer_3_0= 'integer' ) ) | ( (lv_real_4_0= 'real' ) ) | ( (lv_string_5_0= 'string' ) ) ) ;
    public final EObject ruletypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_char_1_0=null;
        Token lv_boolean_2_0=null;
        Token lv_integer_3_0=null;
        Token lv_real_4_0=null;
        Token lv_string_5_0=null;
        EObject lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1680:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( (lv_char_1_0= 'char' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (lv_integer_3_0= 'integer' ) ) | ( (lv_real_4_0= 'real' ) ) | ( (lv_string_5_0= 'string' ) ) ) )
            // InternalPascal.g:1681:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( (lv_char_1_0= 'char' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (lv_integer_3_0= 'integer' ) ) | ( (lv_real_4_0= 'real' ) ) | ( (lv_string_5_0= 'string' ) ) )
            {
            // InternalPascal.g:1681:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( (lv_char_1_0= 'char' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (lv_integer_3_0= 'integer' ) ) | ( (lv_real_4_0= 'real' ) ) | ( (lv_string_5_0= 'string' ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 40:
                {
                alt16=5;
                }
                break;
            case 41:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1682:3: ( (lv_identifier_0_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1682:3: ( (lv_identifier_0_0= ruleidentifier ) )
                    // InternalPascal.g:1683:4: (lv_identifier_0_0= ruleidentifier )
                    {
                    // InternalPascal.g:1683:4: (lv_identifier_0_0= ruleidentifier )
                    // InternalPascal.g:1684:5: lv_identifier_0_0= ruleidentifier
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
                    // InternalPascal.g:1702:3: ( (lv_char_1_0= 'char' ) )
                    {
                    // InternalPascal.g:1702:3: ( (lv_char_1_0= 'char' ) )
                    // InternalPascal.g:1703:4: (lv_char_1_0= 'char' )
                    {
                    // InternalPascal.g:1703:4: (lv_char_1_0= 'char' )
                    // InternalPascal.g:1704:5: lv_char_1_0= 'char'
                    {
                    lv_char_1_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_char_1_0, grammarAccess.getTypeIdentifierAccess().getCharCharKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "char", lv_char_1_0, "char");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1717:3: ( (lv_boolean_2_0= 'boolean' ) )
                    {
                    // InternalPascal.g:1717:3: ( (lv_boolean_2_0= 'boolean' ) )
                    // InternalPascal.g:1718:4: (lv_boolean_2_0= 'boolean' )
                    {
                    // InternalPascal.g:1718:4: (lv_boolean_2_0= 'boolean' )
                    // InternalPascal.g:1719:5: lv_boolean_2_0= 'boolean'
                    {
                    lv_boolean_2_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_boolean_2_0, grammarAccess.getTypeIdentifierAccess().getBooleanBooleanKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_2_0, "boolean");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1732:3: ( (lv_integer_3_0= 'integer' ) )
                    {
                    // InternalPascal.g:1732:3: ( (lv_integer_3_0= 'integer' ) )
                    // InternalPascal.g:1733:4: (lv_integer_3_0= 'integer' )
                    {
                    // InternalPascal.g:1733:4: (lv_integer_3_0= 'integer' )
                    // InternalPascal.g:1734:5: lv_integer_3_0= 'integer'
                    {
                    lv_integer_3_0=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_integer_3_0, grammarAccess.getTypeIdentifierAccess().getIntegerIntegerKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "integer", lv_integer_3_0, "integer");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1747:3: ( (lv_real_4_0= 'real' ) )
                    {
                    // InternalPascal.g:1747:3: ( (lv_real_4_0= 'real' ) )
                    // InternalPascal.g:1748:4: (lv_real_4_0= 'real' )
                    {
                    // InternalPascal.g:1748:4: (lv_real_4_0= 'real' )
                    // InternalPascal.g:1749:5: lv_real_4_0= 'real'
                    {
                    lv_real_4_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_real_4_0, grammarAccess.getTypeIdentifierAccess().getRealRealKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "real", lv_real_4_0, "real");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1762:3: ( (lv_string_5_0= 'string' ) )
                    {
                    // InternalPascal.g:1762:3: ( (lv_string_5_0= 'string' ) )
                    // InternalPascal.g:1763:4: (lv_string_5_0= 'string' )
                    {
                    // InternalPascal.g:1763:4: (lv_string_5_0= 'string' )
                    // InternalPascal.g:1764:5: lv_string_5_0= 'string'
                    {
                    lv_string_5_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_string_5_0, grammarAccess.getTypeIdentifierAccess().getStringStringKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "string", lv_string_5_0, "string");
                    				

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
    // $ANTLR end "ruletypeIdentifier"


    // $ANTLR start "entryRuleprocedureType"
    // InternalPascal.g:1780:1: entryRuleprocedureType returns [EObject current=null] : iv_ruleprocedureType= ruleprocedureType EOF ;
    public final EObject entryRuleprocedureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureType = null;


        try {
            // InternalPascal.g:1780:54: (iv_ruleprocedureType= ruleprocedureType EOF )
            // InternalPascal.g:1781:2: iv_ruleprocedureType= ruleprocedureType EOF
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
    // InternalPascal.g:1787:1: ruleprocedureType returns [EObject current=null] : ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? ) ;
    public final EObject ruleprocedureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_formalParameterList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1793:2: ( ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? ) )
            // InternalPascal.g:1794:2: ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? )
            {
            // InternalPascal.g:1794:2: ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? )
            // InternalPascal.g:1795:3: () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            {
            // InternalPascal.g:1795:3: ()
            // InternalPascal.g:1796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcedureTypeAccess().getProcedureTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedureTypeAccess().getProcedureKeyword_1());
            		
            // InternalPascal.g:1806:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1807:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:1807:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:1808:5: lv_formalParameterList_2_0= ruleformalParameterList
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
    // InternalPascal.g:1829:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:1829:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:1830:2: iv_ruletype= ruletype EOF
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
    // InternalPascal.g:1836:1: ruletype returns [EObject current=null] : ( ( (lv_simpleType_0_0= rulesimpleType ) ) | ( (lv_structuredType_1_0= rulestructuredType ) ) | ( (lv_pointerType_2_0= rulepointerType ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleType_0_0 = null;

        EObject lv_structuredType_1_0 = null;

        EObject lv_pointerType_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1842:2: ( ( ( (lv_simpleType_0_0= rulesimpleType ) ) | ( (lv_structuredType_1_0= rulestructuredType ) ) | ( (lv_pointerType_2_0= rulepointerType ) ) ) )
            // InternalPascal.g:1843:2: ( ( (lv_simpleType_0_0= rulesimpleType ) ) | ( (lv_structuredType_1_0= rulestructuredType ) ) | ( (lv_pointerType_2_0= rulepointerType ) ) )
            {
            // InternalPascal.g:1843:2: ( ( (lv_simpleType_0_0= rulesimpleType ) ) | ( (lv_structuredType_1_0= rulestructuredType ) ) | ( (lv_pointerType_2_0= rulepointerType ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_NUM:
            case RULE_STRING_LITERAL:
            case RULE_BOOL:
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
                alt18=1;
                }
                break;
            case 44:
            case 47:
                {
                alt18=2;
                }
                break;
            case 42:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1844:3: ( (lv_simpleType_0_0= rulesimpleType ) )
                    {
                    // InternalPascal.g:1844:3: ( (lv_simpleType_0_0= rulesimpleType ) )
                    // InternalPascal.g:1845:4: (lv_simpleType_0_0= rulesimpleType )
                    {
                    // InternalPascal.g:1845:4: (lv_simpleType_0_0= rulesimpleType )
                    // InternalPascal.g:1846:5: lv_simpleType_0_0= rulesimpleType
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
                    // InternalPascal.g:1864:3: ( (lv_structuredType_1_0= rulestructuredType ) )
                    {
                    // InternalPascal.g:1864:3: ( (lv_structuredType_1_0= rulestructuredType ) )
                    // InternalPascal.g:1865:4: (lv_structuredType_1_0= rulestructuredType )
                    {
                    // InternalPascal.g:1865:4: (lv_structuredType_1_0= rulestructuredType )
                    // InternalPascal.g:1866:5: lv_structuredType_1_0= rulestructuredType
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
                    // InternalPascal.g:1884:3: ( (lv_pointerType_2_0= rulepointerType ) )
                    {
                    // InternalPascal.g:1884:3: ( (lv_pointerType_2_0= rulepointerType ) )
                    // InternalPascal.g:1885:4: (lv_pointerType_2_0= rulepointerType )
                    {
                    // InternalPascal.g:1885:4: (lv_pointerType_2_0= rulepointerType )
                    // InternalPascal.g:1886:5: lv_pointerType_2_0= rulepointerType
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
    // InternalPascal.g:1907:1: entryRulepointerType returns [EObject current=null] : iv_rulepointerType= rulepointerType EOF ;
    public final EObject entryRulepointerType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointerType = null;


        try {
            // InternalPascal.g:1907:52: (iv_rulepointerType= rulepointerType EOF )
            // InternalPascal.g:1908:2: iv_rulepointerType= rulepointerType EOF
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
    // InternalPascal.g:1914:1: rulepointerType returns [EObject current=null] : (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) ) ;
    public final EObject rulepointerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeIdentifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1920:2: ( (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:1921:2: (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:1921:2: (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) )
            // InternalPascal.g:1922:3: otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPointerTypeAccess().getCircumflexAccentKeyword_0());
            		
            // InternalPascal.g:1926:3: ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) )
            // InternalPascal.g:1927:4: (lv_typeIdentifier_1_0= ruletypeIdentifier )
            {
            // InternalPascal.g:1927:4: (lv_typeIdentifier_1_0= ruletypeIdentifier )
            // InternalPascal.g:1928:5: lv_typeIdentifier_1_0= ruletypeIdentifier
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
    // InternalPascal.g:1949:1: entryRulesimpleType returns [EObject current=null] : iv_rulesimpleType= rulesimpleType EOF ;
    public final EObject entryRulesimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleType = null;


        try {
            // InternalPascal.g:1949:51: (iv_rulesimpleType= rulesimpleType EOF )
            // InternalPascal.g:1950:2: iv_rulesimpleType= rulesimpleType EOF
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
    // InternalPascal.g:1956:1: rulesimpleType returns [EObject current=null] : ( ( (lv_scalarType_0_0= rulescalarType ) ) | ( (lv_subrangeType_1_0= rulesubrangeType ) ) | ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) | ( (lv_stringtype_3_0= rulestringtype ) ) ) ;
    public final EObject rulesimpleType() throws RecognitionException {
        EObject current = null;

        EObject lv_scalarType_0_0 = null;

        EObject lv_subrangeType_1_0 = null;

        EObject lv_typeIdentifier_2_0 = null;

        EObject lv_stringtype_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1962:2: ( ( ( (lv_scalarType_0_0= rulescalarType ) ) | ( (lv_subrangeType_1_0= rulesubrangeType ) ) | ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) | ( (lv_stringtype_3_0= rulestringtype ) ) ) )
            // InternalPascal.g:1963:2: ( ( (lv_scalarType_0_0= rulescalarType ) ) | ( (lv_subrangeType_1_0= rulesubrangeType ) ) | ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) | ( (lv_stringtype_3_0= rulestringtype ) ) )
            {
            // InternalPascal.g:1963:2: ( ( (lv_scalarType_0_0= rulescalarType ) ) | ( (lv_subrangeType_1_0= rulesubrangeType ) ) | ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) | ( (lv_stringtype_3_0= rulestringtype ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt19=1;
                }
                break;
            case RULE_NUM:
            case RULE_STRING_LITERAL:
            case RULE_BOOL:
            case RULE_NUM_REAL:
            case 28:
            case 29:
            case 30:
                {
                alt19=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA19_3 = input.LA(2);

                if ( (LA19_3==43) ) {
                    alt19=2;
                }
                else if ( (LA19_3==EOF||LA19_3==RULE_IDENT||(LA19_3>=21 && LA19_3<=22)||LA19_3==27||LA19_3==48) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                int LA19_5 = input.LA(2);

                if ( (LA19_5==45) ) {
                    alt19=4;
                }
                else if ( (LA19_5==EOF||LA19_5==RULE_IDENT||(LA19_5>=21 && LA19_5<=22)||LA19_5==27||LA19_5==48) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1964:3: ( (lv_scalarType_0_0= rulescalarType ) )
                    {
                    // InternalPascal.g:1964:3: ( (lv_scalarType_0_0= rulescalarType ) )
                    // InternalPascal.g:1965:4: (lv_scalarType_0_0= rulescalarType )
                    {
                    // InternalPascal.g:1965:4: (lv_scalarType_0_0= rulescalarType )
                    // InternalPascal.g:1966:5: lv_scalarType_0_0= rulescalarType
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
                    // InternalPascal.g:1984:3: ( (lv_subrangeType_1_0= rulesubrangeType ) )
                    {
                    // InternalPascal.g:1984:3: ( (lv_subrangeType_1_0= rulesubrangeType ) )
                    // InternalPascal.g:1985:4: (lv_subrangeType_1_0= rulesubrangeType )
                    {
                    // InternalPascal.g:1985:4: (lv_subrangeType_1_0= rulesubrangeType )
                    // InternalPascal.g:1986:5: lv_subrangeType_1_0= rulesubrangeType
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
                    // InternalPascal.g:2004:3: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
                    {
                    // InternalPascal.g:2004:3: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
                    // InternalPascal.g:2005:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
                    {
                    // InternalPascal.g:2005:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
                    // InternalPascal.g:2006:5: lv_typeIdentifier_2_0= ruletypeIdentifier
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
                    // InternalPascal.g:2024:3: ( (lv_stringtype_3_0= rulestringtype ) )
                    {
                    // InternalPascal.g:2024:3: ( (lv_stringtype_3_0= rulestringtype ) )
                    // InternalPascal.g:2025:4: (lv_stringtype_3_0= rulestringtype )
                    {
                    // InternalPascal.g:2025:4: (lv_stringtype_3_0= rulestringtype )
                    // InternalPascal.g:2026:5: lv_stringtype_3_0= rulestringtype
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
    // InternalPascal.g:2047:1: entryRulescalarType returns [EObject current=null] : iv_rulescalarType= rulescalarType EOF ;
    public final EObject entryRulescalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulescalarType = null;


        try {
            // InternalPascal.g:2047:51: (iv_rulescalarType= rulescalarType EOF )
            // InternalPascal.g:2048:2: iv_rulescalarType= rulescalarType EOF
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
    // InternalPascal.g:2054:1: rulescalarType returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' ) ;
    public final EObject rulescalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifierList_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2060:2: ( (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' ) )
            // InternalPascal.g:2061:2: (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:2061:2: (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' )
            // InternalPascal.g:2062:3: otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarTypeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:2066:3: ( (lv_identifierList_1_0= ruleidentifierList ) )
            // InternalPascal.g:2067:4: (lv_identifierList_1_0= ruleidentifierList )
            {
            // InternalPascal.g:2067:4: (lv_identifierList_1_0= ruleidentifierList )
            // InternalPascal.g:2068:5: lv_identifierList_1_0= ruleidentifierList
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
    // InternalPascal.g:2093:1: entryRulesubrangeType returns [EObject current=null] : iv_rulesubrangeType= rulesubrangeType EOF ;
    public final EObject entryRulesubrangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrangeType = null;


        try {
            // InternalPascal.g:2093:53: (iv_rulesubrangeType= rulesubrangeType EOF )
            // InternalPascal.g:2094:2: iv_rulesubrangeType= rulesubrangeType EOF
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
    // InternalPascal.g:2100:1: rulesubrangeType returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) ) ) ;
    public final EObject rulesubrangeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constant_0_0 = null;

        EObject lv_constant2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2106:2: ( ( ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:2107:2: ( ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:2107:2: ( ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) ) )
            // InternalPascal.g:2108:3: ( (lv_constant_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constant2_2_0= ruleconstant ) )
            {
            // InternalPascal.g:2108:3: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:2109:4: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:2109:4: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:2110:5: lv_constant_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrangeTypeAccess().getConstantConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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
            		
            // InternalPascal.g:2131:3: ( (lv_constant2_2_0= ruleconstant ) )
            // InternalPascal.g:2132:4: (lv_constant2_2_0= ruleconstant )
            {
            // InternalPascal.g:2132:4: (lv_constant2_2_0= ruleconstant )
            // InternalPascal.g:2133:5: lv_constant2_2_0= ruleconstant
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
    // InternalPascal.g:2154:1: entryRulestructuredType returns [EObject current=null] : iv_rulestructuredType= rulestructuredType EOF ;
    public final EObject entryRulestructuredType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructuredType = null;


        try {
            // InternalPascal.g:2154:55: (iv_rulestructuredType= rulestructuredType EOF )
            // InternalPascal.g:2155:2: iv_rulestructuredType= rulestructuredType EOF
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
    // InternalPascal.g:2161:1: rulestructuredType returns [EObject current=null] : ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) ) ) ;
    public final EObject rulestructuredType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_unpackedStructuredType_1_0 = null;

        EObject lv_unpackedStructuredType1_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2167:2: ( ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) ) ) )
            // InternalPascal.g:2168:2: ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) ) )
            {
            // InternalPascal.g:2168:2: ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            else if ( (LA20_0==47) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:2169:3: (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) )
                    {
                    // InternalPascal.g:2169:3: (otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) ) )
                    // InternalPascal.g:2170:4: otherlv_0= 'packed' ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getStructuredTypeAccess().getPackedKeyword_0_0());
                    			
                    // InternalPascal.g:2174:4: ( (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType ) )
                    // InternalPascal.g:2175:5: (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType )
                    {
                    // InternalPascal.g:2175:5: (lv_unpackedStructuredType_1_0= ruleunpackedStructuredType )
                    // InternalPascal.g:2176:6: lv_unpackedStructuredType_1_0= ruleunpackedStructuredType
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
                    // InternalPascal.g:2195:3: ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) )
                    {
                    // InternalPascal.g:2195:3: ( (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType ) )
                    // InternalPascal.g:2196:4: (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType )
                    {
                    // InternalPascal.g:2196:4: (lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType )
                    // InternalPascal.g:2197:5: lv_unpackedStructuredType1_2_0= ruleunpackedStructuredType
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
    // InternalPascal.g:2218:1: entryRuleunpackedStructuredType returns [EObject current=null] : iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF ;
    public final EObject entryRuleunpackedStructuredType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpackedStructuredType = null;


        try {
            // InternalPascal.g:2218:63: (iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF )
            // InternalPascal.g:2219:2: iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF
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
    // InternalPascal.g:2225:1: ruleunpackedStructuredType returns [EObject current=null] : ( (lv_recordType_0_0= rulerecordType ) ) ;
    public final EObject ruleunpackedStructuredType() throws RecognitionException {
        EObject current = null;

        EObject lv_recordType_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2231:2: ( ( (lv_recordType_0_0= rulerecordType ) ) )
            // InternalPascal.g:2232:2: ( (lv_recordType_0_0= rulerecordType ) )
            {
            // InternalPascal.g:2232:2: ( (lv_recordType_0_0= rulerecordType ) )
            // InternalPascal.g:2233:3: (lv_recordType_0_0= rulerecordType )
            {
            // InternalPascal.g:2233:3: (lv_recordType_0_0= rulerecordType )
            // InternalPascal.g:2234:4: lv_recordType_0_0= rulerecordType
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
    // InternalPascal.g:2254:1: entryRulestringtype returns [EObject current=null] : iv_rulestringtype= rulestringtype EOF ;
    public final EObject entryRulestringtype() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringtype = null;


        try {
            // InternalPascal.g:2254:51: (iv_rulestringtype= rulestringtype EOF )
            // InternalPascal.g:2255:2: iv_rulestringtype= rulestringtype EOF
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
    // InternalPascal.g:2261:1: rulestringtype returns [EObject current=null] : (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' ) ;
    public final EObject rulestringtype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_identifier_2_0 = null;

        EObject lv_unsignedNumber_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2267:2: ( (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' ) )
            // InternalPascal.g:2268:2: (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' )
            {
            // InternalPascal.g:2268:2: (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' )
            // InternalPascal.g:2269:3: otherlv_0= 'string' otherlv_1= '[' ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getStringtypeAccess().getStringKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getStringtypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:2277:3: ( ( (lv_identifier_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_IDENT) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_NUM||LA21_0==RULE_NUM_REAL) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:2278:4: ( (lv_identifier_2_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:2278:4: ( (lv_identifier_2_0= ruleidentifier ) )
                    // InternalPascal.g:2279:5: (lv_identifier_2_0= ruleidentifier )
                    {
                    // InternalPascal.g:2279:5: (lv_identifier_2_0= ruleidentifier )
                    // InternalPascal.g:2280:6: lv_identifier_2_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getStringtypeAccess().getIdentifierIdentifierParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_30);
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
                    // InternalPascal.g:2298:4: ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:2298:4: ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) )
                    // InternalPascal.g:2299:5: (lv_unsignedNumber_3_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:2299:5: (lv_unsignedNumber_3_0= ruleunsignedNumber )
                    // InternalPascal.g:2300:6: lv_unsignedNumber_3_0= ruleunsignedNumber
                    {

                    						newCompositeNode(grammarAccess.getStringtypeAccess().getUnsignedNumberUnsignedNumberParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
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
    // InternalPascal.g:2326:1: entryRulerecordType returns [EObject current=null] : iv_rulerecordType= rulerecordType EOF ;
    public final EObject entryRulerecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecordType = null;


        try {
            // InternalPascal.g:2326:51: (iv_rulerecordType= rulerecordType EOF )
            // InternalPascal.g:2327:2: iv_rulerecordType= rulerecordType EOF
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
    // InternalPascal.g:2333:1: rulerecordType returns [EObject current=null] : ( () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end' ) ;
    public final EObject rulerecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fieldList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2339:2: ( ( () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end' ) )
            // InternalPascal.g:2340:2: ( () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end' )
            {
            // InternalPascal.g:2340:2: ( () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end' )
            // InternalPascal.g:2341:3: () otherlv_1= 'record' ( (lv_fieldList_2_0= rulefieldList ) )? otherlv_3= 'end'
            {
            // InternalPascal.g:2341:3: ()
            // InternalPascal.g:2342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecordTypeAccess().getRecordTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getRecordKeyword_1());
            		
            // InternalPascal.g:2352:3: ( (lv_fieldList_2_0= rulefieldList ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_IDENT||LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2353:4: (lv_fieldList_2_0= rulefieldList )
                    {
                    // InternalPascal.g:2353:4: (lv_fieldList_2_0= rulefieldList )
                    // InternalPascal.g:2354:5: lv_fieldList_2_0= rulefieldList
                    {

                    					newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_32);
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
    // InternalPascal.g:2379:1: entryRulefieldList returns [EObject current=null] : iv_rulefieldList= rulefieldList EOF ;
    public final EObject entryRulefieldList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefieldList = null;


        try {
            // InternalPascal.g:2379:50: (iv_rulefieldList= rulefieldList EOF )
            // InternalPascal.g:2380:2: iv_rulefieldList= rulefieldList EOF
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
    // InternalPascal.g:2386:1: rulefieldList returns [EObject current=null] : ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart1_3_0= rulevariantPart ) ) ) ;
    public final EObject rulefieldList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fixedPart_0_0 = null;

        EObject lv_variantPart_2_0 = null;

        EObject lv_variantPart1_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2392:2: ( ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart1_3_0= rulevariantPart ) ) ) )
            // InternalPascal.g:2393:2: ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart1_3_0= rulevariantPart ) ) )
            {
            // InternalPascal.g:2393:2: ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart1_3_0= rulevariantPart ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENT) ) {
                alt24=1;
            }
            else if ( (LA24_0==49) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2394:3: ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? )
                    {
                    // InternalPascal.g:2394:3: ( ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )? )
                    // InternalPascal.g:2395:4: ( (lv_fixedPart_0_0= rulefixedPart ) ) (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )?
                    {
                    // InternalPascal.g:2395:4: ( (lv_fixedPart_0_0= rulefixedPart ) )
                    // InternalPascal.g:2396:5: (lv_fixedPart_0_0= rulefixedPart )
                    {
                    // InternalPascal.g:2396:5: (lv_fixedPart_0_0= rulefixedPart )
                    // InternalPascal.g:2397:6: lv_fixedPart_0_0= rulefixedPart
                    {

                    						newCompositeNode(grammarAccess.getFieldListAccess().getFixedPartFixedPartParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalPascal.g:2414:4: (otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==22) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalPascal.g:2415:5: otherlv_1= ';' ( (lv_variantPart_2_0= rulevariantPart ) )
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_34); 

                            					newLeafNode(otherlv_1, grammarAccess.getFieldListAccess().getSemicolonKeyword_0_1_0());
                            				
                            // InternalPascal.g:2419:5: ( (lv_variantPart_2_0= rulevariantPart ) )
                            // InternalPascal.g:2420:6: (lv_variantPart_2_0= rulevariantPart )
                            {
                            // InternalPascal.g:2420:6: (lv_variantPart_2_0= rulevariantPart )
                            // InternalPascal.g:2421:7: lv_variantPart_2_0= rulevariantPart
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
                    // InternalPascal.g:2441:3: ( (lv_variantPart1_3_0= rulevariantPart ) )
                    {
                    // InternalPascal.g:2441:3: ( (lv_variantPart1_3_0= rulevariantPart ) )
                    // InternalPascal.g:2442:4: (lv_variantPart1_3_0= rulevariantPart )
                    {
                    // InternalPascal.g:2442:4: (lv_variantPart1_3_0= rulevariantPart )
                    // InternalPascal.g:2443:5: lv_variantPart1_3_0= rulevariantPart
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
    // InternalPascal.g:2464:1: entryRulefixedPart returns [EObject current=null] : iv_rulefixedPart= rulefixedPart EOF ;
    public final EObject entryRulefixedPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixedPart = null;


        try {
            // InternalPascal.g:2464:50: (iv_rulefixedPart= rulefixedPart EOF )
            // InternalPascal.g:2465:2: iv_rulefixedPart= rulefixedPart EOF
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
    // InternalPascal.g:2471:1: rulefixedPart returns [EObject current=null] : ( ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )* ) ;
    public final EObject rulefixedPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_recordSection_0_0 = null;

        EObject lv_recordSection1_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2477:2: ( ( ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )* ) )
            // InternalPascal.g:2478:2: ( ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )* )
            {
            // InternalPascal.g:2478:2: ( ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )* )
            // InternalPascal.g:2479:3: ( (lv_recordSection_0_0= rulerecordSection ) ) (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )*
            {
            // InternalPascal.g:2479:3: ( (lv_recordSection_0_0= rulerecordSection ) )
            // InternalPascal.g:2480:4: (lv_recordSection_0_0= rulerecordSection )
            {
            // InternalPascal.g:2480:4: (lv_recordSection_0_0= rulerecordSection )
            // InternalPascal.g:2481:5: lv_recordSection_0_0= rulerecordSection
            {

            					newCompositeNode(grammarAccess.getFixedPartAccess().getRecordSectionRecordSectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalPascal.g:2498:3: (otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_IDENT) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalPascal.g:2499:4: otherlv_1= ';' ( (lv_recordSection1_2_0= rulerecordSection ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFixedPartAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:2503:4: ( (lv_recordSection1_2_0= rulerecordSection ) )
            	    // InternalPascal.g:2504:5: (lv_recordSection1_2_0= rulerecordSection )
            	    {
            	    // InternalPascal.g:2504:5: (lv_recordSection1_2_0= rulerecordSection )
            	    // InternalPascal.g:2505:6: lv_recordSection1_2_0= rulerecordSection
            	    {

            	    						newCompositeNode(grammarAccess.getFixedPartAccess().getRecordSection1RecordSectionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop25;
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
    // InternalPascal.g:2527:1: entryRulerecordSection returns [EObject current=null] : iv_rulerecordSection= rulerecordSection EOF ;
    public final EObject entryRulerecordSection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecordSection = null;


        try {
            // InternalPascal.g:2527:54: (iv_rulerecordSection= rulerecordSection EOF )
            // InternalPascal.g:2528:2: iv_rulerecordSection= rulerecordSection EOF
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
    // InternalPascal.g:2534:1: rulerecordSection returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecordSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2540:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:2541:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:2541:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:2542:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:2542:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:2543:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:2543:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:2544:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getRecordSectionAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_1=(Token)match(input,34,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordSectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:2565:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:2566:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:2566:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:2567:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:2588:1: entryRulevariantPart returns [EObject current=null] : iv_rulevariantPart= rulevariantPart EOF ;
    public final EObject entryRulevariantPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariantPart = null;


        try {
            // InternalPascal.g:2588:52: (iv_rulevariantPart= rulevariantPart EOF )
            // InternalPascal.g:2589:2: iv_rulevariantPart= rulevariantPart EOF
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
    // InternalPascal.g:2595:1: rulevariantPart returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )* ) ;
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
            // InternalPascal.g:2601:2: ( (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )* ) )
            // InternalPascal.g:2602:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:2602:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )* )
            // InternalPascal.g:2603:3: otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant_3_0= rulevariant ) ) (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getVariantPartAccess().getCaseKeyword_0());
            		
            // InternalPascal.g:2607:3: ( (lv_tag_1_0= ruletag ) )
            // InternalPascal.g:2608:4: (lv_tag_1_0= ruletag )
            {
            // InternalPascal.g:2608:4: (lv_tag_1_0= ruletag )
            // InternalPascal.g:2609:5: lv_tag_1_0= ruletag
            {

            					newCompositeNode(grammarAccess.getVariantPartAccess().getTagTagParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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
            		
            // InternalPascal.g:2630:3: ( (lv_variant_3_0= rulevariant ) )
            // InternalPascal.g:2631:4: (lv_variant_3_0= rulevariant )
            {
            // InternalPascal.g:2631:4: (lv_variant_3_0= rulevariant )
            // InternalPascal.g:2632:5: lv_variant_3_0= rulevariant
            {

            					newCompositeNode(grammarAccess.getVariantPartAccess().getVariantVariantParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalPascal.g:2649:3: (otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:2650:4: otherlv_4= ';' ( (lv_variant1_5_0= rulevariant ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVariantPartAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalPascal.g:2654:4: ( (lv_variant1_5_0= rulevariant ) )
            	    // InternalPascal.g:2655:5: (lv_variant1_5_0= rulevariant )
            	    {
            	    // InternalPascal.g:2655:5: (lv_variant1_5_0= rulevariant )
            	    // InternalPascal.g:2656:6: lv_variant1_5_0= rulevariant
            	    {

            	    						newCompositeNode(grammarAccess.getVariantPartAccess().getVariant1VariantParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "rulevariantPart"


    // $ANTLR start "entryRuletag"
    // InternalPascal.g:2678:1: entryRuletag returns [EObject current=null] : iv_ruletag= ruletag EOF ;
    public final EObject entryRuletag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag = null;


        try {
            // InternalPascal.g:2678:44: (iv_ruletag= ruletag EOF )
            // InternalPascal.g:2679:2: iv_ruletag= ruletag EOF
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
    // InternalPascal.g:2685:1: ruletag returns [EObject current=null] : ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) ) ) ;
    public final EObject ruletag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_typeIdentifier_2_0 = null;

        EObject lv_typeIdentifier1_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2691:2: ( ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:2692:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:2692:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENT) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==EOF||LA27_1==50) ) {
                    alt27=2;
                }
                else if ( (LA27_1==34) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA27_0>=37 && LA27_0<=41)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2693:3: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
                    {
                    // InternalPascal.g:2693:3: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
                    // InternalPascal.g:2694:4: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
                    {
                    // InternalPascal.g:2694:4: ( (lv_identifier_0_0= ruleidentifier ) )
                    // InternalPascal.g:2695:5: (lv_identifier_0_0= ruleidentifier )
                    {
                    // InternalPascal.g:2695:5: (lv_identifier_0_0= ruleidentifier )
                    // InternalPascal.g:2696:6: lv_identifier_0_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getTagAccess().getIdentifierIdentifierParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    otherlv_1=(Token)match(input,34,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getTagAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:2717:4: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
                    // InternalPascal.g:2718:5: (lv_typeIdentifier_2_0= ruletypeIdentifier )
                    {
                    // InternalPascal.g:2718:5: (lv_typeIdentifier_2_0= ruletypeIdentifier )
                    // InternalPascal.g:2719:6: lv_typeIdentifier_2_0= ruletypeIdentifier
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
                    // InternalPascal.g:2738:3: ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) )
                    {
                    // InternalPascal.g:2738:3: ( (lv_typeIdentifier1_3_0= ruletypeIdentifier ) )
                    // InternalPascal.g:2739:4: (lv_typeIdentifier1_3_0= ruletypeIdentifier )
                    {
                    // InternalPascal.g:2739:4: (lv_typeIdentifier1_3_0= ruletypeIdentifier )
                    // InternalPascal.g:2740:5: lv_typeIdentifier1_3_0= ruletypeIdentifier
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
    // InternalPascal.g:2761:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:2761:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:2762:2: iv_rulevariant= rulevariant EOF
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
    // InternalPascal.g:2768:1: rulevariant returns [EObject current=null] : (this_constant_0= ruleconstant (otherlv_1= ';' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')' ) ;
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
            // InternalPascal.g:2774:2: ( (this_constant_0= ruleconstant (otherlv_1= ';' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')' ) )
            // InternalPascal.g:2775:2: (this_constant_0= ruleconstant (otherlv_1= ';' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')' )
            {
            // InternalPascal.g:2775:2: (this_constant_0= ruleconstant (otherlv_1= ';' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')' )
            // InternalPascal.g:2776:3: this_constant_0= ruleconstant (otherlv_1= ';' ( (lv_constant_2_0= ruleconstant ) ) )* otherlv_3= ':' otherlv_4= '(' ( (lv_fieldList_5_0= rulefieldList ) ) otherlv_6= ')'
            {

            			newCompositeNode(grammarAccess.getVariantAccess().getConstantParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_constant_0=ruleconstant();

            state._fsp--;


            			current = this_constant_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:2784:3: (otherlv_1= ';' ( (lv_constant_2_0= ruleconstant ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPascal.g:2785:4: otherlv_1= ';' ( (lv_constant_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:2789:4: ( (lv_constant_2_0= ruleconstant ) )
            	    // InternalPascal.g:2790:5: (lv_constant_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:2790:5: (lv_constant_2_0= ruleconstant )
            	    // InternalPascal.g:2791:6: lv_constant_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getVariantAccess().getConstantConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop28;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getVariantAccess().getColonKeyword_2());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPascal.g:2817:3: ( (lv_fieldList_5_0= rulefieldList ) )
            // InternalPascal.g:2818:4: (lv_fieldList_5_0= rulefieldList )
            {
            // InternalPascal.g:2818:4: (lv_fieldList_5_0= rulefieldList )
            // InternalPascal.g:2819:5: lv_fieldList_5_0= rulefieldList
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
    // InternalPascal.g:2844:1: entryRuleconstList returns [EObject current=null] : iv_ruleconstList= ruleconstList EOF ;
    public final EObject entryRuleconstList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstList = null;


        try {
            // InternalPascal.g:2844:50: (iv_ruleconstList= ruleconstList EOF )
            // InternalPascal.g:2845:2: iv_ruleconstList= ruleconstList EOF
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
    // InternalPascal.g:2851:1: ruleconstList returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant1_2_0= ruleconstant ) ) )* ) ;
    public final EObject ruleconstList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constant_0_0 = null;

        EObject lv_constant1_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2857:2: ( ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant1_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:2858:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant1_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:2858:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant1_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:2859:3: ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant1_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:2859:3: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:2860:4: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:2860:4: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:2861:5: lv_constant_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstListAccess().getConstantConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalPascal.g:2878:3: (otherlv_1= ',' ( (lv_constant1_2_0= ruleconstant ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:2879:4: otherlv_1= ',' ( (lv_constant1_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConstListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:2883:4: ( (lv_constant1_2_0= ruleconstant ) )
            	    // InternalPascal.g:2884:5: (lv_constant1_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:2884:5: (lv_constant1_2_0= ruleconstant )
            	    // InternalPascal.g:2885:6: lv_constant1_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getConstListAccess().getConstant1ConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            	    break loop29;
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
    // InternalPascal.g:2907:1: entryRulevariableDeclarationPart returns [EObject current=null] : iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF ;
    public final EObject entryRulevariableDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableDeclarationPart = null;


        try {
            // InternalPascal.g:2907:64: (iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF )
            // InternalPascal.g:2908:2: iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF
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
    // InternalPascal.g:2914:1: rulevariableDeclarationPart returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' ) ;
    public final EObject rulevariableDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclaration_1_0 = null;

        EObject lv_variableDeclaration1_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2920:2: ( (otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:2921:2: (otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:2921:2: (otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' )
            // InternalPascal.g:2922:3: otherlv_0= 'var' ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) ) (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationPartAccess().getVarKeyword_0());
            		
            // InternalPascal.g:2926:3: ( (lv_variableDeclaration_1_0= rulevariableDeclaration ) )
            // InternalPascal.g:2927:4: (lv_variableDeclaration_1_0= rulevariableDeclaration )
            {
            // InternalPascal.g:2927:4: (lv_variableDeclaration_1_0= rulevariableDeclaration )
            // InternalPascal.g:2928:5: lv_variableDeclaration_1_0= rulevariableDeclaration
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

            // InternalPascal.g:2945:3: (otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_IDENT) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2946:4: otherlv_2= ';' ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationPartAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:2950:4: ( (lv_variableDeclaration1_3_0= rulevariableDeclaration ) )
            	    // InternalPascal.g:2951:5: (lv_variableDeclaration1_3_0= rulevariableDeclaration )
            	    {
            	    // InternalPascal.g:2951:5: (lv_variableDeclaration1_3_0= rulevariableDeclaration )
            	    // InternalPascal.g:2952:6: lv_variableDeclaration1_3_0= rulevariableDeclaration
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
            	    break loop30;
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
    // InternalPascal.g:2978:1: entryRulevariableDeclaration returns [EObject current=null] : iv_rulevariableDeclaration= rulevariableDeclaration EOF ;
    public final EObject entryRulevariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableDeclaration = null;


        try {
            // InternalPascal.g:2978:60: (iv_rulevariableDeclaration= rulevariableDeclaration EOF )
            // InternalPascal.g:2979:2: iv_rulevariableDeclaration= rulevariableDeclaration EOF
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
    // InternalPascal.g:2985:1: rulevariableDeclaration returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleexpression ) ) )? ) ;
    public final EObject rulevariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2991:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:2992:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:2992:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleexpression ) ) )? )
            // InternalPascal.g:2993:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:2993:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:2994:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:2994:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:2995:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_1=(Token)match(input,34,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalPascal.g:3016:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3017:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3017:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3018:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalPascal.g:3035:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleexpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascal.g:3036:4: otherlv_3= '=' ( (lv_expression_4_0= ruleexpression ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalPascal.g:3040:4: ( (lv_expression_4_0= ruleexpression ) )
                    // InternalPascal.g:3041:5: (lv_expression_4_0= ruleexpression )
                    {
                    // InternalPascal.g:3041:5: (lv_expression_4_0= ruleexpression )
                    // InternalPascal.g:3042:6: lv_expression_4_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_4_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
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
    // $ANTLR end "rulevariableDeclaration"


    // $ANTLR start "entryRuleprocedureAndFunctionDeclarationPart"
    // InternalPascal.g:3064:1: entryRuleprocedureAndFunctionDeclarationPart returns [EObject current=null] : iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF ;
    public final EObject entryRuleprocedureAndFunctionDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureAndFunctionDeclarationPart = null;


        try {
            // InternalPascal.g:3064:76: (iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF )
            // InternalPascal.g:3065:2: iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF
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
    // InternalPascal.g:3071:1: ruleprocedureAndFunctionDeclarationPart returns [EObject current=null] : ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' ) ;
    public final EObject ruleprocedureAndFunctionDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_procedureOrFunctionDeclaration_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3077:2: ( ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' ) )
            // InternalPascal.g:3078:2: ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' )
            {
            // InternalPascal.g:3078:2: ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' )
            // InternalPascal.g:3079:3: ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';'
            {
            // InternalPascal.g:3079:3: ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) )
            // InternalPascal.g:3080:4: (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration )
            {
            // InternalPascal.g:3080:4: (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration )
            // InternalPascal.g:3081:5: lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration
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
    // InternalPascal.g:3106:1: entryRuleprocedureOrFunctionDeclaration returns [EObject current=null] : iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF ;
    public final EObject entryRuleprocedureOrFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureOrFunctionDeclaration = null;


        try {
            // InternalPascal.g:3106:71: (iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF )
            // InternalPascal.g:3107:2: iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF
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
    // InternalPascal.g:3113:1: ruleprocedureOrFunctionDeclaration returns [EObject current=null] : ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) ) ;
    public final EObject ruleprocedureOrFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_procedureDeclaration_0_0 = null;

        EObject lv_functionDeclaration_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3119:2: ( ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) ) )
            // InternalPascal.g:3120:2: ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) )
            {
            // InternalPascal.g:3120:2: ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) )
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
                    // InternalPascal.g:3121:3: ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) )
                    {
                    // InternalPascal.g:3121:3: ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) )
                    // InternalPascal.g:3122:4: (lv_procedureDeclaration_0_0= ruleprocedureDeclaration )
                    {
                    // InternalPascal.g:3122:4: (lv_procedureDeclaration_0_0= ruleprocedureDeclaration )
                    // InternalPascal.g:3123:5: lv_procedureDeclaration_0_0= ruleprocedureDeclaration
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
                    // InternalPascal.g:3141:3: ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) )
                    {
                    // InternalPascal.g:3141:3: ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) )
                    // InternalPascal.g:3142:4: (lv_functionDeclaration_1_0= rulefunctionDeclaration )
                    {
                    // InternalPascal.g:3142:4: (lv_functionDeclaration_1_0= rulefunctionDeclaration )
                    // InternalPascal.g:3143:5: lv_functionDeclaration_1_0= rulefunctionDeclaration
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
    // InternalPascal.g:3164:1: entryRuleprocedureDeclaration returns [EObject current=null] : iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF ;
    public final EObject entryRuleprocedureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureDeclaration = null;


        try {
            // InternalPascal.g:3164:61: (iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF )
            // InternalPascal.g:3165:2: iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF
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
    // InternalPascal.g:3171:1: ruleprocedureDeclaration returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) ) ;
    public final EObject ruleprocedureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formalParameterList_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3177:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) ) )
            // InternalPascal.g:3178:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) )
            {
            // InternalPascal.g:3178:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) )
            // InternalPascal.g:3179:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_0());
            		
            // InternalPascal.g:3183:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:3184:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:3184:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:3185:5: lv_identifier_1_0= ruleidentifier
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

            // InternalPascal.g:3202:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPascal.g:3203:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:3203:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:3204:5: lv_formalParameterList_2_0= ruleformalParameterList
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
            		
            // InternalPascal.g:3225:3: ( (lv_block_4_0= ruleblock ) )
            // InternalPascal.g:3226:4: (lv_block_4_0= ruleblock )
            {
            // InternalPascal.g:3226:4: (lv_block_4_0= ruleblock )
            // InternalPascal.g:3227:5: lv_block_4_0= ruleblock
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
    // InternalPascal.g:3248:1: entryRulefunctionDeclaration returns [EObject current=null] : iv_rulefunctionDeclaration= rulefunctionDeclaration EOF ;
    public final EObject entryRulefunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDeclaration = null;


        try {
            // InternalPascal.g:3248:60: (iv_rulefunctionDeclaration= rulefunctionDeclaration EOF )
            // InternalPascal.g:3249:2: iv_rulefunctionDeclaration= rulefunctionDeclaration EOF
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
    // InternalPascal.g:3255:1: rulefunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_typeIdentifier_4_0= ruletypeIdentifier ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) ) ;
    public final EObject rulefunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formalParameterList_2_0 = null;

        EObject lv_typeIdentifier_4_0 = null;

        EObject lv_block_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3261:2: ( (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_typeIdentifier_4_0= ruletypeIdentifier ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) ) )
            // InternalPascal.g:3262:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_typeIdentifier_4_0= ruletypeIdentifier ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) )
            {
            // InternalPascal.g:3262:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_typeIdentifier_4_0= ruletypeIdentifier ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) )
            // InternalPascal.g:3263:3: otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_typeIdentifier_4_0= ruletypeIdentifier ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:3267:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:3268:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:3268:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:3269:5: lv_identifier_1_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getIdentifierIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalPascal.g:3286:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:3287:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:3287:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:3288:5: lv_formalParameterList_2_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getFormalParameterListFormalParameterListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
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

            otherlv_3=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getColonKeyword_3());
            		
            // InternalPascal.g:3309:3: ( (lv_typeIdentifier_4_0= ruletypeIdentifier ) )
            // InternalPascal.g:3310:4: (lv_typeIdentifier_4_0= ruletypeIdentifier )
            {
            // InternalPascal.g:3310:4: (lv_typeIdentifier_4_0= ruletypeIdentifier )
            // InternalPascal.g:3311:5: lv_typeIdentifier_4_0= ruletypeIdentifier
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeIdentifierTypeIdentifierParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_typeIdentifier_4_0=ruletypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"typeIdentifier",
            						lv_typeIdentifier_4_0,
            						"compilador.Pascal.typeIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_5());
            		
            // InternalPascal.g:3332:3: ( (lv_block_6_0= ruleblock ) )
            // InternalPascal.g:3333:4: (lv_block_6_0= ruleblock )
            {
            // InternalPascal.g:3333:4: (lv_block_6_0= ruleblock )
            // InternalPascal.g:3334:5: lv_block_6_0= ruleblock
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
    // InternalPascal.g:3355:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:3355:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:3356:2: iv_rulestatement= rulestatement EOF
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
    // InternalPascal.g:3362:1: rulestatement returns [EObject current=null] : ( (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_label_0 = null;

        EObject lv_unlabelledStatement_2_0 = null;

        EObject lv_unlabelledStatement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3368:2: ( ( (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) ) )
            // InternalPascal.g:3369:2: ( (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) )
            {
            // InternalPascal.g:3369:2: ( (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) )
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

                if ( (LA35_2==34) ) {
                    alt35=1;
                }
                else if ( (LA35_2==EOF||LA35_2==20||LA35_2==22||LA35_2==48||LA35_2==51) ) {
                    alt35=2;
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
            case 67:
            case 68:
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
                    // InternalPascal.g:3370:3: (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) )
                    {
                    // InternalPascal.g:3370:3: (this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) )
                    // InternalPascal.g:3371:4: this_label_0= rulelabel otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) )
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_21);
                    this_label_0=rulelabel();

                    state._fsp--;


                    				current = this_label_0;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,34,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:3383:4: ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) )
                    // InternalPascal.g:3384:5: (lv_unlabelledStatement_2_0= ruleunlabelledStatement )
                    {
                    // InternalPascal.g:3384:5: (lv_unlabelledStatement_2_0= ruleunlabelledStatement )
                    // InternalPascal.g:3385:6: lv_unlabelledStatement_2_0= ruleunlabelledStatement
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
                    // InternalPascal.g:3404:3: ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) )
                    {
                    // InternalPascal.g:3404:3: ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) )
                    // InternalPascal.g:3405:4: (lv_unlabelledStatement_3_0= ruleunlabelledStatement )
                    {
                    // InternalPascal.g:3405:4: (lv_unlabelledStatement_3_0= ruleunlabelledStatement )
                    // InternalPascal.g:3406:5: lv_unlabelledStatement_3_0= ruleunlabelledStatement
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
    // InternalPascal.g:3427:1: entryRuleunlabelledStatement returns [EObject current=null] : iv_ruleunlabelledStatement= ruleunlabelledStatement EOF ;
    public final EObject entryRuleunlabelledStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunlabelledStatement = null;


        try {
            // InternalPascal.g:3427:60: (iv_ruleunlabelledStatement= ruleunlabelledStatement EOF )
            // InternalPascal.g:3428:2: iv_ruleunlabelledStatement= ruleunlabelledStatement EOF
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
    // InternalPascal.g:3434:1: ruleunlabelledStatement returns [EObject current=null] : ( ( (lv_simpleStatement_0_0= rulesimpleStatement ) ) | ( (lv_structuredStatement_1_0= rulestructuredStatement ) ) | ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? ) ) ;
    public final EObject ruleunlabelledStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_simpleStatement_0_0 = null;

        EObject lv_structuredStatement_1_0 = null;

        EObject lv_identifier_2_0 = null;

        EObject lv_parameterList_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3440:2: ( ( ( (lv_simpleStatement_0_0= rulesimpleStatement ) ) | ( (lv_structuredStatement_1_0= rulestructuredStatement ) ) | ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? ) ) )
            // InternalPascal.g:3441:2: ( ( (lv_simpleStatement_0_0= rulesimpleStatement ) ) | ( (lv_structuredStatement_1_0= rulestructuredStatement ) ) | ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? ) )
            {
            // InternalPascal.g:3441:2: ( ( (lv_simpleStatement_0_0= rulesimpleStatement ) ) | ( (lv_structuredStatement_1_0= rulestructuredStatement ) ) | ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case EOF:
            case 22:
            case 48:
            case 52:
            case 67:
                {
                alt37=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==51) ) {
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
            case 68:
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
                    // InternalPascal.g:3442:3: ( (lv_simpleStatement_0_0= rulesimpleStatement ) )
                    {
                    // InternalPascal.g:3442:3: ( (lv_simpleStatement_0_0= rulesimpleStatement ) )
                    // InternalPascal.g:3443:4: (lv_simpleStatement_0_0= rulesimpleStatement )
                    {
                    // InternalPascal.g:3443:4: (lv_simpleStatement_0_0= rulesimpleStatement )
                    // InternalPascal.g:3444:5: lv_simpleStatement_0_0= rulesimpleStatement
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
                    // InternalPascal.g:3462:3: ( (lv_structuredStatement_1_0= rulestructuredStatement ) )
                    {
                    // InternalPascal.g:3462:3: ( (lv_structuredStatement_1_0= rulestructuredStatement ) )
                    // InternalPascal.g:3463:4: (lv_structuredStatement_1_0= rulestructuredStatement )
                    {
                    // InternalPascal.g:3463:4: (lv_structuredStatement_1_0= rulestructuredStatement )
                    // InternalPascal.g:3464:5: lv_structuredStatement_1_0= rulestructuredStatement
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
                    // InternalPascal.g:3482:3: ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? )
                    {
                    // InternalPascal.g:3482:3: ( ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )? )
                    // InternalPascal.g:3483:4: ( (lv_identifier_2_0= ruleidentifier ) ) (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )?
                    {
                    // InternalPascal.g:3483:4: ( (lv_identifier_2_0= ruleidentifier ) )
                    // InternalPascal.g:3484:5: (lv_identifier_2_0= ruleidentifier )
                    {
                    // InternalPascal.g:3484:5: (lv_identifier_2_0= ruleidentifier )
                    // InternalPascal.g:3485:6: lv_identifier_2_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getUnlabelledStatementAccess().getIdentifierIdentifierParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalPascal.g:3502:4: (otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==20) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalPascal.g:3503:5: otherlv_3= '(' ( (lv_parameterList_4_0= ruleparameterList ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_39); 

                            					newLeafNode(otherlv_3, grammarAccess.getUnlabelledStatementAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalPascal.g:3507:5: ( (lv_parameterList_4_0= ruleparameterList ) )
                            // InternalPascal.g:3508:6: (lv_parameterList_4_0= ruleparameterList )
                            {
                            // InternalPascal.g:3508:6: (lv_parameterList_4_0= ruleparameterList )
                            // InternalPascal.g:3509:7: lv_parameterList_4_0= ruleparameterList
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
    // InternalPascal.g:3536:1: entryRulesimpleStatement returns [EObject current=null] : iv_rulesimpleStatement= rulesimpleStatement EOF ;
    public final EObject entryRulesimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleStatement = null;


        try {
            // InternalPascal.g:3536:56: (iv_rulesimpleStatement= rulesimpleStatement EOF )
            // InternalPascal.g:3537:2: iv_rulesimpleStatement= rulesimpleStatement EOF
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
    // InternalPascal.g:3543:1: rulesimpleStatement returns [EObject current=null] : ( () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )? ) ;
    public final EObject rulesimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_gotoStatement_1_0 = null;

        EObject lv_assignmentStatement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3549:2: ( ( () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )? ) )
            // InternalPascal.g:3550:2: ( () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )? )
            {
            // InternalPascal.g:3550:2: ( () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )? )
            // InternalPascal.g:3551:3: () ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )?
            {
            // InternalPascal.g:3551:3: ()
            // InternalPascal.g:3552:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleStatementAccess().getSimpleStatementAction_0(),
            					current);
            			

            }

            // InternalPascal.g:3558:3: ( ( (lv_gotoStatement_1_0= rulegotoStatement ) ) | ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==67) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_IDENT||LA38_0==52) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:3559:4: ( (lv_gotoStatement_1_0= rulegotoStatement ) )
                    {
                    // InternalPascal.g:3559:4: ( (lv_gotoStatement_1_0= rulegotoStatement ) )
                    // InternalPascal.g:3560:5: (lv_gotoStatement_1_0= rulegotoStatement )
                    {
                    // InternalPascal.g:3560:5: (lv_gotoStatement_1_0= rulegotoStatement )
                    // InternalPascal.g:3561:6: lv_gotoStatement_1_0= rulegotoStatement
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
                    // InternalPascal.g:3579:4: ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) )
                    {
                    // InternalPascal.g:3579:4: ( (lv_assignmentStatement_2_0= ruleassignmentStatement ) )
                    // InternalPascal.g:3580:5: (lv_assignmentStatement_2_0= ruleassignmentStatement )
                    {
                    // InternalPascal.g:3580:5: (lv_assignmentStatement_2_0= ruleassignmentStatement )
                    // InternalPascal.g:3581:6: lv_assignmentStatement_2_0= ruleassignmentStatement
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
    // InternalPascal.g:3603:1: entryRuleassignmentStatement returns [EObject current=null] : iv_ruleassignmentStatement= ruleassignmentStatement EOF ;
    public final EObject entryRuleassignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignmentStatement = null;


        try {
            // InternalPascal.g:3603:60: (iv_ruleassignmentStatement= ruleassignmentStatement EOF )
            // InternalPascal.g:3604:2: iv_ruleassignmentStatement= ruleassignmentStatement EOF
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
    // InternalPascal.g:3610:1: ruleassignmentStatement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3616:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:3617:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:3617:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:3618:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:3618:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:3619:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:3619:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:3620:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignmentStatementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_1=(Token)match(input,51,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentStatementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPascal.g:3641:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:3642:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:3642:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:3643:5: lv_expression_2_0= ruleexpression
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
    // InternalPascal.g:3664:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:3664:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:3665:2: iv_rulevariable= rulevariable EOF
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
    // InternalPascal.g:3671:1: rulevariable returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_identifier_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3677:2: ( ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) ) )
            // InternalPascal.g:3678:2: ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:3678:2: ( (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) ) | ( (lv_identifier_2_0= ruleidentifier ) ) )
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
                    // InternalPascal.g:3679:3: (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) )
                    {
                    // InternalPascal.g:3679:3: (otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) ) )
                    // InternalPascal.g:3680:4: otherlv_0= '@' ( (lv_identifier_1_0= ruleidentifier ) )
                    {
                    otherlv_0=(Token)match(input,52,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0());
                    			
                    // InternalPascal.g:3684:4: ( (lv_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:3685:5: (lv_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:3685:5: (lv_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:3686:6: lv_identifier_1_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getIdentifierIdentifierParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
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
                    // InternalPascal.g:3705:3: ( (lv_identifier_2_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:3705:3: ( (lv_identifier_2_0= ruleidentifier ) )
                    // InternalPascal.g:3706:4: (lv_identifier_2_0= ruleidentifier )
                    {
                    // InternalPascal.g:3706:4: (lv_identifier_2_0= ruleidentifier )
                    // InternalPascal.g:3707:5: lv_identifier_2_0= ruleidentifier
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getIdentifierIdentifierParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalPascal.g:3728:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:3728:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:3729:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascal.g:3735:1: ruleexpression returns [EObject current=null] : ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleExpression_0_0 = null;

        AntlrDatatypeRuleToken lv_relationaloperator_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3741:2: ( ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:3742:2: ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:3742:2: ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )? )
            // InternalPascal.g:3743:3: ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:3743:3: ( (lv_simpleExpression_0_0= rulesimpleExpression ) )
            // InternalPascal.g:3744:4: (lv_simpleExpression_0_0= rulesimpleExpression )
            {
            // InternalPascal.g:3744:4: (lv_simpleExpression_0_0= rulesimpleExpression )
            // InternalPascal.g:3745:5: lv_simpleExpression_0_0= rulesimpleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalPascal.g:3762:3: ( ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27||(LA40_0>=53 && LA40_0<=58)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascal.g:3763:4: ( (lv_relationaloperator_1_0= rulerelationaloperator ) ) ( (lv_expression_2_0= ruleexpression ) )
                    {
                    // InternalPascal.g:3763:4: ( (lv_relationaloperator_1_0= rulerelationaloperator ) )
                    // InternalPascal.g:3764:5: (lv_relationaloperator_1_0= rulerelationaloperator )
                    {
                    // InternalPascal.g:3764:5: (lv_relationaloperator_1_0= rulerelationaloperator )
                    // InternalPascal.g:3765:6: lv_relationaloperator_1_0= rulerelationaloperator
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getRelationaloperatorRelationaloperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    // InternalPascal.g:3782:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascal.g:3783:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascal.g:3783:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascal.g:3784:6: lv_expression_2_0= ruleexpression
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
    // InternalPascal.g:3806:1: entryRulerelationaloperator returns [String current=null] : iv_rulerelationaloperator= rulerelationaloperator EOF ;
    public final String entryRulerelationaloperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelationaloperator = null;


        try {
            // InternalPascal.g:3806:58: (iv_rulerelationaloperator= rulerelationaloperator EOF )
            // InternalPascal.g:3807:2: iv_rulerelationaloperator= rulerelationaloperator EOF
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
    // InternalPascal.g:3813:1: rulerelationaloperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>=' | kw= '>' | kw= 'in' ) ;
    public final AntlrDatatypeRuleToken rulerelationaloperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:3819:2: ( (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>=' | kw= '>' | kw= 'in' ) )
            // InternalPascal.g:3820:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>=' | kw= '>' | kw= 'in' )
            {
            // InternalPascal.g:3820:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>=' | kw= '>' | kw= 'in' )
            int alt41=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt41=1;
                }
                break;
            case 53:
                {
                alt41=2;
                }
                break;
            case 54:
                {
                alt41=3;
                }
                break;
            case 55:
                {
                alt41=4;
                }
                break;
            case 56:
                {
                alt41=5;
                }
                break;
            case 57:
                {
                alt41=6;
                }
                break;
            case 58:
                {
                alt41=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalPascal.g:3821:3: kw= '='
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3827:3: kw= '<>'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getLessThanSignGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:3833:3: kw= '<'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:3839:3: kw= '<='
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:3845:3: kw= '>='
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPascal.g:3851:3: kw= '>'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationaloperatorAccess().getGreaterThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPascal.g:3857:3: kw= 'in'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

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
    // InternalPascal.g:3866:1: entryRulesimpleExpression returns [EObject current=null] : iv_rulesimpleExpression= rulesimpleExpression EOF ;
    public final EObject entryRulesimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleExpression = null;


        try {
            // InternalPascal.g:3866:57: (iv_rulesimpleExpression= rulesimpleExpression EOF )
            // InternalPascal.g:3867:2: iv_rulesimpleExpression= rulesimpleExpression EOF
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
    // InternalPascal.g:3873:1: rulesimpleExpression returns [EObject current=null] : ( ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? ) ;
    public final EObject rulesimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_0 = null;

        AntlrDatatypeRuleToken lv_additiveoperator_1_0 = null;

        EObject lv_simpleExpression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3879:2: ( ( ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? ) )
            // InternalPascal.g:3880:2: ( ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? )
            {
            // InternalPascal.g:3880:2: ( ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? )
            // InternalPascal.g:3881:3: ( (lv_term_0_0= ruleterm ) ) ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )?
            {
            // InternalPascal.g:3881:3: ( (lv_term_0_0= ruleterm ) )
            // InternalPascal.g:3882:4: (lv_term_0_0= ruleterm )
            {
            // InternalPascal.g:3882:4: (lv_term_0_0= ruleterm )
            // InternalPascal.g:3883:5: lv_term_0_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimpleExpressionAccess().getTermTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalPascal.g:3900:3: ( ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=29 && LA42_0<=30)||LA42_0==59) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:3901:4: ( (lv_additiveoperator_1_0= ruleadditiveoperator ) ) ( (lv_simpleExpression_2_0= rulesimpleExpression ) )
                    {
                    // InternalPascal.g:3901:4: ( (lv_additiveoperator_1_0= ruleadditiveoperator ) )
                    // InternalPascal.g:3902:5: (lv_additiveoperator_1_0= ruleadditiveoperator )
                    {
                    // InternalPascal.g:3902:5: (lv_additiveoperator_1_0= ruleadditiveoperator )
                    // InternalPascal.g:3903:6: lv_additiveoperator_1_0= ruleadditiveoperator
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAdditiveoperatorAdditiveoperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    // InternalPascal.g:3920:4: ( (lv_simpleExpression_2_0= rulesimpleExpression ) )
                    // InternalPascal.g:3921:5: (lv_simpleExpression_2_0= rulesimpleExpression )
                    {
                    // InternalPascal.g:3921:5: (lv_simpleExpression_2_0= rulesimpleExpression )
                    // InternalPascal.g:3922:6: lv_simpleExpression_2_0= rulesimpleExpression
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
    // InternalPascal.g:3944:1: entryRuleadditiveoperator returns [String current=null] : iv_ruleadditiveoperator= ruleadditiveoperator EOF ;
    public final String entryRuleadditiveoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadditiveoperator = null;


        try {
            // InternalPascal.g:3944:56: (iv_ruleadditiveoperator= ruleadditiveoperator EOF )
            // InternalPascal.g:3945:2: iv_ruleadditiveoperator= ruleadditiveoperator EOF
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
    // InternalPascal.g:3951:1: ruleadditiveoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleadditiveoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:3957:2: ( (kw= '+' | kw= '-' | kw= 'or' ) )
            // InternalPascal.g:3958:2: (kw= '+' | kw= '-' | kw= 'or' )
            {
            // InternalPascal.g:3958:2: (kw= '+' | kw= '-' | kw= 'or' )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt43=1;
                }
                break;
            case 30:
                {
                alt43=2;
                }
                break;
            case 59:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalPascal.g:3959:3: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3965:3: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:3971:3: kw= 'or'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

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
    // InternalPascal.g:3980:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:3980:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:3981:2: iv_ruleterm= ruleterm EOF
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
    // InternalPascal.g:3987:1: ruleterm returns [EObject current=null] : ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )? ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_signedFactor_0_0 = null;

        AntlrDatatypeRuleToken lv_multiplicativeoperator_1_0 = null;

        EObject lv_term_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3993:2: ( ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )? ) )
            // InternalPascal.g:3994:2: ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )? )
            {
            // InternalPascal.g:3994:2: ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )? )
            // InternalPascal.g:3995:3: ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )?
            {
            // InternalPascal.g:3995:3: ( (lv_signedFactor_0_0= rulesignedFactor ) )
            // InternalPascal.g:3996:4: (lv_signedFactor_0_0= rulesignedFactor )
            {
            // InternalPascal.g:3996:4: (lv_signedFactor_0_0= rulesignedFactor )
            // InternalPascal.g:3997:5: lv_signedFactor_0_0= rulesignedFactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getSignedFactorSignedFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalPascal.g:4014:3: ( ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=60 && LA44_0<=64)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPascal.g:4015:4: ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) ) ( (lv_term_2_0= ruleterm ) )
                    {
                    // InternalPascal.g:4015:4: ( (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator ) )
                    // InternalPascal.g:4016:5: (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator )
                    {
                    // InternalPascal.g:4016:5: (lv_multiplicativeoperator_1_0= rulemultiplicativeoperator )
                    // InternalPascal.g:4017:6: lv_multiplicativeoperator_1_0= rulemultiplicativeoperator
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getMultiplicativeoperatorMultiplicativeoperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    // InternalPascal.g:4034:4: ( (lv_term_2_0= ruleterm ) )
                    // InternalPascal.g:4035:5: (lv_term_2_0= ruleterm )
                    {
                    // InternalPascal.g:4035:5: (lv_term_2_0= ruleterm )
                    // InternalPascal.g:4036:6: lv_term_2_0= ruleterm
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
    // InternalPascal.g:4058:1: entryRulemultiplicativeoperator returns [String current=null] : iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF ;
    public final String entryRulemultiplicativeoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicativeoperator = null;


        try {
            // InternalPascal.g:4058:62: (iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF )
            // InternalPascal.g:4059:2: iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF
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
    // InternalPascal.g:4065:1: rulemultiplicativeoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken rulemultiplicativeoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:4071:2: ( (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) )
            // InternalPascal.g:4072:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            {
            // InternalPascal.g:4072:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt45=1;
                }
                break;
            case 61:
                {
                alt45=2;
                }
                break;
            case 62:
                {
                alt45=3;
                }
                break;
            case 63:
                {
                alt45=4;
                }
                break;
            case 64:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalPascal.g:4073:3: kw= '*'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4079:3: kw= '/'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:4085:3: kw= 'div'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getDivKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:4091:3: kw= 'mod'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getModKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:4097:3: kw= 'and'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

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
    // InternalPascal.g:4106:1: entryRulesignedFactor returns [EObject current=null] : iv_rulesignedFactor= rulesignedFactor EOF ;
    public final EObject entryRulesignedFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignedFactor = null;


        try {
            // InternalPascal.g:4106:53: (iv_rulesignedFactor= rulesignedFactor EOF )
            // InternalPascal.g:4107:2: iv_rulesignedFactor= rulesignedFactor EOF
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
    // InternalPascal.g:4113:1: rulesignedFactor returns [EObject current=null] : ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) ) ;
    public final EObject rulesignedFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4119:2: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) ) )
            // InternalPascal.g:4120:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) )
            {
            // InternalPascal.g:4120:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) )
            // InternalPascal.g:4121:3: (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) )
            {
            // InternalPascal.g:4121:3: (otherlv_0= '+' | otherlv_1= '-' )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            else if ( (LA46_0==30) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // InternalPascal.g:4122:4: otherlv_0= '+'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_39); 

                    				newLeafNode(otherlv_0, grammarAccess.getSignedFactorAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4127:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_39); 

                    				newLeafNode(otherlv_1, grammarAccess.getSignedFactorAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:4132:3: ( (lv_factor_2_0= rulefactor ) )
            // InternalPascal.g:4133:4: (lv_factor_2_0= rulefactor )
            {
            // InternalPascal.g:4133:4: (lv_factor_2_0= rulefactor )
            // InternalPascal.g:4134:5: lv_factor_2_0= rulefactor
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
    // InternalPascal.g:4155:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:4155:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:4156:2: iv_rulefactor= rulefactor EOF
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
    // InternalPascal.g:4162:1: rulefactor returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' ) | ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) ) | (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) ) | ( (lv_bool_6_0= RULE_BOOL ) ) | ( (lv_functionDesignator_7_0= rulefunctionDesignator ) ) | ( (lv_variable_8_0= rulevariable ) ) ) ;
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
            // InternalPascal.g:4168:2: ( ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' ) | ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) ) | (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) ) | ( (lv_bool_6_0= RULE_BOOL ) ) | ( (lv_functionDesignator_7_0= rulefunctionDesignator ) ) | ( (lv_variable_8_0= rulevariable ) ) ) )
            // InternalPascal.g:4169:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' ) | ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) ) | (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) ) | ( (lv_bool_6_0= RULE_BOOL ) ) | ( (lv_functionDesignator_7_0= rulefunctionDesignator ) ) | ( (lv_variable_8_0= rulevariable ) ) )
            {
            // InternalPascal.g:4169:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' ) | ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) ) | (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) ) | ( (lv_bool_6_0= RULE_BOOL ) ) | ( (lv_functionDesignator_7_0= rulefunctionDesignator ) ) | ( (lv_variable_8_0= rulevariable ) ) )
            int alt47=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt47=1;
                }
                break;
            case RULE_NUM:
            case RULE_STRING_LITERAL:
            case RULE_NUM_REAL:
            case 28:
            case 66:
                {
                alt47=2;
                }
                break;
            case 65:
                {
                alt47=3;
                }
                break;
            case RULE_BOOL:
                {
                alt47=4;
                }
                break;
            case RULE_IDENT:
                {
                int LA47_5 = input.LA(2);

                if ( (LA47_5==EOF||(LA47_5>=21 && LA47_5<=23)||LA47_5==27||(LA47_5>=29 && LA47_5<=30)||LA47_5==48||LA47_5==50||(LA47_5>=53 && LA47_5<=64)) ) {
                    alt47=6;
                }
                else if ( (LA47_5==20) ) {
                    alt47=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 5, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt47=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalPascal.g:4170:3: (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' )
                    {
                    // InternalPascal.g:4170:3: (otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')' )
                    // InternalPascal.g:4171:4: otherlv_0= '(' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_39); 

                    				newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalPascal.g:4175:4: ( (lv_expression_1_0= ruleexpression ) )
                    // InternalPascal.g:4176:5: (lv_expression_1_0= ruleexpression )
                    {
                    // InternalPascal.g:4176:5: (lv_expression_1_0= ruleexpression )
                    // InternalPascal.g:4177:6: lv_expression_1_0= ruleexpression
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
                    // InternalPascal.g:4200:3: ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) )
                    {
                    // InternalPascal.g:4200:3: ( (lv_unsignedConstant_3_0= ruleunsignedConstant ) )
                    // InternalPascal.g:4201:4: (lv_unsignedConstant_3_0= ruleunsignedConstant )
                    {
                    // InternalPascal.g:4201:4: (lv_unsignedConstant_3_0= ruleunsignedConstant )
                    // InternalPascal.g:4202:5: lv_unsignedConstant_3_0= ruleunsignedConstant
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
                    // InternalPascal.g:4220:3: (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:4220:3: (otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) ) )
                    // InternalPascal.g:4221:4: otherlv_4= 'not' ( (lv_factor_5_0= rulefactor ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getNotKeyword_2_0());
                    			
                    // InternalPascal.g:4225:4: ( (lv_factor_5_0= rulefactor ) )
                    // InternalPascal.g:4226:5: (lv_factor_5_0= rulefactor )
                    {
                    // InternalPascal.g:4226:5: (lv_factor_5_0= rulefactor )
                    // InternalPascal.g:4227:6: lv_factor_5_0= rulefactor
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
                    // InternalPascal.g:4246:3: ( (lv_bool_6_0= RULE_BOOL ) )
                    {
                    // InternalPascal.g:4246:3: ( (lv_bool_6_0= RULE_BOOL ) )
                    // InternalPascal.g:4247:4: (lv_bool_6_0= RULE_BOOL )
                    {
                    // InternalPascal.g:4247:4: (lv_bool_6_0= RULE_BOOL )
                    // InternalPascal.g:4248:5: lv_bool_6_0= RULE_BOOL
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
                    // InternalPascal.g:4265:3: ( (lv_functionDesignator_7_0= rulefunctionDesignator ) )
                    {
                    // InternalPascal.g:4265:3: ( (lv_functionDesignator_7_0= rulefunctionDesignator ) )
                    // InternalPascal.g:4266:4: (lv_functionDesignator_7_0= rulefunctionDesignator )
                    {
                    // InternalPascal.g:4266:4: (lv_functionDesignator_7_0= rulefunctionDesignator )
                    // InternalPascal.g:4267:5: lv_functionDesignator_7_0= rulefunctionDesignator
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
                    // InternalPascal.g:4285:3: ( (lv_variable_8_0= rulevariable ) )
                    {
                    // InternalPascal.g:4285:3: ( (lv_variable_8_0= rulevariable ) )
                    // InternalPascal.g:4286:4: (lv_variable_8_0= rulevariable )
                    {
                    // InternalPascal.g:4286:4: (lv_variable_8_0= rulevariable )
                    // InternalPascal.g:4287:5: lv_variable_8_0= rulevariable
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
    // InternalPascal.g:4308:1: entryRuleunsignedConstant returns [EObject current=null] : iv_ruleunsignedConstant= ruleunsignedConstant EOF ;
    public final EObject entryRuleunsignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedConstant = null;


        try {
            // InternalPascal.g:4308:57: (iv_ruleunsignedConstant= ruleunsignedConstant EOF )
            // InternalPascal.g:4309:2: iv_ruleunsignedConstant= ruleunsignedConstant EOF
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
    // InternalPascal.g:4315:1: ruleunsignedConstant returns [EObject current=null] : ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) ) | ( (lv_constantChr_2_0= ruleconstantChr ) ) | ( () otherlv_4= 'nil' ) ) ;
    public final EObject ruleunsignedConstant() throws RecognitionException {
        EObject current = null;

        Token lv_string_literal_1_0=null;
        Token otherlv_4=null;
        EObject lv_unsignedNumber_0_0 = null;

        EObject lv_constantChr_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4321:2: ( ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) ) | ( (lv_constantChr_2_0= ruleconstantChr ) ) | ( () otherlv_4= 'nil' ) ) )
            // InternalPascal.g:4322:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) ) | ( (lv_constantChr_2_0= ruleconstantChr ) ) | ( () otherlv_4= 'nil' ) )
            {
            // InternalPascal.g:4322:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) ) | ( (lv_constantChr_2_0= ruleconstantChr ) ) | ( () otherlv_4= 'nil' ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case RULE_NUM:
            case RULE_NUM_REAL:
                {
                alt48=1;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt48=2;
                }
                break;
            case 28:
                {
                alt48=3;
                }
                break;
            case 66:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalPascal.g:4323:3: ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:4323:3: ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) )
                    // InternalPascal.g:4324:4: (lv_unsignedNumber_0_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:4324:4: (lv_unsignedNumber_0_0= ruleunsignedNumber )
                    // InternalPascal.g:4325:5: lv_unsignedNumber_0_0= ruleunsignedNumber
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
                    // InternalPascal.g:4343:3: ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) )
                    {
                    // InternalPascal.g:4343:3: ( (lv_string_literal_1_0= RULE_STRING_LITERAL ) )
                    // InternalPascal.g:4344:4: (lv_string_literal_1_0= RULE_STRING_LITERAL )
                    {
                    // InternalPascal.g:4344:4: (lv_string_literal_1_0= RULE_STRING_LITERAL )
                    // InternalPascal.g:4345:5: lv_string_literal_1_0= RULE_STRING_LITERAL
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
                    // InternalPascal.g:4362:3: ( (lv_constantChr_2_0= ruleconstantChr ) )
                    {
                    // InternalPascal.g:4362:3: ( (lv_constantChr_2_0= ruleconstantChr ) )
                    // InternalPascal.g:4363:4: (lv_constantChr_2_0= ruleconstantChr )
                    {
                    // InternalPascal.g:4363:4: (lv_constantChr_2_0= ruleconstantChr )
                    // InternalPascal.g:4364:5: lv_constantChr_2_0= ruleconstantChr
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
                    // InternalPascal.g:4382:3: ( () otherlv_4= 'nil' )
                    {
                    // InternalPascal.g:4382:3: ( () otherlv_4= 'nil' )
                    // InternalPascal.g:4383:4: () otherlv_4= 'nil'
                    {
                    // InternalPascal.g:4383:4: ()
                    // InternalPascal.g:4384:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnsignedConstantAccess().getUnsignedConstantAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,66,FOLLOW_2); 

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
    // InternalPascal.g:4399:1: entryRulefunctionDesignator returns [EObject current=null] : iv_rulefunctionDesignator= rulefunctionDesignator EOF ;
    public final EObject entryRulefunctionDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDesignator = null;


        try {
            // InternalPascal.g:4399:59: (iv_rulefunctionDesignator= rulefunctionDesignator EOF )
            // InternalPascal.g:4400:2: iv_rulefunctionDesignator= rulefunctionDesignator EOF
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
    // InternalPascal.g:4406:1: rulefunctionDesignator returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' ) ;
    public final EObject rulefunctionDesignator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4412:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' ) )
            // InternalPascal.g:4413:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:4413:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )
            // InternalPascal.g:4414:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')'
            {
            // InternalPascal.g:4414:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4415:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4415:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4416:5: lv_identifier_0_0= ruleidentifier
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

            otherlv_1=(Token)match(input,20,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDesignatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:4437:3: ( (lv_parameterList_2_0= ruleparameterList ) )
            // InternalPascal.g:4438:4: (lv_parameterList_2_0= ruleparameterList )
            {
            // InternalPascal.g:4438:4: (lv_parameterList_2_0= ruleparameterList )
            // InternalPascal.g:4439:5: lv_parameterList_2_0= ruleparameterList
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
    // InternalPascal.g:4464:1: entryRuleparameterList returns [EObject current=null] : iv_ruleparameterList= ruleparameterList EOF ;
    public final EObject entryRuleparameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterList = null;


        try {
            // InternalPascal.g:4464:54: (iv_ruleparameterList= ruleparameterList EOF )
            // InternalPascal.g:4465:2: iv_ruleparameterList= ruleparameterList EOF
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
    // InternalPascal.g:4471:1: ruleparameterList returns [EObject current=null] : (this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )* ) ;
    public final EObject ruleparameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_actualParameter_0 = null;

        EObject lv_actualParameter_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4477:2: ( (this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )* ) )
            // InternalPascal.g:4478:2: (this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )* )
            {
            // InternalPascal.g:4478:2: (this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )* )
            // InternalPascal.g:4479:3: this_actualParameter_0= ruleactualParameter (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )*
            {

            			newCompositeNode(grammarAccess.getParameterListAccess().getActualParameterParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_actualParameter_0=ruleactualParameter();

            state._fsp--;


            			current = this_actualParameter_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:4487:3: (otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==23) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPascal.g:4488:4: otherlv_1= ',' ( (lv_actualParameter_2_0= ruleactualParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_39); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:4492:4: ( (lv_actualParameter_2_0= ruleactualParameter ) )
            	    // InternalPascal.g:4493:5: (lv_actualParameter_2_0= ruleactualParameter )
            	    {
            	    // InternalPascal.g:4493:5: (lv_actualParameter_2_0= ruleactualParameter )
            	    // InternalPascal.g:4494:6: lv_actualParameter_2_0= ruleactualParameter
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
            	    break loop49;
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
    // InternalPascal.g:4516:1: entryRuleactualParameter returns [EObject current=null] : iv_ruleactualParameter= ruleactualParameter EOF ;
    public final EObject entryRuleactualParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactualParameter = null;


        try {
            // InternalPascal.g:4516:56: (iv_ruleactualParameter= ruleactualParameter EOF )
            // InternalPascal.g:4517:2: iv_ruleactualParameter= ruleactualParameter EOF
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
    // InternalPascal.g:4523:1: ruleactualParameter returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleactualParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4529:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:4530:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:4530:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:4531:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:4531:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:4532:4: lv_expression_0_0= ruleexpression
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
    // InternalPascal.g:4552:1: entryRulegotoStatement returns [EObject current=null] : iv_rulegotoStatement= rulegotoStatement EOF ;
    public final EObject entryRulegotoStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegotoStatement = null;


        try {
            // InternalPascal.g:4552:54: (iv_rulegotoStatement= rulegotoStatement EOF )
            // InternalPascal.g:4553:2: iv_rulegotoStatement= rulegotoStatement EOF
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
    // InternalPascal.g:4559:1: rulegotoStatement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegotoStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4565:2: ( (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) )
            // InternalPascal.g:4566:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            {
            // InternalPascal.g:4566:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            // InternalPascal.g:4567:3: otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGotoStatementAccess().getGotoKeyword_0());
            		
            // InternalPascal.g:4571:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:4572:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:4572:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:4573:5: lv_label_1_0= rulelabel
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
    // InternalPascal.g:4594:1: entryRulestructuredStatement returns [EObject current=null] : iv_rulestructuredStatement= rulestructuredStatement EOF ;
    public final EObject entryRulestructuredStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructuredStatement = null;


        try {
            // InternalPascal.g:4594:60: (iv_rulestructuredStatement= rulestructuredStatement EOF )
            // InternalPascal.g:4595:2: iv_rulestructuredStatement= rulestructuredStatement EOF
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
    // InternalPascal.g:4601:1: rulestructuredStatement returns [EObject current=null] : ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) ) ) ;
    public final EObject rulestructuredStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_compoundStatement_0_0 = null;

        EObject lv_conditionalStatement_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4607:2: ( ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) ) ) )
            // InternalPascal.g:4608:2: ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) ) )
            {
            // InternalPascal.g:4608:2: ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==68) ) {
                alt50=1;
            }
            else if ( (LA50_0==49) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalPascal.g:4609:3: ( (lv_compoundStatement_0_0= rulecompoundStatement ) )
                    {
                    // InternalPascal.g:4609:3: ( (lv_compoundStatement_0_0= rulecompoundStatement ) )
                    // InternalPascal.g:4610:4: (lv_compoundStatement_0_0= rulecompoundStatement )
                    {
                    // InternalPascal.g:4610:4: (lv_compoundStatement_0_0= rulecompoundStatement )
                    // InternalPascal.g:4611:5: lv_compoundStatement_0_0= rulecompoundStatement
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
                    // InternalPascal.g:4629:3: ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) )
                    {
                    // InternalPascal.g:4629:3: ( (lv_conditionalStatement_1_0= ruleconditionalStatement ) )
                    // InternalPascal.g:4630:4: (lv_conditionalStatement_1_0= ruleconditionalStatement )
                    {
                    // InternalPascal.g:4630:4: (lv_conditionalStatement_1_0= ruleconditionalStatement )
                    // InternalPascal.g:4631:5: lv_conditionalStatement_1_0= ruleconditionalStatement
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
    // InternalPascal.g:4652:1: entryRulecompoundStatement returns [EObject current=null] : iv_rulecompoundStatement= rulecompoundStatement EOF ;
    public final EObject entryRulecompoundStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompoundStatement = null;


        try {
            // InternalPascal.g:4652:58: (iv_rulecompoundStatement= rulecompoundStatement EOF )
            // InternalPascal.g:4653:2: iv_rulecompoundStatement= rulecompoundStatement EOF
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
    // InternalPascal.g:4659:1: rulecompoundStatement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompoundStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4665:2: ( (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:4666:2: (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:4666:2: (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end' )
            // InternalPascal.g:4667:3: otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundStatementAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:4671:3: ( (lv_statements_1_0= rulestatements ) )
            // InternalPascal.g:4672:4: (lv_statements_1_0= rulestatements )
            {
            // InternalPascal.g:4672:4: (lv_statements_1_0= rulestatements )
            // InternalPascal.g:4673:5: lv_statements_1_0= rulestatements
            {

            					newCompositeNode(grammarAccess.getCompoundStatementAccess().getStatementsStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_statements_1_0=rulestatements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundStatementRule());
            					}
            					set(
            						current,
            						"statements",
            						lv_statements_1_0,
            						"compilador.Pascal.statements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

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
    // InternalPascal.g:4698:1: entryRulestatements returns [EObject current=null] : iv_rulestatements= rulestatements EOF ;
    public final EObject entryRulestatements() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatements = null;


        try {
            // InternalPascal.g:4698:51: (iv_rulestatements= rulestatements EOF )
            // InternalPascal.g:4699:2: iv_rulestatements= rulestatements EOF
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
    // InternalPascal.g:4705:1: rulestatements returns [EObject current=null] : ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statement_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4711:2: ( ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:4712:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:4712:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            // InternalPascal.g:4713:3: ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:4713:3: ( (lv_statement_0_0= rulestatement ) )
            // InternalPascal.g:4714:4: (lv_statement_0_0= rulestatement )
            {
            // InternalPascal.g:4714:4: (lv_statement_0_0= rulestatement )
            // InternalPascal.g:4715:5: lv_statement_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getStatementStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalPascal.g:4732:3: (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==22) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:4733:4: otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_40); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:4737:4: ( (lv_statement_2_0= rulestatement ) )
            	    // InternalPascal.g:4738:5: (lv_statement_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:4738:5: (lv_statement_2_0= rulestatement )
            	    // InternalPascal.g:4739:6: lv_statement_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementsAccess().getStatementStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop51;
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
    // InternalPascal.g:4761:1: entryRuleconditionalStatement returns [EObject current=null] : iv_ruleconditionalStatement= ruleconditionalStatement EOF ;
    public final EObject entryRuleconditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditionalStatement = null;


        try {
            // InternalPascal.g:4761:61: (iv_ruleconditionalStatement= ruleconditionalStatement EOF )
            // InternalPascal.g:4762:2: iv_ruleconditionalStatement= ruleconditionalStatement EOF
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
    // InternalPascal.g:4768:1: ruleconditionalStatement returns [EObject current=null] : ( (lv_caseStatement_0_0= rulecaseStatement ) ) ;
    public final EObject ruleconditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_caseStatement_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4774:2: ( ( (lv_caseStatement_0_0= rulecaseStatement ) ) )
            // InternalPascal.g:4775:2: ( (lv_caseStatement_0_0= rulecaseStatement ) )
            {
            // InternalPascal.g:4775:2: ( (lv_caseStatement_0_0= rulecaseStatement ) )
            // InternalPascal.g:4776:3: (lv_caseStatement_0_0= rulecaseStatement )
            {
            // InternalPascal.g:4776:3: (lv_caseStatement_0_0= rulecaseStatement )
            // InternalPascal.g:4777:4: lv_caseStatement_0_0= rulecaseStatement
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
    // InternalPascal.g:4797:1: entryRulecaseStatement returns [EObject current=null] : iv_rulecaseStatement= rulecaseStatement EOF ;
    public final EObject entryRulecaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecaseStatement = null;


        try {
            // InternalPascal.g:4797:54: (iv_rulecaseStatement= rulecaseStatement EOF )
            // InternalPascal.g:4798:2: iv_rulecaseStatement= rulecaseStatement EOF
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
    // InternalPascal.g:4804:1: rulecaseStatement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end' ) ;
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
            // InternalPascal.g:4810:2: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end' ) )
            // InternalPascal.g:4811:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end' )
            {
            // InternalPascal.g:4811:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end' )
            // InternalPascal.g:4812:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_caseListElement_3_0= rulecaseListElement ) ) (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )* (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )? otherlv_9= 'end'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseStatementAccess().getCaseKeyword_0());
            		
            // InternalPascal.g:4816:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:4817:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:4817:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:4818:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getCaseStatementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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
            		
            // InternalPascal.g:4839:3: ( (lv_caseListElement_3_0= rulecaseListElement ) )
            // InternalPascal.g:4840:4: (lv_caseListElement_3_0= rulecaseListElement )
            {
            // InternalPascal.g:4840:4: (lv_caseListElement_3_0= rulecaseListElement )
            // InternalPascal.g:4841:5: lv_caseListElement_3_0= rulecaseListElement
            {

            					newCompositeNode(grammarAccess.getCaseStatementAccess().getCaseListElementCaseListElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalPascal.g:4858:3: (otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==22) ) {
                    int LA52_1 = input.LA(2);

                    if ( ((LA52_1>=RULE_IDENT && LA52_1<=RULE_NUM_REAL)||(LA52_1>=28 && LA52_1<=30)) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // InternalPascal.g:4859:4: otherlv_4= ';' ( (lv_caseListElement1_5_0= rulecaseListElement ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCaseStatementAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalPascal.g:4863:4: ( (lv_caseListElement1_5_0= rulecaseListElement ) )
            	    // InternalPascal.g:4864:5: (lv_caseListElement1_5_0= rulecaseListElement )
            	    {
            	    // InternalPascal.g:4864:5: (lv_caseListElement1_5_0= rulecaseListElement )
            	    // InternalPascal.g:4865:6: lv_caseListElement1_5_0= rulecaseListElement
            	    {

            	    						newCompositeNode(grammarAccess.getCaseStatementAccess().getCaseListElement1CaseListElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
            	    break loop52;
                }
            } while (true);

            // InternalPascal.g:4883:3: (otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==22) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPascal.g:4884:4: otherlv_6= ';' otherlv_7= 'else' ( (lv_statements_8_0= rulestatements ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getCaseStatementAccess().getSemicolonKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,69,FOLLOW_40); 

                    				newLeafNode(otherlv_7, grammarAccess.getCaseStatementAccess().getElseKeyword_5_1());
                    			
                    // InternalPascal.g:4892:4: ( (lv_statements_8_0= rulestatements ) )
                    // InternalPascal.g:4893:5: (lv_statements_8_0= rulestatements )
                    {
                    // InternalPascal.g:4893:5: (lv_statements_8_0= rulestatements )
                    // InternalPascal.g:4894:6: lv_statements_8_0= rulestatements
                    {

                    						newCompositeNode(grammarAccess.getCaseStatementAccess().getStatementsStatementsParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_32);
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
    // InternalPascal.g:4920:1: entryRulecaseListElement returns [EObject current=null] : iv_rulecaseListElement= rulecaseListElement EOF ;
    public final EObject entryRulecaseListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecaseListElement = null;


        try {
            // InternalPascal.g:4920:56: (iv_rulecaseListElement= rulecaseListElement EOF )
            // InternalPascal.g:4921:2: iv_rulecaseListElement= rulecaseListElement EOF
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
    // InternalPascal.g:4927:1: rulecaseListElement returns [EObject current=null] : ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecaseListElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constList_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4933:2: ( ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) )
            // InternalPascal.g:4934:2: ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            {
            // InternalPascal.g:4934:2: ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            // InternalPascal.g:4935:3: ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) )
            {
            // InternalPascal.g:4935:3: ( (lv_constList_0_0= ruleconstList ) )
            // InternalPascal.g:4936:4: (lv_constList_0_0= ruleconstList )
            {
            // InternalPascal.g:4936:4: (lv_constList_0_0= ruleconstList )
            // InternalPascal.g:4937:5: lv_constList_0_0= ruleconstList
            {

            					newCompositeNode(grammarAccess.getCaseListElementAccess().getConstListConstListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_1=(Token)match(input,34,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseListElementAccess().getColonKeyword_1());
            		
            // InternalPascal.g:4958:3: ( (lv_statement_2_0= rulestatement ) )
            // InternalPascal.g:4959:4: (lv_statement_2_0= rulestatement )
            {
            // InternalPascal.g:4959:4: (lv_statement_2_0= rulestatement )
            // InternalPascal.g:4960:5: lv_statement_2_0= rulestatement
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\4\7\uffff";
    static final String dfa_3s = "\1\36\2\10\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\3\1\4\1\6\1\7\1\5\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\3\1\5\1\7\1\3\23\uffff\1\6\1\1\1\2",
            "\1\10\1\11\2\uffff\1\11",
            "\1\10\1\11\2\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "794:2: ( ( ( (lv_sign_0_0= rulesign ) ) ( (lv_unsignedNumber_1_0= ruleunsignedNumber ) ) ) | ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) | ( (lv_identifier_3_0= ruleidentifier ) ) | ( (lv_string_4_0= RULE_STRING_LITERAL ) ) | ( ( (lv_sign_5_0= rulesign ) ) ( (lv_identifier_6_0= ruleidentifier ) ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | ( (lv_bool_8_0= RULE_BOOL ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001B87020000L,0x0000000000000010L});
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000700001F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000097F2701001F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003E000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001A00000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000097E0701001F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00100000701001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0012001BF71201F0L,0x000000000000001EL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x07E0000008000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000060000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0xF000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});

}