package com.day1.walletapplication;

abstract class Wallet implements Transferrable {
    private double balance;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    protected boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
