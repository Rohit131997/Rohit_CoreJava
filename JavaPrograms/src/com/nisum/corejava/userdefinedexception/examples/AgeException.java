/**
 * 
 */
package com.nisum.corejava.userdefinedexception.examples;

import java.util.Scanner;

/**
 * @author nisum
 *
 */
//User defined exception
//AgeException will extends the in built RunTimeException class
class AgeException extends RuntimeException {
	// Constructor for AgeException
	AgeException(String str) {
		// super is which is used to refer the parent class objects(RunTimeException)
		// class)
		super(str);
	}
}

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the candidate :");
		int age = sc.nextInt();
		if (age < 18) {
			// Throws the unchecked exception
			throw new AgeException("The candidate is not eligible to vote");
		} else {
			System.out.println("The Candidate is eligible to vote");
		}

	}
}
