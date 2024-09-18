package com.example.profileservice.repository;

import com.example.profileservice.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {
    boolean existsByProfileId(String profileId);
}
