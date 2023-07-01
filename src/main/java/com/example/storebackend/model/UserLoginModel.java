package com.example.storebackend.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class UserLoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userId")
    private Long userId;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;


}
