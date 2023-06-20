package org.example2;

public class Book {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    public void setTitle(String Scanner) {
        title = Scanner;
    }
    public void setAuthor(String Scanner) {
        author = Scanner;
    }
    public void setYear(int Scanner) {
        year = Scanner;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}
