package com.example.storebackend.controller;

import com.example.storebackend.model.UserLoginModel;
import com.example.storebackend.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserLoginController {

    private final UserLoginService userLoginService;

    @Autowired
    public UserLoginController(UserLoginService userLoginService) {
        this.userLoginService = userLoginService;
    }

    @PostMapping(value="/login")
    public ResponseEntity<String> validateUser(@RequestBody UserLoginModel model) {
        return userLoginService.validateUser(model);
    }
}
