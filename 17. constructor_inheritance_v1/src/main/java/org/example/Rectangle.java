package org.example;

public class Rectangle extends Shape {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    protected double calculateArea() {
        return length * width;
    }
    protected double calculatePerimeter() {
        return (length+width) * 2;
    }
}
