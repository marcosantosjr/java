package com.java;

//Create overloaded area methods:
//
//Circle → area(double radius)
//
//Rectangle → area(int length, int width)

public class methods_q12 {
    static void main() {
        double r = 3;
        int x = 4;
        int y = 5;

        System.out.println("Circle area: " + area(r));
        System.out.println("Rectangle area: " + area(x, y));
    }

    static double area(double radius){
        double pi = 3.14159;

        return pi * radius * radius;
    }

    static int area(int length, int width){
        return length * width;
    }
}
