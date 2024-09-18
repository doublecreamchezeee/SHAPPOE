package com.example.profileservice.controller;

import com.example.profileservice.dto.request.CartCreationRequest;
import com.example.profileservice.dto.request.CartItemCreationRequest;
import com.example.profileservice.dto.response.CartItemResponse;
import com.example.profileservice.dto.response.CartResponse;
import com.example.profileservice.model.CartItem;
import com.example.profileservice.service.CartItemService;
import com.example.profileservice.service.CartService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class CartController {
    CartService cartService;
    CartItemService cartItemService;
    @PostMapping("/cart")
    public CartResponse createCart(@RequestBody CartCreationRequest request) {
        return cartService.creatCart(request);
    }

    @PostMapping("/cart/items")
    public CartItemResponse createCartItem(@RequestBody CartItemCreationRequest request) {
        return cartItemService.createCartItem(request);
    }

    @GetMapping("/cart/{cartId}")
    public List<CartItem> getAllItems(@PathVariable String cartId){
        return cartService.getCartItemByCartId(cartId);
    }
}
