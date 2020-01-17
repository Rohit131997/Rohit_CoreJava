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
		List<Integer> obj = new ArrayList<>();
		obj.add(11);
		obj.add(22);
		obj.add(13);
		obj.add(92);
		obj.add(56);
		Collections.sort(obj);
		obj.remove(1);
		obj.remove(3);
		obj.forEach(System.out::println);

	}
}
