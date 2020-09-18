package com.jsp.dao;

import java.util.ArrayList;

public class StudentDetails {

	private int studentID;
	private int studentAge;
	private String studentName;
	private String studentCity;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	// Parameterized Constructor
	public StudentDetails(int id, int age, String name, String city) {
		this.studentID = id;
		this.studentAge = age;
		this.studentName = name;
		this.studentCity = city;
	}

	public ArrayList<StudentDetails> getStudentDetails() {
		ArrayList<StudentDetails> stuList = new ArrayList<StudentDetails>();
		
		// Adding student data to the ArrayList object via parameterized constructor

		stuList.add(new StudentDetails(1, 20, "Varma", "Hyderabad")); 
		stuList.add(new StudentDetails(2, 24, "Rohit", "Mumbai"));
		stuList.add(new StudentDetails(3, 42, "Avinash", "Pune"));
		stuList.add(new StudentDetails(4, 19, "Danny", "Chennai"));

		for (StudentDetails s : stuList) // Iterates as long as there are elements in the list.
		{
			System.out.print("ID, Name and City of the student are : ");
			System.out.println(s.studentID + " " + s.studentAge + " " + s.studentName + " " + s.studentCity);
		}
		return stuList;
	}
}
