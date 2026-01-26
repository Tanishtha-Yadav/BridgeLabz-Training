package com.day11.ticketbooking;

//BST for managing events
public class EventBST {
 private EventNode root;

 // Insert event based on time
 public void insert(Event event) {
     root = insertRec(root, event);
 }

 private EventNode insertRec(EventNode root, Event event) {
     if (root == null) return new EventNode(event);

     if (event.eventTime.compareTo(root.event.eventTime) < 0) {
         root.left = insertRec(root.left, event);
     } else if (event.eventTime.compareTo(root.event.eventTime) > 0) {
         root.right = insertRec(root.right, event);
     } else {
         System.out.println("Event at this time already exists!");
     }

     return root;
 }

 // Delete event by eventID
 public void delete(int eventID) {
     root = deleteRec(root, eventID);
 }

 private EventNode deleteRec(EventNode root, int eventID) {
     if (root == null) return null;

     if (eventID < root.event.eventID) {
         root.left = deleteRec(root.left, eventID);
     } else if (eventID > root.event.eventID) {
         root.right = deleteRec(root.right, eventID);
     } else {
         // Node with only one child or no child
         if (root.left == null) return root.right;
         if (root.right == null) return root.left;

         // Node with two children: find inorder successor
         EventNode successor = minValueNode(root.right);
         root.event = successor.event;
         root.right = deleteRec(root.right, successor.event.eventID);
     }
     return root;
 }

 private EventNode minValueNode(EventNode node) {
     EventNode current = node;
     while (current.left != null)
         current = current.left;
     return current;
 }

 // Display all events in order
 public void displayEvents() {
     System.out.println("--- Upcoming Events ---");
     inorderRec(root);
     System.out.println("----------------------");
 }

 private void inorderRec(EventNode root) {
     if (root != null) {
         inorderRec(root.left);
         System.out.println(root.event);
         inorderRec(root.right);
     }
 }
}

