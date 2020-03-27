package com.corejava.com.nisum.corejava.typeconvertion.examples;

public class Test {
    public static void main(String[] args)
    {
        double value1 = 234.6;

        //explicit type casting
        long value2 = (long)value1;

        //explicit type casting
        int value3 = (int)value2;
        System.out.println("Double value: "+value1);

        //fractional part lost
        System.out.println("Long value: "+value2);

        //fractional part lost
        System.out.println("Int value: "+value3);
    }
}
