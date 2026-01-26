package com.day10.musicapp;

import java.util.Scanner;

//Main class for Music App
public class MusicLibrary {

 public static void main(String[] args) {
     SongBST library = new SongBST();
     Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n1. Add Song");
         System.out.println("2. Search Song by Track ID");
         System.out.println("3. Display Songs Alphabetically");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();
         sc.nextLine(); // consume newline

         switch (choice) {
             case 1:
                 System.out.print("Enter Track ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Song Title: ");
                 String title = sc.nextLine();
                 System.out.print("Enter Artist Name: ");
                 String artist = sc.nextLine();
                 library.insert(new Song(id, title, artist));
                 break;

             case 2:
                 System.out.print("Enter Track ID to search: ");
                 int searchID = sc.nextInt();
                 Song s = library.search(searchID);
                 if (s != null) System.out.println("Found: " + s);
                 else System.out.println("Song not found.");
                 break;

             case 3:
                 library.displayAlphabetically();
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

