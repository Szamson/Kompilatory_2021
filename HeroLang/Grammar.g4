grammar Grammar;

statements : statement+
           ;
statement : if_statement
          | while_statement
          | action
		  | function
		  | function_call
		  | for_statement
		  | print_statement
          ;

function_call: NAME;
if_statement : IF '<' bracket_cond '>' '(' statements ')' ;
while_statement : WHILE '<' bracket_cond '>' '(' statements ')' ;
for_statement: FOR '<' NUMBER '>' '(' statements ')' ;
print_statement: PRINT '<' SOME_STRING '>' ;

bracket_cond: '[' bracket_cond ']'
            | NEGATION '[' bracket_cond ']'
            | bracket_cond OR bracket_cond
            | bracket_cond AND bracket_cond
            | cond_help
            ;

cond_help : NEGATION condition
		  | condition
		  | cond_help OR cond_help
		  | cond_help AND cond_help
		  ;

condition : WALL
		  | ENEMY
		  | TRAP
		  |TREASURE
		  | TRUE
		  | FALSE
		  ;

action : FORWARD
       | TURN direction
       | ATTACK
       | DISARM
       ;
direction : LEFT
          | RIGHT
          ;
function : FUN NAME '(' statements ')' ;



COMMENT:     '//'.? -> skip;
IF:         'if';
WHILE:      'while';
NEGATION:   'NO';
WALL:       'WALL';
ENEMY:      'ENEMY';
TREASURE:   'TREASURE';
TRAP:       'TRAP';
AND:		'AND';
OR:		    'OR';
FORWARD:    'forward';
TURN:       'turn';
ATTACK:     'attack';
DISARM:     'disarm';
LEFT:       'left';
RIGHT:      'right';
FUN:        'fun';
TRUE:       'TRUE';
FALSE:      'FALSE';
FOR:         'FOR';
PRINT:      'PRINT';

NAME:       [a-zA-Z]+[a-zA-Z0-9]*    ;
NUMBER:     [1-9][0-9]* ;
SOME_STRING: '"' ( ~[\\"] | '\\' . )* '"' ;
WHITESPACE          : (' ' | '\t') -> skip ;
NEWLINE             : ('\r'? '\n' | '\r')+ -> skip ;