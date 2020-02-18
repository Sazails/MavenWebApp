package com.sazails;

import com.sazails.hibernate.HibernateUtils;
import com.sazails.model.UserData;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        UserData userData = new UserData("test1", "test1@gmail.com", "passwordTesting123");

        session.save(userData);
        session.getTransaction().commit();
        session.close();

        session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        userData.updateUser("test2", "test2@gmail.com", "thisisnowthepassword");

        session.save(userData);
        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }
}
