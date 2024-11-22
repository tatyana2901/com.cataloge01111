package com.cataloge.com.cataloge;

public class Product {
    private String name;
    private int id;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.id = (int) (Math.random() * 10000.0);
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
