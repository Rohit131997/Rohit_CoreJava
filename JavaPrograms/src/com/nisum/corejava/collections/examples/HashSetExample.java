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
		HashSet<String> obj = new HashSet<>();
		// adding elements
		System.out.println(obj.add("Chari"));
		System.out.println(obj.add("Giri"));
		System.out.println(obj.add("Das"));
		System.out.println(obj.add("Suri"));
		// Creating Duplicate element
		System.out.println(obj.add("Suri"));
		// Empty or not
		System.out.println("Is Empty or not :" + obj.isEmpty());
		// clone method
		System.out.println("\nThe Clone is :\n" + obj.clone());
		// size method
		System.out.println("\nThe size is :\n" + obj.size());
		// removing element from list
		System.out.println("\nThe Element is removed:\n" + obj.remove("Chari"));
		// Iterator for String type
		Iterator<String> itobj = obj.iterator();
		while (itobj.hasNext()) {
			System.out.println("\nThe Hash set elemets are :\n" + itobj.next());
		}

	}
}