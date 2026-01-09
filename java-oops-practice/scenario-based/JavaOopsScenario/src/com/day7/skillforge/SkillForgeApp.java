package com.day7.skillforge;

public class SkillForgeApp {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Dr. Smith", "smith@skillforge.com");
        Student student = new Student("Alice", "alice@gmail.com");

        String[] modules = {
                "Java Basics",
                "OOP",
                "Collections",
                "Streams",
                "Spring Boot",
                "Project"
        };

        Course course = new Course("Java Mastery", instructor, modules);

        student.updateProgress(5, modules.length);

        System.out.println("Student Progress: " + student.getProgress() + "%");
        System.out.println(course.generateCertificate());
    }
}
