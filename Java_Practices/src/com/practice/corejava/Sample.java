package com.practice.corejava;

public class Sample {

	public static void main(String[] args) {

		String s = "aeiou";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {

				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u')

				{
					System.out.println("Vowels " + s.charAt(i) + " at index "+i);
				}
			}
		}
	}
}

