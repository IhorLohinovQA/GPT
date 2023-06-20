package org.example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Enter your name:");
        person.name = sc.nextLine();
        System.out.println("Enter your age:");
        person.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your gender:");
        person.gender = sc.nextLine();

        person.introduce();
        System.out.println("I will be " + person.myNextAge() + " next year");

    }
}
