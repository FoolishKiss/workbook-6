package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    // List to store any item that implements the valuable interface
    private List<Valuable> assets;

    public Portfolio() {
        this.assets = new ArrayList<>();
    }

    // Method to add an asset
    public void addAsset(Valuable item) {
        assets.add(item);
    }

    // Method to total value of all items in portfolio
    public double getTotalValue() {
        double total = 0;
        for (Valuable item : assets) {
            total += item.getValue();
        }
        return total;
    }

    // Method to get the count of the items in the portfolio
    public int getItemCount() {
        return assets.size();
    }
}
