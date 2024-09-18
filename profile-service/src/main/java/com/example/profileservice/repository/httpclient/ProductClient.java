package com.example.profileservice.repository.httpclient;

import com.example.profileservice.dto.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "shop-service", url = "http://localhost:8000/shop")
public interface ProductClient {
    @GetMapping(value="/products/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ProductResponse getProductById(@PathVariable int id);
}