package com.example.storebackend.service;

import com.example.storebackend.controller.ProductController;
import com.example.storebackend.model.ProductModel;
import com.example.storebackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository pr;
    public List<ProductModel> getAllProduct(){
        return pr.findAll();

    }
    public List<ProductModel>getProductByName(String productName){
        return pr.findByProductName(productName);
    }
    public List<ProductModel>getProductByCategory(String productCategory){
        return pr.findByProductName(productCategory);
    }
    public ProductModel saveProduct(ProductModel model){
        return  pr.save(model);
    }
    public String deleteProductByName(String productName){
        List<ProductModel> product = pr.findByProductName(productName);
        if(!product.isEmpty()){
        pr.deleteAllInBatch(product);
        return productName+": deleted product sucessfully";}
        return "Product not availables";

    }
//    public String updateProductByName(String productNane){
//
//        return "";
//    }



}
