package com.day6.icecreamrush;

class Flavour {
    String name;
    int soldCount;

    Flavour(String name, int soldCount) {
        this.name = name;
        this.soldCount = soldCount;
    }

    public String toString() {
        return name + " -> " + soldCount;
    }
}
