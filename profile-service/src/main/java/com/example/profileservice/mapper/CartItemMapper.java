package com.example.profileservice.mapper;

import com.example.profileservice.dto.request.CartItemCreationRequest;
import com.example.profileservice.dto.response.CartItemResponse;
import com.example.profileservice.model.CartItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartItemMapper {
    CartItem toCartItem(CartItemCreationRequest request);
    CartItemResponse toCartItemResponse(CartItem cartItem);
}
