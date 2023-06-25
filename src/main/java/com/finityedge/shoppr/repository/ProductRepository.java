package com.finityedge.shoppr.repository;

import com.finityedge.shoppr.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
