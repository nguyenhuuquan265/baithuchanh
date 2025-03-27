package com.fptaptech.springbootiocdibeantransactionalorm.service;

import com.fptaptech.springbootiocdibeantransactionalorm.entity.Category;
import com.fptaptech.springbootiocdibeantransactionalorm.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
