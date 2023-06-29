package org.example;

public class Circle extends Shape {
    protected double radius;
    static final double Pi = 3.14;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    @Override
    protected double calculateArea() {
        return Pi * (radius * radius);
    }
    protected double calculatePerimeter() {
        return 2 * Pi * radius;
    }

}
