package com.pluralsight.finance;

public class Jewelry extends FixedAsset{

    // Properties of jewelry
    private String material;
    private double weightGrams;


    // Constructor
    public Jewelry(String name, double marketValue, String material, double weightGrams) {
        super(name, marketValue);
        this.material = material;
        this.weightGrams = weightGrams;
    }

    // Getter to get material
    public String getMaterial() {
        return material;
    }

    // Getter to get the weight
    public double getWeightGrams() {
        return weightGrams;
    }

    // Method from Interface inherited from FixedAsset to get value
    @Override
    public double getValue() {
        switch (material.toLowerCase()) {
            case "gold":
                return weightGrams * 60.0;
            case "silver":
                return weightGrams * 0.75;
            default:
                return weightGrams;
        }
    }
}
