package com.corejava.java8.examples.Timeapi.examples;

import com.corejava.util.MyLogger;

import java.time.ZonedDateTime;
import java.time.Period;

public class Zone_Example {
    public static void main(String[] args) {

        // get the Time zone configered
        ZonedDateTime zone = ZonedDateTime.now();
        MyLogger.consoleLogger.info( zone.getZone() );

        // Get the date after reducing the days
        ZonedDateTime mi = zone.minus( Period.ofDays( 28 ) );
        MyLogger.consoleLogger.info( mi );
    }
}
