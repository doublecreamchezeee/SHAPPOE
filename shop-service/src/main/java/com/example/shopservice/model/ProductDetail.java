package com.example.shopservice.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "product_details")
public class ProductDetail {
    @Id
    @Column(name = "id", nullable = false)
    Integer id;

    @Column(name="product_id", nullable = false)
    Integer productId;

    @Column(name = "size")
    Integer size;

    @Column(name = "quantity")
    Integer quantity;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
    Product product;

}