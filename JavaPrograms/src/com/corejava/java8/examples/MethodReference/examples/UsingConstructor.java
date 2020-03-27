package com.corejava.java8.examples.MethodReference.examples;

import com.corejava.util.MyLogger;

interface Messaging
{
    void message(String value);
}

public class UsingConstructor {

    // Using constructor  with one parameter
    public UsingConstructor(String value)
    {
        MyLogger.consoleLogger.info( value );
    }
}

class Test
{
    public static void main(String[] args) {

        // Refering constructor with new keyword
        Messaging msg = UsingConstructor::new;

        msg.message( "Hello people" );
    }
}
