package com.example.storebackend.service;

import com.example.storebackend.model.UserRegistrationModel;
//import com.example.storebackend.passwordutils.PasswordUtils;
import com.example.storebackend.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
    @Autowired
    UserRegistrationRepository urr;

    public ResponseEntity <String> saveUser(UserRegistrationModel model) {
//        String email= model.getEmail();
//        UserRegistrationModel existingEmail=urr.findByEmail(email);
//        if(existingEmail==null){
//            urr.save(model);
//            return "User saved";
//        }
//        else{
//            return "Username already exists";
//        }
        try {
            String email = model.getEmail();
            UserRegistrationModel existingEmail = urr.findByEmail(email);
            if (existingEmail != null) {
                return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists");
            } else {
//                String encryptedPassword= PasswordUtils.encryptPassword(model.getPassword());
//                model.setPassword(encryptedPassword);
                UserRegistrationModel savedUser = urr.save(model);
                if (savedUser != null) {
                    return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
                } else {
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save user");
                }
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}
