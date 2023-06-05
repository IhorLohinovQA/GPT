package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number (-1 to stop)");
        double inputNumber = sc.nextDouble();

        if (inputNumber != -1) {
            int count = 1;
            double sum = inputNumber;
            double average = inputNumber / count;
            System.out.println("Sum = " + sum);
            System.out.println("Number of cycles = " + count);
            System.out.println("Average = " + average);
            while (inputNumber != -1) {
                System.out.println("Enter any number (-1 to stop)");
                inputNumber = sc.nextDouble();
                count += 1;
                if (inputNumber != -1) {
                    sum += inputNumber;
                }
                average = sum / count;
                System.out.println("Sum = " + sum);
                System.out.println("Number of cycles = " + count);
                System.out.println("Average = " + average);
            }
        } else {
            System.out.println("Invalid number! The program is stopped");
        }
        }
    }