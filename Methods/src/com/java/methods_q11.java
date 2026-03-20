package com.java;

//Create overloaded methods named add:
//
//add(int a, int b)
//
//add(double a, double b)
//
//add(int a, int b, int c)

public class methods_q11 {
    static void main() {
        int a = 1;
        int b = 2;
        double c = 3.5;
        double d = 4.75;
        int e = 5;
        int f = 6;
        int g = 7;

        System.out.println(add(a, b));
        System.out.println(add(c, d));
        System.out.println(add(e, f, g));
    }

    static int add(int a, int b){
        return a + b;
    }

    static double add(double a, double b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }
}
