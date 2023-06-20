package org.example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = new Book();

        System.out.println("Enter the title:");
        String title = sc.nextLine();
        book.setTitle(title);

        System.out.println("Enter the author:");
        String author = sc.nextLine();
        book.setAuthor(author);

        System.out.println("Enter the year:");
        int year = sc.nextInt();
        book.setYear(year);

        book.displayInfo();
    }
}