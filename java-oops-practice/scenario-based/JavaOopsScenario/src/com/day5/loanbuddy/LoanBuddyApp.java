package com.day5.loanbuddy;

public class LoanBuddyApp {
    public static void main(String[] args) {

        Applicant applicant1 =
            new Applicant("Tanishtha", 720, 60000, 800000);

        LoanApplication loan =
            new HomeLoan(applicant1, 240);

        loan.approveLoan();

        if (loan.isApproved()) {
            System.out.println("Monthly EMI: ₹" +
                Math.round(loan.calculateEMI()));
        }
    }
}

