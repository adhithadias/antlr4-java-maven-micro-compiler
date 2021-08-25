grammar Micro;

program: Program id Begin program_body End;
id: Identifier;
program_body: 'PROGRAM_BODY';

Program : 'PROGRAM';
Begin : 'BEGIN';
End : 'END';
Function : 'FUNCTION';
Read : 'READ';
Write : 'WRITE';
If : 'IF';
ElseIf : 'ELSEIF';
EndIf : 'ENDIF';
Do : 'DO';
While : 'WHILE';
Continue : 'CONTINUE';
Break : 'BREAK';
Return : 'RETURN';
Int : 'INT';
Void : 'VOID';
String : 'STRING';
Float : 'Float';
True : 'True';
False : 'False';

Identifier: [a-zA-Z][a-zA-Z0-9]*;

IntLiteral: [0-9]+;

FloatLiteral: [0-9]*'.'[0-9]+;

StringLiteral: '"'(~'"')*'"';

Comment: '--' ~('\n' | '\r')+ -> skip;

WhiteSpace: ('\t' | '\n' | ' ' | '\r' )+ -> skip;

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Assign : ':=';
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Equal : '==';
NotEqual : '!=';


