/**
 * 
 */
package com.nisum.corejava.multithreading.examples;

/**
 * @author nisum
 *
 */
public class Test {
	public static void main(String[] args) {
		try {
			int data = 10/0;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally {
			System.out.println("Final block");
		}
		System.out.println("Rest of the code");
	}
}
