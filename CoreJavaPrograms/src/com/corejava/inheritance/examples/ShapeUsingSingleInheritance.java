/**
 * 
 */
package com.corejava.inheritance.examples;

/**
 * @author nisum
 *
 */
class ShapeUsingSingleInheritance {
	int length;
	int breadth;
}

class Rectangle extends ShapeUsingSingleInheritance {
	int area;

	public void calcualteArea() {
		area = length * breadth;
	}

	public static void main(String args[]) {
		Rectangle rectangleobj = new Rectangle();
		// Assigning values to Shape class attributes
		rectangleobj.length = 17;
		rectangleobj.breadth = 24;
		// Calculate the area
		rectangleobj.calcualteArea();
		System.out.println("The Area of rectangle is: " + rectangleobj.area);
	}
}
