package com.cataloge.com.cataloge;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Operation {

    List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }



}
