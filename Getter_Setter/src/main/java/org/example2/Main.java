package org.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Enter the title:");
        book.setTitle(sc.nextLine());
        System.out.println("Enter the author:");
        book.setAuthor(sc.nextLine());
        System.out.println("Enter the year:");
        book.setYear(sc.nextInt());

        book.displayInfo();

    }
}