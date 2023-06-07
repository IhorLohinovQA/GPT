package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid:");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            // print spaces
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // move to the next line
        }
    }
}