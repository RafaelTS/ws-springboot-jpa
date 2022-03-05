package com.example.wsspringbootjpa.repositories;

import com.example.wsspringbootjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
