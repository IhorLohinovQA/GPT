package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations math = new MathOperations();
        System.out.println("Enter the first number:");
        math.firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        math.secondNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Select the operator (+, -, *, /):");
        math.operator = sc.nextLine();

        switch (math.operator) {
            case "+":
                System.out.println("Result: " + math.plus());
                break;
            case "-":
                System.out.println("Result: " + math.minus());
                break;
            case "*":
                System.out.println("Result: " + math.times());
                break;
            case "/":
                System.out.println("Result: " + math.divide());
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}