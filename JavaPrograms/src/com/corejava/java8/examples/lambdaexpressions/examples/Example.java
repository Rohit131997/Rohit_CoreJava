package com.corejava.java8.examples.lambdaexpressions.examples;

import com.corejava.util.MyLogger;

interface StrConcat {
    String stconcat(String str1, String str2);
}

public class Example {

    public static void main(String args[]) {
        // lambda expression with multiple arguments
        StrConcat st = (str1, str2) -> str1 + str2;
        MyLogger.consoleLogger.info( "Result: " + st.stconcat( "Hello ", "People" ) );
    }
}
