package com.example.profileservice.repository;

import com.example.profileservice.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, String> {
//    CartItem findByprofileId(String profileId);
    List<CartItem> findAllByCartId(String cartId);
}
