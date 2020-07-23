package com.practice.corejava;

import java.util.ArrayList;

public class AddingElements {

	public static void main(String args[]) {

		// Declaration of String ArrayList
		ArrayList<String> al = new ArrayList<String>();

		al.add("California");
		al.add("Boston");
		al.add("San jose");
		al.add("New York");
		al.add(2, "San Francisco");
		System.out.println("ArrayList after adding String San Francisco:" + al);

		// Addition of String element at 1st position
		al.add(0, "Texas");

		// Displaying the ArrayList
		System.out.println("ArrayList after adding String Texas:" + al);
	}
}
