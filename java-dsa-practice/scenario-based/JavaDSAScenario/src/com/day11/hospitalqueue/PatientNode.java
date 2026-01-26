package com.day11.hospitalqueue;

//Node for BST
public class PatientNode {
 Patient patient;
 PatientNode left, right;

 public PatientNode(Patient patient) {
     this.patient = patient;
     this.left = this.right = null;
 }
}
