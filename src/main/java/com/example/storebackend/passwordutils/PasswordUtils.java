//package com.example.storebackend.passwordutils;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//public class PasswordUtils {
//    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//    public static String encryptPassword(String password){
//        return passwordEncoder.encode(password);
//    }
//    public static boolean isPasswordValid(String password,String encodedPassword){
//        return passwordEncoder.matches(password,encodedPassword);
//    }
//}
