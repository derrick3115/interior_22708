package com.derrick.dao;
import com.derrick.model.Signup;
import org.hibernate.Session;

import java.util.List;

public class userAuthentication {
    public boolean loginUser(String email, String password) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Signup so WHERE so.email = :email AND so.password = :password", Signup.class)
                    .setParameter("email", email)
                    .setParameter("password", password)
                    .getResultStream()
                    .findFirst()
                    .isPresent();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
