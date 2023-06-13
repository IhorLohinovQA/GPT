package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by a space:");
        String input = sc.nextLine();
        String[] array = input.split(" ");
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }
        int sum = 0;
        for (int value: numbers) {
            sum += value;
        }

        System.out.println(sum);
    }
}