package org.example;

public class Dog extends Animal {
    protected String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    protected void animalVoice() {
        System.out.println("Bark");
    }
}
