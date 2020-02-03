package com.nisum.corejava.java8.examples.Timeapi.examples;

import com.nisum.corejava.util.MyLogger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_example {
    public static void main(String[] args) {

        // Current local date and time
        LocalDateTime now = LocalDateTime.now();
        MyLogger.consoleLogger.info( "Before Formatting: " + now );

        // Giving a format to  date and time
        DateTimeFormatter format = DateTimeFormatter.ofPattern( "dd-MM-yyyy HH:mm:ss" );
        String formatDateTime = now.format( format );
        MyLogger.consoleLogger.info( "After Formatting: " + formatDateTime );
    }
}
