package com.java;

//Write a method factorial(int n) using a loop.

import java.util.Scanner;

//Write a method factorial(int n) using a loop.

public class methods_q8 {
    static void main() {
        int num;
        int fac;

        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number for the factorial: ");
        num = sc.nextInt();

        fac = factorial(num);
        System.out.print("The factorial of the number " + num + " is " + fac);

    }

    static int factorial(int n){
        int total = 1;

        for (int i = 1; i <= n; i ++){
            total = total * i;
        }

        return total;
    }
}
