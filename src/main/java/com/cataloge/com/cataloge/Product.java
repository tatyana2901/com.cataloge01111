package com.cataloge.com.cataloge;

import java.util.UUID;

public class Product {
    private String name;
    private String id;
    private int price;
    private String info;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.id = String.valueOf(UUID.randomUUID());
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
