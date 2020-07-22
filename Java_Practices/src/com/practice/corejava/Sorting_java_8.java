package com.practice.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_java_8 {

	 public static void main(String[] args) {
	        List<Integer>number=new ArrayList<Integer>();
	        for (int loop=0;loop<=10;loop++){
	            number.add(loop);
	        }
	        List<Integer>value=number.stream()
	                .sorted((num1,num2)->-num1.compareTo(num2)).collect(Collectors.toList());
	        value.forEach(num -> System.out.println(num));
	    }
}
