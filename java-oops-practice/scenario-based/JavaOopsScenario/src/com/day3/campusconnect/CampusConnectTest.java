package com.day3.campusconnect;

public class CampusConnectTest {

    public static void main(String[] args) {

        Faculty faculty = new Faculty(101, "Dr. Sharma", "sharma@college.edu", "Computer Science");

        Student s1 = new Student(1, "Aman", "aman@student.edu");
        Student s2 = new Student(2, "Neha", "neha@student.edu");

        s1.addGrade(85);
        s1.addGrade(90);
        s2.addGrade(78);
        s2.addGrade(88);

        Course javaCourse = new Course("Java Programming", faculty);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        System.out.println("--- Student Details ---");
        s1.printDetails();
        System.out.println();
        s2.printDetails();

        System.out.println("--- Faculty Details ---");
        faculty.printDetails();

        System.out.println("--- Course Details ---");
        javaCourse.showCourseDetails();
    }
}


