/*
 * AFD
 *
 * Ana Campoverde
 * Eduardo Lima
 * German Salas
 * Yanela Ríos
 * Carlos Vivanco
 *
 * Created on 15/07/2009, 11:16:29 PM
 *
 * Copyleft
 */

package logictable.modelo;

import java.util.ArrayList;

/**
 *
 * @author EDÚ
 *
 */

// Para crear el automata finito determinista
public class AFD {

//    public enum  TOKEN {TOKEN_ERROR,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12};
    public static final int EOF=-1;
    public static final int OP_UNION=4;
    public static final int OP_NEGACION=5;
    public static final int OP_INTERSECCION=6;
    public static final int OP_BICONDICIONAL=7;
    public static final int OP_CONDICIONAL=8;
    public static final int PARENT_AB=9;
    public static final int PARENT_CE=10;
    public static final int VARIABLE_A=11;
    public static final int VARIABLE_B=12;
    public static final int VARIABLE_C=13;
    public static final int BLANCO=14;

/**
 *
 * @ override "Metodo que verifica si el texto ingresado está correcto"
 * @param String tex, AnalizadorLexico lex
 *
 */

    public void verificaTexto(String texto, AnalizadorLexico lex){
        lex.getLexicos().clear();
        String aux="";
        for(int i=0;i<texto.length();i++){
            if(texto.charAt(i)!=' ')
            aux=aux.concat(""+texto.charAt(i));
        }
        texto=aux;

        ArrayList<String> textos=new ArrayList<String>();
        
        aux="";
        int n=0;
        for(int i=0;i<texto.length();i++){
            switch(n){
                case 0:
                    if(texto.charAt(i)=='='){
                        n=1;
                        aux=aux.concat(""+texto.charAt(i));
                    }else
                        if(texto.charAt(i)=='<'){
                            n=2;
                            aux=aux.concat(""+texto.charAt(i));
                        }else{
                            n=0;
                            aux=aux.concat(""+texto.charAt(i));
                            textos.add(aux);
                            aux="";
                        }
                    break;
                case 1:
                    if(texto.charAt(i)=='>'){
                        n=0;
                        aux=aux.concat(""+texto.charAt(i));
                        textos.add(aux);
                        aux="";
                    }else
                        {
                        n=0;
                        textos.add(aux);
                        aux="";
                        i--;
                        }
                    break;
                case 2:
                    if(texto.charAt(i)=='='){
                        n=3;
                        aux=aux.concat(""+texto.charAt(i));
                    }else
                        {
                        n=0;
                        textos.add(aux);
                        aux="";
                        i--;
                        }
                    break;
                case 3:
                    if(texto.charAt(i)=='>'){
                        n=0;
                        aux=aux.concat(""+texto.charAt(i));
                        textos.add(aux);
                        aux="";
                    }else
                        {
                        n=0;
                        textos.add(aux);
                        aux="";
                        i--;
                        }
                    break;

                default:
            }
        }

        for(String token:textos){
            lex.addLexico(new Lexico(validaToken(token), token));
        }

    }

    public static int validaToken(String str){
       int token = EOF;
       int estado=0;
        for(Character c:str.toCharArray()){
            switch(estado){
                case 0:
                    if(c.equals('+')){
                        estado=1;
                        token=OP_UNION;
                    }else
                        if(c.equals('*')){
                            estado=1;
                            token=OP_INTERSECCION;
                        }else
                        if(c.equals('-')){
                            estado=1;
                            token=OP_NEGACION;
                        }else
                        if(c.equals('=')){
                            estado=2;
                            token=EOF;
                        }else
                        if(c.equals('<')){
                            estado=3;
                            token=EOF;
                        }else
                        if(c.equals('(')){
                            estado=1;
                            token=PARENT_AB;
                        }else
                        if(c.equals(')')){
                            estado=1;
                            token=PARENT_CE;
                        }else
                        if(c.equals('p')){
                            estado=1;
                            token=VARIABLE_A;
                        }else
                        if(c.equals('q')){
                            estado=1;
                            token=VARIABLE_B;
                        }else
                        if(c.equals('r')){
                            estado=1;
                            token=VARIABLE_C;
                        }else
                        {
                        estado=-1;
                        token=EOF;
                        }
                    break;
                case 1:                    
                        estado=-1;
                        token=EOF;
                    break;
                case 2:
                  if(c.equals('>')){
                            estado=1;
                            token=OP_CONDICIONAL;
                        }else{
                        estado=-1;
                        token=EOF;
                    }
                    break;
                    case 3:
                  if(c.equals('=')){
                            estado=4;
                            token=EOF;
                        }else{
                        estado=-1;
                        token=EOF;
                    }
                    break;
                    case 4:
                  if(c.equals('>')){
                            estado=1;
                            token=OP_BICONDICIONAL;
                        }else{
                        estado=-1;
                        token=EOF;
                    }
                    break;
                default:token=EOF;
            }
        }

       return token;
    }

}
