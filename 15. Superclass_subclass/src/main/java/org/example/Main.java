package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.setName("Porsche");
        car.setNumberOfDoors(2);

        motorcycle.setName("Yamaha");
        motorcycle.setHasSideCar(false);

        System.out.println("Car: " + car.getName() + " with " + car.getNumberOfDoors() + " numbers of doors");
        System.out.println();
        System.out.println("Motorcycle: " + motorcycle.getName());
        System.out.println("This motorcycle has a sidecar: " + motorcycle.getSideCar());
    }
}