/**
 * 
 */
package com.nisum.corejava.encapsulation.example;

/**
 * @author nisum
 *
 */
public class EncapsulationExample {
	private int id;
	private String empName;
	private int empAge;

	// Getter and Setter methods
	public int getEmpid() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int newValue) {
		empAge = newValue;
	}

	public void setEmpName(String newValue) {
		empName = newValue;
	}

	public void setEmpid(int newValue) {
		id = newValue;
	}
}

class EncapsTest {
	public static void main(String args[]) {
		EncapsulationExample obj = new EncapsulationExample();
		obj.setEmpName("Mario");
		obj.setEmpAge(25);
		obj.setEmpid(12345);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee SSN: " + obj.getEmpid());
		System.out.println("Employee Age: " + obj.getEmpAge());
	}
}
