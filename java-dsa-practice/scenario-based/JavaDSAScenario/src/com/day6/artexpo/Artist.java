package com.day6.artexpo;

class Artist {
    String name;
    int regTime;   // registration time (minutes since opening)

    Artist(String name, int regTime) {
        this.name = name;
        this.regTime = regTime;
    }

    public String toString() {
        return name + " -> " + regTime;
    }
}
