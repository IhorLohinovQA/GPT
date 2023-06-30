package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Sheepdog();
        Cat cat1 = new Cat();
        Sheepdog sh1 = new Sheepdog();
        Animal animal4 = new Sheepdog();

        System.out.println(animal1 instanceof Animal);
        System.out.println(animal1 instanceof Object);
        System.out.println(animal1 instanceof Dog);
        System.out.println(dog1 instanceof Animal);
        System.out.println(dog1 instanceof Object);
        System.out.println(dog1 instanceof Dog);
        System.out.println(dog1 instanceof Sheepdog);
        System.out.println(sh1 instanceof Object);

    }
}