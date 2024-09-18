package com.example.profileservice.service;

import com.example.profileservice.dto.request.CartCreationRequest;
import com.example.profileservice.dto.response.CartResponse;
import com.example.profileservice.repository.CartRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CartService {
    CartRepository cartRepository;

    public CartResponse creatCart(CartCreationRequest request) {
        if (cartRepository.existsByProfileId(request.getProfileId()))
            throw new RuntimeE
    }
}
