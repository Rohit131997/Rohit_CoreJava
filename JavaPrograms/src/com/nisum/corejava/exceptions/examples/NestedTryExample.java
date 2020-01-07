/**
 * 
 */
package com.nisum.corejava.exceptions.examples;

/**
 * @author nisum
 *
 */
public class NestedTryExample {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println(arr[7]);
			try {
				int data = arr[3] / 0;
			} catch (ArithmeticException e2) {
				System.out.println("Division with zero cannot be done");

			}

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
			System.out.println("Elements not exists");

		}

	}
}
