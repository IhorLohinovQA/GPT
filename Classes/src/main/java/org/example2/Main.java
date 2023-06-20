package org.example2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.name = "Anton";
        person1.age = 22;
        person1.gender = "Male";

        person2.name = "Anna";
        person2.age = 34;
        person2.gender = "Female";

        person3.name = "Larisa";
        person3.age = 14;
        person3.gender = "Female";

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
