package org.example3;

public class Person {
    String name;
    int age;
    String gender;

    public void introduce() {
        System.out.println("Hi, my name is " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("My gender is " + gender);
    }

    public int myNextAge() {
        age += 1;
        return age;
    }
}
