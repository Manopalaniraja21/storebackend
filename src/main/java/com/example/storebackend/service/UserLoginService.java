package com.example.storebackend.service;

import com.example.storebackend.model.UserLoginModel;
import com.example.storebackend.model.UserRegistrationModel;
import com.example.storebackend.repository.UserLoginRepository;
import com.example.storebackend.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    @Autowired
    UserLoginRepository ulr;
    @Autowired
    UserRegistrationRepository urr;

    public ResponseEntity<String> validateUser(UserLoginModel model) {
        String userEmail = model.getEmail();
        String password = model.getPassword();
        UserRegistrationModel existingUser = urr.findByEmail(userEmail);

        if (existingUser != null && existingUser.getPassword().equals(password)) {
            return new ResponseEntity<>("User login successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }
}
