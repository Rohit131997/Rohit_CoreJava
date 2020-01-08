package com.nisum.corejava.classandobject.example;

// creating a class
class Studentinfo_ClassandObject_Example {
	// defining the fields
	int id;
	String name;
}

class Test {
	public static void main(String[] args) {
		// creating a object
		Studentinfo_ClassandObject_Example obj = new Studentinfo_ClassandObject_Example();
		// passing values to the object
		obj.id = 101;
		obj.name = "Ram";
		System.out.println("Id: " + obj.id + " Name: " + obj.name);
	}
}
