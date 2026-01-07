package com.day4.eventease;

public class EventEaseApp {
    public static void main(String[] args) {

        User user = new User("Tanishtha", "tanishtha@gmail.com");

        Event event1 = new BirthdayEvent("Indore", "15-Feb-2026", 80, user);
        Event event2 = new ConferenceEvent("Bhopal", "10-Mar-2026", 300, user);

        event1.schedule();
        event1.showEventDetails();

        System.out.println();

        event2.schedule();
        event2.reschedule("12-Mar-2026");
        event2.showEventDetails();
    }
}

