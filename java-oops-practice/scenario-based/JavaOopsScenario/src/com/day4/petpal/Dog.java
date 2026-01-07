package com.day4.petpal;

class Dog extends Pet {

    Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        changeHunger(-20);
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeHunger(10);
    }

    @Override
    public void sleep() {
        changeEnergy(25);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
