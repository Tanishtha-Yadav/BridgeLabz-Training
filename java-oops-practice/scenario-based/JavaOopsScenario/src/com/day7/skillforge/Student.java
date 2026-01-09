package com.day7.skillforge;

public class Student extends User {

    private double progress; // encapsulated

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    public void updateProgress(double completedModules, double totalModules) {
        progress = (completedModules / totalModules) * 100; // operator usage
    }

    public double getProgress() {
        return progress;
    }
}
 