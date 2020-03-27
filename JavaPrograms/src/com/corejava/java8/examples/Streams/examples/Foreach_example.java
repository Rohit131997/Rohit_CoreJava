package com.corejava.java8.examples.Streams.examples;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;

public class Foreach_example {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList( 0, 5, 10, 15, 20 );

        // squares of numbers using foreach loop
        numbers.stream()
                .forEach( i -> {
            MyLogger.consoleLogger.info( "The square of " + i + " is: " + (i * i) );
        });
    }
}
