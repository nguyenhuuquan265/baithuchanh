package com.fptaptech.springbootiocdibeantransactionalorm.controller;

import com.fptaptech.springbootiocdibeantransactionalorm.service.CategoryService;
import com.fptaptech.springbootiocdibeantransactionalorm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final CategoryService categoryService;

    @Autowired
    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }
    @GetMapping
    public String listProducts(Model model){
        model.addAttribute("products",productService.getAllProducts());
        return "product/list";

    }
}
