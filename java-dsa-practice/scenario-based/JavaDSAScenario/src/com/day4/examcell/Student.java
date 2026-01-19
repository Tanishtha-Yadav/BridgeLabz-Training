package com.day4.examcell;

class Student {
    int roll;
    int score;

    Student(int roll, int score) {
        this.roll = roll;
        this.score = score;
    }

    public String toString() {
        return "Roll: " + roll + " Score: " + score;
    }
}

