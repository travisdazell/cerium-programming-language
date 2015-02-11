grammar Cerium;

options {
  language = Java;
  output = AST;
  ASTLabelType = CeriumAST;
}

tokens {
  METHOD_DECL; // function definition
  ARG_DECL;    // parameter
  BLOCK;
  MEMBERS;     // class body
  VAR_DECL;
  FIELD_DECL;
  CALL;
  ELIST;       // expression list
  EXPR; 	   // root of an expression
  ASSIGN='=';
  EXTENDS;
  UNARY_MINUS;
  UNARY_NOT;
  INDEX;
}

// each source file consists of one or more class definitions
compilationUnit
    :
    	packageDefinition?
    	importDefinition*
    	(classDefinition)+ EOF
    ;
    
importDefinition
	:
		'import' ID ('.' ID)* '.*'? ';'
	;
    
packageDefinition
	:
		'package' ID ('.' ID)* ';'
	;

// START: class
classDefinition
    :   
    	'class' ID superClass? '{' classMember* '}'			// a class without a defined super class
        -> ^('class' ID superClass? ^(MEMBERS classMember*))	// a class with a super class
    ;

superClass
	:	
		'extends' ID -> ^(EXTENDS ID)
	;
// END: class

// a class member can be either a variable or method that's declared
classMember
	:
		varDeclaration
	|   methodDeclaration
	;

// START: method
methodDeclaration
    :
    	accessModifier? 'def' ID '(' formalParameters? ')' ':' type block
        -> ^(METHOD_DECL type ID formalParameters? block)
    ;
// END: method

accessModifier	:
					'private' | 'protected'
				;

formalParameters
    :   
    	parameter (',' parameter)* -> parameter+
    ;
    
parameter
	:	
		ID ':' type -> ^(ARG_DECL type ID)
	|	ID ':' type '[]' -> ^(ARG_DECL ^('[]' type) ID)		// array type parameter
	;    

// a type can be any primitive type or a user-defined class type
type:   
		'float'
    |   'int'
    |	'void'
    |	'char'
    |	'boolean'
    |	ID // class type name
    ;

// START: block
block
    :
    	'{' statement* '}' -> ^(BLOCK statement*)
    ;
// END: block

// START: var
varDeclaration
    :
    	accessModifier? ID ':' type ('=' expression)? ';' -> ^(VAR_DECL type ID expression?)		// a variable declaration, optionally followed by an initial value
   	|	accessModifier? ID ':' type '[]' ('=' expression)? ';' -> ^(VAR_DECL ^('[]' type) ID expression?)	// an array type with optional initial values
    ;
// END: var

statement
options {backtrack=true;}
    :   
    	block
    |	varDeclaration
    |	'if' '(' expression ')' t=block ('else' f=block)?
    	-> ^('if' expression $t $f?)
    |	'while' '(' expression ')' block
    	-> ^('while' expression block)
    |	'loop' expression 'times' block
    	-> ^('loop' expression block)
    |   'return' expression? ';' -> ^('return' expression?)
    |	lhs '=' expression ';' -> ^('=' lhs expression)
    |   a=postfixExpression ';' -> ^(EXPR postfixExpression) // handles function calls like f(i);
    |   ';'
    ;

lhs :
		postfixExpression -> ^(EXPR postfixExpression)
	;

expressionList
    :
    	expr (',' expr)* -> ^(ELIST expr+)
    |   -> ELIST
    ;

expression
    :
    	expr -> ^(EXPR expr)
    ;
    
expr:
		equalityExpression
	;    
    
equalityExpression
	:	
		relationalExpression (('!='^ | '=='^) relationalExpression)*
	;

relationalExpression
	:	
		additiveExpression ( ('<'^ | '>'^ |	'<='^ |	'>='^)	additiveExpression )*
	;

additiveExpression
	:	
		multiplicativeExpression (('+'^ | '-'^) multiplicativeExpression)*
	;

multiplicativeExpression
	:	
		unaryExpression (('*'^ | '/'^) unaryExpression)*
	;

unaryExpression
	:	
		op='-' unaryExpression -> ^(UNARY_MINUS[$op] unaryExpression)
	|	op='!' unaryExpression -> ^(UNARY_NOT[$op] unaryExpression)
	|	postfixExpression
	;

// START: call
postfixExpression
    :   primary
    	(
    		(	r='('^ expressionList ')'!	{$r.setType(CALL);}
	    	|	r='['^ expr ']'!			{$r.setType(INDEX);}
    		|	r='.'^ ID
    		)
    	)*
    ;
// END: call

primary
    :	ID
    |   INT
    |	FLOAT
    |	CHAR
    |	'true'
    |	'false'
    | 	'(' expr ')' -> expr
    ;

// LEXER RULES

ID  :   
		(LETTER | '_') (LETTER | '0'..'9' | '_')*
    ;

fragment
LETTER  :   
			('a'..'z' | 'A'..'Z')
    	;

CHAR:	'\'' . '\'' ;

INT :   
		'0'..'9'+
    ;

FLOAT
	:	
		INT '.' INT*
	|	'.' INT+
	;

WS  :   
		(' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
    ;

SL_COMMENT
    :   
    	'//' ~('\r'|'\n')* '\r'? '\n' {$channel=HIDDEN;}
    ;

