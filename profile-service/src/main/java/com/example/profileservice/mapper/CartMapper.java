package com.example.profileservice.mapper;
import com.example.profileservice.dto.request.CartCreationRequest;
import com.example.profileservice.dto.response.CartResponse;
import com.example.profileservice.model.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {
    Cart toCart(CartCreationRequest request);
    CartResponse toCartResponse(Cart cart);
}
