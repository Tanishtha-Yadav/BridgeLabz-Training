package com.day3.campusconnect;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Integer> grades;
    private ArrayList<Course> courses;

    public Student(int id, String name, String email) {
        super(id, name, email);
        grades = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    // GPA calculation using operators
    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.size() == 0 ? 0 : (double) sum / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    // Polymorphism
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("GPA: " + calculateGPA());
    }
}
