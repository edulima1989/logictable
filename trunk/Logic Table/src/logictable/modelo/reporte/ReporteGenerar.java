/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo.reporte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author EDÚ
 */
public class ReporteGenerar extends Thread{
    
    Date fechaInicio;
    private Connection con=null;
    public static final String DRIVER="com.mysql.jdbc.Driver";//nombre del driver
    public static final String URLBD="jdbc:mysql://localhost:3306/logictable";//direccion con la creamos la base de datos
    public static final String USUARIO="root";
    public static final String CONTRASENA="";
    public Reporte reporte;

    public ReporteGenerar(Date fechaInicio,Reporte reporte) {
        this.fechaInicio=fechaInicio;
        this.reporte=reporte;
    }

    @Override
    public void run(){
        try
        {

            CrearBaseDeDatos crearBaseDeDatos = new CrearBaseDeDatos();
            OperacionDAO.mt_guardar(reporte);
            //Ruta de Archivo Jasper
            String fileName="src/logictable/modelo/reporte/reporte.jasper";
            //Obtner una conexi�n a la base de datos
            Class.forName(DRIVER);//para indicar que con  esa clase va a conecarse
            con=DriverManager.getConnection(URLBD,USUARIO,CONTRASENA);
            //Pasamos parametros al reporte Jasper.
            Map parameters = new HashMap();
            parameters.put("fechaIng",fechaInicio);
            //Preparacion del reporte (en esta etapa llena el dise�o de reporte)
            //Reporte dise�ado y compilado con iReport
            JasperPrint jasperPrint = JasperFillManager.fillReport(fileName,parameters,con);
            //Se lanza el Viewer de Jasper, no termina aplicaci�n al salir
            JasperViewer jviewer = new JasperViewer(jasperPrint,false);
            jviewer.show();
        }
        catch (Exception j)
        {
            System.out.println("Mensaje de Error:"+j.getMessage());
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
    }
    }


    public void crearReporte(){



    }

}
