package com.encapsulation.hospitalmanagement;

import java.util.ArrayList;

abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis; 
    protected ArrayList<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : medicalHistory) {
            System.out.println("- " + r);
        }
    }
}
