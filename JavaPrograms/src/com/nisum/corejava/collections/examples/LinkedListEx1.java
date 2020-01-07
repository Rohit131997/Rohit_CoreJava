/**
 * 
 */
package com.nisum.corejava.collections.examples;

import java.util.*;

/**
 * @author nisum
 *
 */
public class LinkedListEx1 
{
public static void main(String[] args) {
	LinkedList<String> obj = new LinkedList<String>();
	obj.add("Data");
	obj.add("Object");
	obj.add("Search");
	obj.add("Stack");
	obj.remove(2);
	Collections.sort(obj);
	obj.forEach(System.out::println);
}
}
