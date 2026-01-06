package com.day4.edumentor;

public class Learner extends User implements ICertifiable {

    private String courseType; // short or full-time

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Short Course Certificate generated for " + name);
        } else {
            System.out.println("Full-Time Course Certificate generated for " + name);
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Learner: " + name + " | Course: " + courseType);
    }
}
