package com.day11.gamingapp;

//Class to represent a Player
public class Player {
 String username;
 int points;

 public Player(String username, int points) {
     this.username = username;
     this.points = points;
 }

 @Override
 public String toString() {
     return "Username: " + username + ", Points: " + points;
 }
}
