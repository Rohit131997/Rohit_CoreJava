/**
 *
 */
package com.corejava.constructors.examples;

/**
 * @author nisum
 *
 */

public class DemoConstructor {
    int value1;
    double value2;

    //Create a class constructor for the DemoConstructor class
    public DemoConstructor()// default constructor
    {
        this.value1 = 5;
        System.out.println("Default Constructor");
    }

    public DemoConstructor(int value3)// parameterized constructor with Integer argument
    {
        this.value1 = value3;
        System.out.println("Constructor with Integer parameter");
    }

    public DemoConstructor(int value4, double value5)// parameterized constructor with Integer and Double argument
    {
        this.value1 = value4;
        this.value2 = value5;
        System.out.println("Constructor with Integer and Double parameters");

    }

    static public void main(String[] args) {
        DemoConstructor d1 = new DemoConstructor(21, 10.6);// passing the value to constructor

        System.out.println(d1.value1);
        System.out.println(d1.value2);
    }
}
