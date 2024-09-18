package com.example.shopservice.controller;

import com.example.shopservice.model.Product;
import com.example.shopservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    @ResponseBody
    public List<Product> getProducts(@RequestParam(required = false) String brand) {
        if (brand == null || brand.isEmpty()) {
            return productService.getAllProducts();
        }
        return productService.getProductsByBrand(brand.toUpperCase());
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @PutMapping("products/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product) {
        Product existingProduct = productService.getProductById(id);
        if (existingProduct != null) {
            product.setId(id); // Ensure the correct ID is set
            productService.saveProduct(product);
        }
    }

    @DeleteMapping("products/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}
