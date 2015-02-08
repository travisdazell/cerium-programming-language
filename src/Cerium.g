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
    	(classDefinition)+ EOF
    ;

// START: class
classDefinition
    :   
    	'class' ID superClass? '{' classMember+ '}' ';'			// a class without a defined super class
        -> ^('class' ID superClass? ^(MEMBERS classMember+))	// a class with a super class
    ;

superClass
	:	
		':' 'public' ID -> ^(EXTENDS ID)
	;
// END: class

// a class member can be either a variable or method that's declared
classMember
	:	
		varDeclaration
	|	methodDeclaration
	;
	
// START: method
methodDeclaration
    :   
    	type ID '(' formalParameters? ')' block
        -> ^(METHOD_DECL type ID formalParameters? block)
    ;
// END: method

formalParameters
    :   
    	parameter (',' parameter)* -> parameter+
    ;
    
parameter
	:	
		type ID		 -> ^(ARG_DECL type ID)
	|	type ID '[]' -> ^(ARG_DECL ^('[]' type) ID)		// array type parameter
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
    	type ID ('=' expression)? ';' -> ^(VAR_DECL type ID expression?)		// a variable declaration, optionally followed by an initial value
   	|	type ID '[]' ('=' expression)? ';' -> ^(VAR_DECL ^('[]' type) ID expression?)	// an array type with optional initial values
    ;
// END: var

statement
options {backtrack=true;} // hard to distinguish struct from var from left
    :   
    	block
    |	varDeclaration
    |	'if' '(' expression ')' t=block ('else' f=block)?
    	-> ^('if' expression $t $f?)
    |	'while' '(' expression ')' block
    	-> ^('while' expression block)
    |   'return' expression? ';' -> ^('return' expression?)
    |	lhs '=' expression ';' -> ^('=' lhs expression)
    |   a=postfixExpression // handles function calls like f(i);
        (   '=' expression -> ^('=' postfixExpression expression)
        |   -> ^(EXPR postfixExpression)
        )
        ';' 
    |	';' -> // empty statement      
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
		additiveExpression
		(	(	(	'<'^
				|	'>'^
				|	'<='^
				|	'>='^
				)
				additiveExpression
			)*
		)
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

suffix[CommonTree expr]
options {backtrack=true;}
	:	'.' ID '(' expressionList ')' -> ^(CALL ^('.' {$expr} ID))
	|	'.' ID						  -> ^('.' {$expr} ID)
	|	'(' expressionList ')'        -> ^(CALL {$expr})
	;
	
primary
    :   
    	ID
    |   INT
    |	FLOAT
    |	CHAR
    |	'true'
    |	'false'
    |	'(' expression ')'
    ;

// LEXER RULES

ID  :   
		LETTER (LETTER | '0'..'9')*
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

