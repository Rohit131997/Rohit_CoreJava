package com.nisum.corejava.arrays.example;

public class MinValue
{
	public static void main(String[] args) 
	{
		int a[] = {10,2,44,23,56,12,33,87,65,11};
		int min = a[0];
		int pos = 0;
		for(int i=0; i<10; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
				pos = i;
			}
		}
		System.out.println("Minimum value is " + min);
		System.out.println("Position is " + (pos+1));
	}
}
