package com.practice.corejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int value = in.nextInt();
		int sum = 0, rev;
		int temp = value;
		while (value > 0) {
			rev = value % 10;
			sum = (sum * 10) + rev;
			value = value / 10;
		}
		if (temp == sum)
			System.out.println("It is a Palindrome number.");
		else
			System.out.println("Not a palindrome");
	}
}