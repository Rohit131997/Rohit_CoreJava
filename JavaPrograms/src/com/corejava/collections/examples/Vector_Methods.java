package com.corejava.collections.examples;

import java.util.Vector;

public class Vector_Methods {
    public static void main(String []args) {
        //Create an Vector constructor with Size
        Vector<String> animals = new Vector<String>(4 + 5);
        //Adding elements to a vector
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Rat");
        animals.add("Cat");

        //Check size and capacity
        System.out.println("Size of vector is : " + animals.size());
        System.out.println("Default capacity is :" + animals.capacity());
        //Display Vector elements
        System.out.println("Vector element is: "+ animals);

        animals.addElement("Deer");
        animals.addElement("Zebra");
        animals.addElement("Monkey");
        animals.addElement("Pig");
        animals.addElement("Donkey");

        //Again check size and capacity after five insertions
        System.out.println("Size after addition :" + animals.size());
        System.out.println("Capacity after addition is :" + animals.capacity());
        //Display Vector elements again
        System.out.println("Elements are: "+animals);
        // Deleting an element
        System.out.println("Removing an element :" + animals.remove( 0 ) );
        //Checking if Tiger is present or not in this vector
        if(animals.contains("Tiger"))
        {
            System.out.println("Tiger is present at the index " + animals.indexOf("Tiger"));
        }
        else
        {
            System.out.println("Tiger is not present in the list.");
        }

        //Get the first element
        System.out.println("The first animal of the vector is :" + animals.firstElement());

        //Get the last element
        System.out.println("The last animal of the vector is :" + animals.lastElement());
    }
}
