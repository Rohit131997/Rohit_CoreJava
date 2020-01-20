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
		LinkedHashSet<String> currency = new LinkedHashSet<>();
		// Adding the String type elements
		System.out.println(currency.add("Dollar"));
		System.out.println(currency.add("Rupee"));
		System.out.println(currency.add("Pound"));
		System.out.println(currency.add("Euro"));
		System.out.println(currency.add("Dirham"));
		// Duplicate elements are not allowed
		System.out.println(currency.add("Dollar"));
		// Clone method
		System.out.println("\nThe cloned set: " + currency.clone());
		// Checking empty or not
		System.out.println("\nThe set is empty or not: " + currency.isEmpty());
		// Checking the element is available or not
		System.out.println("\nThe entered element is equal or not: " + (currency.contains("Rupee")));
		// creating an iterator
		Iterator<String> iteobj = currency.iterator();
		while (iteobj.hasNext()) {
			System.out.println("\nThe elements in the set are: " + iteobj.next());
		}
		// Removing all the elements in the list
		System.out.println("\nRemovig all elements: " + currency.removeAll(currency));
		// Checking the set is empty or not after removing all elements
		System.out.println("\nThe set is empty or not: " + currency.isEmpty());
	}
}
