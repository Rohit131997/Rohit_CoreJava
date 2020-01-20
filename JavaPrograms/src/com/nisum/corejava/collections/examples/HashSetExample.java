/**
 * 
 */
package com.nisum.corejava.collections.examples;

import java.util.*;

/**
 * @author nisum
 *
 */
public class HashSetExample {
	public static void main(String[] args) {
		// Creating a Hash set
		HashSet<String> names = new HashSet<>();
		// Size of set before inserting elements
		System.out.println( "Size of Set :" + names.size());
		// adding elements
		System.out.println(names.add("Chari"));
		System.out.println(names.add("Giri"));
		// null insertion is possible
		System.out.println(names.add(null));
		System.out.println(names.add("Suri"));
		// Creating Duplicate element
		System.out.println(names.add("Suri"));
		// Empty or not
		System.out.println("Is Empty or not :" + names.isEmpty());
		// clone method
		System.out.println("The Clone is :\n" + names.clone());
		// size of set after insertion
		System.out.println("The size is :\n" + names.size());
		// removing element from list
		System.out.println("The Element is removed:\n" + names.remove("Chari"));
		// Iterator for String type
		Iterator<String> iteratorobj = names.iterator();
		while (iteratorobj.hasNext()) {
			System.out.println("The Hash set elemets are :\n" + iteratorobj.next());
		}

	}
}