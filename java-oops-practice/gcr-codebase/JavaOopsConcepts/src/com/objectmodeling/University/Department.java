package com.objectmodeling.University;


public class Department {
    private String deptName;

    // Created only by University
    Department(String deptName) {
        this.deptName = deptName;
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}