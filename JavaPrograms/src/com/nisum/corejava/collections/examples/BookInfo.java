/**
 * 
 */
package com.nisum.corejava.collections.examples;

import java.util.*;

/**
 * @author nisum
 *
 */
public class BookInfo {
	int id, quantity;
	String bookName, author, publisher;

	// Constructor for BookInfo class
	public BookInfo(int id, String bookName, String author, String publisher, int quantity) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

class ArrayListExample {
	public static void main(String[] args) {
		// Creating a Array list of elements
		List<BookInfo> obj = new ArrayList<BookInfo>();
		BookInfo bobj1 = new BookInfo(1, "C", "The C book author", "c book publisher", 11);
		BookInfo bobj2 = new BookInfo(2, "Java", "The Java book author", "Java book publisher", 6);
		BookInfo bobj3 = new BookInfo(3, "Data Structues", "The Data Structues book author",
				"Data Structues book publisher", 5);
		BookInfo bobj4 = new BookInfo(4, "C++", "The C++ book author", "C++ book publisher", 10);
		obj.add(bobj1);
		obj.add(bobj2);
		obj.add(bobj3);
		obj.add(bobj4);
		// Traversing using For Each loop
		for (BookInfo BIobj : obj) {
			System.out.println(BIobj.id + " " + BIobj.bookName + " " + BIobj.author + " " + BIobj.publisher + " "
					+ BIobj.quantity);

		}

	}
}