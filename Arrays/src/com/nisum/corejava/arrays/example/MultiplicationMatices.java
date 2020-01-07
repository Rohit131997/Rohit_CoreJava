/**
 * 
 */
package com.nisum.corejava.arrays.example;

/**
 * @author nisum
 *
 */
public class MultiplicationMatices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating two matrices
		int a[][] = { { 1, 2, 3 }, { 2, 2, 2 }, { 3, 9, 3 } };
		int b[][] = { { 3, 2, 1 }, { 2, 6, 8 }, { 3, 9, 9 } };

		// creating another matrix to store the multiplication of two matrices
		int c[][] = new int[3][3]; // 3 rows and 3 columns

		// multiplying and printing multiplication of 2 matrices
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				} // end of k loop
				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line
		}

	}

}
