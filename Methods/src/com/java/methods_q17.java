package com.java;

//Write a method fibonacci(int n) that prints first n numbers.

import java.util.Scanner;

public class methods_q17 {
    static void main() {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Fibonacci numbers: ");
        n = sc.nextInt();

        fibonacci(n);
    }

    static void fibonacci(int n){
        int n1 = 1;
        int n2 = 0;
        int aux = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(n2);
            aux = n2;
            n2 = n1;
            n1 = n1 + aux;

        }
    }
}
