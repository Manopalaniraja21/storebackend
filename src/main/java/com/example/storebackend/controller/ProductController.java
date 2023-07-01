package com.example.storebackend.controller;

import com.example.storebackend.model.ProductModel;
import com.example.storebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value="/product")
public class ProductController {
    @Autowired
    ProductService ps;
    @GetMapping ("/all")
    public List<ProductModel> getAll(){
          return ps.getAllProduct();
    }
    @GetMapping(value="/product/")
    public List<ProductModel>getProductByName(@RequestParam String productName){
        return ps.getProductByName(productName);

    }
    @GetMapping(value="/product")
    public List<ProductModel>getProductByCategory(@RequestParam String productCategory){
        return ps.getProductByCategory(productCategory);
    }
    @DeleteMapping(value="/deleteProduct")
    public String deleteByName(@RequestParam String productName){
        return ps.deleteProductByName(productName);
    }
}
