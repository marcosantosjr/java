package com.java;

//Create methods:
//
//calculateAverage(int marks[])
//
//getGrade(double avg)

public class methods_q14 {
    static void main() {
        int marks[] = {50, 60, 70, 80, 90};

        double avarage = calculateAvarage(marks);
        System.out.println("Your marks are: " + avarage);
        char grade = getGrade(avarage);
        System.out.println("Your grade is: " + grade);

    }

    static double calculateAvarage(int marks[]){
        double sum = 0;
        double avarage = 0;

        for (int i = 0; i < marks.length; i ++){
            sum = sum + marks[i];
        }

        avarage = sum / marks.length;

        return avarage;
    }

    static char getGrade(double avarage){
        if (avarage > 80) {
            return 'A';
        } else if (avarage > 70) {
            return 'B';
        } else if (avarage > 60) {
            return 'C';
        } else if (avarage > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
