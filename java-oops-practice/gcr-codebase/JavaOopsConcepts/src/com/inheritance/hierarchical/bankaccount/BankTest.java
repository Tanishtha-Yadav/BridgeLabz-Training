package com.inheritance.hierarchical.bankaccount;

public class BankTest {
    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount(101, 50000, 4.5);
        BankAccount a2 = new CheckingAccount(102, 20000, 10);
        BankAccount a3 = new FixedDepositAccount(103, 100000, 24);

        a1.displayAccountType();
        a2.displayAccountType();
        a3.displayAccountType();
    }
}
