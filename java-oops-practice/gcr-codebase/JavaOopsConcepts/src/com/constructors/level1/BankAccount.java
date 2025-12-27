package com.constructors.level1;
public class BankAccount
{
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
        }
    }

    // MAIN METHOD
    public static void main(String[] args)
    {
        SavingsAccount sa = new SavingsAccount("ACC101", "Suhani", 5000);

        sa.displayDetails();

        sa.deposit(2000);
        sa.withdraw(1000);

        System.out.println("Updated Balance: " + sa.getBalance());
    }
}

class SavingsAccount extends BankAccount
{
    public SavingsAccount(String accountNumber, String accountHolder, double balance)
    {
        super(accountNumber, accountHolder, balance);
    }

    void displayDetails()
    {
        System.out.println("Account Number: " + accountNumber);   
        System.out.println("Account Holder: " + accountHolder);  
        System.out.println("Balance: " + getBalance());           
    }
}
