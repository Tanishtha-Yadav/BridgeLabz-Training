package com.day10.musicapp;

//Class to represent a Song
public class Song {
 int trackID;      // Unique track ID
 String title;     // Song title
 String artist;    // Artist name

 public Song(int trackID, String title, String artist) {
     this.trackID = trackID;
     this.title = title;
     this.artist = artist;
 }

 @Override
 public String toString() {
     return "TrackID: " + trackID + ", Title: " + title + ", Artist: " + artist;
 }
}
