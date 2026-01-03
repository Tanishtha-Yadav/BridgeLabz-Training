package com.day1.hospitalmanagement;

class Patient {
    private String name;
    private int id;
    private String medicalHistory;

    Patient(String name, int id, String medicalHistory) {
        this.name = name;
        this.id = id;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient: " + name + ", ID: " + id;
    }
}
