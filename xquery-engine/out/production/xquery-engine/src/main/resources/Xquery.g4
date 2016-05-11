/*
 * XPath grammar
 * Filename: XPath.g4
 * Author: Yuchun Li, Meng Xue
 * Date: Apr 29, 2015
 */

grammar Xquery;

ap
	: doc '/' rp 		# APChildren
	| doc '//' rp		# APAll
	;

doc
	: DOC '(' '"' fname '"' ')'
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
	| rp '[' NUM ']'	# RPindex
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

/*
 * XQuery grammar
 * Author: Yuchun Li, Meng Xue
 * Date: Apr 29, 2015
 */

 prog
 	: xq NEWLINE*
 	;

 xq
 	: '$' var			# Variable
 	| SCONST		# StringConst
 	| ap			# XQAP
 	| '(' xq ')'	# XQwithPar
 	| xq '/' rp		# XQRP
 	| xq '//' rp    #XQRPall
 	| xq ',' NEWLINE* xq		# TwoXQ
 	| '<' NAME '>' NEWLINE* '{' NEWLINE* xq NEWLINE* '}' NEWLINE* '</' NAME '>'	# Result
 	| forClause letClause? whereClause? returnClause	# XQuery
 	| letClause xq	# XQLet
 	| 'join(' NEWLINE* xq ',' NEWLINE* xq ',' NEWLINE* vlist ',' vlist NEWLINE* ')' # join
 	;

 vlist
 	: '[' var (',' var)* ']'
 	;

 var
 	:  NAME
 	;

 forClause
 	: 'for' '$' var 'in' xq (',' NEWLINE* '$' var 'in' xq )* NEWLINE*
 	;

 letClause
 	: 'let' '$' var ':=' xq (',' NEWLINE* '$' var ':=' xq)* NEWLINE*
 	;

 whereClause
 	: 'where' cond NEWLINE*
 	;

 returnClause
 	: 'return' NEWLINE* xq (NEWLINE* xq)*
 	;

 cond
 	: xq '=' xq				# Condequal
 	| xq 'eq' xq			# Condequal
 	| xq '==' xq			# Condis
 	| xq 'is' xq			# Condis
 	| 'empty' NEWLINE* '(' NEWLINE* xq NEWLINE* ')'	# CondEmpty
 	| 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond	# CondSome
 	| '(' cond ')'			# CondwithPar
 	| cond 'and' cond		# Condand
 	| cond 'or' cond		# Condor
 	| 'not' cond			# Condnot
 	;


NUM:    [0-9]+;
DOC:	'document';
TXT:	'text()';
NAME:	[a-zA-Z0-9_-]+;
OPAR: 	'(';
CPAR: 	')';
OBRAC:	'[';
CBRAC:	']';
DOT:	'.';
DDOT:	'..';
COMMA:	',';
AT:		'@';
PATH:	'/';
DPATH:	'//';
STAR:	'*';
EQUL:	'=';
DEQUL:	'==';
NEWLINE:'\r'? '\n';
WS  :   [ \t]+ -> skip;


SCONST: '"'+[a-zA-Z0-9,.!?; ''""-]+'"';