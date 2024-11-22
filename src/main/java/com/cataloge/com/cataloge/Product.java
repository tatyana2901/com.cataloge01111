package com.cataloge.com.cataloge;

import java.util.UUID;

public class Product {
    static int counter = 0;
    private int id;

    private String name;
    private int price;
    private String info;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        counter++;
        this.id = counter;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
