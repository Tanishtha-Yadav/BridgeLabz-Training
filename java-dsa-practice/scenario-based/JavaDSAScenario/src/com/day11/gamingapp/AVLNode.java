package com.day11.gamingapp;

//Node for AVL Tree
public class AVLNode {
 Player player;
 AVLNode left, right;
 int height;

 public AVLNode(Player player) {
     this.player = player;
     this.left = this.right = null;
     this.height = 1; // initial height
 }
}
