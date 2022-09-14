// Generated from proyectoq.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class proyectoqLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUERTA_Q", "INI", "SELE", "EN", "OP", "TEN", "ENTRE", "UN", "INV", "MED", 
			"QUBIT", "INDEX", "NEWLINE", "WHITESPACE", "DIGITO", "N_INTEGER", "N_FLOAT", 
			"LETRA", "ESPACIO", "COMENTARIO_INI", "COMENTARIO_FIN", "COMA", "PUNTO", 
			"OP_SUM", "OP_REST", "OP_POR", "OP_DIV", "OP_IGUAL", "OP_MAYOR", "OP_MENOR", 
			"OP_MAYOR_IGUAL", "OP_MENOR_IGUAL", "OP_EQUI", "OP_NEG", "OP_DOSP", "OP_DIF", 
			"OP_Y", "OP_LOGICA", "OP_ARITMETICA", "LLA", "LLC", "PRA", "PRC", "PCA", 
			"PCC", "EOL", "IF", "WHILE", "VAR", "FINVAR", "INT", "FLOAT", "ELSE"
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


	public proyectoqLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "proyectoq.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0087\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0095\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a9"+
		"\n\4\3\5\3\5\3\5\3\5\5\5\u00af\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00bd\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00cb\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d7\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e3\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00eb\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00f7\n\13\3\f\3\f\3\r\3\r\3\16\5\16\u00fe\n\16\3\16\3\16\3"+
		"\16\3\16\3\17\6\17\u0105\n\17\r\17\16\17\u0106\3\17\3\17\3\20\3\20\3\21"+
		"\5\21\u010e\n\21\3\21\6\21\u0111\n\21\r\21\16\21\u0112\3\22\5\22\u0116"+
		"\n\22\3\22\7\22\u0119\n\22\f\22\16\22\u011c\13\22\3\22\3\22\6\22\u0120"+
		"\n\22\r\22\16\22\u0121\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0159\n\'\3(\3(\3(\3(\5(\u015f"+
		"\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\5\60"+
		"\u0173\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u017f"+
		"\n\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u0192\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u019e\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u01a8\n\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67\3\2\5\4\2jj{|\4\2\13\13\"\"\4\2C\\c|\2\u01cc\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3\u0086\3\2"+
		"\2\2\5\u0094\3\2\2\2\7\u00a8\3\2\2\2\t\u00ae\3\2\2\2\13\u00bc\3\2\2\2"+
		"\r\u00ca\3\2\2\2\17\u00d6\3\2\2\2\21\u00e2\3\2\2\2\23\u00ea\3\2\2\2\25"+
		"\u00f6\3\2\2\2\27\u00f8\3\2\2\2\31\u00fa\3\2\2\2\33\u00fd\3\2\2\2\35\u0104"+
		"\3\2\2\2\37\u010a\3\2\2\2!\u010d\3\2\2\2#\u0115\3\2\2\2%\u0123\3\2\2\2"+
		"\'\u0125\3\2\2\2)\u0127\3\2\2\2+\u012a\3\2\2\2-\u012d\3\2\2\2/\u012f\3"+
		"\2\2\2\61\u0131\3\2\2\2\63\u0133\3\2\2\2\65\u0135\3\2\2\2\67\u0137\3\2"+
		"\2\29\u0139\3\2\2\2;\u013b\3\2\2\2=\u013d\3\2\2\2?\u013f\3\2\2\2A\u0142"+
		"\3\2\2\2C\u0145\3\2\2\2E\u0148\3\2\2\2G\u014a\3\2\2\2I\u014c\3\2\2\2K"+
		"\u014f\3\2\2\2M\u0158\3\2\2\2O\u015e\3\2\2\2Q\u0160\3\2\2\2S\u0162\3\2"+
		"\2\2U\u0164\3\2\2\2W\u0166\3\2\2\2Y\u0168\3\2\2\2[\u016a\3\2\2\2]\u016c"+
		"\3\2\2\2_\u0172\3\2\2\2a\u017e\3\2\2\2c\u0180\3\2\2\2e\u0184\3\2\2\2g"+
		"\u0191\3\2\2\2i\u019d\3\2\2\2k\u01a7\3\2\2\2m\u0087\7z\2\2no\7p\2\2op"+
		"\7q\2\2p\u0087\7v\2\2q\u0087\t\2\2\2rs\7j\2\2st\7c\2\2tu\7f\2\2uv\7c\2"+
		"\2vw\7o\2\2wx\7c\2\2xy\7t\2\2y\u0087\7f\2\2z{\7e\2\2{|\7p\2\2|}\7q\2\2"+
		"}\u0087\7v\2\2~\177\7h\2\2\177\u0080\7c\2\2\u0080\u0081\7u\2\2\u0081\u0087"+
		"\7g\2\2\u0082\u0083\7u\2\2\u0083\u0084\7y\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0087\7r\2\2\u0086m\3\2\2\2\u0086n\3\2\2\2\u0086q\3\2\2\2\u0086r\3\2"+
		"\2\2\u0086z\3\2\2\2\u0086~\3\2\2\2\u0086\u0082\3\2\2\2\u0087\4\3\2\2\2"+
		"\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7k\2\2\u008b\u008c"+
		"\7e\2\2\u008c\u008d\7k\2\2\u008d\u0095\7q\2\2\u008e\u008f\7K\2\2\u008f"+
		"\u0090\7P\2\2\u0090\u0091\7K\2\2\u0091\u0092\7E\2\2\u0092\u0093\7K\2\2"+
		"\u0093\u0095\7Q\2\2\u0094\u0088\3\2\2\2\u0094\u008e\3\2\2\2\u0095\6\3"+
		"\2\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7e\2\2\u009b\u009c\7e\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7q\2\2\u009e\u00a9\7p\2\2\u009f\u00a0\7U\2\2\u00a0\u00a1"+
		"\7G\2\2\u00a1\u00a2\7N\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7E\2\2\u00a4"+
		"\u00a5\7E\2\2\u00a5\u00a6\7K\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a9\7P\2\2"+
		"\u00a8\u0096\3\2\2\2\u00a8\u009f\3\2\2\2\u00a9\b\3\2\2\2\u00aa\u00ab\7"+
		"g\2\2\u00ab\u00af\7p\2\2\u00ac\u00ad\7G\2\2\u00ad\u00af\7P\2\2\u00ae\u00aa"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\n\3\2\2\2\u00b0\u00b1\7q\2\2\u00b1"+
		"\u00b2\7r\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7c\2\2"+
		"\u00b5\u00bd\7t\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7R\2\2\u00b8\u00b9"+
		"\7G\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bd\7T\2\2\u00bc"+
		"\u00b0\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bd\f\3\2\2\2\u00be\u00bf\7v\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3"+
		"\7q\2\2\u00c3\u00cb\7t\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6\7G\2\2\u00c6"+
		"\u00c7\7P\2\2\u00c7\u00c8\7U\2\2\u00c8\u00c9\7Q\2\2\u00c9\u00cb\7T\2\2"+
		"\u00ca\u00be\3\2\2\2\u00ca\u00c4\3\2\2\2\u00cb\16\3\2\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"\u00d7\7g\2\2\u00d1\u00d2\7G\2\2\u00d2\u00d3\7P\2\2\u00d3\u00d4\7V\2\2"+
		"\u00d4\u00d5\7T\2\2\u00d5\u00d7\7G\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00d1"+
		"\3\2\2\2\u00d7\20\3\2\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7p\2\2\u00da"+
		"\u00db\7k\2\2\u00db\u00dc\7q\2\2\u00dc\u00e3\7p\2\2\u00dd\u00de\7W\2\2"+
		"\u00de\u00df\7P\2\2\u00df\u00e0\7K\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e3"+
		"\7P\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3\22\3\2\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00eb\7x\2\2\u00e7\u00e8\7K\2\2"+
		"\u00e8\u00e9\7P\2\2\u00e9\u00eb\7X\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7"+
		"\3\2\2\2\u00eb\24\3\2\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"\u00ef\7f\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f7\7t\2\2\u00f1\u00f2\7O\2\2"+
		"\u00f2\u00f3\7G\2\2\u00f3\u00f4\7F\2\2\u00f4\u00f5\7K\2\2\u00f5\u00f7"+
		"\7T\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\26\3\2\2\2\u00f8"+
		"\u00f9\4\62\63\2\u00f9\30\3\2\2\2\u00fa\u00fb\4\629\2\u00fb\32\3\2\2\2"+
		"\u00fc\u00fe\7\17\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0100\7\f\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\16\2\2"+
		"\u0102\34\3\2\2\2\u0103\u0105\t\3\2\2\u0104\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\b\17\2\2\u0109\36\3\2\2\2\u010a\u010b\4\62;\2\u010b \3\2\2\2\u010c"+
		"\u010e\7/\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2"+
		"\2\2\u010f\u0111\5\37\20\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\"\3\2\2\2\u0114\u0116\7/\2\2"+
		"\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011a\3\2\2\2\u0117\u0119"+
		"\5\37\20\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f"+
		"\5/\30\2\u011e\u0120\5\37\20\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122$\3\2\2\2\u0123\u0124\t"+
		"\4\2\2\u0124&\3\2\2\2\u0125\u0126\7\"\2\2\u0126(\3\2\2\2\u0127\u0128\7"+
		"\61\2\2\u0128\u0129\7,\2\2\u0129*\3\2\2\2\u012a\u012b\7,\2\2\u012b\u012c"+
		"\7\61\2\2\u012c,\3\2\2\2\u012d\u012e\7.\2\2\u012e.\3\2\2\2\u012f\u0130"+
		"\7\60\2\2\u0130\60\3\2\2\2\u0131\u0132\7-\2\2\u0132\62\3\2\2\2\u0133\u0134"+
		"\7/\2\2\u0134\64\3\2\2\2\u0135\u0136\7,\2\2\u0136\66\3\2\2\2\u0137\u0138"+
		"\7\61\2\2\u01388\3\2\2\2\u0139\u013a\7?\2\2\u013a:\3\2\2\2\u013b\u013c"+
		"\7@\2\2\u013c<\3\2\2\2\u013d\u013e\7>\2\2\u013e>\3\2\2\2\u013f\u0140\7"+
		"@\2\2\u0140\u0141\7?\2\2\u0141@\3\2\2\2\u0142\u0143\7>\2\2\u0143\u0144"+
		"\7?\2\2\u0144B\3\2\2\2\u0145\u0146\7?\2\2\u0146\u0147\7?\2\2\u0147D\3"+
		"\2\2\2\u0148\u0149\7#\2\2\u0149F\3\2\2\2\u014a\u014b\7<\2\2\u014bH\3\2"+
		"\2\2\u014c\u014d\7#\2\2\u014d\u014e\7?\2\2\u014eJ\3\2\2\2\u014f\u0150"+
		"\7(\2\2\u0150L\3\2\2\2\u0151\u0159\5;\36\2\u0152\u0159\5=\37\2\u0153\u0159"+
		"\5? \2\u0154\u0159\5A!\2\u0155\u0159\5C\"\2\u0156\u0159\5E#\2\u0157\u0159"+
		"\5I%\2\u0158\u0151\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158"+
		"\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2"+
		"\2\2\u0159N\3\2\2\2\u015a\u015f\5\61\31\2\u015b\u015f\5\63\32\2\u015c"+
		"\u015f\5\65\33\2\u015d\u015f\5\67\34\2\u015e\u015a\3\2\2\2\u015e\u015b"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015fP\3\2\2\2\u0160"+
		"\u0161\7}\2\2\u0161R\3\2\2\2\u0162\u0163\7\177\2\2\u0163T\3\2\2\2\u0164"+
		"\u0165\7*\2\2\u0165V\3\2\2\2\u0166\u0167\7+\2\2\u0167X\3\2\2\2\u0168\u0169"+
		"\7]\2\2\u0169Z\3\2\2\2\u016a\u016b\7_\2\2\u016b\\\3\2\2\2\u016c\u016d"+
		"\7=\2\2\u016d^\3\2\2\2\u016e\u016f\7k\2\2\u016f\u0173\7h\2\2\u0170\u0171"+
		"\7K\2\2\u0171\u0173\7H\2\2\u0172\u016e\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"`\3\2\2\2\u0174\u0175\7y\2\2\u0175\u0176\7j\2\2\u0176\u0177\7k\2\2\u0177"+
		"\u0178\7n\2\2\u0178\u017f\7g\2\2\u0179\u017a\7Y\2\2\u017a\u017b\7J\2\2"+
		"\u017b\u017c\7K\2\2\u017c\u017d\7N\2\2\u017d\u017f\7G\2\2\u017e\u0174"+
		"\3\2\2\2\u017e\u0179\3\2\2\2\u017fb\3\2\2\2\u0180\u0181\7X\2\2\u0181\u0182"+
		"\7C\2\2\u0182\u0183\7T\2\2\u0183d\3\2\2\2\u0184\u0185\7H\2\2\u0185\u0186"+
		"\7K\2\2\u0186\u0187\7P\2\2\u0187\u0188\7X\2\2\u0188\u0189\7C\2\2\u0189"+
		"\u018a\7T\2\2\u018af\3\2\2\2\u018b\u018c\7K\2\2\u018c\u018d\7P\2\2\u018d"+
		"\u0192\7V\2\2\u018e\u018f\7k\2\2\u018f\u0190\7p\2\2\u0190\u0192\7v\2\2"+
		"\u0191\u018b\3\2\2\2\u0191\u018e\3\2\2\2\u0192h\3\2\2\2\u0193\u0194\7"+
		"h\2\2\u0194\u0195\7n\2\2\u0195\u0196\7q\2\2\u0196\u0197\7c\2\2\u0197\u019e"+
		"\7v\2\2\u0198\u0199\7H\2\2\u0199\u019a\7N\2\2\u019a\u019b\7Q\2\2\u019b"+
		"\u019c\7C\2\2\u019c\u019e\7V\2\2\u019d\u0193\3\2\2\2\u019d\u0198\3\2\2"+
		"\2\u019ej\3\2\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7"+
		"u\2\2\u01a2\u01a8\7g\2\2\u01a3\u01a4\7G\2\2\u01a4\u01a5\7N\2\2\u01a5\u01a6"+
		"\7U\2\2\u01a6\u01a8\7G\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8"+
		"l\3\2\2\2\33\2\u0086\u0094\u00a8\u00ae\u00bc\u00ca\u00d6\u00e2\u00ea\u00f6"+
		"\u00fd\u0106\u010d\u0112\u0115\u011a\u0121\u0158\u015e\u0172\u017e\u0191"+
		"\u019d\u01a7\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}