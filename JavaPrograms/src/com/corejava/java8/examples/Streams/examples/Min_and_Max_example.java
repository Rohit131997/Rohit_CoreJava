package com.corejava.java8.examples.Streams.examples;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;

public class Min_and_Max_example {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList( 11, 43, 22, 57, 89 );

        // Minimum and maximum in default sorting order
        int minimum_ascending = numbers.stream()
                .min( (value1, value2) -> value1.compareTo( value2 ) )
                .get();
        MyLogger.consoleLogger.info( "Minimum value in ascending order: " + minimum_ascending );

        int maximum_ascending = numbers.stream()
                .max( (value1, value2) -> value1.compareTo( value2 ) )
                .get();
        MyLogger.consoleLogger.info( "Maximum value in ascending order: " + maximum_ascending );


        // Minimum and maximum in userdefined sorting order
        int minimum_desending = numbers.stream()
                .min( (value1, value2) -> value2.compareTo( value1 ) )
                .get();
        MyLogger.consoleLogger.info( "Minimum value in Desending order: " + minimum_desending );

        int maximum_desending = numbers.stream()
                .max( (value1, value2) -> value2.compareTo( value1 ) )
                .get();
        MyLogger.consoleLogger.info( "Maximum value in Desending order: " + maximum_desending );


    }
}
