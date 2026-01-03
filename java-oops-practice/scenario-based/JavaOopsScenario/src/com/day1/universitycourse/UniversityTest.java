package com.day1.universitycourse;

public class UniversityTest {
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Anita");
        Course c1 = new Course("CS101", 4);
        Faculty f1 = new Faculty("Dr. Sharma");

        Enrollment e1 = new Enrollment(s1, c1);
        f1.gradeStudent(e1, "A");

        System.out.println(s1.getTranscript());
    }
}
