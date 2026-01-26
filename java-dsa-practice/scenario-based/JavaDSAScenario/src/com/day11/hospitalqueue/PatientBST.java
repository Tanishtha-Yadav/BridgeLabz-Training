package com.day11.hospitalqueue;

//BST for managing patient records
public class PatientBST {
 private PatientNode root;

 // Insert patient based on check-in time
 public void insert(Patient patient) {
     root = insertRec(root, patient);
 }

 private PatientNode insertRec(PatientNode root, Patient patient) {
     if (root == null) return new PatientNode(patient);

     if (patient.checkInTime.compareTo(root.patient.checkInTime) < 0) {
         root.left = insertRec(root.left, patient);
     } else if (patient.checkInTime.compareTo(root.patient.checkInTime) > 0) {
         root.right = insertRec(root.right, patient);
     } else {
         System.out.println("Patient already registered at this time!");
     }

     return root;
 }

 // Delete patient by patientID
 public void delete(int patientID) {
     root = deleteRec(root, patientID);
 }

 private PatientNode deleteRec(PatientNode root, int patientID) {
     if (root == null) return null;

     if (patientID < root.patient.patientID) {
         root.left = deleteRec(root.left, patientID);
     } else if (patientID > root.patient.patientID) {
         root.right = deleteRec(root.right, patientID);
     } else {
         // Node with only one child or no child
         if (root.left == null) return root.right;
         if (root.right == null) return root.left;

         // Node with two children: find inorder successor
         PatientNode successor = minValueNode(root.right);
         root.patient = successor.patient;
         root.right = deleteRec(root.right, successor.patient.patientID);
     }

     return root;
 }

 private PatientNode minValueNode(PatientNode node) {
     PatientNode current = node;
     while (current.left != null)
         current = current.left;
     return current;
 }

 // Display all patients in order (by arrival)
 public void displayPatients() {
     System.out.println("--- Patients by Arrival Time ---");
     inorderRec(root);
     System.out.println("--------------------------------");
 }

 private void inorderRec(PatientNode root) {
     if (root != null) {
         inorderRec(root.left);
         System.out.println(root.patient);
         inorderRec(root.right);
     }
 }
}
