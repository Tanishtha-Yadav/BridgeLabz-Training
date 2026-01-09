package com.day7.skillforge;

public class Course implements ICertifiable {

    private String title;
    private Instructor instructor;
    private String[] modules;

    private double rating;            // encapsulated
    private final String[] reviews;   // read-only internal reviews

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Final Project"};
        this.reviews = new String[]{"Excellent", "Well structured"};
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Good content"};
    }

    // Encapsulated rating logic
    protected void calculateRating(int stars, int totalReviews) {
        rating = (double) stars / totalReviews;
    }

    public double getRating() {
        return rating;
    }

    // Read-only access
    public String[] getReviews() {
        return reviews.clone();
    }

    // Polymorphism-ready
    @Override
    public String generateCertificate() {
        if (modules.length > 5) {
            return "Advanced Course Certificate for " + title;
        }
        return "Beginner Course Certificate for " + title;
    }
}
