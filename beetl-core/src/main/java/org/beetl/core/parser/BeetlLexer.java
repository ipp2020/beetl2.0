// Generated from E:\lijz\javamonkey\bee\research\antlrworks2\projects\beetl\BeetlLexer.g4 by ANTLR 4.1
package org.beetl.core.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BeetlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, For=2, Elsefor=3, Else=4, While=5, Switch=6, Select=7, Return=8, 
		Break=9, Continue=10, Var=11, Directive=12, Case=13, Default=14, Try=15, 
		Catch=16, LEFT_BRACE=17, RIGHT_BRACE=18, LEFT_PAR=19, RIGHT_PAR=20, LEFT_SQBR=21, 
		RIGHT_SQBR=22, INCREASE=23, DECREASE=24, VIRTUAL=25, ADD=26, MIN=27, MUlTIP=28, 
		DIV=29, MOD=30, EQUAL=31, NOT_EQUAL=32, ASSIN=33, LARGE_EQUAL=34, LARGE=35, 
		LESS_EQUAL=36, LESS=37, NOT=38, AND=39, OR=40, QUESTOIN=41, AT=42, NULL=43, 
		TRUE=44, FALSE=45, END=46, COMMA=47, COLON=48, PERIOD=49, FOR_IN=50, LEFT_TOKEN=51, 
		RIGHT_TOKEN=52, LEFT_TEXT_TOKEN=53, HexLiteral=54, DecimalLiteral=55, 
		OctalLiteral=56, FloatingPointLiteral=57, StringLiteral=58, Identifier=59, 
		WS=60, LINE_COMMENT=61, COMMENT_OPEN=62, COMMENT_TAG=63, COMMENT_END=64, 
		ALL_COMMENT_CHAR=65, Identifier1=66, PERIOD1=67, LEFT_PAR1=68, RIGHT_PAR1=69, 
		COMMA1=70, LEFT_ANGULAR=71, RIGHT_ANGULAR=72, WS1=73, TYPE_END=74;
	public static final int MODE_COMMENT = 1;
	public static final int MODE_COMMENT_TYPE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "MODE_COMMENT", "MODE_COMMENT_TYPE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'if'", "'for'", "'elsefor'", "'else'", "'while'", "'switch'", "'select'", 
		"'return'", "'break'", "'continue'", "'var'", "Directive", "'case'", "'default'", 
		"'try'", "'catch'", "'{'", "'}'", "LEFT_PAR", "RIGHT_PAR", "'['", "']'", 
		"'++'", "'--'", "'.~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", 
		"'='", "'>='", "LARGE", "'<='", "LESS", "'!'", "'&&'", "'||'", "'?'", 
		"'@'", "'null'", "'true'", "'false'", "';'", "COMMA", "':'", "PERIOD", 
		"'in'", "'<<'", "'>>'", "'<$'", "HexLiteral", "DecimalLiteral", "OctalLiteral", 
		"FloatingPointLiteral", "StringLiteral", "Identifier", "WS", "LINE_COMMENT", 
		"COMMENT_OPEN", "COMMENT_TAG", "COMMENT_END", "ALL_COMMENT_CHAR", "Identifier1", 
		"PERIOD1", "LEFT_PAR1", "RIGHT_PAR1", "COMMA1", "LEFT_ANGULAR", "RIGHT_ANGULAR", 
		"WS1", "TYPE_END"
	};
	public static final String[] ruleNames = {
		"If", "For", "Elsefor", "Else", "While", "Switch", "Select", "Return", 
		"Break", "Continue", "Var", "Directive", "Case", "Default", "Try", "Catch", 
		"LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAR", "RIGHT_PAR", "LEFT_SQBR", "RIGHT_SQBR", 
		"INCREASE", "DECREASE", "VIRTUAL", "ADD", "MIN", "MUlTIP", "DIV", "MOD", 
		"EQUAL", "NOT_EQUAL", "ASSIN", "LARGE_EQUAL", "LARGE", "LESS_EQUAL", "LESS", 
		"NOT", "AND", "OR", "QUESTOIN", "AT", "NULL", "TRUE", "FALSE", "END", 
		"COMMA", "COLON", "PERIOD", "FOR_IN", "LEFT_TOKEN", "RIGHT_TOKEN", "LEFT_TEXT_TOKEN", 
		"HexLiteral", "DecimalLiteral", "OctalLiteral", "HexDigit", "IntegerTypeSuffix", 
		"FloatingPointLiteral", "Exponent", "FloatTypeSuffix", "StringLiteral", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "Identifier", "Letter", 
		"JavaIDDigit", "WS", "LINE_COMMENT", "COMMENT_OPEN", "COMMENT_TAG", "COMMENT_END", 
		"COMMENT_END_CHAR", "TYPE_CHAR", "ALL_COMMENT_CHAR", "Identifier1", "PERIOD1", 
		"LEFT_PAR1", "RIGHT_PAR1", "COMMA1", "LEFT_ANGULAR", "RIGHT_ANGULAR", 
		"WS1", "TYPE_END"
	};


	public BeetlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BeetlLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 68: WS_action((RuleContext)_localctx, actionIndex); break;

		case 69: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 70: COMMENT_OPEN_action((RuleContext)_localctx, actionIndex); break;

		case 71: COMMENT_TAG_action((RuleContext)_localctx, actionIndex); break;

		case 72: COMMENT_END_action((RuleContext)_localctx, actionIndex); break;

		case 75: ALL_COMMENT_CHAR_action((RuleContext)_localctx, actionIndex); break;

		case 79: RIGHT_PAR1_action((RuleContext)_localctx, actionIndex); break;

		case 83: WS1_action((RuleContext)_localctx, actionIndex); break;

		case 84: TYPE_END_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: pushMode(MODE_COMMENT); _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_TAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: pushMode(MODE_COMMENT_TYPE);  break;
		}
	}
	private void TYPE_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: popMode(); _channel = HIDDEN;  break;
		}
	}
	private void RIGHT_PAR1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: popMode();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: popMode(); _channel = HIDDEN;  break;
		}
	}
	private void ALL_COMMENT_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: _channel = HIDDEN;  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}
	private void WS1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2L\u0280\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\6\67"+
		"\u0181\n\67\r\67\16\67\u0182\3\67\5\67\u0186\n\67\38\38\38\78\u018b\n"+
		"8\f8\168\u018e\138\58\u0190\n8\38\58\u0193\n8\39\39\69\u0197\n9\r9\16"+
		"9\u0198\39\59\u019c\n9\3:\3:\3;\3;\3<\6<\u01a3\n<\r<\16<\u01a4\3<\3<\7"+
		"<\u01a9\n<\f<\16<\u01ac\13<\3<\5<\u01af\n<\3<\5<\u01b2\n<\3<\3<\6<\u01b6"+
		"\n<\r<\16<\u01b7\3<\5<\u01bb\n<\3<\5<\u01be\n<\3<\6<\u01c1\n<\r<\16<\u01c2"+
		"\3<\3<\5<\u01c7\n<\3<\6<\u01ca\n<\r<\16<\u01cb\3<\3<\3<\3<\3<\5<\u01d3"+
		"\n<\3<\7<\u01d6\n<\f<\16<\u01d9\13<\3<\3<\7<\u01dd\n<\f<\16<\u01e0\13"+
		"<\5<\u01e2\n<\3<\3<\5<\u01e6\n<\3<\6<\u01e9\n<\r<\16<\u01ea\3<\5<\u01ee"+
		"\n<\5<\u01f0\n<\3=\3=\5=\u01f4\n=\3=\6=\u01f7\n=\r=\16=\u01f8\3>\3>\3"+
		"?\3?\3?\7?\u0200\n?\f?\16?\u0203\13?\3?\3?\3?\3?\7?\u0209\n?\f?\16?\u020c"+
		"\13?\3?\5?\u020f\n?\3@\3@\3@\3@\5@\u0215\n@\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\5A\u0220\nA\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\7C\u022c\nC\fC\16C\u022f\13"+
		"C\3D\3D\3E\3E\3F\6F\u0236\nF\rF\16F\u0237\3F\3F\3G\3G\3G\3G\7G\u0240\n"+
		"G\fG\16G\u0243\13G\3G\5G\u0246\nG\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I"+
		"\3I\3J\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3O\3O\3P"+
		"\3P\3Q\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\6U\u0277\nU\rU\16U\u0278\3U\3U\3"+
		"V\3V\3V\3V\2W\5\3\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b\1\21\t\1\23\n\1\25\13"+
		"\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1%\23\1\'\24\1)\25"+
		"\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34\19\35\1;\36\1=\37\1"+
		"? \1A!\1C\"\1E#\1G$\1I%\1K&\1M\'\1O(\1Q)\1S*\1U+\1W,\1Y-\1[.\1]/\1_\60"+
		"\1a\61\1c\62\1e\63\1g\64\1i\65\1k\66\1m\67\1o8\1q9\1s:\1u\2\1w\2\1y;\1"+
		"{\2\1}\2\1\177<\1\u0081\2\1\u0083\2\1\u0085\2\1\u0087=\1\u0089\2\1\u008b"+
		"\2\1\u008d>\2\u008f?\3\u0091@\4\u0093A\5\u0095B\6\u0097\2\1\u0099\2\1"+
		"\u009bC\7\u009dD\1\u009fE\1\u00a1F\1\u00a3G\b\u00a5H\1\u00a7I\1\u00a9"+
		"J\1\u00abK\t\u00adL\n\5\2\3\4\20\4\2ZZzz\5\2\62;CHch\4\2JJjj\4\2RRrr\4"+
		"\2--//\4\2GGgg\4\2$$^^\4\2))^^\n\2$$))^^ddhhppttvv\16\2&&C\\aac|\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u2001\u3042\u3191\u3302\u3381\u3402\u3d2f\u4e02"+
		"\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8"+
		"\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8"+
		"\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\5\2\13\13\16\17\"\"\u02a0\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2y"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0087\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\3\u0093\3\2\2\2\3\u0095\3\2\2\2\3\u009b\3\2\2\2\4\u009d"+
		"\3\2\2\2\4\u009f\3\2\2\2\4\u00a1\3\2\2\2\4\u00a3\3\2\2\2\4\u00a5\3\2\2"+
		"\2\4\u00a7\3\2\2\2\4\u00a9\3\2\2\2\4\u00ab\3\2\2\2\4\u00ad\3\2\2\2\5\u00af"+
		"\3\2\2\2\7\u00b2\3\2\2\2\t\u00b6\3\2\2\2\13\u00be\3\2\2\2\r\u00c3\3\2"+
		"\2\2\17\u00c9\3\2\2\2\21\u00d0\3\2\2\2\23\u00d7\3\2\2\2\25\u00de\3\2\2"+
		"\2\27\u00e4\3\2\2\2\31\u00ed\3\2\2\2\33\u0103\3\2\2\2\35\u0105\3\2\2\2"+
		"\37\u010a\3\2\2\2!\u0112\3\2\2\2#\u0116\3\2\2\2%\u011c\3\2\2\2\'\u011e"+
		"\3\2\2\2)\u0120\3\2\2\2+\u0122\3\2\2\2-\u0124\3\2\2\2/\u0126\3\2\2\2\61"+
		"\u0128\3\2\2\2\63\u012b\3\2\2\2\65\u012e\3\2\2\2\67\u0131\3\2\2\29\u0133"+
		"\3\2\2\2;\u0135\3\2\2\2=\u0137\3\2\2\2?\u0139\3\2\2\2A\u013b\3\2\2\2C"+
		"\u013e\3\2\2\2E\u0141\3\2\2\2G\u0143\3\2\2\2I\u0146\3\2\2\2K\u0148\3\2"+
		"\2\2M\u014b\3\2\2\2O\u014d\3\2\2\2Q\u014f\3\2\2\2S\u0152\3\2\2\2U\u0155"+
		"\3\2\2\2W\u0157\3\2\2\2Y\u0159\3\2\2\2[\u015e\3\2\2\2]\u0163\3\2\2\2_"+
		"\u0169\3\2\2\2a\u016b\3\2\2\2c\u016d\3\2\2\2e\u016f\3\2\2\2g\u0171\3\2"+
		"\2\2i\u0174\3\2\2\2k\u0177\3\2\2\2m\u017a\3\2\2\2o\u017d\3\2\2\2q\u018f"+
		"\3\2\2\2s\u0194\3\2\2\2u\u019d\3\2\2\2w\u019f\3\2\2\2y\u01ef\3\2\2\2{"+
		"\u01f1\3\2\2\2}\u01fa\3\2\2\2\177\u020e\3\2\2\2\u0081\u0214\3\2\2\2\u0083"+
		"\u021f\3\2\2\2\u0085\u0221\3\2\2\2\u0087\u0228\3\2\2\2\u0089\u0230\3\2"+
		"\2\2\u008b\u0232\3\2\2\2\u008d\u0235\3\2\2\2\u008f\u023b\3\2\2\2\u0091"+
		"\u024b\3\2\2\2\u0093\u0250\3\2\2\2\u0095\u0254\3\2\2\2\u0097\u0258\3\2"+
		"\2\2\u0099\u025b\3\2\2\2\u009b\u0261\3\2\2\2\u009d\u0265\3\2\2\2\u009f"+
		"\u0267\3\2\2\2\u00a1\u0269\3\2\2\2\u00a3\u026b\3\2\2\2\u00a5\u026f\3\2"+
		"\2\2\u00a7\u0271\3\2\2\2\u00a9\u0273\3\2\2\2\u00ab\u0276\3\2\2\2\u00ad"+
		"\u027c\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b1\6\3\2\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5\b\3\2\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\u00bb\7h\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd\n\3\2"+
		"\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7y\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8\16\3\2\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7y\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7e\2\2\u00ce\u00cf\7j\2\2\u00cf\20\3\2\2\2\u00d0\u00d1\7u\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7e\2\2"+
		"\u00d5\u00d6\7v\2\2\u00d6\22\3\2\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7"+
		"g\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd"+
		"\7p\2\2\u00dd\24\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7m\2\2\u00e3\26\3\2\2\2\u00e4\u00e5"+
		"\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\30\3\2\2\2\u00ed\u00ee\7x\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7"+
		"t\2\2\u00f0\32\3\2\2\2\u00f1\u00f2\7F\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4"+
		"\7T\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7E\2\2\u00f6\u00f7\7V\2\2\u00f7"+
		"\u00f8\7K\2\2\u00f8\u00f9\7X\2\2\u00f9\u0104\7G\2\2\u00fa\u00fb\7f\2\2"+
		"\u00fb\u00fc\7k\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7e\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7k\2\2\u0101\u0102\7x\2\2\u0102"+
		"\u0104\7g\2\2\u0103\u00f1\3\2\2\2\u0103\u00fa\3\2\2\2\u0104\34\3\2\2\2"+
		"\u0105\u0106\7e\2\2\u0106\u0107\7c\2\2\u0107\u0108\7u\2\2\u0108\u0109"+
		"\7g\2\2\u0109\36\3\2\2\2\u010a\u010b\7f\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7h\2\2\u010d\u010e\7c\2\2\u010e\u010f\7w\2\2\u010f\u0110\7n\2\2\u0110"+
		"\u0111\7v\2\2\u0111 \3\2\2\2\u0112\u0113\7v\2\2\u0113\u0114\7t\2\2\u0114"+
		"\u0115\7{\2\2\u0115\"\3\2\2\2\u0116\u0117\7e\2\2\u0117\u0118\7c\2\2\u0118"+
		"\u0119\7v\2\2\u0119\u011a\7e\2\2\u011a\u011b\7j\2\2\u011b$\3\2\2\2\u011c"+
		"\u011d\7}\2\2\u011d&\3\2\2\2\u011e\u011f\7\177\2\2\u011f(\3\2\2\2\u0120"+
		"\u0121\7*\2\2\u0121*\3\2\2\2\u0122\u0123\7+\2\2\u0123,\3\2\2\2\u0124\u0125"+
		"\7]\2\2\u0125.\3\2\2\2\u0126\u0127\7_\2\2\u0127\60\3\2\2\2\u0128\u0129"+
		"\7-\2\2\u0129\u012a\7-\2\2\u012a\62\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d"+
		"\7/\2\2\u012d\64\3\2\2\2\u012e\u012f\7\60\2\2\u012f\u0130\7\u0080\2\2"+
		"\u0130\66\3\2\2\2\u0131\u0132\7-\2\2\u01328\3\2\2\2\u0133\u0134\7/\2\2"+
		"\u0134:\3\2\2\2\u0135\u0136\7,\2\2\u0136<\3\2\2\2\u0137\u0138\7\61\2\2"+
		"\u0138>\3\2\2\2\u0139\u013a\7\'\2\2\u013a@\3\2\2\2\u013b\u013c\7?\2\2"+
		"\u013c\u013d\7?\2\2\u013dB\3\2\2\2\u013e\u013f\7#\2\2\u013f\u0140\7?\2"+
		"\2\u0140D\3\2\2\2\u0141\u0142\7?\2\2\u0142F\3\2\2\2\u0143\u0144\7@\2\2"+
		"\u0144\u0145\7?\2\2\u0145H\3\2\2\2\u0146\u0147\7@\2\2\u0147J\3\2\2\2\u0148"+
		"\u0149\7>\2\2\u0149\u014a\7?\2\2\u014aL\3\2\2\2\u014b\u014c\7>\2\2\u014c"+
		"N\3\2\2\2\u014d\u014e\7#\2\2\u014eP\3\2\2\2\u014f\u0150\7(\2\2\u0150\u0151"+
		"\7(\2\2\u0151R\3\2\2\2\u0152\u0153\7~\2\2\u0153\u0154\7~\2\2\u0154T\3"+
		"\2\2\2\u0155\u0156\7A\2\2\u0156V\3\2\2\2\u0157\u0158\7B\2\2\u0158X\3\2"+
		"\2\2\u0159\u015a\7p\2\2\u015a\u015b\7w\2\2\u015b\u015c\7n\2\2\u015c\u015d"+
		"\7n\2\2\u015dZ\3\2\2\2\u015e\u015f\7v\2\2\u015f\u0160\7t\2\2\u0160\u0161"+
		"\7w\2\2\u0161\u0162\7g\2\2\u0162\\\3\2\2\2\u0163\u0164\7h\2\2\u0164\u0165"+
		"\7c\2\2\u0165\u0166\7n\2\2\u0166\u0167\7u\2\2\u0167\u0168\7g\2\2\u0168"+
		"^\3\2\2\2\u0169\u016a\7=\2\2\u016a`\3\2\2\2\u016b\u016c\7.\2\2\u016cb"+
		"\3\2\2\2\u016d\u016e\7<\2\2\u016ed\3\2\2\2\u016f\u0170\7\60\2\2\u0170"+
		"f\3\2\2\2\u0171\u0172\7k\2\2\u0172\u0173\7p\2\2\u0173h\3\2\2\2\u0174\u0175"+
		"\7>\2\2\u0175\u0176\7>\2\2\u0176j\3\2\2\2\u0177\u0178\7@\2\2\u0178\u0179"+
		"\7@\2\2\u0179l\3\2\2\2\u017a\u017b\7>\2\2\u017b\u017c\7&\2\2\u017cn\3"+
		"\2\2\2\u017d\u017e\7\62\2\2\u017e\u0180\t\2\2\2\u017f\u0181\5u:\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0185\3\2\2\2\u0184\u0186\5w;\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186p\3\2\2\2\u0187\u0190\7\62\2\2\u0188\u018c\4\63;\2\u0189"+
		"\u018b\4\62;\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0187\3\2\2\2\u018f\u0188\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0193\5w"+
		";\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193r\3\2\2\2\u0194\u0196"+
		"\7\62\2\2\u0195\u0197\4\629\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2"+
		"\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c"+
		"\5w;\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019ct\3\2\2\2\u019d\u019e"+
		"\t\3\2\2\u019ev\3\2\2\2\u019f\u01a0\t\4\2\2\u01a0x\3\2\2\2\u01a1\u01a3"+
		"\4\62;\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01aa\7\60\2\2\u01a7\u01a9\4"+
		"\62;\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\5{"+
		"=\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0"+
		"\u01b2\5}>\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01f0\3\2\2"+
		"\2\u01b3\u01b5\7\60\2\2\u01b4\u01b6\4\62;\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2"+
		"\2\2\u01b9\u01bb\5{=\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd"+
		"\3\2\2\2\u01bc\u01be\5}>\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01f0\3\2\2\2\u01bf\u01c1\4\62;\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\5{=\2\u01c5\u01c7\5}>\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2"+
		"\u01c7\u01f0\3\2\2\2\u01c8\u01ca\4\62;\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01f0\5}>\2\u01ce\u01cf\7\62\2\2\u01cf\u01d3\7z\2\2\u01d0\u01d1\7\62"+
		"\2\2\u01d1\u01d3\7Z\2\2\u01d2\u01ce\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d7\3\2\2\2\u01d4\u01d6\5u:\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2"+
		"\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01e1\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01da\u01de\7\60\2\2\u01db\u01dd\5u:\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01da\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e5\t\5\2\2\u01e4\u01e6\t\6\2\2\u01e5\u01e4\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\4\62;\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ee\5}>\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01a2\3\2\2\2\u01ef\u01b3\3\2\2\2\u01ef"+
		"\u01c0\3\2\2\2\u01ef\u01c9\3\2\2\2\u01ef\u01d2\3\2\2\2\u01f0z\3\2\2\2"+
		"\u01f1\u01f3\t\7\2\2\u01f2\u01f4\t\6\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f7\4\62;\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9|\3\2\2\2"+
		"\u01fa\u01fb\t\4\2\2\u01fb~\3\2\2\2\u01fc\u0201\7$\2\2\u01fd\u0200\5\u0081"+
		"@\2\u01fe\u0200\n\b\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0204\u020f\7$\2\2\u0205\u020a\7)\2\2\u0206\u0209"+
		"\5\u0081@\2\u0207\u0209\n\t\2\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2"+
		"\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\7)\2\2\u020e\u01fc\3\2\2\2\u020e"+
		"\u0205\3\2\2\2\u020f\u0080\3\2\2\2\u0210\u0211\7^\2\2\u0211\u0215\t\n"+
		"\2\2\u0212\u0215\5\u0085B\2\u0213\u0215\5\u0083A\2\u0214\u0210\3\2\2\2"+
		"\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u0082\3\2\2\2\u0216\u0217"+
		"\7^\2\2\u0217\u0218\4\62\65\2\u0218\u0219\4\629\2\u0219\u0220\4\629\2"+
		"\u021a\u021b\7^\2\2\u021b\u021c\4\629\2\u021c\u0220\4\629\2\u021d\u021e"+
		"\7^\2\2\u021e\u0220\4\629\2\u021f\u0216\3\2\2\2\u021f\u021a\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u0220\u0084\3\2\2\2\u0221\u0222\7^\2\2\u0222\u0223\7w\2"+
		"\2\u0223\u0224\5u:\2\u0224\u0225\5u:\2\u0225\u0226\5u:\2\u0226\u0227\5"+
		"u:\2\u0227\u0086\3\2\2\2\u0228\u022d\5\u0089D\2\u0229\u022c\5\u0089D\2"+
		"\u022a\u022c\5\u008bE\2\u022b\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c"+
		"\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0088\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u0230\u0231\t\13\2\2\u0231\u008a\3\2\2\2\u0232"+
		"\u0233\t\f\2\2\u0233\u008c\3\2\2\2\u0234\u0236\t\r\2\2\u0235\u0234\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\bF\2\2\u023a\u008e\3\2\2\2\u023b\u023c\7\61"+
		"\2\2\u023c\u023d\7\61\2\2\u023d\u0241\3\2\2\2\u023e\u0240\n\16\2\2\u023f"+
		"\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0246\7\17\2\2\u0245"+
		"\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7\f"+
		"\2\2\u0248\u0249\3\2\2\2\u0249\u024a\bG\3\2\u024a\u0090\3\2\2\2\u024b"+
		"\u024c\7\61\2\2\u024c\u024d\7,\2\2\u024d\u024e\3\2\2\2\u024e\u024f\bH"+
		"\4\2\u024f\u0092\3\2\2\2\u0250\u0251\5\u0099L\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\bI\5\2\u0253\u0094\3\2\2\2\u0254\u0255\5\u0097K\2\u0255\u0256\3"+
		"\2\2\2\u0256\u0257\bJ\6\2\u0257\u0096\3\2\2\2\u0258\u0259\7,\2\2\u0259"+
		"\u025a\7\61\2\2\u025a\u0098\3\2\2\2\u025b\u025c\7B\2\2\u025c\u025d\7v"+
		"\2\2\u025d\u025e\7{\2\2\u025e\u025f\7r\2\2\u025f\u0260\7g\2\2\u0260\u009a"+
		"\3\2\2\2\u0261\u0262\13\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\bM\7\2\u0264"+
		"\u009c\3\2\2\2\u0265\u0266\5\u0087C\2\u0266\u009e\3\2\2\2\u0267\u0268"+
		"\7\60\2\2\u0268\u00a0\3\2\2\2\u0269\u026a\7*\2\2\u026a\u00a2\3\2\2\2\u026b"+
		"\u026c\7+\2\2\u026c\u026d\3\2\2\2\u026d\u026e\bQ\b\2\u026e\u00a4\3\2\2"+
		"\2\u026f\u0270\7.\2\2\u0270\u00a6\3\2\2\2\u0271\u0272\7>\2\2\u0272\u00a8"+
		"\3\2\2\2\u0273\u0274\7@\2\2\u0274\u00aa\3\2\2\2\u0275\u0277\t\17\2\2\u0276"+
		"\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a\u027b\bU\t\2\u027b\u00ac\3\2\2\2\u027c"+
		"\u027d\t\16\2\2\u027d\u027e\3\2\2\2\u027e\u027f\bV\n\2\u027f\u00ae\3\2"+
		"\2\2.\2\3\4\u0103\u0182\u0185\u018c\u018f\u0192\u0198\u019b\u01a4\u01aa"+
		"\u01ae\u01b1\u01b7\u01ba\u01bd\u01c2\u01c6\u01cb\u01d2\u01d7\u01de\u01e1"+
		"\u01e5\u01ea\u01ed\u01ef\u01f3\u01f8\u01ff\u0201\u0208\u020a\u020e\u0214"+
		"\u021f\u022b\u022d\u0237\u0241\u0245\u0278";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}