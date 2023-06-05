package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your mark:");
        int marks = sc.nextInt();
        System.out.println("Input your number of misses:");
        int misses = sc.nextInt();
        System.out.println("Input your number of delays:");
        int delays = sc.nextInt();
        int totalScore = 0;

        if (marks < 50) {
            totalScore += 0;
        } else if (marks <= 59) {
            totalScore += 1;
        } else if (marks <= 69) {
            totalScore += 2;
        } else if (marks <= 79) {
            totalScore += 3;
        } else if (marks <= 89) {
            totalScore += 4;
        } else {
            totalScore += 5;
        }

        if (misses > 3) {
            totalScore -= 1;
        }

        if (delays > 3) {
            totalScore -= 1;
        }

        if (totalScore < 0) {
            totalScore = 0;
        }

        System.out.println("The total score is: " + totalScore);

    }
}