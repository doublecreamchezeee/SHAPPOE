package com.example.shopservice.service;

import com.example.shopservice.model.ProductDetail;
import com.example.shopservice.repository.ProductDetailRepository;
import com.example.shopservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductDetailsService {
    private final ProductDetailRepository repository;

    public List<ProductDetail> getProductDetailById(int id) {
        return repository.findByProductId(id);
    }

    public int getProductDetailQuantity(int id) {
        return repository.findById(id).get().getQuantity();
    }

    public void updateProductDetail(ProductDetail productDetail) {
        repository.save(productDetail);
    }

    public List<ProductDetail> getAllProductDetails() {
        return repository.findAll();
    }

    public int getProductDetailQuantityByProductId(int productId){
        return repository.getTotalQuantityByProductId(productId);
    }

    public int getProductDetailQuantityByProductIdAndSize(int productId, int size){
        return repository.getTotalQuantityByProductIdAndSize(productId, size);
    }
}
