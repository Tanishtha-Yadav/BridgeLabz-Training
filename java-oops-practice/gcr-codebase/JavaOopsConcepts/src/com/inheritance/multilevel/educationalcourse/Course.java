package com.inheritance.multilevel.educationalcourse;

public class Course {
	
	String courseName;
	int duration;
	
	 Course(String courseName, int duration) {
	        this.courseName = courseName;
	        this.duration = duration;
	    }

	    void displayDetails() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + duration + " hours");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
