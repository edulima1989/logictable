grammar LogicTableAnalisis;

@header{
    package logictable.analizador;
}
                OP_UNION     : '+' ;
                OP_NEGACION : '-' ;
                OP_INTERSECCION : '*';
                OP_BICONDICIONAL : '<=>';
                OP_CONDICIONAL : '=>';
                PARENT_AB : '(';
                PARENT_CE : ')';
                VARIABLE_A : 'a';
                VARIABLE_B : 'b';
                VARIABLE_C : 'c';
 	BLANCO : (' ' | '\t')
{ $setType(Token.SKIP); };




/*
options
{
buildAST = true; // Construir el AST
}
*/
/** Regla raíz **/

expresion : expBiCond ;
/** Expresión suma (nivel 4) **/
expBiCond : expCond (OP_BICONDICIONAL^ expCond)* ;
/** Expresión resta (nivel 3) **/
expCond : expIntersec (OP_CONDICIONAL^ expIntersec)* ;
/** Expresión producto (nivel 2) */
expIntersec : expUnion (OP_INTERSECCION^ expUnion)* ;
/** Expresión cociente (nivel 1)**/
expUnion : expBase (OP_UNION^ expBase)* ;
/** Expresión base (nivel 0) **/
expBase : VARIABLE_A |VARIABLE_B|
VARIABLE_C| PARENT_AB! expresion PARENT_CE!
;


expresion returns [boolean result=false]
{boolean izq=false, der=false; }
: n:VARIABLE_A
{ result = new Boolean(n.getText()).BooleanValue(); }
| (OP_BICONDICIONAL izq=expresion der=expresion)
{ if(izq==true&&der==true){
	result = true;
}else{
if(izq==true&&der==false){
	result = false;
}else{
if(izq==false&&der==true){
        result = false;
}else{
    resul = true;
}
}
}
         }
| (OP_CONDICIONAL izq=expresion der=expresion)
{
    if(izq==true&&der==false){
        result = false;
    }else{
        result = true;
}
    }
| (OP_INTERSECCION izq=expresion der=expresion)
{
    if(izq==true&&der==true){
        result = true;
}else{
        result = false;
}
     }
| (OP_UNION izq=expresion der=expresion)
{
if(izq==false&&der==false){
    result false;
}else{
    result true;
}
    }
;
