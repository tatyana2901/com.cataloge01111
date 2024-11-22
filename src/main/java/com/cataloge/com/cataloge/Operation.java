package com.cataloge.com.cataloge;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

@Service
public class Operation {
    public Operation() {
        products.add(new Product("Чайник", 500));
        products.add(new Product("Кофеварка", 150));
        products.add(new Product("Микроволновка", 980));

    }

    List<Product> products = new ArrayList<>();/*List.of(new Product("Чайник", 500), new Product("Кофеварка", 150), new Product("Микроволновка", 980));*/

    public void add(String productName, String price) {
        products.add(new Product(productName, Integer.parseInt(price)));
    }

    public Product getProductByID(int id) {

        try {
            return products.stream().filter(product -> product.getId() == id).findFirst().get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public void delete(String id) {
        int index = products.indexOf(getProductByID(Integer.parseInt(id)));
        products.remove(index);

    }


}
