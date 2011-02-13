/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo.reporte;

import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author EDÚ
 */
public class Rreporte {
    
    Date fechaInicio;
    private Connection con=null;
    public static final String DRIVER="com.mysql.jdbc.Driver";//nombre del driver
    public static final String URLBD="jdbc:mysql://localhost:3306/farmaCenSa";//direccion con la creamos la base de datos
    public static final String USUARIO="root";
    public static final String CONTRASENA="";


}
