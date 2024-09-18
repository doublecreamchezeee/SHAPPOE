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
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    @Column(name="profile_id")
    String profileId;
    Integer totalItems;
    Double totalPrice;
    @OneToOne
    @JoinColumn(name = "profile_id", insertable = false, updatable = false)
    Profile profile;
}
