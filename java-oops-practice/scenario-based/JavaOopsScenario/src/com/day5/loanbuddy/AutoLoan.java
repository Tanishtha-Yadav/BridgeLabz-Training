package com.day5.loanbuddy;

class AutoLoan extends LoanApplication {

    AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 9.0);
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
