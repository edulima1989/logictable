/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo;

import java.util.List;

public class AnalizadorSemantico {

    private static List<Lexico> lexicos;
    private boolean val_P [];
    private boolean val_Q [];
    private boolean val_R [];
    private int variables;
    private String expresi="";

    public TablaVerdad valoresTabla(){
        boolean aux[][]=new boolean[0][0];
        String titulos[]=new String[0];
        if(variables==3){
                aux=new boolean[8][4];
                for(int i=0;i<aux.length;i++){
                        aux[i][0]=val_P[i];
                        aux[i][1]=val_Q[i];
                        aux[i][2]=val_R[i];
                        aux[i][3]=lexicos.get(0).getValor()[i];
                }

                titulos=new String[4];
                titulos[0]="p";
                titulos[1]="q";
                titulos[2]="r";
                titulos[3]=expresi;
        }else if(variables==21){
                aux=new boolean[4][3];
                for(int i=0;i<aux.length;i++){
                        aux[i][0]=val_P[i];
                        aux[i][1]=val_Q[i];
                        aux[i][2]=lexicos.get(0).getValor()[i];
                }
                titulos=new String[3];
                titulos[0]="p";
                titulos[1]="q";
                titulos[2]=expresi;
        }else if(variables==22){
                aux=new boolean[4][3];
                for(int i=0;i<aux.length;i++){
                        aux[i][0]=val_P[i];
                        aux[i][1]=val_R[i];
                        aux[i][2]=lexicos.get(0).getValor()[i];
                }
                titulos=new String[3];
                titulos[0]="p";
                titulos[1]="r";
                titulos[2]=expresi;
        }else if(variables==23){
                aux=new boolean[4][3];
                for(int i=0;i<aux.length;i++){
                        aux[i][0]=val_Q[i];
                        aux[i][1]=val_R[i];
                        aux[i][2]=lexicos.get(0).getValor()[i];
                }
                titulos=new String[3];
                titulos[0]="q";
                titulos[1]="r";
                titulos[2]=expresi;
        }else if(variables==11){
                aux=new boolean[2][2];
                for(int i=0;i<aux.length;i++){
                        aux[i][0]=val_P[i];
                        aux[i][1]=lexicos.get(0).getValor()[i];
                }
                titulos=new String[2];
                titulos[0]="p";
                titulos[1]=expresi;
        }else if(variables==12){
                aux=new boolean[2][2];
                for(int i=0;i<aux.length;i++){
                        aux[i][0]=val_Q[i];
                        aux[i][1]=lexicos.get(0).getValor()[i];
                }
                titulos=new String[2];
                titulos[0]="q";
                titulos[1]=expresi;
        }else if(variables==13){
                aux=new boolean[2][2];
                for(int i=0;i<aux.length;i++){
                        aux[i][0]=val_R[i];
                        aux[i][0]=lexicos.get(0).getValor()[i];
                }
                titulos=new String[2];
                titulos[0]="r";
                titulos[1]=expresi;
        }
        TablaVerdad tabla=new TablaVerdad(aux,titulos);
        return tabla;
    }

    public AnalizadorSemantico(List<Lexico> lex){
        lexicos=lex;
        boolean p=false,q=false,r=false;
        for(Lexico l:lexicos){
            expresi+=l.getLexema();
            if(l.getToken()==AFD.VARIABLE_A)
                p=true;
            else if(l.getToken()==AFD.VARIABLE_B)
                q=true;
            else if (l.getToken()==AFD.VARIABLE_C)
                r=true;
        }

        if(p&&q&&r){
                    boolean aux[]={true,true,true,true,false,false,false,false};
                    val_P=aux;
                    boolean aux1[]={true,true,false,false,true,true,false,false};
                    val_Q=aux1;
                    boolean aux2[]={true,false,true,false,true,false,true,false};
                    val_R=aux2;
                    variables=3;
        }else
            if(p&&q){
                    boolean aux[]={true,true,false,false};
                    val_P=aux;
                    boolean aux1[]={true,false,true,false};
                    val_Q=aux1;
                    variables=21;
            }else if(p&&r){
                    boolean aux[]={true,true,false,false};
                    val_P=aux;
                    boolean aux1[]={true,false,true,false};
                    val_R=aux1;
                    variables=22;
            }else if(q&&r){
                    boolean aux[]={true,true,false,false};
                    val_Q=aux;
                    boolean aux1[]={true,false,true,false};
                    val_R=aux1;
                    variables=23;
            }else if(p){
                    boolean aux[]={true,false};
                    val_P=aux;
                    variables=11;
            }else if (q) {
                    boolean aux[]={true,false};
                    val_Q=aux;
                    variables=12;
            }else if(r){
                    boolean aux[]={true,false};
                    val_R=aux;
                    variables=13;
            }

           for(Lexico l:lexicos){
            if(l.getToken()==AFD.VARIABLE_A){
                l.setValor(val_P);
                l.setToken(AFD.BLANCO);
            }else if (l.getToken() == AFD.VARIABLE_B){
                l.setValor(val_Q);
                l.setToken(AFD.BLANCO);
            }else if (l.getToken() == AFD.VARIABLE_C){
                l.setValor(val_R);
                l.setToken(AFD.BLANCO);
            }
        }
        calcularSemantica();
    }


    private void calcularSemantica(){
        boolean salir=true;

        do{
                if(romperParentesisSencillos());
                else if(operadorNegacion());
                else if(operadorInterseccion());
                else if(operadorUnion());
                else if(operadorCondicional());
                else if(operadorBiCondicional());

                if(lexicos.size()==1)
                    salir=false;
        }while(salir);
    }


    private boolean operadorNegacion(){
        boolean entrar=false;
        for(int i=0;i<lexicos.size();i++){
                if(lexicos.get(i).getToken()==AFD.OP_NEGACION&&
                        (lexicos.get(i+1).getToken()==AFD.BLANCO)){
                        lexicos.get(i+1).setValor(expNeg(lexicos.get(i+1).getValor()));
                    lexicos.remove(i);
                    entrar=true;
                    break;
                }
        }
        return entrar;
    }
    
    private boolean operadorInterseccion(){
        boolean entrar=false;
        for(int i=0;i<lexicos.size();i++){
            if(lexicos.get(i).getToken()==AFD.OP_INTERSECCION&&
                    lexicos.get(i-1).getToken()==AFD.BLANCO&&
                    lexicos.get(i+1).getToken()==AFD.BLANCO){
                lexicos.get(i).setToken(AFD.BLANCO);
                lexicos.get(i).setValor(expInters(lexicos.get(i-1).getValor(),
                        lexicos.get(i+1).getValor()));
                lexicos.remove(i+1);
                lexicos.remove(i-1);
                entrar=true;
                break;
            }
        }
        return entrar;
    }
    
   private boolean operadorUnion(){
        boolean entrar=false;
        for(int i=0;i<lexicos.size();i++){
            if(lexicos.get(i).getToken()==AFD.OP_UNION&&
                    lexicos.get(i-1).getToken()==AFD.BLANCO&&
                    lexicos.get(i+1).getToken()==AFD.BLANCO){
                lexicos.get(i).setToken(AFD.BLANCO);
                lexicos.get(i).setValor(expUnion(lexicos.get(i-1).getValor(),
                        lexicos.get(i+1).getValor()));
                lexicos.remove(i+1);
                lexicos.remove(i-1);
                entrar=true;
                break;
            }
        }
        return entrar;
    }

   private boolean operadorCondicional(){
        boolean entrar=false;
        for(int i=0;i<lexicos.size();i++){
            if(lexicos.get(i).getToken()==AFD.OP_CONDICIONAL&&
                    lexicos.get(i-1).getToken()==AFD.BLANCO&&
                    lexicos.get(i+1).getToken()==AFD.BLANCO){
                lexicos.get(i).setToken(AFD.BLANCO);
                lexicos.get(i).setValor(expCond(lexicos.get(i-1).getValor(),
                        lexicos.get(i+1).getValor()));
                lexicos.remove(i+1);
                lexicos.remove(i-1);
                entrar=true;
                break;
            }
        }
        return entrar;
    }

      private boolean operadorBiCondicional(){
        boolean entrar=false;
        for(int i=0;i<lexicos.size();i++){
            if(lexicos.get(i).getToken()==AFD.OP_BICONDICIONAL&&
                    lexicos.get(i-1).getToken()==AFD.BLANCO&&
                    lexicos.get(i+1).getToken()==AFD.BLANCO){
                lexicos.get(i).setToken(AFD.BLANCO);
                lexicos.get(i).setValor(expBiCond(lexicos.get(i-1).getValor(),
                        lexicos.get(i+1).getValor()));
                lexicos.remove(i+1);
                lexicos.remove(i-1);
                entrar=true;
                break;
            }
        }
        return entrar;
    }


    private boolean romperParentesisSencillos(){
        boolean entrar=false;
        for(int i=0;i<lexicos.size();i++){
                if(lexicos.get(i).getToken()==AFD.PARENT_AB&&
                        lexicos.get(i+1).getToken()==AFD.BLANCO&&
                        lexicos.get(i+2).getToken()==AFD.PARENT_CE){
                        lexicos.remove(i+2);
                        lexicos.remove(i);
                         entrar=true;
                        break;
                }
        }
        return entrar;
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
    






    private boolean[] expBiCond(boolean[] ant,boolean[] sig){
        boolean aux[]=new boolean[ant.length];
        for(int i=0;i<ant.length;i++){

                if(ant[i]==sig[i])
                    aux[i]=true;
                else
                    aux[i]=false;
        }
        return aux;

    }

    private boolean[] expCond(boolean[]  ant, boolean[] sig){

        boolean aux[]=new boolean[ant.length];
        for(int i=0;i<ant.length;i++){

                if(ant[i]==true&&sig[i]==false)
                    aux[i]=false;
                else
                    aux[i]=true;
        }

        return aux;
    }

    private boolean[] expUnion(boolean[] ant, boolean[] sig){
        boolean aux[]=new boolean[ant.length];
        for(int i=0;i<ant.length;i++){

                if(ant[i]==false&&sig[i]==false)
                    aux[i]=false;
                else
                    aux[i]=true;
        }
            return aux;
    }

    private boolean[] expInters(boolean[] ant,boolean[] sig){
        boolean aux[]=new boolean[ant.length];
        for(int i=0;i<ant.length;i++){

                if(ant[i]==true&&sig[i]==true)
                    aux[i]=true;
                else
                    aux[i]=false;
        }
            return aux;
    }

    private boolean[] expNeg(boolean[] val){
        boolean aux[]=new boolean[val.length];
        for(int i=0;i<val.length;i++){

                if(val[i])
                    aux[i]=false;
                else
                    aux[i]=true;
        }
            return aux;
    }



}
