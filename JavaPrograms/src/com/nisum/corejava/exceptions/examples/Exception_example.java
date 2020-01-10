package com.nisum.corejava.exceptions.examples;

public class Exception_example {
    public static void main(String args[]) {
        // Try block to place all the exception part
        try {
            int data = 25 / 0;
            System.out.println(data);
        }
        // Catch block to catch the exception occured
        catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        // Finnaly block will execute always
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of the code...");
    }
}
