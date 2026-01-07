package com.day4.eventease;

interface ISchedulable 
{
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
