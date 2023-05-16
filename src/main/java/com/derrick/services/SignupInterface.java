package com.derrick.services;

import com.derrick.model.Signup;

public interface SignupInterface {
    public Signup saveAccount(Signup signup);
    public Signup findAccount(Long id);
    public boolean userCheck(String email, String password );
}
