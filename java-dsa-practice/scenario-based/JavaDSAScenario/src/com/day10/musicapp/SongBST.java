package com.day10.musicapp;

//BST for managing Song library
public class SongBST {
 private SongNode root;

 // Insert a song
 public void insert(Song song) {
     root = insertRec(root, song);
 }

 private SongNode insertRec(SongNode root, Song song) {
     if (root == null) return new SongNode(song);

     if (song.trackID < root.song.trackID)
         root.left = insertRec(root.left, song);
     else if (song.trackID > root.song.trackID)
         root.right = insertRec(root.right, song);
     else
         System.out.println("Track ID already exists!");

     return root;
 }

 // Search song by trackID
 public Song search(int trackID) {
     SongNode node = searchRec(root, trackID);
     return (node != null) ? node.song : null;
 }

 private SongNode searchRec(SongNode root, int trackID) {
     if (root == null || root.song.trackID == trackID) return root;

     if (trackID < root.song.trackID)
         return searchRec(root.left, trackID);
     else
         return searchRec(root.right, trackID);
 }

 // Display songs alphabetically by title (in-order traversal)
 public void displayAlphabetically() {
     System.out.println("--- Songs in Library (Alphabetical by Title) ---");
     inorderRec(root);
     System.out.println("-----------------------------------------------");
 }

 private void inorderRec(SongNode root) {
     if (root != null) {
         inorderRec(root.left);
         System.out.println(root.song);
         inorderRec(root.right);
     }
 }
}

