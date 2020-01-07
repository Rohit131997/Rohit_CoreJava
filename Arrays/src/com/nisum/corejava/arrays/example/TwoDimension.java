package com.nisum.corejava.arrays.example;

public class TwoDimension 
{
	public static void main(String args[])
	{   
	int arr[][]={{1,1,1},{2,2,2},{3,3,3}}; //declaring and initializing 2D array   
		
		for(int i=0;i<3;i++)
		{  
		 for(int j=0;j<3;j++)
		 {  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
	}
}
