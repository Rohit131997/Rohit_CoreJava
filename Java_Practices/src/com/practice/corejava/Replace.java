package com.practice.corejava;

import java.util.ArrayList;

public class Replace {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(111);

        list.add(222);

        list.add(333);

        list.add(444);

        System.out.println(list);

        //Replacing the element at index 1 with '000'

        list.set(1, 000);

        //Replacing the element at index 3 with '000'

        list.set(3, 000);

        System.out.println(list);
    }
}
