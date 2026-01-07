package com.day5.loanbuddy;

abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term;              // in months
    protected double interestRate;   // annual
    private boolean approved;        // internal only

    LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    // Internal approval logic
    protected boolean checkEligibility(int minScore, double minIncome) {
        return applicant.getCreditScore() >= minScore &&
               applicant.getIncome() >= minIncome;
    }

    protected void setApproved(boolean status) {
        approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    @Override
    public void approveLoan() {
        if (checkEligibility(650, 25000)) {
            setApproved(true);
            System.out.println("Loan Approved for " + applicant.getName());
        } else {
            setApproved(false);
            System.out.println("Loan Rejected for " + applicant.getName());
        }
    }
}
