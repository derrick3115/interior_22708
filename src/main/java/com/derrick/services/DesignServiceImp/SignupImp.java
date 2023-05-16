package com.derrick.services.DesignServiceImp;

import com.derrick.dao.userAuthentication;
import com.derrick.model.Signup;
import com.derrick.repository.SignupRepository;
import com.derrick.services.SignupInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SignupImp implements SignupInterface {
  userAuthentication dao=new userAuthentication();
    @Autowired
    SignupRepository signupRepository;

    public SignupImp() {
    }

    @Override
    public Signup saveAccount(Signup signup) {
        return signupRepository.save(signup);
    }

    @Override
    public Signup findAccount(Long id) {
        return signupRepository.findById(id).get();
    }

    @Override
    public boolean userCheck(String email, String password) {

      try {
        return signupRepository.existsByEmailAndPassword(email, password);
      } catch (Exception ex) {
        ex.printStackTrace();
        return false;

      }
    }
}
