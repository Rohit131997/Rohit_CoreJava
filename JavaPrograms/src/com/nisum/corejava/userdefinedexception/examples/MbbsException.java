/**
 * 
 */
package com.nisum.corejava.userdefinedexception.examples;

import java.util.Scanner;

/**
 * @author nisum
 *
 */
class MbbsException extends RuntimeException {
	MbbsException(String str) {
		super(str);
	}
}

class DentistException extends RuntimeException {
	DentistException(String str) {
		super(str);
	}
}

class MdException extends RuntimeException {
	MdException(String str) {
		super(str);
	}
}

class Doctor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Time: ");
		int time = sc.nextInt();
		if (time >= 0 && time <= 9) {
			throw new MbbsException("The mbbs doctor is not available ");
		} else {
			System.out.println("The MBBS doctor is available");

		}
		/*
		 * if (time >= 10 && time <= 18) { throw new
		 * DentistException("The Dental doctor is not available"); } else {
		 * System.out.println("Dental doctor is available");
		 * 
		 * }
		 * 
		 * if (time >= 19 && time <= 23) { throw new
		 * DentistException("The Md docter is not available"); } else {
		 * System.out.println("The MD doctor is  available"); }
		 */

	}
}