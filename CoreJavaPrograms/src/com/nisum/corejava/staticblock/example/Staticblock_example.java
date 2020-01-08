/**
 * 
 */
package com.nisum.corejava.staticblock.example;

/**
 * @author nisum
 *
 */
public class Staticblock_example {
	static int data1;
	// start of static block
	static {
		data1 = 10;
		System.out.println("static block called ");
	}
	// end of static block
}

class Test {
	public static void main(String args[]) {

		// Although we don't have an object of Staticblock_example, static block is
		// called because data1 is being accessed.
		System.out.println(Staticblock_example.data1);
	}
}
