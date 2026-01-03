package com.day2.mybank;

abstract class Account implements ITransaction {

    protected String accountNumber;
    private double balance;   

 
    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }


    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    
    abstract double calculateInterest();
}

