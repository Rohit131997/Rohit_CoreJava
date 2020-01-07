/**
 * 
 */
package com.nisum.corejava.collections.examples;

import java.util.*;

/**
 * @author nisum
 *
 */
public class LinkedHashSetExample {
	public static void main(String[] args) {
		// creating a Linked Hash Set
		LinkedHashSet<String> obj = new LinkedHashSet<>();
		// Adding the String type elements
		System.out.println(obj.add("Dairy"));
		System.out.println(obj.add("Farm"));
		System.out.println(obj.add("Milk"));
		// Duplicate element
		System.out.println(obj.add("Farm"));
		// Clone method
		System.out.println("\nThe cloned set: " + obj.clone());
		// Checking empty or not
		System.out.println("\nThe set is empty or not: " + obj.isEmpty());
		// Checking the element is available or not
		System.out.println("\nThe entered element is equal or not: " + (obj.contains("Dairy")));
		// creating an iterator
		Iterator<String> iteobj = obj.iterator();
		while (iteobj.hasNext()) {
			System.out.println("\nThe elements in the set are: " + iteobj.next());
		}
		// Removing all the elements in the list
		System.out.println("\nRemovig all elements: " + obj.removeAll(obj));
		// Checking the set is empty or not after removing all elements
		System.out.println("\nThe set is empty or not: " + obj.isEmpty());
	}
}
