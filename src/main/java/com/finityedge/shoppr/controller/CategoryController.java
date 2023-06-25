package com.finityedge.shoppr.controller;

import com.finityedge.shoppr.model.Category;
import com.finityedge.shoppr.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryRepository categories;

    public CategoryController(CategoryRepository categories) {
        this.categories = categories;
    }

    @GetMapping
    public Iterable<Category> getAllCategories () {
        return categories.findAll();
    }

    @GetMapping("/{id}")
    public Category getCatgeoryById(@PathVariable Integer id) {
        return categories.findById(id).get();
    }
}
