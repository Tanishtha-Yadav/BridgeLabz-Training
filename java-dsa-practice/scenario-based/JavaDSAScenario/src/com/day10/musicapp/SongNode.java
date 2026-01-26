package com.day10.musicapp;

//Node for BST
public class SongNode {
 Song song;
 SongNode left, right;

 public SongNode(Song song) {
     this.song = song;
     this.left = this.right = null;
 }
}
