package com.example.storebackend.repository;

import com.example.storebackend.model.UserRegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationModel,Long> {
    UserRegistrationModel findByEmail(String email);
}
