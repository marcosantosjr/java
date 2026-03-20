package com.java;

//Write a method reverseNumber(int num)
//Example:
//Input: 1234
//Output: 4321

import java.util.Scanner;

public class methods_q9 {
    static void main() {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        num = sc.nextInt();

        int reversed = reverseNumber(num);

        System.out.print("The reversed num is: " + reversed);

    }

    static int reverseNumber(int num){
        String input = String.valueOf(num);
        String output = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        int reverse = Integer.parseInt(output);
        return reverse;
    }
}
