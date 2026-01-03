package com.day1.hospitalmanagement;

class InPatient extends Patient {
    int daysAdmitted;

    InPatient(String name, int id, String history, int daysAdmitted) {
        super(name, id, history);
        this.daysAdmitted = daysAdmitted;
    }
}

