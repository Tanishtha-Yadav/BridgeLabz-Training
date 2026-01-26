package com.day10.universityrecords;

import java.util.Scanner;

//Main class for demonstration
public class UniversityRecords {

 public static void main(String[] args) {
     StudentBST bst = new StudentBST();
     Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n1. Insert Student");
         System.out.println("2. Delete Student");
         System.out.println("3. Search Student");
         System.out.println("4. Display All Students");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter roll number: ");
                 int roll = sc.nextInt();
                 sc.nextLine(); // consume newline
                 System.out.print("Enter name: ");
                 String name = sc.nextLine();
                 bst.insert(new Student(roll, name));
                 break;
             case 2:
                 System.out.print("Enter roll number to delete: ");
                 int delRoll = sc.nextInt();
                 bst.delete(delRoll);
                 break;
             case 3:
                 System.out.print("Enter roll number to search: ");
                 int searchRoll = sc.nextInt();
                 Student s = bst.search(searchRoll);
                 if (s != null) System.out.println("Found: " + s);
                 else System.out.println("Student not found.");
                 break;
             case 4:
                 bst.displayInOrder();
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
