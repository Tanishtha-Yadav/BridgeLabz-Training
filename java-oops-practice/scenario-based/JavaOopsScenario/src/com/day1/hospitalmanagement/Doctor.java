package com.day1.hospitalmanagement;

class Doctor {
    String name;
    String specialization;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void displayInfo() {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization);
    }
}
