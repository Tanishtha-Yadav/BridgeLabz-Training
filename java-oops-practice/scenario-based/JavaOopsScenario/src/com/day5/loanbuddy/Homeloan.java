package com.day5.loanbuddy;

class HomeLoan extends LoanApplication {

    HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 7.5);
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
