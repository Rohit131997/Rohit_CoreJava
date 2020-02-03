package com.nisum.corejava.java8.examples.Streams.examples;

import com.nisum.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod_example {
    public static void main(String[] args) {

        // creating a list of elements
        List<Integer> numbers = Arrays.asList( 10, 33, 45, 65, 44, 76, 92 );

        // Filtering the numbers which are divisible of 4
        List<Integer> divisibleOf4 = numbers.stream()
                .filter( value -> value % 4 == 0 )
                .collect( Collectors.toList() );

        MyLogger.consoleLogger.info( divisibleOf4 );
    }
}
