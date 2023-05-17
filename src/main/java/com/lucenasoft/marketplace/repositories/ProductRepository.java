package com.lucenasoft.marketplace.repositories;

import com.lucenasoft.marketplace.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
