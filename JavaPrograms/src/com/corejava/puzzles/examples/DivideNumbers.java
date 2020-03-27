package com.corejava.puzzles.examples;

import com.corejava.util.MyLogger;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {

        int value1;
        int value2;
        int Total;

        Scanner scannerobj = new Scanner( System.in );

        MyLogger.consoleLogger.info( "Enter value1: " );
        value1 = scannerobj.nextInt();

        MyLogger.consoleLogger.info( "Enter value2: " );
        value2 = scannerobj.nextInt();

        Total = value1 / value2;

        MyLogger.consoleLogger.info( "The sum of numbers are: " +Total );
    }
}
