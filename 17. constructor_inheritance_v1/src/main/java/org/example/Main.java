package org.example;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Circle c1 = new Circle(50);

        System.out.println(r1.calculatePerimeter());
        System.out.println(r1.calculateArea());
        System.out.println(c1.calculatePerimeter());
        System.out.println(c1.calculateArea());
    }
}