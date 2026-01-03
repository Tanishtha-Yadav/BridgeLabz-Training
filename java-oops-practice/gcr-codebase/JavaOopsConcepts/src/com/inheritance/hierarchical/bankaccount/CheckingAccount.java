package com.inheritance.hierarchical.bankaccount;

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

