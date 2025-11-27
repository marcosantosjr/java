package com.java;

import java.util.*;


public class GuesserNumber {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();

        int maxRange = 0;

        int choices = 1;

        int chances = 1;

        System.out.println("Choose the difficult for the number guessing number:");
        System.out.println("1) for easy (1 to 10)");
        System.out.println("2) for hard (1 to 100)");

        int difficult = scanner.nextByte();

        if (difficult == 1) {
            maxRange = 10;
            chances = 3;
        } else if (difficult == 2) {
            maxRange = 100;
            chances = 10;
        } else {
            System.out.println("Dificuldade inválida, usando o modo fácil (1 a 10).");
        }

        for (int i = 1; i <= maxRange; i++) {
            numbers.add(i);
        }

        int randomNum = numbers.get(random.nextInt(numbers.size()));

        while (choices <= chances) {
            System.out.print("Guess the number: ");
            byte yourGuess = scanner.nextByte();

            if (yourGuess == randomNum) {
                System.out.println("Congratulations");
                break;
            }

            if (choices == chances){
                System.out.println("Unfortunately you not guessed it, try again");
            }

            choices++;
        }
    }
}
