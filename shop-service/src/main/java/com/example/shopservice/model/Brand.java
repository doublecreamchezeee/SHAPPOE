package com.example.shopservice.model;
import java.util.Set;
import com.example.shopservice.model.Product;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_id_gen")
    @SequenceGenerator(name = "brand_id_gen", sequenceName = "brand_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    String id;

    @Column(name = "name", nullable = false, length = 50)
    String name;
}