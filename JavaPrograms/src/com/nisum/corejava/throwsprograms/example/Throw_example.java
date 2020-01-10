package com.nisum.corejava.throwsprograms.example;

public class Throw_example {
    double data1;
    double data2;

    public double divide() {

        System.out.println(data2);
        if (data2 == 0) {
            // Throws the ArithmeticException
            throw new ArithmeticException("Divider cannot be equal to zero...");

        }
        return data1 / data2;
    }


    public static void main(String[] args) {
        Throw_example obj = new Throw_example();
        obj.divide();
    }
}