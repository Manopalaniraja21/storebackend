//package com.example.storebackend.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//import org.springframework.data.annotation.Id;
//
////import javax.persistence.*;
//import java.util.List;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "orders")
//public class OrderModel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "order_id")
//    private Long orderId;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private UserLoginModel user;
//
//    @OneToMany(mappedBy = "order")
//    private List<ProductModel> products;
//
//    // Add other order-related fields and methods as needed
//}
