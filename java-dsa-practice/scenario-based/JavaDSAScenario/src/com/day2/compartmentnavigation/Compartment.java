package com.day2.compartmentnavigation;

class Compartment {
    String name;
    Compartment prev;
    Compartment next;

    Compartment(String name) {
        this.name = name;
    }
}
