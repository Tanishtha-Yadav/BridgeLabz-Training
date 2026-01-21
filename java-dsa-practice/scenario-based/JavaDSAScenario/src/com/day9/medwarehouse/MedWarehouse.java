package com.day9.medwarehouse;

import java.util.ArrayList;
import java.util.List;

public class MedWarehouse {
    public static void main(String[] args) {
        List<Medicine> medicines = new ArrayList<>();
        medicines.add(new Medicine("Paracetamol", "2026-02-10"));
        medicines.add(new Medicine("Ibuprofen", "2026-01-25"));
        medicines.add(new Medicine("Amoxicillin", "2026-01-20"));
        medicines.add(new Medicine("Cough Syrup", "2026-03-15"));

        // Sort medicines by expiry using MergeSorter
        List<Medicine> sortedMedicines = MergeSorter.mergeSort(medicines);

        System.out.println("Medicines sorted by expiry:");
        for (Medicine m : sortedMedicines) {
            System.out.println(m);
        }
    }
}
