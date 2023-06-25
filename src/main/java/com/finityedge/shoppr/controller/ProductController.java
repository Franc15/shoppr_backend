package com.finityedge.shoppr.controller;

import com.finityedge.shoppr.model.Product;
import com.finityedge.shoppr.repository.CategoryRepository;
import com.finityedge.shoppr.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final CategoryRepository categories;
    private final ProductRepository products;

    public ProductController(CategoryRepository categories, ProductRepository products) {
        this.categories = categories;
        this.products = products;
    }

    @GetMapping("")
    public Iterable<Product> getAllProducts() {
        return products.findAll();
    }
}
