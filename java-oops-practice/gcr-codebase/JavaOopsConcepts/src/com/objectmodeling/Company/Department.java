package com.objectmodeling.Company;

import java.util.ArrayList;

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void showEmployees() {
        System.out.println(" Department: " + deptName);
        for (Employee e : employees) {
            System.out.println("  - " + e.getName());
        }
    }
}
