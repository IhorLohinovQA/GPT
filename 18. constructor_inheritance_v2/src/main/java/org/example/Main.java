package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", "Sheepdog");
        Cat cat1 = new Cat("Murzik", "black");
        Animal a1 = new Dog("test", "test");

        System.out.println(dog1.name + " " + dog1.breed);
        dog1.animalVoice();

        System.out.println(cat1.name + " " + cat1.color);
        cat1.animalVoice();

        System.out.println(a1.name);
        a1.animalVoice();
    }
}