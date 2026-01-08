package com.day6.medistore;

public class MediStoreApp {
    public static void main(String[] args) {

        Medicine[] meds = {
            new Tablet("Paracetamol", 2.5, "2027-05-01"),
            new Syrup("Cough Syrup", 85, "2025-02-01"),
            new Injection("Insulin", 450, "2026-08-10")
        };

        for (Medicine m : meds) {
            double bill = m.sell(5);
            System.out.println(m.name + " Bill: ₹" + bill);
        }
    }
}

