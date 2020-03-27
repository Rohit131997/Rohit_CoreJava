package com.corejava.puzzles.examples;

import com.corejava.util.MyLogger;

import java.util.Scanner;

public class PrintingName {
    public static void main(String[] args) {

        String Name;
        int id;

        Scanner scanner = new Scanner( System.in );

        MyLogger.consoleLogger.info( "Enter the name: " );
        Name = scanner.next();

        MyLogger.consoleLogger.info( "Enter your Id: " );
        id = scanner.nextInt();

        MyLogger.consoleLogger.info( "Good Morning :" + Name + " " + id );

    }
}
