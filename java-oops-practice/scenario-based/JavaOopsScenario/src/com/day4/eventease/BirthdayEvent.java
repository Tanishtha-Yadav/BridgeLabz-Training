package com.day4.eventease;

class BirthdayEvent extends Event {

    BirthdayEvent(String location, String date, int attendees, User organizer) {
        super("Birthday Party", location, date, attendees, organizer, 15000, 5000, 2000);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with cake & decoration package.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled. Partial refund applicable.");
    }
}
