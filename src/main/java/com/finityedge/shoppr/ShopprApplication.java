package com.finityedge.shoppr;

import com.finityedge.shoppr.model.Category;
import com.finityedge.shoppr.model.Product;
import com.finityedge.shoppr.repository.CategoryRepository;
import com.finityedge.shoppr.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

@SpringBootApplication
public class ShopprApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopprApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CategoryRepository categories, ProductRepository products) {
        return args -> {
            Category category = new Category("tech", "Technology devices and gadgets");
            AggregateReference<Category, Integer> categoryIntegerAggregateReference =
                    AggregateReference.to(categories.save(category).getId());
            Category category1 = new Category("fashion", "Fashion and clothing");
            AggregateReference<Category, Integer> categoryIntegerAggregateReference1 =
                    AggregateReference.to(categories.save(category1).getId());
            Category category2 = new Category("home", "Home and living");
            AggregateReference<Category, Integer> categoryIntegerAggregateReference2 =
                    AggregateReference.to(categories.save(category2).getId());
            Product product = new Product("iPhone 12", "Apple's latest iPhone", categoryIntegerAggregateReference, 999.99);
            Product product1 = new Product("Samsung Galaxy S21", "Samsung's latest Galaxy phone", categoryIntegerAggregateReference, 899.99);
            Product product2 = new Product("MacBook Pro", "Apple's latest MacBook", categoryIntegerAggregateReference, 1999.99);
            Product product3 = new Product("Air Jordan 1", "Nike's latest Air Jordan", categoryIntegerAggregateReference1, 199.99);
            Product product4 = new Product("Air Jordan 2", "Nike's latest Air Jordan", categoryIntegerAggregateReference1, 199.99);
            Product product5 = new Product("Cleanix", "A cleaning robot", categoryIntegerAggregateReference2, 299.99);
            products.save(product);
            products.save(product1);
            products.save(product2);
            products.save(product3);
            products.save(product4);
            products.save(product5);

        };
    }

}
