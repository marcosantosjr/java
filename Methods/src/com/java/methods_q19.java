package com.java;

//Bank System
//Create methods:
//
//deposit(amount)
//
//withdraw(amount)
//
//checkBalance()

import java.util.Scanner;

public class methods_q19 {
    public static int total = 1000;

    static void main() {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Deposite value: ");
        n = sc.nextInt();
        deposit(n);


        System.out.print("Withdraw value: ");
        n = sc.nextInt();
        withdraw(n);

        checkBalance();

    }

    static void deposit(int amount) {
        System.out.println("Deposited.");
        total = total + amount;
    }

    static void withdraw(int amount) {
        System.out.println("Withdrawed.");
        total = total - amount;
    }

    static void checkBalance(){
        System.out.println("Account balance: " + total);
    }

}

