package com.fptaptech.springbootiocdibeantransactionalorm.service;

import com.fptaptech.springbootiocdibeantransactionalorm.entity.Product;
import com.fptaptech.springbootiocdibeantransactionalorm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired//DI
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
