/**
 * 
 */
package com.nisum.corejava.multithreading.examples;

/**
 * @author nisum
 *
 */
// UsingInheritaneThread class inherits the Thread class which is in built available in java
class UsingInheritaneThread extends Thread {
	// run method is which method of Thread
	public void run() {
		for (int loop = 1; loop < 6; loop++) {
			System.out.println(loop);
		}
	}

}

class InheritanceSingeThread {
	public static void main(String[] args) {

		UsingInheritaneThread obj = new UsingInheritaneThread();
		// start method is the method of thread and implements the run method
		obj.start();
	}
}
