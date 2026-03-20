package com.java;

//Write a method that checks if a number is prime.

import java.util.Scanner;

public class methods_q18 {
    static void main() {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number to check if is it prime: ");
        n = sc.nextInt();

        System.out.println("Is it prime? " + prime(n));
    }

    static boolean prime(int n){
        int nMultiples = 0;
        int count = 1;
        boolean isPrime = false;

        while (count <= n) {
            if (n % count == 0){
                nMultiples += 1;
            }
            count += 1;
        }

        if (nMultiples == 2){
            isPrime = true;
        }

        return isPrime;
    }
}
