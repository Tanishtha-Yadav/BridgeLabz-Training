package com.constructors.level1;

public class EmployeeRecords {

    public int employeeID;        
    protected String department;  
    private double salary;       

    public EmployeeRecords(int employeeID, String department, double salary) 
    {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        if (salary > 0) 
        {
            this.salary = salary;
        }
    }

    public static void main(String[] args)
    {

        Manager m1 = new Manager(101, "IT", 80000, "Team Lead");

        m1.displayDetails();

        m1.setSalary(90000);
        System.out.println("Updated Salary: " + m1.getSalary());
    }
}

class Manager extends EmployeeRecords 
{
    private String designation;

    public Manager(int employeeID, String department, double salary, String designation) 
    {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);       
        System.out.println("Department: " + department);      
        System.out.println("Salary: " + getSalary());     
        System.out.println("Designation: " + designation);
        System.out.println();
    }
}
