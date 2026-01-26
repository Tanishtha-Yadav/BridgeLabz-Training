package com.day11.hospitalqueue;

//Class to represent a Patient
public class Patient {
 int patientID;
 String name;
 String checkInTime; // format HH:mm

 public Patient(int patientID, String name, String checkInTime) {
     this.patientID = patientID;
     this.name = name;
     this.checkInTime = checkInTime;
 }

 @Override
 public String toString() {
     return "PatientID: " + patientID + ", Name: " + name + ", Check-In: " + checkInTime;
 }
}
