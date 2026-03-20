package com.java;

//Write a method sumOfArray(int[] arr) that returns the sum of all elements.

public class methods_q6 {
    static void main() {

        int[] arr = {1, 2, 3, 4, 6};

        int sum = sumOfArray(arr);

        System.out.println("The result is: " + sum);

    }

    static int sumOfArray(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        return sum;
    }
}
