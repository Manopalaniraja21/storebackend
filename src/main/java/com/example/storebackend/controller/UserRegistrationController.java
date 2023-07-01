package com.example.storebackend.controller;

import com.example.storebackend.model.UserRegistrationModel;
import com.example.storebackend.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserRegistrationController {
    @Autowired
    UserRegistrationService urs;
    @PostMapping("/registeruser")
    public ResponseEntity<String> saveUser(@RequestBody  UserRegistrationModel model){
        return urs.saveUser(model);
    }
}
