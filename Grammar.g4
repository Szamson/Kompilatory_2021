grammar Grammar;

start: statements;

statements : statement
           | statements statement
           ;
statement : if_statement
          | while_statement
          | action
		  | function
          ;
if_statement : IF '<' cond_help '>' '(' statements ')' ;
while_statement : WHILE '<' cond_help '>' '(' statements ')' ;

cond_help : NEGATION condition
		  | condition
		  | cond_help OR cond_help
		  | cond_help AND cond_help
		  ;

condition : WALL
		  | ENEMY
		  | TRAP;

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

NAME:       [a-zA-Z]+[a-zA-Z0-9]*    ;
WHITESPACE          : (' ' | '\t') -> skip ;
NEWLINE             : ('\r'? '\n' | '\r')+ -> skip ;