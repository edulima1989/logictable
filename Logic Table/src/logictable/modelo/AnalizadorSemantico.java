/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDÚ
 */
public class AnalizadorSemantico {

    private static List<Lexico> lexicos;
    private boolean val_P;
    private boolean val_Q;
    private boolean val_R;
    private boolean val_Exp;


private class Expresion{
    private int punIni;
    private String expres;
    private List<Lexico> lexicos;
    private boolean valor;

}
    public AnalizadorSemantico(){
        
    }


    private void calcular(){

    }

    private void romperParentesisSencillos(){
        boolean repetir=false;
        for(Lexico lex:lexicos){
                if(lex.getToken()==AFD.VARIABLE_A||
                        lex.getToken()==AFD.VARIABLE_B||
                        lex.getToken()==AFD.VARIABLE_C){

                        int aux=lexicos.indexOf(lex);
                        if(aux>0&&aux<lexicos.size()-1){

                            if(lexicos.get(aux-1).getToken()==AFD.PARENT_AB&&
                                    lexicos.get(aux+1).getToken()==AFD.PARENT_CE){

                                repetir=true;
                                List<Lexico> auxLista=new ArrayList<Lexico>();
                                for(int i=0;i<lexicos.size();i++){
                                    if(i==(aux-1)||i==(aux+1))
                                        ;else
                                            auxLista.add(lexicos.get(i));
                                }
                                lexicos=auxLista;
                                break;
                            }
                        }
                }

            }
        if(repetir)
            romperParentesisSencillos();
    }

    private List<Lexico> quitarParentExtre(List<Lexico> lista){
        boolean entrar=false;
        if(lista.get(0).getToken()==AFD.PARENT_AB&&
                lista.get(lista.size()-1).getToken()==AFD.PARENT_CE){
            lista.remove(lista.size()-1);
            lista.remove(0);
            entrar = true;
        }
        if(entrar)
            lista=quitarParentExtre(lista);
        return lista;
    }
    






    private boolean expBiCond(boolean ant,boolean sig){
        if(ant==sig)
            return true;
        else
            return false;
    }

    private boolean expCond(boolean  ant, boolean sig){
        if(ant==true&&sig==false)
            return false;
        else
            return true;
    }

    private boolean expUnion(boolean ant, boolean sig){
        if(ant==false&&sig==false)
            return false;
        else
            return true;
    }

    private boolean expInters(boolean ant,boolean sig){
        if(ant==true&&sig==true)
            return true;
        else
            return false;
    }

    private boolean expNeg(boolean ant){
        if(ant)
            return false;
        else
            return true;
    }



}
