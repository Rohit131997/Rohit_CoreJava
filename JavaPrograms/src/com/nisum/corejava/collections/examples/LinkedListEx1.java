/**
 *
 */
package com.nisum.corejava.collections.examples;

import java.util.*;

/**
 * @author nisum
 *
 */
public class LinkedListEx1 {
    public static void main(String[] args) {
        // Creating first Linked list
        LinkedList<String> list1 = new LinkedList<String>();
        // adding elements to first linked list
        list1.add( "Data" );
        list1.add( "Object" );
        list1.add( "Search" );
        list1.add( "Stack" );

        //Creating second linked list
        LinkedList<String> list2 = new LinkedList<String>();
        // adding elements to second linked list
        list2.add( "Feel" );
        list2.add( "Since" );
        // Adding all first list elements to second list
        list2.addAll( list1 );

        // removing an element
        list2.remove( 2 );
        // sorting the list
        Collections.sort( list2 );

        // cloning the list
        System.out.println( "The clone of the list is :" + list2.clone() );
        // Checking the size of the list
        System.out.println( "The size of the list is :" + list2.size() );
        // Using get method
        System.out.println( "The 2nd index value is :" + list2.get( 2 ) );

        // Iterating the elements
        Iterator<String> iteratorobj = list2.iterator();
        while (iteratorobj.hasNext()) {
            System.out.println( iteratorobj.next() );
        }

    }
}

