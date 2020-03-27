/**
 * 
 */
package com.corejava.interfaces.example;

/**
 * @author nisum
 *
 */
//Interface class
interface Features {
	// Abstract Methods
	void call();

	void message();

}

interface AdditionalFeature {
	void camera();

	void dualSim();
}

//The Oldmobile class implements the feature
class OldMobile implements Features {
	// Implementing Abstract methods
	public void call() {
		System.out.println("OldMobile has Feature of Dailling...\n");

	}

	public void message() {
		System.out.println("Oldmobile has Feature of texting...\n ");
	}
}

class SmartPhone implements Features, AdditionalFeature {
	public void call() {
		System.out.println("SmartPhone has Feature of Dailling...\n");

	}

	public void message() {
		System.out.println("SmartPhone has Feature of texting...\n ");
	}

	public void camera() {
		System.out.println("SmartPhone has Feature of taking Pictures...\n");

	}

	public void dualSim() {
		System.out.println("SmartPhone has Feature of texting...\n ");
	}
}

class Phone {
	public static void main(String[] args) {

		OldMobile oldmobobj = new OldMobile();
		System.out.println("The Old Mobile:");
		oldmobobj.call();
		oldmobobj.message();
		SmartPhone smtphobj = new SmartPhone();
		System.out.println("The Smart Phone :");
		smtphobj.call();
		smtphobj.camera();
		smtphobj.dualSim();
		smtphobj.message();

	}
}
