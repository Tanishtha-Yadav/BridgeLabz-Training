package com.day11.ticketbooking;

import java.util.Scanner;

//Main class for Ticket Booking System
public class TicketBookingApp {

 public static void main(String[] args) {
     EventBST bst = new EventBST();
     Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n1. Add Event");
         System.out.println("2. Cancel Event");
         System.out.println("3. Show Upcoming Events");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();
         sc.nextLine(); // consume newline

         switch (choice) {
             case 1:
                 System.out.print("Enter Event ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Event Name: ");
                 String name = sc.nextLine();
                 System.out.print("Enter Event Time (HH:mm): ");
                 String time = sc.nextLine();
                 bst.insert(new Event(id, name, time));
                 break;

             case 2:
                 System.out.print("Enter Event ID to cancel: ");
                 int cancelID = sc.nextInt();
                 bst.delete(cancelID);
                 break;

             case 3:
                 bst.displayEvents();
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
