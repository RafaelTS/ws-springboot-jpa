package com.example.wsspringbootjpa.repositories;

import com.example.wsspringbootjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
