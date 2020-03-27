package com.corejava.collections.examples;

import java.util.LinkedHashMap;

public class LinkedHashMap_Methods {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> oddnumbers = new LinkedHashMap<>(  );

        // inserting elements to Map
        oddnumbers.put( "One", 1 );
        oddnumbers.put( "Three", 3 );
        oddnumbers.put( "Five", 5 );
        oddnumbers.put( "Seven", 7 );
        // putIfAbsent method
        oddnumbers.putIfAbsent( "Nine", 9 );

        // the Map with keys and values
        System.out.println("The Entries are :" + oddnumbers.entrySet() );
        // The size of map
        System.out.println( "Size is :" + oddnumbers.size());
        System.out.println("The Key are :" + oddnumbers.keySet());
        System.out.println( "The values are :" + oddnumbers.values());

        int value = oddnumbers.get( "Nine" );
        System.out.println( "The value we get is :" + value);

        System.out.println("The numbers after replacing ara :" + oddnumbers.replace( "Five",5,55 ));

        System.out.println( "The even numbers we inserted are :" + oddnumbers);
    }

}
