package com.day11.ticketbooking;

//Node for BST
public class EventNode {
 Event event;
 EventNode left, right;

 public EventNode(Event event) {
     this.event = event;
     this.left = this.right = null;
 }
}
