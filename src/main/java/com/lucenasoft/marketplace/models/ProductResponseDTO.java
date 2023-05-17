package com.lucenasoft.marketplace.models;

public record ProductResponseDTO(Long id, String title, String imgURL, Integer price) {
    public ProductResponseDTO(ProductModel product){
        this(product.getId(), product.getTitle(), product.getImgURL(), product.getPrice());
    }
}
