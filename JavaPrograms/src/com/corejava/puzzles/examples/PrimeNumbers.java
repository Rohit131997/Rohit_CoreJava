package com.corejava.puzzles.examples;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        //create Scanner class object for user input
        Scanner sc = new Scanner(System.in);

        // Display message for user understanding
        System.out.println("Enter any number");

        //Accept input from keyboard
        int input_num = sc.nextInt();
        // i variable initialize by 2 just
        // because every number is divisible by 1
        int i=2;
        //Loop continues till input_num to 0
        while(input_num>0){
            // Entered number will be checked by i if we get 0
            // then number is not prime then will check from next increment i
            if(input_num%i==0)
                break;
            i++;
        }

        if(input_num == i)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }
}
