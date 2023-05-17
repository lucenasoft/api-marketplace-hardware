package com.lucenasoft.marketplace.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "hardwares")
@Entity(name = "hardwares")
public class ProductModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String imgURL;
    private Integer price;

    public ProductModel(ProductRequestDTO body) {
        this.title = body.title();
        this.imgURL = body.imgURL();
        this.price = body.price();
    }
}
