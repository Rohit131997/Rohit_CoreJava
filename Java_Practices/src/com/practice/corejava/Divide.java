package com.practice.corejava;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {

        int value1;
        int value2;
        int Total;

        Scanner scannerobj = new Scanner( System.in );

        System.out.println( "Enter value1: " );
        value1 = scannerobj.nextInt();

        System.out.println( "Enter value2: " );
        value2 = scannerobj.nextInt();

        Total = value1 / value2;

        System.out.println( "The sum of numbers are: " +Total );
    }
}
