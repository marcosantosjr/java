package com.java;

//Write a method isEven(int num) that returns true if number is even, otherwise false.

import java.util.Scanner;

public class methods_q4 {
    static void main() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.print("This number is Even? " + isEven(num));
    }

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
