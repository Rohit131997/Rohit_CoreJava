package com.nisum.corejava.arrays.example;

public class AddMatix 
{
 
		public static void main(String args[]){  
		//creating two matrices  
		int a[][]={{1,3,2},{1,3,4},{2,3,4}};  
		int b[][]={{1,2,3},{1,3,4},{1,6,8}};  
		  
		//creating another matrix to store the sum of two matrices  
		int c[][]=new int[3][3];  
		  
		//adding and printing addition of 2 matrices  
		for(int i=0;i<3;i++){  
		for(int j=0;j<3;j++){  
		c[i][j]=a[i][j]+b[i][j];  
		System.out.print(c[i][j]+" ");  
		}  
		System.out.println();//new line  
		}  
		  
		}
}

