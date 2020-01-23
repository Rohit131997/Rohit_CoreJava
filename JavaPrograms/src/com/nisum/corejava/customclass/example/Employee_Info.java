package com.nisum.corejava.customclass.example;

public class Employee_Info {

    // making id and name as private fields
    private int empId;
    private String empName;

    public Employee_Info(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // Setter and getter methods
    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    // display method
    public void display()
    {
        System.out.println( "Employee Id :" + getEmpId() + " Employee Name :" + getEmpName());
    }

}
