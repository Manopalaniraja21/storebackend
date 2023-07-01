package com.example.storebackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id",nullable = false)
    Long productId;
    @Column(name="product_category",nullable = false)
    String productCategory;
    @Column(name="product_name",nullable = false)
    String productName;
    @Column(name="product_price",nullable = false)
    String producPrice;
    @Column(name="product_description",nullable = false)
    String productDescription;
    @Column(name="product_cover",nullable = false)
    String productCover;
}
