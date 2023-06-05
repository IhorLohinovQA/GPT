package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random()*100);
        System.out.println("Enter any random number [0; 100]:");
        int guess = sc.nextInt();
        int count = 1;

        while (guess != number) {
            if (guess > number) {
                System.out.println("Enter a smaller number");
            } else if (guess < number) {
                System.out.println("Enter a bigger number");
            }
            guess = sc.nextInt();
            count += 1;
        }

        System.out.println("Congratulations! You've guessed the number");
        System.out.println("Your number of tries: " + count);
    }
}