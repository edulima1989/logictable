/*
* Configuracion
*
* Ana Campoverde
* Yanela Ríos
* German Salas
* Carlos Vivanco
* Eduardo Lima
*/

package logictable.modelo.reporte;


import org.hibernate.classic.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Configuracion {
/*
* Aqui se valida la sesion de acceso a la base de datos
*/

    public static final SessionFactory sessionFactory;

    static {
        try {
        // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure().
                                        buildSessionFactory();
        } catch (Throwable ex) {
        // Make sure you log the exception, as it might be swallowed
            System.err.println("Creacion fallida de la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static final ThreadLocal session = new ThreadLocal();

    public Session currentSession() throws HibernateException {
        Session s = (Session) session.get();

        // Open a new Session, if this thread has none yet
        if (s == null) {
            s = sessionFactory.openSession();
        // Store it in the ThreadLocal variable
            session.set(s);
        }
        return s;
    }
    public SessionFactory getSesion(){
        return sessionFactory;
    }
    public void cerrar(){
        sessionFactory.close();        
    }
    
    public static void closeSession() throws HibernateException {
        Session s = (Session) session.get();
        if (s != null)
            s.close();
        session.set(null);
    }

}