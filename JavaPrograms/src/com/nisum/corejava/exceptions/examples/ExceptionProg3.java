/**
 * 
 */
package com.nisum.corejava.exceptions.examples;

/**
 * @author nisum
 *
 */
public class ExceptionProg3 {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			// The array value requested is not available and is shows
			// "ArrayIndexOutOfBoundException"
			System.out.println(arr[7]);
		} catch (Exception e) {
			// Either printing e we are giving a statement
			System.out.println("The Array value is no available");
		}
		System.out.println("The program is executed......");
	}

}
