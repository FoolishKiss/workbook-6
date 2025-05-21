package com.pluralsight.finance;

// Contract for anything with value.
public interface Valuable extends Comparable<Valuable>{
    // Method to get value and returns it
    double getValue();

    @Override
    // Default method in an interface using compareTo to
    // Compare valuable objects to other valuable objects
    default int compareTo(Valuable other) {
        // Compares the value of current Valuable object to other Valuable object
        // Returns -1 if this < other, 0 if =, 1 if this > other
        return Double.compare(this.getValue(), other.getValue());
    }

}
