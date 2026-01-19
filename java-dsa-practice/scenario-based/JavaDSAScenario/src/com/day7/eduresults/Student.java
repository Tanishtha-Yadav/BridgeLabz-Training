package com.day7.eduresults;

class Student {
    int roll;
    int marks;

    Student(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public String toString() {
        return "Roll: " + roll + " Marks: " + marks;
    }
}
