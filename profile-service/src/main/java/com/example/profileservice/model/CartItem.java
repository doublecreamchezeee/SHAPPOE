package com.example.profileservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class CartItem {
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String cartId;

}
