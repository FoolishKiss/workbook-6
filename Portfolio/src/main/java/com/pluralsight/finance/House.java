package com.pluralsight.finance;

// House as a fixed asset
public class House extends FixedAsset{
    // Properties of a house
    private String address;
    private int squareFeet;

    // Constructor
    public House(String name, double marketValue, String address, int squareFeet) {
        super(name, marketValue);
        this.address = address;
        this.squareFeet = squareFeet;
    }

    //Getter to return address
    public String getAddress() {
        return address;
    }

    //Getter to return square feet
    public int getSquareFeet() {
        return squareFeet;
    }

    // Method from Interface inherited from FixedAsset to get value
    @Override
    public double getValue() {
        return squareFeet * 150.0;
    }
}
