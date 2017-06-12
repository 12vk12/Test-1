package com.company;

/**
 * Created by Цьома on 26.01.2017.
 */
public class Product {

    String name;
    double quantity;
    double price;

    public Product(String name, double quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
