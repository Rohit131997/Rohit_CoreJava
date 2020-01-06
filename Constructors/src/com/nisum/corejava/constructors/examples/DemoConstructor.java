/**
 * 
 */
package com.nisum.corejava.constructors.examples;

/**
 * @author nisum
 *
 */

public class DemoConstructor {
	int x;
	double b;

//Create a class constructor for the DemoConstructor class
	public DemoConstructor()// default constructor
	{
		this.x = 5;
		System.out.println("Default Constructor");
	}

	public DemoConstructor(int y)// parameterized constructor with Integer argument
	{
		this.x = y;
		System.out.println("Constructor with Integer argument");
	}

	public DemoConstructor(int z, double a)// parameterized constructor with Integer and Double argument
	{
		this.x = z;
		this.b = a;
		System.out.println("Constructor with Integer and Double argument");

	}

	 static public void  main(String[] args) {
		DemoConstructor d1 = new DemoConstructor(10,1.9);// passing the value to constructor

		System.out.println(d1.x);
		System.out.println(d1.b);
	}
}
