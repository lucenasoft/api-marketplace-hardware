package com.lucenasoft.marketplace.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "hardwares")
@Entity(name = "hardwares")
public class ProductModel {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String imgURL;
    private Double price;

    public ProductModel(ProductRequestDTO body) {
        this.title = body.title();
        this.imgURL = body.imgURL();
        this.price = body.price();
    }
}
