/**
 * 
 */
package com.nisum.corejava.abstraction.examples;

/**
 * @author nisum
 *
 */
//Abstract Class
abstract class Bike {
	// Abstract Method
	abstract void speed();

	abstract void colourOfBike();

	public void engine() {
		System.out.println("The Engine type is BSIV\n");
	}
}

abstract class RoyalEnfield extends Bike {
	// Initializing the abstract Methods by Extracting
	public void speed() {
		System.out.println("The speed of the bike is 80\n");
	}

}

class Colour extends RoyalEnfield {
	public void colourOfBike() {
		System.out.println("The Colour of Bike is Grey\n");
	}
}

class Main {
	public static void main(String[] args) {
		RoyalEnfield Enfieldobj = new Colour();
		Enfieldobj.speed();
		Enfieldobj.engine();
		Enfieldobj.colourOfBike();
	}
}
