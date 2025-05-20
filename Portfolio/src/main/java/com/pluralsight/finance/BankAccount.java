package com.pluralsight.finance;

public class BankAccount implements Valuable{

    // Balance of the bank account
    private double balance;

    // Constructor to make a bank account with zero initial balance
    public BankAccount() {
        this.balance = 0;
    }

    // Constructor to make a bank account with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to add to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to subtract from the account if the balance is there
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method from Interface to get value
    @Override
    public double getValue() {
        return balance;
    }

}
