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
@Table(name = "\"cart\"")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    float price;
    int totalItems;
    int totalPrice;

}
