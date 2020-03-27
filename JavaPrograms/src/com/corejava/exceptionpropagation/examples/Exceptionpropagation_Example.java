package com.corejava.exceptionpropagation.examples;

class Exceptionpropagation_Example {
    public void method1() {// generates an exception
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[7]);
    }

    public void method2() { // doesn't catch the exception
        method1();
    }

    // method1 drops down the call stack
    public void method3() { // method3 catches the exception
        try {
            method2();
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Exception is caught");
        }
        finally{
            System.out.println("Finnaly block will execute..");
        }
        System.out.println("Rest of the code...");
    }

    public static void main(String args[]) {
        Exceptionpropagation_Example obj = new Exceptionpropagation_Example();
        obj.method3();
    }
}