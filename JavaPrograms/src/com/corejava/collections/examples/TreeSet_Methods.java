package com.corejava.collections.examples;

import java.util.*;

public class TreeSet_Methods {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(  );
        // Inserting elements to tree set 1
        numbers.add( 10 );
        numbers.add( 3 );
        numbers.add( 44 );
        numbers.add( 54 );

        TreeSet<Integer> values = new TreeSet<>();
        // Inserting elements to tree set 2
        values.add( 23 );
        values.add( 93 );
        values.add( 67 );
        // Adding all the elements of set1 to set2
        values.addAll( numbers );

        // removing the element 93
        System.out.println("Removing an element :" + values.remove( 93 ) );
        // clone of the set
        System.out.println("\nThe Cloned set after removing 93 :" + values.clone());

        // First and last values in the set
        System.out.println("\nThe first value in the Set is :" + values.first() );
        System.out.println( "\nThe last value in the Set is :" + values.last());

        // Lower and Higher values in the set
        System.out.println("\nThe Lower of 23 in the set is :" + values.lower( 23 ) );
        System.out.println("\nThe Higher of 23 in the set is :" + values.higher( 23 ) );

        // Before and after elenets in the set by using headset and tailset methods
        System.out.println("\nThe values before 44 are :" + values.headSet( 44 ) );
        System.out.println("\nThe values after 44 are :" + values.tailSet( 44 ) );

        // Getting the eleemnts between the variables by using subset method
        System.out.println("\nThe values between them :" + values.subSet( 10,54 ) );

        System.out.println("\nThe size of the set is :" + values.size() );

        Iterator<Integer> iterobj = values.iterator();
        {
            while (iterobj.hasNext())
            {
                System.out.println("\nThe elements in the set are :" + iterobj.next());
            }
        }


    }
}
