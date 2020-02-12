package com.sazails;

import com.sazails.hibernate.HibernateUtils;
import com.sazails.model.UserData;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        UserData user = new UserData("Test1", "test1@gmail.com");

        session.save(user);
        session.getTransaction().commit();
        session.close();

        session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        user.updateUser("Test2", "test2@gmail.com");

        session.save(user);
        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }
}
