package com.sazails.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try{
            // Uses hibernate.cfg.xml to create a SessionFactory.
            return new Configuration().configure().buildSessionFactory();
        }catch(Throwable ex){
            // Log the error if SessionFactory can't be built.
            System.err.println("Failed to create Session Factory. " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutdown(){
        // Close connections.
        getSessionFactory().close();
    }
}
