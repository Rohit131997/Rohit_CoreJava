package com.nisum.corejava.java8.examples.Streams.examples;

import com.nisum.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod_example {
    public static void main(String[] args) {

        List<String> names = Arrays.asList( "Rohit","Sita","Deepak","Bhima" );

        // Sorted is the default sorted method.
        List<String> sortedList1 = names.stream().sorted().collect( Collectors.toList());

        MyLogger.consoleLogger.info( sortedList1 );

        // userdefined sorting
        List<String> sortedList2 = names.stream().sorted((value1,value2)-> value2.compareTo( value1 )).collect( Collectors.toList());


        MyLogger.consoleLogger.info( sortedList2 );
    }
}
