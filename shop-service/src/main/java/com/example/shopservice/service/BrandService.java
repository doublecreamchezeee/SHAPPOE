package com.example.shopservice.service;

import com.example.shopservice.model.Brand;

import java.util.List;

public interface BrandService {
    Brand getBrandById(int id);
    void saveBrand(Brand brand);
    void updateBrand(Brand brand);
    void deleteBrand(int id);
    List<Brand> getAllBrands();
}
