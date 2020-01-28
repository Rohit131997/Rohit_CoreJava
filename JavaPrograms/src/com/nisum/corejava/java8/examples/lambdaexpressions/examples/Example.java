package com.nisum.corejava.java8.examples.lambdaexpressions.examples;

interface StrConcat {
    String stconcat(String str1, String str2);
}
public class Example {

    public static void main(String args[]) {
        // lambda expression with multiple arguments
        StrConcat st = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+st.stconcat("Hello ", "People"));
    }
}
