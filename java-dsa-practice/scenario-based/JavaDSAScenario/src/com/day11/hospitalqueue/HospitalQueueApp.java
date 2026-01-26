package com.day11.hospitalqueue;

import java.util.Scanner;

//Main class for Hospital Queue Management
public class HospitalQueueApp {

 public static void main(String[] args) {
     PatientBST bst = new PatientBST();
     Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n1. Register Patient");
         System.out.println("2. Discharge Patient");
         System.out.println("3. Display Patients by Arrival");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();
         sc.nextLine(); // consume newline

         switch (choice) {
             case 1:
                 System.out.print("Enter Patient ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Patient Name: ");
                 String name = sc.nextLine();
                 System.out.print("Enter Check-In Time (HH:mm): ");
                 String time = sc.nextLine();
                 bst.insert(new Patient(id, name, time));
                 break;

             case 2:
                 System.out.print("Enter Patient ID to discharge: ");
                 int removeID = sc.nextInt();
                 bst.delete(removeID);
                 break;

             case 3:
                 bst.displayPatients();
                 break;

             case 0:
                 System.out.println("Exiting...");
                 break;

             default:
                 System.out.println("Invalid choice!");
         }

     } while (choice != 0);

     sc.close();
 }
}
