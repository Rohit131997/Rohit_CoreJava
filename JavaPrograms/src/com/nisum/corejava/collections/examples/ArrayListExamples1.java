package com.nisum.corejava.collections.examples;

import java.util.*;

public class ArrayListExamples1 {
	public static void main(String[] args) {
		// creating a array list of String elements
		List<String> obj = new ArrayList<String>();
		obj.add("Ram");
		obj.add("Sam");
		obj.add("Cat");
		// removing the element by using index number
		obj.remove(1);
		// Sorting the elements
		Collections.sort(obj);
		for (String sobj : obj) {
			System.out.println(sobj);
		}
	}
}
