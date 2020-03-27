package com.corejava.java8.examples.Timeapi.examples;

import com.corejava.util.MyLogger;

import java.time.LocalDate;
import java.time.Year;

public class Year_Example {
    public static void main(String[] args) {
        Year year = Year.of( 2020 );

        // Date at paricular no of day
        LocalDate loc = year.atDay( 247 );
        MyLogger.consoleLogger.info( loc );

        // Is leap  or not
        MyLogger.consoleLogger.info( Year.isLeap( 2020 ) );
    }
}
