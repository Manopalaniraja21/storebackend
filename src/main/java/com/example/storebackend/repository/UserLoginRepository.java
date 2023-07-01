package com.example.storebackend.repository;

import com.example.storebackend.model.UserLoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLoginModel,Long> {


}
