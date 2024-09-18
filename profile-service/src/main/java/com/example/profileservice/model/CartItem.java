package com.example.profileservice.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    @Column(name="cart_id")
    String cartId;
    Integer productId;
    Double size;
    Double price;
    Integer quantity;

    @ManyToOne
    @JoinColumn(name="cart_id", insertable=false, updatable=false)
    Cart cart;
}
