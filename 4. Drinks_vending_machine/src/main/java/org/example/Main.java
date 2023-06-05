package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 and 5:");

        if (sc.hasNextInt()) {
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Cola is ready");
                    break;
                case 2:
                    System.out.println("Pepsi is ready");
                    break;
                case 3:
                    System.out.println("Sprite is ready");
                    break;
                case 4:
                    System.out.println("Fanta is ready");
                    break;
                case 5:
                    System.out.println("Water is ready");
                    break;
                default:
                    System.out.println("There is no such drink");
                    break;
            }
        } else {
            System.out.println("Invalid input! Please, enter a number between 1 and 5.");
        }
    }
}