package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortApp {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();

        myFamily.add( new Person("Brian", "Miller", 29));
        myFamily.add( new Person("Alice", "Wonder", 30));
        myFamily.add( new Person("John", "Miller", 45));
        myFamily.add( new Person("Mike", "Smith", 55));
        myFamily.add( new Person("Brian", "Marley", 20));
        myFamily.add( new Person("Mike", "Smith", 45));

        // Sort person in myfamily list
        Collections.sort(myFamily);

        System.out.println("Sorted Family \n");
        for (Person person: myFamily) {
            System.out.println(person);
        }
    }
}
