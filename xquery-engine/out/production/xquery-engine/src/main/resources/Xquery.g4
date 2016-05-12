/*
 * XPath grammar
 * Filename: XPath.g4
 * Author: Yuchun Li, Meng Xue
 * Date: Apr 29, 2015
 */

grammar Xquery;

xq
    : '$' var           # XQVariable
    | StringConstant    # XQStrConst
    | ap                # XQAp
    | '(' xq ')'        # XQWithPar
    | xq ',' xq         # TwoXQ
    | xq '/' rp         # XQRp
    | xq '//' rp        # XQRpAll
    | '<' NAME '>' '{' xq '}' '<' '/' NAME '>'              # XQTag
    | forClause letClause? whereClause returnClause?        #FLWR
    | letClause xq      #XQLet
    ;

var
    : NAME
    ;

forClause
    : 'for' '$' var 'in' xq (',' '$' var 'in' xq)*
    ;

letClause
    : 'let' '$' var ':=' xq (',' '$' var ':=' xq)*
    ;

whereClause
    : 'where' cond
    ;

returnClause
    : 'return' xq
    ;

cond
    : xq '=' xq         #XQCondEqual
    | xq 'eq' xq        #XQCondEqual
    | xq '==' xq        #XQCondIs
    | xq 'is' xq        #XQCondIs
    | 'empty' '(' xq ')'    #XQCondEmpty
    | 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond    #XQCondSome
    | '(' cond ')'      #XQCondWithPar
    | cond 'and' cond   #XQCondAnd
    | cond 'or' cond    #XQCondOR
    | 'not' cond        #XQCondNot
    ;

StringConstant
    : '"'+[a-zA-Z0-9,.!?; ''""-]+'"'
    ;

ap
	: 'document("' fname '"' ')' '/' rp 		# APChildren
	| 'document("' fname '"' ')' '//' rp		# APAll
	;


fname
	:  NAME ('.' NAME)?
	;

rp
	: NAME 				# TagName
	| '@' NAME 			# Attribute
	| '*' 				# AllChildren
	| '.' 				# Current
	| '..' 				# Parent
	| TXT 				# Text
	| '(' rp ')' 		# RPwithPar
	| rp '/' rp 		# RPChildren
	| rp '//' rp 		# RPAll
	| rp '[' fltr ']' 	# RPCondition
	| rp ',' rp 		# TwoRP
	;

fltr
	: rp 				# FRP
	| rp '=' rp 		# FRPequal
	| rp 'eq' rp 		# FRPequal
	| rp '==' rp 		# FRPis
	| rp 'is' rp 		# FRPis
	| '(' fltr ')' 		# FRPwithPar
	| fltr 'and' fltr 	# FRPand
	| fltr 'or' fltr 	# FRPor
	| 'not' fltr 		# FRPnot
	| rp '=' constant	# FRPconst
	;

constant
	: '"' NAME '"'
	;


NUM:    [0-9]+;
TXT:	'text()';
NAME:	[a-zA-Z0-9_-]+;
WS  :   [ \t\r\n]+ -> skip;