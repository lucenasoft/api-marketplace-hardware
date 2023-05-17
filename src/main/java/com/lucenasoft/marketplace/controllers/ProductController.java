package com.lucenasoft.marketplace.controllers;

import com.lucenasoft.marketplace.models.ProductModel;
import com.lucenasoft.marketplace.models.ProductRequestDTO;
import com.lucenasoft.marketplace.models.ProductResponseDTO;
import com.lucenasoft.marketplace.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController implements Serializable {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<ProductResponseDTO> getAll(){
        return productRepository.findAll().stream().map(ProductResponseDTO::new).toList();
    }

    @PostMapping("product")
    public void saveProduct(@RequestBody ProductRequestDTO body){
        ProductModel productBody = new ProductModel(body);
        productRepository.save(productBody);
    }
}
