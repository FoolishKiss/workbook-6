package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable{

    // Properties of assets
    private String name;
    private double marketValue;

    // Constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    //Getter to return name
    public String getName() {
        return name;
    }

    //Getter to return value
    @Override
    public double getValue() {
        return marketValue;
    }
}
