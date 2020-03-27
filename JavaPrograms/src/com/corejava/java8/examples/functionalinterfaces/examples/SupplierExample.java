package com.corejava.java8.examples.functionalinterfaces.examples;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<String> supplierobj = () -> "No elements Present ";

        List<String> listobj = Arrays.asList();
        MyLogger.consoleLogger.info( listobj.stream()
                .findAny()
                .orElseGet( supplierobj ) );
    }
}
