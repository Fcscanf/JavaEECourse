package cn.fcsca.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * HibernateSessionFactory
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:08 2018-11-16
 */
public class HibernateSessionFactory {
    private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
    private static final ThreadLocal<Session> THREAD_LOCAL = new ThreadLocal<>();
    private static Configuration configuration = new Configuration();
    private static SessionFactory sessionFactory;
    private static String configFile = CONFIG_FILE_LOCATION;
    static {
        try {
            configuration.configure(configFile);
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Error Creating SessionFactory");
            e.printStackTrace();
        }
    }

    private HibernateSessionFactory() {
    }

    public static Session getSession() {
        Session session = THREAD_LOCAL.get();
        if (session == null || !session.isOpen()) {
            if (sessionFactory == null) {
                rebuildSessionFactory();
            }
            session = (sessionFactory != null) ? sessionFactory.openSession() : null;
            THREAD_LOCAL.set(session);
        }
        return session;
    }

    public static void rebuildSessionFactory() {
        try {
            configuration.configure(configFile);
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Error Creating SessionFactory");
            e.printStackTrace();
        }
    }

    public static void closeSession() {
        Session session = THREAD_LOCAL.get();
        THREAD_LOCAL.set(null);
        if (session != null) {
            session.close();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void setConfigFile(String configFile) {
        HibernateSessionFactory.configFile = configFile;
        sessionFactory = null;
    }

    public static Configuration getConfiguration() {
        return configuration;
    }
}
