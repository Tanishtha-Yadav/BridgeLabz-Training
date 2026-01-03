package com.day2.mybank;

class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.0;

    CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;
    }
}

