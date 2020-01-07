/**
 * 
 */
package com.nisum.corejava.multithreading.examples;

/**
 * @author nisum
 *
 */
class ThreadMethodsExample extends Thread {
	public void run() {
		for (int loop = 0; loop <= 6; loop++) {
			try {
				// sleep method
				Thread.sleep(800);

			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(loop);
		}
	}
}

class MethodImplement {
	public static void main(String[] args) {
		ThreadMethodsExample tobj1 = new ThreadMethodsExample();
		ThreadMethodsExample tobj2 = new ThreadMethodsExample();
		// get Id method of tobj1
		System.out.println("ID :" + tobj1.getId());
		// get name method of tobj1
		System.out.println("Name of Thread :" + tobj1.getName());
		System.out.println("ID :" + tobj2.getId());
		System.out.println("Name of Thread :" + tobj2.getName());
		tobj1.start();
		System.out.println("Thread1 Status :" + tobj1.isAlive());
		try {
			// join method
			tobj1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		// isAlive method
		System.out.println("Thread1 Status :" + tobj1.isAlive());
		tobj2.start();
		System.out.println("Thread2 Status :" + tobj2.isAlive());
	}
}
