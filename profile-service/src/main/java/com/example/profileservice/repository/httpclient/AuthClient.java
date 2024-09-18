package com.example.profileservice.repository.httpclient;

import com.example.profileservice.dto.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "identity-service", url = "http://localhost:8001/identity")
public interface AuthClient {
    @GetMapping(value = "/users/my-info")
    UserResponse getMyInfo();
}
