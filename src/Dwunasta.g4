grammar Dwunasta;

prog: start
    ;

start: (( expr SEMICOLON ) | function | (struct SEMICOLON))*
;

expr:
         LOOP_BEGIN repetitions start LOOP_END #loop
        | IF equal THEN blockif ENDIF #if
        |ID ASSIGN math_stmnt		#assign
        | PRINT ID LEFT_SQ_BRCKT INT RIGHT_SQ_BRCKT #print_arr_val
        | ID ASSIGN STRING #assign_string
	    | PRINT ID   		#print
	    | READ ID          #read
	    | ID              #call
;


struct: STRUCTURE ID '{' struct_block '}' # struct_delaration
       | STRUCTURE ID ID # structure_call
    ;

declaration: ID
    ;

struct_block: (declaration SEMICOLON)*
    ;


function: BEGINFUNCTION fparam fblock ENDFUNCTION
    ;

blockif: start
    ;

math_stmnt:  value			#single0
      | value ADD value		#add
      | value SUB value  # sub
;

equal: ID '==' INT
    ;

repetitions: INT
    ;

value:   INT			#int
       | REAL			#real
       | STRING   #string
       | ARRAY          #array
       | CASTINT value		#castint
       | CASTREAL value		#castreal
       | '(' math_stmnt ')'		#par
       | ID #id_assign
;

fparam: ID
    ;

fblock: (expr SEMICOLON)*
    ;

IF: 'if'
    ;

ENDIF: 'endif'
    ;

THEN: 'then'
    ;

BEGINFUNCTION: 'beginf'
    ;

LOOP_BEGIN: 'loop'
    ;

LOOP_END: 'endloop'
    ;

ENDFUNCTION: 'endf'
    ;

PRINT:	'print'
    ;

LEFT_SQ_BRCKT: '['
    ;

RIGHT_SQ_BRCKT: ']'
    ;

READ : 'scan'
;

ARRAY :  '['(('0'..'9')+','?)+']'
;

CASTINT: '(int)'
    ;

ASSIGN: '='
    ;

STRUCTURE: 'struct'
    ;

CASTREAL: '(real)'
    ;

ID:   ('a'..'z'|'A'..'Z'|'.')+
   ;

REAL: '0'..'9'+'.''0'..'9'+
    ;

INT: '0'..'9'+
    ;

ADD: '+'
    ;
SEMICOLON: ';'
    ;


SUB: '-'
    ;

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;

WS:   [ \t\r\n]+ -> skip
    ;

STRUCTEND : 'endstr'
    ;

STRUCTSTART : 'startstr'
    ;