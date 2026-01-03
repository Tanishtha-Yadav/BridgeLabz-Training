package com.day1.walletapplication;

class Transaction {
    String fromUser;
    String toUser;
    double amount;

    Transaction(String from, String to, double amount) {
        this.fromUser = from;
        this.toUser = to;
        this.amount = amount;
    }
}
