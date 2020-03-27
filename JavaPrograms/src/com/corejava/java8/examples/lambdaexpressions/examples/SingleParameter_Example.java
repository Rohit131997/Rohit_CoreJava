package com.corejava.java8.examples.lambdaexpressions.examples;

import com.corejava.util.MyLogger;

interface Person {
    public String data(String name);
}

public class SingleParameter_Example {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Person obj1 = (name) -> {
            return name;
        };
        MyLogger.consoleLogger.info( obj1.data( "Rohit" ) );

        // You can remove function parentheses"()" when it has only one parameter
        Person obj2 = name -> {
            return name;
        };
        MyLogger.consoleLogger.info( obj2.data( "Ramu" ) );
    }
}