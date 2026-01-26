package com.day11.ticketbooking;

//Class to represent an Event
public class Event {
 String eventName;
 String eventTime; // format HH:mm
 int eventID;

 public Event(int eventID, String eventName, String eventTime) {
     this.eventID = eventID;
     this.eventName = eventName;
     this.eventTime = eventTime;
 }

 @Override
 public String toString() {
     return "EventID: " + eventID + ", Name: " + eventName + ", Time: " + eventTime;
 }
}

