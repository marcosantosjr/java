package com.java;

//Write a method square(int num) that returns the square of a number.

import java.util.Scanner;

public class methods_q3 {
    static void main() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        square(num);
    }

    static void square(int num) {
        System.out.println("The square of the number " + num + " is " +  num * num);
    }
}
