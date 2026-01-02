package com.objectmodeling.Company;

public class Composition {
    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee("Ravi");
        dev.addEmployee("Anita");

        Department hr = new Department("HR");
        hr.addEmployee("Suman");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.showCompanyDetails();

        // When company is removed, all departments & employees vanish
        company = null;
        System.out.println("Company deleted");
    }
}
