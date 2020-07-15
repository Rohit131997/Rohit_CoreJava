package com.corejava.puzzles.examples;

import com.corejava.util.MyLogger;

public class Array_avg {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, 16, 60, 100};
        //calculate sum of all array elements
        int sum = 0;
        for (int loop = 0; loop < numbers.length;loop++)
            sum = sum + numbers[loop];
        //calculate avg value
        double average = sum / numbers.length;
       MyLogger.consoleLogger.info( "Average value of the array elements is : " + average );
    }
}

