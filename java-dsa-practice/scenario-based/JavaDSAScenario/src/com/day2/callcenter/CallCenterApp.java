package com.day2.callcenter;

public class CallCenterApp {

    public static void main(String[] args) {

        CallManager manager = new CallManager();

        manager.receiveCall(new Customer("Ravi", false));
        manager.receiveCall(new Customer("Amit", true));
        manager.receiveCall(new Customer("Neha", false));
        manager.receiveCall(new Customer("Amit", true));

        manager.serveCall();
        manager.serveCall();
        manager.serveCall();

        manager.showCallStats();
    }
}
