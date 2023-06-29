package org.example;

public class Cat extends Animal {
    protected String color;

    public Cat(String name,String color) {
        super(name);
        this.color = color;
    }

    @Override
    protected void animalVoice() {
        System.out.println("Meow");
    }
}
