package com.pluralsight.finance;

public class CreditCard implements Valuable{

    // Balance of the card
    private double balance;

    // Constructor to make a credit card with 0 initial debt
    public CreditCard() {
        this.balance = 0;

    }

    // Constructor to make a credit card with an initial debt
    public CreditCard(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to charge the card
    public void charge(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to pay down the card balance
    public void pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method from Interface to get value and returns as a negative
    @Override
    public double getValue() {
        return -balance;
    }
}
