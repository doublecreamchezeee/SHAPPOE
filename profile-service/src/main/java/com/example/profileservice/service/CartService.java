package com.example.profileservice.service;

import com.example.profileservice.dto.request.CartCreationRequest;
import com.example.profileservice.dto.response.CartResponse;
import com.example.profileservice.mapper.CartItemMapper;
import com.example.profileservice.mapper.CartMapper;
import com.example.profileservice.model.Cart;
import com.example.profileservice.model.CartItem;
import com.example.profileservice.repository.CartItemRepository;
import com.example.profileservice.repository.CartRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CartService {
    CartRepository cartRepository;
    CartMapper cartMapper;
    CartItemMapper cartItemMapper;
    CartItemRepository cartItemRepository;
    public CartResponse creatCart(CartCreationRequest request) {
        if (cartRepository.existsByProfileId(request.getProfileId()))
            throw new RuntimeException("Cart already exists");

        Cart cart = cartMapper.toCart(request);
        System.out.println(cart);
        return cartMapper.toCartResponse(cartRepository.save(cart));
    }

    public List<CartItem> getCartItemByCartId(String cartId) {
        return cartItemRepository.findAllByCartId(cartId);
    }
}
