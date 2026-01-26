package com.day10.universityrecords;

//Node of the BST
public class BSTNode {
 Student student;
 BSTNode left, right;

 public BSTNode(Student student) {
     this.student = student;
     this.left = this.right = null;
 }
}
