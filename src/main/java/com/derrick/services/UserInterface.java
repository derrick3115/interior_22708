package com.derrick.services;

import com.derrick.DataTransferObject.UserRegistartionDto;
import com.derrick.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserInterface extends UserDetailsService {
    public User saveAccount(UserRegistartionDto userRegistartionDto);
}
