package com.encapsulation.employeemanagement;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Ravi", 50000);
        Employee e2 = new PartTimeEmployee(102, "Neha", 80, 300);

        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
