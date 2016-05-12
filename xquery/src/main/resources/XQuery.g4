grammar XQuery;
import XPath;

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

