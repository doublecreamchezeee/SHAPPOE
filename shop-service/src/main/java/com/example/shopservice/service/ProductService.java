package com.example.shopservice.service;

import com.example.shopservice.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(int id);
    void saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> getAllProducts();
    List<Product> getProductsByBrand(String category);
}