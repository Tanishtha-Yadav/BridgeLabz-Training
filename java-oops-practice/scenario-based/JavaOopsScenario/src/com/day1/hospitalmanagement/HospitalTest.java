package com.day1.hospitalmanagement;

public class HospitalTest {
    public static void main(String[] args) {

        Patient p1 = new InPatient("Ravi", 101, "Diabetes", 5);
        Doctor d1 = new Doctor("Dr. Mehta", "Cardiology");
        Bill bill = new Bill(20000);

        System.out.println(p1.getSummary());
        d1.displayInfo();
        System.out.println("Total Bill: ₹" + bill.calculatePayment());
    }
}
