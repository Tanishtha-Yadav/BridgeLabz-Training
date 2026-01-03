package com.encapsulation.hospitalmanagement;

public class HospitalTest {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Ravi", 45, 5, 2000);
        Patient p2 = new OutPatient(102, "Anita", 30, 800);

        p1.addRecord("Diabetes");
        p1.addRecord("BP Monitoring");

        p2.addRecord("Fever Consultation");

        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill Amount: ₹" + p.calculateBill());
            p.viewRecords();
            System.out.println("--------------------");
        }
    }
}
