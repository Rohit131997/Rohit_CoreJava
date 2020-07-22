package com.practice.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflingList {

	    public static void main(String[] args) {
	        // Create a list and add some colors to the list
	        List<String> listobj = new ArrayList<String>();
	        listobj.add("Red");
	        listobj.add("Green");
	        listobj.add("Orange");
	        listobj.add("White");
	        listobj.add("Black");
	        System.out.println("List before shuffling:\n" + listobj);
	        Collections.shuffle(listobj);
	        System.out.println("List after shuffling:\n" + listobj);
	    }

}
