package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ihor", 26, "Male");
        Person person2 = new Person("Helen", 26, "Female");
        Person person3 = new Person("Kira", 14, "Female");

        person1.introduce();
        System.out.println("I will be " + person1.myNextAge() + " next year");
        System.out.println();

        person2.introduce();
        System.out.println("I will be " + person2.myNextAge() + " next year");
        System.out.println();

        person3.introduce();
        System.out.println("I will be " + person3.myNextAge() + " next year");
        System.out.println();

    }
}