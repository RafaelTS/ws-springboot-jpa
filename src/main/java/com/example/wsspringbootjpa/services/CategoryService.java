package com.example.wsspringbootjpa.services;


import com.example.wsspringbootjpa.entities.Category;
import com.example.wsspringbootjpa.entities.User;
import com.example.wsspringbootjpa.repositories.CategoryRepository;
import com.example.wsspringbootjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
