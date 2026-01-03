package com.inheritance.hierarchical.bankaccount;

class FixedDepositAccount extends BankAccount {
    int tenure;   // in months

    FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
