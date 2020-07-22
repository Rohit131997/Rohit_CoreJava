package com.practice.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even_Java8 {

	public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        for (int loop = 0; loop <= 20; loop++) {
            list1.add(loop);
        }
        List<Integer> evenNumberlist = list1.stream()
                .filter(num -> num % 2 == 0).collect(Collectors.toList());
        evenNumberlist.forEach(numbers -> System.out.println(numbers));
    }
}
