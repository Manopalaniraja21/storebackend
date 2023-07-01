package com.example.storebackend.repository;

import com.example.storebackend.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Long> {
//    Find product by name
   List<ProductModel> findByProductName(String productName);
//   Find product by their category
    List<ProductModel>findByProductCategory(String productCategory);
}
