package com.nisum.corejava.java8.examples.Streams.examples;

import com.nisum.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;

public class CountMethod_example {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList( 56,79,24,10,33 );

        // checking no of marks below 35.
        long failedinexam = marks.stream().filter( num->num<=35 ).count();

        MyLogger.consoleLogger.info( failedinexam );
    }
}
