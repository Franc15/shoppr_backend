package com.finityedge.shoppr.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Category {
    @Id
    private Integer id;
    private String name;
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public Category(String name, String desc) {
        this.name = name;
        this.desc = desc;
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
