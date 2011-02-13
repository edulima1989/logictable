/*
* OperacionDAO
*
* Ana Campoverde
* Yanela Ríos
* German Salas
* Carlos Vivanco
* Eduardo Lima
*/

/*
 * HibernateDAO.java
 */

package logictable.modelo.reporte;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class OperacionDAO {
 /*
 *En esta clase se realiza la conexion a base de datos
*/
    
    static Configuracion config=new Configuracion();
    
    public OperacionDAO(){
    }
    
     public static  boolean mt_guardar(Object object) {
         Session session = config.currentSession();
         Transaction tx = session.beginTransaction();
         try{
             if(!tx.isActive())
                 tx.begin();
             session.save(object);
             tx.commit();
             Configuracion.closeSession();
         }
        catch (HibernateException he){
            he.printStackTrace();
            return false;
        }
        return true;
    }    
}
