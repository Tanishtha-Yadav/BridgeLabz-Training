package com.encapsulation.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 4.5;

    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;   
    }
}

