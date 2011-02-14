/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo;

/**
 *
 * @author EDÚ
 */
public class TablaVerdad {

   private boolean tabla[][]=new boolean[0][0];
   private String variables[]= new String[0];
   private String tablaValor[][]=new String[0][0];

    public TablaVerdad(boolean[][] tabla, String[] variables) {
        this.tabla = tabla;
        this.variables = variables;
        tablaValor=new String[tabla.length][tabla[0].length];
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[0].length;j++){
                if(tabla[i][j]==true)
                    tablaValor[i][j]="V";
                else
                    tablaValor[i][j]="F";
            }
        }

    }

    public String[][] getTablaValor() {
        return tablaValor;
    }

    public void setTablaValor(String[][] tablaValor) {
        this.tablaValor = tablaValor;
    }


   public boolean[][] getTabla() {
        return tabla;
    }

    public void setTabla(boolean[][] tabla) {
        this.tabla = tabla;
    }

    public String[] getVariables() {
        return variables;
    }

    public void setVariables(String[] variables) {
        this.variables = variables;
    }


   
}
