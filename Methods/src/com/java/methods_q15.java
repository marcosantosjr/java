package com.java;

// Password Checker
//Write method isStrongPassword(String password)
//Conditions:
//
//At least 8 characters
//
//Contains number
//
//Contains uppercase letter

import java.util.Scanner;

public class methods_q15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Password: ");
        String password = sc.nextLine();

        System.out.println(isStrongPassword(password));
    }

    static boolean isStrongPassword(String password) {
        boolean isStrong = true;

        if (password.length() < 8) {
            isStrong = false;
        }

        if (!password.matches(".*\\d.*")){
            isStrong = false;
        }

        boolean isCapital = false;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isUpperCase(character)) {
                isCapital = true;
                break;
            }
        }
        return isStrong && isCapital;
    }
}
