/*
 * AnalizadorLexico
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
import java.util.List;



// ESta clase nos sirve para identficar los tokens y lexemas
public class AnalizadorLexico {

    private List<Lexico> lexicos;
    private AFD afd;

    public AnalizadorLexico() {
        this.lexicos = new ArrayList<Lexico>();
        this.afd=new AFD();
    }

    public void crearTokens(String texto){
        this.afd.verificaTexto(texto, this);
        
    }

    public void addLexico(Lexico lexico){
        lexicos.add(lexico);
    }

    public List<Lexico> getLexicos() {
        return lexicos;
    }

    public void setLexicos(List<Lexico> lexicos) {
           this.lexicos = lexicos;
    }



}
