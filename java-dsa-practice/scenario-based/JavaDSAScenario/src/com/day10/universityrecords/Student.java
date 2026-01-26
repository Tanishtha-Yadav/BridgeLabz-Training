package com.day10.universityrecords;

//Represents a student
public class Student {
 int rollNumber;
 String name;

 public Student(int rollNumber, String name) {
     this.rollNumber = rollNumber;
     this.name = name;
 }

 @Override
 public String toString() {
     return "Roll: " + rollNumber + ", Name: " + name;
 }
}

