package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// task 2

    }

    static void task2() {
        Scanner scanner = new Scanner(System.in);

        //read percentage

        System.out.println("Please input students percentage: ");
        int percentage = scanner.nextInt();

        char grade;

        if (percentage > 90) {
            grade = 'A';
        } else if (percentage > 65 ) {
            grade = 'B';
        } else {
            grade = 'D';
        }
        //print grade
        System.out.println("The students grade is: " + grade);
    }

    static void classWork() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the temperature in F: ");
        int temp = scanner.nextInt();


        if (temp >95 || temp < 20) {
            System.out.println("Visit our shops!");
        }

        String activity;
        if (temp >= 80) {
            activity = "swimming";
        }
        else if (temp >= 60) {
            activity = "tennis";
        }
        else if (temp >= 40) {
            activity = "golf";
        }
        else {
            activity = "skiing";
        }

        System.out.println("Your recommended activity for today is " + activity + ".");
    }
}




