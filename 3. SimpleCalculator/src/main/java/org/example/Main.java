package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /)");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Result: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("You can't divide by zero");
                } else {
                    System.out.println("Result: " + (number1 / number2));
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}