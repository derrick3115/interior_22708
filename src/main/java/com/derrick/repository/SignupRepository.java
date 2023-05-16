package com.derrick.repository;

import com.derrick.model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SignupRepository extends JpaRepository <Signup,Long> {
    boolean existsByEmailAndPassword(String email, String password);
}
