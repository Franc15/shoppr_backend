package com.finityedge.shoppr.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.time.LocalDateTime;

public class Product {
    @Id
    private Integer id;
    private String name;
    private String desc;
    private AggregateReference<Category, Integer> category;
    private double price;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public Product(String name,
                   String desc,
                   AggregateReference<Category, Integer> category,
                   double price) {
        this.name = name;
        this.desc = desc;
        this.category = category;
        this.price = price;
        this.createdAt = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AggregateReference<Category, Integer> getCategory() {
        return category;
    }

    public void setCategory(AggregateReference<Category, Integer> category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
