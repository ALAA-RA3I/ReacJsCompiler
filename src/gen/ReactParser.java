// Generated from C:/Users/ASUS/Desktop/compiler functional/Final/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, PATH=3, FUNCTION=4, CONST=5, LET=6, VAR=7, CONSOLELOG=8, 
		EQ=9, STYLE=10, SRC=11, REQUIRE=12, EXPORT=13, SEMICOLON=14, O_SQUARE_BRACKET=15, 
		C_SQUARE_BRACKET=16, O_CARLY=17, C_CARLY=18, DOUBLE_O_CARLY=19, DOUBLE_C_CARLY=20, 
		O_BRACKET=21, C_BRACKET=22, RETURN=23, COLON=24, POINT=25, ARROW=26, ARROW_FUNCTION=27, 
		COMMA=28, NUMBER=29, IDENTIFIER=30, STRING=31, WS=32, NEW_LINE=33, MULTI_LINE_COMMENT=34, 
		COMMENT=35, SLASH=36, JSX_TAG=37, CLOSE_TAG=38, JSX_CLOSE_TAG=39, ATTRIBUTE=40;
	public static final int
		RULE_program = 0, RULE_importStatment = 1, RULE_exportStatement = 2, RULE_functionalDelaration = 3, 
		RULE_functionalbody = 4, RULE_variableDeclaration = 5, RULE_expression = 6, 
		RULE_hooks = 7, RULE_state = 8, RULE_ref = 9, RULE_effect = 10, RULE_stateFields = 11, 
		RULE_handlerEvent = 12, RULE_parameters = 13, RULE_eventBody = 14, RULE_jsxElement = 15, 
		RULE_jsxSelfCloseTag = 16, RULE_jsxTag = 17, RULE_jsxAttributes = 18, 
		RULE_jsxContent = 19, RULE_jsxAttribute = 20, RULE_jsxstyleAttribute = 21, 
		RULE_jsxsrcAttribute = 22, RULE_attributeValue = 23, RULE_styleValue = 24, 
		RULE_srcValue = 25, RULE_jsFunction = 26, RULE_functionBody = 27, RULE_arguments = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatment", "exportStatement", "functionalDelaration", 
			"functionalbody", "variableDeclaration", "expression", "hooks", "state", 
			"ref", "effect", "stateFields", "handlerEvent", "parameters", "eventBody", 
			"jsxElement", "jsxSelfCloseTag", "jsxTag", "jsxAttributes", "jsxContent", 
			"jsxAttribute", "jsxstyleAttribute", "jsxsrcAttribute", "attributeValue", 
			"styleValue", "srcValue", "jsFunction", "functionBody", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", null, "'function'", "'const'", "'let'", "'var'", 
			"'console.log'", "'='", "'style='", "'src='", "'require'", "'export default'", 
			"';'", "'['", "']'", "'{'", "'}'", "'{{'", "'}}'", "'('", "')'", "'return'", 
			"':'", "'.'", "'=>'", "'()=> '", "','", null, null, null, null, null, 
			null, "'//'", "'/'", null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "PATH", "FUNCTION", "CONST", "LET", "VAR", "CONSOLELOG", 
			"EQ", "STYLE", "SRC", "REQUIRE", "EXPORT", "SEMICOLON", "O_SQUARE_BRACKET", 
			"C_SQUARE_BRACKET", "O_CARLY", "C_CARLY", "DOUBLE_O_CARLY", "DOUBLE_C_CARLY", 
			"O_BRACKET", "C_BRACKET", "RETURN", "COLON", "POINT", "ARROW", "ARROW_FUNCTION", 
			"COMMA", "NUMBER", "IDENTIFIER", "STRING", "WS", "NEW_LINE", "MULTI_LINE_COMMENT", 
			"COMMENT", "SLASH", "JSX_TAG", "CLOSE_TAG", "JSX_CLOSE_TAG", "ATTRIBUTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public FunctionalDelarationContext functionalDelaration() {
			return getRuleContext(FunctionalDelarationContext.class,0);
		}
		public List<ImportStatmentContext> importStatment() {
			return getRuleContexts(ImportStatmentContext.class);
		}
		public ImportStatmentContext importStatment(int i) {
			return getRuleContext(ImportStatmentContext.class,i);
		}
		public List<ExportStatementContext> exportStatement() {
			return getRuleContexts(ExportStatementContext.class);
		}
		public ExportStatementContext exportStatement(int i) {
			return getRuleContext(ExportStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				importStatment();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(63);
			functionalDelaration();
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				exportStatement();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXPORT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatmentContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode PATH() { return getToken(ReactParser.PATH, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode O_CARLY() { return getToken(ReactParser.O_CARLY, 0); }
		public TerminalNode C_CARLY() { return getToken(ReactParser.C_CARLY, 0); }
		public ImportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatmentContext importStatment() throws RecognitionException {
		ImportStatmentContext _localctx = new ImportStatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IMPORT);
			setState(70);
			match(IDENTIFIER);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(71);
				match(COMMA);
				setState(72);
				match(O_CARLY);
				setState(73);
				match(IDENTIFIER);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(74);
					match(COMMA);
					setState(75);
					match(IDENTIFIER);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(C_CARLY);
				}
			}

			setState(84);
			match(FROM);
			setState(85);
			match(PATH);
			setState(86);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(EXPORT);
			setState(89);
			match(IDENTIFIER);
			setState(90);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionalDelarationContext extends ParserRuleContext {
		public TerminalNode O_CARLY() { return getToken(ReactParser.O_CARLY, 0); }
		public FunctionalbodyContext functionalbody() {
			return getRuleContext(FunctionalbodyContext.class,0);
		}
		public TerminalNode C_CARLY() { return getToken(ReactParser.C_CARLY, 0); }
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode EQ() { return getToken(ReactParser.EQ, 0); }
		public TerminalNode ARROW_FUNCTION() { return getToken(ReactParser.ARROW_FUNCTION, 0); }
		public FunctionalDelarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalDelaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionalDelaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionalDelaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionalDelaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalDelarationContext functionalDelaration() throws RecognitionException {
		FunctionalDelarationContext _localctx = new FunctionalDelarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionalDelaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(92);
				match(FUNCTION);
				setState(93);
				match(IDENTIFIER);
				setState(94);
				match(O_BRACKET);
				setState(95);
				match(C_BRACKET);
				}
				break;
			case CONST:
				{
				setState(96);
				match(CONST);
				setState(97);
				match(IDENTIFIER);
				setState(98);
				match(EQ);
				setState(99);
				match(ARROW_FUNCTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			match(O_CARLY);
			setState(103);
			functionalbody();
			setState(104);
			match(C_CARLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionalbodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public List<HandlerEventContext> handlerEvent() {
			return getRuleContexts(HandlerEventContext.class);
		}
		public HandlerEventContext handlerEvent(int i) {
			return getRuleContext(HandlerEventContext.class,i);
		}
		public FunctionalbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionalbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionalbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionalbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalbodyContext functionalbody() throws RecognitionException {
		FunctionalbodyContext _localctx = new FunctionalbodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionalbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073742048L) != 0)) {
				{
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(106);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(107);
					hooks();
					}
					break;
				case 3:
					{
					setState(108);
					handlerEvent();
					}
					break;
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(RETURN);
			setState(115);
			match(O_BRACKET);
			setState(116);
			jsxElement();
			setState(117);
			match(C_BRACKET);
			setState(118);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode EQ() { return getToken(ReactParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			match(IDENTIFIER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(122);
				match(EQ);
				setState(123);
				expression();
				}
			}

			setState(126);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HooksContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public EffectContext effect() {
			return getRuleContext(EffectContext.class,0);
		}
		public HooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HooksContext hooks() throws RecognitionException {
		HooksContext _localctx = new HooksContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hooks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130);
				state();
				}
				break;
			case 2:
				{
				setState(131);
				ref();
				}
				break;
			case 3:
				{
				setState(132);
				effect();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode O_SQUARE_BRACKET() { return getToken(ReactParser.O_SQUARE_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode C_SQUARE_BRACKET() { return getToken(ReactParser.C_SQUARE_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(ReactParser.EQ, 0); }
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public StateFieldsContext stateFields() {
			return getRuleContext(StateFieldsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode O_CARLY() { return getToken(ReactParser.O_CARLY, 0); }
		public TerminalNode C_CARLY() { return getToken(ReactParser.C_CARLY, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CONST);
			setState(136);
			match(O_SQUARE_BRACKET);
			setState(137);
			match(IDENTIFIER);
			setState(138);
			match(COMMA);
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(C_SQUARE_BRACKET);
			setState(141);
			match(EQ);
			setState(142);
			match(IDENTIFIER);
			setState(143);
			match(O_BRACKET);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==O_CARLY) {
				{
				setState(144);
				match(O_CARLY);
				}
			}

			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(147);
				stateFields();
				}
				break;
			case 2:
				{
				setState(148);
				expression();
				}
				break;
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C_CARLY) {
				{
				setState(151);
				match(C_CARLY);
				}
			}

			setState(154);
			match(C_BRACKET);
			setState(155);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RefContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode EQ() { return getToken(ReactParser.EQ, 0); }
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(CONST);
			setState(158);
			match(IDENTIFIER);
			setState(159);
			match(EQ);
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(O_BRACKET);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(162);
				parameters();
				}
			}

			setState(165);
			match(C_BRACKET);
			setState(166);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> O_BRACKET() { return getTokens(ReactParser.O_BRACKET); }
		public TerminalNode O_BRACKET(int i) {
			return getToken(ReactParser.O_BRACKET, i);
		}
		public TerminalNode ARROW_FUNCTION() { return getToken(ReactParser.ARROW_FUNCTION, 0); }
		public TerminalNode O_CARLY() { return getToken(ReactParser.O_CARLY, 0); }
		public TerminalNode CONSOLELOG() { return getToken(ReactParser.CONSOLELOG, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public List<TerminalNode> C_BRACKET() { return getTokens(ReactParser.C_BRACKET); }
		public TerminalNode C_BRACKET(int i) {
			return getToken(ReactParser.C_BRACKET, i);
		}
		public TerminalNode C_CARLY() { return getToken(ReactParser.C_CARLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode O_SQUARE_BRACKET() { return getToken(ReactParser.O_SQUARE_BRACKET, 0); }
		public TerminalNode C_SQUARE_BRACKET() { return getToken(ReactParser.C_SQUARE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENTIFIER);
			setState(169);
			match(O_BRACKET);
			setState(170);
			match(ARROW_FUNCTION);
			setState(171);
			match(O_CARLY);
			setState(172);
			match(CONSOLELOG);
			setState(173);
			match(O_BRACKET);
			setState(174);
			match(STRING);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(175);
				match(COMMA);
				setState(176);
				match(IDENTIFIER);
				}
			}

			setState(179);
			match(C_BRACKET);
			setState(180);
			match(C_CARLY);
			setState(181);
			match(COMMA);
			setState(182);
			match(O_SQUARE_BRACKET);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(183);
				match(IDENTIFIER);
				}
			}

			setState(186);
			match(C_SQUARE_BRACKET);
			setState(187);
			match(C_BRACKET);
			setState(188);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateFieldsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ReactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReactParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public StateFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStateFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStateFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStateFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateFieldsContext stateFields() throws RecognitionException {
		StateFieldsContext _localctx = new StateFieldsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stateFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IDENTIFIER);
			setState(191);
			match(COLON);
			setState(192);
			match(STRING);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				match(IDENTIFIER);
				setState(195);
				match(COLON);
				setState(196);
				match(STRING);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HandlerEventContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(ReactParser.EQ, 0); }
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public EventBodyContext eventBody() {
			return getRuleContext(EventBodyContext.class,0);
		}
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public HandlerEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHandlerEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHandlerEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHandlerEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerEventContext handlerEvent() throws RecognitionException {
		HandlerEventContext _localctx = new HandlerEventContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_handlerEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(202);
				match(CONST);
				}
			}

			setState(205);
			match(IDENTIFIER);
			setState(206);
			match(EQ);
			setState(207);
			match(O_BRACKET);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(208);
				parameters();
				}
			}

			setState(211);
			match(C_BRACKET);
			setState(212);
			match(ARROW);
			setState(213);
			eventBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENTIFIER);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				match(IDENTIFIER);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventBodyContext extends ParserRuleContext {
		public List<TerminalNode> O_CARLY() { return getTokens(ReactParser.O_CARLY); }
		public TerminalNode O_CARLY(int i) {
			return getToken(ReactParser.O_CARLY, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactParser.SEMICOLON, 0); }
		public List<TerminalNode> C_CARLY() { return getTokens(ReactParser.C_CARLY); }
		public TerminalNode C_CARLY(int i) {
			return getToken(ReactParser.C_CARLY, i);
		}
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public EventBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEventBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEventBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEventBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBodyContext eventBody() throws RecognitionException {
		EventBodyContext _localctx = new EventBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eventBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(O_CARLY);
			setState(224);
			match(IDENTIFIER);
			setState(225);
			match(O_BRACKET);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==O_CARLY) {
				{
				setState(226);
				match(O_CARLY);
				}
			}

			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				{
				setState(229);
				match(IDENTIFIER);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(230);
					match(COMMA);
					setState(231);
					match(IDENTIFIER);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case STRING:
				{
				setState(237);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C_CARLY) {
				{
				setState(240);
				match(C_CARLY);
				}
			}

			setState(243);
			match(C_BRACKET);
			setState(244);
			match(SEMICOLON);
			setState(245);
			match(C_CARLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public JsxTagContext jsxTag() {
			return getRuleContext(JsxTagContext.class,0);
		}
		public JsxSelfCloseTagContext jsxSelfCloseTag() {
			return getRuleContext(JsxSelfCloseTagContext.class,0);
		}
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jsxElement);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				jsxTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				jsxSelfCloseTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxSelfCloseTagContext extends ParserRuleContext {
		public TerminalNode JSX_TAG() { return getToken(ReactParser.JSX_TAG, 0); }
		public TerminalNode SLASH() { return getToken(ReactParser.SLASH, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ReactParser.CLOSE_TAG, 0); }
		public List<JsxAttributesContext> jsxAttributes() {
			return getRuleContexts(JsxAttributesContext.class);
		}
		public JsxAttributesContext jsxAttributes(int i) {
			return getRuleContext(JsxAttributesContext.class,i);
		}
		public JsxSelfCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSelfCloseTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSelfCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSelfCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSelfCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSelfCloseTagContext jsxSelfCloseTag() throws RecognitionException {
		JsxSelfCloseTagContext _localctx = new JsxSelfCloseTagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jsxSelfCloseTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(JSX_TAG);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511630848L) != 0)) {
				{
				{
				setState(252);
				jsxAttributes();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(SLASH);
			setState(259);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxTagContext extends ParserRuleContext {
		public TerminalNode JSX_TAG() { return getToken(ReactParser.JSX_TAG, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ReactParser.CLOSE_TAG, 0); }
		public TerminalNode JSX_CLOSE_TAG() { return getToken(ReactParser.JSX_CLOSE_TAG, 0); }
		public List<JsxAttributesContext> jsxAttributes() {
			return getRuleContexts(JsxAttributesContext.class);
		}
		public JsxAttributesContext jsxAttributes(int i) {
			return getRuleContext(JsxAttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public JsxTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxTagContext jsxTag() throws RecognitionException {
		JsxTagContext _localctx = new JsxTagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jsxTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(JSX_TAG);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511630848L) != 0)) {
				{
				{
				setState(262);
				jsxAttributes();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(CLOSE_TAG);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141197180928L) != 0)) {
				{
				{
				setState(269);
				jsxContent();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(JSX_CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributesContext extends ParserRuleContext {
		public JsxAttributeContext jsxAttribute() {
			return getRuleContext(JsxAttributeContext.class,0);
		}
		public JsxstyleAttributeContext jsxstyleAttribute() {
			return getRuleContext(JsxstyleAttributeContext.class,0);
		}
		public JsxsrcAttributeContext jsxsrcAttribute() {
			return getRuleContext(JsxsrcAttributeContext.class,0);
		}
		public JsxAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributesContext jsxAttributes() throws RecognitionException {
		JsxAttributesContext _localctx = new JsxAttributesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jsxAttributes);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTRIBUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				jsxAttribute();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				jsxstyleAttribute();
				}
				break;
			case SRC:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				jsxsrcAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxContentContext extends ParserRuleContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode O_CARLY() { return getToken(ReactParser.O_CARLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode C_CARLY() { return getToken(ReactParser.C_CARLY, 0); }
		public TerminalNode POINT() { return getToken(ReactParser.POINT, 0); }
		public JsxContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxContentContext jsxContent() throws RecognitionException {
		JsxContentContext _localctx = new JsxContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jsxContent);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				jsxElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(O_CARLY);
				setState(285);
				match(IDENTIFIER);
				setState(286);
				match(C_CARLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(O_CARLY);
				setState(288);
				match(IDENTIFIER);
				setState(289);
				match(POINT);
				setState(290);
				match(IDENTIFIER);
				setState(291);
				match(C_CARLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(ReactParser.ATTRIBUTE, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public JsxAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeContext jsxAttribute() throws RecognitionException {
		JsxAttributeContext _localctx = new JsxAttributeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jsxAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(294);
			match(ATTRIBUTE);
			setState(295);
			attributeValue();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxstyleAttributeContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(ReactParser.STYLE, 0); }
		public StyleValueContext styleValue() {
			return getRuleContext(StyleValueContext.class,0);
		}
		public JsxstyleAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxstyleAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxstyleAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxstyleAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxstyleAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxstyleAttributeContext jsxstyleAttribute() throws RecognitionException {
		JsxstyleAttributeContext _localctx = new JsxstyleAttributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jsxstyleAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297);
			match(STYLE);
			setState(298);
			styleValue();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxsrcAttributeContext extends ParserRuleContext {
		public TerminalNode SRC() { return getToken(ReactParser.SRC, 0); }
		public SrcValueContext srcValue() {
			return getRuleContext(SrcValueContext.class,0);
		}
		public JsxsrcAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxsrcAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxsrcAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxsrcAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxsrcAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxsrcAttributeContext jsxsrcAttribute() throws RecognitionException {
		JsxsrcAttributeContext _localctx = new JsxsrcAttributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jsxsrcAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			match(SRC);
			setState(301);
			srcValue();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public JsFunctionContext jsFunction() {
			return getRuleContext(JsFunctionContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributeValue);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(STRING);
				}
				break;
			case O_CARLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				jsFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleValueContext extends ParserRuleContext {
		public TerminalNode DOUBLE_O_CARLY() { return getToken(ReactParser.DOUBLE_O_CARLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public TerminalNode DOUBLE_C_CARLY() { return getToken(ReactParser.DOUBLE_C_CARLY, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ReactParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReactParser.NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ReactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReactParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public StyleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleValueContext styleValue() throws RecognitionException {
		StyleValueContext _localctx = new StyleValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_styleValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(DOUBLE_O_CARLY);
			setState(308);
			match(IDENTIFIER);
			setState(309);
			match(COLON);
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(311);
				match(COMMA);
				setState(312);
				match(IDENTIFIER);
				setState(313);
				match(COLON);
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(DOUBLE_C_CARLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SrcValueContext extends ParserRuleContext {
		public TerminalNode O_CARLY() { return getToken(ReactParser.O_CARLY, 0); }
		public TerminalNode REQUIRE() { return getToken(ReactParser.REQUIRE, 0); }
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public TerminalNode C_CARLY() { return getToken(ReactParser.C_CARLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode POINT() { return getToken(ReactParser.POINT, 0); }
		public SrcValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srcValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSrcValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSrcValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSrcValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcValueContext srcValue() throws RecognitionException {
		SrcValueContext _localctx = new SrcValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_srcValue);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(O_CARLY);
				setState(323);
				match(REQUIRE);
				setState(324);
				match(O_BRACKET);
				setState(325);
				match(STRING);
				setState(326);
				match(C_BRACKET);
				setState(327);
				match(C_CARLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(O_CARLY);
				setState(329);
				match(IDENTIFIER);
				setState(330);
				match(POINT);
				setState(331);
				match(IDENTIFIER);
				setState(332);
				match(C_CARLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsFunctionContext extends ParserRuleContext {
		public TerminalNode O_CARLY() { return getToken(ReactParser.O_CARLY, 0); }
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode C_CARLY() { return getToken(ReactParser.C_CARLY, 0); }
		public JsFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsFunctionContext jsFunction() throws RecognitionException {
		JsFunctionContext _localctx = new JsFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jsFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(O_CARLY);
			setState(336);
			match(O_BRACKET);
			setState(337);
			match(C_BRACKET);
			setState(338);
			match(ARROW);
			setState(339);
			functionBody();
			setState(340);
			match(C_CARLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode O_BRACKET() { return getToken(ReactParser.O_BRACKET, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(ReactParser.C_BRACKET, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(IDENTIFIER);
			setState(343);
			match(O_BRACKET);
			setState(344);
			arguments();
			setState(345);
			match(C_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(ReactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReactParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(STRING);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				match(STRING);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u0164\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0004\u0000<\b\u0000\u000b\u0000"+
		"\f\u0000=\u0001\u0000\u0001\u0000\u0004\u0000B\b\u0000\u000b\u0000\f\u0000"+
		"C\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001M\b\u0001\n\u0001\f\u0001P\t\u0001\u0001\u0001"+
		"\u0003\u0001S\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003e\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004n\b\u0004\n\u0004\f\u0004"+
		"q\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"}\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0086\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0092"+
		"\b\b\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\b\u0003\b\u0099\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00a4\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b2\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00b9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00c6\b\u000b\n\u000b\f\u000b\u00c9\t\u000b\u0001\f"+
		"\u0003\f\u00cc\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d2\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00db\b\r\n"+
		"\r\f\r\u00de\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00e4\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00e9"+
		"\b\u000e\n\u000e\f\u000e\u00ec\t\u000e\u0001\u000e\u0003\u000e\u00ef\b"+
		"\u000e\u0001\u000e\u0003\u000e\u00f2\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00fa\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00fe\b\u0010\n\u0010\f\u0010\u0101\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0108\b\u0011\n\u0011\f\u0011\u010b\t\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u010f\b\u0011\n\u0011\f\u0011\u0112\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0119\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0125\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0132\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u013c\b\u0018\n\u0018\f\u0018\u013f"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u014e\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u015f\b\u001c\n\u001c\f\u001c\u0162\t\u001c\u0001\u001c"+
		"\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0003\u0001\u0000\u0005"+
		"\u0007\u0001\u0000\u001d\u001f\u0002\u0000\u001d\u001d\u001f\u001f\u016c"+
		"\u0000;\u0001\u0000\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004X"+
		"\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bo\u0001\u0000"+
		"\u0000\u0000\nx\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000\u0000"+
		"\u000e\u0085\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000\u0000\u0000"+
		"\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00a8\u0001\u0000\u0000\u0000"+
		"\u0016\u00be\u0001\u0000\u0000\u0000\u0018\u00cb\u0001\u0000\u0000\u0000"+
		"\u001a\u00d7\u0001\u0000\u0000\u0000\u001c\u00df\u0001\u0000\u0000\u0000"+
		"\u001e\u00f9\u0001\u0000\u0000\u0000 \u00fb\u0001\u0000\u0000\u0000\""+
		"\u0105\u0001\u0000\u0000\u0000$\u0118\u0001\u0000\u0000\u0000&\u0124\u0001"+
		"\u0000\u0000\u0000(\u0126\u0001\u0000\u0000\u0000*\u0129\u0001\u0000\u0000"+
		"\u0000,\u012c\u0001\u0000\u0000\u0000.\u0131\u0001\u0000\u0000\u00000"+
		"\u0133\u0001\u0000\u0000\u00002\u014d\u0001\u0000\u0000\u00004\u014f\u0001"+
		"\u0000\u0000\u00006\u0156\u0001\u0000\u0000\u00008\u015b\u0001\u0000\u0000"+
		"\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?A\u0003\u0006\u0003\u0000@B\u0003\u0004\u0002\u0000"+
		"A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000D\u0001\u0001\u0000\u0000\u0000EF\u0005"+
		"\u0001\u0000\u0000FR\u0005\u001e\u0000\u0000GH\u0005\u001c\u0000\u0000"+
		"HI\u0005\u0011\u0000\u0000IN\u0005\u001e\u0000\u0000JK\u0005\u001c\u0000"+
		"\u0000KM\u0005\u001e\u0000\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0005\u0012\u0000\u0000"+
		"RG\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0002\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u0005\u000e"+
		"\u0000\u0000W\u0003\u0001\u0000\u0000\u0000XY\u0005\r\u0000\u0000YZ\u0005"+
		"\u001e\u0000\u0000Z[\u0005\u000e\u0000\u0000[\u0005\u0001\u0000\u0000"+
		"\u0000\\]\u0005\u0004\u0000\u0000]^\u0005\u001e\u0000\u0000^_\u0005\u0015"+
		"\u0000\u0000_e\u0005\u0016\u0000\u0000`a\u0005\u0005\u0000\u0000ab\u0005"+
		"\u001e\u0000\u0000bc\u0005\t\u0000\u0000ce\u0005\u001b\u0000\u0000d\\"+
		"\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0005\u0011\u0000\u0000gh\u0003\b\u0004\u0000hi\u0005\u0012\u0000"+
		"\u0000i\u0007\u0001\u0000\u0000\u0000jn\u0003\n\u0005\u0000kn\u0003\u000e"+
		"\u0007\u0000ln\u0003\u0018\f\u0000mj\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rs\u0005\u0017\u0000\u0000st\u0005\u0015\u0000"+
		"\u0000tu\u0003\u001e\u000f\u0000uv\u0005\u0016\u0000\u0000vw\u0005\u000e"+
		"\u0000\u0000w\t\u0001\u0000\u0000\u0000xy\u0007\u0000\u0000\u0000y|\u0005"+
		"\u001e\u0000\u0000z{\u0005\t\u0000\u0000{}\u0003\f\u0006\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u000e\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0007\u0001\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082\u0086"+
		"\u0003\u0010\b\u0000\u0083\u0086\u0003\u0012\t\u0000\u0084\u0086\u0003"+
		"\u0014\n\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u000f\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089\u0005\u000f"+
		"\u0000\u0000\u0089\u008a\u0005\u001e\u0000\u0000\u008a\u008b\u0005\u001c"+
		"\u0000\u0000\u008b\u008c\u0005\u001e\u0000\u0000\u008c\u008d\u0005\u0010"+
		"\u0000\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u008f\u0005\u001e\u0000"+
		"\u0000\u008f\u0091\u0005\u0015\u0000\u0000\u0090\u0092\u0005\u0011\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0096\u0003\u0016\u000b"+
		"\u0000\u0094\u0096\u0003\f\u0006\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0005\u0012\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005\u0016\u0000\u0000\u009b\u009c\u0005\u000e\u0000\u0000"+
		"\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0005\u0000\u0000"+
		"\u009e\u009f\u0005\u001e\u0000\u0000\u009f\u00a0\u0005\t\u0000\u0000\u00a0"+
		"\u00a1\u0005\u001e\u0000\u0000\u00a1\u00a3\u0005\u0015\u0000\u0000\u00a2"+
		"\u00a4\u0003\u001a\r\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005\u0016\u0000\u0000\u00a6\u00a7\u0005\u000e\u0000\u0000\u00a7\u0013"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u001e\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0015\u0000\u0000\u00aa\u00ab\u0005\u001b\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0011\u0000\u0000\u00ac\u00ad\u0005\b\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0015\u0000\u0000\u00ae\u00b1\u0005\u001f\u0000\u0000\u00af\u00b0\u0005"+
		"\u001c\u0000\u0000\u00b0\u00b2\u0005\u001e\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u0016\u0000\u0000\u00b4\u00b5\u0005"+
		"\u0012\u0000\u0000\u00b5\u00b6\u0005\u001c\u0000\u0000\u00b6\u00b8\u0005"+
		"\u000f\u0000\u0000\u00b7\u00b9\u0005\u001e\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005\u0010\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0016\u0000\u0000\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd\u0015\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\u001e\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0018\u0000\u0000\u00c0\u00c7\u0005\u001f\u0000\u0000\u00c1\u00c2\u0005"+
		"\u001c\u0000\u0000\u00c2\u00c3\u0005\u001e\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0018\u0000\u0000\u00c4\u00c6\u0005\u001f\u0000\u0000\u00c5\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u0017\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005"+
		"\u0005\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"\u001e\u0000\u0000\u00ce\u00cf\u0005\t\u0000\u0000\u00cf\u00d1\u0005\u0015"+
		"\u0000\u0000\u00d0\u00d2\u0003\u001a\r\u0000\u00d1\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0016\u0000\u0000\u00d4\u00d5\u0005\u001a\u0000"+
		"\u0000\u00d5\u00d6\u0003\u001c\u000e\u0000\u00d6\u0019\u0001\u0000\u0000"+
		"\u0000\u00d7\u00dc\u0005\u001e\u0000\u0000\u00d8\u00d9\u0005\u001c\u0000"+
		"\u0000\u00d9\u00db\u0005\u001e\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u001b\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0011\u0000"+
		"\u0000\u00e0\u00e1\u0005\u001e\u0000\u0000\u00e1\u00e3\u0005\u0015\u0000"+
		"\u0000\u00e2\u00e4\u0005\u0011\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00ee\u0001\u0000\u0000"+
		"\u0000\u00e5\u00ea\u0005\u001e\u0000\u0000\u00e6\u00e7\u0005\u001c\u0000"+
		"\u0000\u00e7\u00e9\u0005\u001e\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005\u001f\u0000"+
		"\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00f2\u0005\u0012\u0000"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0016\u0000"+
		"\u0000\u00f4\u00f5\u0005\u000e\u0000\u0000\u00f5\u00f6\u0005\u0012\u0000"+
		"\u0000\u00f6\u001d\u0001\u0000\u0000\u0000\u00f7\u00fa\u0003\"\u0011\u0000"+
		"\u00f8\u00fa\u0003 \u0010\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u001f\u0001\u0000\u0000\u0000\u00fb"+
		"\u00ff\u0005%\u0000\u0000\u00fc\u00fe\u0003$\u0012\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005"+
		"$\u0000\u0000\u0103\u0104\u0005&\u0000\u0000\u0104!\u0001\u0000\u0000"+
		"\u0000\u0105\u0109\u0005%\u0000\u0000\u0106\u0108\u0003$\u0012\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c"+
		"\u0110\u0005&\u0000\u0000\u010d\u010f\u0003&\u0013\u0000\u010e\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005"+
		"\'\u0000\u0000\u0114#\u0001\u0000\u0000\u0000\u0115\u0119\u0003(\u0014"+
		"\u0000\u0116\u0119\u0003*\u0015\u0000\u0117\u0119\u0003,\u0016\u0000\u0118"+
		"\u0115\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0117\u0001\u0000\u0000\u0000\u0119%\u0001\u0000\u0000\u0000\u011a\u0125"+
		"\u0003\u001e\u000f\u0000\u011b\u0125\u0003\f\u0006\u0000\u011c\u011d\u0005"+
		"\u0011\u0000\u0000\u011d\u011e\u0005\u001e\u0000\u0000\u011e\u0125\u0005"+
		"\u0012\u0000\u0000\u011f\u0120\u0005\u0011\u0000\u0000\u0120\u0121\u0005"+
		"\u001e\u0000\u0000\u0121\u0122\u0005\u0019\u0000\u0000\u0122\u0123\u0005"+
		"\u001e\u0000\u0000\u0123\u0125\u0005\u0012\u0000\u0000\u0124\u011a\u0001"+
		"\u0000\u0000\u0000\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011c\u0001"+
		"\u0000\u0000\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0125\'\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005(\u0000\u0000\u0127\u0128\u0003.\u0017\u0000"+
		"\u0128)\u0001\u0000\u0000\u0000\u0129\u012a\u0005\n\u0000\u0000\u012a"+
		"\u012b\u00030\u0018\u0000\u012b+\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\u000b\u0000\u0000\u012d\u012e\u00032\u0019\u0000\u012e-\u0001\u0000\u0000"+
		"\u0000\u012f\u0132\u0005\u001f\u0000\u0000\u0130\u0132\u00034\u001a\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000"+
		"\u0132/\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0013\u0000\u0000\u0134"+
		"\u0135\u0005\u001e\u0000\u0000\u0135\u0136\u0005\u0018\u0000\u0000\u0136"+
		"\u013d\u0007\u0002\u0000\u0000\u0137\u0138\u0005\u001c\u0000\u0000\u0138"+
		"\u0139\u0005\u001e\u0000\u0000\u0139\u013a\u0005\u0018\u0000\u0000\u013a"+
		"\u013c\u0007\u0002\u0000\u0000\u013b\u0137\u0001\u0000\u0000\u0000\u013c"+
		"\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0014\u0000\u0000\u0141"+
		"1\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0011\u0000\u0000\u0143\u0144"+
		"\u0005\f\u0000\u0000\u0144\u0145\u0005\u0015\u0000\u0000\u0145\u0146\u0005"+
		"\u001f\u0000\u0000\u0146\u0147\u0005\u0016\u0000\u0000\u0147\u014e\u0005"+
		"\u0012\u0000\u0000\u0148\u0149\u0005\u0011\u0000\u0000\u0149\u014a\u0005"+
		"\u001e\u0000\u0000\u014a\u014b\u0005\u0019\u0000\u0000\u014b\u014c\u0005"+
		"\u001e\u0000\u0000\u014c\u014e\u0005\u0012\u0000\u0000\u014d\u0142\u0001"+
		"\u0000\u0000\u0000\u014d\u0148\u0001\u0000\u0000\u0000\u014e3\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0005\u0011\u0000\u0000\u0150\u0151\u0005\u0015"+
		"\u0000\u0000\u0151\u0152\u0005\u0016\u0000\u0000\u0152\u0153\u0005\u001a"+
		"\u0000\u0000\u0153\u0154\u00036\u001b\u0000\u0154\u0155\u0005\u0012\u0000"+
		"\u0000\u01555\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u001e\u0000\u0000"+
		"\u0157\u0158\u0005\u0015\u0000\u0000\u0158\u0159\u00038\u001c\u0000\u0159"+
		"\u015a\u0005\u0016\u0000\u0000\u015a7\u0001\u0000\u0000\u0000\u015b\u0160"+
		"\u0005\u001f\u0000\u0000\u015c\u015d\u0005\u001c\u0000\u0000\u015d\u015f"+
		"\u0005\u001f\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162"+
		"\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u01619\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000!=CNRdmo|\u0085\u0091\u0095\u0098\u00a3\u00b1\u00b8"+
		"\u00c7\u00cb\u00d1\u00dc\u00e3\u00ea\u00ee\u00f1\u00f9\u00ff\u0109\u0110"+
		"\u0118\u0124\u0131\u013d\u014d\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}