/**
 * 
 */
package com.corejava.exceptions.examples;

/**
 * @author nisum
 *
 */
public class ExceptionProg2 {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 10;
		num2 = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException ae) {
			// Modifying the exception occurred
			System.out.println(num1 / (num2 + 5));
		}
	}
}
