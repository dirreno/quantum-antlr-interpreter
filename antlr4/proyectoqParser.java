// Generated from proyectoq.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class proyectoqParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUERTA_Q=1, INI=2, SELE=3, EN=4, OP=5, TEN=6, ENTRE=7, UN=8, INV=9, MED=10, 
		QUBIT=11, INDEX=12, NEWLINE=13, WHITESPACE=14, DIGITO=15, N_INTEGER=16, 
		N_FLOAT=17, LETRA=18, ESPACIO=19, COMENTARIO_INI=20, COMENTARIO_FIN=21, 
		COMA=22, PUNTO=23, OP_SUM=24, OP_REST=25, OP_POR=26, OP_DIV=27, OP_IGUAL=28, 
		OP_MAYOR=29, OP_MENOR=30, OP_MAYOR_IGUAL=31, OP_MENOR_IGUAL=32, OP_EQUI=33, 
		OP_NEG=34, OP_DOSP=35, OP_DIF=36, OP_Y=37, OP_LOGICA=38, OP_ARITMETICA=39, 
		LLA=40, LLC=41, PRA=42, PRC=43, PCA=44, PCC=45, EOL=46, IF=47, WHILE=48, 
		VAR=49, FINVAR=50, INT=51, FLOAT=52, ELSE=53;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_registro_q = 2, RULE_seleccion = 3, 
		RULE_operar = 4, RULE_tensor = 5, RULE_union = 6, RULE_inversa = 7, RULE_medir = 8, 
		RULE_id = 9, RULE_array_q = 10, RULE_mas_q = 11, RULE_array = 12, RULE_matriz = 13, 
		RULE_variable = 14, RULE_variable_declar = 15, RULE_condicion = 16, RULE_sentencia = 17, 
		RULE_if_sentencia = 18, RULE_else_sentencia = 19, RULE_while_sentencia = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "registro_q", "seleccion", "operar", "tensor", "union", 
			"inversa", "medir", "id", "array_q", "mas_q", "array", "matriz", "variable", 
			"variable_declar", "condicion", "sentencia", "if_sentencia", "else_sentencia", 
			"while_sentencia"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "' '", "'/*'", "'*/'", "','", 
			"'.'", "'+'", "'-'", "'*'", "'/'", "'='", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!'", "':'", "'!='", "'&'", null, null, "'{'", "'}'", "'('", 
			"')'", "'['", "']'", "';'", null, null, "'VAR'", "'FINVAR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUERTA_Q", "INI", "SELE", "EN", "OP", "TEN", "ENTRE", "UN", "INV", 
			"MED", "QUBIT", "INDEX", "NEWLINE", "WHITESPACE", "DIGITO", "N_INTEGER", 
			"N_FLOAT", "LETRA", "ESPACIO", "COMENTARIO_INI", "COMENTARIO_FIN", "COMA", 
			"PUNTO", "OP_SUM", "OP_REST", "OP_POR", "OP_DIV", "OP_IGUAL", "OP_MAYOR", 
			"OP_MENOR", "OP_MAYOR_IGUAL", "OP_MENOR_IGUAL", "OP_EQUI", "OP_NEG", 
			"OP_DOSP", "OP_DIF", "OP_Y", "OP_LOGICA", "OP_ARITMETICA", "LLA", "LLC", 
			"PRA", "PRC", "PCA", "PCC", "EOL", "IF", "WHILE", "VAR", "FINVAR", "INT", 
			"FLOAT", "ELSE"
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
	public String getGrammarFileName() { return "proyectoq.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public proyectoqParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Registro_qContext registro_q() {
			return getRuleContext(Registro_qContext.class,0);
		}
		public TerminalNode EOL() { return getToken(proyectoqParser.EOL, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			registro_q();
			setState(43);
			match(EOL);
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

	public static class ExprContext extends ParserRuleContext {
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public OperarContext operar() {
			return getRuleContext(OperarContext.class,0);
		}
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public InversaContext inversa() {
			return getRuleContext(InversaContext.class,0);
		}
		public MedirContext medir() {
			return getRuleContext(MedirContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELE:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				seleccion();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				operar();
				}
				break;
			case TEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				tensor();
				}
				break;
			case UN:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				union();
				}
				break;
			case INV:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				inversa();
				}
				break;
			case MED:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				medir();
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

	public static class Registro_qContext extends ParserRuleContext {
		public TerminalNode INI() { return getToken(proyectoqParser.INI, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Array_qContext array_q() {
			return getRuleContext(Array_qContext.class,0);
		}
		public TerminalNode OP_Y() { return getToken(proyectoqParser.OP_Y, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Registro_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterRegistro_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitRegistro_q(this);
		}
	}

	public final Registro_qContext registro_q() throws RecognitionException {
		Registro_qContext _localctx = new Registro_qContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_registro_q);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(INI);
				setState(54);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(INI);
				setState(56);
				id();
				setState(57);
				array_q();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(INI);
				setState(60);
				id();
				setState(61);
				match(OP_Y);
				setState(62);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(INI);
				setState(65);
				id();
				setState(66);
				array_q();
				setState(67);
				match(OP_Y);
				setState(68);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(INI);
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

	public static class SeleccionContext extends ParserRuleContext {
		public TerminalNode SELE() { return getToken(proyectoqParser.SELE, 0); }
		public TerminalNode PRA() { return getToken(proyectoqParser.PRA, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PRC() { return getToken(proyectoqParser.PRC, 0); }
		public TerminalNode OP_IGUAL() { return getToken(proyectoqParser.OP_IGUAL, 0); }
		public TerminalNode PCA() { return getToken(proyectoqParser.PCA, 0); }
		public List<TerminalNode> INDEX() { return getTokens(proyectoqParser.INDEX); }
		public TerminalNode INDEX(int i) {
			return getToken(proyectoqParser.INDEX, i);
		}
		public TerminalNode OP_DOSP() { return getToken(proyectoqParser.OP_DOSP, 0); }
		public TerminalNode PCC() { return getToken(proyectoqParser.PCC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterSeleccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitSeleccion(this);
		}
	}

	public final SeleccionContext seleccion() throws RecognitionException {
		SeleccionContext _localctx = new SeleccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_seleccion);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(SELE);
				setState(74);
				match(PRA);
				setState(75);
				id();
				setState(76);
				match(PRC);
				setState(77);
				match(OP_IGUAL);
				setState(78);
				id();
				setState(79);
				match(PCA);
				setState(80);
				match(INDEX);
				setState(81);
				match(OP_DOSP);
				setState(82);
				match(INDEX);
				setState(83);
				match(PCC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(SELE);
				setState(86);
				match(PRA);
				setState(87);
				id();
				setState(88);
				match(PRC);
				setState(89);
				match(OP_IGUAL);
				setState(90);
				id();
				setState(91);
				match(PCA);
				setState(92);
				match(INDEX);
				setState(93);
				match(OP_DOSP);
				setState(94);
				match(INDEX);
				setState(95);
				match(PCC);
				setState(96);
				expr();
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

	public static class OperarContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(proyectoqParser.OP, 0); }
		public TerminalNode PUERTA_Q() { return getToken(proyectoqParser.PUERTA_Q, 0); }
		public TerminalNode PRA() { return getToken(proyectoqParser.PRA, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PRC() { return getToken(proyectoqParser.PRC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterOperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitOperar(this);
		}
	}

	public final OperarContext operar() throws RecognitionException {
		OperarContext _localctx = new OperarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operar);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(OP);
				{
				setState(101);
				match(PUERTA_Q);
				}
				{
				setState(102);
				match(PRA);
				}
				{
				setState(103);
				id();
				}
				{
				setState(104);
				match(PRC);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(OP);
				{
				setState(107);
				match(PUERTA_Q);
				}
				{
				setState(108);
				match(PRA);
				}
				{
				setState(109);
				id();
				}
				{
				setState(110);
				match(PRC);
				}
				{
				setState(111);
				expr();
				}
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

	public static class TensorContext extends ParserRuleContext {
		public TerminalNode TEN() { return getToken(proyectoqParser.TEN, 0); }
		public TerminalNode ENTRE() { return getToken(proyectoqParser.ENTRE, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PRA() { return getToken(proyectoqParser.PRA, 0); }
		public TerminalNode COMA() { return getToken(proyectoqParser.COMA, 0); }
		public TerminalNode PRC() { return getToken(proyectoqParser.PRC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterTensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitTensor(this);
		}
	}

	public final TensorContext tensor() throws RecognitionException {
		TensorContext _localctx = new TensorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tensor);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(TEN);
				{
				setState(116);
				id();
				}
				setState(117);
				match(ENTRE);
				{
				setState(118);
				match(PRA);
				}
				{
				setState(119);
				id();
				}
				{
				setState(120);
				match(COMA);
				}
				{
				setState(121);
				id();
				}
				{
				setState(122);
				match(PRC);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(TEN);
				{
				setState(125);
				id();
				}
				setState(126);
				match(ENTRE);
				{
				setState(127);
				match(PRA);
				}
				{
				setState(128);
				id();
				}
				{
				setState(129);
				match(COMA);
				}
				{
				setState(130);
				id();
				}
				{
				setState(131);
				match(PRC);
				}
				{
				setState(132);
				expr();
				}
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

	public static class UnionContext extends ParserRuleContext {
		public TerminalNode UN() { return getToken(proyectoqParser.UN, 0); }
		public TerminalNode ENTRE() { return getToken(proyectoqParser.ENTRE, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PRA() { return getToken(proyectoqParser.PRA, 0); }
		public TerminalNode COMA() { return getToken(proyectoqParser.COMA, 0); }
		public TerminalNode PRC() { return getToken(proyectoqParser.PRC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitUnion(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_union);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(UN);
				{
				setState(137);
				id();
				}
				setState(138);
				match(ENTRE);
				{
				setState(139);
				match(PRA);
				}
				{
				setState(140);
				id();
				}
				{
				setState(141);
				match(COMA);
				}
				{
				setState(142);
				id();
				}
				{
				setState(143);
				match(PRC);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(UN);
				{
				setState(146);
				id();
				}
				setState(147);
				match(ENTRE);
				{
				setState(148);
				match(PRA);
				}
				{
				setState(149);
				id();
				}
				{
				setState(150);
				match(COMA);
				}
				{
				setState(151);
				id();
				}
				{
				setState(152);
				match(PRC);
				}
				{
				setState(153);
				expr();
				}
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

	public static class InversaContext extends ParserRuleContext {
		public TerminalNode INV() { return getToken(proyectoqParser.INV, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PRA() { return getToken(proyectoqParser.PRA, 0); }
		public TerminalNode PRC() { return getToken(proyectoqParser.PRC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InversaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterInversa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitInversa(this);
		}
	}

	public final InversaContext inversa() throws RecognitionException {
		InversaContext _localctx = new InversaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inversa);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(INV);
				{
				setState(158);
				id();
				}
				{
				setState(159);
				match(PRA);
				}
				{
				setState(160);
				id();
				}
				{
				setState(161);
				match(PRC);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(INV);
				{
				setState(164);
				id();
				}
				{
				setState(165);
				match(PRA);
				}
				{
				setState(166);
				id();
				}
				{
				setState(167);
				match(PRC);
				}
				{
				setState(168);
				expr();
				}
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

	public static class MedirContext extends ParserRuleContext {
		public TerminalNode MED() { return getToken(proyectoqParser.MED, 0); }
		public TerminalNode EN() { return getToken(proyectoqParser.EN, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MedirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterMedir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitMedir(this);
		}
	}

	public final MedirContext medir() throws RecognitionException {
		MedirContext _localctx = new MedirContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_medir);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(MED);
				{
				setState(173);
				id();
				}
				setState(174);
				match(EN);
				{
				setState(175);
				id();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(MED);
				{
				setState(178);
				id();
				}
				setState(179);
				match(EN);
				{
				setState(180);
				id();
				}
				{
				setState(181);
				expr();
				}
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(proyectoqParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(proyectoqParser.LETRA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(proyectoqParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(proyectoqParser.DIGITO, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				match(LETRA);
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGITO) {
				{
				{
				setState(190);
				match(DIGITO);
				}
				}
				setState(195);
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

	public static class Array_qContext extends ParserRuleContext {
		public TerminalNode PCA() { return getToken(proyectoqParser.PCA, 0); }
		public TerminalNode QUBIT() { return getToken(proyectoqParser.QUBIT, 0); }
		public TerminalNode PCC() { return getToken(proyectoqParser.PCC, 0); }
		public TerminalNode COMA() { return getToken(proyectoqParser.COMA, 0); }
		public Mas_qContext mas_q() {
			return getRuleContext(Mas_qContext.class,0);
		}
		public Array_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterArray_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitArray_q(this);
		}
	}

	public final Array_qContext array_q() throws RecognitionException {
		Array_qContext _localctx = new Array_qContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_q);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(PCA);
				setState(197);
				match(QUBIT);
				setState(198);
				match(PCC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(PCA);
				setState(200);
				match(QUBIT);
				setState(201);
				match(COMA);
				setState(202);
				mas_q();
				setState(203);
				match(PCC);
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

	public static class Mas_qContext extends ParserRuleContext {
		public TerminalNode QUBIT() { return getToken(proyectoqParser.QUBIT, 0); }
		public TerminalNode COMA() { return getToken(proyectoqParser.COMA, 0); }
		public Mas_qContext mas_q() {
			return getRuleContext(Mas_qContext.class,0);
		}
		public Mas_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterMas_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitMas_q(this);
		}
	}

	public final Mas_qContext mas_q() throws RecognitionException {
		Mas_qContext _localctx = new Mas_qContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mas_q);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(QUBIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(QUBIT);
				setState(209);
				match(COMA);
				setState(210);
				mas_q();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode PRA() { return getToken(proyectoqParser.PRA, 0); }
		public List<TerminalNode> N_INTEGER() { return getTokens(proyectoqParser.N_INTEGER); }
		public TerminalNode N_INTEGER(int i) {
			return getToken(proyectoqParser.N_INTEGER, i);
		}
		public List<TerminalNode> N_FLOAT() { return getTokens(proyectoqParser.N_FLOAT); }
		public TerminalNode N_FLOAT(int i) {
			return getToken(proyectoqParser.N_FLOAT, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode PRC() { return getToken(proyectoqParser.PRC, 0); }
		public TerminalNode COMA() { return getToken(proyectoqParser.COMA, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			match(PRA);
			}
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case N_INTEGER:
					{
					setState(214);
					match(N_INTEGER);
					}
					break;
				case N_FLOAT:
					{
					setState(215);
					match(N_FLOAT);
					}
					break;
				case LETRA:
					{
					setState(216);
					id();
					}
					break;
				case OP_DOSP:
					{
					setState(217);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(220);
				match(COMA);
				}
				}
				break;
			}
			}
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N_INTEGER:
				{
				setState(223);
				match(N_INTEGER);
				}
				break;
			case N_FLOAT:
				{
				setState(224);
				match(N_FLOAT);
				}
				break;
			case LETRA:
				{
				setState(225);
				id();
				}
				break;
			case OP_DOSP:
				{
				setState(226);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(229);
			match(PRC);
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

	public static class MatrizContext extends ParserRuleContext {
		public TerminalNode PCA() { return getToken(proyectoqParser.PCA, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public TerminalNode PCC() { return getToken(proyectoqParser.PCC, 0); }
		public TerminalNode COMA() { return getToken(proyectoqParser.COMA, 0); }
		public MatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitMatriz(this);
		}
	}

	public final MatrizContext matriz() throws RecognitionException {
		MatrizContext _localctx = new MatrizContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_matriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			match(PCA);
			}
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(232);
				array();
				}
				{
				setState(233);
				match(COMA);
				}
				}
				break;
			}
			}
			{
			setState(237);
			array();
			}
			{
			setState(238);
			match(PCC);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode OP_DOSP() { return getToken(proyectoqParser.OP_DOSP, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(240);
			match(OP_DOSP);
			}
			{
			setState(241);
			id();
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

	public static class Variable_declarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(proyectoqParser.VAR, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode OP_IGUAL() { return getToken(proyectoqParser.OP_IGUAL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> N_FLOAT() { return getTokens(proyectoqParser.N_FLOAT); }
		public TerminalNode N_FLOAT(int i) {
			return getToken(proyectoqParser.N_FLOAT, i);
		}
		public TerminalNode EOL() { return getToken(proyectoqParser.EOL, 0); }
		public TerminalNode FINVAR() { return getToken(proyectoqParser.FINVAR, 0); }
		public List<TerminalNode> N_INTEGER() { return getTokens(proyectoqParser.N_INTEGER); }
		public TerminalNode N_INTEGER(int i) {
			return getToken(proyectoqParser.N_INTEGER, i);
		}
		public TerminalNode OP_ARITMETICA() { return getToken(proyectoqParser.OP_ARITMETICA, 0); }
		public Variable_declarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterVariable_declar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitVariable_declar(this);
		}
	}

	public final Variable_declarContext variable_declar() throws RecognitionException {
		Variable_declarContext _localctx = new Variable_declarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable_declar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			match(VAR);
			}
			{
			setState(244);
			variable();
			}
			{
			setState(245);
			match(OP_IGUAL);
			}
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(246);
				array();
				}
				break;
			case 2:
				{
				setState(247);
				matriz();
				}
				break;
			case 3:
				{
				setState(248);
				id();
				}
				break;
			case 4:
				{
				setState(249);
				match(N_FLOAT);
				}
				break;
			case 5:
				{
				setState(250);
				variable();
				}
				break;
			case 6:
				{
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==N_INTEGER || _la==N_FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(252);
				match(OP_ARITMETICA);
				}
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==N_INTEGER || _la==N_FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
			{
			setState(256);
			match(EOL);
			}
			{
			setState(257);
			match(FINVAR);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode OP_LOGICA() { return getToken(proyectoqParser.OP_LOGICA, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(259);
			variable();
			}
			{
			setState(260);
			match(OP_LOGICA);
			}
			{
			setState(261);
			variable();
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

	public static class SentenciaContext extends ParserRuleContext {
		public List<Variable_declarContext> variable_declar() {
			return getRuleContexts(Variable_declarContext.class);
		}
		public Variable_declarContext variable_declar(int i) {
			return getRuleContext(Variable_declarContext.class,i);
		}
		public List<If_sentenciaContext> if_sentencia() {
			return getRuleContexts(If_sentenciaContext.class);
		}
		public If_sentenciaContext if_sentencia(int i) {
			return getRuleContext(If_sentenciaContext.class,i);
		}
		public List<While_sentenciaContext> while_sentencia() {
			return getRuleContexts(While_sentenciaContext.class);
		}
		public While_sentenciaContext while_sentencia(int i) {
			return getRuleContext(While_sentenciaContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(263);
					variable_declar();
					}
					break;
				case IF:
					{
					setState(264);
					if_sentencia();
					}
					break;
				case WHILE:
					{
					setState(265);
					while_sentencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VAR))) != 0) );
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

	public static class If_sentenciaContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(proyectoqParser.IF, 0); }
		public TerminalNode PRA() { return getToken(proyectoqParser.PRA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PRC() { return getToken(proyectoqParser.PRC, 0); }
		public TerminalNode LLA() { return getToken(proyectoqParser.LLA, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode LLC() { return getToken(proyectoqParser.LLC, 0); }
		public Else_sentenciaContext else_sentencia() {
			return getRuleContext(Else_sentenciaContext.class,0);
		}
		public If_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterIf_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitIf_sentencia(this);
		}
	}

	public final If_sentenciaContext if_sentencia() throws RecognitionException {
		If_sentenciaContext _localctx = new If_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(270);
			match(IF);
			}
			{
			setState(271);
			match(PRA);
			}
			{
			setState(272);
			condicion();
			}
			{
			setState(273);
			match(PRC);
			}
			{
			setState(274);
			match(LLA);
			}
			{
			setState(275);
			sentencia();
			}
			{
			setState(276);
			match(LLC);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(277);
				else_sentencia();
				}
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

	public static class Else_sentenciaContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(proyectoqParser.ELSE, 0); }
		public TerminalNode LLA() { return getToken(proyectoqParser.LLA, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode LLC() { return getToken(proyectoqParser.LLC, 0); }
		public Else_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterElse_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitElse_sentencia(this);
		}
	}

	public final Else_sentenciaContext else_sentencia() throws RecognitionException {
		Else_sentenciaContext _localctx = new Else_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280);
			match(ELSE);
			}
			{
			setState(281);
			match(LLA);
			}
			{
			setState(282);
			sentencia();
			}
			{
			setState(283);
			match(LLC);
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

	public static class While_sentenciaContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(proyectoqParser.WHILE, 0); }
		public TerminalNode PRA() { return getToken(proyectoqParser.PRA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PRC() { return getToken(proyectoqParser.PRC, 0); }
		public TerminalNode LLA() { return getToken(proyectoqParser.LLA, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode LLC() { return getToken(proyectoqParser.LLC, 0); }
		public While_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).enterWhile_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoqListener ) ((proyectoqListener)listener).exitWhile_sentencia(this);
		}
	}

	public final While_sentenciaContext while_sentencia() throws RecognitionException {
		While_sentenciaContext _localctx = new While_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			match(WHILE);
			}
			{
			setState(286);
			match(PRA);
			}
			{
			setState(287);
			condicion();
			}
			{
			setState(288);
			match(PRC);
			}
			{
			setState(289);
			match(LLA);
			}
			{
			setState(290);
			sentencia();
			}
			{
			setState(291);
			match(LLC);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0128\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5e\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0089\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00ad\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00ba\n\n\3\13\6\13\u00bd\n\13\r\13\16\13\u00be\3\13\7\13\u00c2"+
		"\n\13\f\13\16\13\u00c5\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d0"+
		"\n\f\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00dd"+
		"\n\16\3\16\5\16\u00e0\n\16\3\16\3\16\3\16\3\16\5\16\u00e6\n\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\5\17\u00ee\n\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0101\n\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\6\23\u010d\n\23\r\23"+
		"\16\23\u010e\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0119\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\2"+
		"\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\22\23\2\u0136"+
		"\2,\3\2\2\2\4\65\3\2\2\2\6I\3\2\2\2\bd\3\2\2\2\ns\3\2\2\2\f\u0088\3\2"+
		"\2\2\16\u009d\3\2\2\2\20\u00ac\3\2\2\2\22\u00b9\3\2\2\2\24\u00bc\3\2\2"+
		"\2\26\u00cf\3\2\2\2\30\u00d5\3\2\2\2\32\u00d7\3\2\2\2\34\u00e9\3\2\2\2"+
		"\36\u00f2\3\2\2\2 \u00f5\3\2\2\2\"\u0105\3\2\2\2$\u010c\3\2\2\2&\u0110"+
		"\3\2\2\2(\u011a\3\2\2\2*\u011f\3\2\2\2,-\5\6\4\2-.\7\60\2\2.\3\3\2\2\2"+
		"/\66\5\b\5\2\60\66\5\n\6\2\61\66\5\f\7\2\62\66\5\16\b\2\63\66\5\20\t\2"+
		"\64\66\5\22\n\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2"+
		"\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\4\2\28J\5\24\13\29:\7"+
		"\4\2\2:;\5\24\13\2;<\5\26\f\2<J\3\2\2\2=>\7\4\2\2>?\5\24\13\2?@\7\'\2"+
		"\2@A\5\4\3\2AJ\3\2\2\2BC\7\4\2\2CD\5\24\13\2DE\5\26\f\2EF\7\'\2\2FG\5"+
		"\4\3\2GJ\3\2\2\2HJ\7\4\2\2I\67\3\2\2\2I9\3\2\2\2I=\3\2\2\2IB\3\2\2\2I"+
		"H\3\2\2\2J\7\3\2\2\2KL\7\5\2\2LM\7,\2\2MN\5\24\13\2NO\7-\2\2OP\7\36\2"+
		"\2PQ\5\24\13\2QR\7.\2\2RS\7\16\2\2ST\7%\2\2TU\7\16\2\2UV\7/\2\2Ve\3\2"+
		"\2\2WX\7\5\2\2XY\7,\2\2YZ\5\24\13\2Z[\7-\2\2[\\\7\36\2\2\\]\5\24\13\2"+
		"]^\7.\2\2^_\7\16\2\2_`\7%\2\2`a\7\16\2\2ab\7/\2\2bc\5\4\3\2ce\3\2\2\2"+
		"dK\3\2\2\2dW\3\2\2\2e\t\3\2\2\2fg\7\7\2\2gh\7\3\2\2hi\7,\2\2ij\5\24\13"+
		"\2jk\7-\2\2kt\3\2\2\2lm\7\7\2\2mn\7\3\2\2no\7,\2\2op\5\24\13\2pq\7-\2"+
		"\2qr\5\4\3\2rt\3\2\2\2sf\3\2\2\2sl\3\2\2\2t\13\3\2\2\2uv\7\b\2\2vw\5\24"+
		"\13\2wx\7\t\2\2xy\7,\2\2yz\5\24\13\2z{\7\30\2\2{|\5\24\13\2|}\7-\2\2}"+
		"\u0089\3\2\2\2~\177\7\b\2\2\177\u0080\5\24\13\2\u0080\u0081\7\t\2\2\u0081"+
		"\u0082\7,\2\2\u0082\u0083\5\24\13\2\u0083\u0084\7\30\2\2\u0084\u0085\5"+
		"\24\13\2\u0085\u0086\7-\2\2\u0086\u0087\5\4\3\2\u0087\u0089\3\2\2\2\u0088"+
		"u\3\2\2\2\u0088~\3\2\2\2\u0089\r\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c"+
		"\5\24\13\2\u008c\u008d\7\t\2\2\u008d\u008e\7,\2\2\u008e\u008f\5\24\13"+
		"\2\u008f\u0090\7\30\2\2\u0090\u0091\5\24\13\2\u0091\u0092\7-\2\2\u0092"+
		"\u009e\3\2\2\2\u0093\u0094\7\n\2\2\u0094\u0095\5\24\13\2\u0095\u0096\7"+
		"\t\2\2\u0096\u0097\7,\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7\30\2\2\u0099"+
		"\u009a\5\24\13\2\u009a\u009b\7-\2\2\u009b\u009c\5\4\3\2\u009c\u009e\3"+
		"\2\2\2\u009d\u008a\3\2\2\2\u009d\u0093\3\2\2\2\u009e\17\3\2\2\2\u009f"+
		"\u00a0\7\13\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\5"+
		"\24\13\2\u00a3\u00a4\7-\2\2\u00a4\u00ad\3\2\2\2\u00a5\u00a6\7\13\2\2\u00a6"+
		"\u00a7\5\24\13\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\5\24\13\2\u00a9\u00aa"+
		"\7-\2\2\u00aa\u00ab\5\4\3\2\u00ab\u00ad\3\2\2\2\u00ac\u009f\3\2\2\2\u00ac"+
		"\u00a5\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00af\7\f\2\2\u00af\u00b0\5\24\13"+
		"\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2\5\24\13\2\u00b2\u00ba\3\2\2\2\u00b3"+
		"\u00b4\7\f\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\5"+
		"\24\13\2\u00b7\u00b8\5\4\3\2\u00b8\u00ba\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9"+
		"\u00b3\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00bd\7\24\2\2\u00bc\u00bb\3\2\2"+
		"\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3"+
		"\3\2\2\2\u00c0\u00c2\7\21\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\25\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\7.\2\2\u00c7\u00c8\7\r\2\2\u00c8\u00d0\7/\2\2\u00c9"+
		"\u00ca\7.\2\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\5\30"+
		"\r\2\u00cd\u00ce\7/\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf"+
		"\u00c9\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00d6\7\r\2\2\u00d2\u00d3\7\r\2"+
		"\2\u00d3\u00d4\7\30\2\2\u00d4\u00d6\5\30\r\2\u00d5\u00d1\3\2\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d6\31\3\2\2\2\u00d7\u00df\7,\2\2\u00d8\u00dd\7\22\2"+
		"\2\u00d9\u00dd\7\23\2\2\u00da\u00dd\5\24\13\2\u00db\u00dd\5\36\20\2\u00dc"+
		"\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\7\30\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e5\3\2\2\2\u00e1\u00e6\7\22\2\2\u00e2\u00e6\7"+
		"\23\2\2\u00e3\u00e6\5\24\13\2\u00e4\u00e6\5\36\20\2\u00e5\u00e1\3\2\2"+
		"\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8\33\3\2\2\2\u00e9\u00ed\7.\2\2\u00ea"+
		"\u00eb\5\32\16\2\u00eb\u00ec\7\30\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5\32\16\2"+
		"\u00f0\u00f1\7/\2\2\u00f1\35\3\2\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f4\5"+
		"\24\13\2\u00f4\37\3\2\2\2\u00f5\u00f6\7\63\2\2\u00f6\u00f7\5\36\20\2\u00f7"+
		"\u0100\7\36\2\2\u00f8\u0101\5\32\16\2\u00f9\u0101\5\34\17\2\u00fa\u0101"+
		"\5\24\13\2\u00fb\u0101\7\23\2\2\u00fc\u0101\5\36\20\2\u00fd\u00fe\t\2"+
		"\2\2\u00fe\u00ff\7)\2\2\u00ff\u0101\t\2\2\2\u0100\u00f8\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2"+
		"\2\2\u0100\u00fd\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\60\2\2\u0103"+
		"\u0104\7\64\2\2\u0104!\3\2\2\2\u0105\u0106\5\36\20\2\u0106\u0107\7(\2"+
		"\2\u0107\u0108\5\36\20\2\u0108#\3\2\2\2\u0109\u010d\5 \21\2\u010a\u010d"+
		"\5&\24\2\u010b\u010d\5*\26\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f%\3\2\2\2\u0110\u0111\7\61\2\2\u0111\u0112\7,\2\2\u0112\u0113"+
		"\5\"\22\2\u0113\u0114\7-\2\2\u0114\u0115\7*\2\2\u0115\u0116\5$\23\2\u0116"+
		"\u0118\7+\2\2\u0117\u0119\5(\25\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\'\3\2\2\2\u011a\u011b\7\67\2\2\u011b\u011c\7*\2\2\u011c\u011d"+
		"\5$\23\2\u011d\u011e\7+\2\2\u011e)\3\2\2\2\u011f\u0120\7\62\2\2\u0120"+
		"\u0121\7,\2\2\u0121\u0122\5\"\22\2\u0122\u0123\7-\2\2\u0123\u0124\7*\2"+
		"\2\u0124\u0125\5$\23\2\u0125\u0126\7+\2\2\u0126+\3\2\2\2\26\65Ids\u0088"+
		"\u009d\u00ac\u00b9\u00be\u00c3\u00cf\u00d5\u00dc\u00df\u00e5\u00ed\u0100"+
		"\u010c\u010e\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}