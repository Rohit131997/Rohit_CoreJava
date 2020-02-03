package com.nisum.corejava.java8.examples.MethodReference.examples;

import java.util.function.BiFunction;

public class UsingInstance {
    public int add(int value1, int value2) {
        return value1 + value2;
    }
}

class InstanceMethodReference3 {
    public static void main(String[] args) {

        // using instance method
        BiFunction<Integer, Integer, Integer> adding = new UsingInstance()::add;

        // apply is the method of Function in functional interfaces
        int result = adding.apply( 12, 25 );
        System.out.println( result );
    }
}
