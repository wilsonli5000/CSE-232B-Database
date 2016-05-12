/*
 * XPath grammar
 * Filename: XPath.g4
 * Author: Yuchun Li, Meng Xue
 * Date: Apr 29, 2015
 */

grammar XPath;

ap
	: doc '/' rp		# APChildren
	| doc '//' rp		# APAll
	;

doc
	: DOC '(' '\"' fname '")'
	;

fname
	: NAME ('.' NAME)?
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
DOC:	'document';
TXT:	'text()';
NAME:	[a-zA-Z0-9_-]+;
WS  :   [ \t\r\n]+ -> skip;