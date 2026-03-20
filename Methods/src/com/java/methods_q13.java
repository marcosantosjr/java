package com.java;

//Q13. 🛒 Simple Billing System
//Create methods:
//
//addItem(int price)
//
//getTotal()

import java.util.Scanner;

public class methods_q13 {
    public static int total;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter de price: ");
            int price = sc.nextInt();
            addItem(price);
        }

        getTotal();
    }

    static void addItem(int price) {
        System.out.println("Item added.");
        total = total + price;
    }

    static void getTotal(){
        System.out.println("The total price is: " + total);
    }
}
