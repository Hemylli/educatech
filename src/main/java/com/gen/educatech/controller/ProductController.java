package com.gen.educatech.controller;

import com.gen.educatech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

//    @GetMapping
//    public ResponseEntity<List<Product>> getAll() {
//        return ResponseEntity.ok(productRepository.findAll());
//    }
}
