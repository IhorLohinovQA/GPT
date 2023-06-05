package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (0 to stop):");

        if (sc.hasNextInt()) {
            int inputNumber = sc.nextInt();
            int sum = inputNumber;
            System.out.println("Output: " + sum);
            while (inputNumber != 0) {
                System.out.println("Enter a number (0 to stop):");
                inputNumber = sc.nextInt();
                sum += inputNumber;
                System.out.println("Output: " + sum);
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}