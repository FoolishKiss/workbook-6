package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.List;

public class FinanceApp {
    public static void main(String[] args) {

        // Create a portfolio
        Portfolio portfolio = new Portfolio();

        // Add fixed assets
        House myhouse = new House("Mi Casa", 500000, "123 around the way St.", 5000);
        Jewelry ring = new Jewelry("Gold Ring", 2000, "Gold", 20);
        Gold gold   = new Gold("Gold", 40,50);

        // Add liquid account
        BankAccount checking = new BankAccount(5000);
        checking.deposit(1000);
        checking.withdraw(500);
        Valuable SavingAccount = new BankAccount(1500);

        // Add a credit card
        CreditCard amex = new CreditCard(1250);
        amex.pay(250);
        amex.pay(1000);

        // Add assets to portfolio
        portfolio.addAsset(myhouse);
        portfolio.addAsset(ring);
        portfolio.addAsset(gold);
        portfolio.addAsset(checking);
        portfolio.addAsset(amex);
        portfolio.addAsset(SavingAccount);

        // Output portfolio
        System.out.println("====== Portfolio Summary ======");
        List<Valuable> items = List.of(myhouse,ring, gold, checking, amex);
        for (Valuable item : items) {
            System.out.printf("%-20s : $%.2f%n", item.getClass().getSimpleName(), item.getValue());
        }

        System.out.println("============================");
        System.out.printf("Total portfolio value: $%.2f%n", portfolio.getTotalValue());
        System.out.println("Number of items: " + portfolio.getItemCount());

    }
}
