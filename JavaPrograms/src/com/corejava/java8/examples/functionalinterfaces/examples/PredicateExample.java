package com.corejava.java8.examples.functionalinterfaces.examples;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        // Predicate always return boolean value
        Predicate<Integer> evenNumbers = testobj -> testobj % 2 == 0;
        MyLogger.consoleLogger.info( evenNumbers.test( 7 ) );

        List<Integer> listObj = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );
        listObj.stream()
                .filter( evenNumbers )
                .forEach( testobj -> MyLogger.consoleLogger.info( "\nEven numbers in the list are: " + testobj ) );
    }
}
