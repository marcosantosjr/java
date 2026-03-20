package com.java;

//Write a method countVowels(String text) that returns the number of vowels.

import java.util.Scanner;

public class methods_q7 {
    static void main() {
        String text;

        Scanner sc = new Scanner(System.in);
        System.out.print("Write a word or a phrase: ");
        text = sc.nextLine();

        int totalOfStrings = countVowels(text);
        System.out.print("The word/phrase " + text + " has " + totalOfStrings + " vowels");
    }

    static int countVowels(String text){
        int sum = 0;

        for(char t: text.toCharArray()) {
            if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                    t == 'A'|| t == 'E' || t == 'I' || t == 'O' || t == 'U') {
                sum = sum + 1;
            }
        }

        return sum;
    }
}
