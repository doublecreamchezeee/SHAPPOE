package com.example.profileservice.service;

import com.example.profileservice.dto.request.CartItemCreationRequest;
import com.example.profileservice.dto.response.CartItemResponse;
import com.example.profileservice.mapper.CartItemMapper;
import com.example.profileservice.model.CartItem;
import com.example.profileservice.repository.CartItemRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CartItemService {
    CartItemRepository cartItemRepository;
    CartItemMapper cartItemMapper;

    public CartItemResponse createCartItem(CartItemCreationRequest request) {
        var cartItem = cartItemMapper.toCartItem(request);
        return cartItemMapper.toCartItemResponse(cartItemRepository.save(cartItem));
    }

//    public CartItemResponse getCartItemByCartId(String cartId) {
//        return cartItemMapper.toCartItemResponse(cartItemRepository.findByCartId(cartId));
//    }

    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

}
