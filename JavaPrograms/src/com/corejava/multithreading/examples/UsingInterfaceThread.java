/**
 * 
 */
package com.corejava.multithreading.examples;

/**
 * @author nisum
 *
 */
// UsingInterfaceThread class implements interface class Runnable which is in built in java
class UsingInterfaceThread implements Runnable {
	public void run() {
		System.out.println("The Thread is running");
	}

	public static void main(String[] args) {
		UsingInterfaceThread obj = new UsingInterfaceThread();
		// By using interface method we should create thread object and call the class
		// object in it
		Thread threadobj = new Thread(obj);
		threadobj.start();
	}
}
