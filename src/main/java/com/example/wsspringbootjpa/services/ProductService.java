package com.example.wsspringbootjpa.services;


import com.example.wsspringbootjpa.entities.Product;
import com.example.wsspringbootjpa.entities.User;
import com.example.wsspringbootjpa.repositories.ProductRepository;
import com.example.wsspringbootjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
