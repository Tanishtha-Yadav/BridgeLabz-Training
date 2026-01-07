package com.day4.petpal;

class Bird extends Pet {

    Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
    }

    @Override
    public void play() {
        changeEnergy(-5);
        changeHunger(5);
    }

    @Override
    public void sleep() {
        changeEnergy(20);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

