/**
 * 
 */
package com.nisum.corejava.arrays.example;

/**
 * @author nisum
 *
 */
public class AverageOfTwoNumbers {
	public static void main(String[] args) {

		double[] arr = { 22, 102.89, 116.5, 200, 3.7 };
		double total = 0;

		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

		// arr.length returns the number of elements present in the array

		double average = total / arr.length;

		// this is used for displaying the formatted output if you give %.4f then the
		// output would have 4 digits after decimal point.

		System.out.format("The average is: %f", average);
	}

}
