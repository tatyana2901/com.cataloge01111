package com.cataloge.com.cataloge;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Service
public class Operation {

    List<Product> products = Arrays.asList(new Product("Чайник", 500), new Product("Кофеварка", 150), new Product("Микроволновка", 980));

    public void add(Product product) {
        products.add(product);
    }

    public Product getProductByID(String id) {
        return products.stream().filter(product -> product.getId().equals(id) ).findFirst().orElse(null);
    }


}
