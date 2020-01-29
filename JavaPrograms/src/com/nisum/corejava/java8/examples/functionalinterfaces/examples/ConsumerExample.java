package com.nisum.corejava.java8.examples.functionalinterfaces.examples;

import com.nisum.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        // List of names
        List<String> names = Arrays.asList( "Ramu", "Sita", "Gopi", "Ravi" );

        // Consumer interface has only one method as accept and its obj is "accobj"
        Consumer<String> obj = accobj -> MyLogger.consoleLogger.info( accobj );
        names.forEach( obj );
    }
}
