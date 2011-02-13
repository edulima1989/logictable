/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.analizador;

import java.io.Console;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

/**
 *
 * @author EDÚ
 */
public class auxiliar {

public static void main(String args[]) throws Exception {
  Console consola = System.console();
  String  mensaje = "Escriba una expresion aritmetica"; 
  String pregunta = "";
 
  if(consola!=null) {
   consola.printf(mensaje);
   pregunta = consola.readLine();
  }
  else {
   pregunta = javax.swing.JOptionPane.showInputDialog(mensaje);
  }
 
  LogicTableAnalisisLexer      lex = new LogicTableAnalisisLexer(
        new ANTLRStringStream(pregunta));
  CommonTokenStream tokens = new CommonTokenStream(lex);

  LogicTableAnalisisParser    gram = new LogicTableAnalisisParser(tokens);

 }
}




