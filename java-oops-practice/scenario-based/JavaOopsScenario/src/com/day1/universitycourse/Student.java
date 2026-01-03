package com.day1.universitycourse;

class Student {
    protected int id;
    protected String name;
    private double gpa;
    private int totalCredits;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected void updateGPA(double gradePoint, int credits) {
        gpa = ((gpa * totalCredits) + (gradePoint * credits)) 
              / (totalCredits + credits);
        totalCredits += credits;
    }

    public String getTranscript() {
        return "Student: " + name + ", GPA: " + gpa;
    }
}

