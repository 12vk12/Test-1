package com.company;

import java.util.Scanner;

public class CoffeeMachine {

    static Product[] container = new Product[4];
    static Product[] allProducts = new Product[4];
    static Recipe[] choice = new Recipe[3];

    public static void main(String[] args) {

        setProducts();
        setRecipe();

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n >= 0) {
            System.out.println("Введите 1 - для выхода из программы, " +
                    "2 - для заказа, " +
                    "3 - для добавления продуктов, " +
                    "4 - отчет;");
            n = sc.nextInt();
            if (n == 4) {
                showContainer();
            }
            if (n == 3) {
                addProducts();
            }
            if (n == 2) {
                getRecipe();
            }
            if (n == 1) {
                return;
            }
        }
    }

    static void setProducts() {

        Product sugar = new Product("Sugar", 1, 14);
        Product tea = new Product("Tea", 100, 2);
        Product coffee = new Product("Coffee", 1, 10);
        Product milk = new Product("Milk", 1, 20);
        container[0] = sugar;
        container[1] = tea;
        container[2] = coffee;
        container[3] = milk;

        allProducts[0] = sugar;
        allProducts[1] = tea;
        allProducts[2] = coffee;
        allProducts[3] = milk;

    }

    public static void getRecipe (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 0 - Эспрессо, 1 - Горячее молоко, 2 - Черный чай;");
        int n = sc.nextInt();

        if (n == 2) {
            container[0].quantity -= choice[2].sugar.quantity;
            container[1].quantity -= choice[2].tea.quantity;
            container[2].quantity -= choice[2].coffee.quantity;
            container[3].quantity -= choice[2].milk.quantity;
        }
        if (n == 1) {
            container[0].quantity -= choice[1].sugar.quantity;
            container[1].quantity -= choice[1].tea.quantity;
            container[2].quantity -= choice[1].coffee.quantity;
            container[3].quantity -= choice[1].milk.quantity;
        }
        if (n == 0) {
            container[0].quantity -= choice[0].sugar.quantity;
            container[1].quantity -= choice[0].tea.quantity;
            container[2].quantity -= choice[0].coffee.quantity;
            container[3].quantity -= choice[0].milk.quantity;
        }
    }

    static void addProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите количество привезенного сахара");
        double sugarQuantity = sc.nextDouble();
        container[0].quantity += sugarQuantity;
        allProducts[0].quantity += sugarQuantity;

        System.out.println("Укажите количество привезенного чая");
        double teaQuantity = sc.nextDouble();
        container[1].quantity += teaQuantity;
        allProducts[1].quantity += teaQuantity;

        System.out.println("Укажите количество привезенного кофе");
        double coffeeQuantity = sc.nextDouble();
        container[2].quantity += coffeeQuantity;
        allProducts[2].quantity += coffeeQuantity;

        System.out.println("Укажите количество привезенного молока");
        double milkQuantity = sc.nextDouble();
        container[3].quantity += milkQuantity;
        allProducts[3].quantity += milkQuantity;
    }

    static void showContainer() {

        for (int i = 0; i < container.length; i++) {
            System.out.println(container[i].name + " - quantity = " + container[i].quantity + " - price = " + container[i].price);
        }
    }

    static void setRecipe() {
        Recipe espresso = new Recipe("Espresso", new Product("sugar", 0.01),
                new Product("tea", 0.0),
                new Product("coffee", 0.01),
                new Product("milk", 0.0));
        Recipe hotMilk = new Recipe("Hot Milk", new Product("sugar", 0.0),
                new Product("tea", 0.0),
                new Product("coffee", 0.0),
                new Product("milk", 0.2));
        Recipe blackTea = new Recipe("Black Tea", new Product("sugar", 0.01),
                new Product("tea", 1),
                new Product("coffee", 0.0),
                new Product("milk", 0.0));

        choice[0] = espresso;
        choice[1] = hotMilk;
        choice[2] = blackTea;

    }

//    static void showRecipe() {
//
//        for (int i = 0; i < choice.length; i++) {
//            System.out.println(choice[i].name + ": " + choice[i].name1 + " " + choice[i].quantity1 + " + " + choice[i].name2 + " " + choice[i].quantity2);
//
//        }
//    }
}
