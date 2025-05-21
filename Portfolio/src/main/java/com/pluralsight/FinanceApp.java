package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinanceApp {
    public static void main(String[] args) {

        // Create a portfolio
        Portfolio portfolio = new Portfolio();



        // Add fixed assets
        House myhouse = new House("Mi Casa", 500000, "123 around the way St.", 5000);
        Jewelry ring = new Jewelry("Gold Ring", 2000, "Gold", 20);
        Gold gold   = new Gold("Gold", 0,50);

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

        // Prints out portfolio
        System.out.println("====== Portfolio Summary ======");
        List<Valuable> items = List.of(myhouse,ring, gold, checking, amex);
        for (Valuable item : items) {
            System.out.printf("%-20s : $%.2f%n", item.getClass().getSimpleName(), item.getValue());
        }

        System.out.println("============================");
        System.out.printf("Total portfolio value: $%.2f%n", portfolio.getTotalValue());
        System.out.println("Number of items: " + portfolio.getItemCount());

        // Created a sorted copy of asset list
        List<Valuable> sortedAssets = new ArrayList<>(portfolio.getAssets());
        // show lowest to highest
        Collections.sort(sortedAssets);
        // Reverse to show highest to lowest
        Collections.reverse(sortedAssets);

        // Prints out the sorted portfolio from highest to lowest
        System.out.println("\nPortfolio items from highest to lowest value: ");
        for (Valuable item : sortedAssets) {
            System.out.printf("%-15s : $%.2f%n", item.getClass().getSimpleName(), item.getValue());
        }

        // Most and least valuable items from the portfolio
        Valuable mostValuable = portfolio.getMostValuable();
        Valuable leastValuable = portfolio.getLeastValuable();

        // Prints out most valuable item if list is not empty
        System.out.println("\nMost Valuable Item:");
        if (mostValuable != null) {
            System.out.printf("%-15s : $%.2f%n", mostValuable.getClass().getSimpleName(), mostValuable.getValue());
        } else {
            System.out.println("No items in portfolio");
        }

        // Prints out least valuable item if list is not empty
        System.out.println("\nLeast Valuable Item:");
        if (mostValuable != null) {
            System.out.printf("%-15s : $%.2f%n", leastValuable.getClass().getSimpleName(), leastValuable.getValue());
        } else {
            System.out.println("No items in portfolio");
        }

    }
}
