package com.practice.corejava;

import java.util.Scanner;

public class IntrestPercentage {

	public static void main(String arg[])	
	{
 
	  Scanner sc=new Scanner(System.in);
 
	  System.out.print("Enter amount:");
 
	  double amount=sc.nextDouble();
 
	  System.out.print("Enter IntrestPercentage:");
 
          double IntrestPercentage=sc.nextDouble();
 
	  double commission=(IntrestPercentage/100)*amount;  	   
 
      	  System.out.println("Intrest amount="+commission);
 
	}
}
