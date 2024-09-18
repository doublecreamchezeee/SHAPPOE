package com.example.shopservice.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_gen")
    @SequenceGenerator(name = "product_id_gen", sequenceName = "product_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Integer id;

    @Column(name = "brand", nullable = false, length = 50)
    String brand;

    @Column(name = "model", nullable = false, length = 100)
    String model;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    BigDecimal price;

    @Column(name = "image_url")
    String imageUrl;

    @Column(name = "color")
    String color;

    @ManyToOne
    @JoinColumn(name="brand", nullable = false, insertable = false, updatable = false)
    Brand brandName;
}