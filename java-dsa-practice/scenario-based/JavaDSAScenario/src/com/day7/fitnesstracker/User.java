package com.day7.fitnesstracker;

class User {
    String name;
    int steps;

    User(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }

    public String toString() {
        return name + " -> " + steps;
    }
}
