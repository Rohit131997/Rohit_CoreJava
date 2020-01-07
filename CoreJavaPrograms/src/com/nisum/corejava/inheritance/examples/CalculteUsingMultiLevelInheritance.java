/**
 * 
 */
package com.nisum.corejava.inheritance.examples;

/**
 * @author nisum
 *
 */
public class CalculteUsingMultiLevelInheritance {
	public void add(int data1, int data2) {// addition method for data1,data2
		int Sum = data1 + data2;
		System.out.println(Sum);
	}

}

class Calculate_Class_2 extends CalculteUsingMultiLevelInheritance {// subclass extracting from
																	// CalculteUsingMultiLevelInheritance super class
	public void sub(int data1, int data2) {// subtraction method for data1,data2
		int Sum = data1 - data2;
		System.out.println(Sum);
	}
}

class Calculate_Class_3 extends Calculate_Class_2 {// subclass extracting from Calculate_Class_2 super class
	public void mul(int data1, int data2) {// multiplication method for data1,data2
		int Sum = data1 * data2;
		System.out.println(Sum);

	}
}

class Data {// main class
	public static void main(String[] args) {

		Calculate_Class_3 calculateobj = new Calculate_Class_3();// creating an object for Calculate_Class_3
																	// Class
		calculateobj.add(10, 20);// calling and assigning values for addition method
		calculateobj.sub(20, 10);// calling and assigning values for subtraction method
		calculateobj.mul(10, 10);// calling and assigning values for multiplication method
	}

}
