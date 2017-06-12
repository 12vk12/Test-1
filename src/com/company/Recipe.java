package com.company;

/**
 * Created by Цьома on 26.01.2017.
 */
public class Recipe {

    String name;
    Product sugar;
    Product tea;
    Product coffee;
    Product milk;

    public Recipe(String name, Product sugar, Product tea, Product coffee, Product milk) {
        this.name = name;
        this.sugar = sugar;
        this.tea = tea;
        this.coffee = coffee;
        this.milk = milk;
    }

    ////    public Recipe(String recipeName, String name1, String name2, double quantity1, double quantity2) {
////        this.name = recipeName;
////        this.name1 = name1;
////        this.name2 = name2;
////        this.quantity1 = quantity1;
////        this.quantity2 = quantity2;
////    }
////
////    public Recipe(String recipeName, String name1, double quantity1) {
////        this.name = recipeName;
////        this.name1 = name1;
////        this.quantity1 = quantity1;
//    }
}
