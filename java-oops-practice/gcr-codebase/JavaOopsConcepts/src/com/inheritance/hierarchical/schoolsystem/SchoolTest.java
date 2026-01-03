package com.inheritance.hierarchical.schoolsystem;

public class SchoolTest {
    public static void main(String[] args) {

        Person p1 = new Teacher("Anita", 35, "Maths");
        Person p2 = new Student("Ravi", 16, "10th Grade");
        Person p3 = new Staff("Suresh", 45, "Administration");

        p1.displayRole();
 

        p2.displayRole();
    
        p3.displayRole();
    }
}
