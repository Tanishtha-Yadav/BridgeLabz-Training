package com.objectmodeling.Bank;

public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Account openAccount(Customer customer, double balance) {
        System.out.println("Account opened for " + customer.getName() + " in " + bankName);
        return new Account(balance, this);
    }

    public String getBankName() {
        return bankName;
    }
}
