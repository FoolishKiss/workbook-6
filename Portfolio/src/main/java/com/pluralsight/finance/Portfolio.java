package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio {

    //properties of portfolio
    private String name;
    private String owner;
    // List to store any item that implements the valuable interface
    private List<Valuable> assets;

    //Constructor to make an empty portfolio
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

    // Method to get asset with the highest value
    public Valuable getMostValuable() {
        // If the list is empty return null otherwise use collections
        return assets.isEmpty() ? null : Collections.max(assets);
    }

    // Method to get asset with the lowest value
    public Valuable getLeastValuable() {
        // If the list is empty return null otherwise use collections
        return assets.isEmpty() ? null : Collections.min(assets);
    }

    // Method to return list of assets
    public List<Valuable> getAssets() {
        return new ArrayList<>(assets);
    }
}
