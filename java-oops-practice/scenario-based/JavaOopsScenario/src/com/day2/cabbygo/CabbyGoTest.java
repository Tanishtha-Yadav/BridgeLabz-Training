package com.day2.cabbygo;

public class CabbyGoTest {
    public static void main(String[] args) {

       
        Driver d1 = new Driver("Rohit", "LIC1234", 4.8);
        Driver d2 = new Driver("Anita", "LIC5678", 4.6);

     
        Vehicle mini = new Mini("MH01AB1234", 4);
        Vehicle sedan = new Sedan("MH02CD5678", 4);
        Vehicle suv = new SUV("MH03EF9101", 6);

        mini.bookRide(12);   
        sedan.bookRide(20);  
        suv.bookRide(15);    


        mini.endRide();
        sedan.endRide();
        suv.endRide();
    }
}

