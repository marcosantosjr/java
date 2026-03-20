package com.java;

//Write a method isPalindrome(String text)
//Returns true if the string is same reversed.

import java.util.Scanner;

public class methods_q10 {
    static void main() {
        String text;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        text = sc.nextLine();

        Boolean pal = isPalindrome(text);

        System.out.print("Is palindrome? " + pal);
    }

    static Boolean isPalindrome(String text){
        String part1 = "";
        String part2 = "";

        for(int i = (text.length() / 2); i >= 0; i--) {
            part1 = text.charAt(i) + part1;
        }

        for(int i = 0; i <= (text.length() / 2); i++) {
            part2 = part2 + text.charAt(i);
        }

        if (part1.equals(part2)){
            return true;
        } else {
            return false;
        }
    }
}
