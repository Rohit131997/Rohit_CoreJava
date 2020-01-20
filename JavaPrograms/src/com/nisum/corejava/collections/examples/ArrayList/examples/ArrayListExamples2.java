/**
 *
 */
package com.nisum.corejava.collections.examples.ArrayList.examples;

import java.util.*;

/**
 * @author nisum
 *
 */
public class ArrayListExamples2 {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        // inserting elements in the list
        obj.add( 1 );
        obj.add( 22 );
        obj.add( 13 );
        obj.add( 92 );
        obj.add( 56 );
        // sorting the elements
        Collections.sort( obj );
        // removing the elements
        obj.remove( 1 );
        obj.remove( 3 );
        // checking the list is empty or not
        System.out.println( "The List is empty or not :" + obj.isEmpty() );
        // Iterating the list elements
        Iterator<Integer> iteratorobj = obj.iterator();
        {
            while (iteratorobj.hasNext()) {
                System.out.println( "The values of the list are :" + iteratorobj.next() );
            }
        }
        // checking the index of a number
        System.out.println( "The index of 56 is :" + obj.indexOf( 56 ) );
        // removing all the elements in the list
        System.out.println( "Removing all elements in the list :" + obj.removeAll( obj ) );
        // checking the list is empty or not
        System.out.println( "The List is empty or not :" + obj.isEmpty() );
    }
}
