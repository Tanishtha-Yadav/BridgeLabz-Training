package com.day4.petpal;

class Cat extends Pet {

    Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeHunger(5);
    }

    @Override
    public void sleep() {
        changeEnergy(30);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

