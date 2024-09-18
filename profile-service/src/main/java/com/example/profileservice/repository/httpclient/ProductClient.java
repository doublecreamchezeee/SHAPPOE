package com.example.profileservice.repository.httpclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "shop-service", url="http://localhost:8003/")
public interface ProductClient {
}
