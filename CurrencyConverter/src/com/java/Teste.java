package com.java;

import java.util.Scanner;

public class Teste {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Converter converter = new Converter();

        System.out.print("Real to Dolar: ");

        converter.number = scanner.nextInt();

        converter.realToDolar();

        System.out.printf("Balance: %.2f", converter.verifyBalance());

    }

}
