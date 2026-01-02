package com.objectmodeling.Bank;

public class Account {
    private double balance;
    private Bank bank;

    public Account(double balance, Bank bank) {
        this.balance = balance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }
}
