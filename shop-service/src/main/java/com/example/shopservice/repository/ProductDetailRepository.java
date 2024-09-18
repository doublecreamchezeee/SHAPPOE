package com.example.shopservice.repository;

import com.example.shopservice.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {
    @Query("SELECT SUM(pd.quantity) FROM ProductDetail pd WHERE pd.productId = :productId")
    Integer getTotalQuantityByProductId(Integer productId);

    @Query("SELECT SUM(pd.quantity) FROM ProductDetail pd WHERE pd.productId = :productId AND pd.size = :size")
    Integer getTotalQuantityByProductIdAndSize(Integer productId, Integer size);


    List<ProductDetail> findByProductId(Integer productId);
}
