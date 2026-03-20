package com.java;

//Write a method findMax(int a, int b) that returns the larger number.

import java.util.Scanner;

public class methods_q5 {
    static void main() {
        int a, b;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the value of 'b': ");
        b = sc1.nextInt();

        System.out.print("The larger number is: " + findMax(a, b));
    }

    static int findMax(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}
