package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("The Great Gatsby");
        book.setAuthor("F. Scott Fitzgerald");
        book.setYear(1925);

        book.displayInfo();


    }
}