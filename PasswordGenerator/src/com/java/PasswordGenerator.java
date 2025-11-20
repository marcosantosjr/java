package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da senha: ");
        byte n = scanner.nextByte();

        byte count = 1;

        Random random = new Random();

        String password = "";

        List<Character> database = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                                                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                                                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                                                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                                                    '!', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.',
                                                    '/', ':', ';', '<', '=', '>', '?', '@', '[', ']', '^', '_',
                                                    '`', '{', '|', '}', '~', ' ', '/');


        while (count <= n) {

            int randomIndex = random.nextInt(database.size()); // Generates a random index from 0 up to (size - 1)

            Character randomCharacter = database.get(randomIndex);

            password +=  randomCharacter;

            count++; // Increment count to eventually make the condition false
        }


        System.out.println("A senha gerada é: " + password);

    }

}
