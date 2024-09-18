package com.example.profileservice.controller;

import com.example.profileservice.dto.request.CartCreationRequest;
import com.example.profileservice.dto.response.CartResponse;
import com.example.profileservice.service.CartService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class CartController {
    CartService cartService;
    @PostMapping("/cart")
    public CartResponse createCart(@RequestBody CartCreationRequest request) {
        return cartService.creatCart(request);
    }
}
