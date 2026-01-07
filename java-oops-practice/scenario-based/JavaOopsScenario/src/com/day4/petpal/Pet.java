package com.day4.petpal;

abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = energetic
    private String mood;

    // Constructor with random defaults
    Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = (int)(Math.random() * 40 + 30);
        this.energy = (int)(Math.random() * 40 + 30);
        updateMood();
    }

    // User-specified constructor
    Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    // Encapsulated logic
    private void updateMood() {
        if (hunger < 30 && energy > 60)
            mood = "Happy";
        else if (hunger > 70)
            mood = "Hungry";
        else
            mood = "Normal";
    }

    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
        updateMood();
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
        updateMood();
    }

    public void showStatus() {
        System.out.println(name + " (" + type + ") | Hunger: " + hunger +
                           " | Energy: " + energy + " | Mood: " + mood);
    }

    abstract void makeSound();
}
