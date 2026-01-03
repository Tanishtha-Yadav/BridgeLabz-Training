package com.day1.hospitalmanagement;

class OutPatient extends Patient {
    String visitDate;

    OutPatient(String name, int id, String history, String visitDate) {
        super(name, id, history);
        this.visitDate = visitDate;
    }
}
