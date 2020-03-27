package com.corejava.collections.examples;

import java.util.HashMap;

public class HashMap_Methods {
    public static void main(String[] args) {
        HashMap<String,Integer> evennumbers = new HashMap<>(  );

        // inserting elements to Map
        evennumbers.put( "two", 2 );
        evennumbers.put( "Four", 4 );
        evennumbers.put( "Six", 6 );
        evennumbers.put( "eight", 8 );
        // putIfAbsent method
        evennumbers.putIfAbsent( "Ten", 10 );

        // the Map with keys and values
        System.out.println("The entries are :" + evennumbers.entrySet() );
        // The size of map
        System.out.println( "Size is :" + evennumbers.size());
        System.out.println("The Key are :" + evennumbers.keySet());
        System.out.println( "The values are :" + evennumbers.values());

        int value = evennumbers.get( "Six" );
        System.out.println( "The value we get is :" + value);

       System.out.println("The numbers after replacing ara :" + evennumbers.replace( "Four",4,44 ));

       System.out.println( "The even numbers we inserted are :" + evennumbers);
    }

}
