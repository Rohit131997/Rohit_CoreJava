package com.practice.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Example {

	public static void main(String[] args) {
        List<Integer>number=new ArrayList<Integer>();
        for (int loop=0;loop<=10;loop++){
            number.add(loop);
        }
        //Stream<Integer>stream=number.stream();
        List<Integer>value=number.stream()
                .map(num->num*3).collect(Collectors.toList());
        value.forEach(num -> System.out.println("Every number in the loop is multiplyed by 3: "+num));
    }
}
