package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3;
        int count;
        int guess;
        String answer;

        do {

            System.out.println("Select the difficulty level (1-Easy; 2-Medium; 3-Hard");
            int level = sc.nextInt();
            count = 1;

            switch (level) {

                case 1:
                    number1 = (int) ((Math.random()*10)) + 1;
                    System.out.println("Enter any number between 0 and 10:");
                    guess = sc.nextInt();
                    while (guess != number1) {
                        count += 1;
                        if (guess > number1) {
                            System.out.println("Enter a smaller number");
                            guess = sc.nextInt();
                        } else if (guess < number1) {
                            System.out.println("Enter a bigger number");
                            guess = sc.nextInt();
                        }
                    }
                    System.out.println("Congratulations! You've won!");
                    System.out.println("Your number of tries: " + count);
                    break;

                case 2:

                    number2 = (int) ((Math.random()*50)) + 1;
                    System.out.println("Enter any number between 0 and 50:");
                    guess = sc.nextInt();
                    while (guess != number2) {
                        count += 1;
                        if (guess > number2) {
                            System.out.println("Enter a smaller number");
                            guess = sc.nextInt();
                        } else if (guess < number2) {
                            System.out.println("Enter a bigger number");
                            guess = sc.nextInt();
                        }
                    }
                    System.out.println("Congratulations! You've won!");
                    System.out.println("Your number of tries: " + count);
                    break;


                case 3:

                    number3 = (int) ((Math.random()*100)) + 1;
                    System.out.println("Enter any number between 0 and 100:");
                    guess = sc.nextInt();
                    while (guess != number3) {
                        count += 1;
                        if (guess > number3) {
                            System.out.println("Enter a smaller number");
                            guess = sc.nextInt();
                        } else if (guess < number3) {
                            System.out.println("Enter a bigger number");
                            guess = sc.nextInt();
                        }
                    }
                    System.out.println("Congratulations! You've won!");
                    System.out.println("Your number of tries: " + count);
                    break;

                default:
                System.out.println("Invalid input!");
                break;
            }

            sc.nextLine();
            System.out.println("Do you wanna play again? (yes/no)");
            answer = sc.nextLine();

        } while (answer.equals("yes"));

    }
}