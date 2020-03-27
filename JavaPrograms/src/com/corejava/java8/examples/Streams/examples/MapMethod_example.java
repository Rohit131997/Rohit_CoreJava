package com.corejava.java8.examples.Streams.examples;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod_example {
    public static void main(String[] args) {

        // Creating a list
        List<Integer> numbers = Arrays.asList( 2,10,50,98 );

        // map method is used to manipulate all the value at a time in the given list
        List<Integer> squares = numbers.stream()
                .map( value-> value*value )
                .collect( Collectors.toList());

        MyLogger.consoleLogger.info( squares );
    }
}
