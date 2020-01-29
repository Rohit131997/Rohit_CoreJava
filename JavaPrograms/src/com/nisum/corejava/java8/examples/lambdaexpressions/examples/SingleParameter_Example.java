package com.nisum.corejava.java8.examples.lambdaexpressions.examples;

interface Person {
    public String data(String name);
}

public class SingleParameter_Example {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Person obj1 = (name) -> {
            return name;
        };
        System.out.println( obj1.data( "Rohit" ) );

        // You can remove function parentheses"()" when it has only one parameter
        Person obj2 = name -> {
            return name;
        };
        System.out.println( obj2.data( "Ramu" ) );
    }
}