package com.derrick.services.DesignServiceImp;

import com.derrick.repository.SignupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
public class userAuthentication1 {

 SignupRepository signupRepositor;

    public userAuthentication1(SignupRepository signupRepositor) {
        this.signupRepositor = signupRepositor;
    }

    @Transactional
    public boolean loginUser(String email, String password) {
        try {
            return signupRepositor.existsByEmailAndPassword(email, password);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
