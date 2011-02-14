/*
* CrearBaseDeDatos
*
* Ana Campoverde
* Yanela Ríos
* German Salas
* Carlos Vivanco
* Eduardo Lima
*/

package logictable.modelo.reporte;

import java.sql.*;

public class CrearBaseDeDatos {

/*
 *En esta clase se realiza la creacion a base de datos
*/

    private static Connection conectar;
	private static Statement sentencia;
	private static CrearBaseDeDatos con = null;

	public CrearBaseDeDatos(){
		conectado("","root","logictable");
	}
	public static void conectado(String contrasenia,
                            String nombre_usuario, String dataBase){
		conectar = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		conectar = DriverManager.getConnection
                                   ("jdbc:mysql://localhost:3306/?",nombre_usuario,"");
			sentencia = conectar.createStatement();

//                        sentencia.executeUpdate("DROP DATABASE IF EXISTS "+dataBase);

                        sentencia.executeUpdate("CREATE DATABASE IF NOT EXISTS "+dataBase);
                        //sentencia.executeUpdate("USE "+dataBase);
		}catch(Exception e){
			 System.out.println("Error en conexion"+e);
                        return;
		}
	}
        public static void main(String []arg){
            CrearBaseDeDatos b=new CrearBaseDeDatos();
        }

}
	