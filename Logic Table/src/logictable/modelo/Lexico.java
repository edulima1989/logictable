/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo;

/**
 *
 * @author EDÚ
 *
 *
 */
public class Lexico {

    private int token;
    private String lexema;

    public Lexico(int token, String lexema) {
        this.token = token;
        this.lexema = lexema;
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
        return token +": "+lexema;
    }


}
