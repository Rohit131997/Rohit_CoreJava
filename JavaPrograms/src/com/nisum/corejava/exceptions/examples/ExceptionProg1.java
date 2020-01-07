/**
 * 
 */
package com.nisum.corejava.exceptions.examples;

/**
 * @author nisum
 *
 */
public class ExceptionProg1 {
	public static void main(String[] args) {
		// try block which contains exceptions of dividing with 0.
		try {
			int value = 10 / 0;
		}
		// catch block which handles the exception will shows the type of exception
		catch (Exception e) {
			System.out.println(e);
		}
		// remaining program
		System.out.println("The program is excecuted");

	}
}
