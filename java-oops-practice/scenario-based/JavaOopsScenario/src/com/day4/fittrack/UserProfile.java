package com.day4.fittrack;

class UserProfile {
    private String name;
    private int age;
    private double weight;     // protected health data
    private int dailyTarget;   // calorie goal

    // Default goal constructor
    UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);
    }

    // Custom goal constructor
    UserProfile(String name, int age, double weight, int dailyTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyTarget = dailyTarget;
    }

    // Encapsulation
    public double getWeight() {
        return weight;
    }

    public int getDailyTarget() {
        return dailyTarget;
    }

    public void showProfile() {
        System.out.println("User: " + name + ", Age: " + age + ", Target: " + dailyTarget);
    }
}
