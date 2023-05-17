package com.lucenasoft.marketplace.models;

import java.util.UUID;

public record ProductResponseDTO(UUID id, String title, String imgURL, Double price) {
    public ProductResponseDTO(ProductModel product){
        this(product.getId(), product.getTitle(), product.getImgURL(), product.getPrice());
    }
}
