package com.day11.gamingapp;

import java.util.Scanner;

//Main class for Gaming App Leaderboard
public class GamingAppLeaderboard {

 public static void main(String[] args) {
     LeaderboardAVL leaderboard = new LeaderboardAVL();
     Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n1. Add/Update Player");
         System.out.println("2. Remove Player");
         System.out.println("3. Display Top 10 Players");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();
         sc.nextLine(); // consume newline

         switch (choice) {
             case 1:
                 System.out.print("Enter username: ");
                 String username = sc.nextLine();
                 System.out.print("Enter points: ");
                 int points = sc.nextInt();
                 leaderboard.insertOrUpdate(new Player(username, points));
                 break;

             case 2:
                 System.out.print("Enter username to remove: ");
                 String removeUser = sc.nextLine();
                 leaderboard.remove(removeUser);
                 break;

             case 3:
                 leaderboard.displayTopPlayers(10);
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
