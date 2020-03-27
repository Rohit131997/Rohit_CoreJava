package com.corejava.java8.examples.Timeapi.examples;

import com.corejava.util.MyLogger;

import java.time.OffsetTime;

public class OffSetTime_example {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();

        // Current hours
        int hrs = offset.getHour();
        MyLogger.consoleLogger.info("Hour: "+ hrs );

        // Current minutes
        int min = offset.getMinute();
        MyLogger.consoleLogger.info("Minute: "+ min);

        // Current seconds
        int sec = offset.getSecond();
        MyLogger.consoleLogger.info("Second: "+ sec);
    }
}
