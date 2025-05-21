package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", "Wonder", 25));
        people.add(new Person("Luke", "Skywalker", 19));
        people.add(new Person("Darth", "Vader", 45));
        people.add(new Person("Leia", "Organa", 25));
        people.add(new Person("Anakin", "Skywalker", 30));
        people.add(new Person("Bob", "Builder", 67));
        people.add(new Person("Bruce", "Wayne", 24));
        people.add(new Person("Tony", "Stark", 33));
        people.add(new Person("Tony", "Soprano", 46));
        people.add(new Person("Barry", "Allen", 25));


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a name to search (First or Last): ");
        String input = userInput.nextLine().trim();

        int maxAge = people.get(0).getAge();
        int minAge = people.get(0).getAge();
        int totalAge = 0;

        for (Person p : people) {
            int age = p.getAge();
            totalAge += age;

            if (age > maxAge) {
                maxAge = age;
            }

            if (age < minAge) {
                maxAge = age;
            }
        }

        double averageAge = (double) totalAge / people.size();

        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + maxAge);
        System.out.println("Youngest age: " + minAge);

        List<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(input) || p.getLastName().equalsIgnoreCase(input)) {
                matches.add(p);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("Matches: ");
            for (Person match : matches) {
                System.out.println(match);
            }
        }

        userInput.close();
    }


}
