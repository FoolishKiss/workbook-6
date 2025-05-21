package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }



    @Override
    // Method to compare Person object to with other person object
    //It returns an int of which one came first
    public int compareTo(Person other) {
        // Compare this.lastName with other.lastName if
        // before = -, after = +, same = 0
        int lastName = this.lastName.compareToIgnoreCase(other.lastName);
        //If last names are not the same return the result
        if (lastName != 0) return lastName;
        //If the first names are the same, then compare first names and return that
        int firstName = this.firstName.compareToIgnoreCase(other.firstName);
        // If first names are not the same return the result
        if (firstName != 0) return firstName;
        // If both names are the same compare age
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}
