/*
 * AnalizadorSintactico
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

import java.util.List;

/*
 * Para identificar sintaxis de las expresiones
 */

public class AnalizadorSintactico {
    private static List<Lexico> lexicos;


    public AnalizadorSintactico(List<Lexico> lex){
        lexicos=lex;
    }

  /**
 *
 * @ override "Método que comprueba si la sintaxis es correcta"
 * @param List<Lexico> lex
 * @return boolean  es
 *
 */

    public static boolean comprobarSintaxis(List<Lexico> lex){
        lexicos=lex;
        
        boolean es=false;
        int contarParent=0;
        int num=0;
        for(int i=0;i<lexicos.size();i++){
            switch(num){
                case 0:
                    if(lexicos.get(i).getToken()==AFD.PARENT_AB&&
                            lexicos.get(i+1).getToken()!=AFD.PARENT_CE){
                        contarParent++;
                        num=1;
                        es=false;
                    }else if(lexicos.get(i).getToken()==AFD.OP_NEGACION){
                        num=1;
                        es=false;
                    }else if(lexicos.get(i).getToken()==AFD.VARIABLE_A||
                            lexicos.get(i).getToken()==AFD.VARIABLE_B||
                            lexicos.get(i).getToken()==AFD.VARIABLE_C){
                        num=1;
                        es=true;
                    }else{
                        num=-1;
                        es=false;
                    }
                    break;
                case 1:
                    if(i<lexicos.size()-1){
                        if((lexicos.get(i).getToken()==AFD.OP_BICONDICIONAL||
                                lexicos.get(i).getToken()==AFD.OP_CONDICIONAL||
                                lexicos.get(i).getToken()==AFD.OP_INTERSECCION||
                                lexicos.get(i).getToken()==AFD.OP_UNION)&&
                                (lexicos.get(i-1).getToken()==AFD.VARIABLE_A||
                                lexicos.get(i-1).getToken()==AFD.VARIABLE_B||
                                lexicos.get(i-1).getToken()==AFD.VARIABLE_C||
                                lexicos.get(i-1).getToken()==AFD.PARENT_CE)&&
                                (lexicos.get(i+1).getToken()==AFD.VARIABLE_A||
                                lexicos.get(i+1).getToken()==AFD.VARIABLE_B||
                                lexicos.get(i+1).getToken()==AFD.VARIABLE_C||
                                lexicos.get(i+1).getToken()==AFD.PARENT_AB||
                                lexicos.get(i+1).getToken()==AFD.OP_NEGACION)){

                            num=1;
                            es=false;

                        }else if((lexicos.get(i).getToken()==AFD.PARENT_AB)&&
                                (lexicos.get(i-1).getToken()==AFD.OP_BICONDICIONAL||
                                lexicos.get(i-1).getToken()==AFD.OP_CONDICIONAL||
                                lexicos.get(i-1).getToken()==AFD.OP_INTERSECCION||
                                lexicos.get(i-1).getToken()==AFD.OP_UNION||
                                lexicos.get(i-1).getToken()==AFD.OP_NEGACION||
                                lexicos.get(i-1).getToken()==AFD.PARENT_AB)&&
                                (lexicos.get(i+1).getToken()==AFD.VARIABLE_A||
                                lexicos.get(i+1).getToken()==AFD.VARIABLE_B||
                                lexicos.get(i+1).getToken()==AFD.VARIABLE_C||
                                lexicos.get(i+1).getToken()==AFD.PARENT_AB||
                                lexicos.get(i+1).getToken()==AFD.OP_NEGACION)){
                            contarParent++;
                            num=1;
                            es=false;
                        }else if((lexicos.get(i).getToken()==AFD.PARENT_CE)&&
                                (lexicos.get(i-1).getToken()==AFD.VARIABLE_A||
                                lexicos.get(i-1).getToken()==AFD.VARIABLE_B||
                                lexicos.get(i-1).getToken()==AFD.VARIABLE_C||
                                lexicos.get(i-1).getToken()==AFD.PARENT_CE)&&
                                (lexicos.get(i+1).getToken()==AFD.PARENT_CE||
                                lexicos.get(i+1).getToken()==AFD.OP_BICONDICIONAL||
                                lexicos.get(i+1).getToken()==AFD.OP_CONDICIONAL||
                                lexicos.get(i+1).getToken()==AFD.OP_INTERSECCION||
                                lexicos.get(i+1).getToken()==AFD.OP_UNION)){

                            contarParent--;
                            num=1;
                            es=false;
                        }else if((lexicos.get(i).getToken()==AFD.VARIABLE_A||
                                lexicos.get(i).getToken()==AFD.VARIABLE_B||
                                lexicos.get(i).getToken()==AFD.VARIABLE_C)&&
                                (lexicos.get(i-1).getToken()==AFD.OP_NEGACION||
                                lexicos.get(i-1).getToken()==AFD.OP_BICONDICIONAL||
                                lexicos.get(i-1).getToken()==AFD.OP_CONDICIONAL||
                                lexicos.get(i-1).getToken()==AFD.OP_INTERSECCION||
                                lexicos.get(i-1).getToken()==AFD.OP_UNION||
                                lexicos.get(i-1).getToken()==AFD.PARENT_AB)&&
                                (lexicos.get(i+1).getToken()==AFD.OP_BICONDICIONAL||
                                lexicos.get(i+1).getToken()==AFD.OP_CONDICIONAL||
                                lexicos.get(i+1).getToken()==AFD.OP_INTERSECCION||
                                lexicos.get(i+1).getToken()==AFD.OP_UNION||
                                lexicos.get(i+1).getToken()==AFD.PARENT_CE)){

                            num=1;
                            es=false;
                        }else if((lexicos.get(i).getToken()==AFD.OP_NEGACION)&&
                                (lexicos.get(i-1).getToken()==AFD.OP_NEGACION||
                                lexicos.get(i-1).getToken()==AFD.OP_BICONDICIONAL||
                                lexicos.get(i-1).getToken()==AFD.OP_CONDICIONAL||
                                lexicos.get(i-1).getToken()==AFD.OP_INTERSECCION||
                                lexicos.get(i-1).getToken()==AFD.OP_UNION||
                                lexicos.get(i-1).getToken()==AFD.PARENT_AB)&&
                                (lexicos.get(i+1).getToken()==AFD.VARIABLE_A||
                                lexicos.get(i+1).getToken()==AFD.VARIABLE_B||
                                lexicos.get(i+1).getToken()==AFD.VARIABLE_C||
                                lexicos.get(i+1).getToken()==AFD.PARENT_AB||
                                lexicos.get(i+1).getToken()==AFD.OP_NEGACION)){

                            num=1;
                        es=false;
                        }else{
                            num=-1;
                            es=false;
                        }
                    }else{
                            if((lexicos.get(i).getToken()==AFD.OP_BICONDICIONAL||
                                lexicos.get(i).getToken()==AFD.OP_CONDICIONAL||
                                lexicos.get(i).getToken()==AFD.OP_INTERSECCION||
                                lexicos.get(i).getToken()==AFD.OP_UNION)){

                            num=-1;
                            es=false;

                        }else if((lexicos.get(i).getToken()==AFD.PARENT_AB)){
                            contarParent++;
                            num=-1;
                            es=false;

                        }else if((lexicos.get(i).getToken()==AFD.PARENT_CE)){

                            contarParent--;
                            num=1;
                            if(contarParent==0)
                            es=true;
                            else
                                es=false;

                        }else if((lexicos.get(i).getToken()==AFD.VARIABLE_A||
                                lexicos.get(i).getToken()==AFD.VARIABLE_B||
                                lexicos.get(i).getToken()==AFD.VARIABLE_C)){

                            num=1;
                            if(contarParent==0)
                            es=true;
                            else
                                es=false;

                        }else if((lexicos.get(i).getToken()==AFD.OP_NEGACION)){

                        num=-1;
                        es=false;

                        }else{
                            num=-1;
                            es=false;
                        }
                    }
                    break;
                    default:
                        num=-1;
                            es=false;
            }


        }

        return es;
    }

}
