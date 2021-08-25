// Generated from Micro.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Program=2, Begin=3, End=4, Function=5, Read=6, Write=7, If=8, 
		ElseIf=9, EndIf=10, Do=11, While=12, Continue=13, Break=14, Return=15, 
		Int=16, Void=17, String=18, Float=19, True=20, False=21, Identifier=22, 
		IntLiteral=23, FloatLiteral=24, StringLiteral=25, Comment=26, WhiteSpace=27, 
		LeftParen=28, RightParen=29, LeftBracket=30, RightBracket=31, LeftBrace=32, 
		RightBrace=33, Less=34, LessEqual=35, Greater=36, GreaterEqual=37, LeftShift=38, 
		RightShift=39, Plus=40, PlusPlus=41, Minus=42, MinusMinus=43, Star=44, 
		Div=45, Mod=46, And=47, Or=48, AndAnd=49, OrOr=50, Caret=51, Not=52, Tilde=53, 
		Assign=54, StarAssign=55, DivAssign=56, ModAssign=57, PlusAssign=58, MinusAssign=59, 
		LeftShiftAssign=60, RightShiftAssign=61, AndAssign=62, XorAssign=63, OrAssign=64, 
		Equal=65, NotEqual=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Program", "Begin", "End", "Function", "Read", "Write", "If", 
			"ElseIf", "EndIf", "Do", "While", "Continue", "Break", "Return", "Int", 
			"Void", "String", "Float", "True", "False", "Identifier", "IntLiteral", 
			"FloatLiteral", "StringLiteral", "Comment", "WhiteSpace", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
			"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
			"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM_BODY'", "'PROGRAM'", "'BEGIN'", "'END'", "'FUNCTION'", 
			"'READ'", "'WRITE'", "'IF'", "'ELSEIF'", "'ENDIF'", "'DO'", "'WHILE'", 
			"'CONTINUE'", "'BREAK'", "'RETURN'", "'INT'", "'VOID'", "'STRING'", "'Float'", 
			"'True'", "'False'", null, null, null, null, null, null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", 
			"'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", 
			"'||'", "'^'", "'!'", "'~'", "':='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Program", "Begin", "End", "Function", "Read", "Write", "If", 
			"ElseIf", "EndIf", "Do", "While", "Continue", "Break", "Return", "Int", 
			"Void", "String", "Float", "True", "False", "Identifier", "IntLiteral", 
			"FloatLiteral", "StringLiteral", "Comment", "WhiteSpace", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
			"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
			"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual"
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


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01a1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\7\27\u010d\n\27\f\27\16\27\u0110\13\27\3\30\6\30\u0113\n\30\r\30\16\30"+
		"\u0114\3\31\7\31\u0118\n\31\f\31\16\31\u011b\13\31\3\31\3\31\6\31\u011f"+
		"\n\31\r\31\16\31\u0120\3\32\3\32\7\32\u0125\n\32\f\32\16\32\u0128\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\6\33\u0130\n\33\r\33\16\33\u0131\3\33\3"+
		"\33\3\34\6\34\u0137\n\34\r\34\16\34\u0138\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3="+
		"\3=\3>\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\2\2D\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\3\2\b\4\2C\\c|\5\2\62;C\\c|\3\2"+
		"\62;\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01a7\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087"+
		"\3\2\2\2\5\u0094\3\2\2\2\7\u009c\3\2\2\2\t\u00a2\3\2\2\2\13\u00a6\3\2"+
		"\2\2\r\u00af\3\2\2\2\17\u00b4\3\2\2\2\21\u00ba\3\2\2\2\23\u00bd\3\2\2"+
		"\2\25\u00c4\3\2\2\2\27\u00ca\3\2\2\2\31\u00cd\3\2\2\2\33\u00d3\3\2\2\2"+
		"\35\u00dc\3\2\2\2\37\u00e2\3\2\2\2!\u00e9\3\2\2\2#\u00ed\3\2\2\2%\u00f2"+
		"\3\2\2\2\'\u00f9\3\2\2\2)\u00ff\3\2\2\2+\u0104\3\2\2\2-\u010a\3\2\2\2"+
		"/\u0112\3\2\2\2\61\u0119\3\2\2\2\63\u0122\3\2\2\2\65\u012b\3\2\2\2\67"+
		"\u0136\3\2\2\29\u013c\3\2\2\2;\u013e\3\2\2\2=\u0140\3\2\2\2?\u0142\3\2"+
		"\2\2A\u0144\3\2\2\2C\u0146\3\2\2\2E\u0148\3\2\2\2G\u014a\3\2\2\2I\u014d"+
		"\3\2\2\2K\u014f\3\2\2\2M\u0152\3\2\2\2O\u0155\3\2\2\2Q\u0158\3\2\2\2S"+
		"\u015a\3\2\2\2U\u015d\3\2\2\2W\u015f\3\2\2\2Y\u0162\3\2\2\2[\u0164\3\2"+
		"\2\2]\u0166\3\2\2\2_\u0168\3\2\2\2a\u016a\3\2\2\2c\u016c\3\2\2\2e\u016f"+
		"\3\2\2\2g\u0172\3\2\2\2i\u0174\3\2\2\2k\u0176\3\2\2\2m\u0178\3\2\2\2o"+
		"\u017b\3\2\2\2q\u017e\3\2\2\2s\u0181\3\2\2\2u\u0184\3\2\2\2w\u0187\3\2"+
		"\2\2y\u018a\3\2\2\2{\u018e\3\2\2\2}\u0192\3\2\2\2\177\u0195\3\2\2\2\u0081"+
		"\u0198\3\2\2\2\u0083\u019b\3\2\2\2\u0085\u019e\3\2\2\2\u0087\u0088\7R"+
		"\2\2\u0088\u0089\7T\2\2\u0089\u008a\7Q\2\2\u008a\u008b\7I\2\2\u008b\u008c"+
		"\7T\2\2\u008c\u008d\7C\2\2\u008d\u008e\7O\2\2\u008e\u008f\7a\2\2\u008f"+
		"\u0090\7D\2\2\u0090\u0091\7Q\2\2\u0091\u0092\7F\2\2\u0092\u0093\7[\2\2"+
		"\u0093\4\3\2\2\2\u0094\u0095\7R\2\2\u0095\u0096\7T\2\2\u0096\u0097\7Q"+
		"\2\2\u0097\u0098\7I\2\2\u0098\u0099\7T\2\2\u0099\u009a\7C\2\2\u009a\u009b"+
		"\7O\2\2\u009b\6\3\2\2\2\u009c\u009d\7D\2\2\u009d\u009e\7G\2\2\u009e\u009f"+
		"\7I\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7P\2\2\u00a1\b\3\2\2\2\u00a2\u00a3"+
		"\7G\2\2\u00a3\u00a4\7P\2\2\u00a4\u00a5\7F\2\2\u00a5\n\3\2\2\2\u00a6\u00a7"+
		"\7H\2\2\u00a7\u00a8\7W\2\2\u00a8\u00a9\7P\2\2\u00a9\u00aa\7E\2\2\u00aa"+
		"\u00ab\7V\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7Q\2\2\u00ad\u00ae\7P\2\2"+
		"\u00ae\f\3\2\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7C"+
		"\2\2\u00b2\u00b3\7F\2\2\u00b3\16\3\2\2\2\u00b4\u00b5\7Y\2\2\u00b5\u00b6"+
		"\7T\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7G\2\2\u00b9"+
		"\20\3\2\2\2\u00ba\u00bb\7K\2\2\u00bb\u00bc\7H\2\2\u00bc\22\3\2\2\2\u00bd"+
		"\u00be\7G\2\2\u00be\u00bf\7N\2\2\u00bf\u00c0\7U\2\2\u00c0\u00c1\7G\2\2"+
		"\u00c1\u00c2\7K\2\2\u00c2\u00c3\7H\2\2\u00c3\24\3\2\2\2\u00c4\u00c5\7"+
		"G\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7F\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9"+
		"\7H\2\2\u00c9\26\3\2\2\2\u00ca\u00cb\7F\2\2\u00cb\u00cc\7Q\2\2\u00cc\30"+
		"\3\2\2\2\u00cd\u00ce\7Y\2\2\u00ce\u00cf\7J\2\2\u00cf\u00d0\7K\2\2\u00d0"+
		"\u00d1\7N\2\2\u00d1\u00d2\7G\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7E\2\2\u00d4"+
		"\u00d5\7Q\2\2\u00d5\u00d6\7P\2\2\u00d6\u00d7\7V\2\2\u00d7\u00d8\7K\2\2"+
		"\u00d8\u00d9\7P\2\2\u00d9\u00da\7W\2\2\u00da\u00db\7G\2\2\u00db\34\3\2"+
		"\2\2\u00dc\u00dd\7D\2\2\u00dd\u00de\7T\2\2\u00de\u00df\7G\2\2\u00df\u00e0"+
		"\7C\2\2\u00e0\u00e1\7M\2\2\u00e1\36\3\2\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4"+
		"\7G\2\2\u00e4\u00e5\7V\2\2\u00e5\u00e6\7W\2\2\u00e6\u00e7\7T\2\2\u00e7"+
		"\u00e8\7P\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7P\2\2\u00eb"+
		"\u00ec\7V\2\2\u00ec\"\3\2\2\2\u00ed\u00ee\7X\2\2\u00ee\u00ef\7Q\2\2\u00ef"+
		"\u00f0\7K\2\2\u00f0\u00f1\7F\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7U\2\2\u00f3"+
		"\u00f4\7V\2\2\u00f4\u00f5\7T\2\2\u00f5\u00f6\7K\2\2\u00f6\u00f7\7P\2\2"+
		"\u00f7\u00f8\7I\2\2\u00f8&\3\2\2\2\u00f9\u00fa\7H\2\2\u00fa\u00fb\7n\2"+
		"\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7v\2\2\u00fe(\3\2"+
		"\2\2\u00ff\u0100\7V\2\2\u0100\u0101\7t\2\2\u0101\u0102\7w\2\2\u0102\u0103"+
		"\7g\2\2\u0103*\3\2\2\2\u0104\u0105\7H\2\2\u0105\u0106\7c\2\2\u0106\u0107"+
		"\7n\2\2\u0107\u0108\7u\2\2\u0108\u0109\7g\2\2\u0109,\3\2\2\2\u010a\u010e"+
		"\t\2\2\2\u010b\u010d\t\3\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f.\3\2\2\2\u0110\u010e\3\2\2\2"+
		"\u0111\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\60\3\2\2\2\u0116\u0118\t\4\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\7\60\2\2\u011d"+
		"\u011f\t\4\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\62\3\2\2\2\u0122\u0126\7$\2\2\u0123\u0125"+
		"\n\5\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7$"+
		"\2\2\u012a\64\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d\7/\2\2\u012d\u012f"+
		"\3\2\2\2\u012e\u0130\n\6\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b\33"+
		"\2\2\u0134\66\3\2\2\2\u0135\u0137\t\7\2\2\u0136\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\b\34\2\2\u013b8\3\2\2\2\u013c\u013d\7*\2\2\u013d:\3\2\2\2\u013e"+
		"\u013f\7+\2\2\u013f<\3\2\2\2\u0140\u0141\7]\2\2\u0141>\3\2\2\2\u0142\u0143"+
		"\7_\2\2\u0143@\3\2\2\2\u0144\u0145\7}\2\2\u0145B\3\2\2\2\u0146\u0147\7"+
		"\177\2\2\u0147D\3\2\2\2\u0148\u0149\7>\2\2\u0149F\3\2\2\2\u014a\u014b"+
		"\7>\2\2\u014b\u014c\7?\2\2\u014cH\3\2\2\2\u014d\u014e\7@\2\2\u014eJ\3"+
		"\2\2\2\u014f\u0150\7@\2\2\u0150\u0151\7?\2\2\u0151L\3\2\2\2\u0152\u0153"+
		"\7>\2\2\u0153\u0154\7>\2\2\u0154N\3\2\2\2\u0155\u0156\7@\2\2\u0156\u0157"+
		"\7@\2\2\u0157P\3\2\2\2\u0158\u0159\7-\2\2\u0159R\3\2\2\2\u015a\u015b\7"+
		"-\2\2\u015b\u015c\7-\2\2\u015cT\3\2\2\2\u015d\u015e\7/\2\2\u015eV\3\2"+
		"\2\2\u015f\u0160\7/\2\2\u0160\u0161\7/\2\2\u0161X\3\2\2\2\u0162\u0163"+
		"\7,\2\2\u0163Z\3\2\2\2\u0164\u0165\7\61\2\2\u0165\\\3\2\2\2\u0166\u0167"+
		"\7\'\2\2\u0167^\3\2\2\2\u0168\u0169\7(\2\2\u0169`\3\2\2\2\u016a\u016b"+
		"\7~\2\2\u016bb\3\2\2\2\u016c\u016d\7(\2\2\u016d\u016e\7(\2\2\u016ed\3"+
		"\2\2\2\u016f\u0170\7~\2\2\u0170\u0171\7~\2\2\u0171f\3\2\2\2\u0172\u0173"+
		"\7`\2\2\u0173h\3\2\2\2\u0174\u0175\7#\2\2\u0175j\3\2\2\2\u0176\u0177\7"+
		"\u0080\2\2\u0177l\3\2\2\2\u0178\u0179\7<\2\2\u0179\u017a\7?\2\2\u017a"+
		"n\3\2\2\2\u017b\u017c\7,\2\2\u017c\u017d\7?\2\2\u017dp\3\2\2\2\u017e\u017f"+
		"\7\61\2\2\u017f\u0180\7?\2\2\u0180r\3\2\2\2\u0181\u0182\7\'\2\2\u0182"+
		"\u0183\7?\2\2\u0183t\3\2\2\2\u0184\u0185\7-\2\2\u0185\u0186\7?\2\2\u0186"+
		"v\3\2\2\2\u0187\u0188\7/\2\2\u0188\u0189\7?\2\2\u0189x\3\2\2\2\u018a\u018b"+
		"\7>\2\2\u018b\u018c\7>\2\2\u018c\u018d\7?\2\2\u018dz\3\2\2\2\u018e\u018f"+
		"\7@\2\2\u018f\u0190\7@\2\2\u0190\u0191\7?\2\2\u0191|\3\2\2\2\u0192\u0193"+
		"\7(\2\2\u0193\u0194\7?\2\2\u0194~\3\2\2\2\u0195\u0196\7`\2\2\u0196\u0197"+
		"\7?\2\2\u0197\u0080\3\2\2\2\u0198\u0199\7~\2\2\u0199\u019a\7?\2\2\u019a"+
		"\u0082\3\2\2\2\u019b\u019c\7?\2\2\u019c\u019d\7?\2\2\u019d\u0084\3\2\2"+
		"\2\u019e\u019f\7#\2\2\u019f\u01a0\7?\2\2\u01a0\u0086\3\2\2\2\n\2\u010e"+
		"\u0114\u0119\u0120\u0126\u0131\u0138\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}