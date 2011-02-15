/*
 * Lexico
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

public class Lexico {

    private int token;
    private String lexema;
    private boolean valor[];

    public Lexico(int token, String lexema) {
        this.token = token;
        this.lexema = lexema;
    }

    public Lexico() {
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token + ": " + lexema;
    }

    public boolean[] getValor() {
        return valor;
    }

    public void setValor(boolean[] valor) {
        this.valor = valor;
    }
}
