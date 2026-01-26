package com.day10.universityrecords;

//BST implementation for managing Student records
public class StudentBST {
 private BSTNode root;

 // Insert a student
 public void insert(Student student) {
     root = insertRec(root, student);
 }

 private BSTNode insertRec(BSTNode root, Student student) {
     if (root == null) return new BSTNode(student);

     if (student.rollNumber < root.student.rollNumber)
         root.left = insertRec(root.left, student);
     else if (student.rollNumber > root.student.rollNumber)
         root.right = insertRec(root.right, student);
     else
         System.out.println("Roll number already exists!");

     return root;
 }

 // Delete a student
 public void delete(int rollNumber) {
     root = deleteRec(root, rollNumber);
 }

 private BSTNode deleteRec(BSTNode root, int rollNumber) {
     if (root == null) return null;

     if (rollNumber < root.student.rollNumber)
         root.left = deleteRec(root.left, rollNumber);
     else if (rollNumber > root.student.rollNumber)
         root.right = deleteRec(root.right, rollNumber);
     else {
         if (root.left == null) return root.right;
         else if (root.right == null) return root.left;

         BSTNode successor = minValueNode(root.right);
         root.student = successor.student;
         root.right = deleteRec(root.right, successor.student.rollNumber);
     }
     return root;
 }

 private BSTNode minValueNode(BSTNode node) {
     BSTNode current = node;
     while (current.left != null)
         current = current.left;
     return current;
 }

 // Search student by roll number
 public Student search(int rollNumber) {
     BSTNode result = searchRec(root, rollNumber);
     return (result != null) ? result.student : null;
 }

 private BSTNode searchRec(BSTNode root, int rollNumber) {
     if (root == null || root.student.rollNumber == rollNumber)
         return root;

     if (rollNumber < root.student.rollNumber)
         return searchRec(root.left, rollNumber);
     else
         return searchRec(root.right, rollNumber);
 }

 // Display all students in sorted order
 public void displayInOrder() {
     System.out.println("--- Student Records (Sorted by Roll Number) ---");
     inorderRec(root);
     System.out.println("-----------------------------------------------");
 }

 private void inorderRec(BSTNode root) {
     if (root != null) {
         inorderRec(root.left);
         System.out.println(root.student);
         inorderRec(root.right);
     }
 }
}

