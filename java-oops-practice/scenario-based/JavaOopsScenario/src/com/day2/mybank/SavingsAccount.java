package com.day2.mybank;

class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;
    }
}

