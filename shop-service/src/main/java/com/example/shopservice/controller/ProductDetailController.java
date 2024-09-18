package com.example.shopservice.controller;

import com.example.shopservice.model.ProductDetail;
import com.example.shopservice.service.ProductDetailsService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class ProductDetailController {
    ProductDetailsService pdService;

    @GetMapping("/details")
    public List<ProductDetail> getProductDetail() {
        return pdService.getAllProductDetails();
    }

    @GetMapping("/details/{id}")
    public List<ProductDetail> getProductDetailById(@PathVariable int id) {
        return pdService.getProductDetailById(id);
    }

    @GetMapping("/quantity")
    public int getTotalProductQuantityByProductId(@RequestParam int product_id, @RequestParam(required = false) String size) {
        if (size == null || size.isEmpty()) {
            return pdService.getProductDetailQuantityByProductId(product_id);
        }
        return pdService.getProductDetailQuantityByProductIdAndSize(product_id, Integer.parseInt(size));
    }
}
