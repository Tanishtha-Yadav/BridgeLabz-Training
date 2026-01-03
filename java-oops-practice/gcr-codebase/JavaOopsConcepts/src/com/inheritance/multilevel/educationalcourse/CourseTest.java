package com.inheritance.multilevel.educationalcourse;

public class CourseTest {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("Java OOP", 40,"Coursera", true,5000, 20);

        c.displayDetails();
    }
}
