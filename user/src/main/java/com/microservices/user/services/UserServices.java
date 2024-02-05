package com.microservices.user.services;

import com.microservices.user.models.TelephoneModel;
import com.microservices.user.models.UserModel;
import com.microservices.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;
    public UserModel saveUser(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
