package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        String answer;

        do {
            System.out.println("Player1 enter a number (1 - rock; 2 - paper; 3 - scissors):");
            int playerValue = sc.nextInt();
            System.out.println("Player2 enter a number (1 - rock; 2 - paper; 3 - scissors):");
            int enemyValue = sc.nextInt();
            if (playerValue == 1 && enemyValue == 2) {
                System.out.println("Player2 won");
            } else if (playerValue == 2 && enemyValue == 1) {
                System.out.println("Player1 won");
            } else if (playerValue == 1 && enemyValue == 3) {
                System.out.println("Player1 won");
            } else if (playerValue == 3 && enemyValue == 1) {
                System.out.println("Player2 won");
            } else if (playerValue == 2 && enemyValue == 3) {
                System.out.println("Player2 won");
            } else if (playerValue == 3 && enemyValue == 2) {
                System.out.println("Player1 won");
            } else if ((playerValue == 1 && enemyValue == 1) || (playerValue == 2 && enemyValue == 2) || (playerValue == 3 && enemyValue == 3)) {
                System.out.println("Draw");
            } else {
                System.out.println("Invalid input");
            }
            sc.nextLine();
            System.out.println("Do you wanna play again? (yes/no)");
            answer = sc.nextLine();

        } while (answer.equals("yes"));
    }
}